package br.ufpb.iged.interpretador.principal;

import java.util.Collection;

import br.ufpb.iged.interpretador.excecoes.ClassNotFoundException;
import br.ufpb.iged.interpretador.symboltable.classes.EscopoGlobal;
import br.ufpb.iged.interpretador.symboltable.classes.Simbolo;
import br.ufpb.iged.interpretador.symboltable.classes.SimboloClasse;

public class ClassLoader {
	
	private EscopoGlobal escopoGlobal;
	
	private static final String METODO_MAIN = "main(VOID)V";
	
	public ClassLoader(EscopoGlobal global) {
		
		escopoGlobal = global;
		
	}
	
	public SimboloClasse carregarClasse(String nome) throws ClassNotFoundException{
    	
    	Collection<Simbolo> simbs = escopoGlobal.simbolos.values();
    	
    	for(Simbolo simb: simbs){
    		
    		if (simb.nome.startsWith("L")) {
    			
    			if (((SimboloClasse)simb).nome.equals(nome))
    				return (SimboloClasse)simb;
    			
    		}
    		
    	}
    	
		throw new ClassNotFoundException("A classe "+nome+" não foi encontrada");
    	
    }
	
	public SimboloClasse carregarClasseMain() throws ClassNotFoundException{
    	
    	Collection<Simbolo> simbs = escopoGlobal.simbolos.values();
    	
    	for(Simbolo simb: simbs){
    		
    		if (simb.nome.startsWith("L")) {
    			
    			if (((SimboloClasse)simb).possuiMetodo(METODO_MAIN, "main"))
    				return (SimboloClasse)simb;
    			
    		}
    		
    	}
    	
    	throw new ClassNotFoundException("Não foi encontrada nenhuma classe que possua um método main");
    	
    }

}
