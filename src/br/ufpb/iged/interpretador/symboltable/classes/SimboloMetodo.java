package br.ufpb.iged.interpretador.symboltable.classes;

import java.util.LinkedHashMap;
import java.util.Map;

public class SimboloMetodo extends SimboloComEscopo{

	Map<String, Simbolo> parametros = new LinkedHashMap<String, Simbolo>();
	
	public static final int TAMANHO_INICIAL_MEMORIA_CODIGO = 1024;
	
	public byte[] codigo = new byte[TAMANHO_INICIAL_MEMORIA_CODIGO];
	
	public Object[] memoriaLocal;

	public SimboloMetodo(String nome, Tipo tipoRet, Escopo parent) {
        super(nome, tipoRet, parent);
    }

    public Map<String, Simbolo> obterMembros() { 
    	return parametros; 
    }

    public String obterNome() {
        return nome+"("+stripBrackets(parametros.keySet().toString())+")";
    }
	
}
