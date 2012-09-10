package br.ufpb.iged.interpretador.principal;

import java.util.Collection;
import java.util.List;

import br.ufpb.iged.interpretador.bytecodeassembler.asm.BytecodeAssembler;
import br.ufpb.iged.interpretador.excecoes.ClassNotFoundException;
import br.ufpb.iged.interpretador.symboltable.classes.EscopoGlobal;
import br.ufpb.iged.interpretador.symboltable.classes.Simbolo;
import br.ufpb.iged.interpretador.symboltable.classes.SimboloClasse;

public class ClassLoader {
	
	private BytecodeAssembler assembler;
	
	private static final String METODO_MAIN = "main(VOID)V";
	
	public ClassLoader(BytecodeAssembler assembler) {
		
		this.assembler = assembler;
		
	}
	
	public SimboloClasse carregarClasse(String nome) throws ClassNotFoundException{
		
		List<SimboloClasse> classes = assembler.getConstantPool();
    	    	
    	for(SimboloClasse classe: classes){
    		  			
    			if (classe.nome.equals(nome)){
    				classe.alocarMemoriaFields();
    				return classe;
    			}
    			
    		
    	}
    	
		throw new ClassNotFoundException("A classe "+nome+" não foi encontrada");
    	
    }
	
	public SimboloClasse carregarClasse(int index) throws ClassNotFoundException {
		
		SimboloClasse classe = assembler.getConstantPool().get(index);
		
		if (classe != null){
			classe.alocarMemoriaFields();
			return classe;
		}
		
		throw new ClassNotFoundException("A classe referenciada não pôde ser encontrada");
		
	}
	
	public SimboloClasse carregarClasseMain() throws ClassNotFoundException{
    	
		List<SimboloClasse> classes = assembler.getConstantPool();
    	
		for(SimboloClasse classe: classes){
    			
    			if (classe.possuiMetodo(METODO_MAIN, "main")){
    				classe.alocarMemoriaFields();
    				return classe;
    			}
    		
    	}
    	
    	throw new ClassNotFoundException("Não foi encontrada nenhuma classe que possua um método main");
    	
    }

}
