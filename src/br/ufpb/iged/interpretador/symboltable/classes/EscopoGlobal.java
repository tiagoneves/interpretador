package br.ufpb.iged.interpretador.symboltable.classes;

public class EscopoGlobal extends EscopoBase {
	
    public EscopoGlobal() { 
    	super(null); 
    }
    
    public String obterNomeEscopo() { 
    	return "global"; 
    }
    
}