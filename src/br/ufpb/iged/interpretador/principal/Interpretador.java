package br.ufpb.iged.interpretador.principal;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.antlr.runtime.ANTLRFileStream;
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
import br.ufpb.iged.interpretador.bytecodeassembler.parser.AssemblerLexer;
import br.ufpb.iged.interpretador.excecoes.AcessoIndevidoMemoriaException;
import br.ufpb.iged.interpretador.excecoes.LabelException;
import br.ufpb.iged.interpretador.symboltable.classes.BytecodesAST;
import br.ufpb.iged.interpretador.symboltable.classes.BytecodesErrorNode;
import br.ufpb.iged.interpretador.symboltable.classes.EscopoGlobal;
import br.ufpb.iged.interpretador.symboltable.classes.Simbolo;
import br.ufpb.iged.interpretador.symboltable.classes.TabelaSimbolos;
import br.ufpb.iged.interpretador.symboltable.parser.Def;

public class Interpretador {
	
	static TabelaSimbolos tabelaSimbolos;
	
	static EscopoGlobal global;

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

	public static void main(String[] args) throws Exception {
		
		if (carregar()) {
			
			Interpretador interpretador = new Interpretador();
			
			interpretador.cpu();
			
		}
			

	}

	public static boolean carregar() {
		
	        tabelaSimbolos = new TabelaSimbolos(); 
	        BytecodeAssembler assembler = carregarClasse("Main.class");
	        global = tabelaSimbolos.global;
			global.codigo = assembler.obterCodigoMaquina();
			global.tamanhoCodigo = assembler.obterTamanhoMemoriaCodigo();
			global.memoriaGlobal = new Object[assembler.getTamMemoriaGlobal()];
			
			File file = new File(".\\");
			
			String[] arquivos = file.list();
			
			int i;
			
			for (i = 0; i < arquivos.length; i++){
				
				if (arquivos[i].endsWith(".class") && 
						!(arquivos[i].equals("Main.class")))
					
					carregarClasse(arquivos[i]);
				
			}
			
			Simbolo classe = tabelaSimbolos.global.resolver("Teste");
			System.out.println("Classe adicionada:" + classe.nome);
			
		return true;
		
	}
	
	public static BytecodeAssembler carregarClasse(String nomeArquivo) {
		
		BytecodeAssembler parser = null;
		
		try {
			
			CharStream input = new ANTLRFileStream(nomeArquivo);
			
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
			
		} catch(IOException ioe) {
			
			System.out.println(ioe.getMessage());
			
		} catch (RecognitionException re){
			
			System.out.println(re.getMessage());
			
		} catch (LabelException le) {
			
			System.out.println(le.getMessage());
			
		} catch (AcessoIndevidoMemoriaException aime) {
			
			System.out.println(aime.getMessage());
			
		}
			    
	    return parser;
		
	}
	
