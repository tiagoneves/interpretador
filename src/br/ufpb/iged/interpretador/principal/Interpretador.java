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
import br.ufpb.iged.interpretador.excecoes.ClassNotFoundException;
import br.ufpb.iged.interpretador.excecoes.LabelException;
import br.ufpb.iged.interpretador.symboltable.classes.BytecodesAST;
import br.ufpb.iged.interpretador.symboltable.classes.BytecodesErrorNode;
import br.ufpb.iged.interpretador.symboltable.classes.EscopoGlobal;
import br.ufpb.iged.interpretador.symboltable.classes.Simbolo;
import br.ufpb.iged.interpretador.symboltable.classes.SimboloClasse;
import br.ufpb.iged.interpretador.symboltable.classes.SimboloMetodo;
import br.ufpb.iged.interpretador.symboltable.classes.TabelaSimbolos;
import br.ufpb.iged.interpretador.parser.Def;
import br.ufpb.iged.interpretador.parser.Ref;

public class Interpretador {
	
	public static final int TAMANHO_PILHA = 100;
		
	private static final String DIRETORIO_FONTE = "./classes";
	
	public static int tamanhoCodigo = 0;
			
	public static TabelaSimbolos tabelaSimbolos;
	
	static EscopoGlobal global;
	
	private static StringBuffer entrada;
	
	public List<Objeto> heap = new ArrayList<Objeto>();
	
	private static BytecodeAssembler assembler;
	
	private static StackFrame[] pilha = new StackFrame[TAMANHO_PILHA];
	
	private static int topoPilha = -1;
	
	private static ClassLoader loader;
	
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
			
			//Interpretador interpretador = new Interpretador();
			
			//interpretador.cpu();
			
			//Para testes
			//Simbolo classe = tabelaSimbolos.global.resolver("LTeste");
			//System.out.println("Classe adicionada:" + classe.nome);
			
			/*SimboloClasse classe = (SimboloClasse) tabelaSimbolos.global.resolver("LClasse");
			SimboloMetodo kioeot = (SimboloMetodo) classe.resolver("kioeot");
			kioeot.exibirCodigo();
			
			SimboloClasse principal = (SimboloClasse) tabelaSimbolos.global.resolver("LMain");
			SimboloMetodo main = (SimboloMetodo) principal.resolver("main");
			main.exibirCodigo();
			
			SimboloClasse teste = (SimboloClasse) tabelaSimbolos.global.resolver("LTeste");
			SimboloMetodo init = (SimboloMetodo) teste.resolver("<init>");
			init.exibirCodigo();*/
			
			loader = new ClassLoader(assembler);
			
			try {
				
				SimboloClasse principal = loader.carregarClasseMain();
				SimboloMetodo main = (SimboloMetodo) principal.resolver("main");
				
				pilha[++topoPilha] = new StackFrame(main.getTamanhoMemoriaLocal()); 
				
				global.codigo = main.getCodigo();
				tamanhoCodigo = main.getCodigo().length;
				
				Interpretador interpretador = new Interpretador();
				
				interpretador.cpu();
				
			} catch (ClassNotFoundException e) {
				System.out.println(e.getMessage());
			}
			
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
	
