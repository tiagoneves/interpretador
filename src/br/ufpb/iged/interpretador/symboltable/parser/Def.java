// $ANTLR 3.4 C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g 2012-06-24 02:54:44

package br.ufpb.iged.interpretador.symboltable.parser;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

import br.ufpb.iged.interpretador.symboltable.classes.BytecodesAST;
import br.ufpb.iged.interpretador.symboltable.classes.Escopo;
import br.ufpb.iged.interpretador.symboltable.classes.SimboloClasse;
import br.ufpb.iged.interpretador.symboltable.classes.SimboloTipoPrimitvo;
import br.ufpb.iged.interpretador.symboltable.classes.SimboloVariavel;
import br.ufpb.iged.interpretador.symboltable.classes.TabelaSimbolos;

import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class Def extends TreeFilter {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "EXTENDS", "FIELD_DECL", "ID", "'.class'"
    };

    public static final int EOF=-1;
    public static final int T__7=7;
    public static final int EXTENDS=4;
    public static final int FIELD_DECL=5;
    public static final int ID=6;

    // delegates
    public TreeFilter[] getDelegates() {
        return new TreeFilter[] {};
    }

    // delegators


    public Def(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public Def(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return Def.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g"; }


        TabelaSimbolos tabelaSimbolos;
        Escopo escopoAtual;
        public Def(TreeNodeStream input, TabelaSimbolos tabelaSimbolos) {
            this(input);
            this.tabelaSimbolos = tabelaSimbolos;
            escopoAtual = tabelaSimbolos.global;
        }



    // $ANTLR start "topdown"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:20:1: topdown : entraNaClasse ;
    public final void topdown() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:20:9: ( entraNaClasse )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:20:11: entraNaClasse
            {
            pushFollow(FOLLOW_entraNaClasse_in_topdown43);
            entraNaClasse();

            state._fsp--;
            if (state.failed) return ;

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



    // $ANTLR start "bottomup"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:22:1: bottomup : declaracaoVariavel ;
    public final void bottomup() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:22:10: ( declaracaoVariavel )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:22:12: declaracaoVariavel
            {
            pushFollow(FOLLOW_declaracaoVariavel_in_bottomup51);
            declaracaoVariavel();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "bottomup"



    // $ANTLR start "entraNaClasse"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:25:1: entraNaClasse : ^( '.class' nome= ID ( ^( EXTENDS sup= ID ) )? . ) ;
    public final void entraNaClasse() throws RecognitionException {
        BytecodesAST nome=null;
        BytecodesAST sup=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:26:5: ( ^( '.class' nome= ID ( ^( EXTENDS sup= ID ) )? . ) )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:26:9: ^( '.class' nome= ID ( ^( EXTENDS sup= ID ) )? . )
            {
            match(input,7,FOLLOW_7_in_entraNaClasse76); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            nome=(BytecodesAST)match(input,ID,FOLLOW_ID_in_entraNaClasse80); if (state.failed) return ;

            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:26:28: ( ^( EXTENDS sup= ID ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==EXTENDS) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==DOWN) ) {
                    int LA1_3 = input.LA(3);

                    if ( (LA1_3==ID) ) {
                        int LA1_4 = input.LA(4);

                        if ( (LA1_4==UP) ) {
                            int LA1_5 = input.LA(5);

                            if ( ((LA1_5 >= EXTENDS && LA1_5 <= 7)) ) {
                                alt1=1;
                            }
                        }
                    }
                }
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:26:29: ^( EXTENDS sup= ID )
                    {
                    match(input,EXTENDS,FOLLOW_EXTENDS_in_entraNaClasse84); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    sup=(BytecodesAST)match(input,ID,FOLLOW_ID_in_entraNaClasse88); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;

            }


            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) { // def class but leave superclass blank until ref phase
                    System.out.println("line "+nome.getLine()+
                                       ": def class "+(nome!=null?nome.getText():null));
                    // record scope in AST for next pass
                   // if ( sup!=null ) 
                     // sup.escopo = escopoAtual; 
                    SimboloClasse classe = new SimboloClasse((nome!=null?nome.getText():null),escopoAtual,null);
                    //classe.def = nome;           // point from symbol table into AST
                    //nome.simbolo = classe;        // point from AST into symbol table
                    escopoAtual.definir(classe);  // def class in current scope
                    escopoAtual = classe;        // set current scope to class scope
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
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:43:1: declaracaoVariavel : ^( FIELD_DECL var= ID tipo= . ) ;
    public final void declaracaoVariavel() throws RecognitionException {
        BytecodesAST var=null;
        BytecodesAST tipo=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:44:5: ( ^( FIELD_DECL var= ID tipo= . ) )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:44:9: ^( FIELD_DECL var= ID tipo= . )
            {
            match(input,FIELD_DECL,FOLLOW_FIELD_DECL_in_declaracaoVariavel127); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            var=(BytecodesAST)match(input,ID,FOLLOW_ID_in_declaracaoVariavel133); if (state.failed) return ;

            tipo=(BytecodesAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
                    System.out.println("line "+var.getLine()+": def "+(var!=null?var.getText():null));
                    //var.escopo = escopoAtual;
                    SimboloTipoPrimitvo tipoPrimitivo = new SimboloTipoPrimitvo(tipo.getText());       
                    SimboloVariavel variavel = new SimboloVariavel((var!=null?var.getText():null),tipoPrimitivo);
                    //variavel.def = var;            // track AST location of def's ID
                    //var.simbolo = variavel;         // track in AST
                    escopoAtual.definir(variavel);
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

    // Delegated rules


 

    public static final BitSet FOLLOW_entraNaClasse_in_topdown43 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracaoVariavel_in_bottomup51 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_7_in_entraNaClasse76 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_entraNaClasse80 = new BitSet(new long[]{0x00000000000000F0L});
    public static final BitSet FOLLOW_EXTENDS_in_entraNaClasse84 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_entraNaClasse88 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FIELD_DECL_in_declaracaoVariavel127 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_declaracaoVariavel133 = new BitSet(new long[]{0x00000000000000F0L});

}