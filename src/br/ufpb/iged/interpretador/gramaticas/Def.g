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
    int contador;
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
        | field
        | invoke
        | nenhumoperando
        | umoperando
        | label
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
	: ^(CONSTR_DECL INIT .+ (^(LIMIT lim=INTEIRO))?)
	{
	   System.out.println("linha "+$INIT.getLine()+
                          ": def method init ");
           SimboloMetodo metodo = new SimboloMetodo($INIT.text, null, escopoAtual);
           if (lim != null)
           	metodo.setTamanhoMemoriaLocal(new Integer(lim.getText()));
           metodo.def = $INIT;
           $INIT.simbolo = metodo;
           escopoAtual.definir(metodo);
           escopoAtual = metodo;
           contador = 0;
        }
	;
	
entraNoMetodo
	: ^(METHOD_DECL ID tipoRet =. .+ (^(LIMIT lim=INTEIRO))?)
	{
	   System.out.println("linha "+$ID.getLine()+
                          ": def method "+$ID.text);
           SimboloMetodo metodo = new SimboloMetodo($ID.text, null, escopoAtual);
           if (lim != null)
           	metodo.setTamanhoMemoriaLocal(new Integer(lim.getText()));
           metodo.setRetorno($tipoRet.getText());
           metodo.def = $ID;
           $ID.simbolo = metodo;
           escopoAtual.definir(metodo);
           escopoAtual = metodo;
           contador = 0;
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
	
field	: ^((a = 'getfield' | a = 'getstatic' | a = 'putfield' | a = 'putstatic') . . . .)
        {
           if ($a.equals("getstatic") || $a.equals("putstatic"))
           	contador += 9;
           else
              contador += 5;
        }
        ;
        
invoke 	: ^(('invokespecial' | 'invokestatic' | 'invokevirtual') . ^(METHOD_CALL . ^(ARGS .) .))
        {
          contador += 9;
        }
        ;
        
nenhumoperando 
	: ^((RETURN | ARITMETICA | NEW | LOAD | STORE | LOGICA | PILHA) . )
	{
	   contador++;
	}	
	;
	
umoperando
        : ^((DESVIO | LOAD | STORE) . .)
        {
          contador += 5;
        }
        ;       
label
   : ^(LABEL id = .)
   {
      System.out.println("Definindo label "+id.getText()+" no endereço "+contador);
      SimboloMetodo metodo = (SimboloMetodo) escopoAtual.obterEscopoEnvolvente();
      metodo.definirLabel($id.token, contador);
   }
   ;       