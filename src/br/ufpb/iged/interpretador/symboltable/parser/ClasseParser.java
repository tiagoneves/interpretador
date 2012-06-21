// $ANTLR 3.4 C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Classe.g 2012-06-21 00:00:41

package br.ufpb.iged.interpretador.symboltable.parser;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;

import br.ufpb.iged.interpretador.symboltable.classes.BytecodesAST;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class ClasseParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "EXTENDS", "FIELD_DECL", "ID", "INIT", "INT", "MEMBRO_CLASSE", "NOVA_LINHA", "VOID", "'()'", "'.class'", "'.field'", "'.method'", "'.super'", "'L'"
    };

    public static final int EOF=-1;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int EXTENDS=4;
    public static final int FIELD_DECL=5;
    public static final int ID=6;
    public static final int INIT=7;
    public static final int INT=8;
    public static final int MEMBRO_CLASSE=9;
    public static final int NOVA_LINHA=10;
    public static final int VOID=11;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public ClasseParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public ClasseParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return ClasseParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Classe.g"; }


    public static class definicaoClasse_return extends ParserRuleReturnScope {
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "definicaoClasse"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Classe.g:14:1: definicaoClasse : ( '.class' ID ( membroClasse )+ -> ^( '.class' ID ^( MEMBRO_CLASSE ( membroClasse )+ ) ) | '.class' ID NOVA_LINHA superClasse ( membroClasse )+ -> ^( '.class' ID superClasse ^( MEMBRO_CLASSE ( membroClasse )+ ) ) | '.method' construtorDefault );
    public final ClasseParser.definicaoClasse_return definicaoClasse() throws RecognitionException {
        ClasseParser.definicaoClasse_return retval = new ClasseParser.definicaoClasse_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token string_literal1=null;
        Token ID2=null;
        Token string_literal4=null;
        Token ID5=null;
        Token NOVA_LINHA6=null;
        Token string_literal9=null;
        ClasseParser.membroClasse_return membroClasse3 =null;

        ClasseParser.superClasse_return superClasse7 =null;

        ClasseParser.membroClasse_return membroClasse8 =null;

        ClasseParser.construtorDefault_return construtorDefault10 =null;


        BytecodesAST string_literal1_tree=null;
        BytecodesAST ID2_tree=null;
        BytecodesAST string_literal4_tree=null;
        BytecodesAST ID5_tree=null;
        BytecodesAST NOVA_LINHA6_tree=null;
        BytecodesAST string_literal9_tree=null;
        RewriteRuleTokenStream stream_NOVA_LINHA=new RewriteRuleTokenStream(adaptor,"token NOVA_LINHA");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_13=new RewriteRuleTokenStream(adaptor,"token 13");
        RewriteRuleSubtreeStream stream_membroClasse=new RewriteRuleSubtreeStream(adaptor,"rule membroClasse");
        RewriteRuleSubtreeStream stream_superClasse=new RewriteRuleSubtreeStream(adaptor,"rule superClasse");
        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Classe.g:14:17: ( '.class' ID ( membroClasse )+ -> ^( '.class' ID ^( MEMBRO_CLASSE ( membroClasse )+ ) ) | '.class' ID NOVA_LINHA superClasse ( membroClasse )+ -> ^( '.class' ID superClasse ^( MEMBRO_CLASSE ( membroClasse )+ ) ) | '.method' construtorDefault )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==ID) ) {
                    int LA3_3 = input.LA(3);

                    if ( (LA3_3==NOVA_LINHA) ) {
                        alt3=2;
                    }
                    else if ( (LA3_3==14) ) {
                        alt3=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 3, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA3_0==15) ) {
                alt3=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Classe.g:14:19: '.class' ID ( membroClasse )+
                    {
                    string_literal1=(Token)match(input,13,FOLLOW_13_in_definicaoClasse53);  
                    stream_13.add(string_literal1);


                    ID2=(Token)match(input,ID,FOLLOW_ID_in_definicaoClasse55);  
                    stream_ID.add(ID2);


                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Classe.g:14:31: ( membroClasse )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Classe.g:14:31: membroClasse
                    	    {
                    	    pushFollow(FOLLOW_membroClasse_in_definicaoClasse57);
                    	    membroClasse3=membroClasse();

                    	    state._fsp--;

                    	    stream_membroClasse.add(membroClasse3.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt1 >= 1 ) break loop1;
                                EarlyExitException eee =
                                    new EarlyExitException(1, input);
                                throw eee;
                        }
                        cnt1++;
                    } while (true);


                    // AST REWRITE
                    // elements: membroClasse, ID, 13
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BytecodesAST)adaptor.nil();
                    // 14:46: -> ^( '.class' ID ^( MEMBRO_CLASSE ( membroClasse )+ ) )
                    {
                        // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Classe.g:14:49: ^( '.class' ID ^( MEMBRO_CLASSE ( membroClasse )+ ) )
                        {
                        BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                        root_1 = (BytecodesAST)adaptor.becomeRoot(
                        stream_13.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Classe.g:14:63: ^( MEMBRO_CLASSE ( membroClasse )+ )
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
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Classe.g:15:19: '.class' ID NOVA_LINHA superClasse ( membroClasse )+
                    {
                    string_literal4=(Token)match(input,13,FOLLOW_13_in_definicaoClasse94);  
                    stream_13.add(string_literal4);


                    ID5=(Token)match(input,ID,FOLLOW_ID_in_definicaoClasse96);  
                    stream_ID.add(ID5);


                    NOVA_LINHA6=(Token)match(input,NOVA_LINHA,FOLLOW_NOVA_LINHA_in_definicaoClasse98);  
                    stream_NOVA_LINHA.add(NOVA_LINHA6);


                    pushFollow(FOLLOW_superClasse_in_definicaoClasse100);
                    superClasse7=superClasse();

                    state._fsp--;

                    stream_superClasse.add(superClasse7.getTree());

                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Classe.g:15:54: ( membroClasse )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==14) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Classe.g:15:54: membroClasse
                    	    {
                    	    pushFollow(FOLLOW_membroClasse_in_definicaoClasse102);
                    	    membroClasse8=membroClasse();

                    	    state._fsp--;

                    	    stream_membroClasse.add(membroClasse8.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);


                    // AST REWRITE
                    // elements: ID, membroClasse, superClasse, 13
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BytecodesAST)adaptor.nil();
                    // 16:19: -> ^( '.class' ID superClasse ^( MEMBRO_CLASSE ( membroClasse )+ ) )
                    {
                        // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Classe.g:16:22: ^( '.class' ID superClasse ^( MEMBRO_CLASSE ( membroClasse )+ ) )
                        {
                        BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                        root_1 = (BytecodesAST)adaptor.becomeRoot(
                        stream_13.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, stream_superClasse.nextTree());

                        // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Classe.g:16:48: ^( MEMBRO_CLASSE ( membroClasse )+ )
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
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Classe.g:17:19: '.method' construtorDefault
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    string_literal9=(Token)match(input,15,FOLLOW_15_in_definicaoClasse160); 
                    string_literal9_tree = 
                    (BytecodesAST)adaptor.create(string_literal9)
                    ;
                    adaptor.addChild(root_0, string_literal9_tree);


                    pushFollow(FOLLOW_construtorDefault_in_definicaoClasse162);
                    construtorDefault10=construtorDefault();

                    state._fsp--;

                    adaptor.addChild(root_0, construtorDefault10.getTree());

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
    // $ANTLR end "definicaoClasse"


    public static class superClasse_return extends ParserRuleReturnScope {
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "superClasse"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Classe.g:20:1: superClasse : '.super' ID -> ^( EXTENDS ID ) ;
    public final ClasseParser.superClasse_return superClasse() throws RecognitionException {
        ClasseParser.superClasse_return retval = new ClasseParser.superClasse_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token string_literal11=null;
        Token ID12=null;

        BytecodesAST string_literal11_tree=null;
        BytecodesAST ID12_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_16=new RewriteRuleTokenStream(adaptor,"token 16");

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Classe.g:20:13: ( '.super' ID -> ^( EXTENDS ID ) )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Classe.g:20:15: '.super' ID
            {
            string_literal11=(Token)match(input,16,FOLLOW_16_in_superClasse203);  
            stream_16.add(string_literal11);


            ID12=(Token)match(input,ID,FOLLOW_ID_in_superClasse205);  
            stream_ID.add(ID12);


            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BytecodesAST)adaptor.nil();
            // 20:27: -> ^( EXTENDS ID )
            {
                // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Classe.g:20:30: ^( EXTENDS ID )
                {
                BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                root_1 = (BytecodesAST)adaptor.becomeRoot(
                (BytecodesAST)adaptor.create(EXTENDS, "EXTENDS")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
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
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Classe.g:22:1: membroClasse : '.field' ID tipo NOVA_LINHA -> ^( FIELD_DECL ID tipo ) ;
    public final ClasseParser.membroClasse_return membroClasse() throws RecognitionException {
        ClasseParser.membroClasse_return retval = new ClasseParser.membroClasse_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token string_literal13=null;
        Token ID14=null;
        Token NOVA_LINHA16=null;
        ClasseParser.tipo_return tipo15 =null;


        BytecodesAST string_literal13_tree=null;
        BytecodesAST ID14_tree=null;
        BytecodesAST NOVA_LINHA16_tree=null;
        RewriteRuleTokenStream stream_NOVA_LINHA=new RewriteRuleTokenStream(adaptor,"token NOVA_LINHA");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_14=new RewriteRuleTokenStream(adaptor,"token 14");
        RewriteRuleSubtreeStream stream_tipo=new RewriteRuleSubtreeStream(adaptor,"rule tipo");
        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Classe.g:22:14: ( '.field' ID tipo NOVA_LINHA -> ^( FIELD_DECL ID tipo ) )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Classe.g:22:16: '.field' ID tipo NOVA_LINHA
            {
            string_literal13=(Token)match(input,14,FOLLOW_14_in_membroClasse222);  
            stream_14.add(string_literal13);


            ID14=(Token)match(input,ID,FOLLOW_ID_in_membroClasse224);  
            stream_ID.add(ID14);


            pushFollow(FOLLOW_tipo_in_membroClasse226);
            tipo15=tipo();

            state._fsp--;

            stream_tipo.add(tipo15.getTree());

            NOVA_LINHA16=(Token)match(input,NOVA_LINHA,FOLLOW_NOVA_LINHA_in_membroClasse228);  
            stream_NOVA_LINHA.add(NOVA_LINHA16);


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
            // 22:44: -> ^( FIELD_DECL ID tipo )
            {
                // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Classe.g:22:47: ^( FIELD_DECL ID tipo )
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


    public static class construtorDefault_return extends ParserRuleReturnScope {
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "construtorDefault"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Classe.g:24:1: construtorDefault : INIT '()' VOID ;
    public final ClasseParser.construtorDefault_return construtorDefault() throws RecognitionException {
        ClasseParser.construtorDefault_return retval = new ClasseParser.construtorDefault_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token INIT17=null;
        Token string_literal18=null;
        Token VOID19=null;

        BytecodesAST INIT17_tree=null;
        BytecodesAST string_literal18_tree=null;
        BytecodesAST VOID19_tree=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Classe.g:24:19: ( INIT '()' VOID )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Classe.g:24:21: INIT '()' VOID
            {
            root_0 = (BytecodesAST)adaptor.nil();


            INIT17=(Token)match(input,INIT,FOLLOW_INIT_in_construtorDefault247); 
            INIT17_tree = 
            (BytecodesAST)adaptor.create(INIT17)
            ;
            adaptor.addChild(root_0, INIT17_tree);


            string_literal18=(Token)match(input,12,FOLLOW_12_in_construtorDefault249); 
            string_literal18_tree = 
            (BytecodesAST)adaptor.create(string_literal18)
            ;
            adaptor.addChild(root_0, string_literal18_tree);


            VOID19=(Token)match(input,VOID,FOLLOW_VOID_in_construtorDefault251); 
            VOID19_tree = 
            (BytecodesAST)adaptor.create(VOID19)
            ;
            adaptor.addChild(root_0, VOID19_tree);


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
    // $ANTLR end "construtorDefault"


    public static class tipo_return extends ParserRuleReturnScope {
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tipo"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Classe.g:26:1: tipo : ( INT | VOID | 'L' ID );
    public final ClasseParser.tipo_return tipo() throws RecognitionException {
        ClasseParser.tipo_return retval = new ClasseParser.tipo_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token INT20=null;
        Token VOID21=null;
        Token char_literal22=null;
        Token ID23=null;

        BytecodesAST INT20_tree=null;
        BytecodesAST VOID21_tree=null;
        BytecodesAST char_literal22_tree=null;
        BytecodesAST ID23_tree=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Classe.g:26:6: ( INT | VOID | 'L' ID )
            int alt4=3;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt4=1;
                }
                break;
            case VOID:
                {
                alt4=2;
                }
                break;
            case 17:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Classe.g:26:8: INT
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    INT20=(Token)match(input,INT,FOLLOW_INT_in_tipo261); 
                    INT20_tree = 
                    (BytecodesAST)adaptor.create(INT20)
                    ;
                    adaptor.addChild(root_0, INT20_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Classe.g:26:14: VOID
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    VOID21=(Token)match(input,VOID,FOLLOW_VOID_in_tipo265); 
                    VOID21_tree = 
                    (BytecodesAST)adaptor.create(VOID21)
                    ;
                    adaptor.addChild(root_0, VOID21_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Classe.g:26:21: 'L' ID
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    char_literal22=(Token)match(input,17,FOLLOW_17_in_tipo269); 
                    char_literal22_tree = 
                    (BytecodesAST)adaptor.create(char_literal22)
                    ;
                    adaptor.addChild(root_0, char_literal22_tree);


                    ID23=(Token)match(input,ID,FOLLOW_ID_in_tipo270); 
                    ID23_tree = 
                    (BytecodesAST)adaptor.create(ID23)
                    ;
                    adaptor.addChild(root_0, ID23_tree);


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
    // $ANTLR end "tipo"

    // Delegated rules


 

    public static final BitSet FOLLOW_13_in_definicaoClasse53 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_definicaoClasse55 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_membroClasse_in_definicaoClasse57 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_13_in_definicaoClasse94 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_definicaoClasse96 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NOVA_LINHA_in_definicaoClasse98 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_superClasse_in_definicaoClasse100 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_membroClasse_in_definicaoClasse102 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_15_in_definicaoClasse160 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_construtorDefault_in_definicaoClasse162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_superClasse203 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_superClasse205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_membroClasse222 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_membroClasse224 = new BitSet(new long[]{0x0000000000020900L});
    public static final BitSet FOLLOW_tipo_in_membroClasse226 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NOVA_LINHA_in_membroClasse228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INIT_in_construtorDefault247 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_construtorDefault249 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_VOID_in_construtorDefault251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_tipo261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_tipo265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_tipo269 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_tipo270 = new BitSet(new long[]{0x0000000000000002L});

}