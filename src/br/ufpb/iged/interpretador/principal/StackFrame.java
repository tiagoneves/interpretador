package br.ufpb.iged.interpretador.principal;

public class StackFrame {
	
	public static final int TAMANHO_INICIAL_PILHA = 100;
	
	public Object[] pilhaOperandos = new Object[TAMANHO_INICIAL_PILHA];
	
	public Object[] variaveis;
		
	public int sp = -1;
	
	public ProgramCounter pc;
	
	public StackFrame(int tamanhoMemoriaLocal) {
		
		this.variaveis = new Object[tamanhoMemoriaLocal];
		
	}
	

}
