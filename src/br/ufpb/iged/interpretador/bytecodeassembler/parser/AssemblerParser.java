// $ANTLR 3.4 C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g 2012-04-10 18:30:49

package br.ufpb.iged.interpretador.bytecodeassembler.parser;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class AssemblerParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "INT", "NOME_REF", "NOVA_LINHA", "NULL", "TYPE_STRUCT", "WS", "':'", "'ADD'", "'CREATE_INT'", "'CREATE_NODE'", "'CREATE_REF'", "'DELETE_INT'", "'DELETE_NODE'", "'DELETE_REF'", "'DIV'", "'INIT'", "'JMP'", "'MULT'", "'READ_INFO'", "'READ_INT'", "'READ_INTC'", "'READ_REF'", "'READ_RN'", "'READ_VET'", "'SUB'", "'WRITE_INFO'", "'WRITE_INT'", "'WRITE_REF'", "'WRITE_RN'", "'WRITE_VET'"
    };

    public static final int EOF=-1;
    public static final int T__11=11;
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
    public static final int ID=4;
    public static final int INT=5;
    public static final int NOME_REF=6;
    public static final int NOVA_LINHA=7;
    public static final int NULL=8;
    public static final int TYPE_STRUCT=9;
    public static final int WS=10;

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
    public String getGrammarFileName() { return "C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g"; }



    // $ANTLR start "programa"
    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:3:1: programa : ( comando )* ;
    public final void programa() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:3:10: ( ( comando )* )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:3:12: ( comando )*
            {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:3:12: ( comando )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID||LA1_0==NOVA_LINHA||(LA1_0 >= 12 && LA1_0 <= 34)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:3:12: comando
            	    {
            	    pushFollow(FOLLOW_comando_in_programa10);
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
    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:6:1: comando : ( label instrucao | instrucao ) ;
    public final void comando() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:6:9: ( ( label instrucao | instrucao ) )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:6:11: ( label instrucao | instrucao )
            {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:6:11: ( label instrucao | instrucao )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==NOVA_LINHA||(LA2_0 >= 12 && LA2_0 <= 34)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:6:12: label instrucao
                    {
                    pushFollow(FOLLOW_label_in_comando30);
                    label();

                    state._fsp--;


                    pushFollow(FOLLOW_instrucao_in_comando32);
                    instrucao();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:6:30: instrucao
                    {
                    pushFollow(FOLLOW_instrucao_in_comando36);
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
    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:8:1: label : ID ':' ;
    public final void label() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:8:7: ( ID ':' )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:8:9: ID ':'
            {
            match(input,ID,FOLLOW_ID_in_label54); 

            match(input,11,FOLLOW_11_in_label56); 

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
    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:10:1: instrucao : ( aritmetica | manipulacao | desvio )? NOVA_LINHA ;
    public final void instrucao() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:10:10: ( ( aritmetica | manipulacao | desvio )? NOVA_LINHA )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:10:12: ( aritmetica | manipulacao | desvio )? NOVA_LINHA
            {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:10:12: ( aritmetica | manipulacao | desvio )?
            int alt3=4;
            switch ( input.LA(1) ) {
                case 12:
                case 19:
                case 22:
                case 29:
                    {
                    alt3=1;
                    }
                    break;
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 20:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                    {
                    alt3=2;
                    }
                    break;
                case 21:
                    {
                    alt3=3;
                    }
                    break;
            }

            switch (alt3) {
                case 1 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:10:13: aritmetica
                    {
                    pushFollow(FOLLOW_aritmetica_in_instrucao64);
                    aritmetica();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:10:26: manipulacao
                    {
                    pushFollow(FOLLOW_manipulacao_in_instrucao68);
                    manipulacao();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:10:40: desvio
                    {
                    pushFollow(FOLLOW_desvio_in_instrucao72);
                    desvio();

                    state._fsp--;


                    }
                    break;

            }


            match(input,NOVA_LINHA,FOLLOW_NOVA_LINHA_in_instrucao76); 

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



    // $ANTLR start "aritmetica"
    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:12:1: aritmetica : ( 'ADD' | 'SUB' | 'MULT' | 'DIV' );
    public final void aritmetica() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:12:12: ( 'ADD' | 'SUB' | 'MULT' | 'DIV' )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:
            {
            if ( input.LA(1)==12||input.LA(1)==19||input.LA(1)==22||input.LA(1)==29 ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
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
        return ;
    }
    // $ANTLR end "aritmetica"



    // $ANTLR start "manipulacao"
    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:18:1: manipulacao : ( iniciar | criar | ler | escrever | deletar ) ;
    public final void manipulacao() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:18:12: ( ( iniciar | criar | ler | escrever | deletar ) )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:18:14: ( iniciar | criar | ler | escrever | deletar )
            {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:18:14: ( iniciar | criar | ler | escrever | deletar )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt4=1;
                }
                break;
            case 13:
            case 14:
            case 15:
                {
                alt4=2;
                }
                break;
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
                {
                alt4=3;
                }
                break;
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
                {
                alt4=4;
                }
                break;
            case 16:
            case 17:
            case 18:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }

            switch (alt4) {
                case 1 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:18:15: iniciar
                    {
                    pushFollow(FOLLOW_iniciar_in_manipulacao155);
                    iniciar();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:18:25: criar
                    {
                    pushFollow(FOLLOW_criar_in_manipulacao159);
                    criar();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:18:33: ler
                    {
                    pushFollow(FOLLOW_ler_in_manipulacao163);
                    ler();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:18:39: escrever
                    {
                    pushFollow(FOLLOW_escrever_in_manipulacao167);
                    escrever();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:18:50: deletar
                    {
                    pushFollow(FOLLOW_deletar_in_manipulacao171);
                    deletar();

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
    // $ANTLR end "manipulacao"



    // $ANTLR start "desvio"
    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:20:1: desvio : 'JMP' ID ;
    public final void desvio() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:20:8: ( 'JMP' ID )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:20:10: 'JMP' ID
            {
            match(input,21,FOLLOW_21_in_desvio180); 

            match(input,ID,FOLLOW_ID_in_desvio182); 

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



    // $ANTLR start "iniciar"
    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:22:1: iniciar : 'INIT' TYPE_STRUCT ID ( INT )? ;
    public final void iniciar() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:22:8: ( 'INIT' TYPE_STRUCT ID ( INT )? )
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:22:10: 'INIT' TYPE_STRUCT ID ( INT )?
            {
            match(input,20,FOLLOW_20_in_iniciar191); 

            match(input,TYPE_STRUCT,FOLLOW_TYPE_STRUCT_in_iniciar193); 

            match(input,ID,FOLLOW_ID_in_iniciar195); 

            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:22:32: ( INT )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==INT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:22:32: INT
                    {
                    match(input,INT,FOLLOW_INT_in_iniciar197); 

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
    // $ANTLR end "iniciar"



    // $ANTLR start "criar"
    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:24:1: criar : ( 'CREATE_INT' ID | 'CREATE_NODE' TYPE_STRUCT | 'CREATE_REF' ID );
    public final void criar() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:24:7: ( 'CREATE_INT' ID | 'CREATE_NODE' TYPE_STRUCT | 'CREATE_REF' ID )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt6=1;
                }
                break;
            case 14:
                {
                alt6=2;
                }
                break;
            case 15:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:24:9: 'CREATE_INT' ID
                    {
                    match(input,13,FOLLOW_13_in_criar214); 

                    match(input,ID,FOLLOW_ID_in_criar216); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:25:9: 'CREATE_NODE' TYPE_STRUCT
                    {
                    match(input,14,FOLLOW_14_in_criar226); 

                    match(input,TYPE_STRUCT,FOLLOW_TYPE_STRUCT_in_criar228); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:26:9: 'CREATE_REF' ID
                    {
                    match(input,15,FOLLOW_15_in_criar238); 

                    match(input,ID,FOLLOW_ID_in_criar240); 

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
    // $ANTLR end "criar"



    // $ANTLR start "ler"
    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:29:1: ler : ( 'READ_INT' ID | 'READ_INTC' INT | 'READ_VET' ID | 'READ_RN' ID NOME_REF | 'READ_INFO' ID | 'READ_REF' ID );
    public final void ler() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:29:5: ( 'READ_INT' ID | 'READ_INTC' INT | 'READ_VET' ID | 'READ_RN' ID NOME_REF | 'READ_INFO' ID | 'READ_REF' ID )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt7=1;
                }
                break;
            case 25:
                {
                alt7=2;
                }
                break;
            case 28:
                {
                alt7=3;
                }
                break;
            case 27:
                {
                alt7=4;
                }
                break;
            case 23:
                {
                alt7=5;
                }
                break;
            case 26:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:29:7: 'READ_INT' ID
                    {
                    match(input,24,FOLLOW_24_in_ler255); 

                    match(input,ID,FOLLOW_ID_in_ler257); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:30:7: 'READ_INTC' INT
                    {
                    match(input,25,FOLLOW_25_in_ler265); 

                    match(input,INT,FOLLOW_INT_in_ler267); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:31:7: 'READ_VET' ID
                    {
                    match(input,28,FOLLOW_28_in_ler275); 

                    match(input,ID,FOLLOW_ID_in_ler277); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:32:7: 'READ_RN' ID NOME_REF
                    {
                    match(input,27,FOLLOW_27_in_ler285); 

                    match(input,ID,FOLLOW_ID_in_ler287); 

                    match(input,NOME_REF,FOLLOW_NOME_REF_in_ler289); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:33:7: 'READ_INFO' ID
                    {
                    match(input,23,FOLLOW_23_in_ler297); 

                    match(input,ID,FOLLOW_ID_in_ler299); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:34:7: 'READ_REF' ID
                    {
                    match(input,26,FOLLOW_26_in_ler307); 

                    match(input,ID,FOLLOW_ID_in_ler309); 

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
    // $ANTLR end "ler"



    // $ANTLR start "escrever"
    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:37:1: escrever : ( 'WRITE_INT' ID | 'WRITE_VET' ID | 'WRITE_RN' ID NOME_REF ( NULL )? | 'WRITE_INFO' ID | 'WRITE_REF' ID ( NULL )? );
    public final void escrever() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:37:10: ( 'WRITE_INT' ID | 'WRITE_VET' ID | 'WRITE_RN' ID NOME_REF ( NULL )? | 'WRITE_INFO' ID | 'WRITE_REF' ID ( NULL )? )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt10=1;
                }
                break;
            case 34:
                {
                alt10=2;
                }
                break;
            case 33:
                {
                alt10=3;
                }
                break;
            case 30:
                {
                alt10=4;
                }
                break;
            case 32:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:37:12: 'WRITE_INT' ID
                    {
                    match(input,31,FOLLOW_31_in_escrever322); 

                    match(input,ID,FOLLOW_ID_in_escrever324); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:38:12: 'WRITE_VET' ID
                    {
                    match(input,34,FOLLOW_34_in_escrever337); 

                    match(input,ID,FOLLOW_ID_in_escrever339); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:39:12: 'WRITE_RN' ID NOME_REF ( NULL )?
                    {
                    match(input,33,FOLLOW_33_in_escrever352); 

                    match(input,ID,FOLLOW_ID_in_escrever354); 

                    match(input,NOME_REF,FOLLOW_NOME_REF_in_escrever356); 

                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:39:35: ( NULL )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==NULL) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:39:35: NULL
                            {
                            match(input,NULL,FOLLOW_NULL_in_escrever358); 

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:40:12: 'WRITE_INFO' ID
                    {
                    match(input,30,FOLLOW_30_in_escrever372); 

                    match(input,ID,FOLLOW_ID_in_escrever374); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:41:12: 'WRITE_REF' ID ( NULL )?
                    {
                    match(input,32,FOLLOW_32_in_escrever387); 

                    match(input,ID,FOLLOW_ID_in_escrever389); 

                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:41:27: ( NULL )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==NULL) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:41:27: NULL
                            {
                            match(input,NULL,FOLLOW_NULL_in_escrever391); 

                            }
                            break;

                    }


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
    // $ANTLR end "escrever"



    // $ANTLR start "deletar"
    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:44:1: deletar : ( 'DELETE_INT' ID | 'DELETE_NODE' ID | 'DELETE_REF' ID );
    public final void deletar() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:44:9: ( 'DELETE_INT' ID | 'DELETE_NODE' ID | 'DELETE_REF' ID )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt11=1;
                }
                break;
            case 17:
                {
                alt11=2;
                }
                break;
            case 18:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }

            switch (alt11) {
                case 1 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:44:11: 'DELETE_INT' ID
                    {
                    match(input,16,FOLLOW_16_in_deletar410); 

                    match(input,ID,FOLLOW_ID_in_deletar412); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:45:11: 'DELETE_NODE' ID
                    {
                    match(input,17,FOLLOW_17_in_deletar424); 

                    match(input,ID,FOLLOW_ID_in_deletar426); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\.ssh\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\bytecodeassembler\\grammars\\Assembler.g:46:11: 'DELETE_REF' ID
                    {
                    match(input,18,FOLLOW_18_in_deletar438); 

                    match(input,ID,FOLLOW_ID_in_deletar440); 

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
    // $ANTLR end "deletar"

    // Delegated rules


 

    public static final BitSet FOLLOW_comando_in_programa10 = new BitSet(new long[]{0x00000007FFFFF092L});
    public static final BitSet FOLLOW_label_in_comando30 = new BitSet(new long[]{0x00000007FFFFF080L});
    public static final BitSet FOLLOW_instrucao_in_comando32 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instrucao_in_comando36 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_label54 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_label56 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aritmetica_in_instrucao64 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_manipulacao_in_instrucao68 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_desvio_in_instrucao72 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_NOVA_LINHA_in_instrucao76 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_iniciar_in_manipulacao155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_criar_in_manipulacao159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ler_in_manipulacao163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_escrever_in_manipulacao167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_deletar_in_manipulacao171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_desvio180 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_desvio182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_iniciar191 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TYPE_STRUCT_in_iniciar193 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_iniciar195 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_INT_in_iniciar197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_criar214 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_criar216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_criar226 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_TYPE_STRUCT_in_criar228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_criar238 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_criar240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ler255 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_ler257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ler265 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_INT_in_ler267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ler275 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_ler277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ler285 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_ler287 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NOME_REF_in_ler289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ler297 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_ler299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ler307 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_ler309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_escrever322 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_escrever324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_escrever337 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_escrever339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_escrever352 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_escrever354 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NOME_REF_in_escrever356 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_NULL_in_escrever358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_escrever372 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_escrever374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_escrever387 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_escrever389 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_NULL_in_escrever391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_deletar410 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_deletar412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_deletar424 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_deletar426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_deletar438 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_deletar440 = new BitSet(new long[]{0x0000000000000002L});

}