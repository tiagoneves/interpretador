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
    import br.ufpb.iged.interpretador.symboltable.classes.SimboloMetodo;
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
        | entraNoMetodoInit
        | entraNoMetodoSemParams
        | entraNoMetodoComParams
        ;

bottomup : saiDaClasse
	 | saiDoMetodo
         | getfield
         | putfield
         | invokespecial
         ;
         
entraNaClasse
    : ^('.class' nome=ID (^(EXTENDS sup=TIPO_REF))? .)
        {
           System.out.println("linha "+$nome.getLine()+
                          ": def class "+$nome.text);
           if ( $sup!=null )
             $sup.escopo = escopoAtual;
           SimboloClasse classe = new SimboloClasse("L" + $nome.text,escopoAtual,null);
           classe.def = $nome;
           $nome.simbolo = classe;
           escopoAtual.definir(classe);
           escopoAtual = classe;
        }
    ;

declaracaoVariavel
    : ^(FIELD_DECL ID tipo =.)
        {
          System.out.println("linha "+$ID.getLine()+": def "+$ID.text);
          $tipo.escopo = escopoAtual;
          SimboloVariavel variavel = new SimboloVariavel($ID.text,null);
          variavel.def = $ID;
          $ID.simbolo = variavel;
          escopoAtual.definir(variavel);
          ((SimboloClasse)escopoAtual).getConstantPool().add(variavel);
        }
    ;
    
entraNoMetodoInit
	: ^(METHOD_DECL INIT BODY)
	{
	   System.out.println("linha "+$INIT.getLine()+
                          ": def method init ");
           SimboloMetodo metodo = new SimboloMetodo("init", null, escopoAtual);
           metodo.def = $INIT;
           $INIT.simbolo = metodo;
           escopoAtual.definir(metodo);
           escopoAtual = metodo;
        }
	;

entraNoMetodoSemParams
	: ^(METHOD_DECL ID BODY tipoRet =.)
	{
	   System.out.println("linha "+$ID.getLine()+
                          ": def method "+$ID.text);
           SimboloMetodo metodo = new SimboloMetodo($ID.text+"()"+$tipoRet.getText(), null, escopoAtual);
           metodo.def = $ID;
           $ID.simbolo = metodo;
           escopoAtual.definir(metodo);
           escopoAtual = metodo;
        }
	;

entraNoMetodoComParams
	: ^(METHOD_DECL ID params =. BODY tipoRet =.)
	{
	   System.out.println("linha "+$ID.getLine()+
                          ": def method "+$ID.text);
           SimboloMetodo metodo = new SimboloMetodo($ID.text+"("+params+")"+$tipoRet.getText(), null, escopoAtual);
           metodo.def = $ID;
           $ID.simbolo = metodo;
           escopoAtual.definir(metodo);
           escopoAtual = metodo;
        }
	;
    
saiDaClasse : '.end class'
            {
              System.out.println("Saindo da classe.. membros: "+escopoAtual);
              escopoAtual = escopoAtual.obterEscopoEnvolvente(); // pop scope
            }
            ;
            
saiDoMetodo 
	:  '.end method'
	{
	   System.out.println("Saindo do metodo: "+escopoAtual);
           escopoAtual = escopoAtual.obterEscopoEnvolvente(); // pop scope
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
    
     

