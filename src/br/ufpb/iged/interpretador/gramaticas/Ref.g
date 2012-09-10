tree grammar Ref;

options {
  tokenVocab = Assembler;
  ASTLabelType = BytecodesAST;
  filter = true;
}

@header{
    package br.ufpb.iged.interpretador.parser;
    
    import br.ufpb.iged.interpretador.symboltable.classes.Escopo;
    import br.ufpb.iged.interpretador.symboltable.classes.BytecodesAST;
    import br.ufpb.iged.interpretador.symboltable.classes.SimboloClasse;
    import br.ufpb.iged.interpretador.symboltable.classes.TabelaSimbolos;
    import br.ufpb.iged.interpretador.symboltable.classes.Tipo;
    import br.ufpb.iged.interpretador.bytecodeassembler.asm.BytecodeAssembler;
    import br.ufpb.iged.interpretador.symboltable.classes.SimboloVariavel;
    import br.ufpb.iged.interpretador.symboltable.classes.SimboloMetodo;
}

@members {
    
    TabelaSimbolos tabelaSimbolos;
    SimboloClasse simboloClasse;
    BytecodeAssembler assembler;
    Escopo escopoAtual;
    public Ref(TreeNodeStream input, TabelaSimbolos tabelaSimbolos,
      BytecodeAssembler assembler) {
        this(input);
        this.tabelaSimbolos = tabelaSimbolos;
        this.assembler = assembler;
    }
    
    private Tipo resolverTipo(String nomeTipo) {
    
      return (Tipo)simboloClasse.resolver(nomeTipo);
    
    }
    
    private void acessarCampo(String operacao, String nomeClasse, String nomeCampo) {
    
        assembler.escreverOpcode(operacao);
      
        SimboloClasse simboloClasse =
          (SimboloClasse)tabelaSimbolos.global.resolver("L" + nomeClasse);
      
        if(!assembler.getConstantPool().contains(simboloClasse))
      
          assembler.getConstantPool().add(simboloClasse);
    
        /*BytecodeAssembler.escreverInteiro(BytecodeAssembler.codigo,
          BytecodeAssembler.ip, assembler.getConstantPool().indexOf(simboloClasse));*/
      
        SimboloVariavel simboloVariavel =
          (SimboloVariavel) simboloClasse.resolver(nomeCampo);
    
        if (!simboloClasse.getConstantPool().contains(simboloVariavel))
      
          simboloClasse.getConstantPool().add(simboloVariavel);
          
        if (operacao.equals("getstatic") || operacao.equals("putstatic"))
          
        	BytecodeAssembler.escreverInteiro(
          	  BytecodeAssembler.codigo, BytecodeAssembler.ip,
                  assembler.getConstantPool().indexOf(simboloClasse));
        
        BytecodeAssembler.escreverInteiro(
          BytecodeAssembler.codigo, BytecodeAssembler.ip,
          simboloClasse.getConstantPool().indexOf(simboloVariavel));
    
    }
    
    private void chamarMetodo(String instrucao, String nomeClasse, String nomeMetodo, String args, String tipoRetorno) {
    
      assembler.escreverOpcode(instrucao);
       
      SimboloClasse simboloClasse =
          (SimboloClasse)tabelaSimbolos.global.resolver("L" + nomeClasse);
    
      if(!assembler.getConstantPool().contains(simboloClasse))
      
          assembler.getConstantPool().add(simboloClasse);
          
       SimboloMetodo simboloMetodo =
          (SimboloMetodo) simboloClasse.resolverMetodo(nomeMetodo+"("+args+")"+tipoRetorno, nomeMetodo);
    
        if (!simboloClasse.getMethodArea().contains(simboloMetodo))
      
          simboloClasse.getMethodArea().add(simboloMetodo);
          
       BytecodeAssembler.escreverInteiro(
          BytecodeAssembler.codigo, BytecodeAssembler.ip,
          assembler.getConstantPool().indexOf(simboloClasse));
    
       BytecodeAssembler.escreverInteiro(
          BytecodeAssembler.codigo, BytecodeAssembler.ip,
          simboloClasse.getMethodArea().indexOf(simboloMetodo));
    
  }
  
  private void newClass(String nomeClasse) {
  
     assembler.escreverOpcode("new");
       
      SimboloClasse simboloClasse =
          (SimboloClasse)tabelaSimbolos.global.resolver("L" + nomeClasse);
    
      if(!assembler.getConstantPool().contains(simboloClasse))
      
          assembler.getConstantPool().add(simboloClasse);
    
       BytecodeAssembler.escreverInteiro(BytecodeAssembler.codigo,
          BytecodeAssembler.ip, assembler.getConstantPool().indexOf(simboloClasse));
  
  }
    
}

topdown
    :   entraNaClasse
      | entraNoMetodo
      | entraNoConstrutor
      | declaracaoVariavel
      | getfield
      | getstatic
      | putfield
      | putstatic
      | invokespecial
      | invokestatic
      | invokevirtual
      | novaClasse
      | aritmetica
      | load
      | loadint
      | store
      | storeint
      | desvio
      | logica
      | pilha
      | label
      | retorno
    ;
    
bottomup
 	:   saiDoMetodo
 	  | saiDoConstrutor
 	
 	;
    
