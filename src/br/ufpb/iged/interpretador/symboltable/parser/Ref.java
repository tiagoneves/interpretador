// $ANTLR 3.4 C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g 2012-07-03 22:49:06

    package br.ufpb.iged.interpretador.symboltable.parser;
    
    import br.ufpb.iged.interpretador.symboltable.classes.Escopo;
    import br.ufpb.iged.interpretador.symboltable.classes.BytecodesAST;
    import br.ufpb.iged.interpretador.symboltable.classes.SimboloClasse;
    import br.ufpb.iged.interpretador.symboltable.classes.TabelaSimbolos;
    import br.ufpb.iged.interpretador.symboltable.classes.Tipo;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class Ref extends TreeFilter {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CLASSE", "EXTENDS", "FIELD_DECL", "GETFIELD", "ID", "INVOKESPECIAL", "PUTFIELD"
    };

    public static final int EOF=-1;
    public static final int CLASSE=4;
    public static final int EXTENDS=5;
    public static final int FIELD_DECL=6;
    public static final int GETFIELD=7;
    public static final int ID=8;
    public static final int INVOKESPECIAL=12;
    public static final int PUTFIELD=16;

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
        SimboloClasse simboloClasse;
        public Ref(TreeNodeStream input, TabelaSimbolos tabelaSimbolos) {
            this(input);
            this.tabelaSimbolos = tabelaSimbolos;
        }
        
        public Tipo resolverTipo(String nomeTipo) {
        
          return (Tipo)simboloClasse.resolver(nomeTipo);
        
        }
        



    // $ANTLR start "topdown"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:35:1: topdown : ( entraNaClasse | declaracaoVariavel | getfield | putfield | invokespecial );
    public final void topdown() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:36:5: ( entraNaClasse | declaracaoVariavel | getfield | putfield | invokespecial )
            int alt1=5;
            switch ( input.LA(1) ) {
            case CLASSE:
                {
                alt1=1;
                }
                break;
            case FIELD_DECL:
                {
                alt1=2;
                }
                break;
            case GETFIELD:
                {
                alt1=3;
                }
                break;
            case PUTFIELD:
                {
                alt1=4;
                }
                break;
            case INVOKESPECIAL:
                {
                alt1=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:36:7: entraNaClasse
                    {
                    pushFollow(FOLLOW_entraNaClasse_in_topdown53);
                    entraNaClasse();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:37:7: declaracaoVariavel
                    {
                    pushFollow(FOLLOW_declaracaoVariavel_in_topdown61);
                    declaracaoVariavel();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:38:7: getfield
                    {
                    pushFollow(FOLLOW_getfield_in_topdown69);
                    getfield();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:39:7: putfield
                    {
                    pushFollow(FOLLOW_putfield_in_topdown77);
                    putfield();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:40:7: invokespecial
                    {
                    pushFollow(FOLLOW_invokespecial_in_topdown85);
                    invokespecial();

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
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:43:1: entraNaClasse : ^( CLASSE nome= ID ( ^( EXTENDS sup= ID ) )? . ) ;
    public final void entraNaClasse() throws RecognitionException {
        BytecodesAST nome=null;
        BytecodesAST sup=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:44:5: ( ^( CLASSE nome= ID ( ^( EXTENDS sup= ID ) )? . ) )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:44:9: ^( CLASSE nome= ID ( ^( EXTENDS sup= ID ) )? . )
            {
            match(input,CLASSE,FOLLOW_CLASSE_in_entraNaClasse109); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            nome=(BytecodesAST)match(input,ID,FOLLOW_ID_in_entraNaClasse113); if (state.failed) return ;

            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:44:26: ( ^( EXTENDS sup= ID ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==EXTENDS) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==DOWN) ) {
                    int LA2_3 = input.LA(3);

                    if ( (LA2_3==ID) ) {
                        int LA2_4 = input.LA(4);

                        if ( (LA2_4==UP) ) {
                            int LA2_5 = input.LA(5);

                            if ( ((LA2_5 >= CLASSE && LA2_5 <= PUTFIELD)) ) {
                                alt2=1;
                            }
                        }
                    }
                }
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:44:27: ^( EXTENDS sup= ID )
                    {
                    match(input,EXTENDS,FOLLOW_EXTENDS_in_entraNaClasse117); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    sup=(BytecodesAST)match(input,ID,FOLLOW_ID_in_entraNaClasse121); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;

            }


            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
                      simboloClasse = ((SimboloClasse)nome.simbolo);
                      if ( sup!=null ) {
                          // look up superclass (if any)
                          sup.simbolo = sup.escopo.resolver((sup!=null?sup.getText():null));
                          simboloClasse.superClasse =
                              (SimboloClasse)sup.simbolo;
                              System.out.println("linha "+nome.getLine()+": set "+(nome!=null?nome.getText():null)+
                              " super to "+((SimboloClasse)nome.simbolo).superClasse.nome);
                       }
                       else {
                          System.out.println("linha "+nome.getLine()+": set "+(nome!=null?nome.getText():null));
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
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:61:1: declaracaoVariavel : ^( FIELD_DECL ID tip= . ) ;
    public final void declaracaoVariavel() throws RecognitionException {
        BytecodesAST ID1=null;
        BytecodesAST tip=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:62:5: ( ^( FIELD_DECL ID tip= . ) )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:62:9: ^( FIELD_DECL ID tip= . )
            {
            match(input,FIELD_DECL,FOLLOW_FIELD_DECL_in_declaracaoVariavel162); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            ID1=(BytecodesAST)match(input,ID,FOLLOW_ID_in_declaracaoVariavel164); if (state.failed) return ;

            tip=(BytecodesAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
                       ID1.simbolo.tipo = resolverTipo(tip.getText());
                      //ID1.simbolo.tipo = tip.tsimb; // set return type of variable
                      System.out.println("linha "+ID1.getLine()+": set var type "+ID1.simbolo);
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



    // $ANTLR start "getfield"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:70:1: getfield : ^( GETFIELD classe= . . campo= . tipo= . ) ;
    public final void getfield() throws RecognitionException {
        BytecodesAST classe=null;
        BytecodesAST campo=null;
        BytecodesAST tipo=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:71:5: ( ^( GETFIELD classe= . . campo= . tipo= . ) )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:71:7: ^( GETFIELD classe= . . campo= . tipo= . )
            {
            match(input,GETFIELD,FOLLOW_GETFIELD_in_getfield203); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            classe=(BytecodesAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            campo=(BytecodesAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            tipo=(BytecodesAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
                  System.out.println("Entrando no getfield..");
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
    // $ANTLR end "getfield"



    // $ANTLR start "putfield"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:77:1: putfield : ^( PUTFIELD classe= . . campo= . tipo= . ) ;
    public final void putfield() throws RecognitionException {
        BytecodesAST classe=null;
        BytecodesAST campo=null;
        BytecodesAST tipo=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:78:5: ( ^( PUTFIELD classe= . . campo= . tipo= . ) )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:78:7: ^( PUTFIELD classe= . . campo= . tipo= . )
            {
            match(input,PUTFIELD,FOLLOW_PUTFIELD_in_putfield253); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            classe=(BytecodesAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            campo=(BytecodesAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            tipo=(BytecodesAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
                  System.out.println("Entrando no putfield..");
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
    // $ANTLR end "putfield"



    // $ANTLR start "invokespecial"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:84:1: invokespecial : ^( INVOKESPECIAL classe= . . metodo= . args= . tipo= . ) ;
    public final void invokespecial() throws RecognitionException {
        BytecodesAST classe=null;
        BytecodesAST metodo=null;
        BytecodesAST args=null;
        BytecodesAST tipo=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:85:5: ( ^( INVOKESPECIAL classe= . . metodo= . args= . tipo= . ) )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:85:7: ^( INVOKESPECIAL classe= . . metodo= . args= . tipo= . )
            {
            match(input,INVOKESPECIAL,FOLLOW_INVOKESPECIAL_in_invokespecial303); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            classe=(BytecodesAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            metodo=(BytecodesAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            args=(BytecodesAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            tipo=(BytecodesAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
                  System.out.println("Entrando no invokespecial..");
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
    // $ANTLR end "invokespecial"

    // Delegated rules


 

    public static final BitSet FOLLOW_entraNaClasse_in_topdown53 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracaoVariavel_in_topdown61 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_getfield_in_topdown69 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_putfield_in_topdown77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_invokespecial_in_topdown85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CLASSE_in_entraNaClasse109 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_entraNaClasse113 = new BitSet(new long[]{0x00000000000007F0L});
    public static final BitSet FOLLOW_EXTENDS_in_entraNaClasse117 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_entraNaClasse121 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FIELD_DECL_in_declaracaoVariavel162 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_declaracaoVariavel164 = new BitSet(new long[]{0x00000000000007F0L});
    public static final BitSet FOLLOW_GETFIELD_in_getfield203 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PUTFIELD_in_putfield253 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INVOKESPECIAL_in_invokespecial303 = new BitSet(new long[]{0x0000000000000004L});

}