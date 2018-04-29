// Generated from RochGrammar.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RochGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__19=1, T__18=2, T__17=3, T__16=4, T__15=5, T__14=6, T__13=7, T__12=8, 
		T__11=9, T__10=10, T__9=11, T__8=12, T__7=13, T__6=14, T__5=15, T__4=16, 
		T__3=17, T__2=18, T__1=19, T__0=20, Character=21, Integer=22, Digit=23, 
		Bool=24, BlankWhiteSpace=25, Comment=26;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'terminate'", "'>='", "'otherwise'", "'<'", "'num'", 
		"'='", "'bool'", "'>'", "'until'", "'check'", "'<='", "'start'", "'untilEnd'", 
		"'display('", "'checkEnd'", "')'", "'*'", "'+'", "'-'", "Character", "Integer", 
		"Digit", "Bool", "BlankWhiteSpace", "Comment"
	};
	public static final int
		RULE_grammarstart = 0, RULE_block = 1, RULE_statement = 2, RULE_assignment = 3, 
		RULE_arithmeticExp = 4, RULE_conditionalExp = 5, RULE_dataType = 6, RULE_checkCondition = 7, 
		RULE_check = 8, RULE_otherwise = 9, RULE_checkEnd = 10, RULE_untilLoop = 11, 
		RULE_until = 12, RULE_untilEnd = 13, RULE_variableDeclaration = 14, RULE_identifier = 15, 
		RULE_display = 16;
	public static final String[] ruleNames = {
		"grammarstart", "block", "statement", "assignment", "arithmeticExp", "conditionalExp", 
		"dataType", "checkCondition", "check", "otherwise", "checkEnd", "untilLoop", 
		"until", "untilEnd", "variableDeclaration", "identifier", "display"
	};

	@Override
	public String getGrammarFileName() { return "RochGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RochGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GrammarstartContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public GrammarstartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarstart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RochGrammarListener ) ((RochGrammarListener)listener).enterGrammarstart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RochGrammarListener ) ((RochGrammarListener)listener).exitGrammarstart(this);
		}
	}

	public final GrammarstartContext grammarstart() throws RecognitionException {
		GrammarstartContext _localctx = new GrammarstartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_grammarstart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34); match(T__7);
			setState(35); block();
			setState(36); match(T__18);
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

	public static class BlockContext extends ParserRuleContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RochGrammarListener ) ((RochGrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RochGrammarListener ) ((RochGrammarListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(38); statement();
				}
				}
				setState(41); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__12) | (1L << T__10) | (1L << T__9) | (1L << T__5) | (1L << Character))) != 0) );
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

	public static class StatementContext extends ParserRuleContext {
		public CheckConditionContext checkCondition() {
			return getRuleContext(CheckConditionContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public DisplayContext display() {
			return getRuleContext(DisplayContext.class,0);
		}
		public UntilLoopContext untilLoop() {
			return getRuleContext(UntilLoopContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RochGrammarListener ) ((RochGrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RochGrammarListener ) ((RochGrammarListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(48);
			switch (_input.LA(1)) {
			case T__14:
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(43); variableDeclaration();
				}
				break;
			case Character:
				enterOuterAlt(_localctx, 2);
				{
				setState(44); assignment();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(45); display();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 4);
				{
				setState(46); checkCondition();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 5);
				{
				setState(47); untilLoop();
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

	public static class AssignmentContext extends ParserRuleContext {
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ConditionalExpContext conditionalExp() {
			return getRuleContext(ConditionalExpContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public ArithmeticExpContext arithmeticExp() {
			return getRuleContext(ArithmeticExpContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RochGrammarListener ) ((RochGrammarListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RochGrammarListener ) ((RochGrammarListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); identifier();
			setState(51); match(T__13);
			setState(55);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(52); identifier();
				}
				break;
			case 2:
				{
				setState(53); arithmeticExp(0);
				}
				break;
			case 3:
				{
				setState(54); conditionalExp(0);
				}
				break;
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

	public static class ArithmeticExpContext extends ParserRuleContext {
		public TerminalNode Integer() { return getToken(RochGrammarParser.Integer, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ArithmeticExpContext> arithmeticExp() {
			return getRuleContexts(ArithmeticExpContext.class);
		}
		public ArithmeticExpContext arithmeticExp(int i) {
			return getRuleContext(ArithmeticExpContext.class,i);
		}
		public ArithmeticExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RochGrammarListener ) ((RochGrammarListener)listener).enterArithmeticExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RochGrammarListener ) ((RochGrammarListener)listener).exitArithmeticExp(this);
		}
	}

	public final ArithmeticExpContext arithmeticExp() throws RecognitionException {
		return arithmeticExp(0);
	}

	private ArithmeticExpContext arithmeticExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithmeticExpContext _localctx = new ArithmeticExpContext(_ctx, _parentState);
		ArithmeticExpContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_arithmeticExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			switch (_input.LA(1)) {
			case Character:
				{
				setState(58); identifier();
				}
				break;
			case Integer:
				{
				setState(59); match(Integer);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(76);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(74);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExp);
						setState(62);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(63); match(T__2);
						setState(64); arithmeticExp(7);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExp);
						setState(65);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(66); match(T__19);
						setState(67); arithmeticExp(6);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExp);
						setState(68);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(69); match(T__1);
						setState(70); arithmeticExp(5);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExp);
						setState(71);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(72); match(T__0);
						setState(73); arithmeticExp(4);
						}
						break;
					}
					} 
				}
				setState(78);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionalExpContext extends ParserRuleContext {
		public List<ConditionalExpContext> conditionalExp() {
			return getRuleContexts(ConditionalExpContext.class);
		}
		public TerminalNode Bool() { return getToken(RochGrammarParser.Bool, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConditionalExpContext conditionalExp(int i) {
			return getRuleContext(ConditionalExpContext.class,i);
		}
		public ConditionalExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RochGrammarListener ) ((RochGrammarListener)listener).enterConditionalExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RochGrammarListener ) ((RochGrammarListener)listener).exitConditionalExp(this);
		}
	}

	public final ConditionalExpContext conditionalExp() throws RecognitionException {
		return conditionalExp(0);
	}

	private ConditionalExpContext conditionalExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionalExpContext _localctx = new ConditionalExpContext(_ctx, _parentState);
		ConditionalExpContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_conditionalExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			switch (_input.LA(1)) {
			case Character:
				{
				setState(80); identifier();
				}
				break;
			case Bool:
				{
				setState(81); match(Bool);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(98);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(96);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionalExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conditionalExp);
						setState(84);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(85); match(T__17);
						setState(86); conditionalExp(7);
						}
						break;
					case 2:
						{
						_localctx = new ConditionalExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conditionalExp);
						setState(87);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(88); match(T__8);
						setState(89); conditionalExp(6);
						}
						break;
					case 3:
						{
						_localctx = new ConditionalExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conditionalExp);
						setState(90);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(91); match(T__11);
						setState(92); conditionalExp(5);
						}
						break;
					case 4:
						{
						_localctx = new ConditionalExpContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_conditionalExp);
						setState(93);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(94); match(T__15);
						setState(95); conditionalExp(4);
						}
						break;
					}
					} 
				}
				setState(100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RochGrammarListener ) ((RochGrammarListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RochGrammarListener ) ((RochGrammarListener)listener).exitDataType(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_la = _input.LA(1);
			if ( !(_la==T__14 || _la==T__12) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class CheckConditionContext extends ParserRuleContext {
		public OtherwiseContext otherwise() {
			return getRuleContext(OtherwiseContext.class,0);
		}
		public CheckContext check() {
			return getRuleContext(CheckContext.class,0);
		}
		public CheckEndContext checkEnd() {
			return getRuleContext(CheckEndContext.class,0);
		}
		public CheckConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RochGrammarListener ) ((RochGrammarListener)listener).enterCheckCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RochGrammarListener ) ((RochGrammarListener)listener).exitCheckCondition(this);
		}
	}

	public final CheckConditionContext checkCondition() throws RecognitionException {
		CheckConditionContext _localctx = new CheckConditionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_checkCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103); check();
			setState(105);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(104); otherwise();
				}
			}

			setState(107); checkEnd();
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

	public static class CheckContext extends ParserRuleContext {
		public ConditionalExpContext conditionalExp() {
			return getRuleContext(ConditionalExpContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CheckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_check; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RochGrammarListener ) ((RochGrammarListener)listener).enterCheck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RochGrammarListener ) ((RochGrammarListener)listener).exitCheck(this);
		}
	}

	public final CheckContext check() throws RecognitionException {
		CheckContext _localctx = new CheckContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_check);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109); match(T__9);
			setState(110); conditionalExp(0);
			setState(111); block();
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

	public static class OtherwiseContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public OtherwiseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherwise; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RochGrammarListener ) ((RochGrammarListener)listener).enterOtherwise(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RochGrammarListener ) ((RochGrammarListener)listener).exitOtherwise(this);
		}
	}

	public final OtherwiseContext otherwise() throws RecognitionException {
		OtherwiseContext _localctx = new OtherwiseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_otherwise);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); match(T__16);
			setState(114); block();
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

	public static class CheckEndContext extends ParserRuleContext {
		public CheckEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RochGrammarListener ) ((RochGrammarListener)listener).enterCheckEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RochGrammarListener ) ((RochGrammarListener)listener).exitCheckEnd(this);
		}
	}

	public final CheckEndContext checkEnd() throws RecognitionException {
		CheckEndContext _localctx = new CheckEndContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_checkEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); match(T__4);
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

	public static class UntilLoopContext extends ParserRuleContext {
		public UntilEndContext untilEnd() {
			return getRuleContext(UntilEndContext.class,0);
		}
		public UntilContext until() {
			return getRuleContext(UntilContext.class,0);
		}
		public UntilLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_untilLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RochGrammarListener ) ((RochGrammarListener)listener).enterUntilLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RochGrammarListener ) ((RochGrammarListener)listener).exitUntilLoop(this);
		}
	}

	public final UntilLoopContext untilLoop() throws RecognitionException {
		UntilLoopContext _localctx = new UntilLoopContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_untilLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); until();
			setState(119); untilEnd();
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

	public static class UntilContext extends ParserRuleContext {
		public ConditionalExpContext conditionalExp() {
			return getRuleContext(ConditionalExpContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public UntilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_until; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RochGrammarListener ) ((RochGrammarListener)listener).enterUntil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RochGrammarListener ) ((RochGrammarListener)listener).exitUntil(this);
		}
	}

	public final UntilContext until() throws RecognitionException {
		UntilContext _localctx = new UntilContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_until);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121); match(T__10);
			setState(122); conditionalExp(0);
			setState(123); block();
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

	public static class UntilEndContext extends ParserRuleContext {
		public UntilEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_untilEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RochGrammarListener ) ((RochGrammarListener)listener).enterUntilEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RochGrammarListener ) ((RochGrammarListener)listener).exitUntilEnd(this);
		}
	}

	public final UntilEndContext untilEnd() throws RecognitionException {
		UntilEndContext _localctx = new UntilEndContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_untilEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125); match(T__6);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RochGrammarListener ) ((RochGrammarListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RochGrammarListener ) ((RochGrammarListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127); dataType();
			setState(128); identifier();
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Character(int i) {
			return getToken(RochGrammarParser.Character, i);
		}
		public TerminalNode Integer(int i) {
			return getToken(RochGrammarParser.Integer, i);
		}
		public List<TerminalNode> Character() { return getTokens(RochGrammarParser.Character); }
		public List<TerminalNode> Integer() { return getTokens(RochGrammarParser.Integer); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RochGrammarListener ) ((RochGrammarListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RochGrammarListener ) ((RochGrammarListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_identifier);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(130); match(Character);
			setState(134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(131);
					_la = _input.LA(1);
					if ( !(_la==Character || _la==Integer) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class DisplayContext extends ParserRuleContext {
		public ConditionalExpContext conditionalExp() {
			return getRuleContext(ConditionalExpContext.class,0);
		}
		public ArithmeticExpContext arithmeticExp() {
			return getRuleContext(ArithmeticExpContext.class,0);
		}
		public DisplayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_display; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RochGrammarListener ) ((RochGrammarListener)listener).enterDisplay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RochGrammarListener ) ((RochGrammarListener)listener).exitDisplay(this);
		}
	}

	public final DisplayContext display() throws RecognitionException {
		DisplayContext _localctx = new DisplayContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_display);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137); match(T__5);
			setState(140);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(138); arithmeticExp(0);
				}
				break;
			case 2:
				{
				setState(139); conditionalExp(0);
				}
				break;
			}
			setState(142); match(T__3);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4: return arithmeticExp_sempred((ArithmeticExpContext)_localctx, predIndex);
		case 5: return conditionalExp_sempred((ConditionalExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithmeticExp_sempred(ArithmeticExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 6);
		case 1: return precpred(_ctx, 5);
		case 2: return precpred(_ctx, 4);
		case 3: return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean conditionalExp_sempred(ConditionalExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return precpred(_ctx, 6);
		case 5: return precpred(_ctx, 5);
		case 6: return precpred(_ctx, 4);
		case 7: return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\34\u0093\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\3\6\3*\n\3\r\3\16\3+\3\4\3\4\3\4\3\4\3\4\5\4\63\n\4"+
		"\3\5\3\5\3\5\3\5\3\5\5\5:\n\5\3\6\3\6\3\6\5\6?\n\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6M\n\6\f\6\16\6P\13\6\3\7\3\7\3\7\5\7U"+
		"\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7c\n\7\f\7\16\7"+
		"f\13\7\3\b\3\b\3\t\3\t\5\tl\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21"+
		"\3\21\7\21\u0087\n\21\f\21\16\21\u008a\13\21\3\22\3\22\3\22\5\22\u008f"+
		"\n\22\3\22\3\22\3\22\2\4\n\f\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"\2\4\4\2\b\b\n\n\3\2\27\30\u0095\2$\3\2\2\2\4)\3\2\2\2\6\62\3\2\2\2"+
		"\b\64\3\2\2\2\n>\3\2\2\2\fT\3\2\2\2\16g\3\2\2\2\20i\3\2\2\2\22o\3\2\2"+
		"\2\24s\3\2\2\2\26v\3\2\2\2\30x\3\2\2\2\32{\3\2\2\2\34\177\3\2\2\2\36\u0081"+
		"\3\2\2\2 \u0084\3\2\2\2\"\u008b\3\2\2\2$%\7\17\2\2%&\5\4\3\2&\'\7\4\2"+
		"\2\'\3\3\2\2\2(*\5\6\4\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\5\3"+
		"\2\2\2-\63\5\36\20\2.\63\5\b\5\2/\63\5\"\22\2\60\63\5\20\t\2\61\63\5\30"+
		"\r\2\62-\3\2\2\2\62.\3\2\2\2\62/\3\2\2\2\62\60\3\2\2\2\62\61\3\2\2\2\63"+
		"\7\3\2\2\2\64\65\5 \21\2\659\7\t\2\2\66:\5 \21\2\67:\5\n\6\28:\5\f\7\2"+
		"9\66\3\2\2\29\67\3\2\2\298\3\2\2\2:\t\3\2\2\2;<\b\6\1\2<?\5 \21\2=?\7"+
		"\30\2\2>;\3\2\2\2>=\3\2\2\2?N\3\2\2\2@A\f\b\2\2AB\7\24\2\2BM\5\n\6\tC"+
		"D\f\7\2\2DE\7\3\2\2EM\5\n\6\bFG\f\6\2\2GH\7\25\2\2HM\5\n\6\7IJ\f\5\2\2"+
		"JK\7\26\2\2KM\5\n\6\6L@\3\2\2\2LC\3\2\2\2LF\3\2\2\2LI\3\2\2\2MP\3\2\2"+
		"\2NL\3\2\2\2NO\3\2\2\2O\13\3\2\2\2PN\3\2\2\2QR\b\7\1\2RU\5 \21\2SU\7\32"+
		"\2\2TQ\3\2\2\2TS\3\2\2\2Ud\3\2\2\2VW\f\b\2\2WX\7\5\2\2Xc\5\f\7\tYZ\f\7"+
		"\2\2Z[\7\16\2\2[c\5\f\7\b\\]\f\6\2\2]^\7\13\2\2^c\5\f\7\7_`\f\5\2\2`a"+
		"\7\7\2\2ac\5\f\7\6bV\3\2\2\2bY\3\2\2\2b\\\3\2\2\2b_\3\2\2\2cf\3\2\2\2"+
		"db\3\2\2\2de\3\2\2\2e\r\3\2\2\2fd\3\2\2\2gh\t\2\2\2h\17\3\2\2\2ik\5\22"+
		"\n\2jl\5\24\13\2kj\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\5\26\f\2n\21\3\2\2\2"+
		"op\7\r\2\2pq\5\f\7\2qr\5\4\3\2r\23\3\2\2\2st\7\6\2\2tu\5\4\3\2u\25\3\2"+
		"\2\2vw\7\22\2\2w\27\3\2\2\2xy\5\32\16\2yz\5\34\17\2z\31\3\2\2\2{|\7\f"+
		"\2\2|}\5\f\7\2}~\5\4\3\2~\33\3\2\2\2\177\u0080\7\20\2\2\u0080\35\3\2\2"+
		"\2\u0081\u0082\5\16\b\2\u0082\u0083\5 \21\2\u0083\37\3\2\2\2\u0084\u0088"+
		"\7\27\2\2\u0085\u0087\t\3\2\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2"+
		"\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089!\3\2\2\2\u008a\u0088\3"+
		"\2\2\2\u008b\u008e\7\21\2\2\u008c\u008f\5\n\6\2\u008d\u008f\5\f\7\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\7\23"+
		"\2\2\u0091#\3\2\2\2\16+\629>LNTbdk\u0088\u008e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}