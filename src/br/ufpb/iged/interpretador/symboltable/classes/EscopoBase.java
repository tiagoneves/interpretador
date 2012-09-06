package br.ufpb.iged.interpretador.symboltable.classes;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract class EscopoBase implements Escopo {
	
	private Escopo escopoEnvolvente; // null if global (outermost) scope
	
	public Map<String, Simbolo> simbolos = new LinkedHashMap<String, Simbolo>();

    public EscopoBase(Escopo parent) { this.escopoEnvolvente = parent;	}

    public Simbolo resolver(String nome) {
    	
    	Simbolo s = simbolos.get(nome);
    	
        if ( s!=null ) return s;
		// if not here, check any enclosing scope
		if ( obterEscopoPai() != null ) return obterEscopoPai().resolver(nome);
		return null; // not found
		
	}

	public void definir(Simbolo simbolo) {
		
		simbolos.put(simbolo.nome, simbolo);
		
		simbolo.escopo = this; // track the scope in each symbol
		
	}

    public Escopo obterEscopoPai() {
    	
    	return obterEscopoEnvolvente();
    	
    }
    
    public Escopo obterEscopoEnvolvente() {
    	
    	return escopoEnvolvente;
    	
    }

	public String toString() { return simbolos.keySet().toString(); }
}

