// $ANTLR 3.4 C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g 2012-09-04 23:46:55

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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:31:1: topdown : ( entraNoCorpoMetodo | entraNoConstrutor | entraNoMetodo | entraNaClasse | parametros | declaracaoVariavel | operacoesUm | operacoesDois | outrasOperacoes );
    public final void topdown() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:31:9: ( entraNoCorpoMetodo | entraNoConstrutor | entraNoMetodo | entraNaClasse | parametros | declaracaoVariavel | operacoesUm | operacoesDois | outrasOperacoes )
            int alt1=9;
            alt1 = dfa1.predict(input);
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
                case 7 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:37:11: operacoesUm
                    {
                    pushFollow(FOLLOW_operacoesUm_in_topdown121);
                    operacoesUm();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:38:11: operacoesDois
                    {
                    pushFollow(FOLLOW_operacoesDois_in_topdown133);
                    operacoesDois();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:39:11: outrasOperacoes
                    {
                    pushFollow(FOLLOW_outrasOperacoes_in_topdown145);
                    outrasOperacoes();

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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:42:1: bottomup : ( saiDoCorpoMetodo | saiDoMetodo | saiDoConstrutor | saiDaClasse );
    public final void bottomup() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:42:10: ( saiDoCorpoMetodo | saiDoMetodo | saiDoConstrutor | saiDaClasse )
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
            case 30:
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
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:42:12: saiDoCorpoMetodo
                    {
                    pushFollow(FOLLOW_saiDoCorpoMetodo_in_bottomup162);
                    saiDoCorpoMetodo();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:43:12: saiDoMetodo
                    {
                    pushFollow(FOLLOW_saiDoMetodo_in_bottomup175);
                    saiDoMetodo();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:44:12: saiDoConstrutor
                    {
                    pushFollow(FOLLOW_saiDoConstrutor_in_bottomup188);
                    saiDoConstrutor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:45:12: saiDaClasse
                    {
                    pushFollow(FOLLOW_saiDaClasse_in_bottomup201);
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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:48:1: entraNaClasse : ^( '.class' nome= ID ( ^( EXTENDS sup= TIPO_REF ) )? . ) ;
    public final void entraNaClasse() throws RecognitionException {
        BytecodesAST nome=null;
        BytecodesAST sup=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:49:5: ( ^( '.class' nome= ID ( ^( EXTENDS sup= TIPO_REF ) )? . ) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:49:7: ^( '.class' nome= ID ( ^( EXTENDS sup= TIPO_REF ) )? . )
            {
            match(input,30,FOLLOW_30_in_entraNaClasse233); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            nome=(BytecodesAST)match(input,ID,FOLLOW_ID_in_entraNaClasse237); if (state.failed) return ;

            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:49:26: ( ^( EXTENDS sup= TIPO_REF ) )?
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

                            if ( ((LA3_5 >= ARITMETICA && LA3_5 <= 100)) ) {
                                alt3=1;
                            }
                        }
                    }
                }
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:49:27: ^( EXTENDS sup= TIPO_REF )
                    {
                    match(input,EXTENDS,FOLLOW_EXTENDS_in_entraNaClasse241); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    sup=(BytecodesAST)match(input,TIPO_REF,FOLLOW_TIPO_REF_in_entraNaClasse245); if (state.failed) return ;

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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:63:1: declaracaoVariavel : ^( FIELD_DECL ID tipo= . ) ;
    public final void declaracaoVariavel() throws RecognitionException {
        BytecodesAST ID1=null;
        BytecodesAST tipo=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:64:5: ( ^( FIELD_DECL ID tipo= . ) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:64:7: ^( FIELD_DECL ID tipo= . )
            {
            match(input,FIELD_DECL,FOLLOW_FIELD_DECL_in_declaracaoVariavel279); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            ID1=(BytecodesAST)match(input,ID,FOLLOW_ID_in_declaracaoVariavel281); if (state.failed) return ;

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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:76:1: entraNoConstrutor : ^( CONSTR_DECL INIT ( . )+ ) ;
    public final void entraNoConstrutor() throws RecognitionException {
        BytecodesAST INIT2=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:77:2: ( ^( CONSTR_DECL INIT ( . )+ ) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:77:4: ^( CONSTR_DECL INIT ( . )+ )
            {
            match(input,CONSTR_DECL,FOLLOW_CONSTR_DECL_in_entraNoConstrutor316); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            INIT2=(BytecodesAST)match(input,INIT,FOLLOW_INIT_in_entraNoConstrutor318); if (state.failed) return ;

            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:77:23: ( . )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= ARITMETICA && LA4_0 <= 100)) ) {
                    alt4=1;
                }
                else if ( (LA4_0==UP) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:77:23: .
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


            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            	   System.out.println("linha "+INIT2.getLine()+
                                      ": def method init ");
                       SimboloMetodo metodo = new SimboloMetodo("init", null, escopoAtual);
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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:89:1: entraNoMetodo : ^( METHOD_DECL ID tipoRet= . ( . )+ ) ;
    public final void entraNoMetodo() throws RecognitionException {
        BytecodesAST ID3=null;
        BytecodesAST tipoRet=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:90:2: ( ^( METHOD_DECL ID tipoRet= . ( . )+ ) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:90:4: ^( METHOD_DECL ID tipoRet= . ( . )+ )
            {
            match(input,METHOD_DECL,FOLLOW_METHOD_DECL_in_entraNoMetodo338); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            ID3=(BytecodesAST)match(input,ID,FOLLOW_ID_in_entraNoMetodo340); if (state.failed) return ;

            tipoRet=(BytecodesAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:90:32: ( . )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= ARITMETICA && LA5_0 <= 100)) ) {
                    alt5=1;
                }
                else if ( (LA5_0==UP) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:90:32: .
            	    {
            	    matchAny(input); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
            	   System.out.println("linha "+ID3.getLine()+
                                      ": def method "+(ID3!=null?ID3.getText():null));
                       SimboloMetodo metodo = new SimboloMetodo((ID3!=null?ID3.getText():null), null, escopoAtual);
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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:103:1: parametros : ^( PARAMS pars= . ) ;
    public final void parametros() throws RecognitionException {
        BytecodesAST pars=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:104:2: ( ^( PARAMS pars= . ) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:104:4: ^( PARAMS pars= . )
            {
            match(input,PARAMS,FOLLOW_PARAMS_in_parametros365); if (state.failed) return ;

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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:115:1: entraNoCorpoMetodo : BODY ;
    public final void entraNoCorpoMetodo() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:116:5: ( BODY )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:116:9: BODY
            {
            match(input,BODY,FOLLOW_BODY_in_entraNoCorpoMetodo393); if (state.failed) return ;

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



    // $ANTLR start "operacoesUm"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:119:1: operacoesUm : ^( ( DESVIO | LABEL | ARITMETICA | LOAD | STORE | LOGICA | PILHA ) operacao= . ) ;
    public final void operacoesUm() throws RecognitionException {
        BytecodesAST operacao=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:120:9: ( ^( ( DESVIO | LABEL | ARITMETICA | LOAD | STORE | LOGICA | PILHA ) operacao= . ) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:120:12: ^( ( DESVIO | LABEL | ARITMETICA | LOAD | STORE | LOGICA | PILHA ) operacao= . )
            {
            if ( input.LA(1)==ARITMETICA||input.LA(1)==DESVIO||(input.LA(1) >= LABEL && input.LA(1) <= LOGICA)||(input.LA(1) >= PILHA && input.LA(1) <= STORE) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input, Token.DOWN, null); if (state.failed) return ;
            operacao=(BytecodesAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
                   	   System.out.println("def operacao "+operacao.getText());
               	   SimboloMetodo metodo = (SimboloMetodo)escopoAtual.obterEscopoEnvolvente();
               	   operacao.simbolo = metodo;
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
    // $ANTLR end "operacoesUm"



    // $ANTLR start "operacoesDois"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:138:1: operacoesDois : ^( ( LOAD | STORE | DESVIO ) operacao= . . ) ;
    public final void operacoesDois() throws RecognitionException {
        BytecodesAST operacao=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:139:9: ( ^( ( LOAD | STORE | DESVIO ) operacao= . . ) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:139:12: ^( ( LOAD | STORE | DESVIO ) operacao= . . )
            {
            if ( input.LA(1)==DESVIO||input.LA(1)==LOAD||input.LA(1)==STORE ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input, Token.DOWN, null); if (state.failed) return ;
            operacao=(BytecodesAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
                   	   System.out.println("def operacao "+operacao.getText());
               	   SimboloMetodo metodo = (SimboloMetodo)escopoAtual.obterEscopoEnvolvente();
               	   operacao.simbolo = metodo;
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
    // $ANTLR end "operacoesDois"



    // $ANTLR start "outrasOperacoes"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:153:1: outrasOperacoes : (nome= 'getfield' |nome= 'putfield' |nome= 'invokespecial' |nome= 'ireturn' |nome= 'areturn' |nome= 'return' |nome= 'new' ) ;
    public final void outrasOperacoes() throws RecognitionException {
        BytecodesAST nome=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:154:2: ( (nome= 'getfield' |nome= 'putfield' |nome= 'invokespecial' |nome= 'ireturn' |nome= 'areturn' |nome= 'return' |nome= 'new' ) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:154:4: (nome= 'getfield' |nome= 'putfield' |nome= 'invokespecial' |nome= 'ireturn' |nome= 'areturn' |nome= 'return' |nome= 'new' )
            {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:154:4: (nome= 'getfield' |nome= 'putfield' |nome= 'invokespecial' |nome= 'ireturn' |nome= 'areturn' |nome= 'return' |nome= 'new' )
            int alt6=7;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt6=1;
                }
                break;
            case 99:
                {
                alt6=2;
                }
                break;
            case 83:
                {
                alt6=3;
                }
                break;
            case 86:
                {
                alt6=4;
                }
                break;
            case 44:
                {
                alt6=5;
                }
                break;
            case 100:
                {
                alt6=6;
                }
                break;
            case 95:
                {
                alt6=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:154:8: nome= 'getfield'
                    {
                    nome=(BytecodesAST)match(input,51,FOLLOW_51_in_outrasOperacoes760); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:155:8: nome= 'putfield'
                    {
                    nome=(BytecodesAST)match(input,99,FOLLOW_99_in_outrasOperacoes774); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:156:8: nome= 'invokespecial'
                    {
                    nome=(BytecodesAST)match(input,83,FOLLOW_83_in_outrasOperacoes788); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:157:8: nome= 'ireturn'
                    {
                    nome=(BytecodesAST)match(input,86,FOLLOW_86_in_outrasOperacoes802); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:158:8: nome= 'areturn'
                    {
                    nome=(BytecodesAST)match(input,44,FOLLOW_44_in_outrasOperacoes816); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:159:8: nome= 'return'
                    {
                    nome=(BytecodesAST)match(input,100,FOLLOW_100_in_outrasOperacoes830); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:160:8: nome= 'new'
                    {
                    nome=(BytecodesAST)match(input,95,FOLLOW_95_in_outrasOperacoes844); if (state.failed) return ;

                    }
                    break;

            }


            if ( state.backtracking==1 ) {
            	   System.out.println("def operacao "+nome.getText());
               	   SimboloMetodo metodo = (SimboloMetodo)escopoAtual.obterEscopoEnvolvente();
               	   nome.simbolo = metodo;
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
    // $ANTLR end "outrasOperacoes"



    // $ANTLR start "saiDoCorpoMetodo"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:168:1: saiDoCorpoMetodo : BODY ;
    public final void saiDoCorpoMetodo() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:169:5: ( BODY )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:169:9: BODY
            {
            match(input,BODY,FOLLOW_BODY_in_saiDoCorpoMetodo868); if (state.failed) return ;

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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:176:1: saiDaClasse : '.class' ;
    public final void saiDaClasse() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:176:13: ( '.class' )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:176:15: '.class'
            {
            match(input,30,FOLLOW_30_in_saiDaClasse895); if (state.failed) return ;

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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:183:1: saiDoMetodo : METHOD_DECL ;
    public final void saiDoMetodo() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:184:2: ( METHOD_DECL )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:184:5: METHOD_DECL
            {
            match(input,METHOD_DECL,FOLLOW_METHOD_DECL_in_saiDoMetodo945); if (state.failed) return ;

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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:191:1: saiDoConstrutor : CONSTR_DECL ;
    public final void saiDoConstrutor() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:192:2: ( CONSTR_DECL )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Def.g:192:5: CONSTR_DECL
            {
            match(input,CONSTR_DECL,FOLLOW_CONSTR_DECL_in_saiDoConstrutor961); if (state.failed) return ;

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


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\20\uffff";
    static final String DFA1_eofS =
        "\20\uffff";
    static final String DFA1_minS =
        "\1\4\6\uffff\1\2\2\uffff\1\4\1\2\1\4\1\uffff\2\3";
    static final String DFA1_maxS =
        "\1\144\6\uffff\1\2\2\uffff\3\144\1\uffff\2\144";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\7\1\11\3\uffff\1\10\2"+
        "\uffff";
    static final String DFA1_specialS =
        "\20\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\10\1\1\1\2\1\7\1\uffff\1\6\4\uffff\1\10\1\7\1\10\1\uffff"+
            "\1\3\2\uffff\1\5\1\10\1\7\6\uffff\1\4\15\uffff\1\11\6\uffff"+
            "\1\11\37\uffff\1\11\2\uffff\1\11\10\uffff\1\11\3\uffff\2\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\12",
            "",
            "",
            "\141\13",
            "\1\14\1\10\141\15",
            "\141\16",
            "",
            "\1\17\141\16",
            "\1\10\141\15"
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "31:1: topdown : ( entraNoCorpoMetodo | entraNoConstrutor | entraNoMetodo | entraNaClasse | parametros | declaracaoVariavel | operacoesUm | operacoesDois | outrasOperacoes );";
        }
    }
 

    public static final BitSet FOLLOW_entraNoCorpoMetodo_in_topdown49 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_entraNoConstrutor_in_topdown61 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_entraNoMetodo_in_topdown73 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_entraNaClasse_in_topdown85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parametros_in_topdown97 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracaoVariavel_in_topdown109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operacoesUm_in_topdown121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_operacoesDois_in_topdown133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_outrasOperacoes_in_topdown145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_saiDoCorpoMetodo_in_bottomup162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_saiDoMetodo_in_bottomup175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_saiDoConstrutor_in_bottomup188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_saiDaClasse_in_bottomup201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_entraNaClasse233 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_entraNaClasse237 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_EXTENDS_in_entraNaClasse241 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TIPO_REF_in_entraNaClasse245 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FIELD_DECL_in_declaracaoVariavel279 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_declaracaoVariavel281 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_CONSTR_DECL_in_entraNoConstrutor316 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INIT_in_entraNoConstrutor318 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_METHOD_DECL_in_entraNoMetodo338 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_entraNoMetodo340 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_PARAMS_in_parametros365 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BODY_in_entraNoCorpoMetodo393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_operacoesUm431 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_operacoesDois629 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_51_in_outrasOperacoes760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_outrasOperacoes774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_outrasOperacoes788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_outrasOperacoes802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_outrasOperacoes816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_outrasOperacoes830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_outrasOperacoes844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BODY_in_saiDoCorpoMetodo868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_saiDaClasse895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_METHOD_DECL_in_saiDoMetodo945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTR_DECL_in_saiDoConstrutor961 = new BitSet(new long[]{0x0000000000000002L});

}