	protected void cpu() throws ClassNotFoundException {

		int op1, op2;

		short opcode;

		boolean desvio;
		
		Referencia referencia;
		
		do{
			
			StackFrame frameAtual = pilha[topoPilha];

			while (frameAtual.pc < tamanhoCodigo) {

				desvio = false;

				opcode = global.codigo[frameAtual.pc];

				if (opcode < 0)

					opcode = valorEmByte(opcode);

				switch (opcode) {

				// operações de pilha

				case Definicao.NOP:
					;
					break;

				case Definicao.POP:
					frameAtual.sp-- ;
					break;

				case Definicao.POP2:
					frameAtual.sp -= 2 ;
					break;

				case Definicao.DUP: {

					Referencia ref = (Referencia)frameAtual.pilhaOperandos[frameAtual.sp];

					frameAtual.sp++;

					frameAtual.pilhaOperandos[frameAtual.sp] = ref;

				}
				;
				break;

				// operações aritméticas

				case Definicao.INEG: {

					op1 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp];

					frameAtual.pilhaOperandos[frameAtual.sp] = 0 - op1;

				};
				break;

				case Definicao.IADD: {

					op1 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp - 1];

					op2 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp];

					frameAtual.sp--;

					frameAtual.pilhaOperandos[frameAtual.sp] = op1 + op2;

				}
				;
				break;

				case Definicao.ISUB: {

					op1 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp - 1];

					op2 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp];

					frameAtual.sp--;

