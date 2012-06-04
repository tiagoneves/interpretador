package br.ufpb.iged.interpretador.tradutor.intermediario.principal;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;

import br.ufpb.iged.interpretador.tradutor.intermediario.parser.IntermediarioParser;

public class TradutorIntermediario extends IntermediarioParser{
	
	private static final String ARQUIVO_SAIDA = "bytecodes.txt";
	private File file;
	private FileWriter fileWriter;
	private BufferedWriter bufferedWriter;
	private int nextEnd = 0;
	private Map<String, Integer> variaveisMap = new HashMap<String, Integer>();

	public TradutorIntermediario(TokenStream input) throws IOException {
		
		super(input);
		
		file = new File(ARQUIVO_SAIDA);
		
		if (file.exists())
			
			file.delete();
		
		fileWriter = new FileWriter(file);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
	}
	
	@Override
	protected void adicionarVariavel(Token op) {
		
		variaveisMap.put(op.getText(), nextEnd++);
		
	}

	@Override
	protected void traduzirLoad(Token opc, Token op) {
		
		String opcode = opc.getText();
		
		String toWrite;
		
		if (opcode.equals("READ_INT")) {
			
			toWrite="iload";
			
			String id = op.getText();
			
			Integer endereco = variaveisMap.get(id);
			
			switch(endereco) {
			case 0: toWrite += "_0"; break;
			case 1: toWrite += "_1"; break;
			case 2: toWrite += "_2"; break;
			case 3: toWrite += "_3"; break;
			default: toWrite += " "+endereco; break;
			}
			
		} else {
			
			Integer inteiro = new Integer(op.getText());
			
			if (inteiro > -2 || inteiro < 6) {
				
				toWrite = "iconst";
				
				switch(inteiro) {
				case -1: toWrite += "_m1"; break;
				case 0: toWrite += "_0"; break;
				case 1: toWrite += "1"; break;
				case 2: toWrite += "_2"; break;
				case 3: toWrite += "_3"; break;
				case 4: toWrite += "_4"; break;
				case 5: toWrite += "_5"; break;
				}
				
			} else 
				
				toWrite = "ldc "+inteiro;
			
			
			
		}
		
		//bufferedWriter.write(toWrite+"\n");
		
	}

	@Override
	protected void traduzirStore(Token opc, Token op) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void traduzirArimetica(Token opc) {
		// TODO Auto-generated method stub
		
	}
	
	
	public void fecharArquivoSaida() throws IOException {
		
		bufferedWriter.close();
		
		fileWriter.close();
		
	}

}
