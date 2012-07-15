package br.ufpb.iged.interpretador.principal;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RuleReturnScope;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.TreeAdaptor;
import org.antlr.runtime.tree.CommonTreeAdaptor;

import br.ufpb.iged.interpretador.bytecodeassembler.asm.BytecodeAssembler;
import br.ufpb.iged.interpretador.bytecodeassembler.asm.Definicao;
import br.ufpb.iged.interpretador.parser.AssemblerLexer;
import br.ufpb.iged.interpretador.excecoes.AcessoIndevidoMemoriaException;
import br.ufpb.iged.interpretador.excecoes.LabelException;
import br.ufpb.iged.interpretador.symboltable.classes.BytecodesAST;
import br.ufpb.iged.interpretador.symboltable.classes.BytecodesErrorNode;
import br.ufpb.iged.interpretador.symboltable.classes.EscopoGlobal;
import br.ufpb.iged.interpretador.symboltable.classes.Simbolo;
import br.ufpb.iged.interpretador.symboltable.classes.SimboloClasse;
import br.ufpb.iged.interpretador.symboltable.classes.TabelaSimbolos;
import br.ufpb.iged.interpretador.parser.Def;
import br.ufpb.iged.interpretador.parser.Ref;

public class Interpretador {
	
	public static final int TAMANHO_INICIAL_PILHA = 100;
	
	private static final String DIRETORIO_FONTE = "./classes";
	
	public int sp = -1;
	
	public int ip = 0;
	
	private static int tamanhoCodigo;
	
	public Object[] pilha = new Object[TAMANHO_INICIAL_PILHA];
	
	public static TabelaSimbolos tabelaSimbolos;
	
	static EscopoGlobal global;
	
	private static StringBuffer entrada;
	
	public List<Objeto> heap = new ArrayList<Objeto>();
	
	private static BytecodeAssembler assembler;

	public static TreeAdaptor bytecodesAdaptor = new CommonTreeAdaptor() {
		
        public Object create(Token token) {
            return new BytecodesAST(token);
        }
        
        public Object dupNode(Object t) {
            if ( t==null ) {
                return null;
            }
            return create(((BytecodesAST)t).token);
        }
        
        public Object errorNode(TokenStream input, Token start, Token stop,
                                RecognitionException e)
        {
            BytecodesErrorNode t = new BytecodesErrorNode(input, start, stop, e);
            return t;
        }
        
    };

	public static void main(String[] args) {
		
		try {
			
			carregar();
			
			Interpretador interpretador = new Interpretador();
			
			interpretador.cpu();
			
		} catch (IOException ioe) {

			System.out.println(ioe.getMessage());

		} catch (RecognitionException re) {
			
			System.out.println(re.getMessage());

		} catch (LabelException le) {
			
			System.out.println(le.getMessage());
			
		} catch (AcessoIndevidoMemoriaException aime) {
			
			System.out.println(aime.getMessage());
		
		}
			

	}

	public static void carregar() 
			throws IOException, RecognitionException, LabelException, 
				AcessoIndevidoMemoriaException {
		
		    entrada = new StringBuffer();
		
			File file = new File(DIRETORIO_FONTE);
		
			String[] arquivos = file.list();
			
		    int i;
		    
			for (i = 0; i < arquivos.length; i++){
			
				if (arquivos[i].endsWith(".class")) {
					
					ANTLRFileStream input = 
							new ANTLRFileStream(DIRETORIO_FONTE+"/"+arquivos[i]);
					
					entrada.append(input.toString());
					
				}
			
			}
			
			
	        tabelaSimbolos = new TabelaSimbolos(); 
            
            assembler = carregarClasses();
	        
	        global = tabelaSimbolos.global;
			global.codigo = assembler.obterCodigoMaquina();
			tamanhoCodigo = assembler.obterTamanhoMemoriaCodigo();
			global.memoriaGlobal = new Object[assembler.getTamMemoriaGlobal()];
			
			//Para testes
			Simbolo classe = tabelaSimbolos.global.resolver("LTeste");
			System.out.println("Classe adicionada:" + classe.nome);

		
	}
	
