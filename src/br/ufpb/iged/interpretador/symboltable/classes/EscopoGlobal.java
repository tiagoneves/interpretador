package br.ufpb.iged.interpretador.symboltable.classes;

import java.util.ArrayList;
import java.util.List;

import br.ufpb.iged.interpretador.principal.Objeto;

public class EscopoGlobal extends EscopoBase {
	
	public static final int TAMANHO_INICIAL_PILHA_OPERANDOS = 100;
	
	public int ip = 0;

	public byte[] codigo;

	public int tamanhoCodigo;

	public Object[] memoriaGlobal;

	public Object[] pilhaOperandos = new Object[TAMANHO_INICIAL_PILHA_OPERANDOS];

	public int sp = -1;
	
	public List<Objeto> heap = new ArrayList<Objeto>();
	
    public EscopoGlobal() { 
    	super(null); 
    }
    
    public String obterNomeEscopo() { 
    	return "global"; 
    }
    
    
}