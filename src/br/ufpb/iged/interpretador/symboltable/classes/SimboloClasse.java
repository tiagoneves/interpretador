package br.ufpb.iged.interpretador.symboltable.classes;

import java.util.*;

import br.ufpb.iged.interpretador.principal.Referencia;

public class SimboloClasse extends SimboloComEscopo implements Tipo {
    /** This is the superclass not escopoEnvolvente field. We still record
     *  the enclosing Escopo so we can push in and pop out of class defs.
     */
    public SimboloClasse superClasse;
    
    /** List of all fields and methods */
    public Map<String,Simbolo> membros=new LinkedHashMap<String,Simbolo>();
    
    protected List<Simbolo> constantPool = new ArrayList<Simbolo> ();
    
    protected List<SimboloMetodo> methodArea = new ArrayList<SimboloMetodo>();
    
    private Object[] fields;
    
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
    
    public SimboloMetodo resolverMetodo(String assinatura, String nome) {
    	
        Simbolo s = membros.get(nome);
        
        if (s == null)
        	return null;
        
        if (s.toString().equals(assinatura))
        	return (SimboloMetodo)s;
        
        // if not here, check just the superclass chain
        if ( superClasse != null ) {
            return superClasse.resolverMetodo(assinatura, nome);
        }
        return null; // not found
        
    }
    
    public boolean possuiMetodo(String assinatura, String nome) {
    	
        SimboloMetodo metodo = resolverMetodo(assinatura, nome);
        
        if (metodo != null)
        	return true;
        
        return false;
        
    }
    
    public void alocarMemoriaFields() {
    	
    	fields = new Object[constantPool.size()];
		
		int i;
		
		for (i = 0; i < constantPool.size(); i++) {
			
			String nomeTipo = constantPool.get(i).getTipo().obterNome();
			
			if(nomeTipo.equals("I"))
				
				fields[i] = new Integer(0);
			
			else if (nomeTipo.startsWith("L"))
				
				fields[i] = new Referencia(new Integer(0));
				
			
		}
		
		SimboloClasse parent = superClasse;
		
		while(parent != null) {
			
			List<Simbolo> constantPoolParent = parent.getConstantPool();
			
			fields = 
					Arrays.copyOf(
							fields, fields.length + constantPoolParent.size());
			
			int j;
			
			for (j = 0; j < constantPoolParent.size(); j++, i++) {
				
				String nomeTipo = constantPoolParent.get(j).getTipo().obterNome();
				
				if(nomeTipo.equals("I"))
					
					fields[i] = new Integer(0);
				
				else if (nomeTipo.startsWith("L"))
					
					fields[i] = new Referencia(new Integer(0));
					
				
			}
			
			parent = parent.getSuperClasse();
			
		}
    	
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

	public Object[] getFields() {
		return fields;
	}

	public void setFields(Object[] fields) {
		
		this.fields = fields;
		
	}

	public List<SimboloMetodo> getMethodArea() {
		return methodArea;
	}

	public void setMethodArea(List<SimboloMetodo> methodArea) {
		this.methodArea = methodArea;
	}

	
    
}

