package br.ufpb.iged.interpretador.symboltable.classes;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.Token;

public class BytecodesAST extends CommonTree {
	
    public Escopo scope;   // set by Def.g; ID lives in which scope?
    
    public Simbolo symbol; // set by Ref.g; point at def in symbol table 
    
    public BytecodesAST(Token t) { 
    	super(t); 
    }
    
}
