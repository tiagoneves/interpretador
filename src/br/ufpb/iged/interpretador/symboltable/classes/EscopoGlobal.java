package br.ufpb.iged.interpretador.symboltable.classes;

public class EscopoGlobal extends EscopoBase {
	
	public static final int TAMANHO_INICIAL_PILHA_OPERANDOS = 100;
	
	public int ip = 0;

	public byte[] codigo;

	public int tamanhoCodigo;

	public Object[] memoriaGlobal;

	public Object[] pilhaOperandos = new Object[TAMANHO_INICIAL_PILHA_OPERANDOS];

	public int sp = -1;
	
    public EscopoGlobal() { 
    	super(null); 
    }
    
    public String obterNomeEscopo() { 
    	return "global"; 
    }
    
    
}