package br.ufpb.iged.interpretador.principal;

public class StackFrame {
	
	public static final int TAMANHO_INICIAL_PILHA = 100;
	
	private Object[] pilhaOperandos = new Object[TAMANHO_INICIAL_PILHA];
	
	private Object[] variaveis;
	
	private int sp = -1;
	
	private int pc = 0;
	
	

}
