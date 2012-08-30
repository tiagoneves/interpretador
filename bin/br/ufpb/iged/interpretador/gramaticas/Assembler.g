grammar Assembler;

options {
  output = AST;
  ASTLabelType = BytecodesAST;
}

tokens {
  MEMBRO_CLASSE;
  FIELD_DECL;
  EXTENDS;
  ARITMETICA;
  LOAD;
  STORE;
  LOGICA;
  DESVIO;
  LABEL;
  PILHA;
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

  public abstract void escreverOpcode(String nomeInstrucao);
  public abstract void escreverOpcode(Token opc, Token op) throws LabelException;
  public abstract void verificarAumentoMemoriaGlobal(Token opc) throws AcessoIndevidoMemoriaException;
  public abstract void verificarAumentoMemoriaGlobal(Token opc, Token op) throws AcessoIndevidoMemoriaException, LabelException;
  public abstract void definirLabel(Token id) throws LabelException;
  
}

programa : instrucao*
         ;
         
instrucao : operacao 
          | definicaoClasse ('.end class')?
          ;

operacao : (label comando | comando);
         
label : a = ID ':' -> ^(LABEL $a);

comando: (      manipulacaoObjetos 
              | aritmetica 
              | load
              | loadint 
              | store
              | storeint 
              | desvio 
              | logica
              | pilha 
              | 'nop'
           )? NEWLINE;
              
definicaoClasse
    : '.class' ID NEWLINE (superClasse NEWLINE)? (membroClasse NEWLINE) + 
                  -> ^('.class' ID superClasse? ^(MEMBRO_CLASSE membroClasse+))
                | '.method' INIT '()' VOID NEWLINE
                ;
                
superClasse : '.super' TIPO_REF -> ^(EXTENDS TIPO_REF) ;

membroClasse 
    : '.field' ID tipo -> ^(FIELD_DECL ID tipo) 
    ; 
             
manipulacaoObjetos : a = 'getfield' b = campo tipo -> ^('getfield' $b tipo)
                   | a = 'putfield' b = campo tipo -> ^('putfield' $b tipo) 
                   | a = 'invokespecial' c = classe '/' d = chamadaMetodo 
                      -> ^('invokespecial' $c $d)
                   | a = 'new'c = classe -> ^('new' $c)
                   ;
  
tipo : INT | VOID | TIPO_REF;

aritmetica : (    a = 'iadd'
                | a = 'isub'
                | a = 'imul'
                | a = 'idiv'
                | a = 'irem'
                | a = 'iinc'
                | a = 'ineg' 
             )
             -> ^(ARITMETICA $a)
           ;
           
load : (    a = 'iconst_m1'
          | a = 'iconst_0'
          | a = 'iconst_1'
          | a = 'iconst_2' 
          | a = 'iconst_3'
          | a = 'iconst_4'
          | a = 'iconst_5'
          | a = 'aconst_null' 
          | a = 'iload_0' 
          | a = 'iload_1'
          | a = 'iload_2'
          | a = 'iload_3'
          | a = 'aload_0'
          | a = 'aload_1' 
          | a = 'aload_2'
          | a = 'aload_3' 
       ) 
       -> ^(LOAD $a)
     ;
     
loadint : (   a = 'iload' b = INTEIRO 
            | a = 'ldc' b = INTEIRO
            | a = 'aload' b = INTEIRO 
          ) 
          -> ^(LOAD $a $b)
        ; 
     
store : (   a = 'istore_0' 
          | a = 'istore_1' 
          | a = 'istore_2' 
          | a = 'istore_3' 
          | a = 'astore_0'
          | a = 'astore_1' 
          | a = 'astore_2' 
          | a = 'astore_3'
        ) 
        -> ^(STORE $a)
      ;
      
storeint : (   a = 'istore' b = INTEIRO 
             | a = 'astore' b = INTEIRO 
           ) 
           -> ^(STORE $a $b)
         ;

logica : (   a = 'iand'
           | a = 'ior'
           | a = 'ixor'
         )
         -> ^(LOGICA $a)
       ;

desvio : (   a = 'ifeq' b = ID 
           | a = 'ifne' b = ID 
           | a = 'iflt' b = ID
           | a = 'ifge' b = ID
           | a = 'ifgt' b = ID 
           | a = 'ifle' b = ID 
           | a = 'if_icmpeq' b = ID 
           | a = 'if_icmpne' b = ID
           | a = 'if_icmplt' b = ID 
           | a = 'if_icmpge' b = ID 
           | a = 'if_icmpgt' b = ID
           | a = 'if_icmple' b = ID 
           | a = 'goto' b = ID 
         ) 
         -> ^(DESVIO $a $b)
       ;
       
pilha : (   a = 'pop'
          | a = 'pop2'
          | a = 'dup'
        )
        -> ^(PILHA $a)
      ;

classe returns [List classe]
     @init {
        $classe = new ArrayList();
     }
     : (cls += ID '/')* (cls += ID) {$classe = $cls;}
     ;

chamadaMetodo returns [String nome, String params, String tipoRetorno]
     @init {
        $nome = "";
        $params = "";
        $tipoRetorno = "";
     }
     : n = INIT par = '()' tip = VOID {
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

INIT : '<init>';

INT : 'I';

VOID : 'V';

NULL : ('null' | 'NULL');

INTEIRO : '-'? '0'..'9'+ ;

TIPO_REF: 'L' ID ('/' ID)*;

ID: ('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9' | '.')* ;

//LETRA: ('a'..'z' | 'A'..'Z');

NEWLINE : '\n';

WS : (' ' | '\t' | '\r') {$channel=HIDDEN;} ;