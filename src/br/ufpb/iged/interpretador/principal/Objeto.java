package br.ufpb.iged.interpretador.principal;

import java.util.Arrays;
import java.util.List;

import br.ufpb.iged.interpretador.symboltable.classes.Simbolo;
import br.ufpb.iged.interpretador.symboltable.classes.SimboloClasse;

public class Objeto {
	
	private String nome;
	
	private Object[] memoriaLocal;
	
	public Objeto(SimboloClasse simboloClasse) {
		
		nome = simboloClasse.obterNome();
		
		memoriaLocal = new Object[simboloClasse.getFields().length];
		
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
