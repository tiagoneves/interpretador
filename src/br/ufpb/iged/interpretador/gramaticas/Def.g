
tree grammar Def;

options {
  tokenVocab=Assembler;
  ASTLabelType=BytecodesAST;
  filter=true;  
}

@header{
    package br.ufpb.iged.interpretador.parser;
    
    import br.ufpb.iged.interpretador.symboltable.classes.BytecodesAST;
    import br.ufpb.iged.interpretador.symboltable.classes.Escopo;
    import br.ufpb.iged.interpretador.symboltable.classes.SimboloClasse;
    import br.ufpb.iged.interpretador.symboltable.classes.SimboloVariavel;
    import br.ufpb.iged.interpretador.symboltable.classes.TabelaSimbolos;
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

bottomup : saiDaClasse
         | getfield
         | putfield
         | invokespecial
         ;
         
entraNaClasse
    :   ^('.class' nome=ID (^(EXTENDS sup=ID))? .)
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
    
saiDaClasse : '.class'
            {
              System.out.println("Saindo da classe.. membros: "+escopoAtual);
              escopoAtual = escopoAtual.obterEscopoEnvolvente();    // pop scope
            }
            ;

getfield 
    : 'getfield'
    {
      System.out.println("Saindo do getfield..");
    }
    ;
    
putfield 
    : 'putfield' 
    {
      System.out.println("Saindo do putfield..");
    }
    ;
    
invokespecial 
    : 'invokespecial' 
    {
      System.out.println("Saindo do invokespecial..");
    }
    ;  
    
     

