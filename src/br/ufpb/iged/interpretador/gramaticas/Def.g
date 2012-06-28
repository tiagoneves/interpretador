
tree grammar Def;

options {
  //tokenVocab=Bytecodes;
  ASTLabelType=BytecodesAST;
  filter=true;  
}

@header{
    package br.ufpb.iged.interpretador.symboltable.parser;
}

@members {
    TabelaSimbolos tabelaSimbolos;
    Escopo escopoAtual;
    public Def(TreeNodeStream input, TabelaSimbolos tabelaSimbolos) {
        this(input);
        this.tabelaSimbolos = tabelaSimbolos;
        escopoAtual = tabelaSimbolos.global;
    }
}

topdown : entraNaClasse
        | declaracaoVariavel
        ;

bottomup : saiDaClasse;
         
entraNaClasse
    :   ^(CLASSE nome=ID (^(EXTENDS sup=ID))? .)
        { 
        System.out.println("line "+$nome.getLine()+
                           ": def class "+$nome.text);
        if ( $sup!=null ) 
          $sup.escopo = escopoAtual; 
        SimboloClasse classe = new SimboloClasse($nome.text,escopoAtual,null);
        escopoAtual.definir(classe);  
        escopoAtual = classe;  
        }
    ;

declaracaoVariavel
    :   ^(FIELD_DECL ID tipo =.)
        {
        System.out.println("line "+$ID.getLine()+": def "+$ID.text);
        SimboloTipoPrimitvo tipoPrimitivo = new SimboloTipoPrimitvo($tipo.getText());       
        SimboloVariavel variavel = new SimboloVariavel($ID.text,tipoPrimitivo);
        escopoAtual.definir(variavel);
        }
    ;
saiDaClasse : CLASSE
            ;