	protected void cpu() {

		int op1, op2;

		short opcode;

		boolean desvio;

		while (global.ip < global.tamanhoCodigo) {

			desvio = false;

			opcode = global.codigo[global.ip];

			if (opcode < 0)

				opcode = recuperarValorOpcode(opcode);

			switch (opcode) {

			// nenhuma operação

			case Definicao.NOP:
				;
				break;
				
			case Definicao.POP:
				global.sp-- ;
				break;
				
			case Definicao.POP2:
				global.sp -= 2 ;
				break;

			// operações aritméticas

			case Definicao.INEG: {

				op1 = (Integer) global.pilhaOperandos[global.sp];

				global.pilhaOperandos[global.sp] = 0 - op1;

			};
				break;

			case Definicao.IADD: {

				op1 = (Integer) global.pilhaOperandos[global.sp - 1];

				op2 = (Integer) global.pilhaOperandos[global.sp];

				global.sp--;

				global.pilhaOperandos[global.sp] = op1 + op2;

			}
				;
				break;

			case Definicao.ISUB: {

				op1 = (Integer) global.pilhaOperandos[global.sp - 1];

				op2 = (Integer) global.pilhaOperandos[global.sp];

				global.sp--;

				global.pilhaOperandos[global.sp] = op1 - op2;

			}
				;
				break;

			case Definicao.IMUL: {

				op1 = (Integer) global.pilhaOperandos[global.sp - 1];

				op2 = (Integer) global.pilhaOperandos[global.sp];

				global.sp--;

				global.pilhaOperandos[global.sp] = op1 * op2;

			}
				;
				break;

			case Definicao.IDIV: {

				op1 = (Integer) global.pilhaOperandos[global.sp - 1];

				op2 = (Integer) global.pilhaOperandos[global.sp];

				global.sp--;

				global.pilhaOperandos[global.sp] = op1 / op2;

			}
				;
				break;

			case Definicao.IREM: {

				op1 = (Integer) global.pilhaOperandos[global.sp - 1];

				op2 = (Integer) global.pilhaOperandos[global.sp];

				global.sp--;

				global.pilhaOperandos[global.sp] = op1 % op2;

			}
				;
				break;

			case Definicao.IINC: {

				op1 = (Integer) global.pilhaOperandos[global.sp];

				global.pilhaOperandos[global.sp] = ++op1;

			}
				;
				break;

			// operações de empilhamento de constantes

			case Definicao.ICONST0: {

				global.sp++;

				global.pilhaOperandos[global.sp] = 0;

			}
				;
				break;

			case Definicao.ICONST1: {

				global.sp++;

				global.pilhaOperandos[global.sp] = 1;

			}
				;
				break;

			case Definicao.ICONST2: {

				global.sp++;

				global.pilhaOperandos[global.sp] = 2;

			}
				;
				break;

			case Definicao.ICONST3: {

				global.sp++;

				global.pilhaOperandos[global.sp] = 3;

			}
				;
				break;

			case Definicao.ICONST4: {

				global.sp++;

				global.pilhaOperandos[global.sp] = 4;

			}
				;
				break;

			case Definicao.ICONST5: {

				global.sp++;

				global.pilhaOperandos[global.sp] = 5;

			}
				;
				break;

			case Definicao.ICONSTM1: {

				global.sp++;

				global.pilhaOperandos[global.sp] = -1;

			}
				;
				break;

			case Definicao.LDC: {

				global.sp++;

				op1 = obterOperandoInteiro();

				global.pilhaOperandos[global.sp] = op1;

			}
				;
				break;

			// operações de load

			case Definicao.ILOAD0: {

				global.sp++;

				global.pilhaOperandos[global.sp] = global.memoriaGlobal[0];

			}
				;
				break;

			case Definicao.ILOAD1: {

				global.sp++;

				global.pilhaOperandos[global.sp] = global.memoriaGlobal[1];

			}
				;
				break;

			case Definicao.ILOAD2: {

				global.sp++;

				global.pilhaOperandos[global.sp] = global.memoriaGlobal[2];

			}
				;
				break;

			case Definicao.ILOAD3: {

				global.sp++;

				global.pilhaOperandos[global.sp] = global.memoriaGlobal[3];

			}
				;
				break;

			case Definicao.ILOAD: {

				global.sp++;

				op1 = obterOperandoInteiro();

				global.pilhaOperandos[global.sp] = global.memoriaGlobal[op1];

			}
				;
				break;

			// operações de store

			case Definicao.ISTORE0: {

				global.memoriaGlobal[0] = global.pilhaOperandos[global.sp];
				
				global.sp--;

			}
				;
				break;

			case Definicao.ISTORE1: {

				global.memoriaGlobal[1] = global.pilhaOperandos[global.sp];
				
				global.sp--;

			}
				;
				break;

			case Definicao.ISTORE2: {

				global.memoriaGlobal[2] = global.pilhaOperandos[global.sp];
				
				global.sp--;

			}
				;
				break;

			case Definicao.ISTORE3: {

				global.memoriaGlobal[3] = global.pilhaOperandos[global.sp];
				
				global.sp--;

			}
				;
				break;

			case Definicao.ISTORE: {

				op1 = obterOperandoInteiro();

				global.memoriaGlobal[op1] = global.pilhaOperandos[global.sp];
				
				global.sp--;

			}
				;
				break;

			// operações lógicas

			case Definicao.IAND: {

				op1 = (Integer) global.pilhaOperandos[global.sp - 1];

				op2 = (Integer) global.pilhaOperandos[global.sp];

				op1 = op1 & op2;

				global.sp--;

			}
				;
				break;

			case Definicao.IOR: {

				op1 = (Integer) global.pilhaOperandos[global.sp - 1];

				op2 = (Integer) global.pilhaOperandos[global.sp];

				op1 = op1 | op2;

				global.sp--;

			}
				;
				break;

			case Definicao.IXOR: {

				op1 = (Integer) global.pilhaOperandos[global.sp - 1];

				op2 = (Integer) global.pilhaOperandos[global.sp];

				op1 = op1 ^ op2;

				global.sp--;

			}
				;
				break;

			// operações de desvio condicional

			case Definicao.IFEQ: {

				op1 = (Integer) global.pilhaOperandos[global.sp];

				if (op1 == 0) {

					desviar();

					desvio = true;

				} else

					global.pilhaOperandos[global.sp] = 0;

			}
				;
				break;

			case Definicao.IFNE: {

				op1 = (Integer) global.pilhaOperandos[global.sp];

				if (op1 != 0) {

					desviar();

					desvio = true;

				} else

					global.pilhaOperandos[global.sp] = 0;

			}
				;
				break;

			case Definicao.IFLT: {

				op1 = (Integer) global.pilhaOperandos[global.sp];

				if (op1 > 0) {

					desviar();

					desvio = true;

				} else

					global.pilhaOperandos[global.sp] = 0;

			}
				;
				break;

			case Definicao.IFGE: {

				op1 = (Integer) global.pilhaOperandos[global.sp];

				if (op1 >= 0) {

					desviar();

					desvio = true;

				} else

					global.pilhaOperandos[global.sp] = 0;

			}
				;
				break;

			case Definicao.IFGT: {

				op1 = (Integer) global.pilhaOperandos[global.sp];

				if (op1 > 0) {

					desviar();

					desvio = true;

				} else

					global.pilhaOperandos[global.sp] = 0;

			}
				;
				break;

			case Definicao.IFLE: {

				op1 = (Integer) global.pilhaOperandos[global.sp];

				if (op1 <= 0) {

					desviar();

					desvio = true;

				} else

					global.pilhaOperandos[global.sp] = 0;

			}
				;
				break;

			case Definicao.IF_ICMPEQ: {

				op1 = (Integer) global.pilhaOperandos[global.sp - 1];

				op2 = (Integer) global.pilhaOperandos[global.sp];

				global.sp--;

				if (op1 == op2) {

					desviar();

					desvio = true;

				} else {

					global.pilhaOperandos[global.sp] = 0;

					global.ip += 4;

				}

			}
				;
				break;

			case Definicao.IF_ICMPNE: {

				op1 = (Integer) global.pilhaOperandos[global.sp - 1];

				op2 = (Integer) global.pilhaOperandos[global.sp];

				global.sp--;

				if (op1 != op2) {

					desviar();

					desvio = true;

				} else {

					global.pilhaOperandos[global.sp] = 0;

					global.ip += 4;

				}

			}
				;
				break;

			case Definicao.IF_ICMPLT: {

				op1 = (Integer) global.pilhaOperandos[global.sp - 1];

				op2 = (Integer) global.pilhaOperandos[global.sp];

				global.sp--;

				if (op1 < op2) {

					desviar();

					desvio = true;

				} else {

					global.pilhaOperandos[global.sp] = 0;

					global.ip += 4;

				}

			}
				;
				break;

			case Definicao.IF_ICMPGE: {

				op1 = (Integer) global.pilhaOperandos[global.sp - 1];

				op2 = (Integer) global.pilhaOperandos[global.sp];

				global.sp--;

				if (op1 >= op2) {

					desviar();

					desvio = true;

				} else {

					global.pilhaOperandos[global.sp] = 0;

					global.ip += 4;

				}

			}
				;
				break;

			case Definicao.IF_ICMPGT: {

				op1 = (Integer) global.pilhaOperandos[global.sp - 1];

				op2 = (Integer) global.pilhaOperandos[global.sp];

				global.sp--;

				if (op1 > op2) {

					desviar();

					desvio = true;

				} else {

					global.pilhaOperandos[global.sp] = 0;

					global.ip += 4;

				}

			}
				;
				break;

			case Definicao.IF_ICMPLE: {

				op1 = (Integer) global.pilhaOperandos[global.sp - 1];

				op2 = (Integer) global.pilhaOperandos[global.sp];

				global.sp--;

				if (op1 <= op2) {

					desviar();

					desvio = true;

				} else {

					global.pilhaOperandos[global.sp] = 0;

					global.ip += 4;

				}

			}
				;
				break;

			// desvio incondicional
			case Definicao.GOTO: {

				op1 = obterOperandoInteiro();

				global.ip = op1;

				desvio = true;

			}
				;
				break;

			}

			if (!desvio)

				global.ip++;

			// Para testes
			exibirTela();

		}

	}

