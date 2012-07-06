package br.ufpb.iged.interpretador.principal;

import java.util.List;

import br.ufpb.iged.interpretador.symboltable.classes.Simbolo;
import br.ufpb.iged.interpretador.symboltable.classes.SimboloClasse;

public class Objeto {
	
	private String nome;
	
	private Object[] memoriaLocal;
	
	public Objeto(SimboloClasse simboloClasse) {
		
		nome = simboloClasse.obterNome();
		
		List<Simbolo> constantPool = simboloClasse.getConstantPool();
		
		memoriaLocal = new Object[constantPool.size()];
		
		int i;
		
		for (i = 0; i < constantPool.size(); i++) {
			
			String nomeTipo = constantPool.get(i).getTipo().obterNome();
			
			if(nomeTipo.equals("I"))
				
				memoriaLocal[i] = new Integer(0);
			
			else if (nomeTipo.startsWith("L"))
				
				memoriaLocal[i] = new Integer(0);
				
			
		}
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Object[] getMemoriaLocal() {
		return memoriaLocal;
	}

	public void setMemoriaLocal(Object[] memoriaLocal) {
		this.memoriaLocal = memoriaLocal;
	}
	
	

}