					frameAtual.pilhaOperandos[frameAtual.sp] = op1 - op2;

				}
				;
				break;

				case Definicao.IMUL: {

					op1 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp - 1];

					op2 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp];

					frameAtual.sp--;

					frameAtual.pilhaOperandos[frameAtual.sp] = op1 * op2;

				}
				;
				break;

				case Definicao.IDIV: {

					op1 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp - 1];

					op2 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp];

					frameAtual.sp--;

					frameAtual.pilhaOperandos[frameAtual.sp] = op1 / op2;

				}
				;
				break;

				case Definicao.IREM: {

					op1 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp - 1];

					op2 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp];

					frameAtual.sp--;

					frameAtual.pilhaOperandos[frameAtual.sp] = op1 % op2;

				}
				;
				break;

				case Definicao.IINC: {

					op1 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp];

					frameAtual.pilhaOperandos[frameAtual.sp] = ++op1;

				}
				;
				break;

				// operações de empilhamento de constantes

				case Definicao.ICONST0: {

					frameAtual.sp++;

					frameAtual.pilhaOperandos[frameAtual.sp] = 0;

				}
				;
				break;

				case Definicao.ICONST1: {

					frameAtual.sp++;

					frameAtual.pilhaOperandos[frameAtual.sp] = 1;

				}
				;
				break;

				case Definicao.ICONST2: {

					frameAtual.sp++;

					frameAtual.pilhaOperandos[frameAtual.sp] = 2;

				}
				;
				break;

				case Definicao.ICONST3: {

					frameAtual.sp++;

					frameAtual.pilhaOperandos[frameAtual.sp] = 3;

				}
				;
				break;

				case Definicao.ICONST4: {

					frameAtual.sp++;

					frameAtual.pilhaOperandos[frameAtual.sp] = 4;

				}
				;
				break;

				case Definicao.ICONST5: {

					frameAtual.sp++;

					frameAtual.pilhaOperandos[frameAtual.sp] = 5;

				}
				;
				break;

				case Definicao.ICONSTM1: {

					frameAtual.sp++;

					frameAtual.pilhaOperandos[frameAtual.sp] = -1;

				}
				;
				break;

				case Definicao.ACONSTNULL: {

					frameAtual.sp++;

					frameAtual.pilhaOperandos[frameAtual.sp] = new Referencia(null);

				}
				;
				break;

				case Definicao.LDC: {

					frameAtual.sp++;

					op1 = obterOperandoInteiro(frameAtual);

					frameAtual.pilhaOperandos[frameAtual.sp] = op1;

				}
				;
				break;

				// operações de load

				case Definicao.ILOAD0: {

					frameAtual.sp++;

					frameAtual.pilhaOperandos[frameAtual.sp] = frameAtual.variaveis[0];

				}
				;
				break;

				case Definicao.ILOAD1: {

					frameAtual.sp++;

					frameAtual.pilhaOperandos[frameAtual.sp] = frameAtual.variaveis[1];

				}
				;
				break;

				case Definicao.ILOAD2: {

					frameAtual.sp++;

					frameAtual.pilhaOperandos[frameAtual.sp] = frameAtual.variaveis[2];

				}
				;
				break;

				case Definicao.ILOAD3: {

					frameAtual.sp++;

					frameAtual.pilhaOperandos[frameAtual.sp] = frameAtual.variaveis[3];

				}
				;
				break;

				case Definicao.ILOAD: {

					frameAtual.sp++;

					op1 = obterOperandoInteiro(frameAtual);

					frameAtual.pilhaOperandos[frameAtual.sp] = frameAtual.variaveis[op1];

				}
				;
				break;

				case Definicao.ALOAD0: {

					frameAtual.sp++;

					frameAtual.pilhaOperandos[frameAtual.sp] = frameAtual.variaveis[0];

				}
				;
				break;

				case Definicao.ALOAD1: {

					frameAtual.sp++;

					frameAtual.pilhaOperandos[frameAtual.sp] = frameAtual.variaveis[1];

				}
				;
				break;

				case Definicao.ALOAD2: {

					frameAtual.sp++;

					frameAtual.pilhaOperandos[frameAtual.sp] = frameAtual.variaveis[2];

				}
				;
				break;

				case Definicao.ALOAD3: {

					frameAtual.sp++;

					frameAtual.pilhaOperandos[frameAtual.sp] = frameAtual.variaveis[3];

				}
				;
				break;

				case Definicao.ALOAD: {

					frameAtual.sp++;

					op1 = obterOperandoInteiro(frameAtual);

					frameAtual.pilhaOperandos[frameAtual.sp] = frameAtual.variaveis[op1];

				}
				;
				break;


				// operações de store

				case Definicao.ISTORE0: {

					frameAtual.variaveis[0] = frameAtual.pilhaOperandos[frameAtual.sp];

					frameAtual.sp--;

				}
				;
				break;

				case Definicao.ISTORE1: {

					frameAtual.variaveis[1] = frameAtual.pilhaOperandos[frameAtual.sp];

					frameAtual.sp--;

				}
				;
				break;

				case Definicao.ISTORE2: {

					frameAtual.variaveis[2] = frameAtual.pilhaOperandos[frameAtual.sp];

					frameAtual.sp--;

				}
				;
				break;

				case Definicao.ISTORE3: {

					frameAtual.variaveis[3] = frameAtual.pilhaOperandos[frameAtual.sp];

					frameAtual.sp--;

				}
				;
				break;

				case Definicao.ISTORE: {

					op1 = obterOperandoInteiro(frameAtual);

					frameAtual.variaveis[op1] = frameAtual.pilhaOperandos[frameAtual.sp];

					frameAtual.sp--;

				}
				;
				break;

				case Definicao.ASTORE0: {

					frameAtual.variaveis[0] = frameAtual.pilhaOperandos[frameAtual.sp];

					frameAtual.sp--;

				}
				;
				break;

				case Definicao.ASTORE1: {

					frameAtual.variaveis[1] = frameAtual.pilhaOperandos[frameAtual.sp];

					frameAtual.sp--;

				}
				;
				break;

				case Definicao.ASTORE2: {

					frameAtual.variaveis[2] = frameAtual.pilhaOperandos[frameAtual.sp];

					frameAtual.sp--;

				}
				;
				break;

				case Definicao.ASTORE3: {

					frameAtual.variaveis[3] = frameAtual.pilhaOperandos[frameAtual.sp];

					frameAtual.sp--;

				}
				;
				break;

				case Definicao.ASTORE: {

					op1 = obterOperandoInteiro(frameAtual);

					frameAtual.variaveis[op1] = frameAtual.pilhaOperandos[frameAtual.sp];

					frameAtual.sp--;

				}
				;
				break;

				// operações lógicas

				case Definicao.IAND: {

					op1 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp - 1];

					op2 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp];

					op1 = op1 & op2;

					frameAtual.sp--;

				}
				;
				break;

				case Definicao.IOR: {

					op1 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp - 1];

					op2 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp];

					op1 = op1 | op2;

					frameAtual.sp--;

				}
				;
				break;

				case Definicao.IXOR: {

					op1 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp - 1];

					op2 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp];

					op1 = op1 ^ op2;

					frameAtual.sp--;

				}
				;
				break;

				// operações de desvio condicional

				case Definicao.IFEQ: {

					op1 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp];

					if (op1 == 0) {

						desviar(frameAtual);

						desvio = true;

					} else {

						frameAtual.pilhaOperandos[frameAtual.sp] = 0;

						frameAtual.pc += 4;

					}

				}
				;
				break;

				case Definicao.IFNE: {

					op1 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp];

					if (op1 != 0) {

						desviar(frameAtual);

						desvio = true;

					} else {

						frameAtual.pilhaOperandos[frameAtual.sp] = 0;

						frameAtual.pc += 4;

					}

				}
				;
				break;

				case Definicao.IFLT: {

					op1 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp];

					if (op1 > 0) {

						desviar(frameAtual);

						desvio = true;

					} else {

						frameAtual.pilhaOperandos[frameAtual.sp] = 0;

						frameAtual.pc += 4;

					}

				}
				;
				break;

				case Definicao.IFGE: {

					op1 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp];

					if (op1 >= 0) {

						desviar(frameAtual);

						desvio = true;

					} else {

						frameAtual.pilhaOperandos[frameAtual.sp] = 0;

						frameAtual.pc += 4;

					}

				}
				;
				break;

				case Definicao.IFGT: {

					op1 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp];

					if (op1 > 0) {

						desviar(frameAtual);

						desvio = true;

					} else {

						frameAtual.pilhaOperandos[frameAtual.sp] = 0;

						frameAtual.pc += 4;

					}

				}
				;
				break;

				case Definicao.IFLE: {

					op1 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp];

					if (op1 <= 0) {

						desviar(frameAtual);

						desvio = true;

					} else {

						frameAtual.pilhaOperandos[frameAtual.sp] = 0;

						frameAtual.pc += 4;

					}

				}
				;
				break;

				case Definicao.IF_ICMPEQ: {

					op1 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp - 1];

					op2 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp];

					frameAtual.sp--;

					if (op1 == op2) {

						desviar(frameAtual);

						desvio = true;

					} else {

						frameAtual.pilhaOperandos[frameAtual.sp] = 0;

						frameAtual.pc += 4;

					}

				}
				;
				break;

				case Definicao.IF_ICMPNE: {

					op1 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp - 1];

					op2 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp];

					frameAtual.sp--;

					if (op1 != op2) {

						desviar(frameAtual);

						desvio = true;

					} else {

						frameAtual.pilhaOperandos[frameAtual.sp] = 0;

						frameAtual.pc += 4;

					}

				}
				;
				break;

				case Definicao.IF_ICMPLT: {

					op1 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp - 1];

					op2 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp];

					frameAtual.sp--;

					if (op1 < op2) {

						desviar(frameAtual);

						desvio = true;

					} else {

						frameAtual.pilhaOperandos[frameAtual.sp] = 0;

						frameAtual.pc += 4;

					}

				}
				;
				break;

				case Definicao.IF_ICMPGE: {

					op1 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp - 1];

					op2 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp];

					frameAtual.sp--;

					if (op1 >= op2) {

						desviar(frameAtual);

						desvio = true;

					} else {

						frameAtual.pilhaOperandos[frameAtual.sp] = 0;

						frameAtual.pc += 4;

					}

				}
				;
				break;

				case Definicao.IF_ICMPGT: {

					op1 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp - 1];

					op2 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp];

					frameAtual.sp--;

					if (op1 > op2) {

						desviar(frameAtual);

						desvio = true;

					} else {

						frameAtual.pilhaOperandos[frameAtual.sp] = 0;

						frameAtual.pc += 4;

					}

				}
				;
				break;

				case Definicao.IF_ICMPLE: {

					op1 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp - 1];

					op2 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp];

					frameAtual.sp--;

					if (op1 <= op2) {

						desviar(frameAtual);

						desvio = true;

					} else {

						frameAtual.pilhaOperandos[frameAtual.sp] = 0;

						frameAtual.pc += 4;

					}

				}
				;
				break;

				// desvio incondicional
				case Definicao.GOTO: {

					op1 = obterOperandoInteiro(frameAtual);

					frameAtual.pc = op1;

					desvio = true;

				}
				;
				break;

				//manipulação de objetos

				case Definicao.NEW: {

					op1 = obterOperandoInteiro(frameAtual);

					SimboloClasse simboloClasse = loader.carregarClasse(op1);
					
					Objeto objeto = new Objeto(simboloClasse);

					heap.add(objeto);

					frameAtual.pilhaOperandos[++frameAtual.sp] = new Referencia(heap.indexOf(objeto));

				}

				;
				break;
				
				case Definicao.INVOKEVIRTUAL: {
					
					op1 = obterOperandoInteiro(frameAtual);
					
					
					
				}
				
				;
				break;

				case Definicao.INVOKESPECIAL: {

					frameAtual.sp--;

					frameAtual.pc += 4;

				}

				;
				break;

				case Definicao.GETFIELD: {

					referencia = (Referencia)frameAtual.pilhaOperandos[frameAtual.sp];

					Objeto objeto = heap.get(referencia.getEndereco());

					op1 = obterOperandoInteiro(frameAtual);

					frameAtual.pilhaOperandos[frameAtual.sp] = null;

					frameAtual.pilhaOperandos[frameAtual.sp] = objeto.getMemoriaLocal()[op1];

				}

				;
				break;

				case Definicao.PUTFIELD: {

					referencia = (Referencia)frameAtual.pilhaOperandos[frameAtual.sp - 1];

					Objeto objeto = heap.get(referencia.getEndereco());

					op1 = obterOperandoInteiro(frameAtual);

					objeto.getMemoriaLocal()[op1] = frameAtual.pilhaOperandos[frameAtual.sp--];

				}

				;
				break;

				}
						

				if (!desvio)

					frameAtual.pc++;

				// Para testes
				exibirTela(frameAtual);
			}
			
			topoPilha--;

		} while(topoPilha > -1);

	}

	protected void desviar(StackFrame frame) {

		frame.pilhaOperandos[frame.sp] = 1;

		int op = obterOperandoInteiro(frame);

		frame.pc = op;

	}

	protected int obterOperandoInteiro(StackFrame frame) {

		int op = BytecodeAssembler.obterInteiro(global.codigo, frame.pc + 1);

		frame.pc += 4;

		return op;

	}

	protected short valorEmByte(short a) {

		return (short) (128 + (128 + a));

	}

	// Usado somente para testes
	protected void exibirTela(StackFrame frame) {

		int i;

		System.out.println("frameAtual.pc: " + frame.pc);

		System.out.println("frameAtual.sp: " + frame.sp);

		System.out.print("Memória do código: ");

		for (i = 0; i < global.codigo.length; i++)

			System.out.print(global.codigo[i] + " ");

		System.out.print("\n");

		System.out.print("Memória global das variáveis: ");

		for (i = 0; i < frame.variaveis.length; i++)

			System.out.print(frame.variaveis[i] + " ");

		System.out.print("\n");

		System.out.print("Pilha: ");

		for (i = 0; i < frame.pilhaOperandos.length; i++)

			System.out.print(frame.pilhaOperandos[i] + " ");

		System.out.print("\n\n");

		System.out
				.print("Pressione qualquer tecla para ir para a próxima instrução: ");

		Scanner in = new Scanner(System.in);

		in.next();


	}
	

}
