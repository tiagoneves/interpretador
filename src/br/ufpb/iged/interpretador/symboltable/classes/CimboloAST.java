package br.ufpb.iged.interpretador.symboltable.classes;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.Token;

public class CimboloAST extends CommonTree {
	
    public Escopo scope;   // set by Def.g; ID lives in which scope?
    
    public Simbolo symbol; // set by Ref.g; point at def in symbol table 
    
    public CimboloAST(Token t) { 
    	super(t); 
    }
    
}
