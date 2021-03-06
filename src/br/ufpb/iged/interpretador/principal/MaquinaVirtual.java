package br.ufpb.iged.interpretador.principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.ufpb.iged.interpretador.bytecodeassembler.asm.Definicao;
import br.ufpb.iged.interpretador.excecoes.ClassNotFoundException;
import br.ufpb.iged.interpretador.symboltable.classes.SimboloClasse;
import br.ufpb.iged.interpretador.symboltable.classes.SimboloMetodo;

public class MaquinaVirtual {
	
	public static final int TAMANHO_PILHA = 100;
	
	private StackFrame[] pilha = new StackFrame[TAMANHO_PILHA];
	
	private StackFrame frameAtual;
	
	private int topoPilha = -1;
		
	public List<Objeto> heap = new ArrayList<Objeto>();
	
	private List<SimboloClasse> areaClasses = new ArrayList<SimboloClasse>();
	
	private int op1, op2;

	private short opcode;

	private boolean desvio = false;
	
	private int tamanhoCodigo;
	
	private Scanner in = new Scanner(System.in);
	
	public MaquinaVirtual(List<SimboloClasse> areaClasses) {
		
		setAreaClasses(areaClasses);
		
	}
		
	public void cpu() throws ClassNotFoundException {
		

		while (frameAtual.pc.getInstrucao() < tamanhoCodigo && topoPilha > -1) {
				
			if (!desvio)

				frameAtual.pc.incrementar();

			executarInstrucao();
				 
			exibirTela(frameAtual);
				 
		}
										
		
	}
	
	public void executarInstrucao() throws ClassNotFoundException {
		
		desvio = false;

		opcode = frameAtual.pc.obterOpcode();

		if (opcode < 0)

			opcode = valorEmByte(opcode);

		switch (opcode) {

		// opera��es de pilha

		case Definicao.NOP:
			;
			break;

		case Definicao.POP:
			frameAtual.sp-- ;
			break;

		case Definicao.POP2:
			frameAtual.sp -= 2 ;
			break;

		case Definicao.DUP: {
			
			Object valor = frameAtual.pilhaOperandos[frameAtual.sp];
			
			frameAtual.pilhaOperandos[++frameAtual.sp] = null;
			
			frameAtual.pilhaOperandos[frameAtual.sp] = valor;

		}
		;
		break;

		// opera��es aritm�ticas

		case Definicao.INEG: {

			op1 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp];

			frameAtual.pilhaOperandos[frameAtual.sp] = 0 - op1;

		};
		break;

		case Definicao.IADD: {

			op1 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp - 1];

			op2 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp];

			frameAtual.sp--;

