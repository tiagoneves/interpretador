package br.ufpb.iged.interpretador.principal;

import java.io.File;
import java.io.IOException;

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
import br.ufpb.iged.interpretador.symboltable.classes.SimboloClasse;
import br.ufpb.iged.interpretador.symboltable.classes.SimboloMetodo;
import br.ufpb.iged.interpretador.symboltable.classes.TabelaSimbolos;
import br.ufpb.iged.interpretador.parser.Def;
import br.ufpb.iged.interpretador.parser.Ref;

public class Interpretador {
			
	private static final String DIRETORIO_FONTE = "./classes";
				
	public static TabelaSimbolos tabelaSimbolos;
		
	private static StringBuffer entrada;
	
	private static BytecodeAssembler assembler;
	
	private static MaquinaVirtual vm;
	
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
			
			vm = new MaquinaVirtual();
			
			executarMain();
			
		} catch (IOException ioe) {

			System.out.println(ioe.getMessage());

		} catch (RecognitionException re) {
			
			System.out.println(re.getMessage());

		} catch (LabelException le) {
			
			System.out.println(le.getMessage());
			
		} catch (AcessoIndevidoMemoriaException aime) {
			
			System.out.println(aime.getMessage());
		
		} catch (ClassNotFoundException e) {
			
			System.out.println(e.getMessage());
			
		}
			

	}
	
	public static void executarMain() throws ClassNotFoundException {
						
		SimboloClasse principal = ClassLoader.carregarClasseMain();
		SimboloMetodo main = (SimboloMetodo) principal.resolver("main");
			
		vm.iniciarNovoMetodo(main, true);
		vm.cpu();	
		
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
            
            setAssembler(carregarClasses());
		
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
	
	public static BytecodeAssembler getAssembler() {
		return assembler;
	}

	public static void setAssembler(BytecodeAssembler assembler) {
		Interpretador.assembler = assembler;
	}

	public static MaquinaVirtual getVm() {
		return vm;
	}

	public static void setVm(MaquinaVirtual vm) {
		Interpretador.vm = vm;
	}
	

}
