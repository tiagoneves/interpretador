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
    :   ^('.class' nome=ID (^(EXTENDS sup=ID))? ^(MEMBRO_CLASSE .*))
        {
        if ( $sup!=null ) {
            // look up superclass (if any)
            $sup.simbolo = $sup.escopo.resolver($sup.text);
            ((SimboloClasse)$nome.simbolo).superClasse =
                (SimboloClasse)$sup.simbolo;                // set superclass
            System.out.println("line "+$nome.getLine()+": set "+$nome.text+
                " super to "+((SimboloClasse)$nome.simbolo).superClasse.nome);
        }
        else {
            System.out.println("line "+$nome.getLine()+": set "+$nome.text);
        }
        }
    ;
    
declaracaoVariavel // global, parameter, or local variable
    :   ^((FIELD_DECL) tipo ID .?)
        {
        $ID.simbolo.tipo = $tipo.tsym; // set return type of variable
        System.out.println("line "+$ID.getLine()+": set var type "+$ID.simbolo);
        }
    ;
    
tipo returns [Tipo tsym]
@init {
    // get scope from AST; use to resolve type name and save it in AST
    $start.simbolo = $start.escopo.resolver($start.getText());
    $tsym = (Tipo)$start.simbolo; // return Type from this rule
}
    :   'int'
    |   ID // struct name
    ;