package br.ufpb.iged.interpretador.principal;

import java.util.List;

import br.ufpb.iged.interpretador.excecoes.ClassNotFoundException;
import br.ufpb.iged.interpretador.symboltable.classes.SimboloClasse;

public class ClassLoader {
		
	private static final String METODO_MAIN = "main(VOID)V";
	
	public static SimboloClasse carregarClasse(String nome) throws ClassNotFoundException{
		
		List<SimboloClasse> classes = Interpretador.getAssembler().getConstantPool();
    	    	
    	for(SimboloClasse classe: classes){
    		  			
    			if (classe.nome.equals(nome)){
    				classe.alocarMemoriaFields();
    				return classe;
    			}
    			
    		
    	}
    	
		throw new ClassNotFoundException("A classe "+nome+" n�o foi encontrada");
    	
    }
	
	public static SimboloClasse carregarClasse(int index) throws ClassNotFoundException {
		
		SimboloClasse classe = Interpretador.getAssembler().getConstantPool().get(index);
		
		if (classe != null){
			classe.alocarMemoriaFields();
			return classe;
		}
		
		throw new ClassNotFoundException("A classe referenciada n�o p�de ser encontrada");
		
	}
	
	public static SimboloClasse carregarClasseMain() throws ClassNotFoundException{
    	
		List<SimboloClasse> classes = Interpretador.getAssembler().getConstantPool();
    	
		for(SimboloClasse classe: classes){
    			
    			if (classe.possuiMetodo(METODO_MAIN, "main")){
    				classe.alocarMemoriaFields();
    				return classe;
    			}
    		
    	}
    	
    	throw new ClassNotFoundException("N�o foi encontrada nenhuma classe que possua um m�todo main");
    	
    }

}
