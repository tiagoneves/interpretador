
tree grammar Def;

options {
  //tokenVocab=Bytecodes;
  ASTLabelType=BytecodesAST;
  filter=true;  
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
         
// START: class
entraNaClasse
    :   ^('.class' nome=ID (^(EXTENDS sup=ID))? ^(MEMBRO_CLASSE FIELD_DECL))
        { // def class but leave superclass blank until ref phase
        System.out.println("line "+$nome.getLine()+
                           ": def class "+$nome.text);
        // record scope in AST for next pass
       // if ( $sup!=null ) 
         // $sup.escopo = escopoAtual; 
        SimboloClasse classe = new SimboloClasse($nome.text,escopoAtual,null);
        //classe.def = $nome;           // point from symbol table into AST
        //$nome.simbolo = classe;        // point from AST into symbol table
        escopoAtual.definir(classe);  // def class in current scope
        escopoAtual = classe;        // set current scope to class scope
        }
    ;
// END: class


declaracaoVariavel // global, parameter, or local variable
    :   ^(FIELD_DECL var = ID tipo =.)
        {
        System.out.println("line "+$ID.getLine()+": def "+$ID.text);
        //$var.escopo = escopoAtual;
        SimboloTipoPrimitvo tipoPrimitivo = new SimboloTipoPrimitvo($tipo.getText());       
        SimboloVariavel variavel = new SimboloVariavel($ID.text,tipoPrimitivo);
        //variavel.def = $ID;            // track AST location of def's ID
        //$ID.simbolo = variavel;         // track in AST
        escopoAtual.definir(variavel);
        }
    ;
saiDaClasse : '.class'
            ;