grammar Intermediario;

@members {

  public void traduzirLoad(Token opc, Token op);
  public void traduzirStore(Token opc, Token op);
  public void traduzirArimetica(Token opc);

}

programa : instrucao*;

instrucao : (nop | load | store | aritmetica);

nop : 'CREATE_INT' ID
    | 'WRITE_INT' ID
    ;

load : a = 'READ_INT' b = ID {traduzirLoad($a, $b);}
     | a = 'READ_INTC' INT {traduzirLoad($a, $INT);}
     ;
     
store : a = 'WRITE_INT' b = ID {traduzirStore($a, $b);};

artimetica : a = 'ADD' {traduzirArimetica($a);}
           | a = 'SUB' {traduzirArimetica($a);}
           | a = 'MULT' {traduzirArimetica($a);}
           | a = 'DIV' {traduzirArimetica($a);}
           ;

INT : '-'? '0'..'9'+ ;

ID: ('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9' | '.')* ;

WS : (' ' | '\t' | '\r' | '\n') {skip();} ;
