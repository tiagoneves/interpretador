// $ANTLR 3.4 C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g 2012-09-17 19:14:28

    package br.ufpb.iged.interpretador.parser;
    
    import br.ufpb.iged.interpretador.symboltable.classes.BytecodesAST;
    import br.ufpb.iged.interpretador.symboltable.classes.Escopo;
    import br.ufpb.iged.interpretador.symboltable.classes.SimboloClasse;
    import br.ufpb.iged.interpretador.symboltable.classes.SimboloVariavel;
    import br.ufpb.iged.interpretador.symboltable.classes.SimboloMetodo;
    import br.ufpb.iged.interpretador.symboltable.classes.TabelaSimbolos;
    import br.ufpb.iged.interpretador.symboltable.classes.EscopoLocal;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class Def extends TreeFilter {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARGS", "ARITMETICA", "BODY", "CONSTR_DECL", "DESVIO", "EXTENDS", "FIELD_DECL", "ID", "INIT", "INT", "INTEIRO", "LABEL", "LIMIT", "LOAD", "LOGICA", "MEMBRO_CLASSE", "METHOD_CALL", "METHOD_DECL", "NEWLINE", "NULL", "PARAMS", "PILHA", "STORE", "TIPO_REF", "VOID", "WS", "'('", "'()'", "')'", "'.class'", "'.end class'", "'.end method'", "'.field'", "'.limit locals'", "'.method'", "'.super'", "'/'", "':'", "'aconst_null'", "'aload'", "'aload_0'", "'aload_1'", "'aload_2'", "'aload_3'", "'areturn'", "'astore'", "'astore_0'", "'astore_1'", "'astore_2'", "'astore_3'", "'dup'", "'getfield'", "'getstatic'", "'goto'", "'iadd'", "'iand'", "'iconst_0'", "'iconst_1'", "'iconst_2'", "'iconst_3'", "'iconst_4'", "'iconst_5'", "'iconst_m1'", "'idiv'", "'if_icmpeq'", "'if_icmpge'", "'if_icmpgt'", "'if_icmple'", "'if_icmplt'", "'if_icmpne'", "'ifeq'", "'ifge'", "'ifgt'", "'ifle'", "'iflt'", "'ifne'", "'iinc'", "'iload'", "'iload_0'", "'iload_1'", "'iload_2'", "'iload_3'", "'imul'", "'ineg'", "'invokespecial'", "'invokestatic'", "'invokevirtual'", "'ior'", "'irem'", "'ireturn'", "'istore'", "'istore_0'", "'istore_1'", "'istore_2'", "'istore_3'", "'isub'", "'ixor'", "'ldc'", "'new'", "'nop'", "'pop'", "'pop2'", "'putfield'", "'putstatic'", "'return'", "'static'"
    };

    public static final int EOF=-1;
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
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int ARGS=4;
    public static final int ARITMETICA=5;
    public static final int BODY=6;
    public static final int CONSTR_DECL=7;
    public static final int DESVIO=8;
    public static final int EXTENDS=9;
    public static final int FIELD_DECL=10;
    public static final int ID=11;
    public static final int INIT=12;
    public static final int INT=13;
    public static final int INTEIRO=14;
    public static final int LABEL=15;
    public static final int LIMIT=16;
    public static final int LOAD=17;
    public static final int LOGICA=18;
    public static final int MEMBRO_CLASSE=19;
    public static final int METHOD_CALL=20;
    public static final int METHOD_DECL=21;
    public static final int NEWLINE=22;
    public static final int NULL=23;
    public static final int PARAMS=24;
    public static final int PILHA=25;
    public static final int STORE=26;
    public static final int TIPO_REF=27;
    public static final int VOID=28;
    public static final int WS=29;

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
    public String getGrammarFileName() { return "C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g"; }


        TabelaSimbolos tabelaSimbolos;
        Escopo escopoAtual;
        public Def(TreeNodeStream input, TabelaSimbolos tabelaSimbolos) {
            this(input);
            this.tabelaSimbolos = tabelaSimbolos;
            escopoAtual = tabelaSimbolos.global;
        }



    // $ANTLR start "topdown"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:31:1: topdown : ( entraNoCorpoMetodo | entraNoConstrutor | entraNoMetodo | entraNaClasse | parametros | declaracaoVariavel );
    public final void topdown() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:31:9: ( entraNoCorpoMetodo | entraNoConstrutor | entraNoMetodo | entraNaClasse | parametros | declaracaoVariavel )
            int alt1=6;
            switch ( input.LA(1) ) {
            case BODY:
                {
                alt1=1;
                }
                break;
            case CONSTR_DECL:
                {
                alt1=2;
                }
                break;
            case METHOD_DECL:
                {
                alt1=3;
                }
                break;
            case 33:
                {
                alt1=4;
                }
                break;
            case PARAMS:
                {
                alt1=5;
                }
                break;
            case FIELD_DECL:
                {
                alt1=6;
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
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:31:11: entraNoCorpoMetodo
                    {
                    pushFollow(FOLLOW_entraNoCorpoMetodo_in_topdown49);
                    entraNoCorpoMetodo();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:32:11: entraNoConstrutor
                    {
                    pushFollow(FOLLOW_entraNoConstrutor_in_topdown61);
                    entraNoConstrutor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:33:11: entraNoMetodo
                    {
                    pushFollow(FOLLOW_entraNoMetodo_in_topdown73);
                    entraNoMetodo();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:34:11: entraNaClasse
                    {
                    pushFollow(FOLLOW_entraNaClasse_in_topdown85);
                    entraNaClasse();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:35:11: parametros
                    {
                    pushFollow(FOLLOW_parametros_in_topdown97);
                    parametros();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:36:11: declaracaoVariavel
                    {
                    pushFollow(FOLLOW_declaracaoVariavel_in_topdown109);
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



    // $ANTLR start "bottomup"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:39:1: bottomup : ( saiDoCorpoMetodo | saiDoMetodo | saiDoConstrutor | saiDaClasse );
    public final void bottomup() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:39:10: ( saiDoCorpoMetodo | saiDoMetodo | saiDoConstrutor | saiDaClasse )
            int alt2=4;
            switch ( input.LA(1) ) {
            case BODY:
                {
                alt2=1;
                }
                break;
            case METHOD_DECL:
                {
                alt2=2;
                }
                break;
            case CONSTR_DECL:
                {
                alt2=3;
                }
                break;
            case 33:
                {
                alt2=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:39:12: saiDoCorpoMetodo
                    {
                    pushFollow(FOLLOW_saiDoCorpoMetodo_in_bottomup126);
                    saiDoCorpoMetodo();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:40:12: saiDoMetodo
                    {
                    pushFollow(FOLLOW_saiDoMetodo_in_bottomup139);
                    saiDoMetodo();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:41:12: saiDoConstrutor
                    {
                    pushFollow(FOLLOW_saiDoConstrutor_in_bottomup152);
                    saiDoConstrutor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:42:12: saiDaClasse
                    {
                    pushFollow(FOLLOW_saiDaClasse_in_bottomup165);
                    saiDaClasse();

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
    // $ANTLR end "bottomup"



    // $ANTLR start "entraNaClasse"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:45:1: entraNaClasse : ^( '.class' nome= ID ( ^( EXTENDS sup= TIPO_REF ) )? . ) ;
    public final void entraNaClasse() throws RecognitionException {
        BytecodesAST nome=null;
        BytecodesAST sup=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:46:5: ( ^( '.class' nome= ID ( ^( EXTENDS sup= TIPO_REF ) )? . ) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:46:7: ^( '.class' nome= ID ( ^( EXTENDS sup= TIPO_REF ) )? . )
            {
            match(input,33,FOLLOW_33_in_entraNaClasse197); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            nome=(BytecodesAST)match(input,ID,FOLLOW_ID_in_entraNaClasse201); if (state.failed) return ;

            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:46:26: ( ^( EXTENDS sup= TIPO_REF ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==EXTENDS) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==DOWN) ) {
                    int LA3_3 = input.LA(3);

                    if ( (LA3_3==TIPO_REF) ) {
                        int LA3_4 = input.LA(4);

                        if ( (LA3_4==UP) ) {
                            int LA3_5 = input.LA(5);

                            if ( ((LA3_5 >= ARGS && LA3_5 <= 109)) ) {
                                alt3=1;
                            }
                        }
                    }
                }
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:46:27: ^( EXTENDS sup= TIPO_REF )
                    {
                    match(input,EXTENDS,FOLLOW_EXTENDS_in_entraNaClasse205); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    sup=(BytecodesAST)match(input,TIPO_REF,FOLLOW_TIPO_REF_in_entraNaClasse209); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;

            }


            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
                       System.out.println("linha "+nome.getLine()+
                                      ": def class "+(nome!=null?nome.getText():null));
                       if ( sup!=null )
                         sup.escopo = escopoAtual;
                       SimboloClasse classe = new SimboloClasse("L" + (nome!=null?nome.getText():null),escopoAtual,null);
                       classe.def = nome;
                       nome.simbolo = classe;
                       escopoAtual.definir(classe);
                       escopoAtual = classe;
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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:60:1: declaracaoVariavel : ^( FIELD_DECL ID tipo= . ) ;
    public final void declaracaoVariavel() throws RecognitionException {
        BytecodesAST ID1=null;
        BytecodesAST tipo=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:61:5: ( ^( FIELD_DECL ID tipo= . ) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:61:7: ^( FIELD_DECL ID tipo= . )
            {
            match(input,FIELD_DECL,FOLLOW_FIELD_DECL_in_declaracaoVariavel243); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            ID1=(BytecodesAST)match(input,ID,FOLLOW_ID_in_declaracaoVariavel245); if (state.failed) return ;

            tipo=(BytecodesAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
                      System.out.println("linha "+ID1.getLine()+": def "+(ID1!=null?ID1.getText():null));
                      tipo.escopo = escopoAtual;
                      SimboloVariavel variavel = new SimboloVariavel((ID1!=null?ID1.getText():null),null);
                      variavel.def = ID1;
                      ID1.simbolo = variavel;
                      escopoAtual.definir(variavel);
                      ((SimboloClasse)escopoAtual).getConstantPool().add(variavel);
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



    // $ANTLR start "entraNoConstrutor"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:73:1: entraNoConstrutor : ^( CONSTR_DECL INIT ( . )+ ( ^( LIMIT lim= INTEIRO ) )? ) ;
    public final void entraNoConstrutor() throws RecognitionException {
        BytecodesAST lim=null;
        BytecodesAST INIT2=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:74:2: ( ^( CONSTR_DECL INIT ( . )+ ( ^( LIMIT lim= INTEIRO ) )? ) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:74:4: ^( CONSTR_DECL INIT ( . )+ ( ^( LIMIT lim= INTEIRO ) )? )
            {
            match(input,CONSTR_DECL,FOLLOW_CONSTR_DECL_in_entraNoConstrutor280); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            INIT2=(BytecodesAST)match(input,INIT,FOLLOW_INIT_in_entraNoConstrutor282); if (state.failed) return ;

            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:74:23: ( . )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                switch ( input.LA(1) ) {
                case LIMIT:
                    {
                    int LA4_1 = input.LA(2);

                    if ( (true) ) {
                        alt4=1;
                    }
                    else if ( (true) ) {
                        alt4=2;
                    }


                    }
                    break;
                case ARGS:
                case ARITMETICA:
                case BODY:
                case CONSTR_DECL:
                case DESVIO:
                case EXTENDS:
                case FIELD_DECL:
                case ID:
                case INIT:
                case INT:
                case INTEIRO:
                case LABEL:
                case LOAD:
                case LOGICA:
                case MEMBRO_CLASSE:
                case METHOD_CALL:
                case METHOD_DECL:
                case NEWLINE:
                case NULL:
                case PARAMS:
                case PILHA:
                case STORE:
                case TIPO_REF:
                case VOID:
                case WS:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
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
                case 73:
                case 74:
                case 75:
                case 76:
                case 77:
                case 78:
                case 79:
                case 80:
                case 81:
                case 82:
                case 83:
                case 84:
                case 85:
                case 86:
                case 87:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                case 93:
                case 94:
                case 95:
                case 96:
                case 97:
                case 98:
                case 99:
                case 100:
                case 101:
                case 102:
                case 103:
                case 104:
                case 105:
                case 106:
                case 107:
                case 108:
                case 109:
                    {
                    alt4=1;
                    }
                    break;
                case UP:
                    {
                    alt4=2;
                    }
                    break;

                }

                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:74:23: .
            	    {
            	    matchAny(input); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:74:26: ( ^( LIMIT lim= INTEIRO ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==LIMIT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:74:27: ^( LIMIT lim= INTEIRO )
                    {
                    match(input,LIMIT,FOLLOW_LIMIT_in_entraNoConstrutor289); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    lim=(BytecodesAST)match(input,INTEIRO,FOLLOW_INTEIRO_in_entraNoConstrutor293); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            	   System.out.println("linha "+INIT2.getLine()+
                                      ": def method init ");
                       SimboloMetodo metodo = new SimboloMetodo((INIT2!=null?INIT2.getText():null), null, escopoAtual);
                       if (lim != null)
                       	metodo.setTamanhoMemoriaLocal(new Integer(lim.getText()));
                       metodo.def = INIT2;
                       INIT2.simbolo = metodo;
                       escopoAtual.definir(metodo);
                       escopoAtual = metodo;
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
    // $ANTLR end "entraNoConstrutor"



    // $ANTLR start "entraNoMetodo"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:88:1: entraNoMetodo : ^( METHOD_DECL ID tipoRet= . ( . )+ ( ^( LIMIT lim= INTEIRO ) )? ) ;
    public final void entraNoMetodo() throws RecognitionException {
        BytecodesAST lim=null;
        BytecodesAST ID3=null;
        BytecodesAST tipoRet=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:89:2: ( ^( METHOD_DECL ID tipoRet= . ( . )+ ( ^( LIMIT lim= INTEIRO ) )? ) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:89:4: ^( METHOD_DECL ID tipoRet= . ( . )+ ( ^( LIMIT lim= INTEIRO ) )? )
            {
            match(input,METHOD_DECL,FOLLOW_METHOD_DECL_in_entraNoMetodo313); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            ID3=(BytecodesAST)match(input,ID,FOLLOW_ID_in_entraNoMetodo315); if (state.failed) return ;

            tipoRet=(BytecodesAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:89:32: ( . )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                switch ( input.LA(1) ) {
                case LIMIT:
                    {
                    int LA6_1 = input.LA(2);

                    if ( (true) ) {
                        alt6=1;
                    }
                    else if ( (true) ) {
                        alt6=2;
                    }


                    }
                    break;
                case ARGS:
                case ARITMETICA:
                case BODY:
                case CONSTR_DECL:
                case DESVIO:
                case EXTENDS:
                case FIELD_DECL:
                case ID:
                case INIT:
                case INT:
                case INTEIRO:
                case LABEL:
                case LOAD:
                case LOGICA:
                case MEMBRO_CLASSE:
                case METHOD_CALL:
                case METHOD_DECL:
                case NEWLINE:
                case NULL:
                case PARAMS:
                case PILHA:
                case STORE:
                case TIPO_REF:
                case VOID:
                case WS:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
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
                case 73:
                case 74:
                case 75:
                case 76:
                case 77:
                case 78:
                case 79:
                case 80:
                case 81:
                case 82:
                case 83:
                case 84:
                case 85:
                case 86:
                case 87:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                case 93:
                case 94:
                case 95:
                case 96:
                case 97:
                case 98:
                case 99:
                case 100:
                case 101:
                case 102:
                case 103:
                case 104:
                case 105:
                case 106:
                case 107:
                case 108:
                case 109:
                    {
                    alt6=1;
                    }
                    break;
                case UP:
                    {
                    alt6=2;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:89:32: .
            	    {
            	    matchAny(input); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:89:35: ( ^( LIMIT lim= INTEIRO ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==LIMIT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:89:36: ^( LIMIT lim= INTEIRO )
                    {
                    match(input,LIMIT,FOLLOW_LIMIT_in_entraNoMetodo327); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    lim=(BytecodesAST)match(input,INTEIRO,FOLLOW_INTEIRO_in_entraNoMetodo331); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            	   System.out.println("linha "+ID3.getLine()+
                                      ": def method "+(ID3!=null?ID3.getText():null));
                       SimboloMetodo metodo = new SimboloMetodo((ID3!=null?ID3.getText():null), null, escopoAtual);
                       if (lim != null)
                       	metodo.setTamanhoMemoriaLocal(new Integer(lim.getText()));
                       metodo.setRetorno(tipoRet.getText());
                       metodo.def = ID3;
                       ID3.simbolo = metodo;
                       escopoAtual.definir(metodo);
                       escopoAtual = metodo;
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
    // $ANTLR end "entraNoMetodo"



    // $ANTLR start "parametros"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:104:1: parametros : ^( PARAMS pars= . ) ;
    public final void parametros() throws RecognitionException {
        BytecodesAST pars=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:105:2: ( ^( PARAMS pars= . ) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:105:4: ^( PARAMS pars= . )
            {
            match(input,PARAMS,FOLLOW_PARAMS_in_parametros351); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            pars=(BytecodesAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            	  System.out.println("linha "+pars.getLine()+": def "+pars.getText());
                      pars.escopo = escopoAtual;
                      SimboloVariavel par = new SimboloVariavel(pars.getText(),null);
                      par.def = pars;            // track AST location of def's ID
                      pars.simbolo = par;         // track in AST
                      escopoAtual.definir(par);
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
    // $ANTLR end "parametros"



    // $ANTLR start "entraNoCorpoMetodo"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:116:1: entraNoCorpoMetodo : BODY ;
    public final void entraNoCorpoMetodo() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:117:5: ( BODY )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:117:9: BODY
            {
            match(input,BODY,FOLLOW_BODY_in_entraNoCorpoMetodo379); if (state.failed) return ;

            if ( state.backtracking==1 ) {escopoAtual = new EscopoLocal(escopoAtual);}

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
    // $ANTLR end "entraNoCorpoMetodo"



    // $ANTLR start "saiDoCorpoMetodo"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:120:1: saiDoCorpoMetodo : BODY ;
    public final void saiDoCorpoMetodo() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:121:5: ( BODY )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:121:9: BODY
            {
            match(input,BODY,FOLLOW_BODY_in_saiDoCorpoMetodo405); if (state.failed) return ;

            if ( state.backtracking==1 ) {
                    System.out.println("locals: "+escopoAtual);
                    escopoAtual = escopoAtual.obterEscopoEnvolvente();    // pop scope
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
    // $ANTLR end "saiDoCorpoMetodo"



    // $ANTLR start "saiDaClasse"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:128:1: saiDaClasse : '.class' ;
    public final void saiDaClasse() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:128:13: ( '.class' )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:128:15: '.class'
            {
            match(input,33,FOLLOW_33_in_saiDaClasse432); if (state.failed) return ;

            if ( state.backtracking==1 ) {
                          System.out.println("Saindo da classe.. membros: "+escopoAtual);
                          escopoAtual = escopoAtual.obterEscopoEnvolvente(); // pop scope
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
    // $ANTLR end "saiDaClasse"



    // $ANTLR start "saiDoMetodo"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:135:1: saiDoMetodo : METHOD_DECL ;
    public final void saiDoMetodo() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:136:2: ( METHOD_DECL )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:136:5: METHOD_DECL
            {
            match(input,METHOD_DECL,FOLLOW_METHOD_DECL_in_saiDoMetodo482); if (state.failed) return ;

            if ( state.backtracking==1 ) {
            	   System.out.println("Saindo do metodo: "+escopoAtual);
            	   escopoAtual = escopoAtual.obterEscopoEnvolvente(); // pop scope
                       
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
    // $ANTLR end "saiDoMetodo"



    // $ANTLR start "saiDoConstrutor"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:144:1: saiDoConstrutor : CONSTR_DECL ;
    public final void saiDoConstrutor() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:145:2: ( CONSTR_DECL )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:145:5: CONSTR_DECL
            {
            match(input,CONSTR_DECL,FOLLOW_CONSTR_DECL_in_saiDoConstrutor498); if (state.failed) return ;

            if ( state.backtracking==1 ) {
            	   System.out.println("Saindo do construtor: "+escopoAtual);
                       escopoAtual = escopoAtual.obterEscopoEnvolvente(); // pop scope
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
    // $ANTLR end "saiDoConstrutor"

    // Delegated rules


 

    public static final BitSet FOLLOW_entraNoCorpoMetodo_in_topdown49 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_entraNoConstrutor_in_topdown61 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_entraNoMetodo_in_topdown73 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_entraNaClasse_in_topdown85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parametros_in_topdown97 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracaoVariavel_in_topdown109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_saiDoCorpoMetodo_in_bottomup126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_saiDoMetodo_in_bottomup139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_saiDoConstrutor_in_bottomup152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_saiDaClasse_in_bottomup165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_entraNaClasse197 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_entraNaClasse201 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00003FFFFFFFFFFFL});
    public static final BitSet FOLLOW_EXTENDS_in_entraNaClasse205 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TIPO_REF_in_entraNaClasse209 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FIELD_DECL_in_declaracaoVariavel243 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_declaracaoVariavel245 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00003FFFFFFFFFFFL});
    public static final BitSet FOLLOW_CONSTR_DECL_in_entraNoConstrutor280 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INIT_in_entraNoConstrutor282 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00003FFFFFFFFFFFL});
    public static final BitSet FOLLOW_LIMIT_in_entraNoConstrutor289 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INTEIRO_in_entraNoConstrutor293 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_METHOD_DECL_in_entraNoMetodo313 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_entraNoMetodo315 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00003FFFFFFFFFFFL});
    public static final BitSet FOLLOW_LIMIT_in_entraNoMetodo327 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INTEIRO_in_entraNoMetodo331 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARAMS_in_parametros351 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BODY_in_entraNoCorpoMetodo379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BODY_in_saiDoCorpoMetodo405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_saiDaClasse432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHOD_DECL_in_saiDoMetodo482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTR_DECL_in_saiDoConstrutor498 = new BitSet(new long[]{0x0000000000000002L});

}