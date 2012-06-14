package br.ufpb.iged.interpretador.symboltable.classes;

public class SimboloTipoPrimitvo extends Simbolo implements Tipo {
	
    public SimboloTipoPrimitvo(String nome) { 
    	
    	super(nome); 
    	
    }

	@Override
	public String obterNome() {
		// TODO Auto-generated method stub
		return nome;
		
	}

    
}
