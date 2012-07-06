// $ANTLR 3.4 C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g 2012-07-06 18:34:38

  package br.ufpb.iged.interpretador.parser;
  
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARITMETICA", "DESVIO", "EXTENDS", "FIELD_DECL", "ID", "INIT", "INT", "INTEIRO", "LABEL", "LOAD", "LOGICA", "MEMBRO_CLASSE", "NOVA_LINHA", "NULL", "PILHA", "STORE", "VOID", "WS", "'()'", "'.class'", "'.field'", "'.method'", "'.super'", "'/'", "':'", "'L'", "'aload'", "'aload_0'", "'aload_1'", "'aload_2'", "'aload_3'", "'astore'", "'astore_0'", "'astore_1'", "'astore_2'", "'astore_3'", "'getfield'", "'goto'", "'iadd'", "'iand'", "'iconst_0'", "'iconst_1'", "'iconst_2'", "'iconst_3'", "'iconst_4'", "'iconst_5'", "'iconst_m1'", "'idiv'", "'if_icmpeq'", "'if_icmpge'", "'if_icmpgt'", "'if_icmple'", "'if_icmplt'", "'if_icmpne'", "'ifeq'", "'ifge'", "'ifgt'", "'ifle'", "'iflt'", "'ifne'", "'iinc'", "'iload'", "'iload_0'", "'iload_1'", "'iload_2'", "'iload_3'", "'imul'", "'ineg'", "'invokespecial'", "'ior'", "'irem'", "'istore'", "'istore_0'", "'istore_1'", "'istore_2'", "'istore_3'", "'isub'", "'ixor'", "'ldc'", "'nop'", "'pop'", "'pop2'", "'putfield'"
    };

    public static final int EOF=-1;
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
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int ARITMETICA=4;
    public static final int DESVIO=5;
    public static final int EXTENDS=6;
    public static final int FIELD_DECL=7;
    public static final int ID=8;
    public static final int INIT=9;
    public static final int INT=10;
    public static final int INTEIRO=11;
    public static final int LABEL=12;
    public static final int LOAD=13;
    public static final int LOGICA=14;
    public static final int MEMBRO_CLASSE=15;
    public static final int NOVA_LINHA=16;
    public static final int NULL=17;
    public static final int PILHA=18;
    public static final int STORE=19;
    public static final int VOID=20;
    public static final int WS=21;

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



      public abstract void escreverOpcode(String nomeInstrucao);
      public abstract void escreverOpcode(Token opc, Token op) throws LabelException;
      public abstract void verificarAumentoMemoriaGlobal(Token opc) throws AcessoIndevidoMemoriaException;
      public abstract void verificarAumentoMemoriaGlobal(Token opc, Token op) throws AcessoIndevidoMemoriaException, LabelException;
      public abstract void definirLabel(Token id) throws LabelException;
      


    public static class programa_return extends ParserRuleReturnScope {
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "programa"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:43:1: programa : ( comando )* ;
    public final AssemblerParser.programa_return programa() throws RecognitionException {
        AssemblerParser.programa_return retval = new AssemblerParser.programa_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        AssemblerParser.comando_return comando1 =null;



        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:43:10: ( ( comando )* )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:43:12: ( comando )*
            {
            root_0 = (BytecodesAST)adaptor.nil();


            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:43:12: ( comando )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==ID||LA1_0==NOVA_LINHA||LA1_0==23||LA1_0==25||(LA1_0 >= 30 && LA1_0 <= 86)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:43:12: comando
            	    {
            	    pushFollow(FOLLOW_comando_in_programa107);
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
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:46:1: comando : ( label instrucao | instrucao ) ;
    public final AssemblerParser.comando_return comando() throws RecognitionException {
        AssemblerParser.comando_return retval = new AssemblerParser.comando_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        AssemblerParser.label_return label2 =null;

        AssemblerParser.instrucao_return instrucao3 =null;

        AssemblerParser.instrucao_return instrucao4 =null;



        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:46:9: ( ( label instrucao | instrucao ) )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:46:11: ( label instrucao | instrucao )
            {
            root_0 = (BytecodesAST)adaptor.nil();


            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:46:11: ( label instrucao | instrucao )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==NOVA_LINHA||LA2_0==23||LA2_0==25||(LA2_0 >= 30 && LA2_0 <= 86)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:46:12: label instrucao
                    {
                    pushFollow(FOLLOW_label_in_comando127);
                    label2=label();

                    state._fsp--;

                    adaptor.addChild(root_0, label2.getTree());

                    pushFollow(FOLLOW_instrucao_in_comando129);
                    instrucao3=instrucao();

                    state._fsp--;

                    adaptor.addChild(root_0, instrucao3.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:46:30: instrucao
                    {
                    pushFollow(FOLLOW_instrucao_in_comando133);
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
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:48:1: label : a= ID ':' -> ^( LABEL $a) ;
    public final AssemblerParser.label_return label() throws RecognitionException {
        AssemblerParser.label_return retval = new AssemblerParser.label_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;
        Token char_literal5=null;

        BytecodesAST a_tree=null;
        BytecodesAST char_literal5_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:48:7: (a= ID ':' -> ^( LABEL $a) )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:48:9: a= ID ':'
            {
            a=(Token)match(input,ID,FOLLOW_ID_in_label155);  
            stream_ID.add(a);


            char_literal5=(Token)match(input,28,FOLLOW_28_in_label157);  
            stream_28.add(char_literal5);


            // AST REWRITE
            // elements: a
            // token labels: a
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_a=new RewriteRuleTokenStream(adaptor,"token a",a);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BytecodesAST)adaptor.nil();
            // 48:20: -> ^( LABEL $a)
            {
                // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:48:23: ^( LABEL $a)
                {
                BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                root_1 = (BytecodesAST)adaptor.becomeRoot(
                (BytecodesAST)adaptor.create(LABEL, "LABEL")
                , root_1);

                adaptor.addChild(root_1, stream_a.nextNode());

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
    // $ANTLR end "label"


    public static class instrucao_return extends ParserRuleReturnScope {
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instrucao"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:50:1: instrucao : ( definicaoClasse | manipulacaoObjetos | aritmetica | load | loadint | store | storeint | desvio | logica | pilha | 'nop' )? NOVA_LINHA ;
    public final AssemblerParser.instrucao_return instrucao() throws RecognitionException {
        AssemblerParser.instrucao_return retval = new AssemblerParser.instrucao_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token string_literal16=null;
        Token NOVA_LINHA17=null;
        AssemblerParser.definicaoClasse_return definicaoClasse6 =null;

        AssemblerParser.manipulacaoObjetos_return manipulacaoObjetos7 =null;

        AssemblerParser.aritmetica_return aritmetica8 =null;

        AssemblerParser.load_return load9 =null;

        AssemblerParser.loadint_return loadint10 =null;

        AssemblerParser.store_return store11 =null;

        AssemblerParser.storeint_return storeint12 =null;

        AssemblerParser.desvio_return desvio13 =null;

        AssemblerParser.logica_return logica14 =null;

        AssemblerParser.pilha_return pilha15 =null;


        BytecodesAST string_literal16_tree=null;
        BytecodesAST NOVA_LINHA17_tree=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:50:10: ( ( definicaoClasse | manipulacaoObjetos | aritmetica | load | loadint | store | storeint | desvio | logica | pilha | 'nop' )? NOVA_LINHA )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:50:12: ( definicaoClasse | manipulacaoObjetos | aritmetica | load | loadint | store | storeint | desvio | logica | pilha | 'nop' )? NOVA_LINHA
            {
            root_0 = (BytecodesAST)adaptor.nil();


            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:50:12: ( definicaoClasse | manipulacaoObjetos | aritmetica | load | loadint | store | storeint | desvio | logica | pilha | 'nop' )?
            int alt3=12;
            switch ( input.LA(1) ) {
                case 23:
                case 25:
                    {
                    alt3=1;
                    }
                    break;
                case 40:
                case 72:
                case 86:
                    {
                    alt3=2;
                    }
                    break;
                case 42:
                case 51:
                case 64:
                case 70:
                case 71:
                case 74:
                case 80:
                    {
                    alt3=3;
                    }
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 66:
                case 67:
                case 68:
                case 69:
                    {
                    alt3=4;
                    }
                    break;
                case 30:
                case 65:
                case 82:
                    {
                    alt3=5;
                    }
                    break;
                case 36:
                case 37:
                case 38:
                case 39:
                case 76:
                case 77:
                case 78:
                case 79:
                    {
                    alt3=6;
                    }
                    break;
                case 35:
                case 75:
                    {
                    alt3=7;
                    }
                    break;
                case 41:
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
                    {
                    alt3=8;
                    }
                    break;
                case 43:
                case 73:
                case 81:
                    {
                    alt3=9;
                    }
                    break;
                case 84:
                case 85:
                    {
                    alt3=10;
                    }
                    break;
                case 83:
                    {
                    alt3=11;
                    }
                    break;
            }

            switch (alt3) {
                case 1 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:50:17: definicaoClasse
                    {
                    pushFollow(FOLLOW_definicaoClasse_in_instrucao178);
                    definicaoClasse6=definicaoClasse();

                    state._fsp--;

                    adaptor.addChild(root_0, definicaoClasse6.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:51:17: manipulacaoObjetos
                    {
                    pushFollow(FOLLOW_manipulacaoObjetos_in_instrucao197);
                    manipulacaoObjetos7=manipulacaoObjetos();

                    state._fsp--;

                    adaptor.addChild(root_0, manipulacaoObjetos7.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:52:17: aritmetica
                    {
                    pushFollow(FOLLOW_aritmetica_in_instrucao216);
                    aritmetica8=aritmetica();

                    state._fsp--;

                    adaptor.addChild(root_0, aritmetica8.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:53:17: load
                    {
                    pushFollow(FOLLOW_load_in_instrucao235);
                    load9=load();

                    state._fsp--;

                    adaptor.addChild(root_0, load9.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:54:17: loadint
                    {
                    pushFollow(FOLLOW_loadint_in_instrucao253);
                    loadint10=loadint();

                    state._fsp--;

                    adaptor.addChild(root_0, loadint10.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:55:17: store
                    {
                    pushFollow(FOLLOW_store_in_instrucao272);
                    store11=store();

                    state._fsp--;

                    adaptor.addChild(root_0, store11.getTree());

                    }
                    break;
                case 7 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:56:17: storeint
                    {
                    pushFollow(FOLLOW_storeint_in_instrucao290);
                    storeint12=storeint();

                    state._fsp--;

                    adaptor.addChild(root_0, storeint12.getTree());

                    }
                    break;
                case 8 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:57:17: desvio
                    {
                    pushFollow(FOLLOW_desvio_in_instrucao309);
                    desvio13=desvio();

                    state._fsp--;

                    adaptor.addChild(root_0, desvio13.getTree());

                    }
                    break;
                case 9 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:58:17: logica
                    {
                    pushFollow(FOLLOW_logica_in_instrucao328);
                    logica14=logica();

                    state._fsp--;

                    adaptor.addChild(root_0, logica14.getTree());

                    }
                    break;
                case 10 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:59:17: pilha
                    {
                    pushFollow(FOLLOW_pilha_in_instrucao346);
                    pilha15=pilha();

                    state._fsp--;

                    adaptor.addChild(root_0, pilha15.getTree());

                    }
                    break;
                case 11 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:60:17: 'nop'
                    {
                    string_literal16=(Token)match(input,83,FOLLOW_83_in_instrucao365); 
                    string_literal16_tree = 
                    (BytecodesAST)adaptor.create(string_literal16)
                    ;
                    adaptor.addChild(root_0, string_literal16_tree);


                    }
                    break;

            }


            NOVA_LINHA17=(Token)match(input,NOVA_LINHA,FOLLOW_NOVA_LINHA_in_instrucao381); 
            NOVA_LINHA17_tree = 
            (BytecodesAST)adaptor.create(NOVA_LINHA17)
            ;
            adaptor.addChild(root_0, NOVA_LINHA17_tree);


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
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:63:1: definicaoClasse : ( '.class' ID NOVA_LINHA ( superClasse )? ( membroClasse )+ -> ^( '.class' ID ( superClasse )? ^( MEMBRO_CLASSE ( membroClasse )+ ) ) | '.method' INIT '()' VOID );
    public final AssemblerParser.definicaoClasse_return definicaoClasse() throws RecognitionException {
        AssemblerParser.definicaoClasse_return retval = new AssemblerParser.definicaoClasse_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token string_literal18=null;
        Token ID19=null;
        Token NOVA_LINHA20=null;
        Token string_literal23=null;
        Token INIT24=null;
        Token string_literal25=null;
        Token VOID26=null;
        AssemblerParser.superClasse_return superClasse21 =null;

        AssemblerParser.membroClasse_return membroClasse22 =null;


        BytecodesAST string_literal18_tree=null;
        BytecodesAST ID19_tree=null;
        BytecodesAST NOVA_LINHA20_tree=null;
        BytecodesAST string_literal23_tree=null;
        BytecodesAST INIT24_tree=null;
        BytecodesAST string_literal25_tree=null;
        BytecodesAST VOID26_tree=null;
        RewriteRuleTokenStream stream_NOVA_LINHA=new RewriteRuleTokenStream(adaptor,"token NOVA_LINHA");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleSubtreeStream stream_membroClasse=new RewriteRuleSubtreeStream(adaptor,"rule membroClasse");
        RewriteRuleSubtreeStream stream_superClasse=new RewriteRuleSubtreeStream(adaptor,"rule superClasse");
        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:63:17: ( '.class' ID NOVA_LINHA ( superClasse )? ( membroClasse )+ -> ^( '.class' ID ( superClasse )? ^( MEMBRO_CLASSE ( membroClasse )+ ) ) | '.method' INIT '()' VOID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            else if ( (LA6_0==25) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:63:19: '.class' ID NOVA_LINHA ( superClasse )? ( membroClasse )+
                    {
                    string_literal18=(Token)match(input,23,FOLLOW_23_in_definicaoClasse403);  
                    stream_23.add(string_literal18);


                    ID19=(Token)match(input,ID,FOLLOW_ID_in_definicaoClasse405);  
                    stream_ID.add(ID19);


                    NOVA_LINHA20=(Token)match(input,NOVA_LINHA,FOLLOW_NOVA_LINHA_in_definicaoClasse407);  
                    stream_NOVA_LINHA.add(NOVA_LINHA20);


                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:63:42: ( superClasse )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==26) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:63:42: superClasse
                            {
                            pushFollow(FOLLOW_superClasse_in_definicaoClasse409);
                            superClasse21=superClasse();

                            state._fsp--;

                            stream_superClasse.add(superClasse21.getTree());

                            }
                            break;

                    }


                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:63:55: ( membroClasse )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==24) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:63:55: membroClasse
                    	    {
                    	    pushFollow(FOLLOW_membroClasse_in_definicaoClasse412);
                    	    membroClasse22=membroClasse();

                    	    state._fsp--;

                    	    stream_membroClasse.add(membroClasse22.getTree());

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
                    // elements: ID, membroClasse, superClasse, 23
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (BytecodesAST)adaptor.nil();
                    // 64:19: -> ^( '.class' ID ( superClasse )? ^( MEMBRO_CLASSE ( membroClasse )+ ) )
                    {
                        // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:64:22: ^( '.class' ID ( superClasse )? ^( MEMBRO_CLASSE ( membroClasse )+ ) )
                        {
                        BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                        root_1 = (BytecodesAST)adaptor.becomeRoot(
                        stream_23.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:64:36: ( superClasse )?
                        if ( stream_superClasse.hasNext() ) {
                            adaptor.addChild(root_1, stream_superClasse.nextTree());

                        }
                        stream_superClasse.reset();

                        // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:64:49: ^( MEMBRO_CLASSE ( membroClasse )+ )
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
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:65:19: '.method' INIT '()' VOID
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    string_literal23=(Token)match(input,25,FOLLOW_25_in_definicaoClasse471); 
                    string_literal23_tree = 
                    (BytecodesAST)adaptor.create(string_literal23)
                    ;
                    adaptor.addChild(root_0, string_literal23_tree);


                    INIT24=(Token)match(input,INIT,FOLLOW_INIT_in_definicaoClasse473); 
                    INIT24_tree = 
                    (BytecodesAST)adaptor.create(INIT24)
                    ;
                    adaptor.addChild(root_0, INIT24_tree);


                    string_literal25=(Token)match(input,22,FOLLOW_22_in_definicaoClasse475); 
                    string_literal25_tree = 
                    (BytecodesAST)adaptor.create(string_literal25)
                    ;
                    adaptor.addChild(root_0, string_literal25_tree);


                    VOID26=(Token)match(input,VOID,FOLLOW_VOID_in_definicaoClasse477); 
                    VOID26_tree = 
                    (BytecodesAST)adaptor.create(VOID26)
                    ;
                    adaptor.addChild(root_0, VOID26_tree);


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
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:68:1: superClasse : '.super' ID -> ^( EXTENDS ID ) ;
    public final AssemblerParser.superClasse_return superClasse() throws RecognitionException {
        AssemblerParser.superClasse_return retval = new AssemblerParser.superClasse_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token string_literal27=null;
        Token ID28=null;

        BytecodesAST string_literal27_tree=null;
        BytecodesAST ID28_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:68:13: ( '.super' ID -> ^( EXTENDS ID ) )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:68:15: '.super' ID
            {
            string_literal27=(Token)match(input,26,FOLLOW_26_in_superClasse518);  
            stream_26.add(string_literal27);


            ID28=(Token)match(input,ID,FOLLOW_ID_in_superClasse520);  
            stream_ID.add(ID28);


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
            // 68:27: -> ^( EXTENDS ID )
            {
                // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:68:30: ^( EXTENDS ID )
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
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:70:1: membroClasse : '.field' ID tipo -> ^( FIELD_DECL ID tipo ) ;
    public final AssemblerParser.membroClasse_return membroClasse() throws RecognitionException {
        AssemblerParser.membroClasse_return retval = new AssemblerParser.membroClasse_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token string_literal29=null;
        Token ID30=null;
        AssemblerParser.tipo_return tipo31 =null;


        BytecodesAST string_literal29_tree=null;
        BytecodesAST ID30_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
        RewriteRuleSubtreeStream stream_tipo=new RewriteRuleSubtreeStream(adaptor,"rule tipo");
        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:70:14: ( '.field' ID tipo -> ^( FIELD_DECL ID tipo ) )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:70:16: '.field' ID tipo
            {
            string_literal29=(Token)match(input,24,FOLLOW_24_in_membroClasse537);  
            stream_24.add(string_literal29);


            ID30=(Token)match(input,ID,FOLLOW_ID_in_membroClasse539);  
            stream_ID.add(ID30);


            pushFollow(FOLLOW_tipo_in_membroClasse541);
            tipo31=tipo();

            state._fsp--;

            stream_tipo.add(tipo31.getTree());

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
            // 70:33: -> ^( FIELD_DECL ID tipo )
            {
                // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:70:36: ^( FIELD_DECL ID tipo )
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
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:74:1: manipulacaoObjetos : (a= 'getfield' b= campo tipo -> ^( 'getfield' $b tipo ) |a= 'putfield' b= campo tipo -> ^( 'putfield' $b tipo ) |a= 'invokespecial' c= chamadaMetodo -> ^( 'invokespecial' $c) );
    public final AssemblerParser.manipulacaoObjetos_return manipulacaoObjetos() throws RecognitionException {
        AssemblerParser.manipulacaoObjetos_return retval = new AssemblerParser.manipulacaoObjetos_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;
        AssemblerParser.campo_return b =null;

        AssemblerParser.chamadaMetodo_return c =null;

        AssemblerParser.tipo_return tipo32 =null;

        AssemblerParser.tipo_return tipo33 =null;


        BytecodesAST a_tree=null;
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleSubtreeStream stream_campo=new RewriteRuleSubtreeStream(adaptor,"rule campo");
        RewriteRuleSubtreeStream stream_chamadaMetodo=new RewriteRuleSubtreeStream(adaptor,"rule chamadaMetodo");
        RewriteRuleSubtreeStream stream_tipo=new RewriteRuleSubtreeStream(adaptor,"rule tipo");
        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:74:20: (a= 'getfield' b= campo tipo -> ^( 'getfield' $b tipo ) |a= 'putfield' b= campo tipo -> ^( 'putfield' $b tipo ) |a= 'invokespecial' c= chamadaMetodo -> ^( 'invokespecial' $c) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt7=1;
                }
                break;
            case 86:
                {
                alt7=2;
                }
                break;
            case 72:
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
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:74:22: a= 'getfield' b= campo tipo
                    {
                    a=(Token)match(input,40,FOLLOW_40_in_manipulacaoObjetos593);  
                    stream_40.add(a);


                    pushFollow(FOLLOW_campo_in_manipulacaoObjetos599);
                    b=campo();

                    state._fsp--;

                    stream_campo.add(b.getTree());

                    pushFollow(FOLLOW_tipo_in_manipulacaoObjetos601);
                    tipo32=tipo();

                    state._fsp--;

                    stream_tipo.add(tipo32.getTree());

                    // AST REWRITE
                    // elements: tipo, 40, b
                    // token labels: 
                    // rule labels: retval, b
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);

                    root_0 = (BytecodesAST)adaptor.nil();
                    // 74:52: -> ^( 'getfield' $b tipo )
                    {
                        // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:74:55: ^( 'getfield' $b tipo )
                        {
                        BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                        root_1 = (BytecodesAST)adaptor.becomeRoot(
                        stream_40.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_b.nextTree());

                        adaptor.addChild(root_1, stream_tipo.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:75:22: a= 'putfield' b= campo tipo
                    {
                    a=(Token)match(input,86,FOLLOW_86_in_manipulacaoObjetos639);  
                    stream_86.add(a);


                    pushFollow(FOLLOW_campo_in_manipulacaoObjetos645);
                    b=campo();

                    state._fsp--;

                    stream_campo.add(b.getTree());

                    pushFollow(FOLLOW_tipo_in_manipulacaoObjetos647);
                    tipo33=tipo();

                    state._fsp--;

                    stream_tipo.add(tipo33.getTree());

                    // AST REWRITE
                    // elements: 86, b, tipo
                    // token labels: 
                    // rule labels: retval, b
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);

                    root_0 = (BytecodesAST)adaptor.nil();
                    // 75:52: -> ^( 'putfield' $b tipo )
                    {
                        // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:75:55: ^( 'putfield' $b tipo )
                        {
                        BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                        root_1 = (BytecodesAST)adaptor.becomeRoot(
                        stream_86.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_b.nextTree());

                        adaptor.addChild(root_1, stream_tipo.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:76:22: a= 'invokespecial' c= chamadaMetodo
                    {
                    a=(Token)match(input,72,FOLLOW_72_in_manipulacaoObjetos686);  
                    stream_72.add(a);


                    pushFollow(FOLLOW_chamadaMetodo_in_manipulacaoObjetos692);
                    c=chamadaMetodo();

                    state._fsp--;

                    stream_chamadaMetodo.add(c.getTree());

                    // AST REWRITE
                    // elements: 72, c
                    // token labels: 
                    // rule labels: retval, c
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.tree:null);

                    root_0 = (BytecodesAST)adaptor.nil();
                    // 76:60: -> ^( 'invokespecial' $c)
                    {
                        // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:76:63: ^( 'invokespecial' $c)
                        {
                        BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                        root_1 = (BytecodesAST)adaptor.becomeRoot(
                        stream_72.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, stream_c.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

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
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:79:1: tipo : ( INT | VOID | tipoRef );
    public final AssemblerParser.tipo_return tipo() throws RecognitionException {
        AssemblerParser.tipo_return retval = new AssemblerParser.tipo_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token INT34=null;
        Token VOID35=null;
        AssemblerParser.tipoRef_return tipoRef36 =null;


        BytecodesAST INT34_tree=null;
        BytecodesAST VOID35_tree=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:79:6: ( INT | VOID | tipoRef )
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
            case 29:
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
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:79:8: INT
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    INT34=(Token)match(input,INT,FOLLOW_INT_in_tipo731); 
                    INT34_tree = 
                    (BytecodesAST)adaptor.create(INT34)
                    ;
                    adaptor.addChild(root_0, INT34_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:79:14: VOID
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    VOID35=(Token)match(input,VOID,FOLLOW_VOID_in_tipo735); 
                    VOID35_tree = 
                    (BytecodesAST)adaptor.create(VOID35)
                    ;
                    adaptor.addChild(root_0, VOID35_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:79:21: tipoRef
                    {
                    root_0 = (BytecodesAST)adaptor.nil();


                    pushFollow(FOLLOW_tipoRef_in_tipo739);
                    tipoRef36=tipoRef();

                    state._fsp--;

                    adaptor.addChild(root_0, tipoRef36.getTree());

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
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:81:1: aritmetica : (a= 'iadd' |a= 'isub' |a= 'imul' |a= 'idiv' |a= 'irem' |a= 'iinc' |a= 'ineg' ) -> ^( ARITMETICA $a) ;
    public final AssemblerParser.aritmetica_return aritmetica() throws RecognitionException {
        AssemblerParser.aritmetica_return retval = new AssemblerParser.aritmetica_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;

        BytecodesAST a_tree=null;
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:81:12: ( (a= 'iadd' |a= 'isub' |a= 'imul' |a= 'idiv' |a= 'irem' |a= 'iinc' |a= 'ineg' ) -> ^( ARITMETICA $a) )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:81:14: (a= 'iadd' |a= 'isub' |a= 'imul' |a= 'idiv' |a= 'irem' |a= 'iinc' |a= 'ineg' )
            {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:81:14: (a= 'iadd' |a= 'isub' |a= 'imul' |a= 'idiv' |a= 'irem' |a= 'iinc' |a= 'ineg' )
            int alt9=7;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt9=1;
                }
                break;
            case 80:
                {
                alt9=2;
                }
                break;
            case 70:
                {
                alt9=3;
                }
                break;
            case 51:
                {
                alt9=4;
                }
                break;
            case 74:
                {
                alt9=5;
                }
                break;
            case 64:
                {
                alt9=6;
                }
                break;
            case 71:
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
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:81:19: a= 'iadd'
                    {
                    a=(Token)match(input,42,FOLLOW_42_in_aritmetica757);  
                    stream_42.add(a);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:82:19: a= 'isub'
                    {
                    a=(Token)match(input,80,FOLLOW_80_in_aritmetica781);  
                    stream_80.add(a);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:83:19: a= 'imul'
                    {
                    a=(Token)match(input,70,FOLLOW_70_in_aritmetica805);  
                    stream_70.add(a);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:84:19: a= 'idiv'
                    {
                    a=(Token)match(input,51,FOLLOW_51_in_aritmetica829);  
                    stream_51.add(a);


                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:85:19: a= 'irem'
                    {
                    a=(Token)match(input,74,FOLLOW_74_in_aritmetica853);  
                    stream_74.add(a);


                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:86:19: a= 'iinc'
                    {
                    a=(Token)match(input,64,FOLLOW_64_in_aritmetica877);  
                    stream_64.add(a);


                    }
                    break;
                case 7 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:87:19: a= 'ineg'
                    {
                    a=(Token)match(input,71,FOLLOW_71_in_aritmetica901);  
                    stream_71.add(a);


                    }
                    break;

            }


            // AST REWRITE
            // elements: a
            // token labels: a
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_a=new RewriteRuleTokenStream(adaptor,"token a",a);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BytecodesAST)adaptor.nil();
            // 89:14: -> ^( ARITMETICA $a)
            {
                // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:89:17: ^( ARITMETICA $a)
                {
                BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                root_1 = (BytecodesAST)adaptor.becomeRoot(
                (BytecodesAST)adaptor.create(ARITMETICA, "ARITMETICA")
                , root_1);

                adaptor.addChild(root_1, stream_a.nextNode());

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
    // $ANTLR end "aritmetica"


    public static class load_return extends ParserRuleReturnScope {
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "load"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:92:1: load : (a= 'iconst_m1' |a= 'iconst_0' |a= 'iconst_1' |a= 'iconst_2' |a= 'iconst_3' |a= 'iconst_4' |a= 'iconst_5' |a= 'iload_0' |a= 'iload_1' |a= 'iload_2' |a= 'iload_3' |a= 'aload_0' |a= 'aload_1' |a= 'aload_2' |a= 'aload_3' ) -> ^( LOAD $a) ;
    public final AssemblerParser.load_return load() throws RecognitionException {
        AssemblerParser.load_return retval = new AssemblerParser.load_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;

        BytecodesAST a_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:92:6: ( (a= 'iconst_m1' |a= 'iconst_0' |a= 'iconst_1' |a= 'iconst_2' |a= 'iconst_3' |a= 'iconst_4' |a= 'iconst_5' |a= 'iload_0' |a= 'iload_1' |a= 'iload_2' |a= 'iload_3' |a= 'aload_0' |a= 'aload_1' |a= 'aload_2' |a= 'aload_3' ) -> ^( LOAD $a) )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:92:8: (a= 'iconst_m1' |a= 'iconst_0' |a= 'iconst_1' |a= 'iconst_2' |a= 'iconst_3' |a= 'iconst_4' |a= 'iconst_5' |a= 'iload_0' |a= 'iload_1' |a= 'iload_2' |a= 'iload_3' |a= 'aload_0' |a= 'aload_1' |a= 'aload_2' |a= 'aload_3' )
            {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:92:8: (a= 'iconst_m1' |a= 'iconst_0' |a= 'iconst_1' |a= 'iconst_2' |a= 'iconst_3' |a= 'iconst_4' |a= 'iconst_5' |a= 'iload_0' |a= 'iload_1' |a= 'iload_2' |a= 'iload_3' |a= 'aload_0' |a= 'aload_1' |a= 'aload_2' |a= 'aload_3' )
            int alt10=15;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt10=1;
                }
                break;
            case 44:
                {
                alt10=2;
                }
                break;
            case 45:
                {
                alt10=3;
                }
                break;
            case 46:
                {
                alt10=4;
                }
                break;
            case 47:
                {
                alt10=5;
                }
                break;
            case 48:
                {
                alt10=6;
                }
                break;
            case 49:
                {
                alt10=7;
                }
                break;
            case 66:
                {
                alt10=8;
                }
                break;
            case 67:
                {
                alt10=9;
                }
                break;
            case 68:
                {
                alt10=10;
                }
                break;
            case 69:
                {
                alt10=11;
                }
                break;
            case 31:
                {
                alt10=12;
                }
                break;
            case 32:
                {
                alt10=13;
                }
                break;
            case 33:
                {
                alt10=14;
                }
                break;
            case 34:
                {
                alt10=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:92:13: a= 'iconst_m1'
                    {
                    a=(Token)match(input,50,FOLLOW_50_in_load979);  
                    stream_50.add(a);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:93:13: a= 'iconst_0'
                    {
                    a=(Token)match(input,44,FOLLOW_44_in_load997);  
                    stream_44.add(a);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:94:13: a= 'iconst_1'
                    {
                    a=(Token)match(input,45,FOLLOW_45_in_load1015);  
                    stream_45.add(a);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:95:13: a= 'iconst_2'
                    {
                    a=(Token)match(input,46,FOLLOW_46_in_load1033);  
                    stream_46.add(a);


                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:96:13: a= 'iconst_3'
                    {
                    a=(Token)match(input,47,FOLLOW_47_in_load1052);  
                    stream_47.add(a);


                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:97:13: a= 'iconst_4'
                    {
                    a=(Token)match(input,48,FOLLOW_48_in_load1070);  
                    stream_48.add(a);


                    }
                    break;
                case 7 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:98:13: a= 'iconst_5'
                    {
                    a=(Token)match(input,49,FOLLOW_49_in_load1088);  
                    stream_49.add(a);


                    }
                    break;
                case 8 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:99:13: a= 'iload_0'
                    {
                    a=(Token)match(input,66,FOLLOW_66_in_load1106);  
                    stream_66.add(a);


                    }
                    break;
                case 9 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:100:13: a= 'iload_1'
                    {
                    a=(Token)match(input,67,FOLLOW_67_in_load1125);  
                    stream_67.add(a);


                    }
                    break;
                case 10 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:101:13: a= 'iload_2'
                    {
                    a=(Token)match(input,68,FOLLOW_68_in_load1143);  
                    stream_68.add(a);


                    }
                    break;
                case 11 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:102:13: a= 'iload_3'
                    {
                    a=(Token)match(input,69,FOLLOW_69_in_load1161);  
                    stream_69.add(a);


                    }
                    break;
                case 12 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:103:13: a= 'aload_0'
                    {
                    a=(Token)match(input,31,FOLLOW_31_in_load1179);  
                    stream_31.add(a);


                    }
                    break;
                case 13 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:104:13: a= 'aload_1'
                    {
                    a=(Token)match(input,32,FOLLOW_32_in_load1197);  
                    stream_32.add(a);


                    }
                    break;
                case 14 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:105:13: a= 'aload_2'
                    {
                    a=(Token)match(input,33,FOLLOW_33_in_load1216);  
                    stream_33.add(a);


                    }
                    break;
                case 15 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:106:13: a= 'aload_3'
                    {
                    a=(Token)match(input,34,FOLLOW_34_in_load1234);  
                    stream_34.add(a);


                    }
                    break;

            }


            // AST REWRITE
            // elements: a
            // token labels: a
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_a=new RewriteRuleTokenStream(adaptor,"token a",a);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BytecodesAST)adaptor.nil();
            // 108:8: -> ^( LOAD $a)
            {
                // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:108:11: ^( LOAD $a)
                {
                BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                root_1 = (BytecodesAST)adaptor.becomeRoot(
                (BytecodesAST)adaptor.create(LOAD, "LOAD")
                , root_1);

                adaptor.addChild(root_1, stream_a.nextNode());

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
    // $ANTLR end "load"


    public static class loadint_return extends ParserRuleReturnScope {
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "loadint"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:111:1: loadint : (a= 'iload' b= INTEIRO |a= 'ldc' b= INTEIRO |a= 'aload' b= INTEIRO ) -> ^( LOAD $a $b) ;
    public final AssemblerParser.loadint_return loadint() throws RecognitionException {
        AssemblerParser.loadint_return retval = new AssemblerParser.loadint_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;
        Token b=null;

        BytecodesAST a_tree=null;
        BytecodesAST b_tree=null;
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleTokenStream stream_INTEIRO=new RewriteRuleTokenStream(adaptor,"token INTEIRO");

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:111:9: ( (a= 'iload' b= INTEIRO |a= 'ldc' b= INTEIRO |a= 'aload' b= INTEIRO ) -> ^( LOAD $a $b) )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:111:11: (a= 'iload' b= INTEIRO |a= 'ldc' b= INTEIRO |a= 'aload' b= INTEIRO )
            {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:111:11: (a= 'iload' b= INTEIRO |a= 'ldc' b= INTEIRO |a= 'aload' b= INTEIRO )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt11=1;
                }
                break;
            case 82:
                {
                alt11=2;
                }
                break;
            case 30:
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
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:111:15: a= 'iload' b= INTEIRO
                    {
                    a=(Token)match(input,65,FOLLOW_65_in_loadint1288);  
                    stream_65.add(a);


                    b=(Token)match(input,INTEIRO,FOLLOW_INTEIRO_in_loadint1294);  
                    stream_INTEIRO.add(b);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:112:15: a= 'ldc' b= INTEIRO
                    {
                    a=(Token)match(input,82,FOLLOW_82_in_loadint1315);  
                    stream_82.add(a);


                    b=(Token)match(input,INTEIRO,FOLLOW_INTEIRO_in_loadint1321);  
                    stream_INTEIRO.add(b);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:113:15: a= 'aload' b= INTEIRO
                    {
                    a=(Token)match(input,30,FOLLOW_30_in_loadint1341);  
                    stream_30.add(a);


                    b=(Token)match(input,INTEIRO,FOLLOW_INTEIRO_in_loadint1347);  
                    stream_INTEIRO.add(b);


                    }
                    break;

            }


            // AST REWRITE
            // elements: b, a
            // token labels: b, a
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_b=new RewriteRuleTokenStream(adaptor,"token b",b);
            RewriteRuleTokenStream stream_a=new RewriteRuleTokenStream(adaptor,"token a",a);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BytecodesAST)adaptor.nil();
            // 115:11: -> ^( LOAD $a $b)
            {
                // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:115:14: ^( LOAD $a $b)
                {
                BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                root_1 = (BytecodesAST)adaptor.becomeRoot(
                (BytecodesAST)adaptor.create(LOAD, "LOAD")
                , root_1);

                adaptor.addChild(root_1, stream_a.nextNode());

                adaptor.addChild(root_1, stream_b.nextNode());

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
    // $ANTLR end "loadint"


    public static class store_return extends ParserRuleReturnScope {
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "store"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:118:1: store : (a= 'istore_0' |a= 'istore_1' |a= 'istore_2' |a= 'istore_3' |a= 'astore_0' |a= 'astore_1' |a= 'astore_2' |a= 'astore_3' ) -> ^( STORE $a) ;
    public final AssemblerParser.store_return store() throws RecognitionException {
        AssemblerParser.store_return retval = new AssemblerParser.store_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;

        BytecodesAST a_tree=null;
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:118:7: ( (a= 'istore_0' |a= 'istore_1' |a= 'istore_2' |a= 'istore_3' |a= 'astore_0' |a= 'astore_1' |a= 'astore_2' |a= 'astore_3' ) -> ^( STORE $a) )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:118:9: (a= 'istore_0' |a= 'istore_1' |a= 'istore_2' |a= 'istore_3' |a= 'astore_0' |a= 'astore_1' |a= 'astore_2' |a= 'astore_3' )
            {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:118:9: (a= 'istore_0' |a= 'istore_1' |a= 'istore_2' |a= 'istore_3' |a= 'astore_0' |a= 'astore_1' |a= 'astore_2' |a= 'astore_3' )
            int alt12=8;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt12=1;
                }
                break;
            case 77:
                {
                alt12=2;
                }
                break;
            case 78:
                {
                alt12=3;
                }
                break;
            case 79:
                {
                alt12=4;
                }
                break;
            case 36:
                {
                alt12=5;
                }
                break;
            case 37:
                {
                alt12=6;
                }
                break;
            case 38:
                {
                alt12=7;
                }
                break;
            case 39:
                {
                alt12=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:118:13: a= 'istore_0'
                    {
                    a=(Token)match(input,76,FOLLOW_76_in_store1414);  
                    stream_76.add(a);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:119:13: a= 'istore_1'
                    {
                    a=(Token)match(input,77,FOLLOW_77_in_store1433);  
                    stream_77.add(a);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:120:13: a= 'istore_2'
                    {
                    a=(Token)match(input,78,FOLLOW_78_in_store1452);  
                    stream_78.add(a);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:121:13: a= 'istore_3'
                    {
                    a=(Token)match(input,79,FOLLOW_79_in_store1471);  
                    stream_79.add(a);


                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:122:13: a= 'astore_0'
                    {
                    a=(Token)match(input,36,FOLLOW_36_in_store1490);  
                    stream_36.add(a);


                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:123:13: a= 'astore_1'
                    {
                    a=(Token)match(input,37,FOLLOW_37_in_store1508);  
                    stream_37.add(a);


                    }
                    break;
                case 7 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:124:13: a= 'astore_2'
                    {
                    a=(Token)match(input,38,FOLLOW_38_in_store1527);  
                    stream_38.add(a);


                    }
                    break;
                case 8 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:125:13: a= 'astore_3'
                    {
                    a=(Token)match(input,39,FOLLOW_39_in_store1546);  
                    stream_39.add(a);


                    }
                    break;

            }


            // AST REWRITE
            // elements: a
            // token labels: a
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_a=new RewriteRuleTokenStream(adaptor,"token a",a);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BytecodesAST)adaptor.nil();
            // 127:9: -> ^( STORE $a)
            {
                // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:127:12: ^( STORE $a)
                {
                BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                root_1 = (BytecodesAST)adaptor.becomeRoot(
                (BytecodesAST)adaptor.create(STORE, "STORE")
                , root_1);

                adaptor.addChild(root_1, stream_a.nextNode());

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
    // $ANTLR end "store"


    public static class storeint_return extends ParserRuleReturnScope {
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "storeint"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:130:1: storeint : (a= 'istore' b= INTEIRO |a= 'astore' b= INTEIRO ) -> ^( STORE $a $b) ;
    public final AssemblerParser.storeint_return storeint() throws RecognitionException {
        AssemblerParser.storeint_return retval = new AssemblerParser.storeint_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;
        Token b=null;

        BytecodesAST a_tree=null;
        BytecodesAST b_tree=null;
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_INTEIRO=new RewriteRuleTokenStream(adaptor,"token INTEIRO");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:130:10: ( (a= 'istore' b= INTEIRO |a= 'astore' b= INTEIRO ) -> ^( STORE $a $b) )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:130:12: (a= 'istore' b= INTEIRO |a= 'astore' b= INTEIRO )
            {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:130:12: (a= 'istore' b= INTEIRO |a= 'astore' b= INTEIRO )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==75) ) {
                alt13=1;
            }
            else if ( (LA13_0==35) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:130:16: a= 'istore' b= INTEIRO
                    {
                    a=(Token)match(input,75,FOLLOW_75_in_storeint1604);  
                    stream_75.add(a);


                    b=(Token)match(input,INTEIRO,FOLLOW_INTEIRO_in_storeint1610);  
                    stream_INTEIRO.add(b);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:131:16: a= 'astore' b= INTEIRO
                    {
                    a=(Token)match(input,35,FOLLOW_35_in_storeint1632);  
                    stream_35.add(a);


                    b=(Token)match(input,INTEIRO,FOLLOW_INTEIRO_in_storeint1638);  
                    stream_INTEIRO.add(b);


                    }
                    break;

            }


            // AST REWRITE
            // elements: a, b
            // token labels: b, a
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_b=new RewriteRuleTokenStream(adaptor,"token b",b);
            RewriteRuleTokenStream stream_a=new RewriteRuleTokenStream(adaptor,"token a",a);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BytecodesAST)adaptor.nil();
            // 133:12: -> ^( STORE $a $b)
            {
                // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:133:15: ^( STORE $a $b)
                {
                BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                root_1 = (BytecodesAST)adaptor.becomeRoot(
                (BytecodesAST)adaptor.create(STORE, "STORE")
                , root_1);

                adaptor.addChild(root_1, stream_a.nextNode());

                adaptor.addChild(root_1, stream_b.nextNode());

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
    // $ANTLR end "storeint"


    public static class logica_return extends ParserRuleReturnScope {
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logica"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:136:1: logica : (a= 'iand' |a= 'ior' |a= 'ixor' ) -> ^( LOGICA $a) ;
    public final AssemblerParser.logica_return logica() throws RecognitionException {
        AssemblerParser.logica_return retval = new AssemblerParser.logica_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;

        BytecodesAST a_tree=null;
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:136:8: ( (a= 'iand' |a= 'ior' |a= 'ixor' ) -> ^( LOGICA $a) )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:136:10: (a= 'iand' |a= 'ior' |a= 'ixor' )
            {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:136:10: (a= 'iand' |a= 'ior' |a= 'ixor' )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt14=1;
                }
                break;
            case 73:
                {
                alt14=2;
                }
                break;
            case 81:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }

            switch (alt14) {
                case 1 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:136:14: a= 'iand'
                    {
                    a=(Token)match(input,43,FOLLOW_43_in_logica1702);  
                    stream_43.add(a);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:137:14: a= 'ior'
                    {
                    a=(Token)match(input,73,FOLLOW_73_in_logica1721);  
                    stream_73.add(a);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:138:14: a= 'ixor'
                    {
                    a=(Token)match(input,81,FOLLOW_81_in_logica1740);  
                    stream_81.add(a);


                    }
                    break;

            }


            // AST REWRITE
            // elements: a
            // token labels: a
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_a=new RewriteRuleTokenStream(adaptor,"token a",a);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BytecodesAST)adaptor.nil();
            // 140:10: -> ^( LOGICA $a)
            {
                // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:140:13: ^( LOGICA $a)
                {
                BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                root_1 = (BytecodesAST)adaptor.becomeRoot(
                (BytecodesAST)adaptor.create(LOGICA, "LOGICA")
                , root_1);

                adaptor.addChild(root_1, stream_a.nextNode());

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
    // $ANTLR end "logica"


    public static class desvio_return extends ParserRuleReturnScope {
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "desvio"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:143:1: desvio : (a= 'ifeq' b= ID |a= 'ifne' b= ID |a= 'iflt' b= ID |a= 'ifge' b= ID |a= 'ifgt' b= ID |a= 'ifle' b= ID |a= 'if_icmpeq' b= ID |a= 'if_icmpne' b= ID |a= 'if_icmplt' b= ID |a= 'if_icmpge' b= ID |a= 'if_icmpgt' b= ID |a= 'if_icmple' b= ID |a= 'goto' b= ID ) -> ^( DESVIO $a $b) ;
    public final AssemblerParser.desvio_return desvio() throws RecognitionException {
        AssemblerParser.desvio_return retval = new AssemblerParser.desvio_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;
        Token b=null;

        BytecodesAST a_tree=null;
        BytecodesAST b_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:143:8: ( (a= 'ifeq' b= ID |a= 'ifne' b= ID |a= 'iflt' b= ID |a= 'ifge' b= ID |a= 'ifgt' b= ID |a= 'ifle' b= ID |a= 'if_icmpeq' b= ID |a= 'if_icmpne' b= ID |a= 'if_icmplt' b= ID |a= 'if_icmpge' b= ID |a= 'if_icmpgt' b= ID |a= 'if_icmple' b= ID |a= 'goto' b= ID ) -> ^( DESVIO $a $b) )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:143:10: (a= 'ifeq' b= ID |a= 'ifne' b= ID |a= 'iflt' b= ID |a= 'ifge' b= ID |a= 'ifgt' b= ID |a= 'ifle' b= ID |a= 'if_icmpeq' b= ID |a= 'if_icmpne' b= ID |a= 'if_icmplt' b= ID |a= 'if_icmpge' b= ID |a= 'if_icmpgt' b= ID |a= 'if_icmple' b= ID |a= 'goto' b= ID )
            {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:143:10: (a= 'ifeq' b= ID |a= 'ifne' b= ID |a= 'iflt' b= ID |a= 'ifge' b= ID |a= 'ifgt' b= ID |a= 'ifle' b= ID |a= 'if_icmpeq' b= ID |a= 'if_icmpne' b= ID |a= 'if_icmplt' b= ID |a= 'if_icmpge' b= ID |a= 'if_icmpgt' b= ID |a= 'if_icmple' b= ID |a= 'goto' b= ID )
            int alt15=13;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt15=1;
                }
                break;
            case 63:
                {
                alt15=2;
                }
                break;
            case 62:
                {
                alt15=3;
                }
                break;
            case 59:
                {
                alt15=4;
                }
                break;
            case 60:
                {
                alt15=5;
                }
                break;
            case 61:
                {
                alt15=6;
                }
                break;
            case 52:
                {
                alt15=7;
                }
                break;
            case 57:
                {
                alt15=8;
                }
                break;
            case 56:
                {
                alt15=9;
                }
                break;
            case 53:
                {
                alt15=10;
                }
                break;
            case 54:
                {
                alt15=11;
                }
                break;
            case 55:
                {
                alt15=12;
                }
                break;
            case 41:
                {
                alt15=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }

            switch (alt15) {
                case 1 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:143:14: a= 'ifeq' b= ID
                    {
                    a=(Token)match(input,58,FOLLOW_58_in_desvio1793);  
                    stream_58.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio1799);  
                    stream_ID.add(b);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:144:14: a= 'ifne' b= ID
                    {
                    a=(Token)match(input,63,FOLLOW_63_in_desvio1819);  
                    stream_63.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio1825);  
                    stream_ID.add(b);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:145:14: a= 'iflt' b= ID
                    {
                    a=(Token)match(input,62,FOLLOW_62_in_desvio1845);  
                    stream_62.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio1851);  
                    stream_ID.add(b);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:146:14: a= 'ifge' b= ID
                    {
                    a=(Token)match(input,59,FOLLOW_59_in_desvio1870);  
                    stream_59.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio1876);  
                    stream_ID.add(b);


                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:147:14: a= 'ifgt' b= ID
                    {
                    a=(Token)match(input,60,FOLLOW_60_in_desvio1895);  
                    stream_60.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio1901);  
                    stream_ID.add(b);


                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:148:14: a= 'ifle' b= ID
                    {
                    a=(Token)match(input,61,FOLLOW_61_in_desvio1921);  
                    stream_61.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio1927);  
                    stream_ID.add(b);


                    }
                    break;
                case 7 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:149:14: a= 'if_icmpeq' b= ID
                    {
                    a=(Token)match(input,52,FOLLOW_52_in_desvio1947);  
                    stream_52.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio1953);  
                    stream_ID.add(b);


                    }
                    break;
                case 8 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:150:14: a= 'if_icmpne' b= ID
                    {
                    a=(Token)match(input,57,FOLLOW_57_in_desvio1973);  
                    stream_57.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio1979);  
                    stream_ID.add(b);


                    }
                    break;
                case 9 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:151:14: a= 'if_icmplt' b= ID
                    {
                    a=(Token)match(input,56,FOLLOW_56_in_desvio1998);  
                    stream_56.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio2004);  
                    stream_ID.add(b);


                    }
                    break;
                case 10 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:152:14: a= 'if_icmpge' b= ID
                    {
                    a=(Token)match(input,53,FOLLOW_53_in_desvio2024);  
                    stream_53.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio2030);  
                    stream_ID.add(b);


                    }
                    break;
                case 11 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:153:14: a= 'if_icmpgt' b= ID
                    {
                    a=(Token)match(input,54,FOLLOW_54_in_desvio2050);  
                    stream_54.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio2056);  
                    stream_ID.add(b);


                    }
                    break;
                case 12 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:154:14: a= 'if_icmple' b= ID
                    {
                    a=(Token)match(input,55,FOLLOW_55_in_desvio2075);  
                    stream_55.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio2081);  
                    stream_ID.add(b);


                    }
                    break;
                case 13 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:155:14: a= 'goto' b= ID
                    {
                    a=(Token)match(input,41,FOLLOW_41_in_desvio2101);  
                    stream_41.add(a);


                    b=(Token)match(input,ID,FOLLOW_ID_in_desvio2107);  
                    stream_ID.add(b);


                    }
                    break;

            }


            // AST REWRITE
            // elements: b, a
            // token labels: b, a
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_b=new RewriteRuleTokenStream(adaptor,"token b",b);
            RewriteRuleTokenStream stream_a=new RewriteRuleTokenStream(adaptor,"token a",a);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BytecodesAST)adaptor.nil();
            // 157:10: -> ^( DESVIO $a $b)
            {
                // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:157:13: ^( DESVIO $a $b)
                {
                BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                root_1 = (BytecodesAST)adaptor.becomeRoot(
                (BytecodesAST)adaptor.create(DESVIO, "DESVIO")
                , root_1);

                adaptor.addChild(root_1, stream_a.nextNode());

                adaptor.addChild(root_1, stream_b.nextNode());

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
    // $ANTLR end "desvio"


    public static class pilha_return extends ParserRuleReturnScope {
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "pilha"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:160:1: pilha : (a= 'pop' |a= 'pop2' ) -> ^( PILHA $a) ;
    public final AssemblerParser.pilha_return pilha() throws RecognitionException {
        AssemblerParser.pilha_return retval = new AssemblerParser.pilha_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token a=null;

        BytecodesAST a_tree=null;
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:160:7: ( (a= 'pop' |a= 'pop2' ) -> ^( PILHA $a) )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:160:9: (a= 'pop' |a= 'pop2' )
            {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:160:9: (a= 'pop' |a= 'pop2' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==84) ) {
                alt16=1;
            }
            else if ( (LA16_0==85) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:160:13: a= 'pop'
                    {
                    a=(Token)match(input,84,FOLLOW_84_in_pilha2172);  
                    stream_84.add(a);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:161:13: a= 'pop2'
                    {
                    a=(Token)match(input,85,FOLLOW_85_in_pilha2190);  
                    stream_85.add(a);


                    }
                    break;

            }


            // AST REWRITE
            // elements: a
            // token labels: a
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_a=new RewriteRuleTokenStream(adaptor,"token a",a);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (BytecodesAST)adaptor.nil();
            // 163:9: -> ^( PILHA $a)
            {
                // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:163:12: ^( PILHA $a)
                {
                BytecodesAST root_1 = (BytecodesAST)adaptor.nil();
                root_1 = (BytecodesAST)adaptor.becomeRoot(
                (BytecodesAST)adaptor.create(PILHA, "PILHA")
                , root_1);

                adaptor.addChild(root_1, stream_a.nextNode());

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
    // $ANTLR end "pilha"


    public static class chamadaMetodo_return extends ParserRuleReturnScope {
        public List classe;
        public String nome;
        public String params;
        public String tipoRetorno;
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "chamadaMetodo"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:166:1: chamadaMetodo returns [List classe, String nome, String params, String tipoRetorno] : (cls+= ID '/' )+ n= INIT par= '()' tip= VOID ;
    public final AssemblerParser.chamadaMetodo_return chamadaMetodo() throws RecognitionException {
        AssemblerParser.chamadaMetodo_return retval = new AssemblerParser.chamadaMetodo_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token n=null;
        Token par=null;
        Token tip=null;
        Token char_literal37=null;
        Token cls=null;
        List list_cls=null;

        BytecodesAST n_tree=null;
        BytecodesAST par_tree=null;
        BytecodesAST tip_tree=null;
        BytecodesAST char_literal37_tree=null;
        BytecodesAST cls_tree=null;


                retval.classe = new ArrayList();
                retval.nome = "";
                retval.params = "";
                retval.tipoRetorno = "";
             
        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:173:6: ( (cls+= ID '/' )+ n= INIT par= '()' tip= VOID )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:173:8: (cls+= ID '/' )+ n= INIT par= '()' tip= VOID
            {
            root_0 = (BytecodesAST)adaptor.nil();


            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:173:8: (cls+= ID '/' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:173:9: cls+= ID '/'
            	    {
            	    cls=(Token)match(input,ID,FOLLOW_ID_in_chamadaMetodo2256); 
            	    cls_tree = 
            	    (BytecodesAST)adaptor.create(cls)
            	    ;
            	    adaptor.addChild(root_0, cls_tree);

            	    if (list_cls==null) list_cls=new ArrayList();
            	    list_cls.add(cls);


            	    char_literal37=(Token)match(input,27,FOLLOW_27_in_chamadaMetodo2258); 
            	    char_literal37_tree = 
            	    (BytecodesAST)adaptor.create(char_literal37)
            	    ;
            	    adaptor.addChild(root_0, char_literal37_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            n=(Token)match(input,INIT,FOLLOW_INIT_in_chamadaMetodo2266); 
            n_tree = 
            (BytecodesAST)adaptor.create(n)
            ;
            adaptor.addChild(root_0, n_tree);


            par=(Token)match(input,22,FOLLOW_22_in_chamadaMetodo2272); 
            par_tree = 
            (BytecodesAST)adaptor.create(par)
            ;
            adaptor.addChild(root_0, par_tree);


            tip=(Token)match(input,VOID,FOLLOW_VOID_in_chamadaMetodo2278); 
            tip_tree = 
            (BytecodesAST)adaptor.create(tip)
            ;
            adaptor.addChild(root_0, tip_tree);


            retval.classe = list_cls;
                         retval.nome = (n!=null?n.getText():null);
                         retval.params = (par!=null?par.getText():null);
                         retval.tipoRetorno = (tip!=null?tip.getText():null);
                    

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
    // $ANTLR end "chamadaMetodo"


    public static class campo_return extends ParserRuleReturnScope {
        public List classe;
        public String campo;
        BytecodesAST tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "campo"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:180:1: campo returns [List classe, String campo] : (cls+= ID '/' )+ cmp= ID ;
    public final AssemblerParser.campo_return campo() throws RecognitionException {
        AssemblerParser.campo_return retval = new AssemblerParser.campo_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token cmp=null;
        Token char_literal38=null;
        Token cls=null;
        List list_cls=null;

        BytecodesAST cmp_tree=null;
        BytecodesAST char_literal38_tree=null;
        BytecodesAST cls_tree=null;


                retval.classe = new ArrayList();
                retval.campo ="";
             
        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:185:6: ( (cls+= ID '/' )+ cmp= ID )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:185:8: (cls+= ID '/' )+ cmp= ID
            {
            root_0 = (BytecodesAST)adaptor.nil();


            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:185:8: (cls+= ID '/' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==ID) ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1==27) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:185:9: cls+= ID '/'
            	    {
            	    cls=(Token)match(input,ID,FOLLOW_ID_in_campo2318); 
            	    cls_tree = 
            	    (BytecodesAST)adaptor.create(cls)
            	    ;
            	    adaptor.addChild(root_0, cls_tree);

            	    if (list_cls==null) list_cls=new ArrayList();
            	    list_cls.add(cls);


            	    char_literal38=(Token)match(input,27,FOLLOW_27_in_campo2320); 
            	    char_literal38_tree = 
            	    (BytecodesAST)adaptor.create(char_literal38)
            	    ;
            	    adaptor.addChild(root_0, char_literal38_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            cmp=(Token)match(input,ID,FOLLOW_ID_in_campo2328); 
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
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:188:1: tipoRef : 'L' ( ID '/' )* ID ;
    public final AssemblerParser.tipoRef_return tipoRef() throws RecognitionException {
        AssemblerParser.tipoRef_return retval = new AssemblerParser.tipoRef_return();
        retval.start = input.LT(1);


        BytecodesAST root_0 = null;

        Token char_literal39=null;
        Token ID40=null;
        Token char_literal41=null;
        Token ID42=null;

        BytecodesAST char_literal39_tree=null;
        BytecodesAST ID40_tree=null;
        BytecodesAST char_literal41_tree=null;
        BytecodesAST ID42_tree=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:188:9: ( 'L' ( ID '/' )* ID )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:188:11: 'L' ( ID '/' )* ID
            {
            root_0 = (BytecodesAST)adaptor.nil();


            char_literal39=(Token)match(input,29,FOLLOW_29_in_tipoRef2344); 
            char_literal39_tree = 
            (BytecodesAST)adaptor.create(char_literal39)
            ;
            adaptor.addChild(root_0, char_literal39_tree);


            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:188:15: ( ID '/' )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==ID) ) {
                    int LA19_1 = input.LA(2);

                    if ( (LA19_1==27) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Assembler.g:188:16: ID '/'
            	    {
            	    ID40=(Token)match(input,ID,FOLLOW_ID_in_tipoRef2347); 
            	    ID40_tree = 
            	    (BytecodesAST)adaptor.create(ID40)
            	    ;
            	    adaptor.addChild(root_0, ID40_tree);


            	    char_literal41=(Token)match(input,27,FOLLOW_27_in_tipoRef2349); 
            	    char_literal41_tree = 
            	    (BytecodesAST)adaptor.create(char_literal41)
            	    ;
            	    adaptor.addChild(root_0, char_literal41_tree);


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            ID42=(Token)match(input,ID,FOLLOW_ID_in_tipoRef2353); 
            ID42_tree = 
            (BytecodesAST)adaptor.create(ID42)
            ;
            adaptor.addChild(root_0, ID42_tree);


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


 

    public static final BitSet FOLLOW_comando_in_programa107 = new BitSet(new long[]{0xFFFFFFFFC2810102L,0x00000000007FFFFFL});
    public static final BitSet FOLLOW_label_in_comando127 = new BitSet(new long[]{0xFFFFFFFFC2810000L,0x00000000007FFFFFL});
    public static final BitSet FOLLOW_instrucao_in_comando129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instrucao_in_comando133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_label155 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_label157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_definicaoClasse_in_instrucao178 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_manipulacaoObjetos_in_instrucao197 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_aritmetica_in_instrucao216 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_load_in_instrucao235 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_loadint_in_instrucao253 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_store_in_instrucao272 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_storeint_in_instrucao290 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_desvio_in_instrucao309 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_logica_in_instrucao328 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_pilha_in_instrucao346 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_83_in_instrucao365 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_NOVA_LINHA_in_instrucao381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_definicaoClasse403 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_definicaoClasse405 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_NOVA_LINHA_in_definicaoClasse407 = new BitSet(new long[]{0x0000000005000000L});
    public static final BitSet FOLLOW_superClasse_in_definicaoClasse409 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_membroClasse_in_definicaoClasse412 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_25_in_definicaoClasse471 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_INIT_in_definicaoClasse473 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_definicaoClasse475 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_VOID_in_definicaoClasse477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_superClasse518 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_superClasse520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_membroClasse537 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_membroClasse539 = new BitSet(new long[]{0x0000000020100400L});
    public static final BitSet FOLLOW_tipo_in_membroClasse541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_manipulacaoObjetos593 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_campo_in_manipulacaoObjetos599 = new BitSet(new long[]{0x0000000020100400L});
    public static final BitSet FOLLOW_tipo_in_manipulacaoObjetos601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_manipulacaoObjetos639 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_campo_in_manipulacaoObjetos645 = new BitSet(new long[]{0x0000000020100400L});
    public static final BitSet FOLLOW_tipo_in_manipulacaoObjetos647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_manipulacaoObjetos686 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_chamadaMetodo_in_manipulacaoObjetos692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_tipo731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VOID_in_tipo735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tipoRef_in_tipo739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_aritmetica757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_aritmetica781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_aritmetica805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_aritmetica829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_aritmetica853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_aritmetica877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_aritmetica901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_load979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_load997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_load1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_load1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_load1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_load1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_load1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_load1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_load1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_load1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_load1161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_load1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_load1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_load1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_load1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_loadint1288 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_INTEIRO_in_loadint1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_loadint1315 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_INTEIRO_in_loadint1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_loadint1341 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_INTEIRO_in_loadint1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_store1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_store1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_store1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_store1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_store1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_store1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_store1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_store1546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_storeint1604 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_INTEIRO_in_storeint1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_storeint1632 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_INTEIRO_in_storeint1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_logica1702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_logica1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_logica1740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_desvio1793 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_desvio1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_desvio1819 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_desvio1825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_desvio1845 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_desvio1851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_desvio1870 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_desvio1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_desvio1895 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_desvio1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_desvio1921 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_desvio1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_desvio1947 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_desvio1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_desvio1973 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_desvio1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_desvio1998 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_desvio2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_desvio2024 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_desvio2030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_desvio2050 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_desvio2056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_desvio2075 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_desvio2081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_desvio2101 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_desvio2107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_pilha2172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_pilha2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_chamadaMetodo2256 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_chamadaMetodo2258 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_INIT_in_chamadaMetodo2266 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_chamadaMetodo2272 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_VOID_in_chamadaMetodo2278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_campo2318 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_campo2320 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_campo2328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_tipoRef2344 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_tipoRef2347 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_tipoRef2349 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_tipoRef2353 = new BitSet(new long[]{0x0000000000000002L});

}