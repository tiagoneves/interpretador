// $ANTLR 3.4 C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g 2012-09-03 16:44:55

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARITMETICA", "BODY", "DESVIO", "EXTENDS", "FIELD_DECL", "ID", "INIT", "INT", "INTEIRO", "LABEL", "LOAD", "LOGICA", "MAIN", "MEMBRO_CLASSE", "NEWLINE", "NULL", "PILHA", "STORE", "TIPO_REF", "VOID", "WS", "'('", "'()'", "')'", "'.class'", "'.end class'", "'.end method'", "'.field'", "'.method'", "'.super'", "'/'", "':'", "'aconst_null'", "'aload'", "'aload_0'", "'aload_1'", "'aload_2'", "'aload_3'", "'areturn'", "'astore'", "'astore_0'", "'astore_1'", "'astore_2'", "'astore_3'", "'dup'", "'getfield'", "'goto'", "'iadd'", "'iand'", "'iconst_0'", "'iconst_1'", "'iconst_2'", "'iconst_3'", "'iconst_4'", "'iconst_5'", "'iconst_m1'", "'idiv'", "'if_icmpeq'", "'if_icmpge'", "'if_icmpgt'", "'if_icmple'", "'if_icmplt'", "'if_icmpne'", "'ifeq'", "'ifge'", "'ifgt'", "'ifle'", "'iflt'", "'ifne'", "'iinc'", "'iload'", "'iload_0'", "'iload_1'", "'iload_2'", "'iload_3'", "'imul'", "'ineg'", "'invokespecial'", "'ior'", "'irem'", "'ireturn'", "'istore'", "'istore_0'", "'istore_1'", "'istore_2'", "'istore_3'", "'isub'", "'ixor'", "'ldc'", "'new'", "'nop'", "'pop'", "'pop2'", "'putfield'", "'return'"
    };

    public static final int EOF=-1;
    public static final int T__25=25;
    public static final int T__26=26;
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
    public static final int ARITMETICA=4;
    public static final int BODY=5;
    public static final int DESVIO=6;
    public static final int EXTENDS=7;
    public static final int FIELD_DECL=8;
    public static final int ID=9;
    public static final int INIT=10;
    public static final int INT=11;
    public static final int INTEIRO=12;
    public static final int LABEL=13;
    public static final int LOAD=14;
    public static final int LOGICA=15;
    public static final int MAIN=16;
    public static final int MEMBRO_CLASSE=17;
    public static final int NEWLINE=18;
    public static final int NULL=19;
    public static final int PILHA=20;
    public static final int STORE=21;
    public static final int TIPO_REF=22;
    public static final int VOID=23;
    public static final int WS=24;

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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:44:1: programa : ( instrucao )* ;
    public final AssemblerParser.programa_return programa() throws RecognitionException {
        AssemblerParser.programa_return retval = new AssemblerParser.programa_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        AssemblerParser.instrucao_return instrucao1 =null;



        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:44:10: ( ( instrucao )* )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:44:12: ( instrucao )*
            {
            root_0 = (BytecodesAST)adaptor.nil();


            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:44:12: ( instrucao )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID||LA1_0==NEWLINE||LA1_0==28||(LA1_0 >= 36 && LA1_0 <= 41)||(LA1_0 >= 43 && LA1_0 <= 83)||(LA1_0 >= 85 && LA1_0 <= 97)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:44:12: instrucao
            	    {
            	    pushFollow(FOLLOW_instrucao_in_programa112);
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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:47:1: instrucao : ( operacao | definicaoClasse ( '.end class' )? );
    public final AssemblerParser.instrucao_return instrucao() throws RecognitionException {
        AssemblerParser.instrucao_return retval = new AssemblerParser.instrucao_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token string_literal4=null;
        AssemblerParser.operacao_return operacao2 =null;

        AssemblerParser.definicaoClasse_return definicaoClasse3 =null;


        BytecodesAST string_literal4_tree=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:47:11: ( operacao | definicaoClasse ( '.end class' )? )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ID||LA3_0==NEWLINE||(LA3_0 >= 36 && LA3_0 <= 41)||(LA3_0 >= 43 && LA3_0 <= 83)||(LA3_0 >= 85 && LA3_0 <= 97)) ) {
                alt3=1;
            }
            else if ( (LA3_0==28) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:47:13: operacao
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    pushFollow(FOLLOW_operacao_in_instrucao140);
                    operacao2=operacao();

                    state._fsp--;

                    adaptor.addChild(root_0, operacao2.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:48:13: definicaoClasse ( '.end class' )?
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    pushFollow(FOLLOW_definicaoClasse_in_instrucao155);
                    definicaoClasse3=definicaoClasse();

                    state._fsp--;

                    adaptor.addChild(root_0, definicaoClasse3.getTree());

                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:48:29: ( '.end class' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==29) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:48:30: '.end class'
                            {
                            string_literal4=(Token)match(input,29,FOLLOW_29_in_instrucao158); 
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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:51:1: operacao : ( label comando | comando ) ;
    public final AssemblerParser.operacao_return operacao() throws RecognitionException {
        AssemblerParser.operacao_return retval = new AssemblerParser.operacao_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        AssemblerParser.label_return label5 =null;

        AssemblerParser.comando_return comando6 =null;

        AssemblerParser.comando_return comando7 =null;



        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:51:10: ( ( label comando | comando ) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:51:12: ( label comando | comando )
            {
            root_0 = (BytecodesAST)adaptor.nil();


            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:51:12: ( label comando | comando )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==NEWLINE||(LA4_0 >= 36 && LA4_0 <= 41)||(LA4_0 >= 43 && LA4_0 <= 83)||(LA4_0 >= 85 && LA4_0 <= 97)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:51:13: label comando
                    {
                    pushFollow(FOLLOW_label_in_operacao180);
                    label5=label();

                    state._fsp--;

                    adaptor.addChild(root_0, label5.getTree());

                    pushFollow(FOLLOW_comando_in_operacao182);
                    comando6=comando();

                    state._fsp--;

                    adaptor.addChild(root_0, comando6.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:51:29: comando
                    {
                    pushFollow(FOLLOW_comando_in_operacao186);
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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:53:1: label : a= ID ':' -> ^( LABEL $a) ;
    public final AssemblerParser.label_return label() throws RecognitionException {
        AssemblerParser.label_return retval = new AssemblerParser.label_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;
        Token char_literal8=null;

        BytecodesAST a_tree=null;
        BytecodesAST char_literal8_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:53:7: (a= ID ':' -> ^( LABEL $a) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:53:9: a= ID ':'
            {
            a=(Token)match(input,ID,FOLLOW_ID_in_label208);  
            stream_ID.add(a);


            char_literal8=(Token)match(input,35,FOLLOW_35_in_label210);  
            stream_35.add(char_literal8);


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
            // 53:20: -> ^( LABEL $a)
            {
                // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:53:23: ^( LABEL $a)
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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:55:1: comando : ( manipulacaoObjetos | aritmetica | load | loadint | store | storeint | desvio | logica | pilha | 'nop' )? NEWLINE ;
    public final AssemblerParser.comando_return comando() throws RecognitionException {
        AssemblerParser.comando_return retval = new AssemblerParser.comando_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token string_literal18=null;
        Token NEWLINE19=null;
        AssemblerParser.manipulacaoObjetos_return manipulacaoObjetos9 =null;

        AssemblerParser.aritmetica_return aritmetica10 =null;

        AssemblerParser.load_return load11 =null;

        AssemblerParser.loadint_return loadint12 =null;

        AssemblerParser.store_return store13 =null;

        AssemblerParser.storeint_return storeint14 =null;

        AssemblerParser.desvio_return desvio15 =null;

        AssemblerParser.logica_return logica16 =null;

        AssemblerParser.pilha_return pilha17 =null;


        BytecodesAST string_literal18_tree=null;
        BytecodesAST NEWLINE19_tree=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:55:8: ( ( manipulacaoObjetos | aritmetica | load | loadint | store | storeint | desvio | logica | pilha | 'nop' )? NEWLINE )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:55:10: ( manipulacaoObjetos | aritmetica | load | loadint | store | storeint | desvio | logica | pilha | 'nop' )? NEWLINE
            {
            root_0 = (BytecodesAST)adaptor.nil();


            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:55:10: ( manipulacaoObjetos | aritmetica | load | loadint | store | storeint | desvio | logica | pilha | 'nop' )?
            int alt5=11;
            switch ( input.LA(1) ) {
                case 49:
                case 81:
                case 93:
                case 97:
                    {
                    alt5=1;
                    }
                    break;
                case 51:
                case 60:
                case 73:
                case 79:
                case 80:
                case 83:
                case 90:
                    {
                    alt5=2;
                    }
                    break;
                case 36:
                case 38:
                case 39:
                case 40:
                case 41:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 75:
                case 76:
                case 77:
                case 78:
                    {
                    alt5=3;
                    }
                    break;
                case 37:
                case 74:
                case 92:
                    {
                    alt5=4;
                    }
                    break;
                case 44:
                case 45:
                case 46:
                case 47:
                case 86:
                case 87:
                case 88:
                case 89:
                    {
                    alt5=5;
                    }
                    break;
                case 43:
                case 85:
                    {
                    alt5=6;
                    }
                    break;
                case 50:
                case 61:
                case 62:
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
                    {
                    alt5=7;
                    }
                    break;
                case 52:
                case 82:
                case 91:
                    {
                    alt5=8;
                    }
                    break;
                case 48:
                case 95:
                case 96:
                    {
                    alt5=9;
                    }
                    break;
                case 94:
                    {
                    alt5=10;
                    }
                    break;
            }

            switch (alt5) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:55:17: manipulacaoObjetos
                    {
                    pushFollow(FOLLOW_manipulacaoObjetos_in_comando233);
                    manipulacaoObjetos9=manipulacaoObjetos();

                    state._fsp--;

                    adaptor.addChild(root_0, manipulacaoObjetos9.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:56:17: aritmetica
                    {
                    pushFollow(FOLLOW_aritmetica_in_comando252);
                    aritmetica10=aritmetica();

                    state._fsp--;

                    adaptor.addChild(root_0, aritmetica10.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:57:17: load
                    {
                    pushFollow(FOLLOW_load_in_comando271);
                    load11=load();

                    state._fsp--;

                    adaptor.addChild(root_0, load11.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:58:17: loadint
                    {
                    pushFollow(FOLLOW_loadint_in_comando289);
                    loadint12=loadint();

                    state._fsp--;

                    adaptor.addChild(root_0, loadint12.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:59:17: store
                    {
                    pushFollow(FOLLOW_store_in_comando308);
                    store13=store();

                    state._fsp--;

                    adaptor.addChild(root_0, store13.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:60:17: storeint
                    {
                    pushFollow(FOLLOW_storeint_in_comando326);
                    storeint14=storeint();

                    state._fsp--;

                    adaptor.addChild(root_0, storeint14.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:61:17: desvio
                    {
                    pushFollow(FOLLOW_desvio_in_comando345);
                    desvio15=desvio();

                    state._fsp--;

                    adaptor.addChild(root_0, desvio15.getTree());

                    }
                    break;
                case 8 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:62:17: logica
                    {
                    pushFollow(FOLLOW_logica_in_comando364);
                    logica16=logica();

                    state._fsp--;

                    adaptor.addChild(root_0, logica16.getTree());

                    }
                    break;
                case 9 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:63:17: pilha
                    {
                    pushFollow(FOLLOW_pilha_in_comando382);
                    pilha17=pilha();

                    state._fsp--;

                    adaptor.addChild(root_0, pilha17.getTree());

                    }
                    break;
                case 10 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:64:17: 'nop'
                    {
                    string_literal18=(Token)match(input,94,FOLLOW_94_in_comando401); 
                    string_literal18_tree = 
                    (BytecodesAST)adaptor.create(string_literal18)
                    ;
                    adaptor.addChild(root_0, string_literal18_tree);


                    }
                    break;

            }


            NEWLINE19=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_comando417); 
            NEWLINE19_tree = 
            (BytecodesAST)adaptor.create(NEWLINE19)
            ;
            adaptor.addChild(root_0, NEWLINE19_tree);


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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:67:1: definicaoClasse : '.class' ID NEWLINE ( superClasse NEWLINE )? ( membroClasse NEWLINE )+ -> ^( '.class' ID ( superClasse )? ^( MEMBRO_CLASSE ( membroClasse )+ ) ) ;
    public final AssemblerParser.definicaoClasse_return definicaoClasse() throws RecognitionException {
        AssemblerParser.definicaoClasse_return retval = new AssemblerParser.definicaoClasse_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token string_literal20=null;
        Token ID21=null;
        Token NEWLINE22=null;
        Token NEWLINE24=null;
        Token NEWLINE26=null;
        AssemblerParser.superClasse_return superClasse23 =null;

        AssemblerParser.membroClasse_return membroClasse25 =null;


        BytecodesAST string_literal20_tree=null;
        BytecodesAST ID21_tree=null;
        BytecodesAST NEWLINE22_tree=null;
        BytecodesAST NEWLINE24_tree=null;
        BytecodesAST NEWLINE26_tree=null;
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleSubtreeStream stream_membroClasse=new RewriteRuleSubtreeStream(adaptor,"rule membroClasse");
        RewriteRuleSubtreeStream stream_superClasse=new RewriteRuleSubtreeStream(adaptor,"rule superClasse");
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:68:5: ( '.class' ID NEWLINE ( superClasse NEWLINE )? ( membroClasse NEWLINE )+ -> ^( '.class' ID ( superClasse )? ^( MEMBRO_CLASSE ( membroClasse )+ ) ) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:68:7: '.class' ID NEWLINE ( superClasse NEWLINE )? ( membroClasse NEWLINE )+
            {
            string_literal20=(Token)match(input,28,FOLLOW_28_in_definicaoClasse443);  
            stream_28.add(string_literal20);


            ID21=(Token)match(input,ID,FOLLOW_ID_in_definicaoClasse445);  
            stream_ID.add(ID21);


            NEWLINE22=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_definicaoClasse447);  
            stream_NEWLINE.add(NEWLINE22);


            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:68:27: ( superClasse NEWLINE )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==33) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:68:28: superClasse NEWLINE
                    {
                    pushFollow(FOLLOW_superClasse_in_definicaoClasse450);
                    superClasse23=superClasse();

                    state._fsp--;

                    stream_superClasse.add(superClasse23.getTree());

                    NEWLINE24=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_definicaoClasse452);  
                    stream_NEWLINE.add(NEWLINE24);


                    }
                    break;

            }


            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:68:50: ( membroClasse NEWLINE )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= 31 && LA7_0 <= 32)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:68:51: membroClasse NEWLINE
            	    {
            	    pushFollow(FOLLOW_membroClasse_in_definicaoClasse457);
            	    membroClasse25=membroClasse();

            	    state._fsp--;

            	    stream_membroClasse.add(membroClasse25.getTree());

            	    NEWLINE26=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_definicaoClasse459);  
            	    stream_NEWLINE.add(NEWLINE26);


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
            // elements: 28, ID, membroClasse, superClasse
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BytecodesAST)adaptor.nil();
            // 69:12: -> ^( '.class' ID ( superClasse )? ^( MEMBRO_CLASSE ( membroClasse )+ ) )
            {
                // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:69:15: ^( '.class' ID ( superClasse )? ^( MEMBRO_CLASSE ( membroClasse )+ ) )
                {
                BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                root_1 = (BytecodesAST)adaptor.becomeRoot(
                stream_28.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:69:29: ( superClasse )?
                if ( stream_superClasse.hasNext() ) {
                    adaptor.addChild(root_1, stream_superClasse.nextTree());

                }
                stream_superClasse.reset();

                // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:69:42: ^( MEMBRO_CLASSE ( membroClasse )+ )
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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:72:1: superClasse : '.super' TIPO_REF -> ^( EXTENDS TIPO_REF ) ;
    public final AssemblerParser.superClasse_return superClasse() throws RecognitionException {
        AssemblerParser.superClasse_return retval = new AssemblerParser.superClasse_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token string_literal27=null;
        Token TIPO_REF28=null;

        BytecodesAST string_literal27_tree=null;
        BytecodesAST TIPO_REF28_tree=null;
        RewriteRuleTokenStream stream_TIPO_REF=new RewriteRuleTokenStream(adaptor,"token TIPO_REF");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:72:13: ( '.super' TIPO_REF -> ^( EXTENDS TIPO_REF ) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:72:15: '.super' TIPO_REF
            {
            string_literal27=(Token)match(input,33,FOLLOW_33_in_superClasse535);  
            stream_33.add(string_literal27);


            TIPO_REF28=(Token)match(input,TIPO_REF,FOLLOW_TIPO_REF_in_superClasse537);  
            stream_TIPO_REF.add(TIPO_REF28);


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
            // 72:33: -> ^( EXTENDS TIPO_REF )
            {
                // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:72:36: ^( EXTENDS TIPO_REF )
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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:74:1: membroClasse : ( '.field' ID tipo -> ^( FIELD_DECL ID tipo ) | '.method' INIT '()' VOID NEWLINE ( operacao )* 'return' NEWLINE '.end method' -> ^( '.method' INIT ^( BODY ( operacao )* ) ) | '.method' MAIN '()' VOID NEWLINE ( operacao )* ret= retorno NEWLINE '.end method' -> ^( '.method' MAIN ^( BODY ( operacao )* ) $ret) | '.method' ID '(' (tipos+= tipo )* ')' tipo NEWLINE ( operacao )* ret= retorno NEWLINE '.end method' -> ^( '.method' ID $tipos ^( BODY ( operacao )* ) $ret) );
    public final AssemblerParser.membroClasse_return membroClasse() throws RecognitionException {
        AssemblerParser.membroClasse_return retval = new AssemblerParser.membroClasse_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token string_literal29=null;
        Token ID30=null;
        Token string_literal32=null;
        Token INIT33=null;
        Token string_literal34=null;
        Token VOID35=null;
        Token NEWLINE36=null;
        Token string_literal38=null;
        Token NEWLINE39=null;
        Token string_literal40=null;
        Token string_literal41=null;
        Token MAIN42=null;
        Token string_literal43=null;
        Token VOID44=null;
        Token NEWLINE45=null;
        Token NEWLINE47=null;
        Token string_literal48=null;
        Token string_literal49=null;
        Token ID50=null;
        Token char_literal51=null;
        Token char_literal52=null;
        Token NEWLINE54=null;
        Token NEWLINE56=null;
        Token string_literal57=null;
        List list_tipos=null;
        AssemblerParser.retorno_return ret =null;

        AssemblerParser.tipo_return tipo31 =null;

        AssemblerParser.operacao_return operacao37 =null;

        AssemblerParser.operacao_return operacao46 =null;

        AssemblerParser.tipo_return tipo53 =null;

        AssemblerParser.operacao_return operacao55 =null;

        RuleReturnScope tipos = null;
        BytecodesAST string_literal29_tree=null;
        BytecodesAST ID30_tree=null;
        BytecodesAST string_literal32_tree=null;
        BytecodesAST INIT33_tree=null;
        BytecodesAST string_literal34_tree=null;
        BytecodesAST VOID35_tree=null;
        BytecodesAST NEWLINE36_tree=null;
        BytecodesAST string_literal38_tree=null;
        BytecodesAST NEWLINE39_tree=null;
        BytecodesAST string_literal40_tree=null;
        BytecodesAST string_literal41_tree=null;
        BytecodesAST MAIN42_tree=null;
        BytecodesAST string_literal43_tree=null;
        BytecodesAST VOID44_tree=null;
        BytecodesAST NEWLINE45_tree=null;
        BytecodesAST NEWLINE47_tree=null;
        BytecodesAST string_literal48_tree=null;
        BytecodesAST string_literal49_tree=null;
        BytecodesAST ID50_tree=null;
        BytecodesAST char_literal51_tree=null;
        BytecodesAST char_literal52_tree=null;
        BytecodesAST NEWLINE54_tree=null;
        BytecodesAST NEWLINE56_tree=null;
        BytecodesAST string_literal57_tree=null;
        RewriteRuleTokenStream stream_98=new RewriteRuleTokenStream(adaptor,"token 98");
        RewriteRuleTokenStream stream_MAIN=new RewriteRuleTokenStream(adaptor,"token MAIN");
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_VOID=new RewriteRuleTokenStream(adaptor,"token VOID");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_NEWLINE=new RewriteRuleTokenStream(adaptor,"token NEWLINE");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_INIT=new RewriteRuleTokenStream(adaptor,"token INIT");
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleSubtreeStream stream_retorno=new RewriteRuleSubtreeStream(adaptor,"rule retorno");
        RewriteRuleSubtreeStream stream_tipo=new RewriteRuleSubtreeStream(adaptor,"rule tipo");
        RewriteRuleSubtreeStream stream_operacao=new RewriteRuleSubtreeStream(adaptor,"rule operacao");
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:75:5: ( '.field' ID tipo -> ^( FIELD_DECL ID tipo ) | '.method' INIT '()' VOID NEWLINE ( operacao )* 'return' NEWLINE '.end method' -> ^( '.method' INIT ^( BODY ( operacao )* ) ) | '.method' MAIN '()' VOID NEWLINE ( operacao )* ret= retorno NEWLINE '.end method' -> ^( '.method' MAIN ^( BODY ( operacao )* ) $ret) | '.method' ID '(' (tipos+= tipo )* ')' tipo NEWLINE ( operacao )* ret= retorno NEWLINE '.end method' -> ^( '.method' ID $tipos ^( BODY ( operacao )* ) $ret) )
            int alt12=4;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            else if ( (LA12_0==32) ) {
                switch ( input.LA(2) ) {
                case INIT:
                    {
                    alt12=2;
                    }
                    break;
                case MAIN:
                    {
                    alt12=3;
                    }
                    break;
                case ID:
                    {
                    alt12=4;
                    }
                    break;
                default:
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
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:75:7: '.field' ID tipo
                    {
                    string_literal29=(Token)match(input,31,FOLLOW_31_in_membroClasse559);  
                    stream_31.add(string_literal29);


                    ID30=(Token)match(input,ID,FOLLOW_ID_in_membroClasse561);  
                    stream_ID.add(ID30);


                    pushFollow(FOLLOW_tipo_in_membroClasse563);
                    tipo31=tipo();

                    state._fsp--;

                    stream_tipo.add(tipo31.getTree());

                    // AST REWRITE
                    // elements: tipo, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BytecodesAST)adaptor.nil();
                    // 75:24: -> ^( FIELD_DECL ID tipo )
                    {
                        // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:75:27: ^( FIELD_DECL ID tipo )
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
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:76:7: '.method' INIT '()' VOID NEWLINE ( operacao )* 'return' NEWLINE '.end method'
                    {
                    string_literal32=(Token)match(input,32,FOLLOW_32_in_membroClasse582);  
                    stream_32.add(string_literal32);


                    INIT33=(Token)match(input,INIT,FOLLOW_INIT_in_membroClasse584);  
                    stream_INIT.add(INIT33);


                    string_literal34=(Token)match(input,26,FOLLOW_26_in_membroClasse586);  
                    stream_26.add(string_literal34);


                    VOID35=(Token)match(input,VOID,FOLLOW_VOID_in_membroClasse588);  
                    stream_VOID.add(VOID35);


                    NEWLINE36=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_membroClasse590);  
                    stream_NEWLINE.add(NEWLINE36);


                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:76:40: ( operacao )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==ID||LA8_0==NEWLINE||(LA8_0 >= 36 && LA8_0 <= 41)||(LA8_0 >= 43 && LA8_0 <= 83)||(LA8_0 >= 85 && LA8_0 <= 97)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:76:40: operacao
                    	    {
                    	    pushFollow(FOLLOW_operacao_in_membroClasse592);
                    	    operacao37=operacao();

                    	    state._fsp--;

                    	    stream_operacao.add(operacao37.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    string_literal38=(Token)match(input,98,FOLLOW_98_in_membroClasse595);  
                    stream_98.add(string_literal38);


                    NEWLINE39=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_membroClasse597);  
                    stream_NEWLINE.add(NEWLINE39);


                    string_literal40=(Token)match(input,30,FOLLOW_30_in_membroClasse599);  
                    stream_30.add(string_literal40);


                    // AST REWRITE
                    // elements: 32, operacao, INIT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BytecodesAST)adaptor.nil();
                    // 77:2: -> ^( '.method' INIT ^( BODY ( operacao )* ) )
                    {
                        // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:77:5: ^( '.method' INIT ^( BODY ( operacao )* ) )
                        {
                        BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                        root_1 = (BytecodesAST)adaptor.becomeRoot(
                        stream_32.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_INIT.nextNode()
                        );

                        // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:77:22: ^( BODY ( operacao )* )
                        {
                        BytecodesAST root_2 = (BytecodesAST)adaptor.nil();
                        root_2 = (BytecodesAST)adaptor.becomeRoot(
                        (BytecodesAST)adaptor.create(BODY, "BODY")
                        , root_2);

                        // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:77:29: ( operacao )*
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
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:78:7: '.method' MAIN '()' VOID NEWLINE ( operacao )* ret= retorno NEWLINE '.end method'
                    {
                    string_literal41=(Token)match(input,32,FOLLOW_32_in_membroClasse623);  
                    stream_32.add(string_literal41);


                    MAIN42=(Token)match(input,MAIN,FOLLOW_MAIN_in_membroClasse625);  
                    stream_MAIN.add(MAIN42);


                    string_literal43=(Token)match(input,26,FOLLOW_26_in_membroClasse627);  
                    stream_26.add(string_literal43);


                    VOID44=(Token)match(input,VOID,FOLLOW_VOID_in_membroClasse629);  
                    stream_VOID.add(VOID44);


                    NEWLINE45=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_membroClasse631);  
                    stream_NEWLINE.add(NEWLINE45);


                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:78:40: ( operacao )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==ID||LA9_0==NEWLINE||(LA9_0 >= 36 && LA9_0 <= 41)||(LA9_0 >= 43 && LA9_0 <= 83)||(LA9_0 >= 85 && LA9_0 <= 97)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:78:40: operacao
                    	    {
                    	    pushFollow(FOLLOW_operacao_in_membroClasse633);
                    	    operacao46=operacao();

                    	    state._fsp--;

                    	    stream_operacao.add(operacao46.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    pushFollow(FOLLOW_retorno_in_membroClasse640);
                    ret=retorno();

                    state._fsp--;

                    stream_retorno.add(ret.getTree());

                    NEWLINE47=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_membroClasse642);  
                    stream_NEWLINE.add(NEWLINE47);


                    string_literal48=(Token)match(input,30,FOLLOW_30_in_membroClasse644);  
                    stream_30.add(string_literal48);


                    // AST REWRITE
                    // elements: ret, 32, MAIN, operacao
                    // token labels: 
                    // rule labels: ret, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_ret=new RewriteRuleSubtreeStream(adaptor,"rule ret",ret!=null?ret.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BytecodesAST)adaptor.nil();
                    // 79:9: -> ^( '.method' MAIN ^( BODY ( operacao )* ) $ret)
                    {
                        // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:79:12: ^( '.method' MAIN ^( BODY ( operacao )* ) $ret)
                        {
                        BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                        root_1 = (BytecodesAST)adaptor.becomeRoot(
                        stream_32.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_MAIN.nextNode()
                        );

                        // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:79:29: ^( BODY ( operacao )* )
                        {
                        BytecodesAST root_2 = (BytecodesAST)adaptor.nil();
                        root_2 = (BytecodesAST)adaptor.becomeRoot(
                        (BytecodesAST)adaptor.create(BODY, "BODY")
                        , root_2);

                        // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:79:36: ( operacao )*
                        while ( stream_operacao.hasNext() ) {
                            adaptor.addChild(root_2, stream_operacao.nextTree());

                        }
                        stream_operacao.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, stream_ret.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:80:7: '.method' ID '(' (tipos+= tipo )* ')' tipo NEWLINE ( operacao )* ret= retorno NEWLINE '.end method'
                    {
                    string_literal49=(Token)match(input,32,FOLLOW_32_in_membroClasse678);  
                    stream_32.add(string_literal49);


                    ID50=(Token)match(input,ID,FOLLOW_ID_in_membroClasse680);  
                    stream_ID.add(ID50);


                    char_literal51=(Token)match(input,25,FOLLOW_25_in_membroClasse682);  
                    stream_25.add(char_literal51);


                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:80:24: (tipos+= tipo )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==INT||(LA10_0 >= TIPO_REF && LA10_0 <= VOID)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:80:25: tipos+= tipo
                    	    {
                    	    pushFollow(FOLLOW_tipo_in_membroClasse689);
                    	    tipos=tipo();

                    	    state._fsp--;

                    	    stream_tipo.add(tipos.getTree());
                    	    if (list_tipos==null) list_tipos=new ArrayList();
                    	    list_tipos.add(tipos.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    char_literal52=(Token)match(input,27,FOLLOW_27_in_membroClasse693);  
                    stream_27.add(char_literal52);


                    pushFollow(FOLLOW_tipo_in_membroClasse695);
                    tipo53=tipo();

                    state._fsp--;

                    stream_tipo.add(tipo53.getTree());

                    NEWLINE54=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_membroClasse697);  
                    stream_NEWLINE.add(NEWLINE54);


                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:80:58: ( operacao )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==ID||LA11_0==NEWLINE||(LA11_0 >= 36 && LA11_0 <= 41)||(LA11_0 >= 43 && LA11_0 <= 83)||(LA11_0 >= 85 && LA11_0 <= 97)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:80:58: operacao
                    	    {
                    	    pushFollow(FOLLOW_operacao_in_membroClasse699);
                    	    operacao55=operacao();

                    	    state._fsp--;

                    	    stream_operacao.add(operacao55.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    pushFollow(FOLLOW_retorno_in_membroClasse706);
                    ret=retorno();

                    state._fsp--;

                    stream_retorno.add(ret.getTree());

                    NEWLINE56=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_membroClasse708);  
                    stream_NEWLINE.add(NEWLINE56);


                    string_literal57=(Token)match(input,30,FOLLOW_30_in_membroClasse710);  
                    stream_30.add(string_literal57);


                    // AST REWRITE
                    // elements: 32, ret, operacao, tipos, ID
                    // token labels: 
                    // rule labels: ret, retval
                    // token list labels: 
                    // rule list labels: tipos
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_ret=new RewriteRuleSubtreeStream(adaptor,"rule ret",ret!=null?ret.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_tipos=new RewriteRuleSubtreeStream(adaptor,"token tipos",list_tipos);
                    root_0 = (BytecodesAST)adaptor.nil();
                    // 81:9: -> ^( '.method' ID $tipos ^( BODY ( operacao )* ) $ret)
                    {
                        // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:81:12: ^( '.method' ID $tipos ^( BODY ( operacao )* ) $ret)
                        {
                        BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                        root_1 = (BytecodesAST)adaptor.becomeRoot(
                        stream_32.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, stream_tipos.nextTree());

                        // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:81:34: ^( BODY ( operacao )* )
                        {
                        BytecodesAST root_2 = (BytecodesAST)adaptor.nil();
                        root_2 = (BytecodesAST)adaptor.becomeRoot(
                        (BytecodesAST)adaptor.create(BODY, "BODY")
                        , root_2);

                        // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:81:41: ( operacao )*
                        while ( stream_operacao.hasNext() ) {
                            adaptor.addChild(root_2, stream_operacao.nextTree());

                        }
                        stream_operacao.reset();

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_1, stream_ret.nextTree());

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


    public static class retorno_return extends ParserRuleReturnScope {
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "retorno"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:85:1: retorno : ( 'areturn' | 'ireturn' | 'return' );
    public final AssemblerParser.retorno_return retorno() throws RecognitionException {
        AssemblerParser.retorno_return retval = new AssemblerParser.retorno_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token set58=null;

        BytecodesAST set58_tree=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:85:9: ( 'areturn' | 'ireturn' | 'return' )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:
            {
            root_0 = (BytecodesAST)adaptor.nil();


            set58=(Token)input.LT(1);

            if ( input.LA(1)==42||input.LA(1)==84||input.LA(1)==98 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (BytecodesAST)adaptor.create(set58)
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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:87:1: manipulacaoObjetos : (a= 'getfield' b= campo tipo -> ^( 'getfield' $b tipo ) |a= 'putfield' b= campo tipo -> ^( 'putfield' $b tipo ) |a= 'invokespecial' c= classe '/' d= chamadaMetodo -> ^( 'invokespecial' $c $d) |a= 'new' c= classe -> ^( 'new' $c) );
    public final AssemblerParser.manipulacaoObjetos_return manipulacaoObjetos() throws RecognitionException {
        AssemblerParser.manipulacaoObjetos_return retval = new AssemblerParser.manipulacaoObjetos_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;
        Token char_literal61=null;
        AssemblerParser.campo_return b =null;

        AssemblerParser.classe_return c =null;

        AssemblerParser.chamadaMetodo_return d =null;

        AssemblerParser.tipo_return tipo59 =null;

        AssemblerParser.tipo_return tipo60 =null;


        BytecodesAST a_tree=null;
        BytecodesAST char_literal61_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_97=new RewriteRuleTokenStream(adaptor,"token 97");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleSubtreeStream stream_classe=new RewriteRuleSubtreeStream(adaptor,"rule classe");
        RewriteRuleSubtreeStream stream_campo=new RewriteRuleSubtreeStream(adaptor,"rule campo");
        RewriteRuleSubtreeStream stream_chamadaMetodo=new RewriteRuleSubtreeStream(adaptor,"rule chamadaMetodo");
        RewriteRuleSubtreeStream stream_tipo=new RewriteRuleSubtreeStream(adaptor,"rule tipo");
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:87:20: (a= 'getfield' b= campo tipo -> ^( 'getfield' $b tipo ) |a= 'putfield' b= campo tipo -> ^( 'putfield' $b tipo ) |a= 'invokespecial' c= classe '/' d= chamadaMetodo -> ^( 'invokespecial' $c $d) |a= 'new' c= classe -> ^( 'new' $c) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt13=1;
                }
                break;
            case 97:
                {
                alt13=2;
                }
                break;
            case 81:
                {
                alt13=3;
                }
                break;
            case 93:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:87:22: a= 'getfield' b= campo tipo
                    {
                    a=(Token)match(input,49,FOLLOW_49_in_manipulacaoObjetos800);  
                    stream_49.add(a);


                    pushFollow(FOLLOW_campo_in_manipulacaoObjetos806);
                    b=campo();

                    state._fsp--;

                    stream_campo.add(b.getTree());

                    pushFollow(FOLLOW_tipo_in_manipulacaoObjetos808);
                    tipo59=tipo();

                    state._fsp--;

                    stream_tipo.add(tipo59.getTree());

                    // AST REWRITE
                    // elements: 49, tipo, b
                    // token labels: 
                    // rule labels: retval, b
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);

                    root_0 = (BytecodesAST)adaptor.nil();
                    // 87:52: -> ^( 'getfield' $b tipo )
                    {
                        // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:87:55: ^( 'getfield' $b tipo )
                        {
                        BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                        root_1 = (BytecodesAST)adaptor.becomeRoot(
                        stream_49.nextNode()
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
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:88:22: a= 'putfield' b= campo tipo
                    {
                    a=(Token)match(input,97,FOLLOW_97_in_manipulacaoObjetos846);  
                    stream_97.add(a);


                    pushFollow(FOLLOW_campo_in_manipulacaoObjetos852);
                    b=campo();

                    state._fsp--;

                    stream_campo.add(b.getTree());

                    pushFollow(FOLLOW_tipo_in_manipulacaoObjetos854);
                    tipo60=tipo();

                    state._fsp--;

                    stream_tipo.add(tipo60.getTree());

                    // AST REWRITE
                    // elements: 97, tipo, b
                    // token labels: 
                    // rule labels: retval, b
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);

                    root_0 = (BytecodesAST)adaptor.nil();
                    // 88:52: -> ^( 'putfield' $b tipo )
                    {
                        // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:88:55: ^( 'putfield' $b tipo )
                        {
                        BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                        root_1 = (BytecodesAST)adaptor.becomeRoot(
                        stream_97.nextNode()
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
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:89:22: a= 'invokespecial' c= classe '/' d= chamadaMetodo
                    {
                    a=(Token)match(input,81,FOLLOW_81_in_manipulacaoObjetos893);  
                    stream_81.add(a);


                    pushFollow(FOLLOW_classe_in_manipulacaoObjetos899);
                    c=classe();

                    state._fsp--;

                    stream_classe.add(c.getTree());

                    char_literal61=(Token)match(input,34,FOLLOW_34_in_manipulacaoObjetos901);  
                    stream_34.add(char_literal61);


                    pushFollow(FOLLOW_chamadaMetodo_in_manipulacaoObjetos907);
                    d=chamadaMetodo();

                    state._fsp--;

                    stream_chamadaMetodo.add(d.getTree());

                    // AST REWRITE
                    // elements: d, 81, c
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
                    // 90:23: -> ^( 'invokespecial' $c $d)
                    {
                        // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:90:26: ^( 'invokespecial' $c $d)
                        {
                        BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                        root_1 = (BytecodesAST)adaptor.becomeRoot(
                        stream_81.nextNode()
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
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:91:22: a= 'new' c= classe
                    {
                    a=(Token)match(input,93,FOLLOW_93_in_manipulacaoObjetos969);  
                    stream_93.add(a);


                    pushFollow(FOLLOW_classe_in_manipulacaoObjetos974);
                    c=classe();

                    state._fsp--;

                    stream_classe.add(c.getTree());

                    // AST REWRITE
                    // elements: 93, c
                    // token labels: 
                    // rule labels: retval, c
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.tree:null);

                    root_0 = (BytecodesAST)adaptor.nil();
                    // 91:42: -> ^( 'new' $c)
                    {
                        // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:91:45: ^( 'new' $c)
                        {
                        BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                        root_1 = (BytecodesAST)adaptor.becomeRoot(
                        stream_93.nextNode()
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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:94:1: tipo : ( INT | VOID | TIPO_REF );
    public final AssemblerParser.tipo_return tipo() throws RecognitionException {
        AssemblerParser.tipo_return retval = new AssemblerParser.tipo_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token set62=null;

        BytecodesAST set62_tree=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:94:6: ( INT | VOID | TIPO_REF )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:
            {
            root_0 = (BytecodesAST)adaptor.nil();


            set62=(Token)input.LT(1);

            if ( input.LA(1)==INT||(input.LA(1) >= TIPO_REF && input.LA(1) <= VOID) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (BytecodesAST)adaptor.create(set62)
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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:96:1: aritmetica : (a= 'iadd' |a= 'isub' |a= 'imul' |a= 'idiv' |a= 'irem' |a= 'iinc' |a= 'ineg' ) -> ^( ARITMETICA $a) ;
    public final AssemblerParser.aritmetica_return aritmetica() throws RecognitionException {
        AssemblerParser.aritmetica_return retval = new AssemblerParser.aritmetica_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;

        BytecodesAST a_tree=null;
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:96:12: ( (a= 'iadd' |a= 'isub' |a= 'imul' |a= 'idiv' |a= 'irem' |a= 'iinc' |a= 'ineg' ) -> ^( ARITMETICA $a) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:96:14: (a= 'iadd' |a= 'isub' |a= 'imul' |a= 'idiv' |a= 'irem' |a= 'iinc' |a= 'ineg' )
            {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:96:14: (a= 'iadd' |a= 'isub' |a= 'imul' |a= 'idiv' |a= 'irem' |a= 'iinc' |a= 'ineg' )
            int alt14=7;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt14=1;
                }
                break;
            case 90:
                {
                alt14=2;
                }
                break;
            case 79:
                {
                alt14=3;
                }
                break;
            case 60:
                {
                alt14=4;
                }
                break;
            case 83:
                {
                alt14=5;
                }
                break;
            case 73:
                {
                alt14=6;
                }
                break;
            case 80:
                {
                alt14=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }

            switch (alt14) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:96:19: a= 'iadd'
                    {
                    a=(Token)match(input,51,FOLLOW_51_in_aritmetica1038);  
                    stream_51.add(a);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:97:19: a= 'isub'
                    {
                    a=(Token)match(input,90,FOLLOW_90_in_aritmetica1062);  
                    stream_90.add(a);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:98:19: a= 'imul'
                    {
                    a=(Token)match(input,79,FOLLOW_79_in_aritmetica1086);  
                    stream_79.add(a);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:99:19: a= 'idiv'
                    {
                    a=(Token)match(input,60,FOLLOW_60_in_aritmetica1110);  
                    stream_60.add(a);


                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:100:19: a= 'irem'
                    {
                    a=(Token)match(input,83,FOLLOW_83_in_aritmetica1134);  
                    stream_83.add(a);


                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:101:19: a= 'iinc'
                    {
                    a=(Token)match(input,73,FOLLOW_73_in_aritmetica1158);  
                    stream_73.add(a);


                    }
                    break;
                case 7 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:102:19: a= 'ineg'
                    {
                    a=(Token)match(input,80,FOLLOW_80_in_aritmetica1182);  
                    stream_80.add(a);


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
            // 104:14: -> ^( ARITMETICA $a)
            {
                // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:104:17: ^( ARITMETICA $a)
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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:107:1: load : (a= 'iconst_m1' |a= 'iconst_0' |a= 'iconst_1' |a= 'iconst_2' |a= 'iconst_3' |a= 'iconst_4' |a= 'iconst_5' |a= 'aconst_null' |a= 'iload_0' |a= 'iload_1' |a= 'iload_2' |a= 'iload_3' |a= 'aload_0' |a= 'aload_1' |a= 'aload_2' |a= 'aload_3' ) -> ^( LOAD $a) ;
    public final AssemblerParser.load_return load() throws RecognitionException {
        AssemblerParser.load_return retval = new AssemblerParser.load_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;

        BytecodesAST a_tree=null;
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:107:6: ( (a= 'iconst_m1' |a= 'iconst_0' |a= 'iconst_1' |a= 'iconst_2' |a= 'iconst_3' |a= 'iconst_4' |a= 'iconst_5' |a= 'aconst_null' |a= 'iload_0' |a= 'iload_1' |a= 'iload_2' |a= 'iload_3' |a= 'aload_0' |a= 'aload_1' |a= 'aload_2' |a= 'aload_3' ) -> ^( LOAD $a) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:107:8: (a= 'iconst_m1' |a= 'iconst_0' |a= 'iconst_1' |a= 'iconst_2' |a= 'iconst_3' |a= 'iconst_4' |a= 'iconst_5' |a= 'aconst_null' |a= 'iload_0' |a= 'iload_1' |a= 'iload_2' |a= 'iload_3' |a= 'aload_0' |a= 'aload_1' |a= 'aload_2' |a= 'aload_3' )
            {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:107:8: (a= 'iconst_m1' |a= 'iconst_0' |a= 'iconst_1' |a= 'iconst_2' |a= 'iconst_3' |a= 'iconst_4' |a= 'iconst_5' |a= 'aconst_null' |a= 'iload_0' |a= 'iload_1' |a= 'iload_2' |a= 'iload_3' |a= 'aload_0' |a= 'aload_1' |a= 'aload_2' |a= 'aload_3' )
            int alt15=16;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt15=1;
                }
                break;
            case 53:
                {
                alt15=2;
                }
                break;
            case 54:
                {
                alt15=3;
                }
                break;
            case 55:
                {
                alt15=4;
                }
                break;
            case 56:
                {
                alt15=5;
                }
                break;
            case 57:
                {
                alt15=6;
                }
                break;
            case 58:
                {
                alt15=7;
                }
                break;
            case 36:
                {
                alt15=8;
                }
                break;
            case 75:
                {
                alt15=9;
                }
                break;
            case 76:
                {
                alt15=10;
                }
                break;
            case 77:
                {
                alt15=11;
                }
                break;
            case 78:
                {
                alt15=12;
                }
                break;
            case 38:
                {
                alt15=13;
                }
                break;
            case 39:
                {
                alt15=14;
                }
                break;
            case 40:
                {
                alt15=15;
                }
                break;
            case 41:
                {
                alt15=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }

            switch (alt15) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:107:13: a= 'iconst_m1'
                    {
                    a=(Token)match(input,59,FOLLOW_59_in_load1260);  
                    stream_59.add(a);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:108:13: a= 'iconst_0'
                    {
                    a=(Token)match(input,53,FOLLOW_53_in_load1278);  
                    stream_53.add(a);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:109:13: a= 'iconst_1'
                    {
                    a=(Token)match(input,54,FOLLOW_54_in_load1296);  
                    stream_54.add(a);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:110:13: a= 'iconst_2'
                    {
                    a=(Token)match(input,55,FOLLOW_55_in_load1314);  
                    stream_55.add(a);


                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:111:13: a= 'iconst_3'
                    {
                    a=(Token)match(input,56,FOLLOW_56_in_load1333);  
                    stream_56.add(a);


                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:112:13: a= 'iconst_4'
                    {
                    a=(Token)match(input,57,FOLLOW_57_in_load1351);  
                    stream_57.add(a);


                    }
                    break;
                case 7 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:113:13: a= 'iconst_5'
                    {
                    a=(Token)match(input,58,FOLLOW_58_in_load1369);  
                    stream_58.add(a);


                    }
                    break;
                case 8 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:114:13: a= 'aconst_null'
                    {
                    a=(Token)match(input,36,FOLLOW_36_in_load1387);  
                    stream_36.add(a);


                    }
                    break;
                case 9 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:115:13: a= 'iload_0'
                    {
                    a=(Token)match(input,75,FOLLOW_75_in_load1406);  
                    stream_75.add(a);


                    }
                    break;
                case 10 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:116:13: a= 'iload_1'
                    {
                    a=(Token)match(input,76,FOLLOW_76_in_load1425);  
                    stream_76.add(a);


                    }
                    break;
                case 11 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:117:13: a= 'iload_2'
                    {
                    a=(Token)match(input,77,FOLLOW_77_in_load1443);  
                    stream_77.add(a);


                    }
                    break;
                case 12 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:118:13: a= 'iload_3'
                    {
                    a=(Token)match(input,78,FOLLOW_78_in_load1461);  
                    stream_78.add(a);


                    }
                    break;
                case 13 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:119:13: a= 'aload_0'
                    {
                    a=(Token)match(input,38,FOLLOW_38_in_load1479);  
                    stream_38.add(a);


                    }
                    break;
                case 14 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:120:13: a= 'aload_1'
                    {
                    a=(Token)match(input,39,FOLLOW_39_in_load1497);  
                    stream_39.add(a);


                    }
                    break;
                case 15 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:121:13: a= 'aload_2'
                    {
                    a=(Token)match(input,40,FOLLOW_40_in_load1516);  
                    stream_40.add(a);


                    }
                    break;
                case 16 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:122:13: a= 'aload_3'
                    {
                    a=(Token)match(input,41,FOLLOW_41_in_load1534);  
                    stream_41.add(a);


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
            // 124:8: -> ^( LOAD $a)
            {
                // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:124:11: ^( LOAD $a)
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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:127:1: loadint : (a= 'iload' b= INTEIRO |a= 'ldc' b= INTEIRO |a= 'aload' b= INTEIRO ) -> ^( LOAD $a $b) ;
    public final AssemblerParser.loadint_return loadint() throws RecognitionException {
        AssemblerParser.loadint_return retval = new AssemblerParser.loadint_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;
        Token b=null;

        BytecodesAST a_tree=null;
        BytecodesAST b_tree=null;
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleTokenStream stream_INTEIRO=new RewriteRuleTokenStream(adaptor,"token INTEIRO");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:127:9: ( (a= 'iload' b= INTEIRO |a= 'ldc' b= INTEIRO |a= 'aload' b= INTEIRO ) -> ^( LOAD $a $b) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:127:11: (a= 'iload' b= INTEIRO |a= 'ldc' b= INTEIRO |a= 'aload' b= INTEIRO )
            {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:127:11: (a= 'iload' b= INTEIRO |a= 'ldc' b= INTEIRO |a= 'aload' b= INTEIRO )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt16=1;
                }
                break;
            case 92:
                {
                alt16=2;
                }
                break;
            case 37:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }

            switch (alt16) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:127:15: a= 'iload' b= INTEIRO
                    {
                    a=(Token)match(input,74,FOLLOW_74_in_loadint1588);  
                    stream_74.add(a);


                    b=(Token)match(input,INTEIRO,FOLLOW_INTEIRO_in_loadint1594);  
                    stream_INTEIRO.add(b);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:128:15: a= 'ldc' b= INTEIRO
                    {
                    a=(Token)match(input,92,FOLLOW_92_in_loadint1615);  
                    stream_92.add(a);


                    b=(Token)match(input,INTEIRO,FOLLOW_INTEIRO_in_loadint1621);  
                    stream_INTEIRO.add(b);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:129:15: a= 'aload' b= INTEIRO
                    {
                    a=(Token)match(input,37,FOLLOW_37_in_loadint1641);  
                    stream_37.add(a);


                    b=(Token)match(input,INTEIRO,FOLLOW_INTEIRO_in_loadint1647);  
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
            // 131:11: -> ^( LOAD $a $b)
            {
                // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:131:14: ^( LOAD $a $b)
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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:134:1: store : (a= 'istore_0' |a= 'istore_1' |a= 'istore_2' |a= 'istore_3' |a= 'astore_0' |a= 'astore_1' |a= 'astore_2' |a= 'astore_3' ) -> ^( STORE $a) ;
    public final AssemblerParser.store_return store() throws RecognitionException {
        AssemblerParser.store_return retval = new AssemblerParser.store_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;

        BytecodesAST a_tree=null;
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:134:7: ( (a= 'istore_0' |a= 'istore_1' |a= 'istore_2' |a= 'istore_3' |a= 'astore_0' |a= 'astore_1' |a= 'astore_2' |a= 'astore_3' ) -> ^( STORE $a) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:134:9: (a= 'istore_0' |a= 'istore_1' |a= 'istore_2' |a= 'istore_3' |a= 'astore_0' |a= 'astore_1' |a= 'astore_2' |a= 'astore_3' )
            {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:134:9: (a= 'istore_0' |a= 'istore_1' |a= 'istore_2' |a= 'istore_3' |a= 'astore_0' |a= 'astore_1' |a= 'astore_2' |a= 'astore_3' )
            int alt17=8;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt17=1;
                }
                break;
            case 87:
                {
                alt17=2;
                }
                break;
            case 88:
                {
                alt17=3;
                }
                break;
            case 89:
                {
                alt17=4;
                }
                break;
            case 44:
                {
                alt17=5;
                }
                break;
            case 45:
                {
                alt17=6;
                }
                break;
            case 46:
                {
                alt17=7;
                }
                break;
            case 47:
                {
                alt17=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }

            switch (alt17) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:134:13: a= 'istore_0'
                    {
                    a=(Token)match(input,86,FOLLOW_86_in_store1714);  
                    stream_86.add(a);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:135:13: a= 'istore_1'
                    {
                    a=(Token)match(input,87,FOLLOW_87_in_store1733);  
                    stream_87.add(a);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:136:13: a= 'istore_2'
                    {
                    a=(Token)match(input,88,FOLLOW_88_in_store1752);  
                    stream_88.add(a);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:137:13: a= 'istore_3'
                    {
                    a=(Token)match(input,89,FOLLOW_89_in_store1771);  
                    stream_89.add(a);


                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:138:13: a= 'astore_0'
                    {
                    a=(Token)match(input,44,FOLLOW_44_in_store1790);  
                    stream_44.add(a);


                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:139:13: a= 'astore_1'
                    {
                    a=(Token)match(input,45,FOLLOW_45_in_store1808);  
                    stream_45.add(a);


                    }
                    break;
                case 7 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:140:13: a= 'astore_2'
                    {
                    a=(Token)match(input,46,FOLLOW_46_in_store1827);  
                    stream_46.add(a);


                    }
                    break;
                case 8 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:141:13: a= 'astore_3'
                    {
                    a=(Token)match(input,47,FOLLOW_47_in_store1846);  
                    stream_47.add(a);


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
            // 143:9: -> ^( STORE $a)
            {
                // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:143:12: ^( STORE $a)
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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:146:1: storeint : (a= 'istore' b= INTEIRO |a= 'astore' b= INTEIRO ) -> ^( STORE $a $b) ;
    public final AssemblerParser.storeint_return storeint() throws RecognitionException {
        AssemblerParser.storeint_return retval = new AssemblerParser.storeint_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;
        Token b=null;

        BytecodesAST a_tree=null;
        BytecodesAST b_tree=null;
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_INTEIRO=new RewriteRuleTokenStream(adaptor,"token INTEIRO");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:146:10: ( (a= 'istore' b= INTEIRO |a= 'astore' b= INTEIRO ) -> ^( STORE $a $b) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:146:12: (a= 'istore' b= INTEIRO |a= 'astore' b= INTEIRO )
            {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:146:12: (a= 'istore' b= INTEIRO |a= 'astore' b= INTEIRO )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==85) ) {
                alt18=1;
            }
            else if ( (LA18_0==43) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:146:16: a= 'istore' b= INTEIRO
                    {
                    a=(Token)match(input,85,FOLLOW_85_in_storeint1903);  
                    stream_85.add(a);


                    b=(Token)match(input,INTEIRO,FOLLOW_INTEIRO_in_storeint1909);  
                    stream_INTEIRO.add(b);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:147:16: a= 'astore' b= INTEIRO
                    {
                    a=(Token)match(input,43,FOLLOW_43_in_storeint1931);  
                    stream_43.add(a);


                    b=(Token)match(input,INTEIRO,FOLLOW_INTEIRO_in_storeint1937);  
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
            // 149:12: -> ^( STORE $a $b)
            {
                // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:149:15: ^( STORE $a $b)
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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:152:1: logica : (a= 'iand' |a= 'ior' |a= 'ixor' ) -> ^( LOGICA $a) ;
    public final AssemblerParser.logica_return logica() throws RecognitionException {
        AssemblerParser.logica_return retval = new AssemblerParser.logica_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;

        BytecodesAST a_tree=null;
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:152:8: ( (a= 'iand' |a= 'ior' |a= 'ixor' ) -> ^( LOGICA $a) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:152:10: (a= 'iand' |a= 'ior' |a= 'ixor' )
            {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:152:10: (a= 'iand' |a= 'ior' |a= 'ixor' )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt19=1;
                }
                break;
            case 82:
                {
                alt19=2;
                }
                break;
            case 91:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }

            switch (alt19) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:152:14: a= 'iand'
                    {
                    a=(Token)match(input,52,FOLLOW_52_in_logica2001);  
                    stream_52.add(a);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:153:14: a= 'ior'
                    {
                    a=(Token)match(input,82,FOLLOW_82_in_logica2020);  
                    stream_82.add(a);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:154:14: a= 'ixor'
                    {
                    a=(Token)match(input,91,FOLLOW_91_in_logica2039);  
                    stream_91.add(a);


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
            // 156:10: -> ^( LOGICA $a)
            {
                // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:156:13: ^( LOGICA $a)
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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:159:1: desvio : (a= 'ifeq' b= ID |a= 'ifne' b= ID |a= 'iflt' b= ID |a= 'ifge' b= ID |a= 'ifgt' b= ID |a= 'ifle' b= ID |a= 'if_icmpeq' b= ID |a= 'if_icmpne' b= ID |a= 'if_icmplt' b= ID |a= 'if_icmpge' b= ID |a= 'if_icmpgt' b= ID |a= 'if_icmple' b= ID |a= 'goto' b= ID ) -> ^( DESVIO $a $b) ;
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
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:159:8: ( (a= 'ifeq' b= ID |a= 'ifne' b= ID |a= 'iflt' b= ID |a= 'ifge' b= ID |a= 'ifgt' b= ID |a= 'ifle' b= ID |a= 'if_icmpeq' b= ID |a= 'if_icmpne' b= ID |a= 'if_icmplt' b= ID |a= 'if_icmpge' b= ID |a= 'if_icmpgt' b= ID |a= 'if_icmple' b= ID |a= 'goto' b= ID ) -> ^( DESVIO $a $b) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:159:10: (a= 'ifeq' b= ID |a= 'ifne' b= ID |a= 'iflt' b= ID |a= 'ifge' b= ID |a= 'ifgt' b= ID |a= 'ifle' b= ID |a= 'if_icmpeq' b= ID |a= 'if_icmpne' b= ID |a= 'if_icmplt' b= ID |a= 'if_icmpge' b= ID |a= 'if_icmpgt' b= ID |a= 'if_icmple' b= ID |a= 'goto' b= ID )
            {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:159:10: (a= 'ifeq' b= ID |a= 'ifne' b= ID |a= 'iflt' b= ID |a= 'ifge' b= ID |a= 'ifgt' b= ID |a= 'ifle' b= ID |a= 'if_icmpeq' b= ID |a= 'if_icmpne' b= ID |a= 'if_icmplt' b= ID |a= 'if_icmpge' b= ID |a= 'if_icmpgt' b= ID |a= 'if_icmple' b= ID |a= 'goto' b= ID )
            int alt20=13;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt20=1;
                }
                break;
            case 72:
                {
                alt20=2;
                }
                break;
            case 71:
                {
                alt20=3;
                }
                break;
            case 68:
                {
                alt20=4;
                }
                break;
            case 69:
                {
                alt20=5;
                }
                break;
            case 70:
                {
                alt20=6;
                }
                break;
            case 61:
                {
                alt20=7;
                }
                break;
            case 66:
                {
                alt20=8;
                }
                break;
            case 65:
                {
                alt20=9;
                }
                break;
            case 62:
                {
                alt20=10;
                }
                break;
            case 63:
                {
                alt20=11;
                }
                break;
            case 64:
                {
                alt20=12;
                }
                break;
            case 50:
                {
                alt20=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }

            switch (alt20) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:159:14: a= 'ifeq' b= ID
                    {
                    a=(Token)match(input,67,FOLLOW_67_in_desvio2092);  
                    stream_67.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio2098);  
                    stream_ID.add(b);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:160:14: a= 'ifne' b= ID
                    {
                    a=(Token)match(input,72,FOLLOW_72_in_desvio2118);  
                    stream_72.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio2124);  
                    stream_ID.add(b);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:161:14: a= 'iflt' b= ID
                    {
                    a=(Token)match(input,71,FOLLOW_71_in_desvio2144);  
                    stream_71.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio2150);  
                    stream_ID.add(b);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:162:14: a= 'ifge' b= ID
                    {
                    a=(Token)match(input,68,FOLLOW_68_in_desvio2169);  
                    stream_68.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio2175);  
                    stream_ID.add(b);


                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:163:14: a= 'ifgt' b= ID
                    {
                    a=(Token)match(input,69,FOLLOW_69_in_desvio2194);  
                    stream_69.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio2200);  
                    stream_ID.add(b);


                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:164:14: a= 'ifle' b= ID
                    {
                    a=(Token)match(input,70,FOLLOW_70_in_desvio2220);  
                    stream_70.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio2226);  
                    stream_ID.add(b);


                    }
                    break;
                case 7 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:165:14: a= 'if_icmpeq' b= ID
                    {
                    a=(Token)match(input,61,FOLLOW_61_in_desvio2246);  
                    stream_61.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio2252);  
                    stream_ID.add(b);


                    }
                    break;
                case 8 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:166:14: a= 'if_icmpne' b= ID
                    {
                    a=(Token)match(input,66,FOLLOW_66_in_desvio2272);  
                    stream_66.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio2278);  
                    stream_ID.add(b);


                    }
                    break;
                case 9 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:167:14: a= 'if_icmplt' b= ID
                    {
                    a=(Token)match(input,65,FOLLOW_65_in_desvio2297);  
                    stream_65.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio2303);  
                    stream_ID.add(b);


                    }
                    break;
                case 10 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:168:14: a= 'if_icmpge' b= ID
                    {
                    a=(Token)match(input,62,FOLLOW_62_in_desvio2323);  
                    stream_62.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio2329);  
                    stream_ID.add(b);


                    }
                    break;
                case 11 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:169:14: a= 'if_icmpgt' b= ID
                    {
                    a=(Token)match(input,63,FOLLOW_63_in_desvio2349);  
                    stream_63.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio2355);  
                    stream_ID.add(b);


                    }
                    break;
                case 12 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:170:14: a= 'if_icmple' b= ID
                    {
                    a=(Token)match(input,64,FOLLOW_64_in_desvio2374);  
                    stream_64.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio2380);  
                    stream_ID.add(b);


                    }
                    break;
                case 13 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:171:14: a= 'goto' b= ID
                    {
                    a=(Token)match(input,50,FOLLOW_50_in_desvio2400);  
                    stream_50.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio2406);  
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
            // 173:10: -> ^( DESVIO $a $b)
            {
                // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:173:13: ^( DESVIO $a $b)
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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:176:1: pilha : (a= 'pop' |a= 'pop2' |a= 'dup' ) -> ^( PILHA $a) ;
    public final AssemblerParser.pilha_return pilha() throws RecognitionException {
        AssemblerParser.pilha_return retval = new AssemblerParser.pilha_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;

        BytecodesAST a_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_96=new RewriteRuleTokenStream(adaptor,"token 96");
        RewriteRuleTokenStream stream_95=new RewriteRuleTokenStream(adaptor,"token 95");

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:176:7: ( (a= 'pop' |a= 'pop2' |a= 'dup' ) -> ^( PILHA $a) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:176:9: (a= 'pop' |a= 'pop2' |a= 'dup' )
            {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:176:9: (a= 'pop' |a= 'pop2' |a= 'dup' )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 95:
                {
                alt21=1;
                }
                break;
            case 96:
                {
                alt21=2;
                }
                break;
            case 48:
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
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:176:13: a= 'pop'
                    {
                    a=(Token)match(input,95,FOLLOW_95_in_pilha2471);  
                    stream_95.add(a);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:177:13: a= 'pop2'
                    {
                    a=(Token)match(input,96,FOLLOW_96_in_pilha2489);  
                    stream_96.add(a);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:178:13: a= 'dup'
                    {
                    a=(Token)match(input,48,FOLLOW_48_in_pilha2507);  
                    stream_48.add(a);


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
            // 180:9: -> ^( PILHA $a)
            {
                // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:180:12: ^( PILHA $a)
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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:183:1: classe returns [List classe] : (cls+= ID '/' )* (cls+= ID ) ;
    public final AssemblerParser.classe_return classe() throws RecognitionException {
        AssemblerParser.classe_return retval = new AssemblerParser.classe_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token char_literal63=null;
        Token cls=null;
        List list_cls=null;

        BytecodesAST char_literal63_tree=null;
        BytecodesAST cls_tree=null;


                retval.classe = new ArrayList();
             
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:187:6: ( (cls+= ID '/' )* (cls+= ID ) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:187:8: (cls+= ID '/' )* (cls+= ID )
            {
            root_0 = (BytecodesAST)adaptor.nil();


            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:187:8: (cls+= ID '/' )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==ID) ) {
                    int LA22_1 = input.LA(2);

                    if ( (LA22_1==34) ) {
                        int LA22_2 = input.LA(3);

                        if ( (LA22_2==ID) ) {
                            alt22=1;
                        }


                    }


                }


                switch (alt22) {
            	case 1 :
            	    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:187:9: cls+= ID '/'
            	    {
            	    cls=(Token)match(input,ID,FOLLOW_ID_in_classe2573); 
            	    cls_tree = 
            	    (BytecodesAST)adaptor.create(cls)
            	    ;
            	    adaptor.addChild(root_0, cls_tree);

            	    if (list_cls==null) list_cls=new ArrayList();
            	    list_cls.add(cls);


            	    char_literal63=(Token)match(input,34,FOLLOW_34_in_classe2575); 
            	    char_literal63_tree = 
            	    (BytecodesAST)adaptor.create(char_literal63)
            	    ;
            	    adaptor.addChild(root_0, char_literal63_tree);


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:187:25: (cls+= ID )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:187:26: cls+= ID
            {
            cls=(Token)match(input,ID,FOLLOW_ID_in_classe2584); 
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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:190:1: chamadaMetodo returns [String nome, String params, String tipoRetorno] : n= INIT par= '()' tip= VOID ;
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
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:196:6: (n= INIT par= '()' tip= VOID )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:196:8: n= INIT par= '()' tip= VOID
            {
            root_0 = (BytecodesAST)adaptor.nil();


            n=(Token)match(input,INIT,FOLLOW_INIT_in_chamadaMetodo2624); 
            n_tree = 
            (BytecodesAST)adaptor.create(n)
            ;
            adaptor.addChild(root_0, n_tree);


            par=(Token)match(input,26,FOLLOW_26_in_chamadaMetodo2630); 
            par_tree = 
            (BytecodesAST)adaptor.create(par)
            ;
            adaptor.addChild(root_0, par_tree);


            tip=(Token)match(input,VOID,FOLLOW_VOID_in_chamadaMetodo2636); 
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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:203:1: campo returns [List classe, String campo] : (cls+= ID '/' )+ cmp= ID ;
    public final AssemblerParser.campo_return campo() throws RecognitionException {
        AssemblerParser.campo_return retval = new AssemblerParser.campo_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token cmp=null;
        Token char_literal64=null;
        Token cls=null;
        List list_cls=null;

        BytecodesAST cmp_tree=null;
        BytecodesAST char_literal64_tree=null;
        BytecodesAST cls_tree=null;


                retval.classe = new ArrayList();
                retval.campo ="";
             
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:208:6: ( (cls+= ID '/' )+ cmp= ID )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:208:8: (cls+= ID '/' )+ cmp= ID
            {
            root_0 = (BytecodesAST)adaptor.nil();


            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:208:8: (cls+= ID '/' )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==ID) ) {
                    int LA23_1 = input.LA(2);

                    if ( (LA23_1==34) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:208:9: cls+= ID '/'
            	    {
            	    cls=(Token)match(input,ID,FOLLOW_ID_in_campo2676); 
            	    cls_tree = 
            	    (BytecodesAST)adaptor.create(cls)
            	    ;
            	    adaptor.addChild(root_0, cls_tree);

            	    if (list_cls==null) list_cls=new ArrayList();
            	    list_cls.add(cls);


            	    char_literal64=(Token)match(input,34,FOLLOW_34_in_campo2678); 
            	    char_literal64_tree = 
            	    (BytecodesAST)adaptor.create(char_literal64)
            	    ;
            	    adaptor.addChild(root_0, char_literal64_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);


            cmp=(Token)match(input,ID,FOLLOW_ID_in_campo2686); 
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


 

    public static final BitSet FOLLOW_instrucao_in_programa112 = new BitSet(new long[]{0xFFFFFBF010040202L,0x00000003FFEFFFFFL});
    public static final BitSet FOLLOW_operacao_in_instrucao140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definicaoClasse_in_instrucao155 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_instrucao158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_label_in_operacao180 = new BitSet(new long[]{0xFFFFFBF000040000L,0x00000003FFEFFFFFL});
    public static final BitSet FOLLOW_comando_in_operacao182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_comando_in_operacao186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_label208 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_label210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_manipulacaoObjetos_in_comando233 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_aritmetica_in_comando252 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_load_in_comando271 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_loadint_in_comando289 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_store_in_comando308 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_storeint_in_comando326 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_desvio_in_comando345 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_logica_in_comando364 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_pilha_in_comando382 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_94_in_comando401 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_NEWLINE_in_comando417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_definicaoClasse443 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_definicaoClasse445 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_NEWLINE_in_definicaoClasse447 = new BitSet(new long[]{0x0000000380000000L});
    public static final BitSet FOLLOW_superClasse_in_definicaoClasse450 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_NEWLINE_in_definicaoClasse452 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_membroClasse_in_definicaoClasse457 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_NEWLINE_in_definicaoClasse459 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_33_in_superClasse535 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_TIPO_REF_in_superClasse537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_membroClasse559 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_membroClasse561 = new BitSet(new long[]{0x0000000000C00800L});
    public static final BitSet FOLLOW_tipo_in_membroClasse563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_membroClasse582 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_INIT_in_membroClasse584 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_membroClasse586 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_VOID_in_membroClasse588 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_NEWLINE_in_membroClasse590 = new BitSet(new long[]{0xFFFFFBF000040200L,0x00000007FFEFFFFFL});
    public static final BitSet FOLLOW_operacao_in_membroClasse592 = new BitSet(new long[]{0xFFFFFBF000040200L,0x00000007FFEFFFFFL});
    public static final BitSet FOLLOW_98_in_membroClasse595 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_NEWLINE_in_membroClasse597 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_membroClasse599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_membroClasse623 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_MAIN_in_membroClasse625 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_membroClasse627 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_VOID_in_membroClasse629 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_NEWLINE_in_membroClasse631 = new BitSet(new long[]{0xFFFFFFF000040200L,0x00000007FFFFFFFFL});
    public static final BitSet FOLLOW_operacao_in_membroClasse633 = new BitSet(new long[]{0xFFFFFFF000040200L,0x00000007FFFFFFFFL});
    public static final BitSet FOLLOW_retorno_in_membroClasse640 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_NEWLINE_in_membroClasse642 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_membroClasse644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_membroClasse678 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_membroClasse680 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_membroClasse682 = new BitSet(new long[]{0x0000000008C00800L});
    public static final BitSet FOLLOW_tipo_in_membroClasse689 = new BitSet(new long[]{0x0000000008C00800L});
    public static final BitSet FOLLOW_27_in_membroClasse693 = new BitSet(new long[]{0x0000000000C00800L});
    public static final BitSet FOLLOW_tipo_in_membroClasse695 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_NEWLINE_in_membroClasse697 = new BitSet(new long[]{0xFFFFFFF000040200L,0x00000007FFFFFFFFL});
    public static final BitSet FOLLOW_operacao_in_membroClasse699 = new BitSet(new long[]{0xFFFFFFF000040200L,0x00000007FFFFFFFFL});
    public static final BitSet FOLLOW_retorno_in_membroClasse706 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_NEWLINE_in_membroClasse708 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_membroClasse710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_manipulacaoObjetos800 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_campo_in_manipulacaoObjetos806 = new BitSet(new long[]{0x0000000000C00800L});
    public static final BitSet FOLLOW_tipo_in_manipulacaoObjetos808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_manipulacaoObjetos846 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_campo_in_manipulacaoObjetos852 = new BitSet(new long[]{0x0000000000C00800L});
    public static final BitSet FOLLOW_tipo_in_manipulacaoObjetos854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_manipulacaoObjetos893 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_classe_in_manipulacaoObjetos899 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_manipulacaoObjetos901 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_chamadaMetodo_in_manipulacaoObjetos907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_manipulacaoObjetos969 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_classe_in_manipulacaoObjetos974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_aritmetica1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_aritmetica1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_aritmetica1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_aritmetica1110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_aritmetica1134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_aritmetica1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_aritmetica1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_load1260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_load1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_load1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_load1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_load1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_load1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_load1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_load1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_load1406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_load1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_load1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_load1461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_load1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_load1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_load1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_load1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_loadint1588 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_INTEIRO_in_loadint1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_loadint1615 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_INTEIRO_in_loadint1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_loadint1641 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_INTEIRO_in_loadint1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_store1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_store1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_store1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_store1771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_store1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_store1808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_store1827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_store1846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_storeint1903 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_INTEIRO_in_storeint1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_storeint1931 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_INTEIRO_in_storeint1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_logica2001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_logica2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_logica2039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_desvio2092 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_desvio2098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_desvio2118 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_desvio2124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_desvio2144 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_desvio2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_desvio2169 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_desvio2175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_desvio2194 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_desvio2200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_desvio2220 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_desvio2226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_desvio2246 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_desvio2252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_desvio2272 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_desvio2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_desvio2297 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_desvio2303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_desvio2323 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_desvio2329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_desvio2349 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_desvio2355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_desvio2374 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_desvio2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_desvio2400 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_desvio2406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_pilha2471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_pilha2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_pilha2507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_classe2573 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_classe2575 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_classe2584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INIT_in_chamadaMetodo2624 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_chamadaMetodo2630 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_VOID_in_chamadaMetodo2636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_campo2676 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_campo2678 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_campo2686 = new BitSet(new long[]{0x0000000000000002L});

}