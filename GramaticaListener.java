// Generated from Gramatica.g4 by ANTLR 4.7.2

	import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaParser}.
 */
public interface GramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(GramaticaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(GramaticaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#listaDeclaracoes}.
	 * @param ctx the parse tree
	 */
	void enterListaDeclaracoes(GramaticaParser.ListaDeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#listaDeclaracoes}.
	 * @param ctx the parse tree
	 */
	void exitListaDeclaracoes(GramaticaParser.ListaDeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(GramaticaParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(GramaticaParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#listaComandos}.
	 * @param ctx the parse tree
	 */
	void enterListaComandos(GramaticaParser.ListaComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#listaComandos}.
	 * @param ctx the parse tree
	 */
	void exitListaComandos(GramaticaParser.ListaComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoAritmetica(GramaticaParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoAritmetica(GramaticaParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expressaoAritmetica2}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoAritmetica2(GramaticaParser.ExpressaoAritmetica2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expressaoAritmetica2}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoAritmetica2(GramaticaParser.ExpressaoAritmetica2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#termoAritmetico}.
	 * @param ctx the parse tree
	 */
	void enterTermoAritmetico(GramaticaParser.TermoAritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#termoAritmetico}.
	 * @param ctx the parse tree
	 */
	void exitTermoAritmetico(GramaticaParser.TermoAritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#termoAritmetico2}.
	 * @param ctx the parse tree
	 */
	void enterTermoAritmetico2(GramaticaParser.TermoAritmetico2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#termoAritmetico2}.
	 * @param ctx the parse tree
	 */
	void exitTermoAritmetico2(GramaticaParser.TermoAritmetico2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#fatorAritmetico}.
	 * @param ctx the parse tree
	 */
	void enterFatorAritmetico(GramaticaParser.FatorAritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#fatorAritmetico}.
	 * @param ctx the parse tree
	 */
	void exitFatorAritmetico(GramaticaParser.FatorAritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(GramaticaParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(GramaticaParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#comandoAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterComandoAtribuicao(GramaticaParser.ComandoAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#comandoAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitComandoAtribuicao(GramaticaParser.ComandoAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#comandoEntrada}.
	 * @param ctx the parse tree
	 */
	void enterComandoEntrada(GramaticaParser.ComandoEntradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#comandoEntrada}.
	 * @param ctx the parse tree
	 */
	void exitComandoEntrada(GramaticaParser.ComandoEntradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#comandoSaida}.
	 * @param ctx the parse tree
	 */
	void enterComandoSaida(GramaticaParser.ComandoSaidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#comandoSaida}.
	 * @param ctx the parse tree
	 */
	void exitComandoSaida(GramaticaParser.ComandoSaidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#comandoCondicao}.
	 * @param ctx the parse tree
	 */
	void enterComandoCondicao(GramaticaParser.ComandoCondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#comandoCondicao}.
	 * @param ctx the parse tree
	 */
	void exitComandoCondicao(GramaticaParser.ComandoCondicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#comandoCondicao2}.
	 * @param ctx the parse tree
	 */
	void enterComandoCondicao2(GramaticaParser.ComandoCondicao2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#comandoCondicao2}.
	 * @param ctx the parse tree
	 */
	void exitComandoCondicao2(GramaticaParser.ComandoCondicao2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#comandoRepeticao}.
	 * @param ctx the parse tree
	 */
	void enterComandoRepeticao(GramaticaParser.ComandoRepeticaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#comandoRepeticao}.
	 * @param ctx the parse tree
	 */
	void exitComandoRepeticao(GramaticaParser.ComandoRepeticaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#subAlgoritmo}.
	 * @param ctx the parse tree
	 */
	void enterSubAlgoritmo(GramaticaParser.SubAlgoritmoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#subAlgoritmo}.
	 * @param ctx the parse tree
	 */
	void exitSubAlgoritmo(GramaticaParser.SubAlgoritmoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expressaoRel}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoRel(GramaticaParser.ExpressaoRelContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expressaoRel}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoRel(GramaticaParser.ExpressaoRelContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expressaoRel2}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoRel2(GramaticaParser.ExpressaoRel2Context ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expressaoRel2}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoRel2(GramaticaParser.ExpressaoRel2Context ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#termoRelacional}.
	 * @param ctx the parse tree
	 */
	void enterTermoRelacional(GramaticaParser.TermoRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#termoRelacional}.
	 * @param ctx the parse tree
	 */
	void exitTermoRelacional(GramaticaParser.TermoRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#opRel}.
	 * @param ctx the parse tree
	 */
	void enterOpRel(GramaticaParser.OpRelContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#opRel}.
	 * @param ctx the parse tree
	 */
	void exitOpRel(GramaticaParser.OpRelContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#operadorBooleano}.
	 * @param ctx the parse tree
	 */
	void enterOperadorBooleano(GramaticaParser.OperadorBooleanoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#operadorBooleano}.
	 * @param ctx the parse tree
	 */
	void exitOperadorBooleano(GramaticaParser.OperadorBooleanoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#tipoVar}.
	 * @param ctx the parse tree
	 */
	void enterTipoVar(GramaticaParser.TipoVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#tipoVar}.
	 * @param ctx the parse tree
	 */
	void exitTipoVar(GramaticaParser.TipoVarContext ctx);
}