			frameAtual.pilhaOperandos[frameAtual.sp] = op1 + op2;

		}
		;
		break;

		case Definicao.ISUB: {

			op1 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp - 1];

			op2 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp];

			frameAtual.sp--;

			frameAtual.pilhaOperandos[frameAtual.sp] = op1 - op2;

		}
		;
		break;

		case Definicao.IMUL: {

			op1 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp - 1];

			op2 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp];

			frameAtual.sp--;

			frameAtual.pilhaOperandos[frameAtual.sp] = op1 * op2;

		}
		;
		break;

		case Definicao.IDIV: {

			op1 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp - 1];

			op2 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp];

			frameAtual.sp--;

			frameAtual.pilhaOperandos[frameAtual.sp] = op1 / op2;

		}
		;
		break;

		case Definicao.IREM: {

			op1 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp - 1];

			op2 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp];

			frameAtual.sp--;

			frameAtual.pilhaOperandos[frameAtual.sp] = op1 % op2;

		}
		;
		break;

		case Definicao.IINC: {

			op1 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp];

			frameAtual.pilhaOperandos[frameAtual.sp] = ++op1;

		}
		;
		break;

		// opera��es de empilhamento de constantes

		case Definicao.ICONST0: {

			frameAtual.sp++;

			frameAtual.pilhaOperandos[frameAtual.sp] = 0;

		}
		;
		break;

		case Definicao.ICONST1: {

			frameAtual.sp++;

			frameAtual.pilhaOperandos[frameAtual.sp] = 1;

		}
		;
		break;

		case Definicao.ICONST2: {

			frameAtual.sp++;

			frameAtual.pilhaOperandos[frameAtual.sp] = 2;

		}
		;
		break;

		case Definicao.ICONST3: {

			frameAtual.sp++;

			frameAtual.pilhaOperandos[frameAtual.sp] = 3;

		}
		;
		break;

		case Definicao.ICONST4: {

			frameAtual.sp++;

			frameAtual.pilhaOperandos[frameAtual.sp] = 4;

		}
		;
		break;

		case Definicao.ICONST5: {

			frameAtual.sp++;

			frameAtual.pilhaOperandos[frameAtual.sp] = 5;

		}
		;
		break;

		case Definicao.ICONSTM1: {

			frameAtual.sp++;

			frameAtual.pilhaOperandos[frameAtual.sp] = -1;

		}
		;
		break;

		case Definicao.ACONSTNULL: {

			frameAtual.sp++;

			frameAtual.pilhaOperandos[frameAtual.sp] = new Referencia(null);

		}
		;
		break;

		case Definicao.LDC: {

			frameAtual.sp++;

			op1 = frameAtual.pc.obterOperandoInteiro();

			frameAtual.pilhaOperandos[frameAtual.sp] = op1;

		}
		;
		break;

		// opera��es de load

		case Definicao.ILOAD0: {

			frameAtual.sp++;

			frameAtual.pilhaOperandos[frameAtual.sp] = frameAtual.variaveis[0];

		}
		;
		break;

		case Definicao.ILOAD1: {

			frameAtual.sp++;

			frameAtual.pilhaOperandos[frameAtual.sp] = frameAtual.variaveis[1];

		}
		;
		break;

		case Definicao.ILOAD2: {

			frameAtual.sp++;

			frameAtual.pilhaOperandos[frameAtual.sp] = frameAtual.variaveis[2];

		}
		;
		break;

		case Definicao.ILOAD3: {

			frameAtual.sp++;

			frameAtual.pilhaOperandos[frameAtual.sp] = frameAtual.variaveis[3];

		}
		;
		break;

		case Definicao.ILOAD: {

			frameAtual.sp++;

			op1 = frameAtual.pc.obterOperandoInteiro();

			frameAtual.pilhaOperandos[frameAtual.sp] = frameAtual.variaveis[op1];

		}
		;
		break;

		case Definicao.ALOAD0: {

			frameAtual.sp++;

			frameAtual.pilhaOperandos[frameAtual.sp] = frameAtual.variaveis[0];

		}
		;
		break;

		case Definicao.ALOAD1: {

			frameAtual.sp++;

			frameAtual.pilhaOperandos[frameAtual.sp] = frameAtual.variaveis[1];

		}
		;
		break;

		case Definicao.ALOAD2: {

			frameAtual.sp++;

			frameAtual.pilhaOperandos[frameAtual.sp] = frameAtual.variaveis[2];

		}
		;
		break;

		case Definicao.ALOAD3: {

			frameAtual.sp++;

			frameAtual.pilhaOperandos[frameAtual.sp] = frameAtual.variaveis[3];

		}
		;
		break;

		case Definicao.ALOAD: {

			frameAtual.sp++;

			op1 = frameAtual.pc.obterOperandoInteiro();

			frameAtual.pilhaOperandos[frameAtual.sp] = frameAtual.variaveis[op1];

		}
		;
		break;


		// opera��es de store

		case Definicao.ISTORE0: {

			frameAtual.variaveis[0] = frameAtual.pilhaOperandos[frameAtual.sp];

			frameAtual.sp--;

		}
		;
		break;

		case Definicao.ISTORE1: {

			frameAtual.variaveis[1] = frameAtual.pilhaOperandos[frameAtual.sp];

			frameAtual.sp--;

		}
		;
		break;

		case Definicao.ISTORE2: {

			frameAtual.variaveis[2] = frameAtual.pilhaOperandos[frameAtual.sp];

			frameAtual.sp--;

		}
		;
		break;

		case Definicao.ISTORE3: {

			frameAtual.variaveis[3] = frameAtual.pilhaOperandos[frameAtual.sp];

			frameAtual.sp--;

		}
		;
		break;

		case Definicao.ISTORE: {

			op1 = frameAtual.pc.obterOperandoInteiro();

			frameAtual.variaveis[op1] = frameAtual.pilhaOperandos[frameAtual.sp];

			frameAtual.sp--;

		}
		;
		break;

		case Definicao.ASTORE0: {

			frameAtual.variaveis[0] = frameAtual.pilhaOperandos[frameAtual.sp];

			frameAtual.sp--;

		}
		;
		break;

		case Definicao.ASTORE1: {

			frameAtual.variaveis[1] = frameAtual.pilhaOperandos[frameAtual.sp];

			frameAtual.sp--;

		}
		;
		break;

		case Definicao.ASTORE2: {

			frameAtual.variaveis[2] = frameAtual.pilhaOperandos[frameAtual.sp];

			frameAtual.sp--;

		}
		;
		break;

		case Definicao.ASTORE3: {

			frameAtual.variaveis[3] = frameAtual.pilhaOperandos[frameAtual.sp];

			frameAtual.sp--;

		}
		;
		break;

		case Definicao.ASTORE: {

			op1 = frameAtual.pc.obterOperandoInteiro();

			frameAtual.variaveis[op1] = frameAtual.pilhaOperandos[frameAtual.sp];

			frameAtual.sp--;

		}
		;
		break;

		// opera��es l�gicas

		case Definicao.IAND: {

			op1 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp - 1];

			op2 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp];

			op1 = op1 & op2;

			frameAtual.sp--;

		}
		;
		break;

		case Definicao.IOR: {

			op1 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp - 1];

			op2 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp];

			op1 = op1 | op2;

			frameAtual.sp--;

		}
		;
		break;

		case Definicao.IXOR: {

			op1 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp - 1];

			op2 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp];

			op1 = op1 ^ op2;

			frameAtual.sp--;

		}
		;
		break;

		// opera��es de desvio condicional

		case Definicao.IFEQ: {

			op1 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp];

			if (op1 == 0) {

				desviar(frameAtual);

				desvio = true;

			} else {

				frameAtual.pilhaOperandos[frameAtual.sp] = 0;

				frameAtual.pc.pularOperando();

			}

		}
		;
		break;

		case Definicao.IFNE: {

			op1 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp];

			if (op1 != 0) {

				desviar(frameAtual);

				desvio = true;

			} else {

				frameAtual.pilhaOperandos[frameAtual.sp] = 0;

				frameAtual.pc.pularOperando();

			}

		}
		;
		break;

		case Definicao.IFLT: {

			op1 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp];

			if (op1 > 0) {

				desviar(frameAtual);

				desvio = true;

			} else {

				frameAtual.pilhaOperandos[frameAtual.sp] = 0;

				frameAtual.pc.pularOperando();

			}

		}
		;
		break;

		case Definicao.IFGE: {

			op1 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp];

			if (op1 >= 0) {

				desviar(frameAtual);

				desvio = true;

			} else {

				frameAtual.pilhaOperandos[frameAtual.sp] = 0;

				frameAtual.pc.pularOperando();

			}

		}
		;
		break;

		case Definicao.IFGT: {

			op1 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp];

			if (op1 > 0) {

				desviar(frameAtual);

				desvio = true;

			} else {

				frameAtual.pilhaOperandos[frameAtual.sp] = 0;

				frameAtual.pc.pularOperando();

			}

		}
		;
		break;

		case Definicao.IFLE: {

			op1 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp];

			if (op1 <= 0) {

				desviar(frameAtual);

				desvio = true;

			} else {

				frameAtual.pilhaOperandos[frameAtual.sp] = 0;

				frameAtual.pc.pularOperando();

			}

		}
		;
		break;

		case Definicao.IF_ICMPEQ: {

			op1 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp - 1];

			op2 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp];

			frameAtual.sp--;

			if (op1 == op2) {

				desviar(frameAtual);

				desvio = true;

			} else {

				frameAtual.pilhaOperandos[frameAtual.sp] = 0;

				frameAtual.pc.pularOperando();

			}

		}
		;
		break;

		case Definicao.IF_ICMPNE: {

			op1 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp - 1];

			op2 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp];

			frameAtual.sp--;

			if (op1 != op2) {

				desviar(frameAtual);

				desvio = true;

			} else {

				frameAtual.pilhaOperandos[frameAtual.sp] = 0;

				frameAtual.pc.pularOperando();

			}

		}
		;
		break;

		case Definicao.IF_ICMPLT: {

			op1 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp - 1];

			op2 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp];

			frameAtual.sp--;

			if (op1 < op2) {

				desviar(frameAtual);

				desvio = true;

			} else {

				frameAtual.pilhaOperandos[frameAtual.sp] = 0;

				frameAtual.pc.pularOperando();

			}

		}
		;
		break;

		case Definicao.IF_ICMPGE: {

			op1 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp - 1];

			op2 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp];

			frameAtual.sp--;

			if (op1 >= op2) {

				desviar(frameAtual);

				desvio = true;

			} else {

				frameAtual.pilhaOperandos[frameAtual.sp] = 0;

				frameAtual.pc.pularOperando();

			}

		}
		;
		break;

		case Definicao.IF_ICMPGT: {

			op1 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp - 1];

			op2 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp];

			frameAtual.sp--;

			if (op1 > op2) {

				desviar(frameAtual);

				desvio = true;

			} else {

				frameAtual.pilhaOperandos[frameAtual.sp] = 0;

				frameAtual.pc.pularOperando();

			}

		}
		;
		break;

		case Definicao.IF_ICMPLE: {

			op1 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp - 1];

			op2 = (Integer) frameAtual.pilhaOperandos[frameAtual.sp];

			frameAtual.sp--;

			if (op1 <= op2) {

				desviar(frameAtual);

				desvio = true;

			} else {

				frameAtual.pilhaOperandos[frameAtual.sp] = 0;

				frameAtual.pc.pularOperando();

			}

		}
		;
		break;

		// desvio incondicional
		case Definicao.GOTO: {

			op1 = frameAtual.pc.obterOperandoInteiro();

			frameAtual.pc.jumpTo(op1);

			desvio = true;

		}
		;
		break;

		//manipula��o de objetos

		case Definicao.NEW: {

			op1 = frameAtual.pc.obterOperandoInteiro();

			SimboloClasse simboloClasse = ClassLoader.carregarClasse(op1);
			
			Objeto objeto = new Objeto(simboloClasse);

			heap.add(objeto);

			frameAtual.pilhaOperandos[++frameAtual.sp] = new Referencia(heap.indexOf(objeto));

		}

		;
		break;
		
		case Definicao.INVOKEVIRTUAL: {
			
			op1 = frameAtual.pc.obterOperandoInteiro();
			
			op2 = frameAtual.pc.obterOperandoInteiro();
			
			SimboloClasse simboloClasse = ClassLoader.carregarClasse(op1);
			
			SimboloMetodo simboloMetodo = (SimboloMetodo) simboloClasse.getMethodArea().get(op2);
			
			iniciarNovoMetodo(simboloMetodo, false);
		}
		
		;
		break;

		case Definicao.INVOKESPECIAL: {

			op1 = frameAtual.pc.obterOperandoInteiro();
			
			op2 = frameAtual.pc.obterOperandoInteiro();
			
			SimboloClasse simboloClasse = ClassLoader.carregarClasse(op1);
			
			SimboloMetodo simboloMetodo = (SimboloMetodo) simboloClasse.getMethodArea().get(op2);
			
			iniciarNovoMetodo(simboloMetodo, false);			

		}

		;
		break;

		case Definicao.GETFIELD: {

			Referencia referencia = (Referencia)frameAtual.pilhaOperandos[frameAtual.sp];

			Objeto objeto = heap.get(referencia.getEndereco());

			op1 = frameAtual.pc.obterOperandoInteiro();

			frameAtual.pilhaOperandos[frameAtual.sp] = null;

			frameAtual.pilhaOperandos[frameAtual.sp] = objeto.getMemoriaLocal()[op1];

		}

		;
		break;

		case Definicao.PUTFIELD: {

			Referencia referencia = (Referencia)frameAtual.pilhaOperandos[frameAtual.sp - 1];

			Objeto objeto = heap.get(referencia.getEndereco());

			op1 = frameAtual.pc.obterOperandoInteiro();

			objeto.getMemoriaLocal()[op1] = frameAtual.pilhaOperandos[frameAtual.sp--];

		}

		;
		break;
		
		//m�todos e vari�veis est�ticas
		
		case Definicao.INVOKESTATIC: {
			
			op1 = frameAtual.pc.obterOperandoInteiro();
			
			op2 = frameAtual.pc.obterOperandoInteiro();
			
			SimboloClasse simboloClasse =  ClassLoader.carregarClasse(op1);
			
			SimboloMetodo simboloMetodo = (SimboloMetodo) simboloClasse.getMethodArea().get(op2);
			
			iniciarNovoMetodo(simboloMetodo, true);			
			
		}
		
		;
		break;
		
		case Definicao.GETSTATIC: {
			
			op1 = frameAtual.pc.obterOperandoInteiro();
			
			op2 = frameAtual.pc.obterOperandoInteiro();
			
			SimboloClasse simboloClasse =  ClassLoader.carregarClasse(op1);
			
			frameAtual.pilhaOperandos[frameAtual.sp] = null;
			
			frameAtual.pilhaOperandos[frameAtual.sp] = simboloClasse.getFields()[op2];
			
		}
		
		;
		break;
		
		case Definicao.PUTSTATIC: {
			
			op1 = frameAtual.pc.obterOperandoInteiro();
			
			op2 = frameAtual.pc.obterOperandoInteiro();
			
			SimboloClasse simboloClasse =  ClassLoader.carregarClasse(op1);
			
			simboloClasse.alterarCampo(op2, frameAtual.pilhaOperandos[frameAtual.sp--]);
									
		}
		
		;
		break;
		
		//retorno de m�todos
		case Definicao.RETURN: {
			
			topoPilha--;
			
			if (topoPilha > -1)
			
				frameAtual = pilha[topoPilha];
			
		}
		
		;
		break;
		
		case Definicao.IRETURN: {
			
			Integer valor = (Integer) frameAtual.pilhaOperandos[frameAtual.sp];
			
			frameAtual = pilha[--topoPilha];
			
			frameAtual.pilhaOperandos[frameAtual.sp] = valor;
			
		}
		
		;
		break;
		
		case Definicao.ARETURN: {
			
			Referencia valor = (Referencia) frameAtual.pilhaOperandos[frameAtual.sp];
			
			frameAtual = pilha[--topoPilha];
			
			frameAtual.pilhaOperandos[frameAtual.sp] = valor;
			
		}
		
		;
		break;

		}
		
	}
	
	public void iniciarNovoMetodo(SimboloMetodo metodo, boolean estatico) {
		
		pilha[++topoPilha] =  new StackFrame(metodo.getTamanhoMemoriaLocal(), estatico);
		
		pilha[topoPilha].pc = new ProgramCounter(metodo);
		
		tamanhoCodigo = metodo.obterTamanhoCodigo();
		
		frameAtual = pilha[topoPilha];
		
		int i;
		
		int qtdParams = metodo.contarParametros();
		
		Object obj;
		
		for (i = 0; i < qtdParams; i++) {
			obj = pilha[topoPilha - 1].pilhaOperandos[pilha[topoPilha - 1].sp - i];
			frameAtual.inserirValorParametro(obj);
			
		}
		
		if (!estatico)
		
			frameAtual.inserirThis(pilha[topoPilha - 1].pilhaOperandos[pilha[topoPilha - 1].sp - i]);
				
		tamanhoCodigo = frameAtual.pc.getSimboloMetodo().obterTamanhoCodigo();
		
	}
	
	protected void desviar(StackFrame frame) {

		frame.pilhaOperandos[frame.sp] = 1;

		int op = frame.pc.obterOperandoInteiro();

		frame.pc.jumpTo(op);

	}
	
	protected short valorEmByte(short a) {

		return (short) (128 + (128 + a));

	}
	
	protected void exibirTela(StackFrame frame) {

		int i;

		System.out.println("frameAtual.pc: " + frame.pc);

		System.out.println("frameAtual.sp: " + frame.sp);

		System.out.print("Mem�ria do c�digo: ");

		for (i = 0; i < frame.pc.getSimboloMetodo().getCodigo().length; i++)

			System.out.print(frame.pc.getSimboloMetodo().getCodigo()[i] + " ");

		System.out.print("\n");

		System.out.print("Mem�ria das vari�veis: ");

		for (i = 0; i < frame.variaveis.length; i++)

			System.out.print(frame.variaveis[i] + " ");

		System.out.print("\n");

		System.out.print("Pilha: ");

		for (i = 0; i < frame.pilhaOperandos.length; i++)

			System.out.print(frame.pilhaOperandos[i] + " ");

		System.out.print("\n\n");

		System.out
				.print("Pressione qualquer tecla para ir para a pr�xima instru��o: ");

		in.next();


	}

	public StackFrame getFrameAtual() {
		return frameAtual;
	}

	public void setFrameAtual(StackFrame frameAtual) {
		this.frameAtual = frameAtual;
	}

	public StackFrame[] getPilha() {
		return pilha;
	}

	public void setPilha(StackFrame[] pilha) {
		this.pilha = pilha;
	}

	public int getTopoPilha() {
		return topoPilha;
	}

	public void setTopoPilha(int topoPilha) {
		this.topoPilha = topoPilha;
	}

	public int getTamanhoCodigo() {
		return tamanhoCodigo;
	}

	public void setTamanhoCodigo(int tamanhoCodigo) {
		this.tamanhoCodigo = tamanhoCodigo;
	}

	public List<SimboloClasse> getAreaClasses() {
		return areaClasses;
	}

	public void setAreaClasses(List<SimboloClasse> areaClasses) {
		this.areaClasses = areaClasses;
	}
	

}
