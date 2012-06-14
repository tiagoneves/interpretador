package br.ufpb.iged.interpretador.symboltable.classes;

public interface Escopo {
	
	 public String obterNomeEscopo();

	    /** Where to look next for symbols; superclass or enclosing scope */
	 public Escopo obterEscopoPai();
	    /** Scope in which this scope defined. For global scope, it's null */
	 public Escopo obterEscopoEnvolvente();

	    /** Define a symbol in the current scope */
	 public void definir(Simbolo simbolo);

	    /** Look up name in this scope or in parent scope if not here */
	 public Simbolo resolver(String name);

}
