// Generated from Gramatica.g4 by ANTLR 4.7.2

	import java.util.ArrayList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Atrib=1, IniDelim=2, FimDelim=3, OpRelMaior=4, OpRelMaiorIgual=5, OpRelMenor=6, 
		OpRelMenorIgual=7, OpRelDif=8, OpRelIgual=9, OpAritMult=10, OpAritDiv=11, 
		OpAritSoma=12, OpAritSub=13, OpBoolE=14, OpBoolOu=15, AbrePar=16, FechaPar=17, 
		PCDec=18, PCImprimir=19, PCSe=20, PCEntao=21, PCSenao=22, PCEnqto=23, 
		PCIni=24, PCFim=25, PCProg=26, PCInt=27, PCReal=28, PCLer=29, Var=30, 
		Cadeia=31, NumInt=32, NumReal=33, Coment=34, EspBranco=35;
	public static final int
		RULE_programa = 0, RULE_listaDeclaracoes = 1, RULE_declaracao = 2, RULE_listaComandos = 3, 
		RULE_expressaoAritmetica = 4, RULE_expressaoAritmetica2 = 5, RULE_termoAritmetico = 6, 
		RULE_termoAritmetico2 = 7, RULE_fatorAritmetico = 8, RULE_comando = 9, 
		RULE_comandoAtribuicao = 10, RULE_comandoEntrada = 11, RULE_comandoSaida = 12, 
		RULE_comandoCondicao = 13, RULE_comandoCondicao2 = 14, RULE_comandoRepeticao = 15, 
		RULE_subAlgoritmo = 16, RULE_expressaoRel = 17, RULE_expressaoRel2 = 18, 
		RULE_termoRelacional = 19, RULE_opRel = 20, RULE_operadorBooleano = 21, 
		RULE_tipoVar = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "listaDeclaracoes", "declaracao", "listaComandos", "expressaoAritmetica", 
			"expressaoAritmetica2", "termoAritmetico", "termoAritmetico2", "fatorAritmetico", 
			"comando", "comandoAtribuicao", "comandoEntrada", "comandoSaida", "comandoCondicao", 
			"comandoCondicao2", "comandoRepeticao", "subAlgoritmo", "expressaoRel", 
			"expressaoRel2", "termoRelacional", "opRel", "operadorBooleano", "tipoVar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<<'", "'['", "']'", "'>'", "'>='", "'<'", "'<='", "'<>'", "'=='", 
			"'*'", "'/'", "'+'", "'-'", "'and'", "'or'", "'('", "')'", "'dec'", "'print'", 
			"'if'", "'then'", "'else'", "'while'", "'start'", "'end'", "'prog'", 
			"'integer'", "'float'", "'read'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Atrib", "IniDelim", "FimDelim", "OpRelMaior", "OpRelMaiorIgual", 
			"OpRelMenor", "OpRelMenorIgual", "OpRelDif", "OpRelIgual", "OpAritMult", 
			"OpAritDiv", "OpAritSoma", "OpAritSub", "OpBoolE", "OpBoolOu", "AbrePar", 
			"FechaPar", "PCDec", "PCImprimir", "PCSe", "PCEntao", "PCSenao", "PCEnqto", 
			"PCIni", "PCFim", "PCProg", "PCInt", "PCReal", "PCLer", "Var", "Cadeia", 
			"NumInt", "NumReal", "Coment", "EspBranco"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public List<TerminalNode> IniDelim() { return getTokens(GramaticaParser.IniDelim); }
		public TerminalNode IniDelim(int i) {
			return getToken(GramaticaParser.IniDelim, i);
		}
		public TerminalNode PCDec() { return getToken(GramaticaParser.PCDec, 0); }
		public List<TerminalNode> FimDelim() { return getTokens(GramaticaParser.FimDelim); }
		public TerminalNode FimDelim(int i) {
			return getToken(GramaticaParser.FimDelim, i);
		}
		public ListaDeclaracoesContext listaDeclaracoes() {
			return getRuleContext(ListaDeclaracoesContext.class,0);
		}
		public TerminalNode PCProg() { return getToken(GramaticaParser.PCProg, 0); }
		public ListaComandosContext listaComandos() {
			return getRuleContext(ListaComandosContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(IniDelim);
			setState(47);
			match(PCDec);
			setState(48);
			match(FimDelim);
			setState(49);
			listaDeclaracoes();
			setState(50);
			match(IniDelim);
			setState(51);
			match(PCProg);
			setState(52);
			match(FimDelim);
			setState(53);
			listaComandos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListaDeclaracoesContext extends ParserRuleContext {
		public int qtdeDec;
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public ListaDeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaDeclaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterListaDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitListaDeclaracoes(this);
		}
	}

	public final ListaDeclaracoesContext listaDeclaracoes() throws RecognitionException {
		ListaDeclaracoesContext _localctx = new ListaDeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_listaDeclaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ListaDeclaracoesContext)_localctx).qtdeDec = 0;
			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(56);
				declaracao();
				_localctx.qtdeDec++;
				}
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Var );
			System.out.println("A qtde de variaveis declaradas eh: "+_localctx.qtdeDec);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracaoContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(GramaticaParser.Var, 0); }
		public TerminalNode IniDelim() { return getToken(GramaticaParser.IniDelim, 0); }
		public TipoVarContext tipoVar() {
			return getRuleContext(TipoVarContext.class,0);
		}
		public TerminalNode FimDelim() { return getToken(GramaticaParser.FimDelim, 0); }
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDeclaracao(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(Var);
			setState(66);
			match(IniDelim);
			setState(67);
			tipoVar();
			setState(68);
			match(FimDelim);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListaComandosContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ListaComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaComandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterListaComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitListaComandos(this);
		}
	}

	public final ListaComandosContext listaComandos() throws RecognitionException {
		ListaComandosContext _localctx = new ListaComandosContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_listaComandos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(70);
				comando();
				}
				}
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PCImprimir) | (1L << PCSe) | (1L << PCEnqto) | (1L << PCIni) | (1L << PCLer) | (1L << Var))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressaoAritmeticaContext extends ParserRuleContext {
		public TermoAritmeticoContext termoAritmetico() {
			return getRuleContext(TermoAritmeticoContext.class,0);
		}
		public ExpressaoAritmetica2Context expressaoAritmetica2() {
			return getRuleContext(ExpressaoAritmetica2Context.class,0);
		}
		public ExpressaoAritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoAritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExpressaoAritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExpressaoAritmetica(this);
		}
	}

	public final ExpressaoAritmeticaContext expressaoAritmetica() throws RecognitionException {
		ExpressaoAritmeticaContext _localctx = new ExpressaoAritmeticaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expressaoAritmetica);
		try {
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				termoAritmetico();
				setState(76);
				expressaoAritmetica2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				termoAritmetico();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressaoAritmetica2Context extends ParserRuleContext {
		public TerminalNode OpAritSoma() { return getToken(GramaticaParser.OpAritSoma, 0); }
		public TermoAritmeticoContext termoAritmetico() {
			return getRuleContext(TermoAritmeticoContext.class,0);
		}
		public ExpressaoAritmeticaContext expressaoAritmetica() {
			return getRuleContext(ExpressaoAritmeticaContext.class,0);
		}
		public TerminalNode OpAritSub() { return getToken(GramaticaParser.OpAritSub, 0); }
		public ExpressaoAritmetica2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoAritmetica2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExpressaoAritmetica2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExpressaoAritmetica2(this);
		}
	}

	public final ExpressaoAritmetica2Context expressaoAritmetica2() throws RecognitionException {
		ExpressaoAritmetica2Context _localctx = new ExpressaoAritmetica2Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_expressaoAritmetica2);
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpAritSoma:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(OpAritSoma);
				setState(82);
				termoAritmetico();
				setState(83);
				expressaoAritmetica();
				}
				break;
			case OpAritSub:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				match(OpAritSub);
				setState(86);
				termoAritmetico();
				setState(87);
				expressaoAritmetica();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermoAritmeticoContext extends ParserRuleContext {
		public FatorAritmeticoContext fatorAritmetico() {
			return getRuleContext(FatorAritmeticoContext.class,0);
		}
		public TermoAritmetico2Context termoAritmetico2() {
			return getRuleContext(TermoAritmetico2Context.class,0);
		}
		public TermoAritmeticoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termoAritmetico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTermoAritmetico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTermoAritmetico(this);
		}
	}

	public final TermoAritmeticoContext termoAritmetico() throws RecognitionException {
		TermoAritmeticoContext _localctx = new TermoAritmeticoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_termoAritmetico);
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				fatorAritmetico();
				setState(92);
				termoAritmetico2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				fatorAritmetico();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermoAritmetico2Context extends ParserRuleContext {
		public TerminalNode OpAritMult() { return getToken(GramaticaParser.OpAritMult, 0); }
		public FatorAritmeticoContext fatorAritmetico() {
			return getRuleContext(FatorAritmeticoContext.class,0);
		}
		public TermoAritmeticoContext termoAritmetico() {
			return getRuleContext(TermoAritmeticoContext.class,0);
		}
		public TerminalNode OpAritDiv() { return getToken(GramaticaParser.OpAritDiv, 0); }
		public TermoAritmetico2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termoAritmetico2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTermoAritmetico2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTermoAritmetico2(this);
		}
	}

	public final TermoAritmetico2Context termoAritmetico2() throws RecognitionException {
		TermoAritmetico2Context _localctx = new TermoAritmetico2Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_termoAritmetico2);
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpAritMult:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(OpAritMult);
				setState(98);
				fatorAritmetico();
				setState(99);
				termoAritmetico();
				}
				break;
			case OpAritDiv:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(OpAritDiv);
				setState(102);
				fatorAritmetico();
				setState(103);
				termoAritmetico();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FatorAritmeticoContext extends ParserRuleContext {
		public TipoVarContext tipoVar() {
			return getRuleContext(TipoVarContext.class,0);
		}
		public TerminalNode Var() { return getToken(GramaticaParser.Var, 0); }
		public TerminalNode AbrePar() { return getToken(GramaticaParser.AbrePar, 0); }
		public ExpressaoAritmeticaContext expressaoAritmetica() {
			return getRuleContext(ExpressaoAritmeticaContext.class,0);
		}
		public TerminalNode FechaPar() { return getToken(GramaticaParser.FechaPar, 0); }
		public FatorAritmeticoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fatorAritmetico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFatorAritmetico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFatorAritmetico(this);
		}
	}

	public final FatorAritmeticoContext fatorAritmetico() throws RecognitionException {
		FatorAritmeticoContext _localctx = new FatorAritmeticoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fatorAritmetico);
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PCInt:
			case PCReal:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				tipoVar();
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(Var);
				}
				break;
			case AbrePar:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				match(AbrePar);
				setState(110);
				expressaoAritmetica();
				setState(111);
				match(FechaPar);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComandoContext extends ParserRuleContext {
		public ComandoAtribuicaoContext comandoAtribuicao() {
			return getRuleContext(ComandoAtribuicaoContext.class,0);
		}
		public ComandoEntradaContext comandoEntrada() {
			return getRuleContext(ComandoEntradaContext.class,0);
		}
		public ComandoSaidaContext comandoSaida() {
			return getRuleContext(ComandoSaidaContext.class,0);
		}
		public ComandoCondicaoContext comandoCondicao() {
			return getRuleContext(ComandoCondicaoContext.class,0);
		}
		public ComandoRepeticaoContext comandoRepeticao() {
			return getRuleContext(ComandoRepeticaoContext.class,0);
		}
		public SubAlgoritmoContext subAlgoritmo() {
			return getRuleContext(SubAlgoritmoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comando);
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				comandoAtribuicao();
				}
				break;
			case PCLer:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				comandoEntrada();
				}
				break;
			case PCImprimir:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				comandoSaida();
				}
				break;
			case PCSe:
				enterOuterAlt(_localctx, 4);
				{
				setState(118);
				comandoCondicao();
				}
				break;
			case PCEnqto:
				enterOuterAlt(_localctx, 5);
				{
				setState(119);
				comandoRepeticao();
				}
				break;
			case PCIni:
				enterOuterAlt(_localctx, 6);
				{
				setState(120);
				subAlgoritmo();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComandoAtribuicaoContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(GramaticaParser.Var, 0); }
		public TerminalNode Atrib() { return getToken(GramaticaParser.Atrib, 0); }
		public ExpressaoAritmeticaContext expressaoAritmetica() {
			return getRuleContext(ExpressaoAritmeticaContext.class,0);
		}
		public ComandoAtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoAtribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterComandoAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitComandoAtribuicao(this);
		}
	}

	public final ComandoAtribuicaoContext comandoAtribuicao() throws RecognitionException {
		ComandoAtribuicaoContext _localctx = new ComandoAtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comandoAtribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(Var);
			setState(124);
			match(Atrib);
			setState(125);
			expressaoAritmetica();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComandoEntradaContext extends ParserRuleContext {
		public TerminalNode PCLer() { return getToken(GramaticaParser.PCLer, 0); }
		public TerminalNode Var() { return getToken(GramaticaParser.Var, 0); }
		public ComandoEntradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoEntrada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterComandoEntrada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitComandoEntrada(this);
		}
	}

	public final ComandoEntradaContext comandoEntrada() throws RecognitionException {
		ComandoEntradaContext _localctx = new ComandoEntradaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comandoEntrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(PCLer);
			setState(128);
			match(Var);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComandoSaidaContext extends ParserRuleContext {
		public TerminalNode PCImprimir() { return getToken(GramaticaParser.PCImprimir, 0); }
		public TerminalNode Var() { return getToken(GramaticaParser.Var, 0); }
		public TerminalNode Cadeia() { return getToken(GramaticaParser.Cadeia, 0); }
		public ComandoSaidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoSaida; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterComandoSaida(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitComandoSaida(this);
		}
	}

	public final ComandoSaidaContext comandoSaida() throws RecognitionException {
		ComandoSaidaContext _localctx = new ComandoSaidaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_comandoSaida);
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(PCImprimir);
				setState(131);
				match(Var);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(PCImprimir);
				setState(133);
				match(Cadeia);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComandoCondicaoContext extends ParserRuleContext {
		public TerminalNode PCSe() { return getToken(GramaticaParser.PCSe, 0); }
		public ComandoCondicao2Context comandoCondicao2() {
			return getRuleContext(ComandoCondicao2Context.class,0);
		}
		public ComandoCondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoCondicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterComandoCondicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitComandoCondicao(this);
		}
	}

	public final ComandoCondicaoContext comandoCondicao() throws RecognitionException {
		ComandoCondicaoContext _localctx = new ComandoCondicaoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comandoCondicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(PCSe);
			setState(137);
			comandoCondicao2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComandoCondicao2Context extends ParserRuleContext {
		public ExpressaoRelContext expressaoRel() {
			return getRuleContext(ExpressaoRelContext.class,0);
		}
		public TerminalNode PCEntao() { return getToken(GramaticaParser.PCEntao, 0); }
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public TerminalNode PCSenao() { return getToken(GramaticaParser.PCSenao, 0); }
		public ComandoCondicao2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoCondicao2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterComandoCondicao2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitComandoCondicao2(this);
		}
	}

	public final ComandoCondicao2Context comandoCondicao2() throws RecognitionException {
		ComandoCondicao2Context _localctx = new ComandoCondicao2Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_comandoCondicao2);
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				expressaoRel();
				setState(140);
				match(PCEntao);
				setState(141);
				comando();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				expressaoRel();
				setState(144);
				match(PCSenao);
				setState(145);
				comando();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComandoRepeticaoContext extends ParserRuleContext {
		public TerminalNode PCEnqto() { return getToken(GramaticaParser.PCEnqto, 0); }
		public ExpressaoRelContext expressaoRel() {
			return getRuleContext(ExpressaoRelContext.class,0);
		}
		public TerminalNode PCEntao() { return getToken(GramaticaParser.PCEntao, 0); }
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public ComandoRepeticaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoRepeticao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterComandoRepeticao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitComandoRepeticao(this);
		}
	}

	public final ComandoRepeticaoContext comandoRepeticao() throws RecognitionException {
		ComandoRepeticaoContext _localctx = new ComandoRepeticaoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_comandoRepeticao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(PCEnqto);
			setState(150);
			expressaoRel();
			setState(151);
			match(PCEntao);
			setState(152);
			comando();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubAlgoritmoContext extends ParserRuleContext {
		public TerminalNode PCIni() { return getToken(GramaticaParser.PCIni, 0); }
		public ListaComandosContext listaComandos() {
			return getRuleContext(ListaComandosContext.class,0);
		}
		public TerminalNode PCFim() { return getToken(GramaticaParser.PCFim, 0); }
		public SubAlgoritmoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subAlgoritmo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterSubAlgoritmo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitSubAlgoritmo(this);
		}
	}

	public final SubAlgoritmoContext subAlgoritmo() throws RecognitionException {
		SubAlgoritmoContext _localctx = new SubAlgoritmoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_subAlgoritmo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(PCIni);
			setState(155);
			listaComandos();
			setState(156);
			match(PCFim);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressaoRelContext extends ParserRuleContext {
		public TermoRelacionalContext termoRelacional() {
			return getRuleContext(TermoRelacionalContext.class,0);
		}
		public ExpressaoRel2Context expressaoRel2() {
			return getRuleContext(ExpressaoRel2Context.class,0);
		}
		public ExpressaoRelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoRel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExpressaoRel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExpressaoRel(this);
		}
	}

	public final ExpressaoRelContext expressaoRel() throws RecognitionException {
		ExpressaoRelContext _localctx = new ExpressaoRelContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expressaoRel);
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				termoRelacional();
				setState(159);
				expressaoRel2();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				termoRelacional();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressaoRel2Context extends ParserRuleContext {
		public OperadorBooleanoContext operadorBooleano() {
			return getRuleContext(OperadorBooleanoContext.class,0);
		}
		public TermoRelacionalContext termoRelacional() {
			return getRuleContext(TermoRelacionalContext.class,0);
		}
		public ExpressaoRelContext expressaoRel() {
			return getRuleContext(ExpressaoRelContext.class,0);
		}
		public ExpressaoRel2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoRel2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterExpressaoRel2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitExpressaoRel2(this);
		}
	}

	public final ExpressaoRel2Context expressaoRel2() throws RecognitionException {
		ExpressaoRel2Context _localctx = new ExpressaoRel2Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_expressaoRel2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			operadorBooleano();
			setState(165);
			termoRelacional();
			setState(166);
			expressaoRel();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermoRelacionalContext extends ParserRuleContext {
		public List<ExpressaoAritmeticaContext> expressaoAritmetica() {
			return getRuleContexts(ExpressaoAritmeticaContext.class);
		}
		public ExpressaoAritmeticaContext expressaoAritmetica(int i) {
			return getRuleContext(ExpressaoAritmeticaContext.class,i);
		}
		public OpRelContext opRel() {
			return getRuleContext(OpRelContext.class,0);
		}
		public TerminalNode AbrePar() { return getToken(GramaticaParser.AbrePar, 0); }
		public ExpressaoRelContext expressaoRel() {
			return getRuleContext(ExpressaoRelContext.class,0);
		}
		public TerminalNode FechaPar() { return getToken(GramaticaParser.FechaPar, 0); }
		public TermoRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termoRelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTermoRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTermoRelacional(this);
		}
	}

	public final TermoRelacionalContext termoRelacional() throws RecognitionException {
		TermoRelacionalContext _localctx = new TermoRelacionalContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_termoRelacional);
		try {
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				expressaoAritmetica();
				setState(169);
				opRel();
				setState(170);
				expressaoAritmetica();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(AbrePar);
				setState(173);
				expressaoRel();
				setState(174);
				match(FechaPar);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpRelContext extends ParserRuleContext {
		public TerminalNode OpRelMaior() { return getToken(GramaticaParser.OpRelMaior, 0); }
		public TerminalNode OpRelMaiorIgual() { return getToken(GramaticaParser.OpRelMaiorIgual, 0); }
		public TerminalNode OpRelMenor() { return getToken(GramaticaParser.OpRelMenor, 0); }
		public TerminalNode OpRelMenorIgual() { return getToken(GramaticaParser.OpRelMenorIgual, 0); }
		public TerminalNode OpRelDif() { return getToken(GramaticaParser.OpRelDif, 0); }
		public TerminalNode OpRelIgual() { return getToken(GramaticaParser.OpRelIgual, 0); }
		public OpRelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opRel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterOpRel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitOpRel(this);
		}
	}

	public final OpRelContext opRel() throws RecognitionException {
		OpRelContext _localctx = new OpRelContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_opRel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpRelMaior) | (1L << OpRelMaiorIgual) | (1L << OpRelMenor) | (1L << OpRelMenorIgual) | (1L << OpRelDif) | (1L << OpRelIgual))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperadorBooleanoContext extends ParserRuleContext {
		public TerminalNode OpBoolE() { return getToken(GramaticaParser.OpBoolE, 0); }
		public TerminalNode OpBoolOu() { return getToken(GramaticaParser.OpBoolOu, 0); }
		public OperadorBooleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorBooleano; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterOperadorBooleano(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitOperadorBooleano(this);
		}
	}

	public final OperadorBooleanoContext operadorBooleano() throws RecognitionException {
		OperadorBooleanoContext _localctx = new OperadorBooleanoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_operadorBooleano);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_la = _input.LA(1);
			if ( !(_la==OpBoolE || _la==OpBoolOu) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoVarContext extends ParserRuleContext {
		public TerminalNode PCInt() { return getToken(GramaticaParser.PCInt, 0); }
		public TerminalNode PCReal() { return getToken(GramaticaParser.PCReal, 0); }
		public TipoVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterTipoVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitTipoVar(this);
		}
	}

	public final TipoVarContext tipoVar() throws RecognitionException {
		TipoVarContext _localctx = new TipoVarContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_tipoVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_la = _input.LA(1);
			if ( !(_la==PCInt || _la==PCReal) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u00bb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\6\3>\n\3\r\3\16\3?\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\6\5J\n\5\r\5\16\5K\3\6\3\6\3\6\3\6\5\6R\n\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\\\n\7\3\b\3\b\3\b\3\b\5\bb\n\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tl\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\nt\n\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13|\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\5\16\u0089\n\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u0096\n\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u00a5\n\23\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00b3\n\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\30\2\2\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\2\5\3\2\6\13\3\2\20\21\3\2\35\36\2\u00b4\2\60\3\2\2\2\49\3\2\2\2\6C"+
		"\3\2\2\2\bI\3\2\2\2\nQ\3\2\2\2\f[\3\2\2\2\16a\3\2\2\2\20k\3\2\2\2\22s"+
		"\3\2\2\2\24{\3\2\2\2\26}\3\2\2\2\30\u0081\3\2\2\2\32\u0088\3\2\2\2\34"+
		"\u008a\3\2\2\2\36\u0095\3\2\2\2 \u0097\3\2\2\2\"\u009c\3\2\2\2$\u00a4"+
		"\3\2\2\2&\u00a6\3\2\2\2(\u00b2\3\2\2\2*\u00b4\3\2\2\2,\u00b6\3\2\2\2."+
		"\u00b8\3\2\2\2\60\61\7\4\2\2\61\62\7\24\2\2\62\63\7\5\2\2\63\64\5\4\3"+
		"\2\64\65\7\4\2\2\65\66\7\34\2\2\66\67\7\5\2\2\678\5\b\5\28\3\3\2\2\29"+
		"=\b\3\1\2:;\5\6\4\2;<\b\3\1\2<>\3\2\2\2=:\3\2\2\2>?\3\2\2\2?=\3\2\2\2"+
		"?@\3\2\2\2@A\3\2\2\2AB\b\3\1\2B\5\3\2\2\2CD\7 \2\2DE\7\4\2\2EF\5.\30\2"+
		"FG\7\5\2\2G\7\3\2\2\2HJ\5\24\13\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2"+
		"\2\2L\t\3\2\2\2MN\5\16\b\2NO\5\f\7\2OR\3\2\2\2PR\5\16\b\2QM\3\2\2\2QP"+
		"\3\2\2\2R\13\3\2\2\2ST\7\16\2\2TU\5\16\b\2UV\5\n\6\2V\\\3\2\2\2WX\7\17"+
		"\2\2XY\5\16\b\2YZ\5\n\6\2Z\\\3\2\2\2[S\3\2\2\2[W\3\2\2\2\\\r\3\2\2\2]"+
		"^\5\22\n\2^_\5\20\t\2_b\3\2\2\2`b\5\22\n\2a]\3\2\2\2a`\3\2\2\2b\17\3\2"+
		"\2\2cd\7\f\2\2de\5\22\n\2ef\5\16\b\2fl\3\2\2\2gh\7\r\2\2hi\5\22\n\2ij"+
		"\5\16\b\2jl\3\2\2\2kc\3\2\2\2kg\3\2\2\2l\21\3\2\2\2mt\5.\30\2nt\7 \2\2"+
		"op\7\22\2\2pq\5\n\6\2qr\7\23\2\2rt\3\2\2\2sm\3\2\2\2sn\3\2\2\2so\3\2\2"+
		"\2t\23\3\2\2\2u|\5\26\f\2v|\5\30\r\2w|\5\32\16\2x|\5\34\17\2y|\5 \21\2"+
		"z|\5\"\22\2{u\3\2\2\2{v\3\2\2\2{w\3\2\2\2{x\3\2\2\2{y\3\2\2\2{z\3\2\2"+
		"\2|\25\3\2\2\2}~\7 \2\2~\177\7\3\2\2\177\u0080\5\n\6\2\u0080\27\3\2\2"+
		"\2\u0081\u0082\7\37\2\2\u0082\u0083\7 \2\2\u0083\31\3\2\2\2\u0084\u0085"+
		"\7\25\2\2\u0085\u0089\7 \2\2\u0086\u0087\7\25\2\2\u0087\u0089\7!\2\2\u0088"+
		"\u0084\3\2\2\2\u0088\u0086\3\2\2\2\u0089\33\3\2\2\2\u008a\u008b\7\26\2"+
		"\2\u008b\u008c\5\36\20\2\u008c\35\3\2\2\2\u008d\u008e\5$\23\2\u008e\u008f"+
		"\7\27\2\2\u008f\u0090\5\24\13\2\u0090\u0096\3\2\2\2\u0091\u0092\5$\23"+
		"\2\u0092\u0093\7\30\2\2\u0093\u0094\5\24\13\2\u0094\u0096\3\2\2\2\u0095"+
		"\u008d\3\2\2\2\u0095\u0091\3\2\2\2\u0096\37\3\2\2\2\u0097\u0098\7\31\2"+
		"\2\u0098\u0099\5$\23\2\u0099\u009a\7\27\2\2\u009a\u009b\5\24\13\2\u009b"+
		"!\3\2\2\2\u009c\u009d\7\32\2\2\u009d\u009e\5\b\5\2\u009e\u009f\7\33\2"+
		"\2\u009f#\3\2\2\2\u00a0\u00a1\5(\25\2\u00a1\u00a2\5&\24\2\u00a2\u00a5"+
		"\3\2\2\2\u00a3\u00a5\5(\25\2\u00a4\u00a0\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5"+
		"%\3\2\2\2\u00a6\u00a7\5,\27\2\u00a7\u00a8\5(\25\2\u00a8\u00a9\5$\23\2"+
		"\u00a9\'\3\2\2\2\u00aa\u00ab\5\n\6\2\u00ab\u00ac\5*\26\2\u00ac\u00ad\5"+
		"\n\6\2\u00ad\u00b3\3\2\2\2\u00ae\u00af\7\22\2\2\u00af\u00b0\5$\23\2\u00b0"+
		"\u00b1\7\23\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00aa\3\2\2\2\u00b2\u00ae\3"+
		"\2\2\2\u00b3)\3\2\2\2\u00b4\u00b5\t\2\2\2\u00b5+\3\2\2\2\u00b6\u00b7\t"+
		"\3\2\2\u00b7-\3\2\2\2\u00b8\u00b9\t\4\2\2\u00b9/\3\2\2\2\16?KQ[aks{\u0088"+
		"\u0095\u00a4\u00b2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}