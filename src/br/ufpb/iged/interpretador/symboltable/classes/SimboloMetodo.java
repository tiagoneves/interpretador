package br.ufpb.iged.interpretador.symboltable.classes;

import java.util.LinkedHashMap;
import java.util.Map;

public class SimboloMetodo extends SimboloComEscopo{

	Map<String, Simbolo> parametros = new LinkedHashMap<String, Simbolo>();
	
	private String retorno;
	
	public static final int TAMANHO_INICIAL_MEMORIA_CODIGO = 1024;
	
	private byte[] codigo = new byte[TAMANHO_INICIAL_MEMORIA_CODIGO];
	
	public Object[] memoriaLocal;
	
	private int tamanhoMemoriaLocal;

	public SimboloMetodo(String nome, Tipo tipoRet, Escopo parent) {
        super(nome, tipoRet, parent);
        setRetorno("");
    }

    public Map<String, Simbolo> obterMembros() { 
    	return parametros; 
    }

    public String obterNome() {
        return nome+"("+stripBrackets(parametros.keySet().toString())+")";
    }

	public String getRetorno() {
		return retorno;
	}

	public void setRetorno(String retorno) {
		this.retorno = retorno;
	}
	
	public byte[] getCodigo() {
		return codigo;
	}

	public void setCodigo(byte[] codigo) {
		this.codigo = codigo;
	}

	public int getTamanhoMemoriaLocal() {
		return tamanhoMemoriaLocal;
	}

	public void setTamanhoMemoriaLocal(int tamanhoMemoriaLocal) {
		this.tamanhoMemoriaLocal = tamanhoMemoriaLocal;
		memoriaLocal = new Object[this.tamanhoMemoriaLocal];
	}

	public String toString() {
		return obterNome()+getRetorno();
	}
	
	//para testes
	public void exibirCodigo() {
		
		System.out.println("--------- Método "+this+" ---------");
		System.out.print("Memória do código: ");

		int i;
		
		for (i = 0; i < codigo.length; i++)

			System.out.print(codigo[i] + " ");

		System.out.print("\n");
		
		System.out.println("Tamanho da memória local: "+tamanhoMemoriaLocal+"\n\n");
		
	}
	
}
