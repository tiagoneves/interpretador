tree grammar Ref;

options {
  //tokenVocab = Bytecodes;
  ASTLabelType = BytecodesAST;
  filter = true;
}

@header{
    package br.ufpb.iged.interpretador.symboltable.parser;
    
    import br.ufpb.iged.interpretador.symboltable.classes.Escopo;
    import br.ufpb.iged.interpretador.symboltable.classes.BytecodesAST;
    import br.ufpb.iged.interpretador.symboltable.classes.SimboloClasse;
    import br.ufpb.iged.interpretador.symboltable.classes.TabelaSimbolos;
    import br.ufpb.iged.interpretador.symboltable.classes.Tipo;
}

@members {
    TabelaSimbolos tabelaSimbolos;
    SimboloClasse simboloClasse;
    public Ref(TreeNodeStream input, TabelaSimbolos tabelaSimbolos) {
        this(input);
        this.tabelaSimbolos = tabelaSimbolos;
    }
    
    public Tipo resolverTipo(String nomeTipo) {
    
      return (Tipo)simboloClasse.resolver(nomeTipo);
    
    }
    
}

topdown
    : entraNaClasse
    | declaracaoVariavel
    | getfield
    | putfield
    | invokespecial
    ;
    
entraNaClasse
    :   ^(CLASSE nome=ID (^(EXTENDS sup=ID))? .)
        {
          simboloClasse = ((SimboloClasse)$nome.simbolo);
          if ( $sup!=null ) {
              // look up superclass (if any)
              $sup.simbolo = $sup.escopo.resolver($sup.text);
              simboloClasse.superClasse =
                  (SimboloClasse)$sup.simbolo;
                  System.out.println("linha "+$nome.getLine()+": set "+$nome.text+
                  " super to "+((SimboloClasse)$nome.simbolo).superClasse.nome);
           }
           else {
              System.out.println("linha "+$nome.getLine()+": set "+$nome.text);
           }
        }
    ;
    
declaracaoVariavel // global, parameter, or local variable
    :   ^(FIELD_DECL ID tip =.)
        {
           $ID.simbolo.tipo = resolverTipo($tip.getText());
          //$ID.simbolo.tipo = $tip.tsimb; // set return type of variable
          System.out.println("linha "+$ID.getLine()+": set var type "+$ID.simbolo);
        }
    ;
    
getfield 
    : ^(GETFIELD classe = . . campo = . tipo = .)
    {
      System.out.println("Entrando no getfield..");
    }
    ;
    
putfield 
    : ^(PUTFIELD classe = . . campo = . tipo = .)
    {
      System.out.println("Entrando no putfield..");
    }
    ;
    
invokespecial 
    : ^(INVOKESPECIAL classe = . . metodo = . args = . tipo = .)
    {
      System.out.println("Entrando no invokespecial..");
    }
    ;
   