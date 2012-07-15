package br.ufpb.iged.interpretador.symboltable.classes;

import java.util.*;

public class SimboloClasse extends SimboloComEscopo implements Escopo, Tipo {
    /** This is the superclass not escopoEnvolvente field. We still record
     *  the enclosing Escopo so we can push in and pop out of class defs.
     */
    public SimboloClasse superClasse;
    
    /** List of all fields and methods */
    public Map<String,Simbolo> membros=new LinkedHashMap<String,Simbolo>();
    
    protected List<Simbolo> constantPool = new ArrayList<Simbolo> ();
    
    protected int proximoElementoConstPool = 0;

    public SimboloClasse(String nome, Escopo escopoEnvolvente, SimboloClasse superClasse) {
    	
        super(nome, escopoEnvolvente);
        
        this.superClasse = superClasse;
        
    }

    public Escopo obterEscopoPai() {
    	
        if ( superClasse==null ) return escopoEnvolvente; // globals
        
        return superClasse; // if not root object, return super
        
    }

    /** For a.b, only look in a's class hierarchy to resolve b, not globals */
    public Simbolo resolverMembro(String nome) {
    	
        Simbolo s = membros.get(nome);
        
        if ( s!=null ) return s;
        // if not here, check just the superclass chain
        if ( superClasse != null ) {
            return superClasse.resolverMembro(nome);
        }
        return null; // not found
        
    }

    public Map<String, Simbolo> obterMembros() {
    	
    	return membros; 
    	
    }
    
    public String toString() {
        return "class "+nome+":{"+
               stripBrackets(membros.keySet().toString())+"}";
    }

	@Override
	public String obterNome() {
		// TODO Auto-generated method stub
		return nome;
	}

	public List<Simbolo>  getConstantPool() {
		return constantPool;
	}

	public void setConstantPool(List<Simbolo> constantPool) {
		this.constantPool = constantPool;
	}

	public SimboloClasse getSuperClasse() {
		return superClasse;
	}

	public void setSuperClasse(SimboloClasse superClasse) {
		this.superClasse = superClasse;
	}

	
    
}

