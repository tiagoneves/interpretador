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
    import br.ufpb.iged.interpretador.symboltable.classes.EscopoLocal;
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

topdown : entraNoCorpoMetodo
        | entraNoConstrutor
        | entraNoMetodo
        | entraNaClasse
        | parametros
        | declaracaoVariavel
        | operacoesUm
        | operacoesDois
        | outrasOperacoes
        ;

bottomup : saiDoCorpoMetodo
         | saiDoMetodo
         | saiDoConstrutor
         | saiDaClasse
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
    
entraNoConstrutor
	: ^(CONSTR_DECL INIT .+)
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
	
entraNoMetodo
	: ^(METHOD_DECL ID tipoRet =. .+)
	{
	   System.out.println("linha "+$ID.getLine()+
                          ": def method "+$ID.text);
           SimboloMetodo metodo = new SimboloMetodo($ID.text, null, escopoAtual);
           metodo.setRetorno($tipoRet.getText());
           metodo.def = $ID;
           $ID.simbolo = metodo;
           escopoAtual.definir(metodo);
           escopoAtual = metodo;
        }
	;
	
parametros
	: ^(PARAMS pars = .)
	{
	  System.out.println("linha "+$pars.getLine()+": def "+$pars.getText());
          $pars.escopo = escopoAtual;
          SimboloVariavel par = new SimboloVariavel($pars.getText(),null);
          par.def = $pars;            // track AST location of def's ID
          $pars.simbolo = par;         // track in AST
          escopoAtual.definir(par);
	}
	;
		
entraNoCorpoMetodo
    :   BODY {escopoAtual = new EscopoLocal(escopoAtual);} // push scope
    ;
  
operacoesUm
       	:  ^(
       		(   DESVIO 
       		  | LABEL
       		  | ARITMETICA
       		  | LOAD
       		  | STORE
       		  | LOGICA
       		  | PILHA
       		) 
       	        operacao = .
       	    )
       	{
       	   System.out.println("def operacao "+$operacao.getText());
   	   SimboloMetodo metodo = (SimboloMetodo)escopoAtual.obterEscopoEnvolvente();
   	   $operacao.simbolo = metodo;
       	}
       	;
       	
operacoesDois
       	:  ^(
       		(   LOAD 
       		  | STORE
       		  | DESVIO
       		)      		 
       	        operacao = . .
       	    )
       	{
       	   System.out.println("def operacao "+$operacao.getText());
   	   SimboloMetodo metodo = (SimboloMetodo)escopoAtual.obterEscopoEnvolvente();
   	   $operacao.simbolo = metodo;
       	}
       	;
  
outrasOperacoes
	: (   nome = 'getfield' 
	    | nome = 'putfield' 
	    | nome = 'invokespecial' 
	    | nome = 'ireturn' 
	    | nome = 'areturn' 
	    | nome = 'return' 
	    | nome = 'new')
	{
	   System.out.println("def operacao "+$nome.getText());
   	   SimboloMetodo metodo = (SimboloMetodo)escopoAtual.obterEscopoEnvolvente();
   	   $nome.simbolo = metodo;
	}
	;
    
saiDoCorpoMetodo
    :   BODY
        {
        System.out.println("locals: "+escopoAtual);
        escopoAtual = escopoAtual.obterEscopoEnvolvente();    // pop scope
        }
    ;
    
saiDaClasse : '.class'
            {
              System.out.println("Saindo da classe.. membros: "+escopoAtual);
              escopoAtual = escopoAtual.obterEscopoEnvolvente(); // pop scope
            }
            ;
            
saiDoMetodo 
	:  METHOD_DECL
	{
	   System.out.println("Saindo do metodo: "+escopoAtual);
           escopoAtual = escopoAtual.obterEscopoEnvolvente(); // pop scope
	}
	;
	
saiDoConstrutor
	:  CONSTR_DECL
	{
	   System.out.println("Saindo do construtor: "+escopoAtual);
           escopoAtual = escopoAtual.obterEscopoEnvolvente(); // pop scope
	}
	;
