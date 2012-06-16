package br.ufpb.iged.interpretador.testes;

import org.antlr.runtime.*;

import br.ufpb.iged.interpretador.bytecodeassembler.asm.BytecodeAssembler;
import br.ufpb.iged.interpretador.bytecodeassembler.asm.Definicao;
import br.ufpb.iged.interpretador.bytecodeassembler.parser.BytecodesLexer;
import br.ufpb.iged.interpretador.bytecodeassembler.parser.BytecodesParser;

public class Test {

    public static void main(String[] args) throws Exception {
    
       CharStream entrada = new ANTLRFileStream("entrada.txt");
        
       BytecodesLexer lexer = new BytecodesLexer(entrada);
        
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        BytecodesParser parser = new BytecodeAssembler(tokens, Definicao.instrucoes);
        parser.programa();
        
        for (int i = 0; i < BytecodeAssembler.codigo.length ; i++) {
        
         System.out.print(BytecodeAssembler.codigo[i] + " ");
        
        }
        
        
    }
    
}
