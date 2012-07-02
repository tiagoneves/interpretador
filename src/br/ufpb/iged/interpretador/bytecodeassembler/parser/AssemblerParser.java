// $ANTLR 3.4 C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g 2012-07-02 00:02:36

  package br.ufpb.iged.interpretador.bytecodeassembler.parser;
  
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CLASSE", "EXTENDS", "FIELD_DECL", "ID", "INIT", "INT", "INTEIRO", "MEMBRO_CLASSE", "NOVA_LINHA", "NULL", "VOID", "WS", "'()'", "'.class'", "'.field'", "'.method'", "'.super'", "'/'", "':'", "'L'", "'aload'", "'aload_0'", "'aload_1'", "'aload_2'", "'aload_3'", "'astore'", "'astore_0'", "'astore_1'", "'astore_2'", "'astore_3'", "'getfield'", "'goto'", "'iadd'", "'iand'", "'iconst_0'", "'iconst_1'", "'iconst_2'", "'iconst_3'", "'iconst_4'", "'iconst_5'", "'iconst_m1'", "'idiv'", "'if_icmpeq'", "'if_icmpge'", "'if_icmpgt'", "'if_icmple'", "'if_icmplt'", "'if_icmpne'", "'ifeq'", "'ifge'", "'ifgt'", "'ifle'", "'iflt'", "'ifne'", "'iinc'", "'iload'", "'iload_0'", "'iload_1'", "'iload_2'", "'iload_3'", "'imul'", "'ineg'", "'invokespecial'", "'ior'", "'irem'", "'istore'", "'istore_0'", "'istore_1'", "'istore_2'", "'istore_3'", "'isub'", "'ixor'", "'ldc'", "'nop'", "'pop'", "'pop2'", "'putfield'"
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
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
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
      protected abstract void acessarCampo(Token opc, List<Token> classe, String campo);
      protected abstract void chamarMetodo(Token opc, List<Token> classe);
      


    public static class programa_return extends ParserRuleReturnScope {
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "programa"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:39:1: programa : ( comando )* ;
    public final AssemblerParser.programa_return programa() throws RecognitionException, LabelException, AcessoIndevidoMemoriaException {
        AssemblerParser.programa_return retval = new AssemblerParser.programa_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        AssemblerParser.comando_return comando1 =null;



        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:39:10: ( ( comando )* )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:39:12: ( comando )*
            {
            root_0 = (BytecodesAST)adaptor.nil();


            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:39:12: ( comando )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID||LA1_0==NOVA_LINHA||LA1_0==17||LA1_0==19||(LA1_0 >= 24 && LA1_0 <= 80)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:39:12: comando
            	    {
            	    pushFollow(FOLLOW_comando_in_programa77);
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
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:42:1: comando : ( label instrucao | instrucao ) ;
    public final AssemblerParser.comando_return comando() throws RecognitionException, LabelException, AcessoIndevidoMemoriaException {
        AssemblerParser.comando_return retval = new AssemblerParser.comando_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        AssemblerParser.label_return label2 =null;

        AssemblerParser.instrucao_return instrucao3 =null;

        AssemblerParser.instrucao_return instrucao4 =null;



        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:42:9: ( ( label instrucao | instrucao ) )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:42:11: ( label instrucao | instrucao )
            {
            root_0 = (BytecodesAST)adaptor.nil();


            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:42:11: ( label instrucao | instrucao )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==NOVA_LINHA||LA2_0==17||LA2_0==19||(LA2_0 >= 24 && LA2_0 <= 80)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:42:12: label instrucao
                    {
                    pushFollow(FOLLOW_label_in_comando97);
                    label2=label();

                    state._fsp--;

                    adaptor.addChild(root_0, label2.getTree());

                    pushFollow(FOLLOW_instrucao_in_comando99);
                    instrucao3=instrucao();

                    state._fsp--;

                    adaptor.addChild(root_0, instrucao3.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:42:30: instrucao
                    {
                    pushFollow(FOLLOW_instrucao_in_comando103);
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
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:44:1: label : a= ID ':' ;
    public final AssemblerParser.label_return label() throws RecognitionException, LabelException {
        AssemblerParser.label_return retval = new AssemblerParser.label_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;
        Token char_literal5=null;

        BytecodesAST a_tree=null;
        BytecodesAST char_literal5_tree=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:44:7: (a= ID ':' )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:44:9: a= ID ':'
            {
            root_0 = (BytecodesAST)adaptor.nil();


            a=(Token)match(input,ID,FOLLOW_ID_in_label125); 
            a_tree = 
            (BytecodesAST)adaptor.create(a)
            ;
            adaptor.addChild(root_0, a_tree);


            char_literal5=(Token)match(input,22,FOLLOW_22_in_label127); 
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
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:46:1: instrucao : ( definicaoClasse | manipulacaoObjetos | aritmetica | load | store | desvio | logica | 'nop' |a= 'pop' |a= 'pop2' )? NOVA_LINHA ;
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
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:46:10: ( ( definicaoClasse | manipulacaoObjetos | aritmetica | load | store | desvio | logica | 'nop' |a= 'pop' |a= 'pop2' )? NOVA_LINHA )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:46:12: ( definicaoClasse | manipulacaoObjetos | aritmetica | load | store | desvio | logica | 'nop' |a= 'pop' |a= 'pop2' )? NOVA_LINHA
            {
            root_0 = (BytecodesAST)adaptor.nil();


            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:46:12: ( definicaoClasse | manipulacaoObjetos | aritmetica | load | store | desvio | logica | 'nop' |a= 'pop' |a= 'pop2' )?
            int alt3=11;
            switch ( input.LA(1) ) {
                case 17:
                case 19:
                    {
                    alt3=1;
                    }
                    break;
                case 34:
                case 66:
                case 80:
                    {
                    alt3=2;
                    }
                    break;
                case 36:
                case 45:
                case 58:
                case 64:
                case 65:
                case 68:
                case 74:
                    {
                    alt3=3;
                    }
                    break;
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 76:
                    {
                    alt3=4;
                    }
                    break;
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 69:
                case 70:
                case 71:
                case 72:
                case 73:
                    {
                    alt3=5;
                    }
                    break;
                case 35:
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
                    {
                    alt3=6;
                    }
                    break;
                case 37:
                case 67:
                case 75:
                    {
                    alt3=7;
                    }
                    break;
                case 77:
                    {
                    alt3=8;
                    }
                    break;
                case 78:
                    {
                    alt3=9;
                    }
                    break;
                case 79:
                    {
                    alt3=10;
                    }
                    break;
            }

            switch (alt3) {
                case 1 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:46:13: definicaoClasse
                    {
                    pushFollow(FOLLOW_definicaoClasse_in_instrucao137);
                    definicaoClasse6=definicaoClasse();

                    state._fsp--;

                    adaptor.addChild(root_0, definicaoClasse6.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:46:31: manipulacaoObjetos
                    {
                    pushFollow(FOLLOW_manipulacaoObjetos_in_instrucao141);
                    manipulacaoObjetos7=manipulacaoObjetos();

                    state._fsp--;

                    adaptor.addChild(root_0, manipulacaoObjetos7.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:46:52: aritmetica
                    {
                    pushFollow(FOLLOW_aritmetica_in_instrucao145);
                    aritmetica8=aritmetica();

                    state._fsp--;

                    adaptor.addChild(root_0, aritmetica8.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:46:65: load
                    {
                    pushFollow(FOLLOW_load_in_instrucao149);
                    load9=load();

                    state._fsp--;

                    adaptor.addChild(root_0, load9.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:46:72: store
                    {
                    pushFollow(FOLLOW_store_in_instrucao153);
                    store10=store();

                    state._fsp--;

                    adaptor.addChild(root_0, store10.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:46:80: desvio
                    {
                    pushFollow(FOLLOW_desvio_in_instrucao157);
                    desvio11=desvio();

                    state._fsp--;

                    adaptor.addChild(root_0, desvio11.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:46:89: logica
                    {
                    pushFollow(FOLLOW_logica_in_instrucao161);
                    logica12=logica();

                    state._fsp--;

                    adaptor.addChild(root_0, logica12.getTree());

                    }
                    break;
                case 8 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:47:21: 'nop'
                    {
                    string_literal13=(Token)match(input,77,FOLLOW_77_in_instrucao184); 
                    string_literal13_tree = 
                    (BytecodesAST)adaptor.create(string_literal13)
                    ;
                    adaptor.addChild(root_0, string_literal13_tree);


                    }
                    break;
                case 9 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:48:17: a= 'pop'
                    {
                    a=(Token)match(input,78,FOLLOW_78_in_instrucao206); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    escreverOpcode(a);

                    }
                    break;
                case 10 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:49:17: a= 'pop2'
                    {
                    a=(Token)match(input,79,FOLLOW_79_in_instrucao230); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    escreverOpcode(a);

                    }
                    break;

            }


            NOVA_LINHA14=(Token)match(input,NOVA_LINHA,FOLLOW_NOVA_LINHA_in_instrucao250); 
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
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:52:1: definicaoClasse : ( '.class' ID NOVA_LINHA ( superClasse )? ( membroClasse )+ -> ^( CLASSE ID ( superClasse )? ^( MEMBRO_CLASSE ( membroClasse )+ ) ) | '.method' INIT '()' VOID );
    public final AssemblerParser.definicaoClasse_return definicaoClasse() throws RecognitionException {
        AssemblerParser.definicaoClasse_return retval = new AssemblerParser.definicaoClasse_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token string_literal15=null;
        Token ID16=null;
        Token NOVA_LINHA17=null;
        Token string_literal20=null;
        Token INIT21=null;
        Token string_literal22=null;
        Token VOID23=null;
        AssemblerParser.superClasse_return superClasse18 =null;

        AssemblerParser.membroClasse_return membroClasse19 =null;


        BytecodesAST string_literal15_tree=null;
        BytecodesAST ID16_tree=null;
        BytecodesAST NOVA_LINHA17_tree=null;
        BytecodesAST string_literal20_tree=null;
        BytecodesAST INIT21_tree=null;
        BytecodesAST string_literal22_tree=null;
        BytecodesAST VOID23_tree=null;
        RewriteRuleTokenStream stream_NOVA_LINHA=new RewriteRuleTokenStream(adaptor,"token NOVA_LINHA");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_17=new RewriteRuleTokenStream(adaptor,"token 17");
        RewriteRuleSubtreeStream stream_membroClasse=new RewriteRuleSubtreeStream(adaptor,"rule membroClasse");
        RewriteRuleSubtreeStream stream_superClasse=new RewriteRuleSubtreeStream(adaptor,"rule superClasse");
        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:52:17: ( '.class' ID NOVA_LINHA ( superClasse )? ( membroClasse )+ -> ^( CLASSE ID ( superClasse )? ^( MEMBRO_CLASSE ( membroClasse )+ ) ) | '.method' INIT '()' VOID )
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
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:52:19: '.class' ID NOVA_LINHA ( superClasse )? ( membroClasse )+
                    {
                    string_literal15=(Token)match(input,17,FOLLOW_17_in_definicaoClasse272);  
                    stream_17.add(string_literal15);


                    ID16=(Token)match(input,ID,FOLLOW_ID_in_definicaoClasse274);  
                    stream_ID.add(ID16);


                    NOVA_LINHA17=(Token)match(input,NOVA_LINHA,FOLLOW_NOVA_LINHA_in_definicaoClasse276);  
                    stream_NOVA_LINHA.add(NOVA_LINHA17);


                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:52:42: ( superClasse )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==20) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:52:42: superClasse
                            {
                            pushFollow(FOLLOW_superClasse_in_definicaoClasse278);
                            superClasse18=superClasse();

                            state._fsp--;

                            stream_superClasse.add(superClasse18.getTree());

                            }
                            break;

                    }


                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:52:55: ( membroClasse )+
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
                    	    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:52:55: membroClasse
                    	    {
                    	    pushFollow(FOLLOW_membroClasse_in_definicaoClasse281);
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
                    // elements: ID, superClasse, membroClasse
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BytecodesAST)adaptor.nil();
                    // 53:19: -> ^( CLASSE ID ( superClasse )? ^( MEMBRO_CLASSE ( membroClasse )+ ) )
                    {
                        // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:53:22: ^( CLASSE ID ( superClasse )? ^( MEMBRO_CLASSE ( membroClasse )+ ) )
                        {
                        BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                        root_1 = (BytecodesAST)adaptor.becomeRoot(
                        (BytecodesAST)adaptor.create(CLASSE, "CLASSE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:53:34: ( superClasse )?
                        if ( stream_superClasse.hasNext() ) {
                            adaptor.addChild(root_1, stream_superClasse.nextTree());

                        }
                        stream_superClasse.reset();

                        // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:53:47: ^( MEMBRO_CLASSE ( membroClasse )+ )
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
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:54:19: '.method' INIT '()' VOID
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    string_literal20=(Token)match(input,19,FOLLOW_19_in_definicaoClasse340); 
                    string_literal20_tree = 
                    (BytecodesAST)adaptor.create(string_literal20)
                    ;
                    adaptor.addChild(root_0, string_literal20_tree);


                    INIT21=(Token)match(input,INIT,FOLLOW_INIT_in_definicaoClasse342); 
                    INIT21_tree = 
                    (BytecodesAST)adaptor.create(INIT21)
                    ;
                    adaptor.addChild(root_0, INIT21_tree);


                    string_literal22=(Token)match(input,16,FOLLOW_16_in_definicaoClasse344); 
                    string_literal22_tree = 
                    (BytecodesAST)adaptor.create(string_literal22)
                    ;
                    adaptor.addChild(root_0, string_literal22_tree);


                    VOID23=(Token)match(input,VOID,FOLLOW_VOID_in_definicaoClasse346); 
                    VOID23_tree = 
                    (BytecodesAST)adaptor.create(VOID23)
                    ;
                    adaptor.addChild(root_0, VOID23_tree);


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
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:57:1: superClasse : '.super' ID -> ^( EXTENDS ID ) ;
    public final AssemblerParser.superClasse_return superClasse() throws RecognitionException {
        AssemblerParser.superClasse_return retval = new AssemblerParser.superClasse_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token string_literal24=null;
        Token ID25=null;

        BytecodesAST string_literal24_tree=null;
        BytecodesAST ID25_tree=null;
        RewriteRuleTokenStream stream_20=new RewriteRuleTokenStream(adaptor,"token 20");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:57:13: ( '.super' ID -> ^( EXTENDS ID ) )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:57:15: '.super' ID
            {
            string_literal24=(Token)match(input,20,FOLLOW_20_in_superClasse387);  
            stream_20.add(string_literal24);


            ID25=(Token)match(input,ID,FOLLOW_ID_in_superClasse389);  
            stream_ID.add(ID25);


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
            // 57:27: -> ^( EXTENDS ID )
            {
                // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:57:30: ^( EXTENDS ID )
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
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:59:1: membroClasse : '.field' ID tipo -> ^( FIELD_DECL ID tipo ) ;
    public final AssemblerParser.membroClasse_return membroClasse() throws RecognitionException {
        AssemblerParser.membroClasse_return retval = new AssemblerParser.membroClasse_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token string_literal26=null;
        Token ID27=null;
        AssemblerParser.tipo_return tipo28 =null;


        BytecodesAST string_literal26_tree=null;
        BytecodesAST ID27_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_18=new RewriteRuleTokenStream(adaptor,"token 18");
        RewriteRuleSubtreeStream stream_tipo=new RewriteRuleSubtreeStream(adaptor,"rule tipo");
        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:59:14: ( '.field' ID tipo -> ^( FIELD_DECL ID tipo ) )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:59:16: '.field' ID tipo
            {
            string_literal26=(Token)match(input,18,FOLLOW_18_in_membroClasse406);  
            stream_18.add(string_literal26);


            ID27=(Token)match(input,ID,FOLLOW_ID_in_membroClasse408);  
            stream_ID.add(ID27);


            pushFollow(FOLLOW_tipo_in_membroClasse410);
            tipo28=tipo();

            state._fsp--;

            stream_tipo.add(tipo28.getTree());

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
            // 59:33: -> ^( FIELD_DECL ID tipo )
            {
                // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:59:36: ^( FIELD_DECL ID tipo )
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


    public static class manipulacaoObjetos_return extends ParserRuleReturnScope {
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "manipulacaoObjetos"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:63:1: manipulacaoObjetos : (a= 'getfield' b= campo tipo |a= 'putfield' b= campo tipo |a= 'invokespecial' c= construtorDefault VOID );
    public final AssemblerParser.manipulacaoObjetos_return manipulacaoObjetos() throws RecognitionException {
        AssemblerParser.manipulacaoObjetos_return retval = new AssemblerParser.manipulacaoObjetos_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;
        Token VOID31=null;
        AssemblerParser.campo_return b =null;

        AssemblerParser.construtorDefault_return c =null;

        AssemblerParser.tipo_return tipo29 =null;

        AssemblerParser.tipo_return tipo30 =null;


        BytecodesAST a_tree=null;
        BytecodesAST VOID31_tree=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:63:20: (a= 'getfield' b= campo tipo |a= 'putfield' b= campo tipo |a= 'invokespecial' c= construtorDefault VOID )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt7=1;
                }
                break;
            case 80:
                {
                alt7=2;
                }
                break;
            case 66:
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
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:63:22: a= 'getfield' b= campo tipo
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,34,FOLLOW_34_in_manipulacaoObjetos462); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    pushFollow(FOLLOW_campo_in_manipulacaoObjetos468);
                    b=campo();

                    state._fsp--;

                    adaptor.addChild(root_0, b.getTree());

                    pushFollow(FOLLOW_tipo_in_manipulacaoObjetos470);
                    tipo29=tipo();

                    state._fsp--;

                    adaptor.addChild(root_0, tipo29.getTree());

                    acessarCampo(a, (b!=null?b.classe:null), (b!=null?b.campo:null));

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:64:22: a= 'putfield' b= campo tipo
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,80,FOLLOW_80_in_manipulacaoObjetos499); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    pushFollow(FOLLOW_campo_in_manipulacaoObjetos505);
                    b=campo();

                    state._fsp--;

                    adaptor.addChild(root_0, b.getTree());

                    pushFollow(FOLLOW_tipo_in_manipulacaoObjetos507);
                    tipo30=tipo();

                    state._fsp--;

                    adaptor.addChild(root_0, tipo30.getTree());

                    acessarCampo(a, (b!=null?b.classe:null), (b!=null?b.campo:null));

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:65:22: a= 'invokespecial' c= construtorDefault VOID
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,66,FOLLOW_66_in_manipulacaoObjetos536); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    pushFollow(FOLLOW_construtorDefault_in_manipulacaoObjetos542);
                    c=construtorDefault();

                    state._fsp--;

                    adaptor.addChild(root_0, c.getTree());

                    VOID31=(Token)match(input,VOID,FOLLOW_VOID_in_manipulacaoObjetos544); 
                    VOID31_tree = 
                    (BytecodesAST)adaptor.create(VOID31)
                    ;
                    adaptor.addChild(root_0, VOID31_tree);


                    chamarMetodo(a, (c!=null?c.classe:null));

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
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:68:1: tipo : ( INT | VOID | tipoRef );
    public final AssemblerParser.tipo_return tipo() throws RecognitionException {
        AssemblerParser.tipo_return retval = new AssemblerParser.tipo_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token INT32=null;
        Token VOID33=null;
        AssemblerParser.tipoRef_return tipoRef34 =null;


        BytecodesAST INT32_tree=null;
        BytecodesAST VOID33_tree=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:68:6: ( INT | VOID | tipoRef )
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
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:68:8: INT
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    INT32=(Token)match(input,INT,FOLLOW_INT_in_tipo576); 
                    INT32_tree = 
                    (BytecodesAST)adaptor.create(INT32)
                    ;
                    adaptor.addChild(root_0, INT32_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:68:14: VOID
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    VOID33=(Token)match(input,VOID,FOLLOW_VOID_in_tipo580); 
                    VOID33_tree = 
                    (BytecodesAST)adaptor.create(VOID33)
                    ;
                    adaptor.addChild(root_0, VOID33_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:68:21: tipoRef
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    pushFollow(FOLLOW_tipoRef_in_tipo584);
                    tipoRef34=tipoRef();

                    state._fsp--;

                    adaptor.addChild(root_0, tipoRef34.getTree());

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
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:70:1: aritmetica : (a= 'iadd' |a= 'isub' |a= 'imul' |a= 'idiv' |a= 'irem' |a= 'iinc' |a= 'ineg' );
    public final AssemblerParser.aritmetica_return aritmetica() throws RecognitionException {
        AssemblerParser.aritmetica_return retval = new AssemblerParser.aritmetica_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;

        BytecodesAST a_tree=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:70:12: (a= 'iadd' |a= 'isub' |a= 'imul' |a= 'idiv' |a= 'irem' |a= 'iinc' |a= 'ineg' )
            int alt9=7;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt9=1;
                }
                break;
            case 74:
                {
                alt9=2;
                }
                break;
            case 64:
                {
                alt9=3;
                }
                break;
            case 45:
                {
                alt9=4;
                }
                break;
            case 68:
                {
                alt9=5;
                }
                break;
            case 58:
                {
                alt9=6;
                }
                break;
            case 65:
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
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:70:14: a= 'iadd'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,36,FOLLOW_36_in_aritmetica597); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    escreverOpcode(a);

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:71:14: a= 'isub'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,74,FOLLOW_74_in_aritmetica618); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    escreverOpcode(a);

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:72:14: a= 'imul'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,64,FOLLOW_64_in_aritmetica639); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    escreverOpcode(a);

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:73:14: a= 'idiv'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,45,FOLLOW_45_in_aritmetica660); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    escreverOpcode(a);

                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:74:14: a= 'irem'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,68,FOLLOW_68_in_aritmetica681); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    escreverOpcode(a);

                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:75:14: a= 'iinc'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,58,FOLLOW_58_in_aritmetica702); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    escreverOpcode(a);

                    }
                    break;
                case 7 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:76:14: a= 'ineg'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,65,FOLLOW_65_in_aritmetica723); 
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
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:79:1: load : (a= 'iconst_m1' |a= 'iconst_0' |a= 'iconst_1' |a= 'iconst_2' |a= 'iconst_3' |a= 'iconst_4' |a= 'iconst_5' |a= 'iload_0' |a= 'iload_1' |a= 'iload_2' |a= 'iload_3' |a= 'iload' INTEIRO |a= 'ldc' INTEIRO |a= 'aload' INTEIRO |a= 'aload_0' |a= 'aload_1' |a= 'aload_2' |a= 'aload_3' );
    public final AssemblerParser.load_return load() throws RecognitionException, LabelException {
        AssemblerParser.load_return retval = new AssemblerParser.load_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;
        Token INTEIRO35=null;
        Token INTEIRO36=null;
        Token INTEIRO37=null;

        BytecodesAST a_tree=null;
        BytecodesAST INTEIRO35_tree=null;
        BytecodesAST INTEIRO36_tree=null;
        BytecodesAST INTEIRO37_tree=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:79:6: (a= 'iconst_m1' |a= 'iconst_0' |a= 'iconst_1' |a= 'iconst_2' |a= 'iconst_3' |a= 'iconst_4' |a= 'iconst_5' |a= 'iload_0' |a= 'iload_1' |a= 'iload_2' |a= 'iload_3' |a= 'iload' INTEIRO |a= 'ldc' INTEIRO |a= 'aload' INTEIRO |a= 'aload_0' |a= 'aload_1' |a= 'aload_2' |a= 'aload_3' )
            int alt10=18;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt10=1;
                }
                break;
            case 38:
                {
                alt10=2;
                }
                break;
            case 39:
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
            case 43:
                {
                alt10=7;
                }
                break;
            case 60:
                {
                alt10=8;
                }
                break;
            case 61:
                {
                alt10=9;
                }
                break;
            case 62:
                {
                alt10=10;
                }
                break;
            case 63:
                {
                alt10=11;
                }
                break;
            case 59:
                {
                alt10=12;
                }
                break;
            case 76:
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
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:79:8: a= 'iconst_m1'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,44,FOLLOW_44_in_load760); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    escreverOpcode(a);

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:80:8: a= 'iconst_0'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,38,FOLLOW_38_in_load774); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    escreverOpcode(a);

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:81:8: a= 'iconst_1'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,39,FOLLOW_39_in_load789); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    escreverOpcode(a);

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:82:8: a= 'iconst_2'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,40,FOLLOW_40_in_load804); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    escreverOpcode(a);

                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:83:8: a= 'iconst_3'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,41,FOLLOW_41_in_load819); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    escreverOpcode(a);

                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:84:8: a= 'iconst_4'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,42,FOLLOW_42_in_load833); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    escreverOpcode(a);

                    }
                    break;
                case 7 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:85:8: a= 'iconst_5'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,43,FOLLOW_43_in_load847); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    escreverOpcode(a);

                    }
                    break;
                case 8 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:86:8: a= 'iload_0'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,60,FOLLOW_60_in_load861); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    escreverOpcode(a);

                    }
                    break;
                case 9 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:87:8: a= 'iload_1'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,61,FOLLOW_61_in_load876); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    escreverOpcode(a);

                    }
                    break;
                case 10 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:88:8: a= 'iload_2'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,62,FOLLOW_62_in_load891); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    escreverOpcode(a);

                    }
                    break;
                case 11 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:89:8: a= 'iload_3'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,63,FOLLOW_63_in_load906); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    escreverOpcode(a);

                    }
                    break;
                case 12 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:90:8: a= 'iload' INTEIRO
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,59,FOLLOW_59_in_load921); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    INTEIRO35=(Token)match(input,INTEIRO,FOLLOW_INTEIRO_in_load923); 
                    INTEIRO35_tree = 
                    (BytecodesAST)adaptor.create(INTEIRO35)
                    ;
                    adaptor.addChild(root_0, INTEIRO35_tree);


                    escreverOpcode(a, INTEIRO35);

                    }
                    break;
                case 13 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:91:8: a= 'ldc' INTEIRO
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,76,FOLLOW_76_in_load938); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    INTEIRO36=(Token)match(input,INTEIRO,FOLLOW_INTEIRO_in_load940); 
                    INTEIRO36_tree = 
                    (BytecodesAST)adaptor.create(INTEIRO36)
                    ;
                    adaptor.addChild(root_0, INTEIRO36_tree);


                    escreverOpcode(a, INTEIRO36);

                    }
                    break;
                case 14 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:92:8: a= 'aload' INTEIRO
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,24,FOLLOW_24_in_load955); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    INTEIRO37=(Token)match(input,INTEIRO,FOLLOW_INTEIRO_in_load957); 
                    INTEIRO37_tree = 
                    (BytecodesAST)adaptor.create(INTEIRO37)
                    ;
                    adaptor.addChild(root_0, INTEIRO37_tree);


                    escreverOpcode(a, INTEIRO37);

                    }
                    break;
                case 15 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:93:8: a= 'aload_0'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,25,FOLLOW_25_in_load972); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    escreverOpcode(a);

                    }
                    break;
                case 16 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:94:8: a= 'aload_1'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,26,FOLLOW_26_in_load987); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    escreverOpcode(a);

                    }
                    break;
                case 17 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:95:8: a= 'aload_2'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,27,FOLLOW_27_in_load1002); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    escreverOpcode(a);

                    }
                    break;
                case 18 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:96:8: a= 'aload_3'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,28,FOLLOW_28_in_load1016); 
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
    // $ANTLR end "load"


    public static class store_return extends ParserRuleReturnScope {
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "store"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:99:1: store : (a= 'istore_0' |a= 'istore_1' |a= 'istore_2' |a= 'istore_3' |a= 'istore' INTEIRO |a= 'astore' INTEIRO |a= 'astore_0' |a= 'astore_1' |a= 'astore_2' |a= 'astore_3' );
    public final AssemblerParser.store_return store() throws RecognitionException, AcessoIndevidoMemoriaException, LabelException {
        AssemblerParser.store_return retval = new AssemblerParser.store_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;
        Token INTEIRO38=null;
        Token INTEIRO39=null;

        BytecodesAST a_tree=null;
        BytecodesAST INTEIRO38_tree=null;
        BytecodesAST INTEIRO39_tree=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:99:7: (a= 'istore_0' |a= 'istore_1' |a= 'istore_2' |a= 'istore_3' |a= 'istore' INTEIRO |a= 'astore' INTEIRO |a= 'astore_0' |a= 'astore_1' |a= 'astore_2' |a= 'astore_3' )
            int alt11=10;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt11=1;
                }
                break;
            case 71:
                {
                alt11=2;
                }
                break;
            case 72:
                {
                alt11=3;
                }
                break;
            case 73:
                {
                alt11=4;
                }
                break;
            case 69:
                {
                alt11=5;
                }
                break;
            case 29:
                {
                alt11=6;
                }
                break;
            case 30:
                {
                alt11=7;
                }
                break;
            case 31:
                {
                alt11=8;
                }
                break;
            case 32:
                {
                alt11=9;
                }
                break;
            case 33:
                {
                alt11=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }

            switch (alt11) {
                case 1 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:99:9: a= 'istore_0'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,70,FOLLOW_70_in_store1040); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    verificarAumentoMemoriaGlobal(a);

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:100:9: a= 'istore_1'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,71,FOLLOW_71_in_store1056); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    verificarAumentoMemoriaGlobal(a);

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:101:9: a= 'istore_2'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,72,FOLLOW_72_in_store1072); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    verificarAumentoMemoriaGlobal(a);

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:102:9: a= 'istore_3'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,73,FOLLOW_73_in_store1088); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    verificarAumentoMemoriaGlobal(a);

                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:103:9: a= 'istore' INTEIRO
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,69,FOLLOW_69_in_store1104); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    INTEIRO38=(Token)match(input,INTEIRO,FOLLOW_INTEIRO_in_store1106); 
                    INTEIRO38_tree = 
                    (BytecodesAST)adaptor.create(INTEIRO38)
                    ;
                    adaptor.addChild(root_0, INTEIRO38_tree);


                    verificarAumentoMemoriaGlobal(a, INTEIRO38);

                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:104:9: a= 'astore' INTEIRO
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,29,FOLLOW_29_in_store1122); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    INTEIRO39=(Token)match(input,INTEIRO,FOLLOW_INTEIRO_in_store1124); 
                    INTEIRO39_tree = 
                    (BytecodesAST)adaptor.create(INTEIRO39)
                    ;
                    adaptor.addChild(root_0, INTEIRO39_tree);


                    verificarAumentoMemoriaGlobal(a, INTEIRO39);

                    }
                    break;
                case 7 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:105:9: a= 'astore_0'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,30,FOLLOW_30_in_store1140); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    verificarAumentoMemoriaGlobal(a);

                    }
                    break;
                case 8 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:106:9: a= 'astore_1'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,31,FOLLOW_31_in_store1156); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    verificarAumentoMemoriaGlobal(a);

                    }
                    break;
                case 9 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:107:9: a= 'astore_2'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,32,FOLLOW_32_in_store1172); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    verificarAumentoMemoriaGlobal(a);

                    }
                    break;
                case 10 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:108:9: a= 'astore_3'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,33,FOLLOW_33_in_store1188); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    verificarAumentoMemoriaGlobal(a);

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
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:111:1: logica : (a= 'iand' |a= 'ior' |a= 'ixor' );
    public final AssemblerParser.logica_return logica() throws RecognitionException {
        AssemblerParser.logica_return retval = new AssemblerParser.logica_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;

        BytecodesAST a_tree=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:111:8: (a= 'iand' |a= 'ior' |a= 'ixor' )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt12=1;
                }
                break;
            case 67:
                {
                alt12=2;
                }
                break;
            case 75:
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
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:111:10: a= 'iand'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,37,FOLLOW_37_in_logica1209); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    escreverOpcode(a);

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:112:10: a= 'ior'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,67,FOLLOW_67_in_logica1226); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    escreverOpcode(a);

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:113:10: a= 'ixor'
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,75,FOLLOW_75_in_logica1243); 
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
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:116:1: desvio : (a= 'ifeq' b= ID |a= 'ifne' b= ID |a= 'iflt' b= ID |a= 'ifge' b= ID |a= 'ifgt' b= ID |a= 'ifle' b= ID |a= 'if_icmpeq' b= ID |a= 'if_icmpne' b= ID |a= 'if_icmplt' b= ID |a= 'if_icmpge' b= ID |a= 'if_icmpgt' b= ID |a= 'if_icmple' b= ID |a= 'goto' b= ID );
    public final AssemblerParser.desvio_return desvio() throws RecognitionException, LabelException {
        AssemblerParser.desvio_return retval = new AssemblerParser.desvio_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;
        Token b=null;

        BytecodesAST a_tree=null;
        BytecodesAST b_tree=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:116:8: (a= 'ifeq' b= ID |a= 'ifne' b= ID |a= 'iflt' b= ID |a= 'ifge' b= ID |a= 'ifgt' b= ID |a= 'ifle' b= ID |a= 'if_icmpeq' b= ID |a= 'if_icmpne' b= ID |a= 'if_icmplt' b= ID |a= 'if_icmpge' b= ID |a= 'if_icmpgt' b= ID |a= 'if_icmple' b= ID |a= 'goto' b= ID )
            int alt13=13;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt13=1;
                }
                break;
            case 57:
                {
                alt13=2;
                }
                break;
            case 56:
                {
                alt13=3;
                }
                break;
            case 53:
                {
                alt13=4;
                }
                break;
            case 54:
                {
                alt13=5;
                }
                break;
            case 55:
                {
                alt13=6;
                }
                break;
            case 46:
                {
                alt13=7;
                }
                break;
            case 51:
                {
                alt13=8;
                }
                break;
            case 50:
                {
                alt13=9;
                }
                break;
            case 47:
                {
                alt13=10;
                }
                break;
            case 48:
                {
                alt13=11;
                }
                break;
            case 49:
                {
                alt13=12;
                }
                break;
            case 35:
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
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:116:10: a= 'ifeq' b= ID
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,52,FOLLOW_52_in_desvio1265); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio1271); 
                    b_tree = 
                    (BytecodesAST)adaptor.create(b)
                    ;
                    adaptor.addChild(root_0, b_tree);


                    escreverOpcode(a, b);

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:117:10: a= 'ifne' b= ID
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,57,FOLLOW_57_in_desvio1288); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio1294); 
                    b_tree = 
                    (BytecodesAST)adaptor.create(b)
                    ;
                    adaptor.addChild(root_0, b_tree);


                    escreverOpcode(a, b);

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:118:10: a= 'iflt' b= ID
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,56,FOLLOW_56_in_desvio1311); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio1317); 
                    b_tree = 
                    (BytecodesAST)adaptor.create(b)
                    ;
                    adaptor.addChild(root_0, b_tree);


                    escreverOpcode(a, b);

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:119:10: a= 'ifge' b= ID
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,53,FOLLOW_53_in_desvio1334); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio1340); 
                    b_tree = 
                    (BytecodesAST)adaptor.create(b)
                    ;
                    adaptor.addChild(root_0, b_tree);


                    escreverOpcode(a, b);

                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:120:10: a= 'ifgt' b= ID
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,54,FOLLOW_54_in_desvio1357); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio1363); 
                    b_tree = 
                    (BytecodesAST)adaptor.create(b)
                    ;
                    adaptor.addChild(root_0, b_tree);


                    escreverOpcode(a, b);

                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:121:10: a= 'ifle' b= ID
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,55,FOLLOW_55_in_desvio1380); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio1386); 
                    b_tree = 
                    (BytecodesAST)adaptor.create(b)
                    ;
                    adaptor.addChild(root_0, b_tree);


                    escreverOpcode(a, b);

                    }
                    break;
                case 7 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:122:10: a= 'if_icmpeq' b= ID
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,46,FOLLOW_46_in_desvio1403); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio1409); 
                    b_tree = 
                    (BytecodesAST)adaptor.create(b)
                    ;
                    adaptor.addChild(root_0, b_tree);


                    escreverOpcode(a, b);

                    }
                    break;
                case 8 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:123:10: a= 'if_icmpne' b= ID
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,51,FOLLOW_51_in_desvio1426); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio1432); 
                    b_tree = 
                    (BytecodesAST)adaptor.create(b)
                    ;
                    adaptor.addChild(root_0, b_tree);


                    escreverOpcode(a, b);

                    }
                    break;
                case 9 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:124:10: a= 'if_icmplt' b= ID
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,50,FOLLOW_50_in_desvio1449); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio1455); 
                    b_tree = 
                    (BytecodesAST)adaptor.create(b)
                    ;
                    adaptor.addChild(root_0, b_tree);


                    escreverOpcode(a, b);

                    }
                    break;
                case 10 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:125:10: a= 'if_icmpge' b= ID
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,47,FOLLOW_47_in_desvio1472); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio1478); 
                    b_tree = 
                    (BytecodesAST)adaptor.create(b)
                    ;
                    adaptor.addChild(root_0, b_tree);


                    escreverOpcode(a, b);

                    }
                    break;
                case 11 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:126:10: a= 'if_icmpgt' b= ID
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,48,FOLLOW_48_in_desvio1495); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio1501); 
                    b_tree = 
                    (BytecodesAST)adaptor.create(b)
                    ;
                    adaptor.addChild(root_0, b_tree);


                    escreverOpcode(a, b);

                    }
                    break;
                case 12 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:127:10: a= 'if_icmple' b= ID
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,49,FOLLOW_49_in_desvio1518); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio1524); 
                    b_tree = 
                    (BytecodesAST)adaptor.create(b)
                    ;
                    adaptor.addChild(root_0, b_tree);


                    escreverOpcode(a, b);

                    }
                    break;
                case 13 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:128:10: a= 'goto' b= ID
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    a=(Token)match(input,35,FOLLOW_35_in_desvio1541); 
                    a_tree = 
                    (BytecodesAST)adaptor.create(a)
                    ;
                    adaptor.addChild(root_0, a_tree);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio1547); 
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


    public static class construtorDefault_return extends ParserRuleReturnScope {
        public List classe;
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "construtorDefault"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:131:1: construtorDefault returns [List classe] : (cls+= ID '/' )+ INIT '()' ;
    public final AssemblerParser.construtorDefault_return construtorDefault() throws RecognitionException {
        AssemblerParser.construtorDefault_return retval = new AssemblerParser.construtorDefault_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token char_literal40=null;
        Token INIT41=null;
        Token string_literal42=null;
        Token cls=null;
        List list_cls=null;

        BytecodesAST char_literal40_tree=null;
        BytecodesAST INIT41_tree=null;
        BytecodesAST string_literal42_tree=null;
        BytecodesAST cls_tree=null;


                retval.classe = new ArrayList();
             
        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:135:6: ( (cls+= ID '/' )+ INIT '()' )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:135:8: (cls+= ID '/' )+ INIT '()'
            {
            root_0 = (BytecodesAST)adaptor.nil();


            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:135:8: (cls+= ID '/' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:135:9: cls+= ID '/'
            	    {
            	    cls=(Token)match(input,ID,FOLLOW_ID_in_construtorDefault1589); 
            	    cls_tree = 
            	    (BytecodesAST)adaptor.create(cls)
            	    ;
            	    adaptor.addChild(root_0, cls_tree);

            	    if (list_cls==null) list_cls=new ArrayList();
            	    list_cls.add(cls);


            	    char_literal40=(Token)match(input,21,FOLLOW_21_in_construtorDefault1591); 
            	    char_literal40_tree = 
            	    (BytecodesAST)adaptor.create(char_literal40)
            	    ;
            	    adaptor.addChild(root_0, char_literal40_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            INIT41=(Token)match(input,INIT,FOLLOW_INIT_in_construtorDefault1595); 
            INIT41_tree = 
            (BytecodesAST)adaptor.create(INIT41)
            ;
            adaptor.addChild(root_0, INIT41_tree);


            string_literal42=(Token)match(input,16,FOLLOW_16_in_construtorDefault1597); 
            string_literal42_tree = 
            (BytecodesAST)adaptor.create(string_literal42)
            ;
            adaptor.addChild(root_0, string_literal42_tree);


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
    // $ANTLR end "construtorDefault"


    public static class campo_return extends ParserRuleReturnScope {
        public List classe;
        public String campo;
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "campo"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:138:1: campo returns [List classe, String campo] : (cls+= ID '/' )+ cmp= ID ;
    public final AssemblerParser.campo_return campo() throws RecognitionException {
        AssemblerParser.campo_return retval = new AssemblerParser.campo_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token cmp=null;
        Token char_literal43=null;
        Token cls=null;
        List list_cls=null;

        BytecodesAST cmp_tree=null;
        BytecodesAST char_literal43_tree=null;
        BytecodesAST cls_tree=null;


                retval.classe = new ArrayList();
                retval.campo ="";
             
        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:143:6: ( (cls+= ID '/' )+ cmp= ID )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:143:8: (cls+= ID '/' )+ cmp= ID
            {
            root_0 = (BytecodesAST)adaptor.nil();


            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:143:8: (cls+= ID '/' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==ID) ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1==21) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:143:9: cls+= ID '/'
            	    {
            	    cls=(Token)match(input,ID,FOLLOW_ID_in_campo1637); 
            	    cls_tree = 
            	    (BytecodesAST)adaptor.create(cls)
            	    ;
            	    adaptor.addChild(root_0, cls_tree);

            	    if (list_cls==null) list_cls=new ArrayList();
            	    list_cls.add(cls);


            	    char_literal43=(Token)match(input,21,FOLLOW_21_in_campo1639); 
            	    char_literal43_tree = 
            	    (BytecodesAST)adaptor.create(char_literal43)
            	    ;
            	    adaptor.addChild(root_0, char_literal43_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            cmp=(Token)match(input,ID,FOLLOW_ID_in_campo1647); 
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


    public static class tipoRef_return extends ParserRuleReturnScope {
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tipoRef"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:146:1: tipoRef : 'L' ( ID '/' )* ID ;
    public final AssemblerParser.tipoRef_return tipoRef() throws RecognitionException {
        AssemblerParser.tipoRef_return retval = new AssemblerParser.tipoRef_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token char_literal44=null;
        Token ID45=null;
        Token char_literal46=null;
        Token ID47=null;

        BytecodesAST char_literal44_tree=null;
        BytecodesAST ID45_tree=null;
        BytecodesAST char_literal46_tree=null;
        BytecodesAST ID47_tree=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:146:9: ( 'L' ( ID '/' )* ID )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:146:11: 'L' ( ID '/' )* ID
            {
            root_0 = (BytecodesAST)adaptor.nil();


            char_literal44=(Token)match(input,23,FOLLOW_23_in_tipoRef1663); 
            char_literal44_tree = 
            (BytecodesAST)adaptor.create(char_literal44)
            ;
            adaptor.addChild(root_0, char_literal44_tree);


            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:146:15: ( ID '/' )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==ID) ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1==21) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:146:16: ID '/'
            	    {
            	    ID45=(Token)match(input,ID,FOLLOW_ID_in_tipoRef1666); 
            	    ID45_tree = 
            	    (BytecodesAST)adaptor.create(ID45)
            	    ;
            	    adaptor.addChild(root_0, ID45_tree);


            	    char_literal46=(Token)match(input,21,FOLLOW_21_in_tipoRef1668); 
            	    char_literal46_tree = 
            	    (BytecodesAST)adaptor.create(char_literal46)
            	    ;
            	    adaptor.addChild(root_0, char_literal46_tree);


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            ID47=(Token)match(input,ID,FOLLOW_ID_in_tipoRef1672); 
            ID47_tree = 
            (BytecodesAST)adaptor.create(ID47)
            ;
            adaptor.addChild(root_0, ID47_tree);


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
    // $ANTLR end "tipoRef"

    // Delegated rules


 

    public static final BitSet FOLLOW_comando_in_programa77 = new BitSet(new long[]{0xFFFFFFFFFF0A1082L,0x000000000001FFFFL});
    public static final BitSet FOLLOW_label_in_comando97 = new BitSet(new long[]{0xFFFFFFFFFF0A1000L,0x000000000001FFFFL});
    public static final BitSet FOLLOW_instrucao_in_comando99 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instrucao_in_comando103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_label125 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_label127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definicaoClasse_in_instrucao137 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_manipulacaoObjetos_in_instrucao141 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_aritmetica_in_instrucao145 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_load_in_instrucao149 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_store_in_instrucao153 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_desvio_in_instrucao157 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_logica_in_instrucao161 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_77_in_instrucao184 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_78_in_instrucao206 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_79_in_instrucao230 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_NOVA_LINHA_in_instrucao250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_definicaoClasse272 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_definicaoClasse274 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_NOVA_LINHA_in_definicaoClasse276 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_superClasse_in_definicaoClasse278 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_membroClasse_in_definicaoClasse281 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_19_in_definicaoClasse340 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_INIT_in_definicaoClasse342 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_definicaoClasse344 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_VOID_in_definicaoClasse346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_superClasse387 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_superClasse389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_membroClasse406 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_membroClasse408 = new BitSet(new long[]{0x0000000000804200L});
    public static final BitSet FOLLOW_tipo_in_membroClasse410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_manipulacaoObjetos462 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_campo_in_manipulacaoObjetos468 = new BitSet(new long[]{0x0000000000804200L});
    public static final BitSet FOLLOW_tipo_in_manipulacaoObjetos470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_manipulacaoObjetos499 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_campo_in_manipulacaoObjetos505 = new BitSet(new long[]{0x0000000000804200L});
    public static final BitSet FOLLOW_tipo_in_manipulacaoObjetos507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_manipulacaoObjetos536 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_construtorDefault_in_manipulacaoObjetos542 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_VOID_in_manipulacaoObjetos544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_tipo576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_tipo580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tipoRef_in_tipo584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_aritmetica597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_aritmetica618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_aritmetica639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_aritmetica660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_aritmetica681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_aritmetica702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_aritmetica723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_load760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_load774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_load789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_load804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_load819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_load833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_load847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_load861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_load876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_load891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_load906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_load921 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_INTEIRO_in_load923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_load938 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_INTEIRO_in_load940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_load955 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_INTEIRO_in_load957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_load972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_load987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_load1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_load1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_store1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_store1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_store1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_store1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_store1104 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_INTEIRO_in_store1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_store1122 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_INTEIRO_in_store1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_store1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_store1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_store1172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_store1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_logica1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_logica1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_logica1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_desvio1265 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_desvio1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_desvio1288 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_desvio1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_desvio1311 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_desvio1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_desvio1334 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_desvio1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_desvio1357 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_desvio1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_desvio1380 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_desvio1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_desvio1403 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_desvio1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_desvio1426 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_desvio1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_desvio1449 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_desvio1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_desvio1472 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_desvio1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_desvio1495 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_desvio1501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_desvio1518 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_desvio1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_desvio1541 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_desvio1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_construtorDefault1589 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_construtorDefault1591 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_INIT_in_construtorDefault1595 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_construtorDefault1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_campo1637 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_campo1639 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_campo1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_tipoRef1663 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_tipoRef1666 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_tipoRef1668 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_tipoRef1672 = new BitSet(new long[]{0x0000000000000002L});

}