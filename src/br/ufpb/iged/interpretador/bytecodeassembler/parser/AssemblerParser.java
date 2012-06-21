// $ANTLR 3.4 C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g 2012-06-21 00:00:37

package br.ufpb.iged.interpretador.bytecodeassembler.parser;

import org.antlr.runtime.*;

import br.ufpb.iged.interpretador.excecoes.AcessoIndevidoMemoriaException;
import br.ufpb.iged.interpretador.excecoes.LabelException;

import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public abstract class AssemblerParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INIT", "INT", "INTEIRO", "NOVA_LINHA", "NULL", "VOID", "WS", "'()'", "'/'", "':'", "'L'", "'aload'", "'aload_0'", "'aload_1'", "'aload_2'", "'aload_3'", "'getfield'", "'goto'", "'iadd'", "'iand'", "'iconst_0'", "'iconst_1'", "'iconst_2'", "'iconst_3'", "'iconst_4'", "'iconst_5'", "'iconst_m1'", "'idiv'", "'if_icmpeq'", "'if_icmpge'", "'if_icmpgt'", "'if_icmple'", "'if_icmplt'", "'if_icmpne'", "'ifeq'", "'ifge'", "'ifgt'", "'ifle'", "'iflt'", "'ifne'", "'iinc'", "'iload'", "'iload_0'", "'iload_1'", "'iload_2'", "'iload_3'", "'imul'", "'ineg'", "'invokespecial'", "'ior'", "'irem'", "'istore'", "'istore_0'", "'istore_1'", "'istore_2'", "'istore_3'", "'isub'", "'ixor'", "'ldc'", "'nop'", "'pop'", "'pop2'", "'putfield'"
    };

    public static final int EOF=-1;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
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
    public static final int ID=4;
    public static final int INIT=5;
    public static final int INT=6;
    public static final int INTEIRO=7;
    public static final int NOVA_LINHA=8;
    public static final int NULL=9;
    public static final int VOID=10;
    public static final int WS=11;

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

    public String[] getTokenNames() { return AssemblerParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g"; }



    protected abstract void escreverOpcode(Token opc);
    protected abstract void escreverOpcode(Token opc, Token op) throws LabelException;
    protected abstract void verificarAumentoMemoriaGlobal(Token opc) throws AcessoIndevidoMemoriaException;
    protected abstract void verificarAumentoMemoriaGlobal(Token opc, Token op) throws AcessoIndevidoMemoriaException, LabelException;
    protected abstract void definirLabel(Token id) throws LabelException;
      



    // $ANTLR start "programa"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:13:1: programa : ( comando )* ;
    public final void programa() throws RecognitionException, LabelException, AcessoIndevidoMemoriaException {
        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:13:10: ( ( comando )* )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:13:12: ( comando )*
            {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:13:12: ( comando )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID||LA1_0==NOVA_LINHA||(LA1_0 >= 16 && LA1_0 <= 67)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:13:12: comando
            	    {
            	    pushFollow(FOLLOW_comando_in_programa16);
            	    comando();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "programa"



    // $ANTLR start "comando"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:16:1: comando : ( label instrucao | instrucao ) ;
    public final void comando() throws RecognitionException, LabelException, AcessoIndevidoMemoriaException {
        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:16:9: ( ( label instrucao | instrucao ) )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:16:11: ( label instrucao | instrucao )
            {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:16:11: ( label instrucao | instrucao )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==NOVA_LINHA||(LA2_0 >= 16 && LA2_0 <= 67)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:16:12: label instrucao
                    {
                    pushFollow(FOLLOW_label_in_comando36);
                    label();

                    state._fsp--;


                    pushFollow(FOLLOW_instrucao_in_comando38);
                    instrucao();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:16:30: instrucao
                    {
                    pushFollow(FOLLOW_instrucao_in_comando42);
                    instrucao();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "comando"



    // $ANTLR start "label"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:18:1: label : a= ID ':' ;
    public final void label() throws RecognitionException, LabelException {
        Token a=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:18:7: (a= ID ':' )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:18:9: a= ID ':'
            {
            a=(Token)match(input,ID,FOLLOW_ID_in_label64); 

            match(input,14,FOLLOW_14_in_label66); 

            definirLabel(a);

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
    // $ANTLR end "label"



    // $ANTLR start "instrucao"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:20:1: instrucao : ( manipulacaoObjetos | aritmetica | load | store | desvio | logica | 'nop' |a= 'pop' |a= 'pop2' )? NOVA_LINHA ;
    public final void instrucao() throws RecognitionException, LabelException, AcessoIndevidoMemoriaException {
        Token a=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:20:10: ( ( manipulacaoObjetos | aritmetica | load | store | desvio | logica | 'nop' |a= 'pop' |a= 'pop2' )? NOVA_LINHA )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:20:12: ( manipulacaoObjetos | aritmetica | load | store | desvio | logica | 'nop' |a= 'pop' |a= 'pop2' )? NOVA_LINHA
            {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:20:12: ( manipulacaoObjetos | aritmetica | load | store | desvio | logica | 'nop' |a= 'pop' |a= 'pop2' )?
            int alt3=10;
            switch ( input.LA(1) ) {
                case 21:
                case 53:
                case 67:
                    {
                    alt3=1;
                    }
                    break;
                case 23:
                case 32:
                case 45:
                case 51:
                case 52:
                case 55:
                case 61:
                    {
                    alt3=2;
                    }
                    break;
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 63:
                    {
                    alt3=3;
                    }
                    break;
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                    {
                    alt3=4;
                    }
                    break;
                case 22:
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
                    {
                    alt3=5;
                    }
                    break;
                case 24:
                case 54:
                case 62:
                    {
                    alt3=6;
                    }
                    break;
                case 64:
                    {
                    alt3=7;
                    }
                    break;
                case 65:
                    {
                    alt3=8;
                    }
                    break;
                case 66:
                    {
                    alt3=9;
                    }
                    break;
            }

            switch (alt3) {
                case 1 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:20:13: manipulacaoObjetos
                    {
                    pushFollow(FOLLOW_manipulacaoObjetos_in_instrucao76);
                    manipulacaoObjetos();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:20:34: aritmetica
                    {
                    pushFollow(FOLLOW_aritmetica_in_instrucao80);
                    aritmetica();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:20:47: load
                    {
                    pushFollow(FOLLOW_load_in_instrucao84);
                    load();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:20:54: store
                    {
                    pushFollow(FOLLOW_store_in_instrucao88);
                    store();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:20:62: desvio
                    {
                    pushFollow(FOLLOW_desvio_in_instrucao92);
                    desvio();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:20:71: logica
                    {
                    pushFollow(FOLLOW_logica_in_instrucao96);
                    logica();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:21:21: 'nop'
                    {
                    match(input,64,FOLLOW_64_in_instrucao119); 

                    }
                    break;
                case 8 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:22:17: a= 'pop'
                    {
                    a=(Token)match(input,65,FOLLOW_65_in_instrucao141); 

                    escreverOpcode(a);

                    }
                    break;
                case 9 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:23:17: a= 'pop2'
                    {
                    a=(Token)match(input,66,FOLLOW_66_in_instrucao165); 

                    escreverOpcode(a);

                    }
                    break;

            }


            match(input,NOVA_LINHA,FOLLOW_NOVA_LINHA_in_instrucao185); 

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
    // $ANTLR end "instrucao"



    // $ANTLR start "manipulacaoObjetos"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:26:1: manipulacaoObjetos : ( 'getfield' ID '/' ID tipo | 'putfield' ID '/' ID tipo | 'invokespecial' ID '/' INIT '()' VOID );
    public final void manipulacaoObjetos() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:26:20: ( 'getfield' ID '/' ID tipo | 'putfield' ID '/' ID tipo | 'invokespecial' ID '/' INIT '()' VOID )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt4=1;
                }
                break;
            case 67:
                {
                alt4=2;
                }
                break;
            case 53:
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
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:26:22: 'getfield' ID '/' ID tipo
                    {
                    match(input,21,FOLLOW_21_in_manipulacaoObjetos193); 

                    match(input,ID,FOLLOW_ID_in_manipulacaoObjetos195); 

                    match(input,13,FOLLOW_13_in_manipulacaoObjetos197); 

                    match(input,ID,FOLLOW_ID_in_manipulacaoObjetos199); 

                    pushFollow(FOLLOW_tipo_in_manipulacaoObjetos201);
                    tipo();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:27:22: 'putfield' ID '/' ID tipo
                    {
                    match(input,67,FOLLOW_67_in_manipulacaoObjetos224); 

                    match(input,ID,FOLLOW_ID_in_manipulacaoObjetos226); 

                    match(input,13,FOLLOW_13_in_manipulacaoObjetos228); 

                    match(input,ID,FOLLOW_ID_in_manipulacaoObjetos230); 

                    pushFollow(FOLLOW_tipo_in_manipulacaoObjetos232);
                    tipo();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:28:22: 'invokespecial' ID '/' INIT '()' VOID
                    {
                    match(input,53,FOLLOW_53_in_manipulacaoObjetos255); 

                    match(input,ID,FOLLOW_ID_in_manipulacaoObjetos257); 

                    match(input,13,FOLLOW_13_in_manipulacaoObjetos259); 

                    match(input,INIT,FOLLOW_INIT_in_manipulacaoObjetos261); 

                    match(input,12,FOLLOW_12_in_manipulacaoObjetos263); 

                    match(input,VOID,FOLLOW_VOID_in_manipulacaoObjetos265); 

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
    // $ANTLR end "manipulacaoObjetos"



    // $ANTLR start "tipo"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:31:1: tipo : ( INT | VOID | 'L' ID );
    public final void tipo() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:31:6: ( INT | VOID | 'L' ID )
            int alt5=3;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt5=1;
                }
                break;
            case VOID:
                {
                alt5=2;
                }
                break;
            case 15:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:31:8: INT
                    {
                    match(input,INT,FOLLOW_INT_in_tipo296); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:31:14: VOID
                    {
                    match(input,VOID,FOLLOW_VOID_in_tipo300); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:31:21: 'L' ID
                    {
                    match(input,15,FOLLOW_15_in_tipo304); 

                    match(input,ID,FOLLOW_ID_in_tipo305); 

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
    // $ANTLR end "tipo"



    // $ANTLR start "aritmetica"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:33:1: aritmetica : (a= 'iadd' |a= 'isub' |a= 'imul' |a= 'idiv' |a= 'irem' |a= 'iinc' |a= 'ineg' );
    public final void aritmetica() throws RecognitionException {
        Token a=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:33:12: (a= 'iadd' |a= 'isub' |a= 'imul' |a= 'idiv' |a= 'irem' |a= 'iinc' |a= 'ineg' )
            int alt6=7;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt6=1;
                }
                break;
            case 61:
                {
                alt6=2;
                }
                break;
            case 51:
                {
                alt6=3;
                }
                break;
            case 32:
                {
                alt6=4;
                }
                break;
            case 55:
                {
                alt6=5;
                }
                break;
            case 45:
                {
                alt6=6;
                }
                break;
            case 52:
                {
                alt6=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:33:14: a= 'iadd'
                    {
                    a=(Token)match(input,23,FOLLOW_23_in_aritmetica318); 

                    escreverOpcode(a);

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:34:14: a= 'isub'
                    {
                    a=(Token)match(input,61,FOLLOW_61_in_aritmetica339); 

                    escreverOpcode(a);

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:35:14: a= 'imul'
                    {
                    a=(Token)match(input,51,FOLLOW_51_in_aritmetica360); 

                    escreverOpcode(a);

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:36:14: a= 'idiv'
                    {
                    a=(Token)match(input,32,FOLLOW_32_in_aritmetica381); 

                    escreverOpcode(a);

                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:37:14: a= 'irem'
                    {
                    a=(Token)match(input,55,FOLLOW_55_in_aritmetica402); 

                    escreverOpcode(a);

                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:38:14: a= 'iinc'
                    {
                    a=(Token)match(input,45,FOLLOW_45_in_aritmetica423); 

                    escreverOpcode(a);

                    }
                    break;
                case 7 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:39:14: a= 'ineg'
                    {
                    a=(Token)match(input,52,FOLLOW_52_in_aritmetica444); 

                    escreverOpcode(a);

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
    // $ANTLR end "aritmetica"



    // $ANTLR start "load"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:42:1: load : (a= 'iconst_m1' |a= 'iconst_0' |a= 'iconst_1' |a= 'iconst_2' |a= 'iconst_3' |a= 'iconst_4' |a= 'iconst_5' |a= 'iload_0' |a= 'iload_1' |a= 'iload_2' |a= 'iload_3' |a= 'iload' INTEIRO |a= 'ldc' INTEIRO |a= 'aload' INTEIRO |a= 'aload_0' |a= 'aload_1' |a= 'aload_2' |a= 'aload_3' );
    public final void load() throws RecognitionException, LabelException {
        Token a=null;
        Token INTEIRO1=null;
        Token INTEIRO2=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:42:6: (a= 'iconst_m1' |a= 'iconst_0' |a= 'iconst_1' |a= 'iconst_2' |a= 'iconst_3' |a= 'iconst_4' |a= 'iconst_5' |a= 'iload_0' |a= 'iload_1' |a= 'iload_2' |a= 'iload_3' |a= 'iload' INTEIRO |a= 'ldc' INTEIRO |a= 'aload' INTEIRO |a= 'aload_0' |a= 'aload_1' |a= 'aload_2' |a= 'aload_3' )
            int alt7=18;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt7=1;
                }
                break;
            case 25:
                {
                alt7=2;
                }
                break;
            case 26:
                {
                alt7=3;
                }
                break;
            case 27:
                {
                alt7=4;
                }
                break;
            case 28:
                {
                alt7=5;
                }
                break;
            case 29:
                {
                alt7=6;
                }
                break;
            case 30:
                {
                alt7=7;
                }
                break;
            case 47:
                {
                alt7=8;
                }
                break;
            case 48:
                {
                alt7=9;
                }
                break;
            case 49:
                {
                alt7=10;
                }
                break;
            case 50:
                {
                alt7=11;
                }
                break;
            case 46:
                {
                alt7=12;
                }
                break;
            case 63:
                {
                alt7=13;
                }
                break;
            case 16:
                {
                alt7=14;
                }
                break;
            case 17:
                {
                alt7=15;
                }
                break;
            case 18:
                {
                alt7=16;
                }
                break;
            case 19:
                {
                alt7=17;
                }
                break;
            case 20:
                {
                alt7=18;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:42:8: a= 'iconst_m1'
                    {
                    a=(Token)match(input,31,FOLLOW_31_in_load481); 

                    escreverOpcode(a);

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:43:8: a= 'iconst_0'
                    {
                    a=(Token)match(input,25,FOLLOW_25_in_load495); 

                    escreverOpcode(a);

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:44:8: a= 'iconst_1'
                    {
                    a=(Token)match(input,26,FOLLOW_26_in_load510); 

                    escreverOpcode(a);

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:45:8: a= 'iconst_2'
                    {
                    a=(Token)match(input,27,FOLLOW_27_in_load525); 

                    escreverOpcode(a);

                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:46:8: a= 'iconst_3'
                    {
                    a=(Token)match(input,28,FOLLOW_28_in_load540); 

                    escreverOpcode(a);

                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:47:8: a= 'iconst_4'
                    {
                    a=(Token)match(input,29,FOLLOW_29_in_load554); 

                    escreverOpcode(a);

                    }
                    break;
                case 7 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:48:8: a= 'iconst_5'
                    {
                    a=(Token)match(input,30,FOLLOW_30_in_load568); 

                    escreverOpcode(a);

                    }
                    break;
                case 8 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:49:8: a= 'iload_0'
                    {
                    a=(Token)match(input,47,FOLLOW_47_in_load582); 

                    escreverOpcode(a);

                    }
                    break;
                case 9 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:50:8: a= 'iload_1'
                    {
                    a=(Token)match(input,48,FOLLOW_48_in_load597); 

                    escreverOpcode(a);

                    }
                    break;
                case 10 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:51:8: a= 'iload_2'
                    {
                    a=(Token)match(input,49,FOLLOW_49_in_load612); 

                    escreverOpcode(a);

                    }
                    break;
                case 11 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:52:8: a= 'iload_3'
                    {
                    a=(Token)match(input,50,FOLLOW_50_in_load627); 

                    escreverOpcode(a);

                    }
                    break;
                case 12 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:53:8: a= 'iload' INTEIRO
                    {
                    a=(Token)match(input,46,FOLLOW_46_in_load642); 

                    INTEIRO1=(Token)match(input,INTEIRO,FOLLOW_INTEIRO_in_load644); 

                    escreverOpcode(a, INTEIRO1);

                    }
                    break;
                case 13 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:54:8: a= 'ldc' INTEIRO
                    {
                    a=(Token)match(input,63,FOLLOW_63_in_load659); 

                    INTEIRO2=(Token)match(input,INTEIRO,FOLLOW_INTEIRO_in_load661); 

                    escreverOpcode(a, INTEIRO2);

                    }
                    break;
                case 14 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:55:8: a= 'aload' INTEIRO
                    {
                    a=(Token)match(input,16,FOLLOW_16_in_load676); 

                    match(input,INTEIRO,FOLLOW_INTEIRO_in_load678); 

                    }
                    break;
                case 15 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:56:8: a= 'aload_0'
                    {
                    a=(Token)match(input,17,FOLLOW_17_in_load691); 

                    }
                    break;
                case 16 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:57:8: a= 'aload_1'
                    {
                    a=(Token)match(input,18,FOLLOW_18_in_load704); 

                    }
                    break;
                case 17 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:58:8: a= 'aload_2'
                    {
                    a=(Token)match(input,19,FOLLOW_19_in_load717); 

                    }
                    break;
                case 18 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:59:8: a= 'aload_3'
                    {
                    a=(Token)match(input,20,FOLLOW_20_in_load730); 

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
    // $ANTLR end "load"



    // $ANTLR start "store"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:62:1: store : (a= 'istore_0' |a= 'istore_1' |a= 'istore_2' |a= 'istore_3' |a= 'istore' INTEIRO );
    public final void store() throws RecognitionException, AcessoIndevidoMemoriaException, LabelException {
        Token a=null;
        Token INTEIRO3=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:62:7: (a= 'istore_0' |a= 'istore_1' |a= 'istore_2' |a= 'istore_3' |a= 'istore' INTEIRO )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt8=1;
                }
                break;
            case 58:
                {
                alt8=2;
                }
                break;
            case 59:
                {
                alt8=3;
                }
                break;
            case 60:
                {
                alt8=4;
                }
                break;
            case 56:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:62:9: a= 'istore_0'
                    {
                    a=(Token)match(input,57,FOLLOW_57_in_store753); 

                    verificarAumentoMemoriaGlobal(a);

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:63:9: a= 'istore_1'
                    {
                    a=(Token)match(input,58,FOLLOW_58_in_store769); 

                    verificarAumentoMemoriaGlobal(a);

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:64:9: a= 'istore_2'
                    {
                    a=(Token)match(input,59,FOLLOW_59_in_store785); 

                    verificarAumentoMemoriaGlobal(a);

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:65:9: a= 'istore_3'
                    {
                    a=(Token)match(input,60,FOLLOW_60_in_store801); 

                    verificarAumentoMemoriaGlobal(a);

                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:66:9: a= 'istore' INTEIRO
                    {
                    a=(Token)match(input,56,FOLLOW_56_in_store817); 

                    INTEIRO3=(Token)match(input,INTEIRO,FOLLOW_INTEIRO_in_store819); 

                    verificarAumentoMemoriaGlobal(a, INTEIRO3);

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
    // $ANTLR end "store"



    // $ANTLR start "logica"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:69:1: logica : (a= 'iand' |a= 'ior' |a= 'ixor' );
    public final void logica() throws RecognitionException {
        Token a=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:69:8: (a= 'iand' |a= 'ior' |a= 'ixor' )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt9=1;
                }
                break;
            case 54:
                {
                alt9=2;
                }
                break;
            case 62:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:69:10: a= 'iand'
                    {
                    a=(Token)match(input,24,FOLLOW_24_in_logica840); 

                    escreverOpcode(a);

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:70:10: a= 'ior'
                    {
                    a=(Token)match(input,54,FOLLOW_54_in_logica857); 

                    escreverOpcode(a);

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:71:10: a= 'ixor'
                    {
                    a=(Token)match(input,62,FOLLOW_62_in_logica874); 

                    escreverOpcode(a);

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
    // $ANTLR end "logica"



    // $ANTLR start "desvio"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:74:1: desvio : (a= 'ifeq' b= ID |a= 'ifne' b= ID |a= 'iflt' b= ID |a= 'ifge' b= ID |a= 'ifgt' b= ID |a= 'ifle' b= ID |a= 'if_icmpeq' b= ID |a= 'if_icmpne' b= ID |a= 'if_icmplt' b= ID |a= 'if_icmpge' b= ID |a= 'if_icmpgt' b= ID |a= 'if_icmple' b= ID |a= 'goto' b= ID );
    public final void desvio() throws RecognitionException, LabelException {
        Token a=null;
        Token b=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:74:8: (a= 'ifeq' b= ID |a= 'ifne' b= ID |a= 'iflt' b= ID |a= 'ifge' b= ID |a= 'ifgt' b= ID |a= 'ifle' b= ID |a= 'if_icmpeq' b= ID |a= 'if_icmpne' b= ID |a= 'if_icmplt' b= ID |a= 'if_icmpge' b= ID |a= 'if_icmpgt' b= ID |a= 'if_icmple' b= ID |a= 'goto' b= ID )
            int alt10=13;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt10=1;
                }
                break;
            case 44:
                {
                alt10=2;
                }
                break;
            case 43:
                {
                alt10=3;
                }
                break;
            case 40:
                {
                alt10=4;
                }
                break;
            case 41:
                {
                alt10=5;
                }
                break;
            case 42:
                {
                alt10=6;
                }
                break;
            case 33:
                {
                alt10=7;
                }
                break;
            case 38:
                {
                alt10=8;
                }
                break;
            case 37:
                {
                alt10=9;
                }
                break;
            case 34:
                {
                alt10=10;
                }
                break;
            case 35:
                {
                alt10=11;
                }
                break;
            case 36:
                {
                alt10=12;
                }
                break;
            case 22:
                {
                alt10=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:74:10: a= 'ifeq' b= ID
                    {
                    a=(Token)match(input,39,FOLLOW_39_in_desvio896); 

                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio902); 

                    escreverOpcode(a, b);

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:75:10: a= 'ifne' b= ID
                    {
                    a=(Token)match(input,44,FOLLOW_44_in_desvio919); 

                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio925); 

                    escreverOpcode(a, b);

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:76:10: a= 'iflt' b= ID
                    {
                    a=(Token)match(input,43,FOLLOW_43_in_desvio942); 

                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio948); 

                    escreverOpcode(a, b);

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:77:10: a= 'ifge' b= ID
                    {
                    a=(Token)match(input,40,FOLLOW_40_in_desvio965); 

                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio971); 

                    escreverOpcode(a, b);

                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:78:10: a= 'ifgt' b= ID
                    {
                    a=(Token)match(input,41,FOLLOW_41_in_desvio988); 

                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio994); 

                    escreverOpcode(a, b);

                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:79:10: a= 'ifle' b= ID
                    {
                    a=(Token)match(input,42,FOLLOW_42_in_desvio1011); 

                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio1017); 

                    escreverOpcode(a, b);

                    }
                    break;
                case 7 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:80:10: a= 'if_icmpeq' b= ID
                    {
                    a=(Token)match(input,33,FOLLOW_33_in_desvio1034); 

                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio1040); 

                    escreverOpcode(a, b);

                    }
                    break;
                case 8 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:81:10: a= 'if_icmpne' b= ID
                    {
                    a=(Token)match(input,38,FOLLOW_38_in_desvio1057); 

                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio1063); 

                    escreverOpcode(a, b);

                    }
                    break;
                case 9 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:82:10: a= 'if_icmplt' b= ID
                    {
                    a=(Token)match(input,37,FOLLOW_37_in_desvio1080); 

                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio1086); 

                    escreverOpcode(a, b);

                    }
                    break;
                case 10 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:83:10: a= 'if_icmpge' b= ID
                    {
                    a=(Token)match(input,34,FOLLOW_34_in_desvio1103); 

                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio1109); 

                    escreverOpcode(a, b);

                    }
                    break;
                case 11 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:84:10: a= 'if_icmpgt' b= ID
                    {
                    a=(Token)match(input,35,FOLLOW_35_in_desvio1126); 

                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio1132); 

                    escreverOpcode(a, b);

                    }
                    break;
                case 12 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:85:10: a= 'if_icmple' b= ID
                    {
                    a=(Token)match(input,36,FOLLOW_36_in_desvio1149); 

                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio1155); 

                    escreverOpcode(a, b);

                    }
                    break;
                case 13 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:86:10: a= 'goto' b= ID
                    {
                    a=(Token)match(input,22,FOLLOW_22_in_desvio1172); 

                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio1178); 

                    escreverOpcode(a, b);

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
    // $ANTLR end "desvio"

    // Delegated rules


 

    public static final BitSet FOLLOW_comando_in_programa16 = new BitSet(new long[]{0xFFFFFFFFFFFF0112L,0x000000000000000FL});
    public static final BitSet FOLLOW_label_in_comando36 = new BitSet(new long[]{0xFFFFFFFFFFFF0100L,0x000000000000000FL});
    public static final BitSet FOLLOW_instrucao_in_comando38 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instrucao_in_comando42 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_label64 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_label66 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_manipulacaoObjetos_in_instrucao76 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_aritmetica_in_instrucao80 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_load_in_instrucao84 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_store_in_instrucao88 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_desvio_in_instrucao92 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_logica_in_instrucao96 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_64_in_instrucao119 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_65_in_instrucao141 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_66_in_instrucao165 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_NOVA_LINHA_in_instrucao185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_manipulacaoObjetos193 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_manipulacaoObjetos195 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_manipulacaoObjetos197 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_manipulacaoObjetos199 = new BitSet(new long[]{0x0000000000008440L});
    public static final BitSet FOLLOW_tipo_in_manipulacaoObjetos201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_manipulacaoObjetos224 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_manipulacaoObjetos226 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_manipulacaoObjetos228 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_manipulacaoObjetos230 = new BitSet(new long[]{0x0000000000008440L});
    public static final BitSet FOLLOW_tipo_in_manipulacaoObjetos232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_manipulacaoObjetos255 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_manipulacaoObjetos257 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_manipulacaoObjetos259 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INIT_in_manipulacaoObjetos261 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_manipulacaoObjetos263 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_VOID_in_manipulacaoObjetos265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_tipo296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_tipo300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_tipo304 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_tipo305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_aritmetica318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_aritmetica339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_aritmetica360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_aritmetica381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_aritmetica402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_aritmetica423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_aritmetica444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_load481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_load495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_load510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_load525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_load540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_load554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_load568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_load582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_load597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_load612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_load627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_load642 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_INTEIRO_in_load644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_load659 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_INTEIRO_in_load661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_load676 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_INTEIRO_in_load678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_load691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_load704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_load717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_load730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_store753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_store769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_store785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_store801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_store817 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_INTEIRO_in_store819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_logica840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_logica857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_logica874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_desvio896 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_desvio919 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_desvio942 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_desvio965 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_desvio988 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_desvio1011 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_desvio1034 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_desvio1057 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_desvio1080 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_desvio1103 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio1109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_desvio1126 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_desvio1149 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_desvio1172 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio1178 = new BitSet(new long[]{0x0000000000000002L});

}