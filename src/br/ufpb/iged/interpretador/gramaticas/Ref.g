tree grammar Ref;

options {
  //tokenVocab = Bytecodes;
  ASTLabelType = BytecodesAST;
  filter = true;
}

@members {
    TabelaSimbolos tabelaSimbolos;
    public Ref(TreeNodeStream input, TabelaSimbolos tabelaSimbolos) {
        this(input);
        this.tabelaSimbolos = tabelaSimbolos;
    }
    
}

topdown
    :   entraNaClasse
    |   declaracaoVariavel
    ;

entraNaClasse
    :   ^(CLASSE nome=ID (^(EXTENDS sup=ID))? .)
        {
          if ( $sup!=null ) {
              // look up superclass (if any)
              $sup.simbolo = $sup.escopo.resolver($sup.text);
              ((SimboloClasse)$nome.simbolo).superClasse =
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
    :   ^(FIELD_DECL ID tipo =.)
        {
          $ID.simbolo.tipo = $tipo.tsym; // set return type of variable
          System.out.println("linha "+$ID.getLine()+": set var type "+$ID.simbolo);
        }
    ;
    
tipo returns [Tipo tsym]
@init {
    // get scope from AST; use to resolve type name and save it in AST
    $start.simbolo = $start.escopo.resolver($start.getText());
    $tsym = (Tipo)$start.simbolo; // return Type from this rule
}
    :   'I'
    |   ID // struct name
    ;