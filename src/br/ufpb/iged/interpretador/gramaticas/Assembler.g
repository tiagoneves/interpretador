grammar Assembler;

options {
  output = AST;
  ASTLabelType = BytecodesAST;
}

tokens {
  CLASSE;
  MEMBRO_CLASSE;
  FIELD_DECL;
  EXTENDS;
}

@header{
  package br.ufpb.iged.interpretador.bytecodeassembler.parser;
}

@members {

  protected void escreverOpcode(Token opc);
  protected void escreverOpcode(Token opc, Token op) throws LabelException;
  protected void verificarAumentoMemoriaGlobal(Token opc) throws AcessoIndevidoMemoriaException;
  protected void verificarAumentoMemoriaGlobal(Token opc, Token op) throws AcessoIndevidoMemoriaException, LabelException;
  protected void definirLabel(Token id) throws LabelException;
  protected void acessarCampo(Token opc, List<String> classe, String campo);
  protected void chamarMetodo(Token opc, List<String> classe);
  
}

programa : comando*
         ;

comando : (label instrucao | instrucao);
         
label : a = ID ':' {definirLabel($a);};

instrucao: (definicaoClasse | manipulacaoObjetos | aritmetica | load | store | desvio | logica 
                  | 'nop'
              | a = 'pop' {escreverOpcode($a);}
              | a = 'pop2'{escreverOpcode($a);}
              )? NOVA_LINHA;
              
definicaoClasse : '.class' ID NOVA_LINHA superClasse? membroClasse+  
                  -> ^(CLASSE ID superClasse? ^(MEMBRO_CLASSE membroClasse+))
                | '.method' INIT '()' VOID
                ;
                
superClasse : '.super' ID -> ^(EXTENDS ID) ;

membroClasse : '.field' ID tipo -> ^(FIELD_DECL ID tipo) ;

manipulacaoObjetos : a = 'getfield' b = campo tipo {acessarCampo($a, $b.classe, $b.campo);}
                   | a = 'putfield' b = campo tipo {acessarCampo($a, $b.classe, $b.campo);}
                   | a = 'invokespecial' c = construtorDefault VOID {chamarMetodo($a, $c.classe);}
                   ;
  
tipo : INT | VOID | tipoRef ;

aritmetica : a = 'iadd' {escreverOpcode($a);}
           | a = 'isub' {escreverOpcode($a);}
           | a = 'imul' {escreverOpcode($a);}
           | a = 'idiv' {escreverOpcode($a);}
           | a = 'irem' {escreverOpcode($a);}
           | a = 'iinc' {escreverOpcode($a);}
           | a = 'ineg' {escreverOpcode($a);}
           ;
           
load : a = 'iconst_m1'{escreverOpcode($a);}
     | a = 'iconst_0' {escreverOpcode($a);}
     | a = 'iconst_1' {escreverOpcode($a);}
     | a = 'iconst_2' {escreverOpcode($a);}
     | a = 'iconst_3'{escreverOpcode($a);}
     | a = 'iconst_4'{escreverOpcode($a);}
     | a = 'iconst_5'{escreverOpcode($a);}
     | a = 'iload_0' {escreverOpcode($a);}
     | a = 'iload_1' {escreverOpcode($a);}
     | a = 'iload_2' {escreverOpcode($a);}
     | a = 'iload_3' {escreverOpcode($a);}
     | a = 'iload' INTEIRO {escreverOpcode($a, $INTEIRO);}
     | a = 'ldc' INTEIRO {escreverOpcode($a, $INTEIRO);}
     | a = 'aload' INTEIRO {escreverOpcode($a, $INTEIRO);}
     | a = 'aload_0' {escreverOpcode($a);}
     | a = 'aload_1' {escreverOpcode($a);}
     | a = 'aload_2'{escreverOpcode($a);}
     | a = 'aload_3'{escreverOpcode($a);}
     ;
     
store : a = 'istore_0' {verificarAumentoMemoriaGlobal($a);}
      | a = 'istore_1' {verificarAumentoMemoriaGlobal($a);}
      | a = 'istore_2' {verificarAumentoMemoriaGlobal($a);}
      | a = 'istore_3' {verificarAumentoMemoriaGlobal($a);}
      | a = 'istore' INTEIRO {verificarAumentoMemoriaGlobal($a, $INTEIRO);}
      | a = 'astore' INTEIRO {verificarAumentoMemoriaGlobal($a, $INTEIRO);}
      | a = 'astore_0' {verificarAumentoMemoriaGlobal($a);}
      | a = 'astore_1' {verificarAumentoMemoriaGlobal($a);}
      | a = 'astore_2' {verificarAumentoMemoriaGlobal($a);}
      | a = 'astore_3' {verificarAumentoMemoriaGlobal($a);}
      ;

logica : a = 'iand' {escreverOpcode($a);}
       | a = 'ior' {escreverOpcode($a);}
       | a = 'ixor' {escreverOpcode($a);}
       ;

desvio : a = 'ifeq' b = ID {escreverOpcode($a, $b);}
       | a = 'ifne' b = ID {escreverOpcode($a, $b);}
       | a = 'iflt' b = ID {escreverOpcode($a, $b);}
       | a = 'ifge' b = ID {escreverOpcode($a, $b);}
       | a = 'ifgt' b = ID {escreverOpcode($a, $b);}
       | a = 'ifle' b = ID {escreverOpcode($a, $b);}
       | a = 'if_icmpeq' b = ID {escreverOpcode($a, $b);}
       | a = 'if_icmpne' b = ID {escreverOpcode($a, $b);}
       | a = 'if_icmplt' b = ID {escreverOpcode($a, $b);}
       | a = 'if_icmpge' b = ID {escreverOpcode($a, $b);}
       | a = 'if_icmpgt' b = ID {escreverOpcode($a, $b);}
       | a = 'if_icmple' b = ID {escreverOpcode($a, $b);}
       | a = 'goto' b = ID {escreverOpcode($a, $b);}
       ;

construtorDefault returns [List classe]
     @init {
        $classe = new ArrayList<String>();
     }
     : (cls += ID '/')+ INIT '()' {$classe = $cls;}
     ;

campo returns [List classe, String campo]
     @init {
        $classe = new ArrayList<String>();
        $campo="";
     }
     : (cls += ID '/')+ cmp = ID {$classe = $cls; $campo = $cmp.text;}
     ;

tipoRef : 'L' (ID '/')* ID;

INIT : '<init>';

INT : 'I';

VOID : 'V';

NULL : ('null' | 'NULL');

INTEIRO : '-'? '0'..'9'+ ;

ID: ('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9' | '.')* ;

//LETRA: ('a'..'z' | 'A'..'Z');

NOVA_LINHA : '\n';

WS : (' ' | '\t' | '\r') {skip();} ;