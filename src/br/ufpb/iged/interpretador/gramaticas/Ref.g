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
}

@members {
    TabelaSimbolos tabelaSimbolos;
    SimboloClasse simboloClasse;
    BytecodeAssembler assembler;
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
        
        BytecodeAssembler.escreverInteiro(
          BytecodeAssembler.codigo, BytecodeAssembler.ip, 
          simboloClasse.getConstantPool().indexOf(simboloVariavel));
    
    }
    
    private void chamarConstrutorDefault(String nomeClasse) {
    
      assembler.escreverOpcode("invokespecial");
       
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
      | declaracaoVariavel
      | getfield
      | putfield
      | invokespecial
      | aritmetica 
      | load
      | loadint 
      | store
      | storeint 
      | desvio 
      | logica
      | pilha
      | label 
    ;
    
entraNaClasse
    :   ^('.class' nome=ID (^(EXTENDS sup=ID))? .)
        {
          simboloClasse = ((SimboloClasse)$nome.simbolo);
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
    :   ^(FIELD_DECL ID tip =.)
        {
           $ID.simbolo.tipo = resolverTipo($tip.getText());
           System.out.println("linha "+$ID.getLine()+": set var type "+$ID.simbolo);
        }
    ;
    
getfield 
    : ^('getfield' classe = . . campo = . tipo = .)
    {      
      acessarCampo("getfield", $classe.getText(), $campo.getText());     
    }
    ;
    
putfield 
    : ^('putfield' classe = . . campo = . tipo = .)
    {
      acessarCampo("putfield", $classe.getText(), $campo.getText()); 
    }
    ;
    
invokespecial 
    : ^('invokespecial' classe = . . metodo = . args = . tipo = .)
    {
      chamarConstrutorDefault($classe.getText());
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
      assembler.verificarAumentoMemoriaGlobal($operacao.token);
   }
   ;

storeint
    : ^(STORE operacao = . operando = .)
    {
      assembler.verificarAumentoMemoriaGlobal($operacao.token, $operando.token);
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
   