	protected void desviar() {

		global.pilhaOperandos[global.sp] = 1;

		int op = obterOperandoInteiro();

		global.ip = op;

	}

	protected int obterOperandoInteiro() {

		int op = BytecodeAssembler.obterInteiro(global.codigo, global.ip + 1);

		global.ip += 4;

		return op;

	}

	protected short recuperarValorOpcode(short a) {

		return (short) (128 + (128 + a));

	}

	// Usado somente para testes
	protected void exibirTela() {

		int i;

		System.out.println("IP: " + global.ip);

		System.out.println("SP: " + global.sp);

		System.out.print("Memória do código: ");

		for (i = 0; i < global.codigo.length; i++)

			System.out.print(global.codigo[i] + " ");

		System.out.print("\n");

		System.out.print("Memória global das variáveis: ");

		for (i = 0; i < global.memoriaGlobal.length; i++)

			System.out.print(global.memoriaGlobal[i] + " ");

		System.out.print("\n");

		System.out.print("Pilha: ");

		for (i = 0; i < global.pilhaOperandos.length; i++)

			System.out.print(global.pilhaOperandos[i] + " ");

		System.out.print("\n\n");

		System.out
				.print("Pressione qualquer tecla para ir para a próxima instrução: ");

		Scanner in = new Scanner(System.in);

		in.next();

	}

}