entraNaClasse
    : ^('.class' nome=ID (^(EXTENDS sup=TIPO_REF))? .)
        {
        
          simboloClasse =(SimboloClasse)tabelaSimbolos.global.resolver("L" + $nome.getText());     
          if(!assembler.getConstantPool().contains(simboloClasse))   
          	assembler.getConstantPool().add(simboloClasse);
          if ( $sup!=null ) {
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
    
declaracaoVariavel
    : ^(FIELD_DECL ID tip =.)
        {
           $ID.simbolo.tipo = resolverTipo($tip.getText());
           System.out.println("linha "+$ID.getLine()+": set var type "+$ID.simbolo);
        }
    ;
    
entraNoConstrutor
	: ^(CONSTR_DECL INIT .+ (^(LIMIT lim=INTEIRO))?)
	{
	  System.out.println("Ref: Entrou no construtor "+$INIT.text);
	  escopoAtual = (SimboloMetodo)$INIT.simbolo;
	  BytecodeAssembler.codigo = new byte[BytecodeAssembler.TAMANHO_INICIAL_MEMORIA_CODIGO];
	  BytecodeAssembler.ip = 0;
	}
	;
    
entraNoMetodo
	: ^(METHOD_DECL ID . .+ (^(LIMIT lim=INTEIRO))?)
	{
	  System.out.println("Ref: Entrou no metodo "+$ID.text);
	  escopoAtual = (SimboloMetodo)$ID.simbolo;
	  BytecodeAssembler.codigo = new byte[BytecodeAssembler.TAMANHO_INICIAL_MEMORIA_CODIGO];
	  BytecodeAssembler.ip = 0;
	}
	;

saiDoMetodo 
	:  METHOD_DECL
	{
	   System.out.println("Ref: Saindo do metodo... ");
	   ((SimboloMetodo)escopoAtual).setCodigo(assembler.obterCodigoMaquina());
	   ((SimboloMetodo)escopoAtual).setTamanhoMemoriaLocal(assembler.obterTamanhoMemoriaCodigo());
	}
	;
	
saiDoConstrutor
	:  CONSTR_DECL
	{
	    System.out.println("Ref: Saindo do construtor... ");
	   ((SimboloMetodo)escopoAtual).setCodigo(assembler.obterCodigoMaquina());
	   ((SimboloMetodo)escopoAtual).setTamanhoMemoriaLocal(assembler.obterTamanhoMemoriaCodigo());
	}
	;
    
getfield
    : ^('getfield' classe = . . campo = . tipo = .)
    {
      acessarCampo("getfield", $classe.getText(), $campo.getText());
    }
    ;
    
getstatic
    : ^('getstatic' classe = . . campo = . tipo = .)
    {
      acessarCampo("getstatic", $classe.getText(), $campo.getText());
    }
    ;
    
putfield
    : ^('putfield' classe = . . campo = . tipo = .)
    {
      acessarCampo("putfield", $classe.getText(), $campo.getText());
    }
    ;
    
putstatic
    : ^('putstatic' classe = . . campo = . tipo = .)
    {
      acessarCampo("putstatic", $classe.getText(), $campo.getText());
    }
    ;
    
invokespecial
    : ^('invokespecial' classe = . ^(METHOD_CALL nome = . ^(ARGS a = .) .))
    {
      System.out.println("chamando construtor "+$nome.getText()+"("+$a.getText()+")");
      chamarMetodo("invokespecial", $classe.getText(), $nome.getText(), $a.getText(), "");
    }
    ;
    
invokestatic
    : ^('invokestatic' classe = . ^(METHOD_CALL nome = . ^(ARGS a = .) tipoRet = .))
    {
      System.out.println("chamando metodo "+$nome.getText()+"("+$a.getText()+")"+$tipoRet.getText());
      chamarMetodo("invokestatic", $classe.getText(), $nome.getText(), $a.getText(), $tipoRet.getText());
    }
    ;
    
invokevirtual
    : ^('invokevirtual' classe = . ^(METHOD_CALL nome = . ^(ARGS a = .) tipoRet = .))
    {
      System.out.println("chamando metodo "+$nome.getText()+"("+$a.getText()+")"+$tipoRet.getText());
      chamarMetodo("invokevirtual", $classe.getText(), $nome.getText(), $a.getText(), $tipoRet.getText());
    }
    ;
    
novaClasse
  : ^('new' classe = .)
  {
    newClass($classe.getText());
  }
  ;
    
aritmetica
    : ^(ARITMETICA operacao = .)
    {
      assembler.escreverOpcode($operacao.getText());
    }
    ;
     
load
  : ^(LOAD operacao = .)
  {
    assembler.escreverOpcode($operacao.getText());
  }
  ;
  
loadint
    : ^(LOAD operacao = . operando = .)
    {
      assembler.escreverOpcode($operacao.token, $operando.token);
    }
    ;
      
store
   : ^(STORE operacao = .)
   {
      assembler.escreverOpcode($operacao.getText());
   }
   ;

storeint
    : ^(STORE operacao = . operando = .)
    {
      assembler.escreverOpcode($operacao.token, $operando.token);
    }
    ;
    
desvio
    : ^(DESVIO operacao = . operando = .)
    {
      assembler.escreverOpcode($operacao.token, $operando.token);
    }
    ;
    
logica
    : ^(LOGICA operacao = .)
    {
      assembler.escreverOpcode($operacao.getText());
    }
    ;
    
pilha
   : ^(PILHA operacao = .)
   {
      assembler.escreverOpcode($operacao.getText());
   }
   ;

label
   : ^(LABEL operacao = .)
   {
      assembler.definirLabel($operacao.token);
   }
   ;
   
retorno
	: (   operacao = 'ireturn' 
	    | operacao = 'areturn' 
	    | operacao = 'return' 
	  )
	{
	   assembler.escreverOpcode($operacao.getText());
	}
	;