	public static BytecodeAssembler carregarClasses() throws RecognitionException, LabelException, AcessoIndevidoMemoriaException {
		
			BytecodeAssembler parser = null;
				
			CharStream input = new ANTLRStringStream(entrada.toString());
			
			AssemblerLexer lexer = new AssemblerLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			parser = new BytecodeAssembler(tokens, Definicao.instrucoes);
			parser.setTreeAdaptor(bytecodesAdaptor);
			RuleReturnScope r = parser.programa();  
			CommonTree tree = (CommonTree)r.getTree();    
		   
			CommonTreeNodeStream nos = new CommonTreeNodeStream(bytecodesAdaptor, tree);
			nos.setTokenStream(tokens);
			Def def = new Def(nos, tabelaSimbolos);       
			def.downup(tree);                          		   
		    nos.reset();
		    Ref ref = new Ref(nos, tabelaSimbolos, parser);
			ref.downup(tree);
			
		    return parser;
		
	}
	
	protected void cpu() {

		int op1, op2;

		short opcode;

		boolean desvio;
		
		Referencia referencia;

		while (ip < tamanhoCodigo) {

			desvio = false;

			opcode = global.codigo[ip];

			if (opcode < 0)

				opcode = valorEmByte(opcode);

			switch (opcode) {

			// operações de pilha

			case Definicao.NOP:
				;
				break;
				
			case Definicao.POP:
				sp-- ;
				break;
				
			case Definicao.POP2:
				sp -= 2 ;
				break;
				
			case Definicao.DUP: {

				Referencia ref = (Referencia)pilha[sp];
				
				sp++;

				pilha[sp] = ref;

			}
				;
				break;

			// operações aritméticas

			case Definicao.INEG: {

				op1 = (Integer) pilha[sp];

				pilha[sp] = 0 - op1;

			};
				break;

			case Definicao.IADD: {

				op1 = (Integer) pilha[sp - 1];

				op2 = (Integer) pilha[sp];

				sp--;

				pilha[sp] = op1 + op2;

			}
				;
				break;

			case Definicao.ISUB: {

				op1 = (Integer) pilha[sp - 1];

				op2 = (Integer) pilha[sp];

				sp--;

				pilha[sp] = op1 - op2;

			}
				;
				break;

			case Definicao.IMUL: {

				op1 = (Integer) pilha[sp - 1];

				op2 = (Integer) pilha[sp];

				sp--;

				pilha[sp] = op1 * op2;

			}
				;
				break;

			case Definicao.IDIV: {

				op1 = (Integer) pilha[sp - 1];

				op2 = (Integer) pilha[sp];

				sp--;

				pilha[sp] = op1 / op2;

			}
				;
				break;

			case Definicao.IREM: {

				op1 = (Integer) pilha[sp - 1];

				op2 = (Integer) pilha[sp];

				sp--;

				pilha[sp] = op1 % op2;

			}
				;
				break;

			case Definicao.IINC: {

				op1 = (Integer) pilha[sp];

				pilha[sp] = ++op1;

			}
				;
				break;

			// operações de empilhamento de constantes

			case Definicao.ICONST0: {

				sp++;

				pilha[sp] = 0;

			}
				;
				break;

			case Definicao.ICONST1: {

				sp++;

				pilha[sp] = 1;

			}
				;
				break;

			case Definicao.ICONST2: {

				sp++;

				pilha[sp] = 2;

			}
				;
				break;

			case Definicao.ICONST3: {

				sp++;

				pilha[sp] = 3;

			}
				;
				break;

			case Definicao.ICONST4: {

				sp++;

				pilha[sp] = 4;

			}
				;
				break;

			case Definicao.ICONST5: {

				sp++;

				pilha[sp] = 5;

			}
				;
				break;

			case Definicao.ICONSTM1: {

				sp++;

				pilha[sp] = -1;

			}
				;
				break;
				
			case Definicao.ACONSTNULL: {

				sp++;

				pilha[sp] = new Referencia(null);

			}
				;
				break;

			case Definicao.LDC: {

				sp++;

				op1 = obterOperandoInteiro();

				pilha[sp] = op1;

			}
				;
				break;

			// operações de load

			case Definicao.ILOAD0: {

				sp++;

				pilha[sp] = global.memoriaGlobal[0];

			}
				;
				break;

			case Definicao.ILOAD1: {

				sp++;

				pilha[sp] = global.memoriaGlobal[1];

			}
				;
				break;

			case Definicao.ILOAD2: {

				sp++;

				pilha[sp] = global.memoriaGlobal[2];

			}
				;
				break;

			case Definicao.ILOAD3: {

				sp++;

				pilha[sp] = global.memoriaGlobal[3];

			}
				;
				break;

			case Definicao.ILOAD: {

				sp++;

				op1 = obterOperandoInteiro();

				pilha[sp] = global.memoriaGlobal[op1];

			}
				;
				break;
				
			case Definicao.ALOAD0: {

				sp++;

				pilha[sp] = global.memoriaGlobal[0];

			}
				;
				break;
				
			case Definicao.ALOAD1: {

				sp++;

				pilha[sp] = global.memoriaGlobal[1];

			}
				;
				break;
			
			case Definicao.ALOAD2: {

				sp++;

				pilha[sp] = global.memoriaGlobal[2];

			}
				;
				break;
				
			case Definicao.ALOAD3: {

				sp++;

				pilha[sp] = global.memoriaGlobal[3];

			}
				;
				break;
				
			case Definicao.ALOAD: {

				sp++;

				op1 = obterOperandoInteiro();

				pilha[sp] = global.memoriaGlobal[op1];

			}
				;
				break;
				

			// operações de store

			case Definicao.ISTORE0: {

				global.memoriaGlobal[0] = pilha[sp];
				
				sp--;

			}
				;
				break;

			case Definicao.ISTORE1: {

				global.memoriaGlobal[1] = pilha[sp];
				
				sp--;

			}
				;
				break;

			case Definicao.ISTORE2: {

				global.memoriaGlobal[2] = pilha[sp];
				
				sp--;

			}
				;
				break;

			case Definicao.ISTORE3: {

				global.memoriaGlobal[3] = pilha[sp];
				
				sp--;

			}
				;
				break;

			case Definicao.ISTORE: {

				op1 = obterOperandoInteiro();

				global.memoriaGlobal[op1] = pilha[sp];
				
				sp--;

			}
				;
				break;
				
			case Definicao.ASTORE0: {

				global.memoriaGlobal[0] = pilha[sp];
				
				sp--;

			}
				;
				break;
				
			case Definicao.ASTORE1: {

				global.memoriaGlobal[1] = pilha[sp];
				
				sp--;

			}
				;
				break;
				
			case Definicao.ASTORE2: {

				global.memoriaGlobal[2] = pilha[sp];
				
				sp--;

			}
				;
				break;
				
			case Definicao.ASTORE3: {

				global.memoriaGlobal[3] = pilha[sp];
				
				sp--;

			}
				;
				break;
				
			case Definicao.ASTORE: {

				op1 = obterOperandoInteiro();

				global.memoriaGlobal[op1] = pilha[sp];
				
				sp--;

			}
				;
				break;

			// operações lógicas

			case Definicao.IAND: {

				op1 = (Integer) pilha[sp - 1];

				op2 = (Integer) pilha[sp];

				op1 = op1 & op2;

				sp--;

			}
				;
				break;

			case Definicao.IOR: {

				op1 = (Integer) pilha[sp - 1];

				op2 = (Integer) pilha[sp];

				op1 = op1 | op2;

				sp--;

			}
				;
				break;

			case Definicao.IXOR: {

				op1 = (Integer) pilha[sp - 1];

				op2 = (Integer) pilha[sp];

				op1 = op1 ^ op2;

				sp--;

			}
				;
				break;

			// operações de desvio condicional

			case Definicao.IFEQ: {

				op1 = (Integer) pilha[sp];

				if (op1 == 0) {

					desviar();

					desvio = true;

				} else {

					pilha[sp] = 0;
					
					ip += 4;
					
				}

			}
				;
				break;

			case Definicao.IFNE: {

				op1 = (Integer) pilha[sp];

				if (op1 != 0) {

					desviar();

					desvio = true;

				} else {

					pilha[sp] = 0;
					
					ip += 4;
					
				}

			}
				;
				break;

			case Definicao.IFLT: {

				op1 = (Integer) pilha[sp];

				if (op1 > 0) {

					desviar();

					desvio = true;

				} else {

					pilha[sp] = 0;
					
					ip += 4;
					
				}

			}
				;
				break;

			case Definicao.IFGE: {

				op1 = (Integer) pilha[sp];

				if (op1 >= 0) {

					desviar();

					desvio = true;

				} else {

					pilha[sp] = 0;
					
					ip += 4;
					
				}

			}
				;
				break;

			case Definicao.IFGT: {

				op1 = (Integer) pilha[sp];

				if (op1 > 0) {

					desviar();

					desvio = true;

				} else {

					pilha[sp] = 0;
					
					ip += 4;
					
				}

			}
				;
				break;

			case Definicao.IFLE: {

				op1 = (Integer) pilha[sp];

				if (op1 <= 0) {

					desviar();

					desvio = true;

				} else {

					pilha[sp] = 0;
					
					ip += 4;
					
				}

			}
				;
				break;

			case Definicao.IF_ICMPEQ: {

				op1 = (Integer) pilha[sp - 1];

				op2 = (Integer) pilha[sp];

				sp--;

				if (op1 == op2) {

					desviar();

					desvio = true;

				} else {

					pilha[sp] = 0;

					ip += 4;

				}

			}
				;
				break;

			case Definicao.IF_ICMPNE: {

				op1 = (Integer) pilha[sp - 1];

				op2 = (Integer) pilha[sp];

				sp--;

				if (op1 != op2) {

					desviar();

					desvio = true;

				} else {

					pilha[sp] = 0;

					ip += 4;

				}

			}
				;
				break;

			case Definicao.IF_ICMPLT: {

				op1 = (Integer) pilha[sp - 1];

				op2 = (Integer) pilha[sp];

				sp--;

				if (op1 < op2) {

					desviar();

					desvio = true;

				} else {

					pilha[sp] = 0;

					ip += 4;

				}

			}
				;
				break;

			case Definicao.IF_ICMPGE: {

				op1 = (Integer) pilha[sp - 1];

				op2 = (Integer) pilha[sp];

				sp--;

				if (op1 >= op2) {

					desviar();

					desvio = true;

				} else {

					pilha[sp] = 0;

					ip += 4;

				}

			}
				;
				break;

			case Definicao.IF_ICMPGT: {

				op1 = (Integer) pilha[sp - 1];

				op2 = (Integer) pilha[sp];

				sp--;

				if (op1 > op2) {

					desviar();

					desvio = true;

				} else {

					pilha[sp] = 0;

					ip += 4;

				}

			}
				;
				break;

			case Definicao.IF_ICMPLE: {

				op1 = (Integer) pilha[sp - 1];

				op2 = (Integer) pilha[sp];

				sp--;

				if (op1 <= op2) {

					desviar();

					desvio = true;

				} else {

					pilha[sp] = 0;

					ip += 4;

				}

			}
				;
				break;

			// desvio incondicional
			case Definicao.GOTO: {

				op1 = obterOperandoInteiro();

				ip = op1;

				desvio = true;

			}
				;
				break;
				
			//manipulação de objetos
				
			case Definicao.NEW: {
				
				op1 = obterOperandoInteiro();
				
				SimboloClasse simboloClasse = assembler.getConstantPool().get(op1);
				
				Objeto objeto = new Objeto(simboloClasse);
				
				heap.add(objeto);
				
				pilha[++sp] = new Referencia(heap.indexOf(objeto));
				
			}
			
				;
				break;	
				
			case Definicao.INVOKESPECIAL: {
				
				sp--;
				
				ip += 4;
				
			}
			
				;
				break;
				
			case Definicao.GETFIELD: {
				
				referencia = (Referencia)pilha[sp];
				
				Objeto objeto = heap.get(referencia.getEndereco());
				
				op1 = obterOperandoInteiro();
				
				pilha[sp] = null;
				
				pilha[sp] = objeto.getMemoriaLocal()[op1];
				
			}
			
				;
				break;
				
			case Definicao.PUTFIELD: {
				
				referencia = (Referencia)pilha[sp - 1];
				
				Objeto objeto = heap.get(referencia.getEndereco());
				
				op1 = obterOperandoInteiro();
				
				objeto.getMemoriaLocal()[op1] = pilha[sp--];
				
			}
			
				;
				break;
				
			}

			if (!desvio)

				ip++;

			// Para testes
			exibirTela();

		}

	}

	protected void desviar() {

		pilha[sp] = 1;

		int op = obterOperandoInteiro();

		ip = op;

	}

	protected int obterOperandoInteiro() {

		int op = BytecodeAssembler.obterInteiro(global.codigo, ip + 1);

		ip += 4;

		return op;

	}

	protected short valorEmByte(short a) {

		return (short) (128 + (128 + a));

	}

	// Usado somente para testes
	protected void exibirTela() {

		int i;

		System.out.println("IP: " + ip);

		System.out.println("SP: " + sp);

		System.out.print("Memória do código: ");

		for (i = 0; i < global.codigo.length; i++)

			System.out.print(global.codigo[i] + " ");

		System.out.print("\n");

		System.out.print("Memória global das variáveis: ");

		for (i = 0; i < global.memoriaGlobal.length; i++)

			System.out.print(global.memoriaGlobal[i] + " ");

		System.out.print("\n");

		System.out.print("Pilha: ");

		for (i = 0; i < pilha.length; i++)

			System.out.print(pilha[i] + " ");

		System.out.print("\n\n");

		System.out
				.print("Pressione qualquer tecla para ir para a próxima instrução: ");

		Scanner in = new Scanner(System.in);

		in.next();

	}

}
