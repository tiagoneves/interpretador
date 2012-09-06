// $ANTLR 3.4 C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g 2012-09-06 01:53:56

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARITMETICA", "BODY", "CONSTR_DECL", "DESVIO", "EXTENDS", "FIELD_DECL", "ID", "INIT", "INT", "INTEIRO", "LABEL", "LOAD", "LOGICA", "MEMBRO_CLASSE", "METHOD_DECL", "NEWLINE", "NULL", "PARAMS", "PILHA", "STORE", "TIPO_REF", "VOID", "WS", "'('", "'()'", "')'", "'.class'", "'.end class'", "'.end method'", "'.field'", "'.method'", "'.super'", "'/'", "':'", "'aconst_null'", "'aload'", "'aload_0'", "'aload_1'", "'aload_2'", "'aload_3'", "'areturn'", "'astore'", "'astore_0'", "'astore_1'", "'astore_2'", "'astore_3'", "'dup'", "'getfield'", "'goto'", "'iadd'", "'iand'", "'iconst_0'", "'iconst_1'", "'iconst_2'", "'iconst_3'", "'iconst_4'", "'iconst_5'", "'iconst_m1'", "'idiv'", "'if_icmpeq'", "'if_icmpge'", "'if_icmpgt'", "'if_icmple'", "'if_icmplt'", "'if_icmpne'", "'ifeq'", "'ifge'", "'ifgt'", "'ifle'", "'iflt'", "'ifne'", "'iinc'", "'iload'", "'iload_0'", "'iload_1'", "'iload_2'", "'iload_3'", "'imul'", "'ineg'", "'invokespecial'", "'ior'", "'irem'", "'ireturn'", "'istore'", "'istore_0'", "'istore_1'", "'istore_2'", "'istore_3'", "'isub'", "'ixor'", "'ldc'", "'new'", "'nop'", "'pop'", "'pop2'", "'putfield'", "'return'"
    };

    public static final int EOF=-1;
    public static final int T__27=27;
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
    public static final int LOAD=15;
    public static final int LOGICA=16;
    public static final int MEMBRO_CLASSE=17;
    public static final int METHOD_DECL=18;
    public static final int NEWLINE=19;
    public static final int NULL=20;
    public static final int PARAMS=21;
    public static final int PILHA=22;
    public static final int STORE=23;
    public static final int TIPO_REF=24;
    public static final int VOID=25;
    public static final int WS=26;

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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:47:1: programa : ( instrucao )* ;
    public final AssemblerParser.programa_return programa() throws RecognitionException {
        AssemblerParser.programa_return retval = new AssemblerParser.programa_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        AssemblerParser.instrucao_return instrucao1 =null;



        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:47:10: ( ( instrucao )* )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:47:12: ( instrucao )*
            {
            root_0 = (BytecodesAST)adaptor.nil();


            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:47:12: ( instrucao )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID||LA1_0==NEWLINE||LA1_0==30||(LA1_0 >= 38 && LA1_0 <= 100)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:47:12: instrucao
            	    {
            	    pushFollow(FOLLOW_instrucao_in_programa127);
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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:50:1: instrucao : ( operacao | definicaoClasse ( '.end class' )? );
    public final AssemblerParser.instrucao_return instrucao() throws RecognitionException {
        AssemblerParser.instrucao_return retval = new AssemblerParser.instrucao_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token string_literal4=null;
        AssemblerParser.operacao_return operacao2 =null;

        AssemblerParser.definicaoClasse_return definicaoClasse3 =null;


        BytecodesAST string_literal4_tree=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:50:11: ( operacao | definicaoClasse ( '.end class' )? )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ID||LA3_0==NEWLINE||(LA3_0 >= 38 && LA3_0 <= 100)) ) {
                alt3=1;
            }
            else if ( (LA3_0==30) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:50:13: operacao
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    pushFollow(FOLLOW_operacao_in_instrucao155);
                    operacao2=operacao();

                    state._fsp--;

                    adaptor.addChild(root_0, operacao2.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:51:13: definicaoClasse ( '.end class' )?
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    pushFollow(FOLLOW_definicaoClasse_in_instrucao169);
                    definicaoClasse3=definicaoClasse();

                    state._fsp--;

                    adaptor.addChild(root_0, definicaoClasse3.getTree());

                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:51:29: ( '.end class' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==31) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:51:30: '.end class'
                            {
                            string_literal4=(Token)match(input,31,FOLLOW_31_in_instrucao172); 
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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:54:1: operacao : ( label comando | comando ) ;
    public final AssemblerParser.operacao_return operacao() throws RecognitionException {
        AssemblerParser.operacao_return retval = new AssemblerParser.operacao_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        AssemblerParser.label_return label5 =null;

        AssemblerParser.comando_return comando6 =null;

        AssemblerParser.comando_return comando7 =null;



        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:54:10: ( ( label comando | comando ) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:54:12: ( label comando | comando )
            {
            root_0 = (BytecodesAST)adaptor.nil();


            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:54:12: ( label comando | comando )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==NEWLINE||(LA4_0 >= 38 && LA4_0 <= 100)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:54:13: label comando
                    {
                    pushFollow(FOLLOW_label_in_operacao194);
                    label5=label();

                    state._fsp--;

                    adaptor.addChild(root_0, label5.getTree());

                    pushFollow(FOLLOW_comando_in_operacao196);
                    comando6=comando();

                    state._fsp--;

                    adaptor.addChild(root_0, comando6.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:54:29: comando
                    {
                    pushFollow(FOLLOW_comando_in_operacao200);
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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:56:1: label : a= ID ':' -> ^( LABEL $a) ;
    public final AssemblerParser.label_return label() throws RecognitionException {
        AssemblerParser.label_return retval = new AssemblerParser.label_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;
        Token char_literal8=null;

        BytecodesAST a_tree=null;
        BytecodesAST char_literal8_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:56:7: (a= ID ':' -> ^( LABEL $a) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:56:9: a= ID ':'
            {
            a=(Token)match(input,ID,FOLLOW_ID_in_label222);  
            stream_ID.add(a);


            char_literal8=(Token)match(input,37,FOLLOW_37_in_label224);  
            stream_37.add(char_literal8);


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
            // 56:20: -> ^( LABEL $a)
            {
                // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:56:23: ^( LABEL $a)
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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:58:1: comando : ( manipulacaoObjetos | aritmetica | load | loadint | store | storeint | desvio | logica | pilha | retorno | 'nop' )? NEWLINE ;
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
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:58:8: ( ( manipulacaoObjetos | aritmetica | load | loadint | store | storeint | desvio | logica | pilha | retorno | 'nop' )? NEWLINE )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:58:10: ( manipulacaoObjetos | aritmetica | load | loadint | store | storeint | desvio | logica | pilha | retorno | 'nop' )? NEWLINE
            {
            root_0 = (BytecodesAST)adaptor.nil();


            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:58:10: ( manipulacaoObjetos | aritmetica | load | loadint | store | storeint | desvio | logica | pilha | retorno | 'nop' )?
            int alt5=12;
            switch ( input.LA(1) ) {
                case 51:
                case 83:
                case 95:
                case 99:
                    {
                    alt5=1;
                    }
                    break;
                case 53:
                case 62:
                case 75:
                case 81:
                case 82:
                case 85:
                case 92:
                    {
                    alt5=2;
                    }
                    break;
                case 38:
                case 40:
                case 41:
                case 42:
                case 43:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 77:
                case 78:
                case 79:
                case 80:
                    {
                    alt5=3;
                    }
                    break;
                case 39:
                case 76:
                case 94:
                    {
                    alt5=4;
                    }
                    break;
                case 46:
                case 47:
                case 48:
                case 49:
                case 88:
                case 89:
                case 90:
                case 91:
                    {
                    alt5=5;
                    }
                    break;
                case 45:
                case 87:
                    {
                    alt5=6;
                    }
                    break;
                case 52:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                case 69:
                case 70:
                case 71:
                case 72:
                case 73:
                case 74:
                    {
                    alt5=7;
                    }
                    break;
                case 54:
                case 84:
                case 93:
                    {
                    alt5=8;
                    }
                    break;
                case 50:
                case 97:
                case 98:
                    {
                    alt5=9;
                    }
                    break;
                case 44:
                case 86:
                case 100:
                    {
                    alt5=10;
                    }
                    break;
                case 96:
                    {
                    alt5=11;
                    }
                    break;
            }

            switch (alt5) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:58:12: manipulacaoObjetos
                    {
                    pushFollow(FOLLOW_manipulacaoObjetos_in_comando242);
                    manipulacaoObjetos9=manipulacaoObjetos();

                    state._fsp--;

                    adaptor.addChild(root_0, manipulacaoObjetos9.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:59:17: aritmetica
                    {
                    pushFollow(FOLLOW_aritmetica_in_comando260);
                    aritmetica10=aritmetica();

                    state._fsp--;

                    adaptor.addChild(root_0, aritmetica10.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:60:17: load
                    {
                    pushFollow(FOLLOW_load_in_comando278);
                    load11=load();

                    state._fsp--;

                    adaptor.addChild(root_0, load11.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:61:17: loadint
                    {
                    pushFollow(FOLLOW_loadint_in_comando296);
                    loadint12=loadint();

                    state._fsp--;

                    adaptor.addChild(root_0, loadint12.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:62:17: store
                    {
                    pushFollow(FOLLOW_store_in_comando314);
                    store13=store();

                    state._fsp--;

                    adaptor.addChild(root_0, store13.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:63:17: storeint
                    {
                    pushFollow(FOLLOW_storeint_in_comando332);
                    storeint14=storeint();

                    state._fsp--;

                    adaptor.addChild(root_0, storeint14.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:64:17: desvio
                    {
                    pushFollow(FOLLOW_desvio_in_comando350);
                    desvio15=desvio();

                    state._fsp--;

                    adaptor.addChild(root_0, desvio15.getTree());

                    }
                    break;
                case 8 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:65:17: logica
                    {
                    pushFollow(FOLLOW_logica_in_comando368);
                    logica16=logica();

                    state._fsp--;

                    adaptor.addChild(root_0, logica16.getTree());

                    }
                    break;
                case 9 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:66:17: pilha
                    {
                    pushFollow(FOLLOW_pilha_in_comando386);
                    pilha17=pilha();

                    state._fsp--;

                    adaptor.addChild(root_0, pilha17.getTree());

                    }
                    break;
                case 10 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:67:17: retorno
                    {
                    pushFollow(FOLLOW_retorno_in_comando404);
                    retorno18=retorno();

                    state._fsp--;

                    adaptor.addChild(root_0, retorno18.getTree());

                    }
                    break;
                case 11 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:68:17: 'nop'
                    {
                    string_literal19=(Token)match(input,96,FOLLOW_96_in_comando422); 
                    string_literal19_tree = 
                    (BytecodesAST)adaptor.create(string_literal19)
                    ;
                    adaptor.addChild(root_0, string_literal19_tree);


                    }
                    break;

            }


            NEWLINE20=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_comando438); 
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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:71:1: definicaoClasse : '.class' ID NEWLINE ( superClasse NEWLINE )? ( membroClasse NEWLINE )+ -> ^( '.class' ID ( superClasse )? ^( MEMBRO_CLASSE ( membroClasse )+ ) ) ;
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
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_membroClasse=new RewriteRuleSubtreeStream(adaptor,"rule membroClasse");
        RewriteRuleSubtreeStream stream_superClasse=new RewriteRuleSubtreeStream(adaptor,"rule superClasse");
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:72:5: ( '.class' ID NEWLINE ( superClasse NEWLINE )? ( membroClasse NEWLINE )+ -> ^( '.class' ID ( superClasse )? ^( MEMBRO_CLASSE ( membroClasse )+ ) ) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:72:7: '.class' ID NEWLINE ( superClasse NEWLINE )? ( membroClasse NEWLINE )+
            {
            string_literal21=(Token)match(input,30,FOLLOW_30_in_definicaoClasse464);  
            stream_30.add(string_literal21);


            ID22=(Token)match(input,ID,FOLLOW_ID_in_definicaoClasse466);  
            stream_ID.add(ID22);


            NEWLINE23=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_definicaoClasse468);  
            stream_NEWLINE.add(NEWLINE23);


            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:72:27: ( superClasse NEWLINE )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==35) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:72:28: superClasse NEWLINE
                    {
                    pushFollow(FOLLOW_superClasse_in_definicaoClasse471);
                    superClasse24=superClasse();

                    state._fsp--;

                    stream_superClasse.add(superClasse24.getTree());

                    NEWLINE25=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_definicaoClasse473);  
                    stream_NEWLINE.add(NEWLINE25);


                    }
                    break;

            }


            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:72:50: ( membroClasse NEWLINE )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= 33 && LA7_0 <= 34)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:72:51: membroClasse NEWLINE
            	    {
            	    pushFollow(FOLLOW_membroClasse_in_definicaoClasse478);
            	    membroClasse26=membroClasse();

            	    state._fsp--;

            	    stream_membroClasse.add(membroClasse26.getTree());

            	    NEWLINE27=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_definicaoClasse480);  
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
            // elements: ID, superClasse, 30, membroClasse
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BytecodesAST)adaptor.nil();
            // 73:12: -> ^( '.class' ID ( superClasse )? ^( MEMBRO_CLASSE ( membroClasse )+ ) )
            {
                // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:73:15: ^( '.class' ID ( superClasse )? ^( MEMBRO_CLASSE ( membroClasse )+ ) )
                {
                BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                root_1 = (BytecodesAST)adaptor.becomeRoot(
                stream_30.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:73:29: ( superClasse )?
                if ( stream_superClasse.hasNext() ) {
                    adaptor.addChild(root_1, stream_superClasse.nextTree());

                }
                stream_superClasse.reset();

                // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:73:42: ^( MEMBRO_CLASSE ( membroClasse )+ )
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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:76:1: superClasse : '.super' TIPO_REF -> ^( EXTENDS TIPO_REF ) ;
    public final AssemblerParser.superClasse_return superClasse() throws RecognitionException {
        AssemblerParser.superClasse_return retval = new AssemblerParser.superClasse_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token string_literal28=null;
        Token TIPO_REF29=null;

        BytecodesAST string_literal28_tree=null;
        BytecodesAST TIPO_REF29_tree=null;
        RewriteRuleTokenStream stream_TIPO_REF=new RewriteRuleTokenStream(adaptor,"token TIPO_REF");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:76:13: ( '.super' TIPO_REF -> ^( EXTENDS TIPO_REF ) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:76:15: '.super' TIPO_REF
            {
            string_literal28=(Token)match(input,35,FOLLOW_35_in_superClasse541);  
            stream_35.add(string_literal28);


            TIPO_REF29=(Token)match(input,TIPO_REF,FOLLOW_TIPO_REF_in_superClasse543);  
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
            // 76:33: -> ^( EXTENDS TIPO_REF )
            {
                // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:76:36: ^( EXTENDS TIPO_REF )
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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:78:1: membroClasse : ( '.field' ID tipo -> ^( FIELD_DECL ID tipo ) | '.method' INIT ( parametros | '(' parametros ')' ) VOID NEWLINE ( operacao )* '.end method' -> ^( CONSTR_DECL INIT parametros ^( BODY ( operacao )* ) ) | '.method' ID ( parametros | '(' parametros ')' ) ret= tipo NEWLINE ( operacao )* '.end method' -> ^( METHOD_DECL ID $ret parametros ^( BODY ( operacao )* ) ) );
    public final AssemblerParser.membroClasse_return membroClasse() throws RecognitionException {
        AssemblerParser.membroClasse_return retval = new AssemblerParser.membroClasse_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token string_literal30=null;
        Token ID31=null;
        Token string_literal33=null;
        Token INIT34=null;
        Token char_literal36=null;
        Token char_literal38=null;
        Token VOID39=null;
        Token NEWLINE40=null;
        Token string_literal42=null;
        Token string_literal43=null;
        Token ID44=null;
        Token char_literal46=null;
        Token char_literal48=null;
        Token NEWLINE49=null;
        Token string_literal51=null;
        AssemblerParser.tipo_return ret =null;

        AssemblerParser.tipo_return tipo32 =null;

        AssemblerParser.parametros_return parametros35 =null;

        AssemblerParser.parametros_return parametros37 =null;

        AssemblerParser.operacao_return operacao41 =null;

        AssemblerParser.parametros_return parametros45 =null;

        AssemblerParser.parametros_return parametros47 =null;

        AssemblerParser.operacao_return operacao50 =null;


        BytecodesAST string_literal30_tree=null;
        BytecodesAST ID31_tree=null;
        BytecodesAST string_literal33_tree=null;
        BytecodesAST INIT34_tree=null;
        BytecodesAST char_literal36_tree=null;
        BytecodesAST char_literal38_tree=null;
        BytecodesAST VOID39_tree=null;
        BytecodesAST NEWLINE40_tree=null;
        BytecodesAST string_literal42_tree=null;
        BytecodesAST string_literal43_tree=null;
        BytecodesAST ID44_tree=null;
        BytecodesAST char_literal46_tree=null;
        BytecodesAST char_literal48_tree=null;
        BytecodesAST NEWLINE49_tree=null;
        BytecodesAST string_literal51_tree=null;
        RewriteRuleTokenStream stream_VOID=new RewriteRuleTokenStream(adaptor,"token VOID");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_INIT=new RewriteRuleTokenStream(adaptor,"token INIT");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleSubtreeStream stream_parametros=new RewriteRuleSubtreeStream(adaptor,"rule parametros");
        RewriteRuleSubtreeStream stream_tipo=new RewriteRuleSubtreeStream(adaptor,"rule tipo");
        RewriteRuleSubtreeStream stream_operacao=new RewriteRuleSubtreeStream(adaptor,"rule operacao");
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:79:5: ( '.field' ID tipo -> ^( FIELD_DECL ID tipo ) | '.method' INIT ( parametros | '(' parametros ')' ) VOID NEWLINE ( operacao )* '.end method' -> ^( CONSTR_DECL INIT parametros ^( BODY ( operacao )* ) ) | '.method' ID ( parametros | '(' parametros ')' ) ret= tipo NEWLINE ( operacao )* '.end method' -> ^( METHOD_DECL ID $ret parametros ^( BODY ( operacao )* ) ) )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==33) ) {
                alt12=1;
            }
            else if ( (LA12_0==34) ) {
                int LA12_2 = input.LA(2);

                if ( (LA12_2==INIT) ) {
                    alt12=2;
                }
                else if ( (LA12_2==ID) ) {
                    alt12=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:79:7: '.field' ID tipo
                    {
                    string_literal30=(Token)match(input,33,FOLLOW_33_in_membroClasse564);  
                    stream_33.add(string_literal30);


                    ID31=(Token)match(input,ID,FOLLOW_ID_in_membroClasse566);  
                    stream_ID.add(ID31);


                    pushFollow(FOLLOW_tipo_in_membroClasse568);
                    tipo32=tipo();

                    state._fsp--;

                    stream_tipo.add(tipo32.getTree());

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
                    // 79:24: -> ^( FIELD_DECL ID tipo )
                    {
                        // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:79:27: ^( FIELD_DECL ID tipo )
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
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:80:7: '.method' INIT ( parametros | '(' parametros ')' ) VOID NEWLINE ( operacao )* '.end method'
                    {
                    string_literal33=(Token)match(input,34,FOLLOW_34_in_membroClasse586);  
                    stream_34.add(string_literal33);


                    INIT34=(Token)match(input,INIT,FOLLOW_INIT_in_membroClasse588);  
                    stream_INIT.add(INIT34);


                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:80:22: ( parametros | '(' parametros ')' )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==ID||LA8_0==TIPO_REF||LA8_0==28) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==27) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;

                    }
                    switch (alt8) {
                        case 1 :
                            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:80:23: parametros
                            {
                            pushFollow(FOLLOW_parametros_in_membroClasse591);
                            parametros35=parametros();

                            state._fsp--;

                            stream_parametros.add(parametros35.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:80:36: '(' parametros ')'
                            {
                            char_literal36=(Token)match(input,27,FOLLOW_27_in_membroClasse595);  
                            stream_27.add(char_literal36);


                            pushFollow(FOLLOW_parametros_in_membroClasse597);
                            parametros37=parametros();

                            state._fsp--;

                            stream_parametros.add(parametros37.getTree());

                            char_literal38=(Token)match(input,29,FOLLOW_29_in_membroClasse599);  
                            stream_29.add(char_literal38);


                            }
                            break;

                    }


                    VOID39=(Token)match(input,VOID,FOLLOW_VOID_in_membroClasse602);  
                    stream_VOID.add(VOID39);


                    NEWLINE40=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_membroClasse604);  
                    stream_NEWLINE.add(NEWLINE40);


                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:80:69: ( operacao )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==ID||LA9_0==NEWLINE||(LA9_0 >= 38 && LA9_0 <= 100)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:80:69: operacao
                    	    {
                    	    pushFollow(FOLLOW_operacao_in_membroClasse606);
                    	    operacao41=operacao();

                    	    state._fsp--;

                    	    stream_operacao.add(operacao41.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    string_literal42=(Token)match(input,32,FOLLOW_32_in_membroClasse609);  
                    stream_32.add(string_literal42);


                    // AST REWRITE
                    // elements: INIT, operacao, parametros
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BytecodesAST)adaptor.nil();
                    // 81:2: -> ^( CONSTR_DECL INIT parametros ^( BODY ( operacao )* ) )
                    {
                        // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:81:5: ^( CONSTR_DECL INIT parametros ^( BODY ( operacao )* ) )
                        {
                        BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                        root_1 = (BytecodesAST)adaptor.becomeRoot(
                        (BytecodesAST)adaptor.create(CONSTR_DECL, "CONSTR_DECL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_INIT.nextNode()
                        );

                        adaptor.addChild(root_1, stream_parametros.nextTree());

                        // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:81:35: ^( BODY ( operacao )* )
                        {
                        BytecodesAST root_2 = (BytecodesAST)adaptor.nil();
                        root_2 = (BytecodesAST)adaptor.becomeRoot(
                        (BytecodesAST)adaptor.create(BODY, "BODY")
                        , root_2);

                        // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:81:42: ( operacao )*
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
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:82:7: '.method' ID ( parametros | '(' parametros ')' ) ret= tipo NEWLINE ( operacao )* '.end method'
                    {
                    string_literal43=(Token)match(input,34,FOLLOW_34_in_membroClasse635);  
                    stream_34.add(string_literal43);


                    ID44=(Token)match(input,ID,FOLLOW_ID_in_membroClasse637);  
                    stream_ID.add(ID44);


                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:82:20: ( parametros | '(' parametros ')' )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==ID||LA10_0==TIPO_REF||LA10_0==28) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==27) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;

                    }
                    switch (alt10) {
                        case 1 :
                            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:82:21: parametros
                            {
                            pushFollow(FOLLOW_parametros_in_membroClasse640);
                            parametros45=parametros();

                            state._fsp--;

                            stream_parametros.add(parametros45.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:82:34: '(' parametros ')'
                            {
                            char_literal46=(Token)match(input,27,FOLLOW_27_in_membroClasse644);  
                            stream_27.add(char_literal46);


                            pushFollow(FOLLOW_parametros_in_membroClasse646);
                            parametros47=parametros();

                            state._fsp--;

                            stream_parametros.add(parametros47.getTree());

                            char_literal48=(Token)match(input,29,FOLLOW_29_in_membroClasse648);  
                            stream_29.add(char_literal48);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_tipo_in_membroClasse655);
                    ret=tipo();

                    state._fsp--;

                    stream_tipo.add(ret.getTree());

                    NEWLINE49=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_membroClasse657);  
                    stream_NEWLINE.add(NEWLINE49);


                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:82:73: ( operacao )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==ID||LA11_0==NEWLINE||(LA11_0 >= 38 && LA11_0 <= 100)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:82:73: operacao
                    	    {
                    	    pushFollow(FOLLOW_operacao_in_membroClasse659);
                    	    operacao50=operacao();

                    	    state._fsp--;

                    	    stream_operacao.add(operacao50.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    string_literal51=(Token)match(input,32,FOLLOW_32_in_membroClasse662);  
                    stream_32.add(string_literal51);


                    // AST REWRITE
                    // elements: operacao, ID, ret, parametros
                    // token labels: 
                    // rule labels: ret, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_ret=new RewriteRuleSubtreeStream(adaptor,"rule ret",ret!=null?ret.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BytecodesAST)adaptor.nil();
                    // 83:9: -> ^( METHOD_DECL ID $ret parametros ^( BODY ( operacao )* ) )
                    {
                        // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:83:12: ^( METHOD_DECL ID $ret parametros ^( BODY ( operacao )* ) )
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

                        // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:83:46: ^( BODY ( operacao )* )
                        {
                        BytecodesAST root_2 = (BytecodesAST)adaptor.nil();
                        root_2 = (BytecodesAST)adaptor.becomeRoot(
                        (BytecodesAST)adaptor.create(BODY, "BODY")
                        , root_2);

                        // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:83:53: ( operacao )*
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


    public static class parametros_return extends ParserRuleReturnScope {
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parametros"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:86:1: parametros : ( '()' -> ^( PARAMS VOID ) | (a= ID |a= TIPO_REF )+ -> ( ^( PARAMS $a) )+ );
    public final AssemblerParser.parametros_return parametros() throws RecognitionException {
        AssemblerParser.parametros_return retval = new AssemblerParser.parametros_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;
        Token string_literal52=null;

        BytecodesAST a_tree=null;
        BytecodesAST string_literal52_tree=null;
        RewriteRuleTokenStream stream_TIPO_REF=new RewriteRuleTokenStream(adaptor,"token TIPO_REF");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:87:2: ( '()' -> ^( PARAMS VOID ) | (a= ID |a= TIPO_REF )+ -> ( ^( PARAMS $a) )+ )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            else if ( (LA14_0==ID||LA14_0==TIPO_REF) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:87:4: '()'
                    {
                    string_literal52=(Token)match(input,28,FOLLOW_28_in_parametros708);  
                    stream_28.add(string_literal52);


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
                    // 87:9: -> ^( PARAMS VOID )
                    {
                        // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:87:12: ^( PARAMS VOID )
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
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:88:4: (a= ID |a= TIPO_REF )+
                    {
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:88:4: (a= ID |a= TIPO_REF )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==TIPO_REF) ) {
                            int LA13_2 = input.LA(2);

                            if ( (LA13_2==ID||LA13_2==INT||(LA13_2 >= TIPO_REF && LA13_2 <= VOID)||LA13_2==29) ) {
                                alt13=2;
                            }


                        }
                        else if ( (LA13_0==ID) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:89:9: a= ID
                    	    {
                    	    a=(Token)match(input,ID,FOLLOW_ID_in_parametros735);  
                    	    stream_ID.add(a);


                    	    }
                    	    break;
                    	case 2 :
                    	    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:90:9: a= TIPO_REF
                    	    {
                    	    a=(Token)match(input,TIPO_REF,FOLLOW_TIPO_REF_in_parametros750);  
                    	    stream_TIPO_REF.add(a);


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
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
                    // 92:4: -> ( ^( PARAMS $a) )+
                    {
                        if ( !(stream_a.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_a.hasNext() ) {
                            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:92:7: ^( PARAMS $a)
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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:95:1: retorno : ( 'areturn' | 'ireturn' | 'return' );
    public final AssemblerParser.retorno_return retorno() throws RecognitionException {
        AssemblerParser.retorno_return retval = new AssemblerParser.retorno_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token set53=null;

        BytecodesAST set53_tree=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:95:9: ( 'areturn' | 'ireturn' | 'return' )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:
            {
            root_0 = (BytecodesAST)adaptor.nil();


            set53=(Token)input.LT(1);

            if ( input.LA(1)==44||input.LA(1)==86||input.LA(1)==100 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (BytecodesAST)adaptor.create(set53)
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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:97:1: manipulacaoObjetos : (a= 'getfield' b= campo tipo -> ^( 'getfield' $b tipo ) |a= 'putfield' b= campo tipo -> ^( 'putfield' $b tipo ) |a= 'invokespecial' c= classe '/' d= chamadaMetodo -> ^( 'invokespecial' $c $d) |a= 'new' c= classe -> ^( 'new' $c) );
    public final AssemblerParser.manipulacaoObjetos_return manipulacaoObjetos() throws RecognitionException {
        AssemblerParser.manipulacaoObjetos_return retval = new AssemblerParser.manipulacaoObjetos_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;
        Token char_literal56=null;
        AssemblerParser.campo_return b =null;

        AssemblerParser.classe_return c =null;

        AssemblerParser.chamadaMetodo_return d =null;

        AssemblerParser.tipo_return tipo54 =null;

        AssemblerParser.tipo_return tipo55 =null;


        BytecodesAST a_tree=null;
        BytecodesAST char_literal56_tree=null;
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_99=new RewriteRuleTokenStream(adaptor,"token 99");
        RewriteRuleSubtreeStream stream_classe=new RewriteRuleSubtreeStream(adaptor,"rule classe");
        RewriteRuleSubtreeStream stream_campo=new RewriteRuleSubtreeStream(adaptor,"rule campo");
        RewriteRuleSubtreeStream stream_chamadaMetodo=new RewriteRuleSubtreeStream(adaptor,"rule chamadaMetodo");
        RewriteRuleSubtreeStream stream_tipo=new RewriteRuleSubtreeStream(adaptor,"rule tipo");
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:97:20: (a= 'getfield' b= campo tipo -> ^( 'getfield' $b tipo ) |a= 'putfield' b= campo tipo -> ^( 'putfield' $b tipo ) |a= 'invokespecial' c= classe '/' d= chamadaMetodo -> ^( 'invokespecial' $c $d) |a= 'new' c= classe -> ^( 'new' $c) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt15=1;
                }
                break;
            case 99:
                {
                alt15=2;
                }
                break;
            case 83:
                {
                alt15=3;
                }
                break;
            case 95:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }

            switch (alt15) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:97:22: a= 'getfield' b= campo tipo
                    {
                    a=(Token)match(input,51,FOLLOW_51_in_manipulacaoObjetos812);  
                    stream_51.add(a);


                    pushFollow(FOLLOW_campo_in_manipulacaoObjetos818);
                    b=campo();

                    state._fsp--;

                    stream_campo.add(b.getTree());

                    pushFollow(FOLLOW_tipo_in_manipulacaoObjetos820);
                    tipo54=tipo();

                    state._fsp--;

                    stream_tipo.add(tipo54.getTree());

                    // AST REWRITE
                    // elements: tipo, b, 51
                    // token labels: 
                    // rule labels: retval, b
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);

                    root_0 = (BytecodesAST)adaptor.nil();
                    // 97:52: -> ^( 'getfield' $b tipo )
                    {
                        // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:97:55: ^( 'getfield' $b tipo )
                        {
                        BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                        root_1 = (BytecodesAST)adaptor.becomeRoot(
                        stream_51.nextNode()
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
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:98:22: a= 'putfield' b= campo tipo
                    {
                    a=(Token)match(input,99,FOLLOW_99_in_manipulacaoObjetos858);  
                    stream_99.add(a);


                    pushFollow(FOLLOW_campo_in_manipulacaoObjetos864);
                    b=campo();

                    state._fsp--;

                    stream_campo.add(b.getTree());

                    pushFollow(FOLLOW_tipo_in_manipulacaoObjetos866);
                    tipo55=tipo();

                    state._fsp--;

                    stream_tipo.add(tipo55.getTree());

                    // AST REWRITE
                    // elements: b, 99, tipo
                    // token labels: 
                    // rule labels: retval, b
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);

                    root_0 = (BytecodesAST)adaptor.nil();
                    // 98:52: -> ^( 'putfield' $b tipo )
                    {
                        // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:98:55: ^( 'putfield' $b tipo )
                        {
                        BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                        root_1 = (BytecodesAST)adaptor.becomeRoot(
                        stream_99.nextNode()
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
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:99:22: a= 'invokespecial' c= classe '/' d= chamadaMetodo
                    {
                    a=(Token)match(input,83,FOLLOW_83_in_manipulacaoObjetos904);  
                    stream_83.add(a);


                    pushFollow(FOLLOW_classe_in_manipulacaoObjetos910);
                    c=classe();

                    state._fsp--;

                    stream_classe.add(c.getTree());

                    char_literal56=(Token)match(input,36,FOLLOW_36_in_manipulacaoObjetos912);  
                    stream_36.add(char_literal56);


                    pushFollow(FOLLOW_chamadaMetodo_in_manipulacaoObjetos918);
                    d=chamadaMetodo();

                    state._fsp--;

                    stream_chamadaMetodo.add(d.getTree());

                    // AST REWRITE
                    // elements: c, 83, d
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
                    // 100:23: -> ^( 'invokespecial' $c $d)
                    {
                        // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:100:26: ^( 'invokespecial' $c $d)
                        {
                        BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                        root_1 = (BytecodesAST)adaptor.becomeRoot(
                        stream_83.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_c.nextTree());

                        adaptor.addChild(root_1, stream_d.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:101:22: a= 'new' c= classe
                    {
                    a=(Token)match(input,95,FOLLOW_95_in_manipulacaoObjetos979);  
                    stream_95.add(a);


                    pushFollow(FOLLOW_classe_in_manipulacaoObjetos984);
                    c=classe();

                    state._fsp--;

                    stream_classe.add(c.getTree());

                    // AST REWRITE
                    // elements: 95, c
                    // token labels: 
                    // rule labels: retval, c
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.tree:null);

                    root_0 = (BytecodesAST)adaptor.nil();
                    // 101:42: -> ^( 'new' $c)
                    {
                        // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:101:45: ^( 'new' $c)
                        {
                        BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                        root_1 = (BytecodesAST)adaptor.becomeRoot(
                        stream_95.nextNode()
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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:105:1: tipo : ( INT | VOID | TIPO_REF );
    public final AssemblerParser.tipo_return tipo() throws RecognitionException {
        AssemblerParser.tipo_return retval = new AssemblerParser.tipo_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token set57=null;

        BytecodesAST set57_tree=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:105:6: ( INT | VOID | TIPO_REF )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:
            {
            root_0 = (BytecodesAST)adaptor.nil();


            set57=(Token)input.LT(1);

            if ( input.LA(1)==INT||(input.LA(1) >= TIPO_REF && input.LA(1) <= VOID) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (BytecodesAST)adaptor.create(set57)
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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:107:1: aritmetica : (a= 'iadd' |a= 'isub' |a= 'imul' |a= 'idiv' |a= 'irem' |a= 'iinc' |a= 'ineg' ) -> ^( ARITMETICA $a) ;
    public final AssemblerParser.aritmetica_return aritmetica() throws RecognitionException {
        AssemblerParser.aritmetica_return retval = new AssemblerParser.aritmetica_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;

        BytecodesAST a_tree=null;
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:107:12: ( (a= 'iadd' |a= 'isub' |a= 'imul' |a= 'idiv' |a= 'irem' |a= 'iinc' |a= 'ineg' ) -> ^( ARITMETICA $a) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:107:14: (a= 'iadd' |a= 'isub' |a= 'imul' |a= 'idiv' |a= 'irem' |a= 'iinc' |a= 'ineg' )
            {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:107:14: (a= 'iadd' |a= 'isub' |a= 'imul' |a= 'idiv' |a= 'irem' |a= 'iinc' |a= 'ineg' )
            int alt16=7;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt16=1;
                }
                break;
            case 92:
                {
                alt16=2;
                }
                break;
            case 81:
                {
                alt16=3;
                }
                break;
            case 62:
                {
                alt16=4;
                }
                break;
            case 85:
                {
                alt16=5;
                }
                break;
            case 75:
                {
                alt16=6;
                }
                break;
            case 82:
                {
                alt16=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }

            switch (alt16) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:107:16: a= 'iadd'
                    {
                    a=(Token)match(input,53,FOLLOW_53_in_aritmetica1062);  
                    stream_53.add(a);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:108:19: a= 'isub'
                    {
                    a=(Token)match(input,92,FOLLOW_92_in_aritmetica1086);  
                    stream_92.add(a);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:109:19: a= 'imul'
                    {
                    a=(Token)match(input,81,FOLLOW_81_in_aritmetica1110);  
                    stream_81.add(a);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:110:19: a= 'idiv'
                    {
                    a=(Token)match(input,62,FOLLOW_62_in_aritmetica1134);  
                    stream_62.add(a);


                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:111:19: a= 'irem'
                    {
                    a=(Token)match(input,85,FOLLOW_85_in_aritmetica1158);  
                    stream_85.add(a);


                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:112:19: a= 'iinc'
                    {
                    a=(Token)match(input,75,FOLLOW_75_in_aritmetica1182);  
                    stream_75.add(a);


                    }
                    break;
                case 7 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:113:19: a= 'ineg'
                    {
                    a=(Token)match(input,82,FOLLOW_82_in_aritmetica1206);  
                    stream_82.add(a);


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
            // 115:14: -> ^( ARITMETICA $a)
            {
                // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:115:17: ^( ARITMETICA $a)
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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:118:1: load : (a= 'iconst_m1' |a= 'iconst_0' |a= 'iconst_1' |a= 'iconst_2' |a= 'iconst_3' |a= 'iconst_4' |a= 'iconst_5' |a= 'aconst_null' |a= 'iload_0' |a= 'iload_1' |a= 'iload_2' |a= 'iload_3' |a= 'aload_0' |a= 'aload_1' |a= 'aload_2' |a= 'aload_3' ) -> ^( LOAD $a) ;
    public final AssemblerParser.load_return load() throws RecognitionException {
        AssemblerParser.load_return retval = new AssemblerParser.load_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;

        BytecodesAST a_tree=null;
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:118:6: ( (a= 'iconst_m1' |a= 'iconst_0' |a= 'iconst_1' |a= 'iconst_2' |a= 'iconst_3' |a= 'iconst_4' |a= 'iconst_5' |a= 'aconst_null' |a= 'iload_0' |a= 'iload_1' |a= 'iload_2' |a= 'iload_3' |a= 'aload_0' |a= 'aload_1' |a= 'aload_2' |a= 'aload_3' ) -> ^( LOAD $a) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:118:8: (a= 'iconst_m1' |a= 'iconst_0' |a= 'iconst_1' |a= 'iconst_2' |a= 'iconst_3' |a= 'iconst_4' |a= 'iconst_5' |a= 'aconst_null' |a= 'iload_0' |a= 'iload_1' |a= 'iload_2' |a= 'iload_3' |a= 'aload_0' |a= 'aload_1' |a= 'aload_2' |a= 'aload_3' )
            {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:118:8: (a= 'iconst_m1' |a= 'iconst_0' |a= 'iconst_1' |a= 'iconst_2' |a= 'iconst_3' |a= 'iconst_4' |a= 'iconst_5' |a= 'aconst_null' |a= 'iload_0' |a= 'iload_1' |a= 'iload_2' |a= 'iload_3' |a= 'aload_0' |a= 'aload_1' |a= 'aload_2' |a= 'aload_3' )
            int alt17=16;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt17=1;
                }
                break;
            case 55:
                {
                alt17=2;
                }
                break;
            case 56:
                {
                alt17=3;
                }
                break;
            case 57:
                {
                alt17=4;
                }
                break;
            case 58:
                {
                alt17=5;
                }
                break;
            case 59:
                {
                alt17=6;
                }
                break;
            case 60:
                {
                alt17=7;
                }
                break;
            case 38:
                {
                alt17=8;
                }
                break;
            case 77:
                {
                alt17=9;
                }
                break;
            case 78:
                {
                alt17=10;
                }
                break;
            case 79:
                {
                alt17=11;
                }
                break;
            case 80:
                {
                alt17=12;
                }
                break;
            case 40:
                {
                alt17=13;
                }
                break;
            case 41:
                {
                alt17=14;
                }
                break;
            case 42:
                {
                alt17=15;
                }
                break;
            case 43:
                {
                alt17=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }

            switch (alt17) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:118:10: a= 'iconst_m1'
                    {
                    a=(Token)match(input,61,FOLLOW_61_in_load1280);  
                    stream_61.add(a);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:119:13: a= 'iconst_0'
                    {
                    a=(Token)match(input,55,FOLLOW_55_in_load1298);  
                    stream_55.add(a);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:120:13: a= 'iconst_1'
                    {
                    a=(Token)match(input,56,FOLLOW_56_in_load1316);  
                    stream_56.add(a);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:121:13: a= 'iconst_2'
                    {
                    a=(Token)match(input,57,FOLLOW_57_in_load1334);  
                    stream_57.add(a);


                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:122:13: a= 'iconst_3'
                    {
                    a=(Token)match(input,58,FOLLOW_58_in_load1352);  
                    stream_58.add(a);


                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:123:13: a= 'iconst_4'
                    {
                    a=(Token)match(input,59,FOLLOW_59_in_load1370);  
                    stream_59.add(a);


                    }
                    break;
                case 7 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:124:13: a= 'iconst_5'
                    {
                    a=(Token)match(input,60,FOLLOW_60_in_load1388);  
                    stream_60.add(a);


                    }
                    break;
                case 8 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:125:13: a= 'aconst_null'
                    {
                    a=(Token)match(input,38,FOLLOW_38_in_load1406);  
                    stream_38.add(a);


                    }
                    break;
                case 9 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:126:13: a= 'iload_0'
                    {
                    a=(Token)match(input,77,FOLLOW_77_in_load1424);  
                    stream_77.add(a);


                    }
                    break;
                case 10 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:127:13: a= 'iload_1'
                    {
                    a=(Token)match(input,78,FOLLOW_78_in_load1442);  
                    stream_78.add(a);


                    }
                    break;
                case 11 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:128:13: a= 'iload_2'
                    {
                    a=(Token)match(input,79,FOLLOW_79_in_load1460);  
                    stream_79.add(a);


                    }
                    break;
                case 12 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:129:13: a= 'iload_3'
                    {
                    a=(Token)match(input,80,FOLLOW_80_in_load1478);  
                    stream_80.add(a);


                    }
                    break;
                case 13 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:130:13: a= 'aload_0'
                    {
                    a=(Token)match(input,40,FOLLOW_40_in_load1496);  
                    stream_40.add(a);


                    }
                    break;
                case 14 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:131:13: a= 'aload_1'
                    {
                    a=(Token)match(input,41,FOLLOW_41_in_load1514);  
                    stream_41.add(a);


                    }
                    break;
                case 15 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:132:13: a= 'aload_2'
                    {
                    a=(Token)match(input,42,FOLLOW_42_in_load1532);  
                    stream_42.add(a);


                    }
                    break;
                case 16 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:133:13: a= 'aload_3'
                    {
                    a=(Token)match(input,43,FOLLOW_43_in_load1550);  
                    stream_43.add(a);


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
            // 135:8: -> ^( LOAD $a)
            {
                // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:135:11: ^( LOAD $a)
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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:138:1: loadint : (a= 'iload' b= INTEIRO |a= 'ldc' b= INTEIRO |a= 'aload' b= INTEIRO ) -> ^( LOAD $a $b) ;
    public final AssemblerParser.loadint_return loadint() throws RecognitionException {
        AssemblerParser.loadint_return retval = new AssemblerParser.loadint_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;
        Token b=null;

        BytecodesAST a_tree=null;
        BytecodesAST b_tree=null;
        RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
        RewriteRuleTokenStream stream_INTEIRO=new RewriteRuleTokenStream(adaptor,"token INTEIRO");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:138:9: ( (a= 'iload' b= INTEIRO |a= 'ldc' b= INTEIRO |a= 'aload' b= INTEIRO ) -> ^( LOAD $a $b) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:138:11: (a= 'iload' b= INTEIRO |a= 'ldc' b= INTEIRO |a= 'aload' b= INTEIRO )
            {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:138:11: (a= 'iload' b= INTEIRO |a= 'ldc' b= INTEIRO |a= 'aload' b= INTEIRO )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt18=1;
                }
                break;
            case 94:
                {
                alt18=2;
                }
                break;
            case 39:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }

            switch (alt18) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:138:13: a= 'iload' b= INTEIRO
                    {
                    a=(Token)match(input,76,FOLLOW_76_in_loadint1600);  
                    stream_76.add(a);


                    b=(Token)match(input,INTEIRO,FOLLOW_INTEIRO_in_loadint1606);  
                    stream_INTEIRO.add(b);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:139:15: a= 'ldc' b= INTEIRO
                    {
                    a=(Token)match(input,94,FOLLOW_94_in_loadint1626);  
                    stream_94.add(a);


                    b=(Token)match(input,INTEIRO,FOLLOW_INTEIRO_in_loadint1632);  
                    stream_INTEIRO.add(b);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:140:15: a= 'aload' b= INTEIRO
                    {
                    a=(Token)match(input,39,FOLLOW_39_in_loadint1652);  
                    stream_39.add(a);


                    b=(Token)match(input,INTEIRO,FOLLOW_INTEIRO_in_loadint1658);  
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
            // 142:11: -> ^( LOAD $a $b)
            {
                // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:142:14: ^( LOAD $a $b)
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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:145:1: store : (a= 'istore_0' |a= 'istore_1' |a= 'istore_2' |a= 'istore_3' |a= 'astore_0' |a= 'astore_1' |a= 'astore_2' |a= 'astore_3' ) -> ^( STORE $a) ;
    public final AssemblerParser.store_return store() throws RecognitionException {
        AssemblerParser.store_return retval = new AssemblerParser.store_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;

        BytecodesAST a_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:145:7: ( (a= 'istore_0' |a= 'istore_1' |a= 'istore_2' |a= 'istore_3' |a= 'astore_0' |a= 'astore_1' |a= 'astore_2' |a= 'astore_3' ) -> ^( STORE $a) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:145:9: (a= 'istore_0' |a= 'istore_1' |a= 'istore_2' |a= 'istore_3' |a= 'astore_0' |a= 'astore_1' |a= 'astore_2' |a= 'astore_3' )
            {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:145:9: (a= 'istore_0' |a= 'istore_1' |a= 'istore_2' |a= 'istore_3' |a= 'astore_0' |a= 'astore_1' |a= 'astore_2' |a= 'astore_3' )
            int alt19=8;
            switch ( input.LA(1) ) {
            case 88:
                {
                alt19=1;
                }
                break;
            case 89:
                {
                alt19=2;
                }
                break;
            case 90:
                {
                alt19=3;
                }
                break;
            case 91:
                {
                alt19=4;
                }
                break;
            case 46:
                {
                alt19=5;
                }
                break;
            case 47:
                {
                alt19=6;
                }
                break;
            case 48:
                {
                alt19=7;
                }
                break;
            case 49:
                {
                alt19=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }

            switch (alt19) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:145:11: a= 'istore_0'
                    {
                    a=(Token)match(input,88,FOLLOW_88_in_store1720);  
                    stream_88.add(a);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:146:13: a= 'istore_1'
                    {
                    a=(Token)match(input,89,FOLLOW_89_in_store1738);  
                    stream_89.add(a);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:147:13: a= 'istore_2'
                    {
                    a=(Token)match(input,90,FOLLOW_90_in_store1756);  
                    stream_90.add(a);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:148:13: a= 'istore_3'
                    {
                    a=(Token)match(input,91,FOLLOW_91_in_store1774);  
                    stream_91.add(a);


                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:149:13: a= 'astore_0'
                    {
                    a=(Token)match(input,46,FOLLOW_46_in_store1792);  
                    stream_46.add(a);


                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:150:13: a= 'astore_1'
                    {
                    a=(Token)match(input,47,FOLLOW_47_in_store1810);  
                    stream_47.add(a);


                    }
                    break;
                case 7 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:151:13: a= 'astore_2'
                    {
                    a=(Token)match(input,48,FOLLOW_48_in_store1828);  
                    stream_48.add(a);


                    }
                    break;
                case 8 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:152:13: a= 'astore_3'
                    {
                    a=(Token)match(input,49,FOLLOW_49_in_store1846);  
                    stream_49.add(a);


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
            // 154:9: -> ^( STORE $a)
            {
                // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:154:12: ^( STORE $a)
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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:157:1: storeint : (a= 'istore' b= INTEIRO |a= 'astore' b= INTEIRO ) -> ^( STORE $a $b) ;
    public final AssemblerParser.storeint_return storeint() throws RecognitionException {
        AssemblerParser.storeint_return retval = new AssemblerParser.storeint_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;
        Token b=null;

        BytecodesAST a_tree=null;
        BytecodesAST b_tree=null;
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_INTEIRO=new RewriteRuleTokenStream(adaptor,"token INTEIRO");
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:157:10: ( (a= 'istore' b= INTEIRO |a= 'astore' b= INTEIRO ) -> ^( STORE $a $b) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:157:12: (a= 'istore' b= INTEIRO |a= 'astore' b= INTEIRO )
            {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:157:12: (a= 'istore' b= INTEIRO |a= 'astore' b= INTEIRO )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==87) ) {
                alt20=1;
            }
            else if ( (LA20_0==45) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:157:14: a= 'istore' b= INTEIRO
                    {
                    a=(Token)match(input,87,FOLLOW_87_in_storeint1900);  
                    stream_87.add(a);


                    b=(Token)match(input,INTEIRO,FOLLOW_INTEIRO_in_storeint1906);  
                    stream_INTEIRO.add(b);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:158:16: a= 'astore' b= INTEIRO
                    {
                    a=(Token)match(input,45,FOLLOW_45_in_storeint1927);  
                    stream_45.add(a);


                    b=(Token)match(input,INTEIRO,FOLLOW_INTEIRO_in_storeint1933);  
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
            // 160:12: -> ^( STORE $a $b)
            {
                // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:160:15: ^( STORE $a $b)
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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:163:1: logica : (a= 'iand' |a= 'ior' |a= 'ixor' ) -> ^( LOGICA $a) ;
    public final AssemblerParser.logica_return logica() throws RecognitionException {
        AssemblerParser.logica_return retval = new AssemblerParser.logica_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;

        BytecodesAST a_tree=null;
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:163:8: ( (a= 'iand' |a= 'ior' |a= 'ixor' ) -> ^( LOGICA $a) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:163:10: (a= 'iand' |a= 'ior' |a= 'ixor' )
            {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:163:10: (a= 'iand' |a= 'ior' |a= 'ixor' )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt21=1;
                }
                break;
            case 84:
                {
                alt21=2;
                }
                break;
            case 93:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }

            switch (alt21) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:163:12: a= 'iand'
                    {
                    a=(Token)match(input,54,FOLLOW_54_in_logica1993);  
                    stream_54.add(a);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:164:14: a= 'ior'
                    {
                    a=(Token)match(input,84,FOLLOW_84_in_logica2012);  
                    stream_84.add(a);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:165:14: a= 'ixor'
                    {
                    a=(Token)match(input,93,FOLLOW_93_in_logica2031);  
                    stream_93.add(a);


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
            // 167:10: -> ^( LOGICA $a)
            {
                // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:167:13: ^( LOGICA $a)
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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:170:1: desvio : (a= 'ifeq' b= ID |a= 'ifne' b= ID |a= 'iflt' b= ID |a= 'ifge' b= ID |a= 'ifgt' b= ID |a= 'ifle' b= ID |a= 'if_icmpeq' b= ID |a= 'if_icmpne' b= ID |a= 'if_icmplt' b= ID |a= 'if_icmpge' b= ID |a= 'if_icmpgt' b= ID |a= 'if_icmple' b= ID |a= 'goto' b= ID ) -> ^( DESVIO $a $b) ;
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
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:170:8: ( (a= 'ifeq' b= ID |a= 'ifne' b= ID |a= 'iflt' b= ID |a= 'ifge' b= ID |a= 'ifgt' b= ID |a= 'ifle' b= ID |a= 'if_icmpeq' b= ID |a= 'if_icmpne' b= ID |a= 'if_icmplt' b= ID |a= 'if_icmpge' b= ID |a= 'if_icmpgt' b= ID |a= 'if_icmple' b= ID |a= 'goto' b= ID ) -> ^( DESVIO $a $b) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:170:10: (a= 'ifeq' b= ID |a= 'ifne' b= ID |a= 'iflt' b= ID |a= 'ifge' b= ID |a= 'ifgt' b= ID |a= 'ifle' b= ID |a= 'if_icmpeq' b= ID |a= 'if_icmpne' b= ID |a= 'if_icmplt' b= ID |a= 'if_icmpge' b= ID |a= 'if_icmpgt' b= ID |a= 'if_icmple' b= ID |a= 'goto' b= ID )
            {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:170:10: (a= 'ifeq' b= ID |a= 'ifne' b= ID |a= 'iflt' b= ID |a= 'ifge' b= ID |a= 'ifgt' b= ID |a= 'ifle' b= ID |a= 'if_icmpeq' b= ID |a= 'if_icmpne' b= ID |a= 'if_icmplt' b= ID |a= 'if_icmpge' b= ID |a= 'if_icmpgt' b= ID |a= 'if_icmple' b= ID |a= 'goto' b= ID )
            int alt22=13;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt22=1;
                }
                break;
            case 74:
                {
                alt22=2;
                }
                break;
            case 73:
                {
                alt22=3;
                }
                break;
            case 70:
                {
                alt22=4;
                }
                break;
            case 71:
                {
                alt22=5;
                }
                break;
            case 72:
                {
                alt22=6;
                }
                break;
            case 63:
                {
                alt22=7;
                }
                break;
            case 68:
                {
                alt22=8;
                }
                break;
            case 67:
                {
                alt22=9;
                }
                break;
            case 64:
                {
                alt22=10;
                }
                break;
            case 65:
                {
                alt22=11;
                }
                break;
            case 66:
                {
                alt22=12;
                }
                break;
            case 52:
                {
                alt22=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }

            switch (alt22) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:170:12: a= 'ifeq' b= ID
                    {
                    a=(Token)match(input,69,FOLLOW_69_in_desvio2082);  
                    stream_69.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio2088);  
                    stream_ID.add(b);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:171:14: a= 'ifne' b= ID
                    {
                    a=(Token)match(input,74,FOLLOW_74_in_desvio2107);  
                    stream_74.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio2113);  
                    stream_ID.add(b);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:172:14: a= 'iflt' b= ID
                    {
                    a=(Token)match(input,73,FOLLOW_73_in_desvio2132);  
                    stream_73.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio2138);  
                    stream_ID.add(b);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:173:14: a= 'ifge' b= ID
                    {
                    a=(Token)match(input,70,FOLLOW_70_in_desvio2157);  
                    stream_70.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio2163);  
                    stream_ID.add(b);


                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:174:14: a= 'ifgt' b= ID
                    {
                    a=(Token)match(input,71,FOLLOW_71_in_desvio2182);  
                    stream_71.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio2188);  
                    stream_ID.add(b);


                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:175:14: a= 'ifle' b= ID
                    {
                    a=(Token)match(input,72,FOLLOW_72_in_desvio2207);  
                    stream_72.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio2213);  
                    stream_ID.add(b);


                    }
                    break;
                case 7 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:176:14: a= 'if_icmpeq' b= ID
                    {
                    a=(Token)match(input,63,FOLLOW_63_in_desvio2232);  
                    stream_63.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio2238);  
                    stream_ID.add(b);


                    }
                    break;
                case 8 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:177:14: a= 'if_icmpne' b= ID
                    {
                    a=(Token)match(input,68,FOLLOW_68_in_desvio2257);  
                    stream_68.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio2263);  
                    stream_ID.add(b);


                    }
                    break;
                case 9 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:178:14: a= 'if_icmplt' b= ID
                    {
                    a=(Token)match(input,67,FOLLOW_67_in_desvio2282);  
                    stream_67.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio2288);  
                    stream_ID.add(b);


                    }
                    break;
                case 10 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:179:14: a= 'if_icmpge' b= ID
                    {
                    a=(Token)match(input,64,FOLLOW_64_in_desvio2307);  
                    stream_64.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio2313);  
                    stream_ID.add(b);


                    }
                    break;
                case 11 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:180:14: a= 'if_icmpgt' b= ID
                    {
                    a=(Token)match(input,65,FOLLOW_65_in_desvio2332);  
                    stream_65.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio2338);  
                    stream_ID.add(b);


                    }
                    break;
                case 12 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:181:14: a= 'if_icmple' b= ID
                    {
                    a=(Token)match(input,66,FOLLOW_66_in_desvio2357);  
                    stream_66.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio2363);  
                    stream_ID.add(b);


                    }
                    break;
                case 13 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:182:14: a= 'goto' b= ID
                    {
                    a=(Token)match(input,52,FOLLOW_52_in_desvio2382);  
                    stream_52.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio2388);  
                    stream_ID.add(b);


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
            // 184:10: -> ^( DESVIO $a $b)
            {
                // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:184:13: ^( DESVIO $a $b)
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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:187:1: pilha : (a= 'pop' |a= 'pop2' |a= 'dup' ) -> ^( PILHA $a) ;
    public final AssemblerParser.pilha_return pilha() throws RecognitionException {
        AssemblerParser.pilha_return retval = new AssemblerParser.pilha_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;

        BytecodesAST a_tree=null;
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
        RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:187:7: ( (a= 'pop' |a= 'pop2' |a= 'dup' ) -> ^( PILHA $a) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:187:9: (a= 'pop' |a= 'pop2' |a= 'dup' )
            {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:187:9: (a= 'pop' |a= 'pop2' |a= 'dup' )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 97:
                {
                alt23=1;
                }
                break;
            case 98:
                {
                alt23=2;
                }
                break;
            case 50:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }

            switch (alt23) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:187:11: a= 'pop'
                    {
                    a=(Token)match(input,97,FOLLOW_97_in_pilha2449);  
                    stream_97.add(a);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:188:13: a= 'pop2'
                    {
                    a=(Token)match(input,98,FOLLOW_98_in_pilha2467);  
                    stream_98.add(a);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:189:13: a= 'dup'
                    {
                    a=(Token)match(input,50,FOLLOW_50_in_pilha2485);  
                    stream_50.add(a);


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
            // 191:9: -> ^( PILHA $a)
            {
                // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:191:12: ^( PILHA $a)
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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:194:1: classe returns [List classe] : (cls+= ID '/' )* (cls+= ID ) ;
    public final AssemblerParser.classe_return classe() throws RecognitionException {
        AssemblerParser.classe_return retval = new AssemblerParser.classe_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token char_literal58=null;
        Token cls=null;
        List list_cls=null;

        BytecodesAST char_literal58_tree=null;
        BytecodesAST cls_tree=null;


                retval.classe = new ArrayList();
             
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:198:6: ( (cls+= ID '/' )* (cls+= ID ) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:198:8: (cls+= ID '/' )* (cls+= ID )
            {
            root_0 = (BytecodesAST)adaptor.nil();


            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:198:8: (cls+= ID '/' )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==ID) ) {
                    int LA24_1 = input.LA(2);

                    if ( (LA24_1==36) ) {
                        int LA24_2 = input.LA(3);

                        if ( (LA24_2==ID) ) {
                            alt24=1;
                        }


                    }


                }


                switch (alt24) {
            	case 1 :
            	    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:198:9: cls+= ID '/'
            	    {
            	    cls=(Token)match(input,ID,FOLLOW_ID_in_classe2551); 
            	    cls_tree = 
            	    (BytecodesAST)adaptor.create(cls)
            	    ;
            	    adaptor.addChild(root_0, cls_tree);

            	    if (list_cls==null) list_cls=new ArrayList();
            	    list_cls.add(cls);


            	    char_literal58=(Token)match(input,36,FOLLOW_36_in_classe2553); 
            	    char_literal58_tree = 
            	    (BytecodesAST)adaptor.create(char_literal58)
            	    ;
            	    adaptor.addChild(root_0, char_literal58_tree);


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:198:25: (cls+= ID )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:198:26: cls+= ID
            {
            cls=(Token)match(input,ID,FOLLOW_ID_in_classe2562); 
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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:201:1: chamadaMetodo returns [String nome, String params, String tipoRetorno] : n= INIT par= '()' tip= VOID ;
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
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:207:6: (n= INIT par= '()' tip= VOID )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:207:8: n= INIT par= '()' tip= VOID
            {
            root_0 = (BytecodesAST)adaptor.nil();


            n=(Token)match(input,INIT,FOLLOW_INIT_in_chamadaMetodo2602); 
            n_tree = 
            (BytecodesAST)adaptor.create(n)
            ;
            adaptor.addChild(root_0, n_tree);


            par=(Token)match(input,28,FOLLOW_28_in_chamadaMetodo2608); 
            par_tree = 
            (BytecodesAST)adaptor.create(par)
            ;
            adaptor.addChild(root_0, par_tree);


            tip=(Token)match(input,VOID,FOLLOW_VOID_in_chamadaMetodo2614); 
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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:214:1: campo returns [List classe, String campo] : (cls+= ID '/' )+ cmp= ID ;
    public final AssemblerParser.campo_return campo() throws RecognitionException {
        AssemblerParser.campo_return retval = new AssemblerParser.campo_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token cmp=null;
        Token char_literal59=null;
        Token cls=null;
        List list_cls=null;

        BytecodesAST cmp_tree=null;
        BytecodesAST char_literal59_tree=null;
        BytecodesAST cls_tree=null;


                retval.classe = new ArrayList();
                retval.campo ="";
             
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:219:6: ( (cls+= ID '/' )+ cmp= ID )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:219:8: (cls+= ID '/' )+ cmp= ID
            {
            root_0 = (BytecodesAST)adaptor.nil();


            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:219:8: (cls+= ID '/' )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==ID) ) {
                    int LA25_1 = input.LA(2);

                    if ( (LA25_1==36) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:219:9: cls+= ID '/'
            	    {
            	    cls=(Token)match(input,ID,FOLLOW_ID_in_campo2654); 
            	    cls_tree = 
            	    (BytecodesAST)adaptor.create(cls)
            	    ;
            	    adaptor.addChild(root_0, cls_tree);

            	    if (list_cls==null) list_cls=new ArrayList();
            	    list_cls.add(cls);


            	    char_literal59=(Token)match(input,36,FOLLOW_36_in_campo2656); 
            	    char_literal59_tree = 
            	    (BytecodesAST)adaptor.create(char_literal59)
            	    ;
            	    adaptor.addChild(root_0, char_literal59_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);


            cmp=(Token)match(input,ID,FOLLOW_ID_in_campo2664); 
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


 

    public static final BitSet FOLLOW_instrucao_in_programa127 = new BitSet(new long[]{0xFFFFFFC040080402L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_operacao_in_instrucao155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definicaoClasse_in_instrucao169 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_instrucao172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_label_in_operacao194 = new BitSet(new long[]{0xFFFFFFC000080000L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_comando_in_operacao196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comando_in_operacao200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_label222 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_label224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_manipulacaoObjetos_in_comando242 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_aritmetica_in_comando260 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_load_in_comando278 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_loadint_in_comando296 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_store_in_comando314 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_storeint_in_comando332 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_desvio_in_comando350 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_logica_in_comando368 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_pilha_in_comando386 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_retorno_in_comando404 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_96_in_comando422 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NEWLINE_in_comando438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_definicaoClasse464 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_definicaoClasse466 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NEWLINE_in_definicaoClasse468 = new BitSet(new long[]{0x0000000E00000000L});
    public static final BitSet FOLLOW_superClasse_in_definicaoClasse471 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NEWLINE_in_definicaoClasse473 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_membroClasse_in_definicaoClasse478 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NEWLINE_in_definicaoClasse480 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_35_in_superClasse541 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_TIPO_REF_in_superClasse543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_membroClasse564 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_membroClasse566 = new BitSet(new long[]{0x0000000003001000L});
    public static final BitSet FOLLOW_tipo_in_membroClasse568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_membroClasse586 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_INIT_in_membroClasse588 = new BitSet(new long[]{0x0000000019000400L});
    public static final BitSet FOLLOW_parametros_in_membroClasse591 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_27_in_membroClasse595 = new BitSet(new long[]{0x0000000011000400L});
    public static final BitSet FOLLOW_parametros_in_membroClasse597 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_membroClasse599 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_VOID_in_membroClasse602 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NEWLINE_in_membroClasse604 = new BitSet(new long[]{0xFFFFFFC100080400L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_operacao_in_membroClasse606 = new BitSet(new long[]{0xFFFFFFC100080400L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_32_in_membroClasse609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_membroClasse635 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_membroClasse637 = new BitSet(new long[]{0x0000000019000400L});
    public static final BitSet FOLLOW_parametros_in_membroClasse640 = new BitSet(new long[]{0x0000000003001000L});
    public static final BitSet FOLLOW_27_in_membroClasse644 = new BitSet(new long[]{0x0000000011000400L});
    public static final BitSet FOLLOW_parametros_in_membroClasse646 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_membroClasse648 = new BitSet(new long[]{0x0000000003001000L});
    public static final BitSet FOLLOW_tipo_in_membroClasse655 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_NEWLINE_in_membroClasse657 = new BitSet(new long[]{0xFFFFFFC100080400L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_operacao_in_membroClasse659 = new BitSet(new long[]{0xFFFFFFC100080400L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_32_in_membroClasse662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_parametros708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_parametros735 = new BitSet(new long[]{0x0000000001000402L});
    public static final BitSet FOLLOW_TIPO_REF_in_parametros750 = new BitSet(new long[]{0x0000000001000402L});
    public static final BitSet FOLLOW_51_in_manipulacaoObjetos812 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_campo_in_manipulacaoObjetos818 = new BitSet(new long[]{0x0000000003001000L});
    public static final BitSet FOLLOW_tipo_in_manipulacaoObjetos820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_manipulacaoObjetos858 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_campo_in_manipulacaoObjetos864 = new BitSet(new long[]{0x0000000003001000L});
    public static final BitSet FOLLOW_tipo_in_manipulacaoObjetos866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_manipulacaoObjetos904 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_classe_in_manipulacaoObjetos910 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_manipulacaoObjetos912 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_chamadaMetodo_in_manipulacaoObjetos918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_manipulacaoObjetos979 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_classe_in_manipulacaoObjetos984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_aritmetica1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_aritmetica1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_aritmetica1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_aritmetica1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_aritmetica1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_aritmetica1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_aritmetica1206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_load1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_load1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_load1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_load1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_load1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_load1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_load1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_load1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_load1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_load1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_load1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_load1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_load1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_load1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_load1532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_load1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_loadint1600 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_INTEIRO_in_loadint1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_loadint1626 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_INTEIRO_in_loadint1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_loadint1652 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_INTEIRO_in_loadint1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_store1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_store1738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_store1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_store1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_store1792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_store1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_store1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_store1846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_storeint1900 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_INTEIRO_in_storeint1906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_storeint1927 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_INTEIRO_in_storeint1933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_logica1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_logica2012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_logica2031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_desvio2082 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_desvio2088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_desvio2107 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_desvio2113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_desvio2132 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_desvio2138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_desvio2157 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_desvio2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_desvio2182 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_desvio2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_desvio2207 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_desvio2213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_desvio2232 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_desvio2238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_desvio2257 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_desvio2263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_desvio2282 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_desvio2288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_desvio2307 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_desvio2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_desvio2332 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_desvio2338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_desvio2357 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_desvio2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_desvio2382 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_desvio2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_pilha2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_pilha2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_pilha2485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_classe2551 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_classe2553 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_classe2562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INIT_in_chamadaMetodo2602 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_chamadaMetodo2608 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_VOID_in_chamadaMetodo2614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_campo2654 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_campo2656 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_campo2664 = new BitSet(new long[]{0x0000000000000002L});

}