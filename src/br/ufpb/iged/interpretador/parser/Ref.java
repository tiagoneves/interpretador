// $ANTLR 3.4 C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g 2012-07-05 12:07:16

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
        BytecodeAssembler assembler;
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
              (SimboloClasse)tabelaSimbolos.global.resolver(nomeClasse);
          
            if(!assembler.getConstantPool().contains(simboloClasse))
          
              assembler.getConstantPool().add(simboloClasse);
        
            BytecodeAssembler.escreverInteiro(BytecodeAssembler.codigo, 
              BytecodeAssembler.ip, assembler.getConstantPool().indexOf(simboloClasse));
        
        
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
              (SimboloClasse)tabelaSimbolos.global.resolver(nomeClasse);
        
          if(!assembler.getConstantPool().contains(simboloClasse))
          
              assembler.getConstantPool().add(simboloClasse);
        
           BytecodeAssembler.escreverInteiro(BytecodeAssembler.codigo, 
              BytecodeAssembler.ip, assembler.getConstantPool().indexOf(simboloClasse));
        
      }
        



    // $ANTLR start "topdown"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:84:1: topdown : ( entraNaClasse | declaracaoVariavel | getfield | putfield | invokespecial | aritmetica | load | loadint | store | storeint | desvio | logica | pilha | label );
    public final void topdown() throws RecognitionException {
        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:85:5: ( entraNaClasse | declaracaoVariavel | getfield | putfield | invokespecial | aritmetica | load | loadint | store | storeint | desvio | logica | pilha | label )
            int alt1=14;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:85:9: entraNaClasse
                    {
                    pushFollow(FOLLOW_entraNaClasse_in_topdown61);
                    entraNaClasse();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:86:9: declaracaoVariavel
                    {
                    pushFollow(FOLLOW_declaracaoVariavel_in_topdown71);
                    declaracaoVariavel();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:87:9: getfield
                    {
                    pushFollow(FOLLOW_getfield_in_topdown81);
                    getfield();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:88:9: putfield
                    {
                    pushFollow(FOLLOW_putfield_in_topdown91);
                    putfield();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:89:9: invokespecial
                    {
                    pushFollow(FOLLOW_invokespecial_in_topdown101);
                    invokespecial();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:90:9: aritmetica
                    {
                    pushFollow(FOLLOW_aritmetica_in_topdown111);
                    aritmetica();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:91:9: load
                    {
                    pushFollow(FOLLOW_load_in_topdown122);
                    load();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:92:9: loadint
                    {
                    pushFollow(FOLLOW_loadint_in_topdown132);
                    loadint();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:93:9: store
                    {
                    pushFollow(FOLLOW_store_in_topdown143);
                    store();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 10 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:94:9: storeint
                    {
                    pushFollow(FOLLOW_storeint_in_topdown153);
                    storeint();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 11 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:95:9: desvio
                    {
                    pushFollow(FOLLOW_desvio_in_topdown164);
                    desvio();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 12 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:96:9: logica
                    {
                    pushFollow(FOLLOW_logica_in_topdown175);
                    logica();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 13 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:97:9: pilha
                    {
                    pushFollow(FOLLOW_pilha_in_topdown185);
                    pilha();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 14 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:98:9: label
                    {
                    pushFollow(FOLLOW_label_in_topdown195);
                    label();

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
			System.out.println(e.getMessage());
		} catch (AcessoIndevidoMemoriaException e) {
			System.out.println(e.getMessage());
		}

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "topdown"



    // $ANTLR start "entraNaClasse"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:101:1: entraNaClasse : ^( '.class' nome= ID ( ^( EXTENDS sup= ID ) )? . ) ;
    public final void entraNaClasse() throws RecognitionException {
        BytecodesAST nome=null;
        BytecodesAST sup=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:102:5: ( ^( '.class' nome= ID ( ^( EXTENDS sup= ID ) )? . ) )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:102:9: ^( '.class' nome= ID ( ^( EXTENDS sup= ID ) )? . )
            {
            match(input,23,FOLLOW_23_in_entraNaClasse220); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            nome=(BytecodesAST)match(input,ID,FOLLOW_ID_in_entraNaClasse224); if (state.failed) return ;

            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:102:28: ( ^( EXTENDS sup= ID ) )?
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

                            if ( ((LA2_5 >= ARITMETICA && LA2_5 <= 86)) ) {
                                alt2=1;
                            }
                        }
                    }
                }
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:102:29: ^( EXTENDS sup= ID )
                    {
                    match(input,EXTENDS,FOLLOW_EXTENDS_in_entraNaClasse228); if (state.failed) return ;

                    match(input, Token.DOWN, null); if (state.failed) return ;
                    sup=(BytecodesAST)match(input,ID,FOLLOW_ID_in_entraNaClasse232); if (state.failed) return ;

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
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:118:1: declaracaoVariavel : ^( FIELD_DECL ID tip= . ) ;
    public final void declaracaoVariavel() throws RecognitionException {
        BytecodesAST ID1=null;
        BytecodesAST tip=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:119:5: ( ^( FIELD_DECL ID tip= . ) )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:119:9: ^( FIELD_DECL ID tip= . )
            {
            match(input,FIELD_DECL,FOLLOW_FIELD_DECL_in_declaracaoVariavel272); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            ID1=(BytecodesAST)match(input,ID,FOLLOW_ID_in_declaracaoVariavel274); if (state.failed) return ;

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



    // $ANTLR start "getfield"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:126:1: getfield : ^( 'getfield' classe= . . campo= . tipo= . ) ;
    public final void getfield() throws RecognitionException {
        BytecodesAST classe=null;
        BytecodesAST campo=null;
        BytecodesAST tipo=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:127:5: ( ^( 'getfield' classe= . . campo= . tipo= . ) )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:127:7: ^( 'getfield' classe= . . campo= . tipo= . )
            {
            match(input,40,FOLLOW_40_in_getfield313); if (state.failed) return ;

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
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:133:1: putfield : ^( 'putfield' classe= . . campo= . tipo= . ) ;
    public final void putfield() throws RecognitionException {
        BytecodesAST classe=null;
        BytecodesAST campo=null;
        BytecodesAST tipo=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:134:5: ( ^( 'putfield' classe= . . campo= . tipo= . ) )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:134:7: ^( 'putfield' classe= . . campo= . tipo= . )
            {
            match(input,86,FOLLOW_86_in_putfield363); if (state.failed) return ;

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
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:140:1: invokespecial : ^( 'invokespecial' classe= . . metodo= . args= . tipo= . ) ;
    public final void invokespecial() throws RecognitionException {
        BytecodesAST classe=null;
        BytecodesAST metodo=null;
        BytecodesAST args=null;
        BytecodesAST tipo=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:141:5: ( ^( 'invokespecial' classe= . . metodo= . args= . tipo= . ) )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:141:7: ^( 'invokespecial' classe= . . metodo= . args= . tipo= . )
            {
            match(input,72,FOLLOW_72_in_invokespecial413); if (state.failed) return ;

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



    // $ANTLR start "aritmetica"
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:147:1: aritmetica : ^( ARITMETICA operacao= . ) ;
    public final void aritmetica() throws RecognitionException {
        BytecodesAST operacao=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:148:5: ( ^( ARITMETICA operacao= . ) )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:148:7: ^( ARITMETICA operacao= . )
            {
            match(input,ARITMETICA,FOLLOW_ARITMETICA_in_aritmetica468); if (state.failed) return ;

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
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:154:1: load : ^( LOAD operacao= . ) ;
    public final void load() throws RecognitionException {
        BytecodesAST operacao=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:155:3: ( ^( LOAD operacao= . ) )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:155:5: ^( LOAD operacao= . )
            {
            match(input,LOAD,FOLLOW_LOAD_in_load502); if (state.failed) return ;

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
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:161:1: loadint : ^( LOAD operacao= . operando= . ) ;
    public final void loadint() throws RecognitionException, LabelException {
        BytecodesAST operacao=null;
        BytecodesAST operando=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:162:5: ( ^( LOAD operacao= . operando= . ) )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:162:7: ^( LOAD operacao= . operando= . )
            {
            match(input,LOAD,FOLLOW_LOAD_in_loadint531); if (state.failed) return ;

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
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:168:1: store : ^( STORE operacao= . ) ;
    public final void store() throws RecognitionException, AcessoIndevidoMemoriaException {
        BytecodesAST operacao=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:169:4: ( ^( STORE operacao= . ) )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:169:6: ^( STORE operacao= . )
            {
            match(input,STORE,FOLLOW_STORE_in_store574); if (state.failed) return ;

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
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:175:1: storeint : ^( STORE operacao= . operando= . ) ;
    public final void storeint() throws RecognitionException, AcessoIndevidoMemoriaException, LabelException {
        BytecodesAST operacao=null;
        BytecodesAST operando=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:176:5: ( ^( STORE operacao= . operando= . ) )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:176:7: ^( STORE operacao= . operando= . )
            {
            match(input,STORE,FOLLOW_STORE_in_storeint603); if (state.failed) return ;

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
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:182:1: desvio : ^( DESVIO operacao= . operando= . ) ;
    public final void desvio() throws RecognitionException, LabelException {
        BytecodesAST operacao=null;
        BytecodesAST operando=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:183:5: ( ^( DESVIO operacao= . operando= . ) )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:183:7: ^( DESVIO operacao= . operando= . )
            {
            match(input,DESVIO,FOLLOW_DESVIO_in_desvio644); if (state.failed) return ;

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
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:189:1: logica : ^( LOGICA operacao= . ) ;
    public final void logica() throws RecognitionException {
        BytecodesAST operacao=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:190:5: ( ^( LOGICA operacao= . ) )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:190:7: ^( LOGICA operacao= . )
            {
            match(input,LOGICA,FOLLOW_LOGICA_in_logica685); if (state.failed) return ;

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
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:196:1: pilha : ^( PILHA operacao= . ) ;
    public final void pilha() throws RecognitionException {
        BytecodesAST operacao=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:197:4: ( ^( PILHA operacao= . ) )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:197:6: ^( PILHA operacao= . )
            {
            match(input,PILHA,FOLLOW_PILHA_in_pilha719); if (state.failed) return ;

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
    // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:203:1: label : ^( LABEL operacao= . ) ;
    public final void label() throws RecognitionException, LabelException {
        BytecodesAST operacao=null;

        try {
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:204:4: ( ^( LABEL operacao= . ) )
            // C:\\Users\\Tiago\\git\\interpretador\\src\\br\\ufpb\\iged\\interpretador\\gramaticas\\Ref.g:204:6: ^( LABEL operacao= . )
            {
            match(input,LABEL,FOLLOW_LABEL_in_label747); if (state.failed) return ;

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

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String DFA1_eotS =
        "\33\uffff";
    static final String DFA1_eofS =
        "\33\uffff";
    static final String DFA1_minS =
        "\1\4\6\uffff\2\2\4\uffff\2\4\2\2\1\4\2\uffff\1\4\2\uffff\4\3";
    static final String DFA1_maxS =
        "\1\126\6\uffff\2\2\4\uffff\5\126\2\uffff\1\126\2\uffff\4\126";
    static final String DFA1_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\2\uffff\1\13\1\14\1\15\1\16\5\uffff"+
        "\1\7\1\10\1\uffff\1\11\1\12\4\uffff";
    static final String DFA1_specialS =
        "\33\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\6\1\11\1\uffff\1\2\4\uffff\1\14\1\7\1\12\3\uffff\1\13\1\10"+
            "\3\uffff\1\1\20\uffff\1\3\37\uffff\1\5\15\uffff\1\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\15",
            "\1\16",
            "",
            "",
            "",
            "",
            "\123\17",
            "\123\20",
            "\1\21\1\22\123\23",
            "\1\24\1\25\123\26",
            "\123\27",
            "",
            "",
            "\123\30",
            "",
            "",
            "\1\31\123\27",
            "\1\32\123\30",
            "\1\22\123\23",
            "\1\25\123\26"
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
            return "84:1: topdown : ( entraNaClasse | declaracaoVariavel | getfield | putfield | invokespecial | aritmetica | load | loadint | store | storeint | desvio | logica | pilha | label );";
        }
    }
 

    public static final BitSet FOLLOW_entraNaClasse_in_topdown61 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaracaoVariavel_in_topdown71 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_getfield_in_topdown81 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_putfield_in_topdown91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_invokespecial_in_topdown101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aritmetica_in_topdown111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_load_in_topdown122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loadint_in_topdown132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_store_in_topdown143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_storeint_in_topdown153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_desvio_in_topdown164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logica_in_topdown175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_pilha_in_topdown185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_label_in_topdown195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_entraNaClasse220 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_entraNaClasse224 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000000007FFFFFL});
    public static final BitSet FOLLOW_EXTENDS_in_entraNaClasse228 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_entraNaClasse232 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FIELD_DECL_in_declaracaoVariavel272 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_declaracaoVariavel274 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x00000000007FFFFFL});
    public static final BitSet FOLLOW_40_in_getfield313 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_86_in_putfield363 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_72_in_invokespecial413 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ARITMETICA_in_aritmetica468 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LOAD_in_load502 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LOAD_in_loadint531 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STORE_in_store574 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STORE_in_storeint603 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DESVIO_in_desvio644 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LOGICA_in_logica685 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PILHA_in_pilha719 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_LABEL_in_label747 = new BitSet(new long[]{0x0000000000000004L});

}