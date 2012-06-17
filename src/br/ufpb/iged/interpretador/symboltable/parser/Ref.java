// $ANTLR 3.4 C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g 2012-06-17 00:17:37

package br.ufpb.iged.interpretador.symboltable.parser;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

import br.ufpb.iged.interpretador.symboltable.classes.BytecodesAST;
import br.ufpb.iged.interpretador.symboltable.classes.SimboloClasse;
import br.ufpb.iged.interpretador.symboltable.classes.TabelaSimbolos;
import br.ufpb.iged.interpretador.symboltable.classes.Tipo;

import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class Ref extends TreeFilter {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "EXTENDS", "FIELD_DECL", "ID", "MEMBRO_CLASSE", "'.class'", "'int'"
    };

    public static final int EOF=-1;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int EXTENDS=4;
    public static final int FIELD_DECL=5;
    public static final int ID=6;
    public static final int MEMBRO_CLASSE=7;

    // delegates
    public TreeFilter[] getDelegates() {
        return new TreeFilter[] {};
    }

    // delegators


    public Ref(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public Ref(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return Ref.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g"; }


        TabelaSimbolos tabelaSimbolos;
        public Ref(TreeNodeStream input, TabelaSimbolos tabelaSimbolos) {
            this(input);
            this.tabelaSimbolos = tabelaSimbolos;
        }
        



    // $ANTLR start "topdown"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:18:1: topdown : ( entraNaClasse | declaracaoVariavel );
    public final void topdown() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:19:5: ( entraNaClasse | declaracaoVariavel )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==8) ) {
                alt1=1;
            }
            else if ( (LA1_0==FIELD_DECL) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:19:9: entraNaClasse
                    {
                    pushFollow(FOLLOW_entraNaClasse_in_topdown50);
                    entraNaClasse();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:20:9: declaracaoVariavel
                    {
                    pushFollow(FOLLOW_declaracaoVariavel_in_topdown60);
                    declaracaoVariavel();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "topdown"



    // $ANTLR start "entraNaClasse"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:23:1: entraNaClasse : ^( '.class' nome= ID ( ^( EXTENDS sup= ID ) )? ^( MEMBRO_CLASSE ( . )* ) ) ;
    public final void entraNaClasse() throws RecognitionException {
        BytecodesAST nome=null;
        BytecodesAST sup=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:24:5: ( ^( '.class' nome= ID ( ^( EXTENDS sup= ID ) )? ^( MEMBRO_CLASSE ( . )* ) ) )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:24:9: ^( '.class' nome= ID ( ^( EXTENDS sup= ID ) )? ^( MEMBRO_CLASSE ( . )* ) )
            {
            match(input,8,FOLLOW_8_in_entraNaClasse80); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            nome=(BytecodesAST)match(input,ID,FOLLOW_ID_in_entraNaClasse84); if (state.failed) return ;

            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:24:28: ( ^( EXTENDS sup= ID ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==EXTENDS) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:24:29: ^( EXTENDS sup= ID )
                    {
                    match(input,EXTENDS,FOLLOW_EXTENDS_in_entraNaClasse88); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    sup=(BytecodesAST)match(input,ID,FOLLOW_ID_in_entraNaClasse92); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;

            }


            match(input,MEMBRO_CLASSE,FOLLOW_MEMBRO_CLASSE_in_entraNaClasse98); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:24:65: ( . )*
                loop3:
                do {
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( ((LA3_0 >= EXTENDS && LA3_0 <= 9)) ) {
                        alt3=1;
                    }
                    else if ( (LA3_0==UP) ) {
                        alt3=2;
                    }


                    switch (alt3) {
                	case 1 :
                	    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:24:65: .
                	    {
                	    matchAny(input); if (state.failed) return ;

                	    }
                	    break;

                	default :
                	    break loop3;
                    }
                } while (true);


                match(input, Token.UP, null); if (state.failed) return ;
            }


            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
                    if ( sup!=null ) {
                        // look up superclass (if any)
                        sup.simbolo = sup.escopo.resolver((sup!=null?sup.getText():null));
                        ((SimboloClasse)nome.simbolo).superClasse =
                            (SimboloClasse)sup.simbolo;                // set superclass
                        System.out.println("line "+nome.getLine()+": set "+(nome!=null?nome.getText():null)+
                            " super to "+((SimboloClasse)nome.simbolo).superClasse.nome);
                    }
                    else {
                        System.out.println("line "+nome.getLine()+": set "+(nome!=null?nome.getText():null));
                    }
                    }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "entraNaClasse"



    // $ANTLR start "declaracaoVariavel"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:40:1: declaracaoVariavel : ^( ( FIELD_DECL ) tipo ID ( . )? ) ;
    public final void declaracaoVariavel() throws RecognitionException {
        BytecodesAST ID1=null;
        Ref.tipo_return tipo2 =null;


        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:41:5: ( ^( ( FIELD_DECL ) tipo ID ( . )? ) )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:41:9: ^( ( FIELD_DECL ) tipo ID ( . )? )
            {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:41:11: ( FIELD_DECL )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:41:12: FIELD_DECL
            {
            match(input,FIELD_DECL,FOLLOW_FIELD_DECL_in_declaracaoVariavel139); if (state.failed) return ;

            }


            match(input, Token.DOWN, null); if (state.failed) return ;
            pushFollow(FOLLOW_tipo_in_declaracaoVariavel142);
            tipo2=tipo();

            state._fsp--;
            if (state.failed) return ;

            ID1=(BytecodesAST)match(input,ID,FOLLOW_ID_in_declaracaoVariavel144); if (state.failed) return ;

            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:41:32: ( . )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0 >= EXTENDS && LA4_0 <= 9)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:41:32: .
                    {
                    matchAny(input); if (state.failed) return ;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
                    ID1.simbolo.tipo = (tipo2!=null?tipo2.tsym:null); // set return type of variable
                    System.out.println("line "+ID1.getLine()+": set var type "+ID1.simbolo);
                    }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "declaracaoVariavel"


    public static class tipo_return extends TreeRuleReturnScope {
        public Tipo tsym;
    };


    // $ANTLR start "tipo"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:48:1: tipo returns [Tipo tsym] : ( 'int' | ID );
    public final Ref.tipo_return tipo() throws RecognitionException {
        Ref.tipo_return retval = new Ref.tipo_return();
        retval.start = input.LT(1);



            // get scope from AST; use to resolve type name and save it in AST
            ((BytecodesAST)retval.start).simbolo = ((BytecodesAST)retval.start).escopo.resolver(((BytecodesAST)retval.start).getText());
            retval.tsym = (Tipo)((BytecodesAST)retval.start).simbolo; // return Type from this rule

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:54:5: ( 'int' | ID )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:
            {
            if ( input.LA(1)==ID||input.LA(1)==9 ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "tipo"

    // Delegated rules


 

    public static final BitSet FOLLOW_entraNaClasse_in_topdown50 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracaoVariavel_in_topdown60 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_entraNaClasse80 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_entraNaClasse84 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_EXTENDS_in_entraNaClasse88 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_entraNaClasse92 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MEMBRO_CLASSE_in_entraNaClasse98 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FIELD_DECL_in_declaracaoVariavel139 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_tipo_in_declaracaoVariavel142 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_declaracaoVariavel144 = new BitSet(new long[]{0x00000000000003F8L});

}