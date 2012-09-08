// $ANTLR 3.4 C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g 2012-09-08 17:02:13

  package br.ufpb.iged.interpretador.parser;
  
  import br.ufpb.iged.interpretador.excecoes.AcessoIndevidoMemoriaException;
  import br.ufpb.iged.interpretador.excecoes.LabelException;
  import br.ufpb.iged.interpretador.symboltable.classes.BytecodesAST;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public abstract class AssemblerParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARITMETICA", "BODY", "CONSTR_DECL", "DESVIO", "EXTENDS", "FIELD_DECL", "ID", "INIT", "INT", "INTEIRO", "LABEL", "LIMIT", "LOAD", "LOGICA", "MEMBRO_CLASSE", "METHOD_DECL", "NEWLINE", "NULL", "PARAMS", "PILHA", "STORE", "TIPO_REF", "VOID", "WS", "'('", "'()'", "')'", "'.class'", "'.end class'", "'.end method'", "'.field'", "'.limit locals'", "'.method'", "'.super'", "'/'", "':'", "'aconst_null'", "'aload'", "'aload_0'", "'aload_1'", "'aload_2'", "'aload_3'", "'areturn'", "'astore'", "'astore_0'", "'astore_1'", "'astore_2'", "'astore_3'", "'dup'", "'getfield'", "'getstatic'", "'goto'", "'iadd'", "'iand'", "'iconst_0'", "'iconst_1'", "'iconst_2'", "'iconst_3'", "'iconst_4'", "'iconst_5'", "'iconst_m1'", "'idiv'", "'if_icmpeq'", "'if_icmpge'", "'if_icmpgt'", "'if_icmple'", "'if_icmplt'", "'if_icmpne'", "'ifeq'", "'ifge'", "'ifgt'", "'ifle'", "'iflt'", "'ifne'", "'iinc'", "'iload'", "'iload_0'", "'iload_1'", "'iload_2'", "'iload_3'", "'imul'", "'ineg'", "'invokespecial'", "'invokestatic'", "'ior'", "'irem'", "'ireturn'", "'istore'", "'istore_0'", "'istore_1'", "'istore_2'", "'istore_3'", "'isub'", "'ixor'", "'ldc'", "'new'", "'nop'", "'pop'", "'pop2'", "'putfield'", "'putstatic'", "'return'", "'static'"
    };

    public static final int EOF=-1;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__90=90;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__99=99;
    public static final int T__100=100;
    public static final int T__101=101;
    public static final int T__102=102;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int ARITMETICA=4;
    public static final int BODY=5;
    public static final int CONSTR_DECL=6;
    public static final int DESVIO=7;
    public static final int EXTENDS=8;
    public static final int FIELD_DECL=9;
    public static final int ID=10;
    public static final int INIT=11;
    public static final int INT=12;
    public static final int INTEIRO=13;
    public static final int LABEL=14;
    public static final int LIMIT=15;
    public static final int LOAD=16;
    public static final int LOGICA=17;
    public static final int MEMBRO_CLASSE=18;
    public static final int METHOD_DECL=19;
    public static final int NEWLINE=20;
    public static final int NULL=21;
    public static final int PARAMS=22;
    public static final int PILHA=23;
    public static final int STORE=24;
    public static final int TIPO_REF=25;
    public static final int VOID=26;
    public static final int WS=27;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public AssemblerParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public AssemblerParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return AssemblerParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g"; }



      public abstract void escreverOpcode(String nomeInstrucao);
      public abstract void escreverOpcode(Token opc, Token op) throws LabelException;
      public abstract void verificarAumentoMemoriaGlobal(Token opc) throws AcessoIndevidoMemoriaException;
      public abstract void verificarAumentoMemoriaGlobal(Token opc, Token op) throws AcessoIndevidoMemoriaException, LabelException;
      public abstract void definirLabel(Token id) throws LabelException;
      


    public static class programa_return extends ParserRuleReturnScope {
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "programa"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:48:1: programa : ( instrucao )* ;
    public final AssemblerParser.programa_return programa() throws RecognitionException {
        AssemblerParser.programa_return retval = new AssemblerParser.programa_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        AssemblerParser.instrucao_return instrucao1 =null;



        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:48:10: ( ( instrucao )* )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:48:12: ( instrucao )*
            {
            root_0 = (BytecodesAST)adaptor.nil();


            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:48:12: ( instrucao )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID||LA1_0==NEWLINE||LA1_0==31||(LA1_0 >= 40 && LA1_0 <= 105)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:48:12: instrucao
            	    {
            	    pushFollow(FOLLOW_instrucao_in_programa132);
            	    instrucao1=instrucao();

            	    state._fsp--;

            	    adaptor.addChild(root_0, instrucao1.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (BytecodesAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BytecodesAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "programa"


    public static class instrucao_return extends ParserRuleReturnScope {
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instrucao"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:51:1: instrucao : ( operacao | definicaoClasse ( '.end class' )? );
    public final AssemblerParser.instrucao_return instrucao() throws RecognitionException {
        AssemblerParser.instrucao_return retval = new AssemblerParser.instrucao_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token string_literal4=null;
        AssemblerParser.operacao_return operacao2 =null;

        AssemblerParser.definicaoClasse_return definicaoClasse3 =null;


        BytecodesAST string_literal4_tree=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:51:11: ( operacao | definicaoClasse ( '.end class' )? )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ID||LA3_0==NEWLINE||(LA3_0 >= 40 && LA3_0 <= 105)) ) {
                alt3=1;
            }
            else if ( (LA3_0==31) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:51:13: operacao
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    pushFollow(FOLLOW_operacao_in_instrucao160);
                    operacao2=operacao();

                    state._fsp--;

                    adaptor.addChild(root_0, operacao2.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:52:13: definicaoClasse ( '.end class' )?
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    pushFollow(FOLLOW_definicaoClasse_in_instrucao174);
                    definicaoClasse3=definicaoClasse();

                    state._fsp--;

                    adaptor.addChild(root_0, definicaoClasse3.getTree());

                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:52:29: ( '.end class' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==32) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:52:30: '.end class'
                            {
                            string_literal4=(Token)match(input,32,FOLLOW_32_in_instrucao177); 
                            string_literal4_tree = 
                            (BytecodesAST)adaptor.create(string_literal4)
                            ;
                            adaptor.addChild(root_0, string_literal4_tree);


                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (BytecodesAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BytecodesAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "instrucao"


    public static class operacao_return extends ParserRuleReturnScope {
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "operacao"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:55:1: operacao : ( label comando | comando ) ;
    public final AssemblerParser.operacao_return operacao() throws RecognitionException {
        AssemblerParser.operacao_return retval = new AssemblerParser.operacao_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        AssemblerParser.label_return label5 =null;

        AssemblerParser.comando_return comando6 =null;

        AssemblerParser.comando_return comando7 =null;



        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:55:10: ( ( label comando | comando ) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:55:12: ( label comando | comando )
            {
            root_0 = (BytecodesAST)adaptor.nil();


            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:55:12: ( label comando | comando )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==NEWLINE||(LA4_0 >= 40 && LA4_0 <= 105)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:55:13: label comando
                    {
                    pushFollow(FOLLOW_label_in_operacao199);
                    label5=label();

                    state._fsp--;

                    adaptor.addChild(root_0, label5.getTree());

                    pushFollow(FOLLOW_comando_in_operacao201);
                    comando6=comando();

                    state._fsp--;

                    adaptor.addChild(root_0, comando6.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:55:29: comando
                    {
                    pushFollow(FOLLOW_comando_in_operacao205);
                    comando7=comando();

                    state._fsp--;

                    adaptor.addChild(root_0, comando7.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (BytecodesAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BytecodesAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "operacao"


    public static class label_return extends ParserRuleReturnScope {
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "label"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:57:1: label : a= ID ':' -> ^( LABEL $a) ;
    public final AssemblerParser.label_return label() throws RecognitionException {
        AssemblerParser.label_return retval = new AssemblerParser.label_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;
        Token char_literal8=null;

        BytecodesAST a_tree=null;
        BytecodesAST char_literal8_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:57:7: (a= ID ':' -> ^( LABEL $a) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:57:9: a= ID ':'
            {
            a=(Token)match(input,ID,FOLLOW_ID_in_label227);  
            stream_ID.add(a);


            char_literal8=(Token)match(input,39,FOLLOW_39_in_label229);  
            stream_39.add(char_literal8);


            // AST REWRITE
            // elements: a
            // token labels: a
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_a=new RewriteRuleTokenStream(adaptor,"token a",a);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BytecodesAST)adaptor.nil();
            // 57:20: -> ^( LABEL $a)
            {
                // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:57:23: ^( LABEL $a)
                {
                BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                root_1 = (BytecodesAST)adaptor.becomeRoot(
                (BytecodesAST)adaptor.create(LABEL, "LABEL")
                , root_1);

                adaptor.addChild(root_1, stream_a.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (BytecodesAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BytecodesAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "label"


    public static class comando_return extends ParserRuleReturnScope {
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "comando"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:59:1: comando : ( manipulacaoObjetos | aritmetica | load | loadint | store | storeint | desvio | logica | pilha | retorno | 'nop' )? NEWLINE ;
    public final AssemblerParser.comando_return comando() throws RecognitionException {
        AssemblerParser.comando_return retval = new AssemblerParser.comando_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token string_literal19=null;
        Token NEWLINE20=null;
        AssemblerParser.manipulacaoObjetos_return manipulacaoObjetos9 =null;

        AssemblerParser.aritmetica_return aritmetica10 =null;

        AssemblerParser.load_return load11 =null;

        AssemblerParser.loadint_return loadint12 =null;

        AssemblerParser.store_return store13 =null;

        AssemblerParser.storeint_return storeint14 =null;

        AssemblerParser.desvio_return desvio15 =null;

        AssemblerParser.logica_return logica16 =null;

        AssemblerParser.pilha_return pilha17 =null;

        AssemblerParser.retorno_return retorno18 =null;


        BytecodesAST string_literal19_tree=null;
        BytecodesAST NEWLINE20_tree=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:59:8: ( ( manipulacaoObjetos | aritmetica | load | loadint | store | storeint | desvio | logica | pilha | retorno | 'nop' )? NEWLINE )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:59:10: ( manipulacaoObjetos | aritmetica | load | loadint | store | storeint | desvio | logica | pilha | retorno | 'nop' )? NEWLINE
            {
            root_0 = (BytecodesAST)adaptor.nil();


            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:59:10: ( manipulacaoObjetos | aritmetica | load | loadint | store | storeint | desvio | logica | pilha | retorno | 'nop' )?
            int alt5=12;
            switch ( input.LA(1) ) {
                case 53:
                case 54:
                case 86:
                case 87:
                case 99:
                case 103:
                case 104:
                    {
                    alt5=1;
                    }
                    break;
                case 56:
                case 65:
                case 78:
                case 84:
                case 85:
                case 89:
                case 96:
                    {
                    alt5=2;
                    }
                    break;
                case 40:
                case 42:
                case 43:
                case 44:
                case 45:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 80:
                case 81:
                case 82:
                case 83:
                    {
                    alt5=3;
                    }
                    break;
                case 41:
                case 79:
                case 98:
                    {
                    alt5=4;
                    }
                    break;
                case 48:
                case 49:
                case 50:
                case 51:
                case 92:
                case 93:
                case 94:
                case 95:
                    {
                    alt5=5;
                    }
                    break;
                case 47:
                case 91:
                    {
                    alt5=6;
                    }
                    break;
                case 55:
                case 66:
                case 67:
                case 68:
                case 69:
                case 70:
                case 71:
                case 72:
                case 73:
                case 74:
                case 75:
                case 76:
                case 77:
                    {
                    alt5=7;
                    }
                    break;
                case 57:
                case 88:
                case 97:
                    {
                    alt5=8;
                    }
                    break;
                case 52:
                case 101:
                case 102:
                    {
                    alt5=9;
                    }
                    break;
                case 46:
                case 90:
                case 105:
                    {
                    alt5=10;
                    }
                    break;
                case 100:
                    {
                    alt5=11;
                    }
                    break;
            }

            switch (alt5) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:59:12: manipulacaoObjetos
                    {
                    pushFollow(FOLLOW_manipulacaoObjetos_in_comando247);
                    manipulacaoObjetos9=manipulacaoObjetos();

                    state._fsp--;

                    adaptor.addChild(root_0, manipulacaoObjetos9.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:60:17: aritmetica
                    {
                    pushFollow(FOLLOW_aritmetica_in_comando265);
                    aritmetica10=aritmetica();

                    state._fsp--;

                    adaptor.addChild(root_0, aritmetica10.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:61:17: load
                    {
                    pushFollow(FOLLOW_load_in_comando283);
                    load11=load();

                    state._fsp--;

                    adaptor.addChild(root_0, load11.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:62:17: loadint
                    {
                    pushFollow(FOLLOW_loadint_in_comando301);
                    loadint12=loadint();

                    state._fsp--;

                    adaptor.addChild(root_0, loadint12.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:63:17: store
                    {
                    pushFollow(FOLLOW_store_in_comando319);
                    store13=store();

                    state._fsp--;

                    adaptor.addChild(root_0, store13.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:64:17: storeint
                    {
                    pushFollow(FOLLOW_storeint_in_comando337);
                    storeint14=storeint();

                    state._fsp--;

                    adaptor.addChild(root_0, storeint14.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:65:17: desvio
                    {
                    pushFollow(FOLLOW_desvio_in_comando355);
                    desvio15=desvio();

                    state._fsp--;

                    adaptor.addChild(root_0, desvio15.getTree());

                    }
                    break;
                case 8 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:66:17: logica
                    {
                    pushFollow(FOLLOW_logica_in_comando373);
                    logica16=logica();

                    state._fsp--;

                    adaptor.addChild(root_0, logica16.getTree());

                    }
                    break;
                case 9 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:67:17: pilha
                    {
                    pushFollow(FOLLOW_pilha_in_comando391);
                    pilha17=pilha();

                    state._fsp--;

                    adaptor.addChild(root_0, pilha17.getTree());

                    }
                    break;
                case 10 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:68:17: retorno
                    {
                    pushFollow(FOLLOW_retorno_in_comando409);
                    retorno18=retorno();

                    state._fsp--;

                    adaptor.addChild(root_0, retorno18.getTree());

                    }
                    break;
                case 11 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:69:17: 'nop'
                    {
                    string_literal19=(Token)match(input,100,FOLLOW_100_in_comando427); 
                    string_literal19_tree = 
                    (BytecodesAST)adaptor.create(string_literal19)
                    ;
                    adaptor.addChild(root_0, string_literal19_tree);


                    }
                    break;

            }


            NEWLINE20=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_comando443); 
            NEWLINE20_tree = 
            (BytecodesAST)adaptor.create(NEWLINE20)
            ;
            adaptor.addChild(root_0, NEWLINE20_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (BytecodesAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BytecodesAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "comando"


    public static class definicaoClasse_return extends ParserRuleReturnScope {
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "definicaoClasse"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:72:1: definicaoClasse : '.class' ID NEWLINE ( superClasse NEWLINE )? ( membroClasse NEWLINE )+ -> ^( '.class' ID ( superClasse )? ^( MEMBRO_CLASSE ( membroClasse )+ ) ) ;
    public final AssemblerParser.definicaoClasse_return definicaoClasse() throws RecognitionException {
        AssemblerParser.definicaoClasse_return retval = new AssemblerParser.definicaoClasse_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token string_literal21=null;
        Token ID22=null;
        Token NEWLINE23=null;
        Token NEWLINE25=null;
        Token NEWLINE27=null;
        AssemblerParser.superClasse_return superClasse24 =null;

        AssemblerParser.membroClasse_return membroClasse26 =null;


        BytecodesAST string_literal21_tree=null;
        BytecodesAST ID22_tree=null;
        BytecodesAST NEWLINE23_tree=null;
        BytecodesAST NEWLINE25_tree=null;
        BytecodesAST NEWLINE27_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_membroClasse=new RewriteRuleSubtreeStream(adaptor,"rule membroClasse");
        RewriteRuleSubtreeStream stream_superClasse=new RewriteRuleSubtreeStream(adaptor,"rule superClasse");
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:73:5: ( '.class' ID NEWLINE ( superClasse NEWLINE )? ( membroClasse NEWLINE )+ -> ^( '.class' ID ( superClasse )? ^( MEMBRO_CLASSE ( membroClasse )+ ) ) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:73:7: '.class' ID NEWLINE ( superClasse NEWLINE )? ( membroClasse NEWLINE )+
            {
            string_literal21=(Token)match(input,31,FOLLOW_31_in_definicaoClasse469);  
            stream_31.add(string_literal21);


            ID22=(Token)match(input,ID,FOLLOW_ID_in_definicaoClasse471);  
            stream_ID.add(ID22);


            NEWLINE23=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_definicaoClasse473);  
            stream_NEWLINE.add(NEWLINE23);


            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:73:27: ( superClasse NEWLINE )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==37) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:73:28: superClasse NEWLINE
                    {
                    pushFollow(FOLLOW_superClasse_in_definicaoClasse476);
                    superClasse24=superClasse();

                    state._fsp--;

                    stream_superClasse.add(superClasse24.getTree());

                    NEWLINE25=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_definicaoClasse478);  
                    stream_NEWLINE.add(NEWLINE25);


                    }
                    break;

            }


            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:73:50: ( membroClasse NEWLINE )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==34||LA7_0==36) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:73:51: membroClasse NEWLINE
            	    {
            	    pushFollow(FOLLOW_membroClasse_in_definicaoClasse483);
            	    membroClasse26=membroClasse();

            	    state._fsp--;

            	    stream_membroClasse.add(membroClasse26.getTree());

            	    NEWLINE27=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_definicaoClasse485);  
            	    stream_NEWLINE.add(NEWLINE27);


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            // AST REWRITE
            // elements: 31, membroClasse, superClasse, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BytecodesAST)adaptor.nil();
            // 74:12: -> ^( '.class' ID ( superClasse )? ^( MEMBRO_CLASSE ( membroClasse )+ ) )
            {
                // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:74:15: ^( '.class' ID ( superClasse )? ^( MEMBRO_CLASSE ( membroClasse )+ ) )
                {
                BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                root_1 = (BytecodesAST)adaptor.becomeRoot(
                stream_31.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:74:29: ( superClasse )?
                if ( stream_superClasse.hasNext() ) {
                    adaptor.addChild(root_1, stream_superClasse.nextTree());

                }
                stream_superClasse.reset();

                // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:74:42: ^( MEMBRO_CLASSE ( membroClasse )+ )
                {
                BytecodesAST root_2 = (BytecodesAST)adaptor.nil();
                root_2 = (BytecodesAST)adaptor.becomeRoot(
                (BytecodesAST)adaptor.create(MEMBRO_CLASSE, "MEMBRO_CLASSE")
                , root_2);

                if ( !(stream_membroClasse.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_membroClasse.hasNext() ) {
                    adaptor.addChild(root_2, stream_membroClasse.nextTree());

                }
                stream_membroClasse.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (BytecodesAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BytecodesAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "definicaoClasse"


    public static class superClasse_return extends ParserRuleReturnScope {
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "superClasse"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:77:1: superClasse : '.super' TIPO_REF -> ^( EXTENDS TIPO_REF ) ;
    public final AssemblerParser.superClasse_return superClasse() throws RecognitionException {
        AssemblerParser.superClasse_return retval = new AssemblerParser.superClasse_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token string_literal28=null;
        Token TIPO_REF29=null;

        BytecodesAST string_literal28_tree=null;
        BytecodesAST TIPO_REF29_tree=null;
        RewriteRuleTokenStream stream_TIPO_REF=new RewriteRuleTokenStream(adaptor,"token TIPO_REF");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:77:13: ( '.super' TIPO_REF -> ^( EXTENDS TIPO_REF ) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:77:15: '.super' TIPO_REF
            {
            string_literal28=(Token)match(input,37,FOLLOW_37_in_superClasse546);  
            stream_37.add(string_literal28);


            TIPO_REF29=(Token)match(input,TIPO_REF,FOLLOW_TIPO_REF_in_superClasse548);  
            stream_TIPO_REF.add(TIPO_REF29);


            // AST REWRITE
            // elements: TIPO_REF
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BytecodesAST)adaptor.nil();
            // 77:33: -> ^( EXTENDS TIPO_REF )
            {
                // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:77:36: ^( EXTENDS TIPO_REF )
                {
                BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                root_1 = (BytecodesAST)adaptor.becomeRoot(
                (BytecodesAST)adaptor.create(EXTENDS, "EXTENDS")
                , root_1);

                adaptor.addChild(root_1, 
                stream_TIPO_REF.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (BytecodesAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BytecodesAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "superClasse"


    public static class membroClasse_return extends ParserRuleReturnScope {
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "membroClasse"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:79:1: membroClasse : ( '.field' ( 'static' )? ID tipo -> ^( FIELD_DECL ID tipo ) | '.method' INIT ( parametros | '(' parametros ')' ) VOID NEWLINE ( limite NEWLINE )? ( operacao )* '.end method' -> ^( CONSTR_DECL INIT parametros ( limite )? ^( BODY ( operacao )* ) ) | '.method' ( 'static' )? ID ( parametros | '(' parametros ')' ) ret= tipo NEWLINE ( limite NEWLINE )? ( operacao )* '.end method' -> ^( METHOD_DECL ID $ret parametros ( limite )? ^( BODY ( operacao )* ) ) );
    public final AssemblerParser.membroClasse_return membroClasse() throws RecognitionException {
        AssemblerParser.membroClasse_return retval = new AssemblerParser.membroClasse_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token string_literal30=null;
        Token string_literal31=null;
        Token ID32=null;
        Token string_literal34=null;
        Token INIT35=null;
        Token char_literal37=null;
        Token char_literal39=null;
        Token VOID40=null;
        Token NEWLINE41=null;
        Token NEWLINE43=null;
        Token string_literal45=null;
        Token string_literal46=null;
        Token string_literal47=null;
        Token ID48=null;
        Token char_literal50=null;
        Token char_literal52=null;
        Token NEWLINE53=null;
        Token NEWLINE55=null;
        Token string_literal57=null;
        AssemblerParser.tipo_return ret =null;

        AssemblerParser.tipo_return tipo33 =null;

        AssemblerParser.parametros_return parametros36 =null;

        AssemblerParser.parametros_return parametros38 =null;

        AssemblerParser.limite_return limite42 =null;

        AssemblerParser.operacao_return operacao44 =null;

        AssemblerParser.parametros_return parametros49 =null;

        AssemblerParser.parametros_return parametros51 =null;

        AssemblerParser.limite_return limite54 =null;

        AssemblerParser.operacao_return operacao56 =null;


        BytecodesAST string_literal30_tree=null;
        BytecodesAST string_literal31_tree=null;
        BytecodesAST ID32_tree=null;
        BytecodesAST string_literal34_tree=null;
        BytecodesAST INIT35_tree=null;
        BytecodesAST char_literal37_tree=null;
        BytecodesAST char_literal39_tree=null;
        BytecodesAST VOID40_tree=null;
        BytecodesAST NEWLINE41_tree=null;
        BytecodesAST NEWLINE43_tree=null;
        BytecodesAST string_literal45_tree=null;
        BytecodesAST string_literal46_tree=null;
        BytecodesAST string_literal47_tree=null;
        BytecodesAST ID48_tree=null;
        BytecodesAST char_literal50_tree=null;
        BytecodesAST char_literal52_tree=null;
        BytecodesAST NEWLINE53_tree=null;
        BytecodesAST NEWLINE55_tree=null;
        BytecodesAST string_literal57_tree=null;
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_VOID=new RewriteRuleTokenStream(adaptor,"token VOID");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_106=new RewriteRuleTokenStream(adaptor,"token 106");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_INIT=new RewriteRuleTokenStream(adaptor,"token INIT");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleSubtreeStream stream_limite=new RewriteRuleSubtreeStream(adaptor,"rule limite");
        RewriteRuleSubtreeStream stream_parametros=new RewriteRuleSubtreeStream(adaptor,"rule parametros");
        RewriteRuleSubtreeStream stream_tipo=new RewriteRuleSubtreeStream(adaptor,"rule tipo");
        RewriteRuleSubtreeStream stream_operacao=new RewriteRuleSubtreeStream(adaptor,"rule operacao");
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:80:5: ( '.field' ( 'static' )? ID tipo -> ^( FIELD_DECL ID tipo ) | '.method' INIT ( parametros | '(' parametros ')' ) VOID NEWLINE ( limite NEWLINE )? ( operacao )* '.end method' -> ^( CONSTR_DECL INIT parametros ( limite )? ^( BODY ( operacao )* ) ) | '.method' ( 'static' )? ID ( parametros | '(' parametros ')' ) ret= tipo NEWLINE ( limite NEWLINE )? ( operacao )* '.end method' -> ^( METHOD_DECL ID $ret parametros ( limite )? ^( BODY ( operacao )* ) ) )
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            else if ( (LA16_0==36) ) {
                int LA16_2 = input.LA(2);

                if ( (LA16_2==INIT) ) {
                    alt16=2;
                }
                else if ( (LA16_2==ID||LA16_2==106) ) {
                    alt16=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:80:7: '.field' ( 'static' )? ID tipo
                    {
                    string_literal30=(Token)match(input,34,FOLLOW_34_in_membroClasse569);  
                    stream_34.add(string_literal30);


                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:80:16: ( 'static' )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==106) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:80:16: 'static'
                            {
                            string_literal31=(Token)match(input,106,FOLLOW_106_in_membroClasse571);  
                            stream_106.add(string_literal31);


                            }
                            break;

                    }


                    ID32=(Token)match(input,ID,FOLLOW_ID_in_membroClasse574);  
                    stream_ID.add(ID32);


                    pushFollow(FOLLOW_tipo_in_membroClasse576);
                    tipo33=tipo();

                    state._fsp--;

                    stream_tipo.add(tipo33.getTree());

                    // AST REWRITE
                    // elements: ID, tipo
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BytecodesAST)adaptor.nil();
                    // 80:34: -> ^( FIELD_DECL ID tipo )
                    {
                        // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:80:37: ^( FIELD_DECL ID tipo )
                        {
                        BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                        root_1 = (BytecodesAST)adaptor.becomeRoot(
                        (BytecodesAST)adaptor.create(FIELD_DECL, "FIELD_DECL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, stream_tipo.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:81:7: '.method' INIT ( parametros | '(' parametros ')' ) VOID NEWLINE ( limite NEWLINE )? ( operacao )* '.end method'
                    {
                    string_literal34=(Token)match(input,36,FOLLOW_36_in_membroClasse594);  
                    stream_36.add(string_literal34);


                    INIT35=(Token)match(input,INIT,FOLLOW_INIT_in_membroClasse596);  
                    stream_INIT.add(INIT35);


                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:81:22: ( parametros | '(' parametros ')' )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==ID||LA9_0==TIPO_REF||LA9_0==29) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==28) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;

                    }
                    switch (alt9) {
                        case 1 :
                            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:81:23: parametros
                            {
                            pushFollow(FOLLOW_parametros_in_membroClasse599);
                            parametros36=parametros();

                            state._fsp--;

                            stream_parametros.add(parametros36.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:81:36: '(' parametros ')'
                            {
                            char_literal37=(Token)match(input,28,FOLLOW_28_in_membroClasse603);  
                            stream_28.add(char_literal37);


                            pushFollow(FOLLOW_parametros_in_membroClasse605);
                            parametros38=parametros();

                            state._fsp--;

                            stream_parametros.add(parametros38.getTree());

                            char_literal39=(Token)match(input,30,FOLLOW_30_in_membroClasse607);  
                            stream_30.add(char_literal39);


                            }
                            break;

                    }


                    VOID40=(Token)match(input,VOID,FOLLOW_VOID_in_membroClasse610);  
                    stream_VOID.add(VOID40);


                    NEWLINE41=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_membroClasse612);  
                    stream_NEWLINE.add(NEWLINE41);


                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:81:69: ( limite NEWLINE )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==35) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:81:70: limite NEWLINE
                            {
                            pushFollow(FOLLOW_limite_in_membroClasse615);
                            limite42=limite();

                            state._fsp--;

                            stream_limite.add(limite42.getTree());

                            NEWLINE43=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_membroClasse617);  
                            stream_NEWLINE.add(NEWLINE43);


                            }
                            break;

                    }


                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:81:87: ( operacao )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==ID||LA11_0==NEWLINE||(LA11_0 >= 40 && LA11_0 <= 105)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:81:87: operacao
                    	    {
                    	    pushFollow(FOLLOW_operacao_in_membroClasse621);
                    	    operacao44=operacao();

                    	    state._fsp--;

                    	    stream_operacao.add(operacao44.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    string_literal45=(Token)match(input,33,FOLLOW_33_in_membroClasse624);  
                    stream_33.add(string_literal45);


                    // AST REWRITE
                    // elements: parametros, operacao, INIT, limite
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BytecodesAST)adaptor.nil();
                    // 82:2: -> ^( CONSTR_DECL INIT parametros ( limite )? ^( BODY ( operacao )* ) )
                    {
                        // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:82:5: ^( CONSTR_DECL INIT parametros ( limite )? ^( BODY ( operacao )* ) )
                        {
                        BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                        root_1 = (BytecodesAST)adaptor.becomeRoot(
                        (BytecodesAST)adaptor.create(CONSTR_DECL, "CONSTR_DECL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_INIT.nextNode()
                        );

                        adaptor.addChild(root_1, stream_parametros.nextTree());

                        // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:82:35: ( limite )?
                        if ( stream_limite.hasNext() ) {
                            adaptor.addChild(root_1, stream_limite.nextTree());

                        }
                        stream_limite.reset();

                        // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:82:43: ^( BODY ( operacao )* )
                        {
                        BytecodesAST root_2 = (BytecodesAST)adaptor.nil();
                        root_2 = (BytecodesAST)adaptor.becomeRoot(
                        (BytecodesAST)adaptor.create(BODY, "BODY")
                        , root_2);

                        // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:82:50: ( operacao )*
                        while ( stream_operacao.hasNext() ) {
                            adaptor.addChild(root_2, stream_operacao.nextTree());

                        }
                        stream_operacao.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:83:7: '.method' ( 'static' )? ID ( parametros | '(' parametros ')' ) ret= tipo NEWLINE ( limite NEWLINE )? ( operacao )* '.end method'
                    {
                    string_literal46=(Token)match(input,36,FOLLOW_36_in_membroClasse653);  
                    stream_36.add(string_literal46);


                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:83:17: ( 'static' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==106) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:83:17: 'static'
                            {
                            string_literal47=(Token)match(input,106,FOLLOW_106_in_membroClasse655);  
                            stream_106.add(string_literal47);


                            }
                            break;

                    }


                    ID48=(Token)match(input,ID,FOLLOW_ID_in_membroClasse658);  
                    stream_ID.add(ID48);


                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:83:30: ( parametros | '(' parametros ')' )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==ID||LA13_0==TIPO_REF||LA13_0==29) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==28) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;

                    }
                    switch (alt13) {
                        case 1 :
                            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:83:31: parametros
                            {
                            pushFollow(FOLLOW_parametros_in_membroClasse661);
                            parametros49=parametros();

                            state._fsp--;

                            stream_parametros.add(parametros49.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:83:44: '(' parametros ')'
                            {
                            char_literal50=(Token)match(input,28,FOLLOW_28_in_membroClasse665);  
                            stream_28.add(char_literal50);


                            pushFollow(FOLLOW_parametros_in_membroClasse667);
                            parametros51=parametros();

                            state._fsp--;

                            stream_parametros.add(parametros51.getTree());

                            char_literal52=(Token)match(input,30,FOLLOW_30_in_membroClasse669);  
                            stream_30.add(char_literal52);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_tipo_in_membroClasse676);
                    ret=tipo();

                    state._fsp--;

                    stream_tipo.add(ret.getTree());

                    NEWLINE53=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_membroClasse678);  
                    stream_NEWLINE.add(NEWLINE53);


                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:83:83: ( limite NEWLINE )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==35) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:83:84: limite NEWLINE
                            {
                            pushFollow(FOLLOW_limite_in_membroClasse681);
                            limite54=limite();

                            state._fsp--;

                            stream_limite.add(limite54.getTree());

                            NEWLINE55=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_membroClasse683);  
                            stream_NEWLINE.add(NEWLINE55);


                            }
                            break;

                    }


                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:83:101: ( operacao )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==ID||LA15_0==NEWLINE||(LA15_0 >= 40 && LA15_0 <= 105)) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:83:101: operacao
                    	    {
                    	    pushFollow(FOLLOW_operacao_in_membroClasse687);
                    	    operacao56=operacao();

                    	    state._fsp--;

                    	    stream_operacao.add(operacao56.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    string_literal57=(Token)match(input,33,FOLLOW_33_in_membroClasse690);  
                    stream_33.add(string_literal57);


                    // AST REWRITE
                    // elements: operacao, ret, limite, parametros, ID
                    // token labels: 
                    // rule labels: ret, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_ret=new RewriteRuleSubtreeStream(adaptor,"rule ret",ret!=null?ret.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BytecodesAST)adaptor.nil();
                    // 84:9: -> ^( METHOD_DECL ID $ret parametros ( limite )? ^( BODY ( operacao )* ) )
                    {
                        // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:84:12: ^( METHOD_DECL ID $ret parametros ( limite )? ^( BODY ( operacao )* ) )
                        {
                        BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                        root_1 = (BytecodesAST)adaptor.becomeRoot(
                        (BytecodesAST)adaptor.create(METHOD_DECL, "METHOD_DECL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, stream_ret.nextTree());

                        adaptor.addChild(root_1, stream_parametros.nextTree());

                        // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:84:45: ( limite )?
                        if ( stream_limite.hasNext() ) {
                            adaptor.addChild(root_1, stream_limite.nextTree());

                        }
                        stream_limite.reset();

                        // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:84:53: ^( BODY ( operacao )* )
                        {
                        BytecodesAST root_2 = (BytecodesAST)adaptor.nil();
                        root_2 = (BytecodesAST)adaptor.becomeRoot(
                        (BytecodesAST)adaptor.create(BODY, "BODY")
                        , root_2);

                        // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:84:60: ( operacao )*
                        while ( stream_operacao.hasNext() ) {
                            adaptor.addChild(root_2, stream_operacao.nextTree());

                        }
                        stream_operacao.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (BytecodesAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BytecodesAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "membroClasse"


    public static class limite_return extends ParserRuleReturnScope {
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "limite"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:87:1: limite : '.limit locals' INTEIRO -> ^( LIMIT INTEIRO ) ;
    public final AssemblerParser.limite_return limite() throws RecognitionException {
        AssemblerParser.limite_return retval = new AssemblerParser.limite_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token string_literal58=null;
        Token INTEIRO59=null;

        BytecodesAST string_literal58_tree=null;
        BytecodesAST INTEIRO59_tree=null;
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_INTEIRO=new RewriteRuleTokenStream(adaptor,"token INTEIRO");

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:87:8: ( '.limit locals' INTEIRO -> ^( LIMIT INTEIRO ) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:87:11: '.limit locals' INTEIRO
            {
            string_literal58=(Token)match(input,35,FOLLOW_35_in_limite739);  
            stream_35.add(string_literal58);


            INTEIRO59=(Token)match(input,INTEIRO,FOLLOW_INTEIRO_in_limite741);  
            stream_INTEIRO.add(INTEIRO59);


            // AST REWRITE
            // elements: INTEIRO
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BytecodesAST)adaptor.nil();
            // 87:35: -> ^( LIMIT INTEIRO )
            {
                // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:87:38: ^( LIMIT INTEIRO )
                {
                BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                root_1 = (BytecodesAST)adaptor.becomeRoot(
                (BytecodesAST)adaptor.create(LIMIT, "LIMIT")
                , root_1);

                adaptor.addChild(root_1, 
                stream_INTEIRO.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (BytecodesAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BytecodesAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "limite"


    public static class parametros_return extends ParserRuleReturnScope {
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parametros"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:89:1: parametros : ( '()' -> ^( PARAMS VOID ) | (a= ID |a= TIPO_REF )+ -> ( ^( PARAMS $a) )+ );
    public final AssemblerParser.parametros_return parametros() throws RecognitionException {
        AssemblerParser.parametros_return retval = new AssemblerParser.parametros_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;
        Token string_literal60=null;

        BytecodesAST a_tree=null;
        BytecodesAST string_literal60_tree=null;
        RewriteRuleTokenStream stream_TIPO_REF=new RewriteRuleTokenStream(adaptor,"token TIPO_REF");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:90:2: ( '()' -> ^( PARAMS VOID ) | (a= ID |a= TIPO_REF )+ -> ( ^( PARAMS $a) )+ )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            else if ( (LA18_0==ID||LA18_0==TIPO_REF) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:90:4: '()'
                    {
                    string_literal60=(Token)match(input,29,FOLLOW_29_in_parametros763);  
                    stream_29.add(string_literal60);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BytecodesAST)adaptor.nil();
                    // 90:9: -> ^( PARAMS VOID )
                    {
                        // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:90:12: ^( PARAMS VOID )
                        {
                        BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                        root_1 = (BytecodesAST)adaptor.becomeRoot(
                        (BytecodesAST)adaptor.create(PARAMS, "PARAMS")
                        , root_1);

                        adaptor.addChild(root_1, 
                        (BytecodesAST)adaptor.create(VOID, "VOID")
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:91:4: (a= ID |a= TIPO_REF )+
                    {
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:91:4: (a= ID |a= TIPO_REF )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=3;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==TIPO_REF) ) {
                            int LA17_2 = input.LA(2);

                            if ( (LA17_2==ID||LA17_2==INT||(LA17_2 >= TIPO_REF && LA17_2 <= VOID)||LA17_2==30) ) {
                                alt17=2;
                            }


                        }
                        else if ( (LA17_0==ID) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:92:9: a= ID
                    	    {
                    	    a=(Token)match(input,ID,FOLLOW_ID_in_parametros790);  
                    	    stream_ID.add(a);


                    	    }
                    	    break;
                    	case 2 :
                    	    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:93:9: a= TIPO_REF
                    	    {
                    	    a=(Token)match(input,TIPO_REF,FOLLOW_TIPO_REF_in_parametros805);  
                    	    stream_TIPO_REF.add(a);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);


                    // AST REWRITE
                    // elements: a
                    // token labels: a
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_a=new RewriteRuleTokenStream(adaptor,"token a",a);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BytecodesAST)adaptor.nil();
                    // 95:4: -> ( ^( PARAMS $a) )+
                    {
                        if ( !(stream_a.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_a.hasNext() ) {
                            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:95:7: ^( PARAMS $a)
                            {
                            BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                            root_1 = (BytecodesAST)adaptor.becomeRoot(
                            (BytecodesAST)adaptor.create(PARAMS, "PARAMS")
                            , root_1);

                            adaptor.addChild(root_1, stream_a.nextNode());

                            adaptor.addChild(root_0, root_1);
                            }

                        }
                        stream_a.reset();

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (BytecodesAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BytecodesAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "parametros"


    public static class retorno_return extends ParserRuleReturnScope {
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "retorno"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:98:1: retorno : ( 'areturn' | 'ireturn' | 'return' );
    public final AssemblerParser.retorno_return retorno() throws RecognitionException {
        AssemblerParser.retorno_return retval = new AssemblerParser.retorno_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token set61=null;

        BytecodesAST set61_tree=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:98:9: ( 'areturn' | 'ireturn' | 'return' )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:
            {
            root_0 = (BytecodesAST)adaptor.nil();


            set61=(Token)input.LT(1);

            if ( input.LA(1)==46||input.LA(1)==90||input.LA(1)==105 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (BytecodesAST)adaptor.create(set61)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (BytecodesAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BytecodesAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "retorno"


    public static class manipulacaoObjetos_return extends ParserRuleReturnScope {
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "manipulacaoObjetos"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:100:1: manipulacaoObjetos : (a= 'getfield' b= campo tipo -> ^( 'getfield' $b tipo ) |a= 'getstatic' b= campo tipo -> ^( 'getstatic' $b tipo ) |a= 'putfield' b= campo tipo -> ^( 'putfield' $b tipo ) |a= 'putstatic' b= campo tipo -> ^( 'putstatic' $b tipo ) |a= 'invokespecial' c= classe '/' d= chamadaMetodo -> ^( 'invokespecial' $c $d) |a= 'invokestatic' c= classe '/' d= chamadaMetodo -> ^( 'invokestatic' $c $d) |a= 'new' c= classe -> ^( 'new' $c) );
    public final AssemblerParser.manipulacaoObjetos_return manipulacaoObjetos() throws RecognitionException {
        AssemblerParser.manipulacaoObjetos_return retval = new AssemblerParser.manipulacaoObjetos_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;
        Token char_literal66=null;
        Token char_literal67=null;
        AssemblerParser.campo_return b =null;

        AssemblerParser.classe_return c =null;

        AssemblerParser.chamadaMetodo_return d =null;

        AssemblerParser.tipo_return tipo62 =null;

        AssemblerParser.tipo_return tipo63 =null;

        AssemblerParser.tipo_return tipo64 =null;

        AssemblerParser.tipo_return tipo65 =null;


        BytecodesAST a_tree=null;
        BytecodesAST char_literal66_tree=null;
        BytecodesAST char_literal67_tree=null;
        RewriteRuleTokenStream stream_104=new RewriteRuleTokenStream(adaptor,"token 104");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_103=new RewriteRuleTokenStream(adaptor,"token 103");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_classe=new RewriteRuleSubtreeStream(adaptor,"rule classe");
        RewriteRuleSubtreeStream stream_campo=new RewriteRuleSubtreeStream(adaptor,"rule campo");
        RewriteRuleSubtreeStream stream_chamadaMetodo=new RewriteRuleSubtreeStream(adaptor,"rule chamadaMetodo");
        RewriteRuleSubtreeStream stream_tipo=new RewriteRuleSubtreeStream(adaptor,"rule tipo");
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:100:20: (a= 'getfield' b= campo tipo -> ^( 'getfield' $b tipo ) |a= 'getstatic' b= campo tipo -> ^( 'getstatic' $b tipo ) |a= 'putfield' b= campo tipo -> ^( 'putfield' $b tipo ) |a= 'putstatic' b= campo tipo -> ^( 'putstatic' $b tipo ) |a= 'invokespecial' c= classe '/' d= chamadaMetodo -> ^( 'invokespecial' $c $d) |a= 'invokestatic' c= classe '/' d= chamadaMetodo -> ^( 'invokestatic' $c $d) |a= 'new' c= classe -> ^( 'new' $c) )
            int alt19=7;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt19=1;
                }
                break;
            case 54:
                {
                alt19=2;
                }
                break;
            case 103:
                {
                alt19=3;
                }
                break;
            case 104:
                {
                alt19=4;
                }
                break;
            case 86:
                {
                alt19=5;
                }
                break;
            case 87:
                {
                alt19=6;
                }
                break;
            case 99:
                {
                alt19=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }

            switch (alt19) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:100:22: a= 'getfield' b= campo tipo
                    {
                    a=(Token)match(input,53,FOLLOW_53_in_manipulacaoObjetos867);  
                    stream_53.add(a);


                    pushFollow(FOLLOW_campo_in_manipulacaoObjetos873);
                    b=campo();

                    state._fsp--;

                    stream_campo.add(b.getTree());

                    pushFollow(FOLLOW_tipo_in_manipulacaoObjetos875);
                    tipo62=tipo();

                    state._fsp--;

                    stream_tipo.add(tipo62.getTree());

                    // AST REWRITE
                    // elements: b, 53, tipo
                    // token labels: 
                    // rule labels: retval, b
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);

                    root_0 = (BytecodesAST)adaptor.nil();
                    // 100:52: -> ^( 'getfield' $b tipo )
                    {
                        // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:100:55: ^( 'getfield' $b tipo )
                        {
                        BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                        root_1 = (BytecodesAST)adaptor.becomeRoot(
                        stream_53.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_b.nextTree());

                        adaptor.addChild(root_1, stream_tipo.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:101:8: a= 'getstatic' b= campo tipo
                    {
                    a=(Token)match(input,54,FOLLOW_54_in_manipulacaoObjetos899);  
                    stream_54.add(a);


                    pushFollow(FOLLOW_campo_in_manipulacaoObjetos905);
                    b=campo();

                    state._fsp--;

                    stream_campo.add(b.getTree());

                    pushFollow(FOLLOW_tipo_in_manipulacaoObjetos907);
                    tipo63=tipo();

                    state._fsp--;

                    stream_tipo.add(tipo63.getTree());

                    // AST REWRITE
                    // elements: b, 54, tipo
                    // token labels: 
                    // rule labels: retval, b
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);

                    root_0 = (BytecodesAST)adaptor.nil();
                    // 101:39: -> ^( 'getstatic' $b tipo )
                    {
                        // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:101:42: ^( 'getstatic' $b tipo )
                        {
                        BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                        root_1 = (BytecodesAST)adaptor.becomeRoot(
                        stream_54.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_b.nextTree());

                        adaptor.addChild(root_1, stream_tipo.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:102:22: a= 'putfield' b= campo tipo
                    {
                    a=(Token)match(input,103,FOLLOW_103_in_manipulacaoObjetos945);  
                    stream_103.add(a);


                    pushFollow(FOLLOW_campo_in_manipulacaoObjetos951);
                    b=campo();

                    state._fsp--;

                    stream_campo.add(b.getTree());

                    pushFollow(FOLLOW_tipo_in_manipulacaoObjetos953);
                    tipo64=tipo();

                    state._fsp--;

                    stream_tipo.add(tipo64.getTree());

                    // AST REWRITE
                    // elements: b, tipo, 103
                    // token labels: 
                    // rule labels: retval, b
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);

                    root_0 = (BytecodesAST)adaptor.nil();
                    // 102:52: -> ^( 'putfield' $b tipo )
                    {
                        // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:102:55: ^( 'putfield' $b tipo )
                        {
                        BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                        root_1 = (BytecodesAST)adaptor.becomeRoot(
                        stream_103.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_b.nextTree());

                        adaptor.addChild(root_1, stream_tipo.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:103:22: a= 'putstatic' b= campo tipo
                    {
                    a=(Token)match(input,104,FOLLOW_104_in_manipulacaoObjetos991);  
                    stream_104.add(a);


                    pushFollow(FOLLOW_campo_in_manipulacaoObjetos997);
                    b=campo();

                    state._fsp--;

                    stream_campo.add(b.getTree());

                    pushFollow(FOLLOW_tipo_in_manipulacaoObjetos999);
                    tipo65=tipo();

                    state._fsp--;

                    stream_tipo.add(tipo65.getTree());

                    // AST REWRITE
                    // elements: 104, tipo, b
                    // token labels: 
                    // rule labels: retval, b
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);

                    root_0 = (BytecodesAST)adaptor.nil();
                    // 103:53: -> ^( 'putstatic' $b tipo )
                    {
                        // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:103:56: ^( 'putstatic' $b tipo )
                        {
                        BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                        root_1 = (BytecodesAST)adaptor.becomeRoot(
                        stream_104.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_b.nextTree());

                        adaptor.addChild(root_1, stream_tipo.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:104:22: a= 'invokespecial' c= classe '/' d= chamadaMetodo
                    {
                    a=(Token)match(input,86,FOLLOW_86_in_manipulacaoObjetos1037);  
                    stream_86.add(a);


                    pushFollow(FOLLOW_classe_in_manipulacaoObjetos1043);
                    c=classe();

                    state._fsp--;

                    stream_classe.add(c.getTree());

                    char_literal66=(Token)match(input,38,FOLLOW_38_in_manipulacaoObjetos1045);  
                    stream_38.add(char_literal66);


                    pushFollow(FOLLOW_chamadaMetodo_in_manipulacaoObjetos1051);
                    d=chamadaMetodo();

                    state._fsp--;

                    stream_chamadaMetodo.add(d.getTree());

                    // AST REWRITE
                    // elements: d, c, 86
                    // token labels: 
                    // rule labels: retval, d, c
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_d=new RewriteRuleSubtreeStream(adaptor,"rule d",d!=null?d.tree:null);
                    RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.tree:null);

                    root_0 = (BytecodesAST)adaptor.nil();
                    // 105:23: -> ^( 'invokespecial' $c $d)
                    {
                        // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:105:26: ^( 'invokespecial' $c $d)
                        {
                        BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                        root_1 = (BytecodesAST)adaptor.becomeRoot(
                        stream_86.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_c.nextTree());

                        adaptor.addChild(root_1, stream_d.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:106:22: a= 'invokestatic' c= classe '/' d= chamadaMetodo
                    {
                    a=(Token)match(input,87,FOLLOW_87_in_manipulacaoObjetos1112);  
                    stream_87.add(a);


                    pushFollow(FOLLOW_classe_in_manipulacaoObjetos1118);
                    c=classe();

                    state._fsp--;

                    stream_classe.add(c.getTree());

                    char_literal67=(Token)match(input,38,FOLLOW_38_in_manipulacaoObjetos1120);  
                    stream_38.add(char_literal67);


                    pushFollow(FOLLOW_chamadaMetodo_in_manipulacaoObjetos1126);
                    d=chamadaMetodo();

                    state._fsp--;

                    stream_chamadaMetodo.add(d.getTree());

                    // AST REWRITE
                    // elements: c, d, 87
                    // token labels: 
                    // rule labels: retval, d, c
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_d=new RewriteRuleSubtreeStream(adaptor,"rule d",d!=null?d.tree:null);
                    RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.tree:null);

                    root_0 = (BytecodesAST)adaptor.nil();
                    // 107:23: -> ^( 'invokestatic' $c $d)
                    {
                        // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:107:26: ^( 'invokestatic' $c $d)
                        {
                        BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                        root_1 = (BytecodesAST)adaptor.becomeRoot(
                        stream_87.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_c.nextTree());

                        adaptor.addChild(root_1, stream_d.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 7 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:108:22: a= 'new' c= classe
                    {
                    a=(Token)match(input,99,FOLLOW_99_in_manipulacaoObjetos1187);  
                    stream_99.add(a);


                    pushFollow(FOLLOW_classe_in_manipulacaoObjetos1192);
                    c=classe();

                    state._fsp--;

                    stream_classe.add(c.getTree());

                    // AST REWRITE
                    // elements: c, 99
                    // token labels: 
                    // rule labels: retval, c
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.tree:null);

                    root_0 = (BytecodesAST)adaptor.nil();
                    // 108:42: -> ^( 'new' $c)
                    {
                        // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:108:45: ^( 'new' $c)
                        {
                        BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                        root_1 = (BytecodesAST)adaptor.becomeRoot(
                        stream_99.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_c.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (BytecodesAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BytecodesAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "manipulacaoObjetos"


    public static class tipo_return extends ParserRuleReturnScope {
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tipo"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:112:1: tipo : ( INT | VOID | TIPO_REF );
    public final AssemblerParser.tipo_return tipo() throws RecognitionException {
        AssemblerParser.tipo_return retval = new AssemblerParser.tipo_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token set68=null;

        BytecodesAST set68_tree=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:112:6: ( INT | VOID | TIPO_REF )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:
            {
            root_0 = (BytecodesAST)adaptor.nil();


            set68=(Token)input.LT(1);

            if ( input.LA(1)==INT||(input.LA(1) >= TIPO_REF && input.LA(1) <= VOID) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (BytecodesAST)adaptor.create(set68)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (BytecodesAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BytecodesAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "tipo"


    public static class aritmetica_return extends ParserRuleReturnScope {
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "aritmetica"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:114:1: aritmetica : (a= 'iadd' |a= 'isub' |a= 'imul' |a= 'idiv' |a= 'irem' |a= 'iinc' |a= 'ineg' ) -> ^( ARITMETICA $a) ;
    public final AssemblerParser.aritmetica_return aritmetica() throws RecognitionException {
        AssemblerParser.aritmetica_return retval = new AssemblerParser.aritmetica_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;

        BytecodesAST a_tree=null;
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:114:12: ( (a= 'iadd' |a= 'isub' |a= 'imul' |a= 'idiv' |a= 'irem' |a= 'iinc' |a= 'ineg' ) -> ^( ARITMETICA $a) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:114:14: (a= 'iadd' |a= 'isub' |a= 'imul' |a= 'idiv' |a= 'irem' |a= 'iinc' |a= 'ineg' )
            {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:114:14: (a= 'iadd' |a= 'isub' |a= 'imul' |a= 'idiv' |a= 'irem' |a= 'iinc' |a= 'ineg' )
            int alt20=7;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt20=1;
                }
                break;
            case 96:
                {
                alt20=2;
                }
                break;
            case 84:
                {
                alt20=3;
                }
                break;
            case 65:
                {
                alt20=4;
                }
                break;
            case 89:
                {
                alt20=5;
                }
                break;
            case 78:
                {
                alt20=6;
                }
                break;
            case 85:
                {
                alt20=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }

            switch (alt20) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:114:16: a= 'iadd'
                    {
                    a=(Token)match(input,56,FOLLOW_56_in_aritmetica1270);  
                    stream_56.add(a);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:115:19: a= 'isub'
                    {
                    a=(Token)match(input,96,FOLLOW_96_in_aritmetica1294);  
                    stream_96.add(a);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:116:19: a= 'imul'
                    {
                    a=(Token)match(input,84,FOLLOW_84_in_aritmetica1318);  
                    stream_84.add(a);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:117:19: a= 'idiv'
                    {
                    a=(Token)match(input,65,FOLLOW_65_in_aritmetica1342);  
                    stream_65.add(a);


                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:118:19: a= 'irem'
                    {
                    a=(Token)match(input,89,FOLLOW_89_in_aritmetica1366);  
                    stream_89.add(a);


                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:119:19: a= 'iinc'
                    {
                    a=(Token)match(input,78,FOLLOW_78_in_aritmetica1390);  
                    stream_78.add(a);


                    }
                    break;
                case 7 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:120:19: a= 'ineg'
                    {
                    a=(Token)match(input,85,FOLLOW_85_in_aritmetica1414);  
                    stream_85.add(a);


                    }
                    break;

            }


            // AST REWRITE
            // elements: a
            // token labels: a
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_a=new RewriteRuleTokenStream(adaptor,"token a",a);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BytecodesAST)adaptor.nil();
            // 122:14: -> ^( ARITMETICA $a)
            {
                // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:122:17: ^( ARITMETICA $a)
                {
                BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                root_1 = (BytecodesAST)adaptor.becomeRoot(
                (BytecodesAST)adaptor.create(ARITMETICA, "ARITMETICA")
                , root_1);

                adaptor.addChild(root_1, stream_a.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (BytecodesAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BytecodesAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "aritmetica"


    public static class load_return extends ParserRuleReturnScope {
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "load"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:125:1: load : (a= 'iconst_m1' |a= 'iconst_0' |a= 'iconst_1' |a= 'iconst_2' |a= 'iconst_3' |a= 'iconst_4' |a= 'iconst_5' |a= 'aconst_null' |a= 'iload_0' |a= 'iload_1' |a= 'iload_2' |a= 'iload_3' |a= 'aload_0' |a= 'aload_1' |a= 'aload_2' |a= 'aload_3' ) -> ^( LOAD $a) ;
    public final AssemblerParser.load_return load() throws RecognitionException {
        AssemblerParser.load_return retval = new AssemblerParser.load_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;

        BytecodesAST a_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:125:6: ( (a= 'iconst_m1' |a= 'iconst_0' |a= 'iconst_1' |a= 'iconst_2' |a= 'iconst_3' |a= 'iconst_4' |a= 'iconst_5' |a= 'aconst_null' |a= 'iload_0' |a= 'iload_1' |a= 'iload_2' |a= 'iload_3' |a= 'aload_0' |a= 'aload_1' |a= 'aload_2' |a= 'aload_3' ) -> ^( LOAD $a) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:125:8: (a= 'iconst_m1' |a= 'iconst_0' |a= 'iconst_1' |a= 'iconst_2' |a= 'iconst_3' |a= 'iconst_4' |a= 'iconst_5' |a= 'aconst_null' |a= 'iload_0' |a= 'iload_1' |a= 'iload_2' |a= 'iload_3' |a= 'aload_0' |a= 'aload_1' |a= 'aload_2' |a= 'aload_3' )
            {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:125:8: (a= 'iconst_m1' |a= 'iconst_0' |a= 'iconst_1' |a= 'iconst_2' |a= 'iconst_3' |a= 'iconst_4' |a= 'iconst_5' |a= 'aconst_null' |a= 'iload_0' |a= 'iload_1' |a= 'iload_2' |a= 'iload_3' |a= 'aload_0' |a= 'aload_1' |a= 'aload_2' |a= 'aload_3' )
            int alt21=16;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt21=1;
                }
                break;
            case 58:
                {
                alt21=2;
                }
                break;
            case 59:
                {
                alt21=3;
                }
                break;
            case 60:
                {
                alt21=4;
                }
                break;
            case 61:
                {
                alt21=5;
                }
                break;
            case 62:
                {
                alt21=6;
                }
                break;
            case 63:
                {
                alt21=7;
                }
                break;
            case 40:
                {
                alt21=8;
                }
                break;
            case 80:
                {
                alt21=9;
                }
                break;
            case 81:
                {
                alt21=10;
                }
                break;
            case 82:
                {
                alt21=11;
                }
                break;
            case 83:
                {
                alt21=12;
                }
                break;
            case 42:
                {
                alt21=13;
                }
                break;
            case 43:
                {
                alt21=14;
                }
                break;
            case 44:
                {
                alt21=15;
                }
                break;
            case 45:
                {
                alt21=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }

            switch (alt21) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:125:10: a= 'iconst_m1'
                    {
                    a=(Token)match(input,64,FOLLOW_64_in_load1488);  
                    stream_64.add(a);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:126:13: a= 'iconst_0'
                    {
                    a=(Token)match(input,58,FOLLOW_58_in_load1506);  
                    stream_58.add(a);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:127:13: a= 'iconst_1'
                    {
                    a=(Token)match(input,59,FOLLOW_59_in_load1524);  
                    stream_59.add(a);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:128:13: a= 'iconst_2'
                    {
                    a=(Token)match(input,60,FOLLOW_60_in_load1542);  
                    stream_60.add(a);


                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:129:13: a= 'iconst_3'
                    {
                    a=(Token)match(input,61,FOLLOW_61_in_load1560);  
                    stream_61.add(a);


                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:130:13: a= 'iconst_4'
                    {
                    a=(Token)match(input,62,FOLLOW_62_in_load1578);  
                    stream_62.add(a);


                    }
                    break;
                case 7 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:131:13: a= 'iconst_5'
                    {
                    a=(Token)match(input,63,FOLLOW_63_in_load1596);  
                    stream_63.add(a);


                    }
                    break;
                case 8 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:132:13: a= 'aconst_null'
                    {
                    a=(Token)match(input,40,FOLLOW_40_in_load1614);  
                    stream_40.add(a);


                    }
                    break;
                case 9 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:133:13: a= 'iload_0'
                    {
                    a=(Token)match(input,80,FOLLOW_80_in_load1632);  
                    stream_80.add(a);


                    }
                    break;
                case 10 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:134:13: a= 'iload_1'
                    {
                    a=(Token)match(input,81,FOLLOW_81_in_load1650);  
                    stream_81.add(a);


                    }
                    break;
                case 11 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:135:13: a= 'iload_2'
                    {
                    a=(Token)match(input,82,FOLLOW_82_in_load1668);  
                    stream_82.add(a);


                    }
                    break;
                case 12 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:136:13: a= 'iload_3'
                    {
                    a=(Token)match(input,83,FOLLOW_83_in_load1686);  
                    stream_83.add(a);


                    }
                    break;
                case 13 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:137:13: a= 'aload_0'
                    {
                    a=(Token)match(input,42,FOLLOW_42_in_load1704);  
                    stream_42.add(a);


                    }
                    break;
                case 14 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:138:13: a= 'aload_1'
                    {
                    a=(Token)match(input,43,FOLLOW_43_in_load1722);  
                    stream_43.add(a);


                    }
                    break;
                case 15 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:139:13: a= 'aload_2'
                    {
                    a=(Token)match(input,44,FOLLOW_44_in_load1740);  
                    stream_44.add(a);


                    }
                    break;
                case 16 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:140:13: a= 'aload_3'
                    {
                    a=(Token)match(input,45,FOLLOW_45_in_load1758);  
                    stream_45.add(a);


                    }
                    break;

            }


            // AST REWRITE
            // elements: a
            // token labels: a
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_a=new RewriteRuleTokenStream(adaptor,"token a",a);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BytecodesAST)adaptor.nil();
            // 142:8: -> ^( LOAD $a)
            {
                // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:142:11: ^( LOAD $a)
                {
                BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                root_1 = (BytecodesAST)adaptor.becomeRoot(
                (BytecodesAST)adaptor.create(LOAD, "LOAD")
                , root_1);

                adaptor.addChild(root_1, stream_a.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (BytecodesAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BytecodesAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "load"


    public static class loadint_return extends ParserRuleReturnScope {
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "loadint"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:145:1: loadint : (a= 'iload' b= INTEIRO |a= 'ldc' b= INTEIRO |a= 'aload' b= INTEIRO ) -> ^( LOAD $a $b) ;
    public final AssemblerParser.loadint_return loadint() throws RecognitionException {
        AssemblerParser.loadint_return retval = new AssemblerParser.loadint_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;
        Token b=null;

        BytecodesAST a_tree=null;
        BytecodesAST b_tree=null;
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_INTEIRO=new RewriteRuleTokenStream(adaptor,"token INTEIRO");

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:145:9: ( (a= 'iload' b= INTEIRO |a= 'ldc' b= INTEIRO |a= 'aload' b= INTEIRO ) -> ^( LOAD $a $b) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:145:11: (a= 'iload' b= INTEIRO |a= 'ldc' b= INTEIRO |a= 'aload' b= INTEIRO )
            {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:145:11: (a= 'iload' b= INTEIRO |a= 'ldc' b= INTEIRO |a= 'aload' b= INTEIRO )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt22=1;
                }
                break;
            case 98:
                {
                alt22=2;
                }
                break;
            case 41:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }

            switch (alt22) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:145:13: a= 'iload' b= INTEIRO
                    {
                    a=(Token)match(input,79,FOLLOW_79_in_loadint1808);  
                    stream_79.add(a);


                    b=(Token)match(input,INTEIRO,FOLLOW_INTEIRO_in_loadint1814);  
                    stream_INTEIRO.add(b);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:146:15: a= 'ldc' b= INTEIRO
                    {
                    a=(Token)match(input,98,FOLLOW_98_in_loadint1834);  
                    stream_98.add(a);


                    b=(Token)match(input,INTEIRO,FOLLOW_INTEIRO_in_loadint1840);  
                    stream_INTEIRO.add(b);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:147:15: a= 'aload' b= INTEIRO
                    {
                    a=(Token)match(input,41,FOLLOW_41_in_loadint1860);  
                    stream_41.add(a);


                    b=(Token)match(input,INTEIRO,FOLLOW_INTEIRO_in_loadint1866);  
                    stream_INTEIRO.add(b);


                    }
                    break;

            }


            // AST REWRITE
            // elements: a, b
            // token labels: b, a
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_b=new RewriteRuleTokenStream(adaptor,"token b",b);
            RewriteRuleTokenStream stream_a=new RewriteRuleTokenStream(adaptor,"token a",a);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BytecodesAST)adaptor.nil();
            // 149:11: -> ^( LOAD $a $b)
            {
                // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:149:14: ^( LOAD $a $b)
                {
                BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                root_1 = (BytecodesAST)adaptor.becomeRoot(
                (BytecodesAST)adaptor.create(LOAD, "LOAD")
                , root_1);

                adaptor.addChild(root_1, stream_a.nextNode());

                adaptor.addChild(root_1, stream_b.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (BytecodesAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BytecodesAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "loadint"


    public static class store_return extends ParserRuleReturnScope {
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "store"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:152:1: store : (a= 'istore_0' |a= 'istore_1' |a= 'istore_2' |a= 'istore_3' |a= 'astore_0' |a= 'astore_1' |a= 'astore_2' |a= 'astore_3' ) -> ^( STORE $a) ;
    public final AssemblerParser.store_return store() throws RecognitionException {
        AssemblerParser.store_return retval = new AssemblerParser.store_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;

        BytecodesAST a_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:152:7: ( (a= 'istore_0' |a= 'istore_1' |a= 'istore_2' |a= 'istore_3' |a= 'astore_0' |a= 'astore_1' |a= 'astore_2' |a= 'astore_3' ) -> ^( STORE $a) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:152:9: (a= 'istore_0' |a= 'istore_1' |a= 'istore_2' |a= 'istore_3' |a= 'astore_0' |a= 'astore_1' |a= 'astore_2' |a= 'astore_3' )
            {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:152:9: (a= 'istore_0' |a= 'istore_1' |a= 'istore_2' |a= 'istore_3' |a= 'astore_0' |a= 'astore_1' |a= 'astore_2' |a= 'astore_3' )
            int alt23=8;
            switch ( input.LA(1) ) {
            case 92:
                {
                alt23=1;
                }
                break;
            case 93:
                {
                alt23=2;
                }
                break;
            case 94:
                {
                alt23=3;
                }
                break;
            case 95:
                {
                alt23=4;
                }
                break;
            case 48:
                {
                alt23=5;
                }
                break;
            case 49:
                {
                alt23=6;
                }
                break;
            case 50:
                {
                alt23=7;
                }
                break;
            case 51:
                {
                alt23=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }

            switch (alt23) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:152:11: a= 'istore_0'
                    {
                    a=(Token)match(input,92,FOLLOW_92_in_store1928);  
                    stream_92.add(a);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:153:13: a= 'istore_1'
                    {
                    a=(Token)match(input,93,FOLLOW_93_in_store1946);  
                    stream_93.add(a);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:154:13: a= 'istore_2'
                    {
                    a=(Token)match(input,94,FOLLOW_94_in_store1964);  
                    stream_94.add(a);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:155:13: a= 'istore_3'
                    {
                    a=(Token)match(input,95,FOLLOW_95_in_store1982);  
                    stream_95.add(a);


                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:156:13: a= 'astore_0'
                    {
                    a=(Token)match(input,48,FOLLOW_48_in_store2000);  
                    stream_48.add(a);


                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:157:13: a= 'astore_1'
                    {
                    a=(Token)match(input,49,FOLLOW_49_in_store2018);  
                    stream_49.add(a);


                    }
                    break;
                case 7 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:158:13: a= 'astore_2'
                    {
                    a=(Token)match(input,50,FOLLOW_50_in_store2036);  
                    stream_50.add(a);


                    }
                    break;
                case 8 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:159:13: a= 'astore_3'
                    {
                    a=(Token)match(input,51,FOLLOW_51_in_store2054);  
                    stream_51.add(a);


                    }
                    break;

            }


            // AST REWRITE
            // elements: a
            // token labels: a
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_a=new RewriteRuleTokenStream(adaptor,"token a",a);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BytecodesAST)adaptor.nil();
            // 161:9: -> ^( STORE $a)
            {
                // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:161:12: ^( STORE $a)
                {
                BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                root_1 = (BytecodesAST)adaptor.becomeRoot(
                (BytecodesAST)adaptor.create(STORE, "STORE")
                , root_1);

                adaptor.addChild(root_1, stream_a.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (BytecodesAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BytecodesAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "store"


    public static class storeint_return extends ParserRuleReturnScope {
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "storeint"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:164:1: storeint : (a= 'istore' b= INTEIRO |a= 'astore' b= INTEIRO ) -> ^( STORE $a $b) ;
    public final AssemblerParser.storeint_return storeint() throws RecognitionException {
        AssemblerParser.storeint_return retval = new AssemblerParser.storeint_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;
        Token b=null;

        BytecodesAST a_tree=null;
        BytecodesAST b_tree=null;
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_INTEIRO=new RewriteRuleTokenStream(adaptor,"token INTEIRO");

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:164:10: ( (a= 'istore' b= INTEIRO |a= 'astore' b= INTEIRO ) -> ^( STORE $a $b) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:164:12: (a= 'istore' b= INTEIRO |a= 'astore' b= INTEIRO )
            {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:164:12: (a= 'istore' b= INTEIRO |a= 'astore' b= INTEIRO )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==91) ) {
                alt24=1;
            }
            else if ( (LA24_0==47) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:164:14: a= 'istore' b= INTEIRO
                    {
                    a=(Token)match(input,91,FOLLOW_91_in_storeint2108);  
                    stream_91.add(a);


                    b=(Token)match(input,INTEIRO,FOLLOW_INTEIRO_in_storeint2114);  
                    stream_INTEIRO.add(b);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:165:16: a= 'astore' b= INTEIRO
                    {
                    a=(Token)match(input,47,FOLLOW_47_in_storeint2135);  
                    stream_47.add(a);


                    b=(Token)match(input,INTEIRO,FOLLOW_INTEIRO_in_storeint2141);  
                    stream_INTEIRO.add(b);


                    }
                    break;

            }


            // AST REWRITE
            // elements: b, a
            // token labels: b, a
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_b=new RewriteRuleTokenStream(adaptor,"token b",b);
            RewriteRuleTokenStream stream_a=new RewriteRuleTokenStream(adaptor,"token a",a);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BytecodesAST)adaptor.nil();
            // 167:12: -> ^( STORE $a $b)
            {
                // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:167:15: ^( STORE $a $b)
                {
                BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                root_1 = (BytecodesAST)adaptor.becomeRoot(
                (BytecodesAST)adaptor.create(STORE, "STORE")
                , root_1);

                adaptor.addChild(root_1, stream_a.nextNode());

                adaptor.addChild(root_1, stream_b.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (BytecodesAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BytecodesAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "storeint"


    public static class logica_return extends ParserRuleReturnScope {
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logica"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:170:1: logica : (a= 'iand' |a= 'ior' |a= 'ixor' ) -> ^( LOGICA $a) ;
    public final AssemblerParser.logica_return logica() throws RecognitionException {
        AssemblerParser.logica_return retval = new AssemblerParser.logica_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;

        BytecodesAST a_tree=null;
        RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:170:8: ( (a= 'iand' |a= 'ior' |a= 'ixor' ) -> ^( LOGICA $a) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:170:10: (a= 'iand' |a= 'ior' |a= 'ixor' )
            {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:170:10: (a= 'iand' |a= 'ior' |a= 'ixor' )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt25=1;
                }
                break;
            case 88:
                {
                alt25=2;
                }
                break;
            case 97:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }

            switch (alt25) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:170:12: a= 'iand'
                    {
                    a=(Token)match(input,57,FOLLOW_57_in_logica2201);  
                    stream_57.add(a);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:171:14: a= 'ior'
                    {
                    a=(Token)match(input,88,FOLLOW_88_in_logica2220);  
                    stream_88.add(a);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:172:14: a= 'ixor'
                    {
                    a=(Token)match(input,97,FOLLOW_97_in_logica2239);  
                    stream_97.add(a);


                    }
                    break;

            }


            // AST REWRITE
            // elements: a
            // token labels: a
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_a=new RewriteRuleTokenStream(adaptor,"token a",a);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BytecodesAST)adaptor.nil();
            // 174:10: -> ^( LOGICA $a)
            {
                // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:174:13: ^( LOGICA $a)
                {
                BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                root_1 = (BytecodesAST)adaptor.becomeRoot(
                (BytecodesAST)adaptor.create(LOGICA, "LOGICA")
                , root_1);

                adaptor.addChild(root_1, stream_a.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (BytecodesAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BytecodesAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "logica"


    public static class desvio_return extends ParserRuleReturnScope {
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "desvio"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:177:1: desvio : (a= 'ifeq' b= ID |a= 'ifne' b= ID |a= 'iflt' b= ID |a= 'ifge' b= ID |a= 'ifgt' b= ID |a= 'ifle' b= ID |a= 'if_icmpeq' b= ID |a= 'if_icmpne' b= ID |a= 'if_icmplt' b= ID |a= 'if_icmpge' b= ID |a= 'if_icmpgt' b= ID |a= 'if_icmple' b= ID |a= 'goto' b= ID ) -> ^( DESVIO $a $b) ;
    public final AssemblerParser.desvio_return desvio() throws RecognitionException {
        AssemblerParser.desvio_return retval = new AssemblerParser.desvio_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;
        Token b=null;

        BytecodesAST a_tree=null;
        BytecodesAST b_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:177:8: ( (a= 'ifeq' b= ID |a= 'ifne' b= ID |a= 'iflt' b= ID |a= 'ifge' b= ID |a= 'ifgt' b= ID |a= 'ifle' b= ID |a= 'if_icmpeq' b= ID |a= 'if_icmpne' b= ID |a= 'if_icmplt' b= ID |a= 'if_icmpge' b= ID |a= 'if_icmpgt' b= ID |a= 'if_icmple' b= ID |a= 'goto' b= ID ) -> ^( DESVIO $a $b) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:177:10: (a= 'ifeq' b= ID |a= 'ifne' b= ID |a= 'iflt' b= ID |a= 'ifge' b= ID |a= 'ifgt' b= ID |a= 'ifle' b= ID |a= 'if_icmpeq' b= ID |a= 'if_icmpne' b= ID |a= 'if_icmplt' b= ID |a= 'if_icmpge' b= ID |a= 'if_icmpgt' b= ID |a= 'if_icmple' b= ID |a= 'goto' b= ID )
            {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:177:10: (a= 'ifeq' b= ID |a= 'ifne' b= ID |a= 'iflt' b= ID |a= 'ifge' b= ID |a= 'ifgt' b= ID |a= 'ifle' b= ID |a= 'if_icmpeq' b= ID |a= 'if_icmpne' b= ID |a= 'if_icmplt' b= ID |a= 'if_icmpge' b= ID |a= 'if_icmpgt' b= ID |a= 'if_icmple' b= ID |a= 'goto' b= ID )
            int alt26=13;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt26=1;
                }
                break;
            case 77:
                {
                alt26=2;
                }
                break;
            case 76:
                {
                alt26=3;
                }
                break;
            case 73:
                {
                alt26=4;
                }
                break;
            case 74:
                {
                alt26=5;
                }
                break;
            case 75:
                {
                alt26=6;
                }
                break;
            case 66:
                {
                alt26=7;
                }
                break;
            case 71:
                {
                alt26=8;
                }
                break;
            case 70:
                {
                alt26=9;
                }
                break;
            case 67:
                {
                alt26=10;
                }
                break;
            case 68:
                {
                alt26=11;
                }
                break;
            case 69:
                {
                alt26=12;
                }
                break;
            case 55:
                {
                alt26=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }

            switch (alt26) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:177:12: a= 'ifeq' b= ID
                    {
                    a=(Token)match(input,72,FOLLOW_72_in_desvio2290);  
                    stream_72.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio2296);  
                    stream_ID.add(b);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:178:14: a= 'ifne' b= ID
                    {
                    a=(Token)match(input,77,FOLLOW_77_in_desvio2315);  
                    stream_77.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio2321);  
                    stream_ID.add(b);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:179:14: a= 'iflt' b= ID
                    {
                    a=(Token)match(input,76,FOLLOW_76_in_desvio2340);  
                    stream_76.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio2346);  
                    stream_ID.add(b);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:180:14: a= 'ifge' b= ID
                    {
                    a=(Token)match(input,73,FOLLOW_73_in_desvio2365);  
                    stream_73.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio2371);  
                    stream_ID.add(b);


                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:181:14: a= 'ifgt' b= ID
                    {
                    a=(Token)match(input,74,FOLLOW_74_in_desvio2390);  
                    stream_74.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio2396);  
                    stream_ID.add(b);


                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:182:14: a= 'ifle' b= ID
                    {
                    a=(Token)match(input,75,FOLLOW_75_in_desvio2415);  
                    stream_75.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio2421);  
                    stream_ID.add(b);


                    }
                    break;
                case 7 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:183:14: a= 'if_icmpeq' b= ID
                    {
                    a=(Token)match(input,66,FOLLOW_66_in_desvio2440);  
                    stream_66.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio2446);  
                    stream_ID.add(b);


                    }
                    break;
                case 8 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:184:14: a= 'if_icmpne' b= ID
                    {
                    a=(Token)match(input,71,FOLLOW_71_in_desvio2465);  
                    stream_71.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio2471);  
                    stream_ID.add(b);


                    }
                    break;
                case 9 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:185:14: a= 'if_icmplt' b= ID
                    {
                    a=(Token)match(input,70,FOLLOW_70_in_desvio2490);  
                    stream_70.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio2496);  
                    stream_ID.add(b);


                    }
                    break;
                case 10 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:186:14: a= 'if_icmpge' b= ID
                    {
                    a=(Token)match(input,67,FOLLOW_67_in_desvio2515);  
                    stream_67.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio2521);  
                    stream_ID.add(b);


                    }
                    break;
                case 11 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:187:14: a= 'if_icmpgt' b= ID
                    {
                    a=(Token)match(input,68,FOLLOW_68_in_desvio2540);  
                    stream_68.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio2546);  
                    stream_ID.add(b);


                    }
                    break;
                case 12 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:188:14: a= 'if_icmple' b= ID
                    {
                    a=(Token)match(input,69,FOLLOW_69_in_desvio2565);  
                    stream_69.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio2571);  
                    stream_ID.add(b);


                    }
                    break;
                case 13 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:189:14: a= 'goto' b= ID
                    {
                    a=(Token)match(input,55,FOLLOW_55_in_desvio2590);  
                    stream_55.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio2596);  
                    stream_ID.add(b);


                    }
                    break;

            }


            // AST REWRITE
            // elements: b, a
            // token labels: b, a
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_b=new RewriteRuleTokenStream(adaptor,"token b",b);
            RewriteRuleTokenStream stream_a=new RewriteRuleTokenStream(adaptor,"token a",a);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BytecodesAST)adaptor.nil();
            // 191:10: -> ^( DESVIO $a $b)
            {
                // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:191:13: ^( DESVIO $a $b)
                {
                BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                root_1 = (BytecodesAST)adaptor.becomeRoot(
                (BytecodesAST)adaptor.create(DESVIO, "DESVIO")
                , root_1);

                adaptor.addChild(root_1, stream_a.nextNode());

                adaptor.addChild(root_1, stream_b.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (BytecodesAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BytecodesAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "desvio"


    public static class pilha_return extends ParserRuleReturnScope {
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pilha"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:194:1: pilha : (a= 'pop' |a= 'pop2' |a= 'dup' ) -> ^( PILHA $a) ;
    public final AssemblerParser.pilha_return pilha() throws RecognitionException {
        AssemblerParser.pilha_return retval = new AssemblerParser.pilha_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;

        BytecodesAST a_tree=null;
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_102=new RewriteRuleTokenStream(adaptor,"token 102");
        RewriteRuleTokenStream stream_101=new RewriteRuleTokenStream(adaptor,"token 101");

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:194:7: ( (a= 'pop' |a= 'pop2' |a= 'dup' ) -> ^( PILHA $a) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:194:9: (a= 'pop' |a= 'pop2' |a= 'dup' )
            {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:194:9: (a= 'pop' |a= 'pop2' |a= 'dup' )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 101:
                {
                alt27=1;
                }
                break;
            case 102:
                {
                alt27=2;
                }
                break;
            case 52:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }

            switch (alt27) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:194:11: a= 'pop'
                    {
                    a=(Token)match(input,101,FOLLOW_101_in_pilha2657);  
                    stream_101.add(a);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:195:13: a= 'pop2'
                    {
                    a=(Token)match(input,102,FOLLOW_102_in_pilha2675);  
                    stream_102.add(a);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:196:13: a= 'dup'
                    {
                    a=(Token)match(input,52,FOLLOW_52_in_pilha2693);  
                    stream_52.add(a);


                    }
                    break;

            }


            // AST REWRITE
            // elements: a
            // token labels: a
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_a=new RewriteRuleTokenStream(adaptor,"token a",a);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BytecodesAST)adaptor.nil();
            // 198:9: -> ^( PILHA $a)
            {
                // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:198:12: ^( PILHA $a)
                {
                BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                root_1 = (BytecodesAST)adaptor.becomeRoot(
                (BytecodesAST)adaptor.create(PILHA, "PILHA")
                , root_1);

                adaptor.addChild(root_1, stream_a.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (BytecodesAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BytecodesAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "pilha"


    public static class classe_return extends ParserRuleReturnScope {
        public List classe;
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "classe"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:201:1: classe returns [List classe] : (cls+= ID '/' )* (cls+= ID ) ;
    public final AssemblerParser.classe_return classe() throws RecognitionException {
        AssemblerParser.classe_return retval = new AssemblerParser.classe_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token char_literal69=null;
        Token cls=null;
        List list_cls=null;

        BytecodesAST char_literal69_tree=null;
        BytecodesAST cls_tree=null;


                retval.classe = new ArrayList();
             
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:205:6: ( (cls+= ID '/' )* (cls+= ID ) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:205:8: (cls+= ID '/' )* (cls+= ID )
            {
            root_0 = (BytecodesAST)adaptor.nil();


            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:205:8: (cls+= ID '/' )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==ID) ) {
                    int LA28_1 = input.LA(2);

                    if ( (LA28_1==38) ) {
                        int LA28_2 = input.LA(3);

                        if ( (LA28_2==ID) ) {
                            alt28=1;
                        }


                    }


                }


                switch (alt28) {
            	case 1 :
            	    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:205:9: cls+= ID '/'
            	    {
            	    cls=(Token)match(input,ID,FOLLOW_ID_in_classe2759); 
            	    cls_tree = 
            	    (BytecodesAST)adaptor.create(cls)
            	    ;
            	    adaptor.addChild(root_0, cls_tree);

            	    if (list_cls==null) list_cls=new ArrayList();
            	    list_cls.add(cls);


            	    char_literal69=(Token)match(input,38,FOLLOW_38_in_classe2761); 
            	    char_literal69_tree = 
            	    (BytecodesAST)adaptor.create(char_literal69)
            	    ;
            	    adaptor.addChild(root_0, char_literal69_tree);


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:205:25: (cls+= ID )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:205:26: cls+= ID
            {
            cls=(Token)match(input,ID,FOLLOW_ID_in_classe2770); 
            cls_tree = 
            (BytecodesAST)adaptor.create(cls)
            ;
            adaptor.addChild(root_0, cls_tree);

            if (list_cls==null) list_cls=new ArrayList();
            list_cls.add(cls);


            }


            retval.classe = list_cls;

            }

            retval.stop = input.LT(-1);


            retval.tree = (BytecodesAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BytecodesAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "classe"


    public static class chamadaMetodo_return extends ParserRuleReturnScope {
        public String nome;
        public String params;
        public String tipoRetorno;
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "chamadaMetodo"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:208:1: chamadaMetodo returns [String nome, String params, String tipoRetorno] : n= INIT par= '()' tip= VOID ;
    public final AssemblerParser.chamadaMetodo_return chamadaMetodo() throws RecognitionException {
        AssemblerParser.chamadaMetodo_return retval = new AssemblerParser.chamadaMetodo_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token n=null;
        Token par=null;
        Token tip=null;

        BytecodesAST n_tree=null;
        BytecodesAST par_tree=null;
        BytecodesAST tip_tree=null;


                retval.nome = "";
                retval.params = "";
                retval.tipoRetorno = "";
             
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:214:6: (n= INIT par= '()' tip= VOID )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:214:8: n= INIT par= '()' tip= VOID
            {
            root_0 = (BytecodesAST)adaptor.nil();


            n=(Token)match(input,INIT,FOLLOW_INIT_in_chamadaMetodo2810); 
            n_tree = 
            (BytecodesAST)adaptor.create(n)
            ;
            adaptor.addChild(root_0, n_tree);


            par=(Token)match(input,29,FOLLOW_29_in_chamadaMetodo2816); 
            par_tree = 
            (BytecodesAST)adaptor.create(par)
            ;
            adaptor.addChild(root_0, par_tree);


            tip=(Token)match(input,VOID,FOLLOW_VOID_in_chamadaMetodo2822); 
            tip_tree = 
            (BytecodesAST)adaptor.create(tip)
            ;
            adaptor.addChild(root_0, tip_tree);



                         retval.nome = (n!=null?n.getText():null);
                         retval.params = (par!=null?par.getText():null);
                         retval.tipoRetorno = (tip!=null?tip.getText():null);
                    

            }

            retval.stop = input.LT(-1);


            retval.tree = (BytecodesAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BytecodesAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "chamadaMetodo"


    public static class campo_return extends ParserRuleReturnScope {
        public List classe;
        public String campo;
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "campo"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:221:1: campo returns [List classe, String campo] : (cls+= ID '/' )+ cmp= ID ;
    public final AssemblerParser.campo_return campo() throws RecognitionException {
        AssemblerParser.campo_return retval = new AssemblerParser.campo_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token cmp=null;
        Token char_literal70=null;
        Token cls=null;
        List list_cls=null;

        BytecodesAST cmp_tree=null;
        BytecodesAST char_literal70_tree=null;
        BytecodesAST cls_tree=null;


                retval.classe = new ArrayList();
                retval.campo ="";
             
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:226:6: ( (cls+= ID '/' )+ cmp= ID )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:226:8: (cls+= ID '/' )+ cmp= ID
            {
            root_0 = (BytecodesAST)adaptor.nil();


            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:226:8: (cls+= ID '/' )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==ID) ) {
                    int LA29_1 = input.LA(2);

                    if ( (LA29_1==38) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:226:9: cls+= ID '/'
            	    {
            	    cls=(Token)match(input,ID,FOLLOW_ID_in_campo2862); 
            	    cls_tree = 
            	    (BytecodesAST)adaptor.create(cls)
            	    ;
            	    adaptor.addChild(root_0, cls_tree);

            	    if (list_cls==null) list_cls=new ArrayList();
            	    list_cls.add(cls);


            	    char_literal70=(Token)match(input,38,FOLLOW_38_in_campo2864); 
            	    char_literal70_tree = 
            	    (BytecodesAST)adaptor.create(char_literal70)
            	    ;
            	    adaptor.addChild(root_0, char_literal70_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);


            cmp=(Token)match(input,ID,FOLLOW_ID_in_campo2872); 
            cmp_tree = 
            (BytecodesAST)adaptor.create(cmp)
            ;
            adaptor.addChild(root_0, cmp_tree);


            retval.classe = list_cls; retval.campo = (cmp!=null?cmp.getText():null);

            }

            retval.stop = input.LT(-1);


            retval.tree = (BytecodesAST)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (BytecodesAST)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "campo"

    // Delegated rules


 

    public static final BitSet FOLLOW_instrucao_in_programa132 = new BitSet(new long[]{0xFFFFFF0080100402L,0x000003FFFFFFFFFFL});
    public static final BitSet FOLLOW_operacao_in_instrucao160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definicaoClasse_in_instrucao174 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_instrucao177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_label_in_operacao199 = new BitSet(new long[]{0xFFFFFF0000100000L,0x000003FFFFFFFFFFL});
    public static final BitSet FOLLOW_comando_in_operacao201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comando_in_operacao205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_label227 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_label229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_manipulacaoObjetos_in_comando247 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_aritmetica_in_comando265 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_load_in_comando283 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_loadint_in_comando301 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_store_in_comando319 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_storeint_in_comando337 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_desvio_in_comando355 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_logica_in_comando373 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_pilha_in_comando391 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_retorno_in_comando409 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_100_in_comando427 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_NEWLINE_in_comando443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_definicaoClasse469 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_definicaoClasse471 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_NEWLINE_in_definicaoClasse473 = new BitSet(new long[]{0x0000003400000000L});
    public static final BitSet FOLLOW_superClasse_in_definicaoClasse476 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_NEWLINE_in_definicaoClasse478 = new BitSet(new long[]{0x0000001400000000L});
    public static final BitSet FOLLOW_membroClasse_in_definicaoClasse483 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_NEWLINE_in_definicaoClasse485 = new BitSet(new long[]{0x0000001400000002L});
    public static final BitSet FOLLOW_37_in_superClasse546 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_TIPO_REF_in_superClasse548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_membroClasse569 = new BitSet(new long[]{0x0000000000000400L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_membroClasse571 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_membroClasse574 = new BitSet(new long[]{0x0000000006001000L});
    public static final BitSet FOLLOW_tipo_in_membroClasse576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_membroClasse594 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_INIT_in_membroClasse596 = new BitSet(new long[]{0x0000000032000400L});
    public static final BitSet FOLLOW_parametros_in_membroClasse599 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_28_in_membroClasse603 = new BitSet(new long[]{0x0000000022000400L});
    public static final BitSet FOLLOW_parametros_in_membroClasse605 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_membroClasse607 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_VOID_in_membroClasse610 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_NEWLINE_in_membroClasse612 = new BitSet(new long[]{0xFFFFFF0A00100400L,0x000003FFFFFFFFFFL});
    public static final BitSet FOLLOW_limite_in_membroClasse615 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_NEWLINE_in_membroClasse617 = new BitSet(new long[]{0xFFFFFF0200100400L,0x000003FFFFFFFFFFL});
    public static final BitSet FOLLOW_operacao_in_membroClasse621 = new BitSet(new long[]{0xFFFFFF0200100400L,0x000003FFFFFFFFFFL});
    public static final BitSet FOLLOW_33_in_membroClasse624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_membroClasse653 = new BitSet(new long[]{0x0000000000000400L,0x0000040000000000L});
    public static final BitSet FOLLOW_106_in_membroClasse655 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_membroClasse658 = new BitSet(new long[]{0x0000000032000400L});
    public static final BitSet FOLLOW_parametros_in_membroClasse661 = new BitSet(new long[]{0x0000000006001000L});
    public static final BitSet FOLLOW_28_in_membroClasse665 = new BitSet(new long[]{0x0000000022000400L});
    public static final BitSet FOLLOW_parametros_in_membroClasse667 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_membroClasse669 = new BitSet(new long[]{0x0000000006001000L});
    public static final BitSet FOLLOW_tipo_in_membroClasse676 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_NEWLINE_in_membroClasse678 = new BitSet(new long[]{0xFFFFFF0A00100400L,0x000003FFFFFFFFFFL});
    public static final BitSet FOLLOW_limite_in_membroClasse681 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_NEWLINE_in_membroClasse683 = new BitSet(new long[]{0xFFFFFF0200100400L,0x000003FFFFFFFFFFL});
    public static final BitSet FOLLOW_operacao_in_membroClasse687 = new BitSet(new long[]{0xFFFFFF0200100400L,0x000003FFFFFFFFFFL});
    public static final BitSet FOLLOW_33_in_membroClasse690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_limite739 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_INTEIRO_in_limite741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_parametros763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_parametros790 = new BitSet(new long[]{0x0000000002000402L});
    public static final BitSet FOLLOW_TIPO_REF_in_parametros805 = new BitSet(new long[]{0x0000000002000402L});
    public static final BitSet FOLLOW_53_in_manipulacaoObjetos867 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_campo_in_manipulacaoObjetos873 = new BitSet(new long[]{0x0000000006001000L});
    public static final BitSet FOLLOW_tipo_in_manipulacaoObjetos875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_manipulacaoObjetos899 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_campo_in_manipulacaoObjetos905 = new BitSet(new long[]{0x0000000006001000L});
    public static final BitSet FOLLOW_tipo_in_manipulacaoObjetos907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_manipulacaoObjetos945 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_campo_in_manipulacaoObjetos951 = new BitSet(new long[]{0x0000000006001000L});
    public static final BitSet FOLLOW_tipo_in_manipulacaoObjetos953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_manipulacaoObjetos991 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_campo_in_manipulacaoObjetos997 = new BitSet(new long[]{0x0000000006001000L});
    public static final BitSet FOLLOW_tipo_in_manipulacaoObjetos999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_manipulacaoObjetos1037 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_classe_in_manipulacaoObjetos1043 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_manipulacaoObjetos1045 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_chamadaMetodo_in_manipulacaoObjetos1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_manipulacaoObjetos1112 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_classe_in_manipulacaoObjetos1118 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_manipulacaoObjetos1120 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_chamadaMetodo_in_manipulacaoObjetos1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_manipulacaoObjetos1187 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_classe_in_manipulacaoObjetos1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_aritmetica1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_aritmetica1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_aritmetica1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_aritmetica1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_aritmetica1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_aritmetica1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_aritmetica1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_load1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_load1506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_load1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_load1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_load1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_load1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_load1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_load1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_load1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_load1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_load1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_load1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_load1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_load1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_load1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_load1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_loadint1808 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_INTEIRO_in_loadint1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_loadint1834 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_INTEIRO_in_loadint1840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_loadint1860 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_INTEIRO_in_loadint1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_store1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_store1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_store1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_store1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_store2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_store2018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_store2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_store2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_storeint2108 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_INTEIRO_in_storeint2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_storeint2135 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_INTEIRO_in_storeint2141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_logica2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_logica2220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_logica2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_desvio2290 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_desvio2296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_desvio2315 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_desvio2321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_desvio2340 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_desvio2346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_desvio2365 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_desvio2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_desvio2390 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_desvio2396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_desvio2415 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_desvio2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_desvio2440 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_desvio2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_desvio2465 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_desvio2471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_desvio2490 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_desvio2496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_desvio2515 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_desvio2521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_desvio2540 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_desvio2546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_desvio2565 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_desvio2571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_desvio2590 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_desvio2596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_pilha2657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_pilha2675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_pilha2693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_classe2759 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_classe2761 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_classe2770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INIT_in_chamadaMetodo2810 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_chamadaMetodo2816 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_VOID_in_chamadaMetodo2822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_campo2862 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_campo2864 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_campo2872 = new BitSet(new long[]{0x0000000000000002L});

}