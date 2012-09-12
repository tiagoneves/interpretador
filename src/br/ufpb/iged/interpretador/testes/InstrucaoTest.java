package br.ufpb.iged.interpretador.testes;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Scanner;

import org.antlr.runtime.RecognitionException;
import org.junit.Before;
import org.junit.Test;

import br.ufpb.iged.interpretador.bytecodeassembler.asm.Definicao;
import br.ufpb.iged.interpretador.excecoes.AcessoIndevidoMemoriaException;
import br.ufpb.iged.interpretador.excecoes.ClassNotFoundException;
import br.ufpb.iged.interpretador.excecoes.LabelException;
import br.ufpb.iged.interpretador.principal.ClassLoader;
import br.ufpb.iged.interpretador.principal.Interpretador;
import br.ufpb.iged.interpretador.principal.MaquinaVirtual;
import br.ufpb.iged.interpretador.principal.Objeto;
import br.ufpb.iged.interpretador.principal.ProgramCounter;
import br.ufpb.iged.interpretador.principal.Referencia;
import br.ufpb.iged.interpretador.principal.StackFrame;
import br.ufpb.iged.interpretador.symboltable.classes.SimboloClasse;
import br.ufpb.iged.interpretador.symboltable.classes.SimboloMetodo;

public class InstrucaoTest {
	
	private MaquinaVirtual vm;
		
	@Before
	public void setUp() {
		
		try {
			
			Interpretador.carregar();
			
			Interpretador.setVm(new MaquinaVirtual());
			
			vm = Interpretador.getVm();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RecognitionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (LabelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AcessoIndevidoMemoriaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
	@Test
	public void testarMetodoMain() throws ClassNotFoundException {
		
		SimboloClasse principal = ClassLoader.carregarClasseMain();
		
		SimboloMetodo main = (SimboloMetodo) principal.resolver("main");
		
		vm.iniciarNovoMetodo(main, true);
		
		vm.executarInstrucao();
		
		//executar instruções
		
		vm.setTopoPilha(vm.getTopoPilha() - 1);
		
	}
	
	@Test
    public void teste() throws ClassNotFoundException {
		
		vm.executarInstrucao();
		
	}
		
			

}
