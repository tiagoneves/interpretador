// $ANTLR 3.4 C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g 2012-09-06 01:53:57

    package br.ufpb.iged.interpretador.parser;
    
    import br.ufpb.iged.interpretador.symboltable.classes.Escopo;
import br.ufpb.iged.interpretador.symboltable.classes.BytecodesAST;
import br.ufpb.iged.interpretador.symboltable.classes.SimboloClasse;
import br.ufpb.iged.interpretador.symboltable.classes.TabelaSimbolos;
import br.ufpb.iged.interpretador.symboltable.classes.Tipo;
import br.ufpb.iged.interpretador.bytecodeassembler.asm.BytecodeAssembler;
import br.ufpb.iged.interpretador.excecoes.AcessoIndevidoMemoriaException;
import br.ufpb.iged.interpretador.excecoes.LabelException;
import br.ufpb.iged.interpretador.symboltable.classes.SimboloVariavel;
import br.ufpb.iged.interpretador.symboltable.classes.SimboloMetodo;


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


    public Ref(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public Ref(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return Ref.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g"; }


        
        TabelaSimbolos tabelaSimbolos;
        SimboloClasse simboloClasse;
        BytecodeAssembler assembler;
        Escopo escopoAtual;
        public Ref(TreeNodeStream input, TabelaSimbolos tabelaSimbolos,
          BytecodeAssembler assembler) {
            this(input);
            this.tabelaSimbolos = tabelaSimbolos;
            this.assembler = assembler;
        }
        
        private Tipo resolverTipo(String nomeTipo) {
        
          return (Tipo)simboloClasse.resolver(nomeTipo);
        
        }
        
        private void acessarCampo(String operacao, String nomeClasse, String nomeCampo) {
        
            assembler.escreverOpcode(operacao);
          
            SimboloClasse simboloClasse =
              (SimboloClasse)tabelaSimbolos.global.resolver("L" + nomeClasse);
          
            if(!assembler.getConstantPool().contains(simboloClasse))
          
              assembler.getConstantPool().add(simboloClasse);
        
            /*BytecodeAssembler.escreverInteiro(BytecodeAssembler.codigo,
              BytecodeAssembler.ip, assembler.getConstantPool().indexOf(simboloClasse));*/
          
            SimboloVariavel simboloVariavel =
              (SimboloVariavel) simboloClasse.resolver(nomeCampo);
        
            if (!simboloClasse.getConstantPool().contains(simboloVariavel))
          
              simboloClasse.getConstantPool().add(simboloVariavel);
            
            BytecodeAssembler.escreverInteiro(
              BytecodeAssembler.codigo, BytecodeAssembler.ip,
              simboloClasse.getConstantPool().indexOf(simboloVariavel));
        
        }
        
        private void chamarConstrutorDefault(String nomeClasse) {
        
          assembler.escreverOpcode("invokespecial");
           
          SimboloClasse simboloClasse =
              (SimboloClasse)tabelaSimbolos.global.resolver("L" + nomeClasse);
        
          if(!assembler.getConstantPool().contains(simboloClasse))
          
              assembler.getConstantPool().add(simboloClasse);
        
           BytecodeAssembler.escreverInteiro(BytecodeAssembler.codigo,
              BytecodeAssembler.ip, assembler.getConstantPool().indexOf(simboloClasse));
        
      }
      
      private void newClass(String nomeClasse) {
      
         assembler.escreverOpcode("new");
           
          SimboloClasse simboloClasse =
              (SimboloClasse)tabelaSimbolos.global.resolver("L" + nomeClasse);
        
          if(!assembler.getConstantPool().contains(simboloClasse))
          
              assembler.getConstantPool().add(simboloClasse);
        
           BytecodeAssembler.escreverInteiro(BytecodeAssembler.codigo,
              BytecodeAssembler.ip, assembler.getConstantPool().indexOf(simboloClasse));
      
      }
        



    // $ANTLR start "topdown"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:102:1: topdown : ( entraNaClasse | entraNoMetodo | entraNoConstrutor | declaracaoVariavel | getfield | putfield | invokespecial | novaClasse | aritmetica | load | loadint | store | storeint | desvio | logica | pilha | label | retorno );
    public final void topdown() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:103:5: ( entraNaClasse | entraNoMetodo | entraNoConstrutor | declaracaoVariavel | getfield | putfield | invokespecial | novaClasse | aritmetica | load | loadint | store | storeint | desvio | logica | pilha | label | retorno )
            int alt1=18;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:103:9: entraNaClasse
                    {
                    pushFollow(FOLLOW_entraNaClasse_in_topdown61);
                    entraNaClasse();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:104:9: entraNoMetodo
                    {
                    pushFollow(FOLLOW_entraNoMetodo_in_topdown71);
                    entraNoMetodo();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:105:9: entraNoConstrutor
                    {
                    pushFollow(FOLLOW_entraNoConstrutor_in_topdown81);
                    entraNoConstrutor();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:106:9: declaracaoVariavel
                    {
                    pushFollow(FOLLOW_declaracaoVariavel_in_topdown91);
                    declaracaoVariavel();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:107:9: getfield
                    {
                    pushFollow(FOLLOW_getfield_in_topdown101);
                    getfield();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:108:9: putfield
                    {
                    pushFollow(FOLLOW_putfield_in_topdown111);
                    putfield();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:109:9: invokespecial
                    {
                    pushFollow(FOLLOW_invokespecial_in_topdown121);
                    invokespecial();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:110:9: novaClasse
                    {
                    pushFollow(FOLLOW_novaClasse_in_topdown131);
                    novaClasse();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:111:9: aritmetica
                    {
                    pushFollow(FOLLOW_aritmetica_in_topdown141);
                    aritmetica();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 10 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:112:9: load
                    {
                    pushFollow(FOLLOW_load_in_topdown151);
                    load();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 11 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:113:9: loadint
                    {
                    pushFollow(FOLLOW_loadint_in_topdown161);
                    loadint();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 12 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:114:9: store
                    {
                    pushFollow(FOLLOW_store_in_topdown171);
                    store();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 13 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:115:9: storeint
                    {
                    pushFollow(FOLLOW_storeint_in_topdown181);
                    storeint();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 14 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:116:9: desvio
                    {
                    pushFollow(FOLLOW_desvio_in_topdown191);
                    desvio();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 15 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:117:9: logica
                    {
                    pushFollow(FOLLOW_logica_in_topdown201);
                    logica();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 16 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:118:9: pilha
                    {
                    pushFollow(FOLLOW_pilha_in_topdown211);
                    pilha();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 17 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:119:9: label
                    {
                    pushFollow(FOLLOW_label_in_topdown221);
                    label();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 18 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:120:9: retorno
                    {
                    pushFollow(FOLLOW_retorno_in_topdown231);
                    retorno();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        } catch (LabelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AcessoIndevidoMemoriaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "topdown"



    // $ANTLR start "bottomup"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:123:1: bottomup : ( saiDoMetodo | saiDoConstrutor );
    public final void bottomup() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:124:3: ( saiDoMetodo | saiDoConstrutor )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==METHOD_DECL) ) {
                alt2=1;
            }
            else if ( (LA2_0==CONSTR_DECL) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:124:7: saiDoMetodo
                    {
                    pushFollow(FOLLOW_saiDoMetodo_in_bottomup252);
                    saiDoMetodo();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:125:7: saiDoConstrutor
                    {
                    pushFollow(FOLLOW_saiDoConstrutor_in_bottomup260);
                    saiDoConstrutor();

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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:129:1: entraNaClasse : ^( '.class' nome= ID ( ^( EXTENDS sup= TIPO_REF ) )? . ) ;
    public final void entraNaClasse() throws RecognitionException {
        BytecodesAST nome=null;
        BytecodesAST sup=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:130:5: ( ^( '.class' nome= ID ( ^( EXTENDS sup= TIPO_REF ) )? . ) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:130:7: ^( '.class' nome= ID ( ^( EXTENDS sup= TIPO_REF ) )? . )
            {
            match(input,30,FOLLOW_30_in_entraNaClasse283); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            nome=(BytecodesAST)match(input,ID,FOLLOW_ID_in_entraNaClasse287); if (state.failed) return ;

            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:130:26: ( ^( EXTENDS sup= TIPO_REF ) )?
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
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:130:27: ^( EXTENDS sup= TIPO_REF )
                    {
                    match(input,EXTENDS,FOLLOW_EXTENDS_in_entraNaClasse291); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    sup=(BytecodesAST)match(input,TIPO_REF,FOLLOW_TIPO_REF_in_entraNaClasse295); if (state.failed) return ;

                    match(input, Token.UP, null); if (state.failed) return ;


                    }
                    break;

            }


            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
                      simboloClasse = ((SimboloClasse)nome.simbolo);
                      if ( sup!=null ) {
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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:146:1: declaracaoVariavel : ^( FIELD_DECL ID tip= . ) ;
    public final void declaracaoVariavel() throws RecognitionException {
        BytecodesAST ID1=null;
        BytecodesAST tip=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:147:5: ( ^( FIELD_DECL ID tip= . ) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:147:7: ^( FIELD_DECL ID tip= . )
            {
            match(input,FIELD_DECL,FOLLOW_FIELD_DECL_in_declaracaoVariavel333); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            ID1=(BytecodesAST)match(input,ID,FOLLOW_ID_in_declaracaoVariavel335); if (state.failed) return ;

            tip=(BytecodesAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
                       ID1.simbolo.tipo = resolverTipo(tip.getText());
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



    // $ANTLR start "entraNoConstrutor"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:154:1: entraNoConstrutor : ^( CONSTR_DECL INIT ( . )+ ) ;
    public final void entraNoConstrutor() throws RecognitionException {
        BytecodesAST INIT2=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:155:2: ( ^( CONSTR_DECL INIT ( . )+ ) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:155:4: ^( CONSTR_DECL INIT ( . )+ )
            {
            match(input,CONSTR_DECL,FOLLOW_CONSTR_DECL_in_entraNoConstrutor370); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            INIT2=(BytecodesAST)match(input,INIT,FOLLOW_INIT_in_entraNoConstrutor372); if (state.failed) return ;

            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:155:23: ( . )+
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
            	    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:155:23: .
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
            	  System.out.println("Ref: Entrou no construtor "+(INIT2!=null?INIT2.getText():null));
            	  escopoAtual = (SimboloMetodo)INIT2.simbolo;
            	  BytecodeAssembler.codigo = new byte[BytecodeAssembler.TAMANHO_INICIAL_MEMORIA_CODIGO];
            	  BytecodeAssembler.ip = 0;
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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:164:1: entraNoMetodo : ^( METHOD_DECL ID . ( . )+ ) ;
    public final void entraNoMetodo() throws RecognitionException {
        BytecodesAST ID3=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:165:2: ( ^( METHOD_DECL ID . ( . )+ ) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:165:4: ^( METHOD_DECL ID . ( . )+ )
            {
            match(input,METHOD_DECL,FOLLOW_METHOD_DECL_in_entraNoMetodo395); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            ID3=(BytecodesAST)match(input,ID,FOLLOW_ID_in_entraNoMetodo397); if (state.failed) return ;

            matchAny(input); if (state.failed) return ;

            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:165:23: ( . )+
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
            	    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:165:23: .
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
            	  System.out.println("Ref: Entrou no metodo "+(ID3!=null?ID3.getText():null));
            	  escopoAtual = (SimboloMetodo)ID3.simbolo;
            	  BytecodeAssembler.codigo = new byte[BytecodeAssembler.TAMANHO_INICIAL_MEMORIA_CODIGO];
            	  BytecodeAssembler.ip = 0;
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



    // $ANTLR start "saiDoMetodo"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:174:1: saiDoMetodo : METHOD_DECL ;
    public final void saiDoMetodo() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:175:2: ( METHOD_DECL )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:175:5: METHOD_DECL
            {
            match(input,METHOD_DECL,FOLLOW_METHOD_DECL_in_saiDoMetodo419); if (state.failed) return ;

            if ( state.backtracking==1 ) {
            	   System.out.println("Ref: Saindo do metodo... ");
            	   ((SimboloMetodo)escopoAtual).setCodigo(assembler.obterCodigoMaquina());
            	   ((SimboloMetodo)escopoAtual).setTamanhoMemoriaLocal(assembler.obterTamanhoMemoriaCodigo());
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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:183:1: saiDoConstrutor : CONSTR_DECL ;
    public final void saiDoConstrutor() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:184:2: ( CONSTR_DECL )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:184:5: CONSTR_DECL
            {
            match(input,CONSTR_DECL,FOLLOW_CONSTR_DECL_in_saiDoConstrutor435); if (state.failed) return ;

            if ( state.backtracking==1 ) {
            	    System.out.println("Ref: Saindo do construtor... ");
            	   ((SimboloMetodo)escopoAtual).setCodigo(assembler.obterCodigoMaquina());
            	   ((SimboloMetodo)escopoAtual).setTamanhoMemoriaLocal(assembler.obterTamanhoMemoriaCodigo());
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



    // $ANTLR start "getfield"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:192:1: getfield : ^( 'getfield' classe= . . campo= . tipo= . ) ;
    public final void getfield() throws RecognitionException {
        BytecodesAST classe=null;
        BytecodesAST campo=null;
        BytecodesAST tipo=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:193:5: ( ^( 'getfield' classe= . . campo= . tipo= . ) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:193:7: ^( 'getfield' classe= . . campo= . tipo= . )
            {
            match(input,51,FOLLOW_51_in_getfield457); if (state.failed) return ;

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
                  acessarCampo("getfield", classe.getText(), campo.getText());
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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:199:1: putfield : ^( 'putfield' classe= . . campo= . tipo= . ) ;
    public final void putfield() throws RecognitionException {
        BytecodesAST classe=null;
        BytecodesAST campo=null;
        BytecodesAST tipo=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:200:5: ( ^( 'putfield' classe= . . campo= . tipo= . ) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:200:7: ^( 'putfield' classe= . . campo= . tipo= . )
            {
            match(input,99,FOLLOW_99_in_putfield506); if (state.failed) return ;

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
                  acessarCampo("putfield", classe.getText(), campo.getText());
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
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:206:1: invokespecial : ^( 'invokespecial' classe= . metodo= . args= . tipo= . ) ;
    public final void invokespecial() throws RecognitionException {
        BytecodesAST classe=null;
        BytecodesAST metodo=null;
        BytecodesAST args=null;
        BytecodesAST tipo=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:207:5: ( ^( 'invokespecial' classe= . metodo= . args= . tipo= . ) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:207:7: ^( 'invokespecial' classe= . metodo= . args= . tipo= . )
            {
            match(input,83,FOLLOW_83_in_invokespecial555); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            classe=(BytecodesAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            metodo=(BytecodesAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            args=(BytecodesAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            tipo=(BytecodesAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
                  chamarConstrutorDefault(classe.getText());
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



    // $ANTLR start "novaClasse"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:213:1: novaClasse : ^( 'new' classe= . ) ;
    public final void novaClasse() throws RecognitionException {
        BytecodesAST classe=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:214:3: ( ^( 'new' classe= . ) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:214:5: ^( 'new' classe= . )
            {
            match(input,95,FOLLOW_95_in_novaClasse606); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            classe=(BytecodesAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
                newClass(classe.getText());
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
    // $ANTLR end "novaClasse"



    // $ANTLR start "aritmetica"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:220:1: aritmetica : ^( ARITMETICA operacao= . ) ;
    public final void aritmetica() throws RecognitionException {
        BytecodesAST operacao=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:221:5: ( ^( ARITMETICA operacao= . ) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:221:7: ^( ARITMETICA operacao= . )
            {
            match(input,ARITMETICA,FOLLOW_ARITMETICA_in_aritmetica637); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            operacao=(BytecodesAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
                  assembler.escreverOpcode(operacao.getText());
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



    // $ANTLR start "load"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:227:1: load : ^( LOAD operacao= . ) ;
    public final void load() throws RecognitionException {
        BytecodesAST operacao=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:228:3: ( ^( LOAD operacao= . ) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:228:5: ^( LOAD operacao= . )
            {
            match(input,LOAD,FOLLOW_LOAD_in_load671); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            operacao=(BytecodesAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
                assembler.escreverOpcode(operacao.getText());
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
    // $ANTLR end "load"



    // $ANTLR start "loadint"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:234:1: loadint : ^( LOAD operacao= . operando= . ) ;
    public final void loadint() throws RecognitionException, LabelException {
        BytecodesAST operacao=null;
        BytecodesAST operando=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:235:5: ( ^( LOAD operacao= . operando= . ) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:235:7: ^( LOAD operacao= . operando= . )
            {
            match(input,LOAD,FOLLOW_LOAD_in_loadint700); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            operacao=(BytecodesAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            operando=(BytecodesAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
                  assembler.escreverOpcode(operacao.token, operando.token);
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
    // $ANTLR end "loadint"



    // $ANTLR start "store"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:241:1: store : ^( STORE operacao= . ) ;
    public final void store() throws RecognitionException, AcessoIndevidoMemoriaException {
        BytecodesAST operacao=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:242:4: ( ^( STORE operacao= . ) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:242:6: ^( STORE operacao= . )
            {
            match(input,STORE,FOLLOW_STORE_in_store742); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            operacao=(BytecodesAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
                  assembler.verificarAumentoMemoriaGlobal(operacao.token);
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
    // $ANTLR end "store"



    // $ANTLR start "storeint"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:248:1: storeint : ^( STORE operacao= . operando= . ) ;
    public final void storeint() throws RecognitionException, AcessoIndevidoMemoriaException, LabelException {
        BytecodesAST operacao=null;
        BytecodesAST operando=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:249:5: ( ^( STORE operacao= . operando= . ) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:249:7: ^( STORE operacao= . operando= . )
            {
            match(input,STORE,FOLLOW_STORE_in_storeint771); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            operacao=(BytecodesAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            operando=(BytecodesAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
                  assembler.verificarAumentoMemoriaGlobal(operacao.token, operando.token);
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
    // $ANTLR end "storeint"



    // $ANTLR start "desvio"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:255:1: desvio : ^( DESVIO operacao= . operando= . ) ;
    public final void desvio() throws RecognitionException, LabelException {
        BytecodesAST operacao=null;
        BytecodesAST operando=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:256:5: ( ^( DESVIO operacao= . operando= . ) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:256:7: ^( DESVIO operacao= . operando= . )
            {
            match(input,DESVIO,FOLLOW_DESVIO_in_desvio812); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            operacao=(BytecodesAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            operando=(BytecodesAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
                  assembler.escreverOpcode(operacao.token, operando.token);
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
    // $ANTLR end "desvio"



    // $ANTLR start "logica"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:262:1: logica : ^( LOGICA operacao= . ) ;
    public final void logica() throws RecognitionException {
        BytecodesAST operacao=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:263:5: ( ^( LOGICA operacao= . ) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:263:7: ^( LOGICA operacao= . )
            {
            match(input,LOGICA,FOLLOW_LOGICA_in_logica853); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            operacao=(BytecodesAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
                  assembler.escreverOpcode(operacao.getText());
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
    // $ANTLR end "logica"



    // $ANTLR start "pilha"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:269:1: pilha : ^( PILHA operacao= . ) ;
    public final void pilha() throws RecognitionException {
        BytecodesAST operacao=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:270:4: ( ^( PILHA operacao= . ) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:270:6: ^( PILHA operacao= . )
            {
            match(input,PILHA,FOLLOW_PILHA_in_pilha887); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            operacao=(BytecodesAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
                  assembler.escreverOpcode(operacao.getText());
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
    // $ANTLR end "pilha"



    // $ANTLR start "label"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:276:1: label : ^( LABEL operacao= . ) ;
    public final void label() throws RecognitionException, LabelException {
        BytecodesAST operacao=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:277:4: ( ^( LABEL operacao= . ) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:277:6: ^( LABEL operacao= . )
            {
            match(input,LABEL,FOLLOW_LABEL_in_label915); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            operacao=(BytecodesAST)input.LT(1);

            matchAny(input); if (state.failed) return ;

            match(input, Token.UP, null); if (state.failed) return ;


            if ( state.backtracking==1 ) {
                  assembler.definirLabel(operacao.token);
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
    // $ANTLR end "label"



    // $ANTLR start "retorno"
    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:283:1: retorno : (operacao= 'ireturn' |operacao= 'areturn' |operacao= 'return' ) ;
    public final void retorno() throws RecognitionException {
        BytecodesAST operacao=null;

        try {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:284:2: ( (operacao= 'ireturn' |operacao= 'areturn' |operacao= 'return' ) )
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:284:4: (operacao= 'ireturn' |operacao= 'areturn' |operacao= 'return' )
            {
            // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:284:4: (operacao= 'ireturn' |operacao= 'areturn' |operacao= 'return' )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt6=1;
                }
                break;
            case 44:
                {
                alt6=2;
                }
                break;
            case 100:
                {
                alt6=3;
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
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:284:8: operacao= 'ireturn'
                    {
                    operacao=(BytecodesAST)match(input,86,FOLLOW_86_in_retorno951); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:285:8: operacao= 'areturn'
                    {
                    operacao=(BytecodesAST)match(input,44,FOLLOW_44_in_retorno965); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\Git\\IGED\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:286:8: operacao= 'return'
                    {
                    operacao=(BytecodesAST)match(input,100,FOLLOW_100_in_retorno979); if (state.failed) return ;

                    }
                    break;

            }


            if ( state.backtracking==1 ) {
            	   assembler.escreverOpcode(operacao.getText());
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
    // $ANTLR end "retorno"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\37\uffff";
    static final String DFA1_eofS =
        "\37\uffff";
    static final String DFA1_minS =
        "\1\4\11\uffff\2\2\5\uffff\2\4\2\2\1\4\2\uffff\1\4\2\uffff\4\3";
    static final String DFA1_maxS =
        "\1\144\11\uffff\2\2\5\uffff\5\144\2\uffff\1\144\2\uffff\4\144";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\2\uffff\1\16\1\17"+
        "\1\20\1\21\1\22\5\uffff\1\12\1\13\1\uffff\1\14\1\15\4\uffff";
    static final String DFA1_specialS =
        "\37\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\11\1\uffff\1\3\1\14\1\uffff\1\4\4\uffff\1\17\1\12\1\15\1"+
            "\uffff\1\2\3\uffff\1\16\1\13\6\uffff\1\1\15\uffff\1\20\6\uffff"+
            "\1\5\37\uffff\1\7\2\uffff\1\20\10\uffff\1\10\3\uffff\1\6\1\20",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\21",
            "\1\22",
            "",
            "",
            "",
            "",
            "",
            "\141\23",
            "\141\24",
            "\1\25\1\26\141\27",
            "\1\30\1\31\141\32",
            "\141\33",
            "",
            "",
            "\141\34",
            "",
            "",
            "\1\35\141\33",
            "\1\36\141\34",
            "\1\26\141\27",
            "\1\31\141\32"
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
            return "102:1: topdown : ( entraNaClasse | entraNoMetodo | entraNoConstrutor | declaracaoVariavel | getfield | putfield | invokespecial | novaClasse | aritmetica | load | loadint | store | storeint | desvio | logica | pilha | label | retorno );";
        }
    }
 

    public static final BitSet FOLLOW_entraNaClasse_in_topdown61 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_entraNoMetodo_in_topdown71 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_entraNoConstrutor_in_topdown81 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracaoVariavel_in_topdown91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_getfield_in_topdown101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_putfield_in_topdown111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_invokespecial_in_topdown121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_novaClasse_in_topdown131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aritmetica_in_topdown141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_load_in_topdown151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loadint_in_topdown161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_store_in_topdown171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_storeint_in_topdown181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_desvio_in_topdown191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logica_in_topdown201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pilha_in_topdown211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_label_in_topdown221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_retorno_in_topdown231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_saiDoMetodo_in_bottomup252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_saiDoConstrutor_in_bottomup260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_entraNaClasse283 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_entraNaClasse287 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_EXTENDS_in_entraNaClasse291 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_TIPO_REF_in_entraNaClasse295 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FIELD_DECL_in_declaracaoVariavel333 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_declaracaoVariavel335 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_CONSTR_DECL_in_entraNoConstrutor370 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INIT_in_entraNoConstrutor372 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_METHOD_DECL_in_entraNoMetodo395 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_entraNoMetodo397 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x0000001FFFFFFFFFL});
    public static final BitSet FOLLOW_METHOD_DECL_in_saiDoMetodo419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTR_DECL_in_saiDoConstrutor435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_getfield457 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_99_in_putfield506 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_83_in_invokespecial555 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_95_in_novaClasse606 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ARITMETICA_in_aritmetica637 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LOAD_in_load671 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LOAD_in_loadint700 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STORE_in_store742 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STORE_in_storeint771 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DESVIO_in_desvio812 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LOGICA_in_logica853 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PILHA_in_pilha887 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LABEL_in_label915 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_86_in_retorno951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_retorno965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_retorno979 = new BitSet(new long[]{0x0000000000000002L});

}