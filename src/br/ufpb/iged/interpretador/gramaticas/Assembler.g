grammar Assembler;

options {
  output = AST;
  ASTLabelType = BytecodesAST;
}

tokens {
  MEMBRO_CLASSE;
  FIELD_DECL;
  EXTENDS;
}

@header{
  package br.ufpb.iged.interpretador.parser;
  
  import br.ufpb.iged.interpretador.excecoes.AcessoIndevidoMemoriaException;
  import br.ufpb.iged.interpretador.excecoes.LabelException;
  import br.ufpb.iged.interpretador.symboltable.classes.BytecodesAST;
}

@lexer::header{
  package br.ufpb.iged.interpretador.parser;
}

@members {

  protected abstract void escreverOpcode(String nomeInstrucao);
  protected abstract void escreverOpcode(Token opc, Token op) throws LabelException;
  protected abstract void verificarAumentoMemoriaGlobal(Token opc) throws AcessoIndevidoMemoriaException;
  protected abstract void verificarAumentoMemoriaGlobal(Token opc, Token op) throws AcessoIndevidoMemoriaException, LabelException;
  protected abstract void definirLabel(Token id) throws LabelException;
  
}

programa : comando*
         ;

comando : (label instrucao | instrucao);
         
label : a = ID ':' {definirLabel($a);};

instrucao: (definicaoClasse | manipulacaoObjetos | aritmetica | load | store | desvio | logica 
                  | 'nop'
              | a = 'pop' {escreverOpcode($a.text);}
              | a = 'pop2'{escreverOpcode($a.text);}
              )? NOVA_LINHA;
              
definicaoClasse : '.class' ID NOVA_LINHA superClasse? membroClasse+  
                  -> ^('.class' ID superClasse? ^(MEMBRO_CLASSE membroClasse+))
                | '.method' INIT '()' VOID
                ;
                
superClasse : '.super' ID -> ^(EXTENDS ID) ;

membroClasse : '.field' ID tipo -> ^(FIELD_DECL ID tipo) 
             ; 
             

manipulacaoObjetos : a = 'getfield' b = campo tipo -> ^('getfield' $b tipo)
                   | a = 'putfield' b = campo tipo -> ^('putfield' $b tipo) 
                   | a = 'invokespecial' c = chamadaMetodo -> ^('invokespecial' $c)
                   ;
  
tipo : INT | VOID | tipoRef ;

aritmetica : a = 'iadd' {escreverOpcode($a.text);}
           | a = 'isub' {escreverOpcode($a.text);}
           | a = 'imul' {escreverOpcode($a.text);}
           | a = 'idiv' {escreverOpcode($a.text);}
           | a = 'irem' {escreverOpcode($a.text);}
           | a = 'iinc' {escreverOpcode($a.text);}
           | a = 'ineg' {escreverOpcode($a.text);}
           ;
           
load : a = 'iconst_m1'{escreverOpcode($a.text);}
     | a = 'iconst_0' {escreverOpcode($a.text);}
     | a = 'iconst_1' {escreverOpcode($a.text);}
     | a = 'iconst_2' {escreverOpcode($a.text);}
     | a = 'iconst_3'{escreverOpcode($a.text);}
     | a = 'iconst_4'{escreverOpcode($a.text);}
     | a = 'iconst_5'{escreverOpcode($a.text);}
     | a = 'iload_0' {escreverOpcode($a.text);}
     | a = 'iload_1' {escreverOpcode($a.text);}
     | a = 'iload_2' {escreverOpcode($a.text);}
     | a = 'iload_3' {escreverOpcode($a.text);}
     | a = 'iload' INTEIRO {escreverOpcode($a, $INTEIRO);}
     | a = 'ldc' INTEIRO {escreverOpcode($a, $INTEIRO);}
     | a = 'aload' INTEIRO {escreverOpcode($a, $INTEIRO);}
     | a = 'aload_0' {escreverOpcode($a.text);}
     | a = 'aload_1' {escreverOpcode($a.text);}
     | a = 'aload_2'{escreverOpcode($a.text);}
     | a = 'aload_3'{escreverOpcode($a.text);}
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

logica : a = 'iand' {escreverOpcode($a.text);}
       | a = 'ior' {escreverOpcode($a.text);}
       | a = 'ixor' {escreverOpcode($a.text);}
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

chamadaMetodo returns [List classe, String nome, String params, String tipoRetorno]
     @init {
        $classe = new ArrayList();
        $nome = "";
        $params = "";
        $tipoRetorno = "";
     }
     : (cls += ID '/')+ n = INIT par = '()' tip = VOID {$classe = $cls;
             $nome = $n.text;
             $params = $par.text;
             $tipoRetorno = $tip.text;
        }
     ;

campo returns [List classe, String campo]
     @init {
        $classe = new ArrayList();
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