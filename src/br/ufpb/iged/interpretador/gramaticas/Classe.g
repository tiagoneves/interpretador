grammar Classe;

options {
  output = AST;
  ASTLabelType = BytecodesAST;
}

tokens {
  MEMBRO_CLASSE;
  FIELD_DECL;
  EXTENDS;
}

definicaoClasse : '.class' ID membroClasse+  -> ^('.class' ID ^(MEMBRO_CLASSE membroClasse+))
                | '.class' ID NOVA_LINHA superClasse membroClasse+  
                  -> ^('.class' ID superClasse ^(MEMBRO_CLASSE membroClasse+))
                | '.method' construtorDefault
                ;
                
superClasse : '.super' ID -> ^(EXTENDS ID) ;

membroClasse : '.field' ID tipo NOVA_LINHA -> ^(FIELD_DECL ID tipo) ;

construtorDefault : INIT '()' VOID ; 

tipo : INT | VOID | 'L'ID ;

INIT : '<init>';

INT : 'I';

VOID : 'V';

ID: ('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9' | '.')* ;

NOVA_LINHA : ';';