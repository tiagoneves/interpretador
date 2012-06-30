
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
           System.out.println("linha "+$nome.getLine()+
                          ": def class "+$nome.text);
           if ( $sup!=null ) 
             $sup.escopo = escopoAtual; 
           SimboloClasse classe = new SimboloClasse($nome.text,escopoAtual,null);
           classe.def = $nome;
           $nome.simbolo = classe;
           escopoAtual.definir(classe);  
           escopoAtual = classe;  
        }
    ;

declaracaoVariavel
    :   ^(FIELD_DECL ID tipo =.)
        {
          System.out.println("linha "+$ID.getLine()+": def "+$ID.text);
          $tipo.escopo = escopoAtual;      
          SimboloVariavel variavel = new SimboloVariavel($ID.text,null);
          variavel.def = $ID;
          $ID.simbolo = variavel;
          escopoAtual.definir(variavel);
        }
    ;
saiDaClasse : CLASSE
            {
              System.out.println("Saindo da classe.. membros: "+escopoAtual);
              escopoAtual = escopoAtual.obterEscopoEnvolvente();    // pop scope
            }
            ;