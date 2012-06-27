// $ANTLR 3.4 C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g 2012-06-27 02:11:16

package br.ufpb.iged.interpretador.bytecodeassembler.parser;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;

import br.ufpb.iged.interpretador.excecoes.AcessoIndevidoMemoriaException;
import br.ufpb.iged.interpretador.excecoes.LabelException;
import br.ufpb.iged.interpretador.symboltable.classes.BytecodesAST;


@SuppressWarnings({"all", "warnings", "unchecked"})
public abstract class AssemblerParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CLASSE", "EXTENDS", "FIELD_DECL", "ID", "INIT", "INT", "INTEIRO", "MEMBRO_CLASSE", "NOVA_LINHA", "NULL", "VOID", "WS", "'()'", "'.class'", "'.field'", "'.method'", "'.super'", "'/'", "':'", "'L'", "'aload'", "'aload_0'", "'aload_1'", "'aload_2'", "'aload_3'", "'getfield'", "'goto'", "'iadd'", "'iand'", "'iconst_0'", "'iconst_1'", "'iconst_2'", "'iconst_3'", "'iconst_4'", "'iconst_5'", "'iconst_m1'", "'idiv'", "'if_icmpeq'", "'if_icmpge'", "'if_icmpgt'", "'if_icmple'", "'if_icmplt'", "'if_icmpne'", "'ifeq'", "'ifge'", "'ifgt'", "'ifle'", "'iflt'", "'ifne'", "'iinc'", "'iload'", "'iload_0'", "'iload_1'", "'iload_2'", "'iload_3'", "'imul'", "'ineg'", "'invokespecial'", "'ior'", "'irem'", "'istore'", "'istore_0'", "'istore_1'", "'istore_2'", "'istore_3'", "'isub'", "'ixor'", "'ldc'", "'nop'", "'pop'", "'pop2'", "'putfield'"
    };

    public static final int EOF=-1;
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
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int CLASSE=4;
    public static final int EXTENDS=5;
    public static final int FIELD_DECL=6;
    public static final int ID=7;
    public static final int INIT=8;
    public static final int INT=9;
    public static final int INTEIRO=10;
    public static final int MEMBRO_CLASSE=11;
    public static final int NOVA_LINHA=12;
    public static final int NULL=13;
    public static final int VOID=14;
    public static final int WS=15;

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
    public String getGrammarFileName() { return "C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g"; }



      protected abstract void escreverOpcode(Token opc);
      protected abstract void escreverOpcode(Token opc, Token op) throws LabelException;
      protected abstract void verificarAumentoMemoriaGlobal(Token opc) throws AcessoIndevidoMemoriaException;
      protected abstract void verificarAumentoMemoriaGlobal(Token opc, Token op) throws AcessoIndevidoMemoriaException, LabelException;
      protected abstract void definirLabel(Token id) throws LabelException;
      


    public static class programa_return extends ParserRuleReturnScope {
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "programa"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:25:1: programa : ( comando )* ;
    public final AssemblerParser.programa_return programa() throws RecognitionException, LabelException, AcessoIndevidoMemoriaException {
        AssemblerParser.programa_return retval = new AssemblerParser.programa_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        AssemblerParser.comando_return comando1 =null;



        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:25:10: ( ( comando )* )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:25:12: ( comando )*
            {
            root_0 = (BytecodesAST)adaptor.nil();


            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:25:12: ( comando )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID||LA1_0==NOVA_LINHA||LA1_0==17||LA1_0==19||(LA1_0 >= 24 && LA1_0 <= 75)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:25:12: comando
            	    {
            	    pushFollow(FOLLOW_comando_in_programa64);
            	    comando1=comando();

            	    state._fsp--;

            	    adaptor.addChild(root_0, comando1.getTree());

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


    public static class comando_return extends ParserRuleReturnScope {
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "comando"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:28:1: comando : ( label instrucao | instrucao ) ;
    public final AssemblerParser.comando_return comando() throws RecognitionException, LabelException, AcessoIndevidoMemoriaException {
        AssemblerParser.comando_return retval = new AssemblerParser.comando_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        AssemblerParser.label_return label2 =null;

        AssemblerParser.instrucao_return instrucao3 =null;

        AssemblerParser.instrucao_return instrucao4 =null;



        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:28:9: ( ( label instrucao | instrucao ) )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:28:11: ( label instrucao | instrucao )
            {
            root_0 = (BytecodesAST)adaptor.nil();


            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:28:11: ( label instrucao | instrucao )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==NOVA_LINHA||LA2_0==17||LA2_0==19||(LA2_0 >= 24 && LA2_0 <= 75)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:28:12: label instrucao
                    {
                    pushFollow(FOLLOW_label_in_comando84);
                    label2=label();

                    state._fsp--;

                    adaptor.addChild(root_0, label2.getTree());

                    pushFollow(FOLLOW_instrucao_in_comando86);
                    instrucao3=instrucao();

                    state._fsp--;

                    adaptor.addChild(root_0, instrucao3.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:28:30: instrucao
                    {
                    pushFollow(FOLLOW_instrucao_in_comando90);
                    instrucao4=instrucao();

                    state._fsp--;

                    adaptor.addChild(root_0, instrucao4.getTree());

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
    // $ANTLR end "comando"


    public static class label_return extends ParserRuleReturnScope {
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "label"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:30:1: label : a= ID ':' ;
    public final AssemblerParser.label_return label() throws RecognitionException, LabelException {
        AssemblerParser.label_return retval = new AssemblerParser.label_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;
        Token char_literal5=null;

        BytecodesAST a_tree=null;
        BytecodesAST char_literal5_tree=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:30:7: (a= ID ':' )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:30:9: a= ID ':'
            {
            root_0 = (BytecodesAST)adaptor.nil();


            a=(Token)match(input,ID,FOLLOW_ID_in_label112); 
            a_tree = 
            (BytecodesAST)adaptor.create(a)
            ;
            adaptor.addChild(root_0, a_tree);


            char_literal5=(Token)match(input,22,FOLLOW_22_in_label114); 
            char_literal5_tree = 
            (BytecodesAST)adaptor.create(char_literal5)
            ;
            adaptor.addChild(root_0, char_literal5_tree);


            definirLabel(a);

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


    public static class instrucao_return extends ParserRuleReturnScope {
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instrucao"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:32:1: instrucao : ( definicaoClasse | manipulacaoObjetos | aritmetica | load | store | desvio | logica | 'nop' |a= 'pop' |a= 'pop2' )? NOVA_LINHA ;
    public final AssemblerParser.instrucao_return instrucao() throws RecognitionException, LabelException, AcessoIndevidoMemoriaException {
        AssemblerParser.instrucao_return retval = new AssemblerParser.instrucao_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;
        Token string_literal13=null;
        Token NOVA_LINHA14=null;
        AssemblerParser.definicaoClasse_return definicaoClasse6 =null;

        AssemblerParser.manipulacaoObjetos_return manipulacaoObjetos7 =null;

        AssemblerParser.aritmetica_return aritmetica8 =null;

        AssemblerParser.load_return load9 =null;

        AssemblerParser.store_return store10 =null;

        AssemblerParser.desvio_return desvio11 =null;

        AssemblerParser.logica_return logica12 =null;


        BytecodesAST a_tree=null;
        BytecodesAST string_literal13_tree=null;
        BytecodesAST NOVA_LINHA14_tree=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:32:10: ( ( definicaoClasse | manipulacaoObjetos | aritmetica | load | store | desvio | logica | 'nop' |a= 'pop' |a= 'pop2' )? NOVA_LINHA )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:32:12: ( definicaoClasse | manipulacaoObjetos | aritmetica | load | store | desvio | logica | 'nop' |a= 'pop' |a= 'pop2' )? NOVA_LINHA
            {
            root_0 = (BytecodesAST)adaptor.nil();


            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:32:12: ( definicaoClasse | manipulacaoObjetos | aritmetica | load | store | desvio | logica | 'nop' |a= 'pop' |a= 'pop2' )?
            int alt3=11;
            switch ( input.LA(1) ) {
                case 17:
                case 19:
                    {
                    alt3=1;
                    }
                    break;
                case 29:
                case 61:
                case 75:
                    {
                    alt3=2;
                    }
                    break;
                case 31:
                case 40:
                case 53:
                case 59:
                case 60:
                case 63:
                case 69:
                    {
                    alt3=3;
                    }
                    break;
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 71:
                    {
                    alt3=4;
                    }
                    break;
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    {
                    alt3=5;
                    }
                    break;
                case 30:
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
                    {
                    alt3=6;
                    }
                    break;
                case 32:
                case 62:
                case 70:
                    {
                    alt3=7;
                    }
                    break;
                case 72:
                    {
                    alt3=8;
                    }
                    break;
                case 73:
                    {
                    alt3=9;
                    }
                    break;
                case 74:
                    {
                    alt3=10;
                    }
                    break;
            }

            switch (alt3) {
                case 1 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:32:13: definicaoClasse
                    {
                    pushFollow(FOLLOW_definicaoClasse_in_instrucao124);
                    definicaoClasse6=definicaoClasse();

                    state._fsp--;

                    adaptor.addChild(root_0, definicaoClasse6.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:32:31: manipulacaoObjetos
                    {
                    pushFollow(FOLLOW_manipulacaoObjetos_in_instrucao128);
                    manipulacaoObjetos7=manipulacaoObjetos();

                    state._fsp--;

                    adaptor.addChild(root_0, manipulacaoObjetos7.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:32:52: aritmetica
                    {
                    pushFollow(FOLLOW_aritmetica_in_instrucao132);
                    aritmetica8=aritmetica();

                    state._fsp--;

                    adaptor.addChild(root_0, aritmetica8.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:32:65: load
                    {
                    pushFollow(FOLLOW_load_in_instrucao136);
                    load9=load();

                    state._fsp--;

                    adaptor.addChild(root_0, load9.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:32:72: store
                    {
                    pushFollow(FOLLOW_store_in_instrucao140);
                    store10=store();

                    state._fsp--;

                    adaptor.addChild(root_0, store10.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:32:80: desvio
                    {
                    pushFollow(FOLLOW_desvio_in_instrucao144);
                    desvio11=desvio();

                    state._fsp--;

                    adaptor.addChild(root_0, desvio11.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:32:89: logica
                    {
                    pushFollow(FOLLOW_logica_in_instrucao148);
                    logica12=logica();

                    state._fsp--;

                    adaptor.addChild(root_0, logica12.getTree());

                    }
                    break;
                case 8 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:33:21: 'nop'
                    {
                    string_literal13=(Token)match(input,72,FOLLOW_72_in_instrucao171); 
                    string_literal13_tree = 
                    (BytecodesAST)adaptor.create(string_literal13)
                    ;
                    adaptor.addChild(root_0, string_literal13_tree);


                    }
                    break;
                case 9 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:34:17: a= 'pop'
                    {
                    a=(Token)match(input,73,FOLLOW_73_in_instrucao193); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    escreverOpcode(a);

                    }
                    break;
                case 10 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:35:17: a= 'pop2'
                    {
                    a=(Token)match(input,74,FOLLOW_74_in_instrucao217); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    escreverOpcode(a);

                    }
                    break;

            }


            NOVA_LINHA14=(Token)match(input,NOVA_LINHA,FOLLOW_NOVA_LINHA_in_instrucao237); 
            NOVA_LINHA14_tree = 
            (BytecodesAST)adaptor.create(NOVA_LINHA14)
            ;
            adaptor.addChild(root_0, NOVA_LINHA14_tree);


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


    public static class definicaoClasse_return extends ParserRuleReturnScope {
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "definicaoClasse"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:38:1: definicaoClasse : ( '.class' ID NOVA_LINHA ( superClasse )? ( membroClasse )+ -> ^( CLASSE ID ( superClasse )? ^( MEMBRO_CLASSE ( membroClasse )+ ) ) | '.method' construtorDefault );
    public final AssemblerParser.definicaoClasse_return definicaoClasse() throws RecognitionException {
        AssemblerParser.definicaoClasse_return retval = new AssemblerParser.definicaoClasse_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token string_literal15=null;
        Token ID16=null;
        Token NOVA_LINHA17=null;
        Token string_literal20=null;
        AssemblerParser.superClasse_return superClasse18 =null;

        AssemblerParser.membroClasse_return membroClasse19 =null;

        AssemblerParser.construtorDefault_return construtorDefault21 =null;


        BytecodesAST string_literal15_tree=null;
        BytecodesAST ID16_tree=null;
        BytecodesAST NOVA_LINHA17_tree=null;
        BytecodesAST string_literal20_tree=null;
        RewriteRuleTokenStream stream_NOVA_LINHA=new RewriteRuleTokenStream(adaptor,"token NOVA_LINHA");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
        RewriteRuleSubtreeStream stream_membroClasse=new RewriteRuleSubtreeStream(adaptor,"rule membroClasse");
        RewriteRuleSubtreeStream stream_superClasse=new RewriteRuleSubtreeStream(adaptor,"rule superClasse");
        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:38:17: ( '.class' ID NOVA_LINHA ( superClasse )? ( membroClasse )+ -> ^( CLASSE ID ( superClasse )? ^( MEMBRO_CLASSE ( membroClasse )+ ) ) | '.method' construtorDefault )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            else if ( (LA6_0==19) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:38:19: '.class' ID NOVA_LINHA ( superClasse )? ( membroClasse )+
                    {
                    string_literal15=(Token)match(input,17,FOLLOW_17_in_definicaoClasse259);  
                    stream_17.add(string_literal15);


                    ID16=(Token)match(input,ID,FOLLOW_ID_in_definicaoClasse261);  
                    stream_ID.add(ID16);


                    NOVA_LINHA17=(Token)match(input,NOVA_LINHA,FOLLOW_NOVA_LINHA_in_definicaoClasse263);  
                    stream_NOVA_LINHA.add(NOVA_LINHA17);


                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:38:42: ( superClasse )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==20) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:38:42: superClasse
                            {
                            pushFollow(FOLLOW_superClasse_in_definicaoClasse265);
                            superClasse18=superClasse();

                            state._fsp--;

                            stream_superClasse.add(superClasse18.getTree());

                            }
                            break;

                    }


                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:38:55: ( membroClasse )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==18) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:38:55: membroClasse
                    	    {
                    	    pushFollow(FOLLOW_membroClasse_in_definicaoClasse268);
                    	    membroClasse19=membroClasse();

                    	    state._fsp--;

                    	    stream_membroClasse.add(membroClasse19.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    // AST REWRITE
                    // elements: superClasse, ID, membroClasse
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BytecodesAST)adaptor.nil();
                    // 39:19: -> ^( CLASSE ID ( superClasse )? ^( MEMBRO_CLASSE ( membroClasse )+ ) )
                    {
                        // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:39:22: ^( CLASSE ID ( superClasse )? ^( MEMBRO_CLASSE ( membroClasse )+ ) )
                        {
                        BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                        root_1 = (BytecodesAST)adaptor.becomeRoot(
                        (BytecodesAST)adaptor.create(CLASSE, "CLASSE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:39:34: ( superClasse )?
                        if ( stream_superClasse.hasNext() ) {
                            adaptor.addChild(root_1, stream_superClasse.nextTree());

                        }
                        stream_superClasse.reset();

                        // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:39:47: ^( MEMBRO_CLASSE ( membroClasse )+ )
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
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:40:19: '.method' construtorDefault
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    string_literal20=(Token)match(input,19,FOLLOW_19_in_definicaoClasse327); 
                    string_literal20_tree = 
                    (BytecodesAST)adaptor.create(string_literal20)
                    ;
                    adaptor.addChild(root_0, string_literal20_tree);


                    pushFollow(FOLLOW_construtorDefault_in_definicaoClasse329);
                    construtorDefault21=construtorDefault();

                    state._fsp--;

                    adaptor.addChild(root_0, construtorDefault21.getTree());

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
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:43:1: superClasse : '.super' ID -> ^( EXTENDS ID ) ;
    public final AssemblerParser.superClasse_return superClasse() throws RecognitionException {
        AssemblerParser.superClasse_return retval = new AssemblerParser.superClasse_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token string_literal22=null;
        Token ID23=null;

        BytecodesAST string_literal22_tree=null;
        BytecodesAST ID23_tree=null;
        RewriteRuleTokenStream stream_20=new RewriteRuleTokenStream(adaptor,"token 20");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:43:13: ( '.super' ID -> ^( EXTENDS ID ) )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:43:15: '.super' ID
            {
            string_literal22=(Token)match(input,20,FOLLOW_20_in_superClasse370);  
            stream_20.add(string_literal22);


            ID23=(Token)match(input,ID,FOLLOW_ID_in_superClasse372);  
            stream_ID.add(ID23);


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
            // 43:27: -> ^( EXTENDS ID )
            {
                // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:43:30: ^( EXTENDS ID )
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
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:45:1: membroClasse : '.field' ID tipo -> ^( FIELD_DECL ID tipo ) ;
    public final AssemblerParser.membroClasse_return membroClasse() throws RecognitionException {
        AssemblerParser.membroClasse_return retval = new AssemblerParser.membroClasse_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token string_literal24=null;
        Token ID25=null;
        AssemblerParser.tipo_return tipo26 =null;


        BytecodesAST string_literal24_tree=null;
        BytecodesAST ID25_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
        RewriteRuleSubtreeStream stream_tipo=new RewriteRuleSubtreeStream(adaptor,"rule tipo");
        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:45:14: ( '.field' ID tipo -> ^( FIELD_DECL ID tipo ) )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:45:16: '.field' ID tipo
            {
            string_literal24=(Token)match(input,18,FOLLOW_18_in_membroClasse389);  
            stream_18.add(string_literal24);


            ID25=(Token)match(input,ID,FOLLOW_ID_in_membroClasse391);  
            stream_ID.add(ID25);


            pushFollow(FOLLOW_tipo_in_membroClasse393);
            tipo26=tipo();

            state._fsp--;

            stream_tipo.add(tipo26.getTree());

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
            // 45:33: -> ^( FIELD_DECL ID tipo )
            {
                // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:45:36: ^( FIELD_DECL ID tipo )
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
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:47:1: construtorDefault : INIT '()' VOID ;
    public final AssemblerParser.construtorDefault_return construtorDefault() throws RecognitionException {
        AssemblerParser.construtorDefault_return retval = new AssemblerParser.construtorDefault_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token INIT27=null;
        Token string_literal28=null;
        Token VOID29=null;

        BytecodesAST INIT27_tree=null;
        BytecodesAST string_literal28_tree=null;
        BytecodesAST VOID29_tree=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:47:19: ( INIT '()' VOID )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:47:21: INIT '()' VOID
            {
            root_0 = (BytecodesAST)adaptor.nil();


            INIT27=(Token)match(input,INIT,FOLLOW_INIT_in_construtorDefault412); 
            INIT27_tree = 
            (BytecodesAST)adaptor.create(INIT27)
            ;
            adaptor.addChild(root_0, INIT27_tree);


            string_literal28=(Token)match(input,16,FOLLOW_16_in_construtorDefault414); 
            string_literal28_tree = 
            (BytecodesAST)adaptor.create(string_literal28)
            ;
            adaptor.addChild(root_0, string_literal28_tree);


            VOID29=(Token)match(input,VOID,FOLLOW_VOID_in_construtorDefault416); 
            VOID29_tree = 
            (BytecodesAST)adaptor.create(VOID29)
            ;
            adaptor.addChild(root_0, VOID29_tree);


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


    public static class manipulacaoObjetos_return extends ParserRuleReturnScope {
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "manipulacaoObjetos"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:49:1: manipulacaoObjetos : ( 'getfield' ID '/' ID tipo | 'putfield' ID '/' ID tipo | 'invokespecial' ID '/' INIT '()' VOID );
    public final AssemblerParser.manipulacaoObjetos_return manipulacaoObjetos() throws RecognitionException {
        AssemblerParser.manipulacaoObjetos_return retval = new AssemblerParser.manipulacaoObjetos_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token string_literal30=null;
        Token ID31=null;
        Token char_literal32=null;
        Token ID33=null;
        Token string_literal35=null;
        Token ID36=null;
        Token char_literal37=null;
        Token ID38=null;
        Token string_literal40=null;
        Token ID41=null;
        Token char_literal42=null;
        Token INIT43=null;
        Token string_literal44=null;
        Token VOID45=null;
        AssemblerParser.tipo_return tipo34 =null;

        AssemblerParser.tipo_return tipo39 =null;


        BytecodesAST string_literal30_tree=null;
        BytecodesAST ID31_tree=null;
        BytecodesAST char_literal32_tree=null;
        BytecodesAST ID33_tree=null;
        BytecodesAST string_literal35_tree=null;
        BytecodesAST ID36_tree=null;
        BytecodesAST char_literal37_tree=null;
        BytecodesAST ID38_tree=null;
        BytecodesAST string_literal40_tree=null;
        BytecodesAST ID41_tree=null;
        BytecodesAST char_literal42_tree=null;
        BytecodesAST INIT43_tree=null;
        BytecodesAST string_literal44_tree=null;
        BytecodesAST VOID45_tree=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:49:20: ( 'getfield' ID '/' ID tipo | 'putfield' ID '/' ID tipo | 'invokespecial' ID '/' INIT '()' VOID )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt7=1;
                }
                break;
            case 75:
                {
                alt7=2;
                }
                break;
            case 61:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:49:22: 'getfield' ID '/' ID tipo
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    string_literal30=(Token)match(input,29,FOLLOW_29_in_manipulacaoObjetos426); 
                    string_literal30_tree = 
                    (BytecodesAST)adaptor.create(string_literal30)
                    ;
                    adaptor.addChild(root_0, string_literal30_tree);


                    ID31=(Token)match(input,ID,FOLLOW_ID_in_manipulacaoObjetos428); 
                    ID31_tree = 
                    (BytecodesAST)adaptor.create(ID31)
                    ;
                    adaptor.addChild(root_0, ID31_tree);


                    char_literal32=(Token)match(input,21,FOLLOW_21_in_manipulacaoObjetos430); 
                    char_literal32_tree = 
                    (BytecodesAST)adaptor.create(char_literal32)
                    ;
                    adaptor.addChild(root_0, char_literal32_tree);


                    ID33=(Token)match(input,ID,FOLLOW_ID_in_manipulacaoObjetos432); 
                    ID33_tree = 
                    (BytecodesAST)adaptor.create(ID33)
                    ;
                    adaptor.addChild(root_0, ID33_tree);


                    pushFollow(FOLLOW_tipo_in_manipulacaoObjetos434);
                    tipo34=tipo();

                    state._fsp--;

                    adaptor.addChild(root_0, tipo34.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:50:22: 'putfield' ID '/' ID tipo
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    string_literal35=(Token)match(input,75,FOLLOW_75_in_manipulacaoObjetos457); 
                    string_literal35_tree = 
                    (BytecodesAST)adaptor.create(string_literal35)
                    ;
                    adaptor.addChild(root_0, string_literal35_tree);


                    ID36=(Token)match(input,ID,FOLLOW_ID_in_manipulacaoObjetos459); 
                    ID36_tree = 
                    (BytecodesAST)adaptor.create(ID36)
                    ;
                    adaptor.addChild(root_0, ID36_tree);


                    char_literal37=(Token)match(input,21,FOLLOW_21_in_manipulacaoObjetos461); 
                    char_literal37_tree = 
                    (BytecodesAST)adaptor.create(char_literal37)
                    ;
                    adaptor.addChild(root_0, char_literal37_tree);


                    ID38=(Token)match(input,ID,FOLLOW_ID_in_manipulacaoObjetos463); 
                    ID38_tree = 
                    (BytecodesAST)adaptor.create(ID38)
                    ;
                    adaptor.addChild(root_0, ID38_tree);


                    pushFollow(FOLLOW_tipo_in_manipulacaoObjetos465);
                    tipo39=tipo();

                    state._fsp--;

                    adaptor.addChild(root_0, tipo39.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:51:22: 'invokespecial' ID '/' INIT '()' VOID
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    string_literal40=(Token)match(input,61,FOLLOW_61_in_manipulacaoObjetos488); 
                    string_literal40_tree = 
                    (BytecodesAST)adaptor.create(string_literal40)
                    ;
                    adaptor.addChild(root_0, string_literal40_tree);


                    ID41=(Token)match(input,ID,FOLLOW_ID_in_manipulacaoObjetos490); 
                    ID41_tree = 
                    (BytecodesAST)adaptor.create(ID41)
                    ;
                    adaptor.addChild(root_0, ID41_tree);


                    char_literal42=(Token)match(input,21,FOLLOW_21_in_manipulacaoObjetos492); 
                    char_literal42_tree = 
                    (BytecodesAST)adaptor.create(char_literal42)
                    ;
                    adaptor.addChild(root_0, char_literal42_tree);


                    INIT43=(Token)match(input,INIT,FOLLOW_INIT_in_manipulacaoObjetos494); 
                    INIT43_tree = 
                    (BytecodesAST)adaptor.create(INIT43)
                    ;
                    adaptor.addChild(root_0, INIT43_tree);


                    string_literal44=(Token)match(input,16,FOLLOW_16_in_manipulacaoObjetos496); 
                    string_literal44_tree = 
                    (BytecodesAST)adaptor.create(string_literal44)
                    ;
                    adaptor.addChild(root_0, string_literal44_tree);


                    VOID45=(Token)match(input,VOID,FOLLOW_VOID_in_manipulacaoObjetos498); 
                    VOID45_tree = 
                    (BytecodesAST)adaptor.create(VOID45)
                    ;
                    adaptor.addChild(root_0, VOID45_tree);


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
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:54:1: tipo : ( INT | VOID | 'L' ID );
    public final AssemblerParser.tipo_return tipo() throws RecognitionException {
        AssemblerParser.tipo_return retval = new AssemblerParser.tipo_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token INT46=null;
        Token VOID47=null;
        Token char_literal48=null;
        Token ID49=null;

        BytecodesAST INT46_tree=null;
        BytecodesAST VOID47_tree=null;
        BytecodesAST char_literal48_tree=null;
        BytecodesAST ID49_tree=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:54:6: ( INT | VOID | 'L' ID )
            int alt8=3;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt8=1;
                }
                break;
            case VOID:
                {
                alt8=2;
                }
                break;
            case 23:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:54:8: INT
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    INT46=(Token)match(input,INT,FOLLOW_INT_in_tipo529); 
                    INT46_tree = 
                    (BytecodesAST)adaptor.create(INT46)
                    ;
                    adaptor.addChild(root_0, INT46_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:54:14: VOID
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    VOID47=(Token)match(input,VOID,FOLLOW_VOID_in_tipo533); 
                    VOID47_tree = 
                    (BytecodesAST)adaptor.create(VOID47)
                    ;
                    adaptor.addChild(root_0, VOID47_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:54:21: 'L' ID
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    char_literal48=(Token)match(input,23,FOLLOW_23_in_tipo537); 
                    char_literal48_tree = 
                    (BytecodesAST)adaptor.create(char_literal48)
                    ;
                    adaptor.addChild(root_0, char_literal48_tree);


                    ID49=(Token)match(input,ID,FOLLOW_ID_in_tipo538); 
                    ID49_tree = 
                    (BytecodesAST)adaptor.create(ID49)
                    ;
                    adaptor.addChild(root_0, ID49_tree);


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


    public static class aritmetica_return extends ParserRuleReturnScope {
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "aritmetica"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:56:1: aritmetica : (a= 'iadd' |a= 'isub' |a= 'imul' |a= 'idiv' |a= 'irem' |a= 'iinc' |a= 'ineg' );
    public final AssemblerParser.aritmetica_return aritmetica() throws RecognitionException {
        AssemblerParser.aritmetica_return retval = new AssemblerParser.aritmetica_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;

        BytecodesAST a_tree=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:56:12: (a= 'iadd' |a= 'isub' |a= 'imul' |a= 'idiv' |a= 'irem' |a= 'iinc' |a= 'ineg' )
            int alt9=7;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt9=1;
                }
                break;
            case 69:
                {
                alt9=2;
                }
                break;
            case 59:
                {
                alt9=3;
                }
                break;
            case 40:
                {
                alt9=4;
                }
                break;
            case 63:
                {
                alt9=5;
                }
                break;
            case 53:
                {
                alt9=6;
                }
                break;
            case 60:
                {
                alt9=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:56:14: a= 'iadd'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,31,FOLLOW_31_in_aritmetica551); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    escreverOpcode(a);

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:57:14: a= 'isub'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,69,FOLLOW_69_in_aritmetica572); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    escreverOpcode(a);

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:58:14: a= 'imul'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,59,FOLLOW_59_in_aritmetica593); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    escreverOpcode(a);

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:59:14: a= 'idiv'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,40,FOLLOW_40_in_aritmetica614); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    escreverOpcode(a);

                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:60:14: a= 'irem'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,63,FOLLOW_63_in_aritmetica635); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    escreverOpcode(a);

                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:61:14: a= 'iinc'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,53,FOLLOW_53_in_aritmetica656); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    escreverOpcode(a);

                    }
                    break;
                case 7 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:62:14: a= 'ineg'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,60,FOLLOW_60_in_aritmetica677); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    escreverOpcode(a);

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
    // $ANTLR end "aritmetica"


    public static class load_return extends ParserRuleReturnScope {
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "load"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:65:1: load : (a= 'iconst_m1' |a= 'iconst_0' |a= 'iconst_1' |a= 'iconst_2' |a= 'iconst_3' |a= 'iconst_4' |a= 'iconst_5' |a= 'iload_0' |a= 'iload_1' |a= 'iload_2' |a= 'iload_3' |a= 'iload' INTEIRO |a= 'ldc' INTEIRO | 'aload' INTEIRO | 'aload_0' | 'aload_1' | 'aload_2' | 'aload_3' );
    public final AssemblerParser.load_return load() throws RecognitionException, LabelException {
        AssemblerParser.load_return retval = new AssemblerParser.load_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;
        Token INTEIRO50=null;
        Token INTEIRO51=null;
        Token string_literal52=null;
        Token INTEIRO53=null;
        Token string_literal54=null;
        Token string_literal55=null;
        Token string_literal56=null;
        Token string_literal57=null;

        BytecodesAST a_tree=null;
        BytecodesAST INTEIRO50_tree=null;
        BytecodesAST INTEIRO51_tree=null;
        BytecodesAST string_literal52_tree=null;
        BytecodesAST INTEIRO53_tree=null;
        BytecodesAST string_literal54_tree=null;
        BytecodesAST string_literal55_tree=null;
        BytecodesAST string_literal56_tree=null;
        BytecodesAST string_literal57_tree=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:65:6: (a= 'iconst_m1' |a= 'iconst_0' |a= 'iconst_1' |a= 'iconst_2' |a= 'iconst_3' |a= 'iconst_4' |a= 'iconst_5' |a= 'iload_0' |a= 'iload_1' |a= 'iload_2' |a= 'iload_3' |a= 'iload' INTEIRO |a= 'ldc' INTEIRO | 'aload' INTEIRO | 'aload_0' | 'aload_1' | 'aload_2' | 'aload_3' )
            int alt10=18;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt10=1;
                }
                break;
            case 33:
                {
                alt10=2;
                }
                break;
            case 34:
                {
                alt10=3;
                }
                break;
            case 35:
                {
                alt10=4;
                }
                break;
            case 36:
                {
                alt10=5;
                }
                break;
            case 37:
                {
                alt10=6;
                }
                break;
            case 38:
                {
                alt10=7;
                }
                break;
            case 55:
                {
                alt10=8;
                }
                break;
            case 56:
                {
                alt10=9;
                }
                break;
            case 57:
                {
                alt10=10;
                }
                break;
            case 58:
                {
                alt10=11;
                }
                break;
            case 54:
                {
                alt10=12;
                }
                break;
            case 71:
                {
                alt10=13;
                }
                break;
            case 24:
                {
                alt10=14;
                }
                break;
            case 25:
                {
                alt10=15;
                }
                break;
            case 26:
                {
                alt10=16;
                }
                break;
            case 27:
                {
                alt10=17;
                }
                break;
            case 28:
                {
                alt10=18;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:65:8: a= 'iconst_m1'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,39,FOLLOW_39_in_load714); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    escreverOpcode(a);

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:66:8: a= 'iconst_0'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,33,FOLLOW_33_in_load728); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    escreverOpcode(a);

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:67:8: a= 'iconst_1'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,34,FOLLOW_34_in_load743); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    escreverOpcode(a);

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:68:8: a= 'iconst_2'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,35,FOLLOW_35_in_load758); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    escreverOpcode(a);

                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:69:8: a= 'iconst_3'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,36,FOLLOW_36_in_load773); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    escreverOpcode(a);

                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:70:8: a= 'iconst_4'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,37,FOLLOW_37_in_load787); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    escreverOpcode(a);

                    }
                    break;
                case 7 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:71:8: a= 'iconst_5'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,38,FOLLOW_38_in_load801); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    escreverOpcode(a);

                    }
                    break;
                case 8 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:72:8: a= 'iload_0'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,55,FOLLOW_55_in_load815); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    escreverOpcode(a);

                    }
                    break;
                case 9 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:73:8: a= 'iload_1'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,56,FOLLOW_56_in_load830); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    escreverOpcode(a);

                    }
                    break;
                case 10 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:74:8: a= 'iload_2'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,57,FOLLOW_57_in_load845); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    escreverOpcode(a);

                    }
                    break;
                case 11 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:75:8: a= 'iload_3'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,58,FOLLOW_58_in_load860); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    escreverOpcode(a);

                    }
                    break;
                case 12 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:76:8: a= 'iload' INTEIRO
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,54,FOLLOW_54_in_load875); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    INTEIRO50=(Token)match(input,INTEIRO,FOLLOW_INTEIRO_in_load877); 
                    INTEIRO50_tree = 
                    (BytecodesAST)adaptor.create(INTEIRO50)
                    ;
                    adaptor.addChild(root_0, INTEIRO50_tree);


                    escreverOpcode(a, INTEIRO50);

                    }
                    break;
                case 13 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:77:8: a= 'ldc' INTEIRO
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,71,FOLLOW_71_in_load892); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    INTEIRO51=(Token)match(input,INTEIRO,FOLLOW_INTEIRO_in_load894); 
                    INTEIRO51_tree = 
                    (BytecodesAST)adaptor.create(INTEIRO51)
                    ;
                    adaptor.addChild(root_0, INTEIRO51_tree);


                    escreverOpcode(a, INTEIRO51);

                    }
                    break;
                case 14 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:78:8: 'aload' INTEIRO
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    string_literal52=(Token)match(input,24,FOLLOW_24_in_load905); 
                    string_literal52_tree = 
                    (BytecodesAST)adaptor.create(string_literal52)
                    ;
                    adaptor.addChild(root_0, string_literal52_tree);


                    INTEIRO53=(Token)match(input,INTEIRO,FOLLOW_INTEIRO_in_load907); 
                    INTEIRO53_tree = 
                    (BytecodesAST)adaptor.create(INTEIRO53)
                    ;
                    adaptor.addChild(root_0, INTEIRO53_tree);


                    }
                    break;
                case 15 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:79:8: 'aload_0'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    string_literal54=(Token)match(input,25,FOLLOW_25_in_load916); 
                    string_literal54_tree = 
                    (BytecodesAST)adaptor.create(string_literal54)
                    ;
                    adaptor.addChild(root_0, string_literal54_tree);


                    }
                    break;
                case 16 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:80:8: 'aload_1'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    string_literal55=(Token)match(input,26,FOLLOW_26_in_load925); 
                    string_literal55_tree = 
                    (BytecodesAST)adaptor.create(string_literal55)
                    ;
                    adaptor.addChild(root_0, string_literal55_tree);


                    }
                    break;
                case 17 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:81:8: 'aload_2'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    string_literal56=(Token)match(input,27,FOLLOW_27_in_load934); 
                    string_literal56_tree = 
                    (BytecodesAST)adaptor.create(string_literal56)
                    ;
                    adaptor.addChild(root_0, string_literal56_tree);


                    }
                    break;
                case 18 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:82:8: 'aload_3'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    string_literal57=(Token)match(input,28,FOLLOW_28_in_load943); 
                    string_literal57_tree = 
                    (BytecodesAST)adaptor.create(string_literal57)
                    ;
                    adaptor.addChild(root_0, string_literal57_tree);


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
    // $ANTLR end "load"


    public static class store_return extends ParserRuleReturnScope {
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "store"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:85:1: store : (a= 'istore_0' |a= 'istore_1' |a= 'istore_2' |a= 'istore_3' |a= 'istore' INTEIRO );
    public final AssemblerParser.store_return store() throws RecognitionException, AcessoIndevidoMemoriaException, LabelException {
        AssemblerParser.store_return retval = new AssemblerParser.store_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;
        Token INTEIRO58=null;

        BytecodesAST a_tree=null;
        BytecodesAST INTEIRO58_tree=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:85:7: (a= 'istore_0' |a= 'istore_1' |a= 'istore_2' |a= 'istore_3' |a= 'istore' INTEIRO )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt11=1;
                }
                break;
            case 66:
                {
                alt11=2;
                }
                break;
            case 67:
                {
                alt11=3;
                }
                break;
            case 68:
                {
                alt11=4;
                }
                break;
            case 64:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }

            switch (alt11) {
                case 1 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:85:9: a= 'istore_0'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,65,FOLLOW_65_in_store966); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    verificarAumentoMemoriaGlobal(a);

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:86:9: a= 'istore_1'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,66,FOLLOW_66_in_store982); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    verificarAumentoMemoriaGlobal(a);

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:87:9: a= 'istore_2'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,67,FOLLOW_67_in_store998); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    verificarAumentoMemoriaGlobal(a);

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:88:9: a= 'istore_3'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,68,FOLLOW_68_in_store1014); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    verificarAumentoMemoriaGlobal(a);

                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:89:9: a= 'istore' INTEIRO
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,64,FOLLOW_64_in_store1030); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    INTEIRO58=(Token)match(input,INTEIRO,FOLLOW_INTEIRO_in_store1032); 
                    INTEIRO58_tree = 
                    (BytecodesAST)adaptor.create(INTEIRO58)
                    ;
                    adaptor.addChild(root_0, INTEIRO58_tree);


                    verificarAumentoMemoriaGlobal(a, INTEIRO58);

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
    // $ANTLR end "store"


    public static class logica_return extends ParserRuleReturnScope {
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logica"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:92:1: logica : (a= 'iand' |a= 'ior' |a= 'ixor' );
    public final AssemblerParser.logica_return logica() throws RecognitionException {
        AssemblerParser.logica_return retval = new AssemblerParser.logica_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;

        BytecodesAST a_tree=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:92:8: (a= 'iand' |a= 'ior' |a= 'ixor' )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt12=1;
                }
                break;
            case 62:
                {
                alt12=2;
                }
                break;
            case 70:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:92:10: a= 'iand'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,32,FOLLOW_32_in_logica1053); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    escreverOpcode(a);

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:93:10: a= 'ior'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,62,FOLLOW_62_in_logica1070); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    escreverOpcode(a);

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:94:10: a= 'ixor'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,70,FOLLOW_70_in_logica1087); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    escreverOpcode(a);

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
    // $ANTLR end "logica"


    public static class desvio_return extends ParserRuleReturnScope {
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "desvio"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:97:1: desvio : (a= 'ifeq' b= ID |a= 'ifne' b= ID |a= 'iflt' b= ID |a= 'ifge' b= ID |a= 'ifgt' b= ID |a= 'ifle' b= ID |a= 'if_icmpeq' b= ID |a= 'if_icmpne' b= ID |a= 'if_icmplt' b= ID |a= 'if_icmpge' b= ID |a= 'if_icmpgt' b= ID |a= 'if_icmple' b= ID |a= 'goto' b= ID );
    public final AssemblerParser.desvio_return desvio() throws RecognitionException, LabelException {
        AssemblerParser.desvio_return retval = new AssemblerParser.desvio_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;
        Token b=null;

        BytecodesAST a_tree=null;
        BytecodesAST b_tree=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:97:8: (a= 'ifeq' b= ID |a= 'ifne' b= ID |a= 'iflt' b= ID |a= 'ifge' b= ID |a= 'ifgt' b= ID |a= 'ifle' b= ID |a= 'if_icmpeq' b= ID |a= 'if_icmpne' b= ID |a= 'if_icmplt' b= ID |a= 'if_icmpge' b= ID |a= 'if_icmpgt' b= ID |a= 'if_icmple' b= ID |a= 'goto' b= ID )
            int alt13=13;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt13=1;
                }
                break;
            case 52:
                {
                alt13=2;
                }
                break;
            case 51:
                {
                alt13=3;
                }
                break;
            case 48:
                {
                alt13=4;
                }
                break;
            case 49:
                {
                alt13=5;
                }
                break;
            case 50:
                {
                alt13=6;
                }
                break;
            case 41:
                {
                alt13=7;
                }
                break;
            case 46:
                {
                alt13=8;
                }
                break;
            case 45:
                {
                alt13=9;
                }
                break;
            case 42:
                {
                alt13=10;
                }
                break;
            case 43:
                {
                alt13=11;
                }
                break;
            case 44:
                {
                alt13=12;
                }
                break;
            case 30:
                {
                alt13=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:97:10: a= 'ifeq' b= ID
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,47,FOLLOW_47_in_desvio1109); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio1115); 
                    b_tree = 
                    (BytecodesAST)adaptor.create(b)
                    ;
                    adaptor.addChild(root_0, b_tree);


                    escreverOpcode(a, b);

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:98:10: a= 'ifne' b= ID
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,52,FOLLOW_52_in_desvio1132); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio1138); 
                    b_tree = 
                    (BytecodesAST)adaptor.create(b)
                    ;
                    adaptor.addChild(root_0, b_tree);


                    escreverOpcode(a, b);

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:99:10: a= 'iflt' b= ID
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,51,FOLLOW_51_in_desvio1155); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio1161); 
                    b_tree = 
                    (BytecodesAST)adaptor.create(b)
                    ;
                    adaptor.addChild(root_0, b_tree);


                    escreverOpcode(a, b);

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:100:10: a= 'ifge' b= ID
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,48,FOLLOW_48_in_desvio1178); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio1184); 
                    b_tree = 
                    (BytecodesAST)adaptor.create(b)
                    ;
                    adaptor.addChild(root_0, b_tree);


                    escreverOpcode(a, b);

                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:101:10: a= 'ifgt' b= ID
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,49,FOLLOW_49_in_desvio1201); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio1207); 
                    b_tree = 
                    (BytecodesAST)adaptor.create(b)
                    ;
                    adaptor.addChild(root_0, b_tree);


                    escreverOpcode(a, b);

                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:102:10: a= 'ifle' b= ID
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,50,FOLLOW_50_in_desvio1224); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio1230); 
                    b_tree = 
                    (BytecodesAST)adaptor.create(b)
                    ;
                    adaptor.addChild(root_0, b_tree);


                    escreverOpcode(a, b);

                    }
                    break;
                case 7 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:103:10: a= 'if_icmpeq' b= ID
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,41,FOLLOW_41_in_desvio1247); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio1253); 
                    b_tree = 
                    (BytecodesAST)adaptor.create(b)
                    ;
                    adaptor.addChild(root_0, b_tree);


                    escreverOpcode(a, b);

                    }
                    break;
                case 8 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:104:10: a= 'if_icmpne' b= ID
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,46,FOLLOW_46_in_desvio1270); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio1276); 
                    b_tree = 
                    (BytecodesAST)adaptor.create(b)
                    ;
                    adaptor.addChild(root_0, b_tree);


                    escreverOpcode(a, b);

                    }
                    break;
                case 9 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:105:10: a= 'if_icmplt' b= ID
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,45,FOLLOW_45_in_desvio1293); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio1299); 
                    b_tree = 
                    (BytecodesAST)adaptor.create(b)
                    ;
                    adaptor.addChild(root_0, b_tree);


                    escreverOpcode(a, b);

                    }
                    break;
                case 10 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:106:10: a= 'if_icmpge' b= ID
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,42,FOLLOW_42_in_desvio1316); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio1322); 
                    b_tree = 
                    (BytecodesAST)adaptor.create(b)
                    ;
                    adaptor.addChild(root_0, b_tree);


                    escreverOpcode(a, b);

                    }
                    break;
                case 11 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:107:10: a= 'if_icmpgt' b= ID
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,43,FOLLOW_43_in_desvio1339); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio1345); 
                    b_tree = 
                    (BytecodesAST)adaptor.create(b)
                    ;
                    adaptor.addChild(root_0, b_tree);


                    escreverOpcode(a, b);

                    }
                    break;
                case 12 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:108:10: a= 'if_icmple' b= ID
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,44,FOLLOW_44_in_desvio1362); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio1368); 
                    b_tree = 
                    (BytecodesAST)adaptor.create(b)
                    ;
                    adaptor.addChild(root_0, b_tree);


                    escreverOpcode(a, b);

                    }
                    break;
                case 13 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:109:10: a= 'goto' b= ID
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,30,FOLLOW_30_in_desvio1385); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio1391); 
                    b_tree = 
                    (BytecodesAST)adaptor.create(b)
                    ;
                    adaptor.addChild(root_0, b_tree);


                    escreverOpcode(a, b);

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
    // $ANTLR end "desvio"

    // Delegated rules


 

    public static final BitSet FOLLOW_comando_in_programa64 = new BitSet(new long[]{0xFFFFFFFFFF0A1082L,0x0000000000000FFFL});
    public static final BitSet FOLLOW_label_in_comando84 = new BitSet(new long[]{0xFFFFFFFFFF0A1000L,0x0000000000000FFFL});
    public static final BitSet FOLLOW_instrucao_in_comando86 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instrucao_in_comando90 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_label112 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_label114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definicaoClasse_in_instrucao124 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_manipulacaoObjetos_in_instrucao128 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_aritmetica_in_instrucao132 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_load_in_instrucao136 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_store_in_instrucao140 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_desvio_in_instrucao144 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_logica_in_instrucao148 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_72_in_instrucao171 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_73_in_instrucao193 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_74_in_instrucao217 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_NOVA_LINHA_in_instrucao237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_definicaoClasse259 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_definicaoClasse261 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_NOVA_LINHA_in_definicaoClasse263 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_superClasse_in_definicaoClasse265 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_membroClasse_in_definicaoClasse268 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_19_in_definicaoClasse327 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_construtorDefault_in_definicaoClasse329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_superClasse370 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_superClasse372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_membroClasse389 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_membroClasse391 = new BitSet(new long[]{0x0000000000804200L});
    public static final BitSet FOLLOW_tipo_in_membroClasse393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INIT_in_construtorDefault412 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_construtorDefault414 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_VOID_in_construtorDefault416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_manipulacaoObjetos426 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_manipulacaoObjetos428 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_manipulacaoObjetos430 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_manipulacaoObjetos432 = new BitSet(new long[]{0x0000000000804200L});
    public static final BitSet FOLLOW_tipo_in_manipulacaoObjetos434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_manipulacaoObjetos457 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_manipulacaoObjetos459 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_manipulacaoObjetos461 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_manipulacaoObjetos463 = new BitSet(new long[]{0x0000000000804200L});
    public static final BitSet FOLLOW_tipo_in_manipulacaoObjetos465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_manipulacaoObjetos488 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_manipulacaoObjetos490 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_manipulacaoObjetos492 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_INIT_in_manipulacaoObjetos494 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_manipulacaoObjetos496 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_VOID_in_manipulacaoObjetos498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_tipo529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_tipo533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_tipo537 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_tipo538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_aritmetica551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_aritmetica572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_aritmetica593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_aritmetica614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_aritmetica635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_aritmetica656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_aritmetica677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_load714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_load728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_load743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_load758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_load773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_load787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_load801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_load815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_load830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_load845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_load860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_load875 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_INTEIRO_in_load877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_load892 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_INTEIRO_in_load894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_load905 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_INTEIRO_in_load907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_load916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_load925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_load934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_load943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_store966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_store982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_store998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_store1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_store1030 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_INTEIRO_in_store1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_logica1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_logica1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_logica1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_desvio1109 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_desvio1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_desvio1132 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_desvio1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_desvio1155 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_desvio1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_desvio1178 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_desvio1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_desvio1201 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_desvio1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_desvio1224 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_desvio1230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_desvio1247 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_desvio1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_desvio1270 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_desvio1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_desvio1293 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_desvio1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_desvio1316 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_desvio1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_desvio1339 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_desvio1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_desvio1362 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_desvio1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_desvio1385 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_desvio1391 = new BitSet(new long[]{0x0000000000000002L});

}