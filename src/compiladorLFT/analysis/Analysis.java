/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladorLFT.analysis;

import compiladorLFT.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAProgramas(AProgramas node);
    void caseAVariaveisDeclaracao(AVariaveisDeclaracao node);
    void caseAConstantesDeclaracao(AConstantesDeclaracao node);
    void caseAIdentificadorVar(AIdentificadorVar node);
    void caseAVetorVar(AVetorVar node);
    void caseAStringValor(AStringValor node);
    void caseAInteiroValor(AInteiroValor node);
    void caseARealValor(ARealValor node);
    void caseASsimplesString(ASsimplesString node);
    void caseAScharString(AScharString node);
    void caseAInteiroTipo(AInteiroTipo node);
    void caseAStringTipo(AStringTipo node);
    void caseARealTipo(ARealTipo node);
    void caseAExpExpAux(AExpExpAux node);
    void caseAExpLogica1ExpAux(AExpLogica1ExpAux node);
    void caseAReceberExpComando(AReceberExpComando node);
    void caseAReceberExplogComando(AReceberExplogComando node);
    void caseAEscrevaExpComando(AEscrevaExpComando node);
    void caseAEscrevaExplogComando(AEscrevaExplogComando node);
    void caseALeiaComando(ALeiaComando node);
    void caseASeExplogComando(ASeExplogComando node);
    void caseASeExplogSenaoComando(ASeExplogSenaoComando node);
    void caseAParaComando(AParaComando node);
    void caseAParaPassoComando(AParaPassoComando node);
    void caseAEnquantoComando(AEnquantoComando node);
    void caseARepitaExplogComando(ARepitaExplogComando node);
    void caseAAvalieExpComando(AAvalieExpComando node);
    void caseAAvalieExplogComando(AAvalieExplogComando node);
    void caseAAvalieExpSenaoComando(AAvalieExpSenaoComando node);
    void caseAAvalieExplogSenaoComando(AAvalieExplogSenaoComando node);
    void caseAEstrCaso(AEstrCaso node);
    void caseAMaisExp(AMaisExp node);
    void caseAMenosExp(AMenosExp node);
    void caseAMultExp(AMultExp node);
    void caseADivExp(ADivExp node);
    void caseAVariavelExp(AVariavelExp node);
    void caseAValorExp(AValorExp node);
    void caseAMenosExpExp(AMenosExpExp node);
    void caseAExpNaoOuExpLogica(AExpNaoOuExpLogica node);
    void caseAXorExpLogica(AXorExpLogica node);
    void caseAOuExpLogica(AOuExpLogica node);
    void caseAEExpLogica(AEExpLogica node);
    void caseAExpIgualExpLogica(AExpIgualExpLogica node);
    void caseAExpDiferenteExpLogica(AExpDiferenteExpLogica node);
    void caseAExpMenorExpLogica(AExpMenorExpLogica node);
    void caseAExpMenorIgualExpLogica(AExpMenorIgualExpLogica node);
    void caseAExpMaiorExpLogica(AExpMaiorExpLogica node);
    void caseAExpMaiorIgualExpLogica(AExpMaiorIgualExpLogica node);

    void caseTDoisPontosFinais(TDoisPontosFinais node);
    void caseTFimAlgoritmo(TFimAlgoritmo node);
    void caseTFimPara(TFimPara node);
    void caseTFaca(TFaca node);
    void caseTPara(TPara node);
    void caseTInicio(TInicio node);
    void caseTLeia(TLeia node);
    void caseTLogico(TLogico node);
    void caseTNao(TNao node);
    void caseTOu(TOu node);
    void caseTInteiro(TInteiro node);
    void caseTProcedimento(TProcedimento node);
    void caseTPrograma(TPrograma node);
    void caseTReal(TReal node);
    void caseTRepita(TRepita node);
    void caseTRetorne(TRetorne node);
    void caseTSe(TSe node);
    void caseTSenao(TSenao node);
    void caseTVariavel(TVariavel node);
    void caseTVerdadeiro(TVerdadeiro node);
    void caseTXou(TXou node);
    void caseTAleatorio(TAleatorio node);
    void caseTAlgoritmo(TAlgoritmo node);
    void caseTArquivo(TArquivo node);
    void caseTAspasDuplas(TAspasDuplas node);
    void caseTAspasSimples(TAspasSimples node);
    void caseTAte(TAte node);
    void caseTAvalie(TAvalie node);
    void caseTCaracter(TCaracter node);
    void caseTCaso(TCaso node);
    void caseTChar(TChar node);
    void caseTColcheteD(TColcheteD node);
    void caseTColcheteE(TColcheteE node);
    void caseTConst(TConst node);
    void caseTDe(TDe node);
    void caseTDiferente(TDiferente node);
    void caseTDividido(TDividido node);
    void caseTDoisPontos(TDoisPontos node);
    void caseTE(TE node);
    void caseTEnquanto(TEnquanto node);
    void caseTEntao(TEntao node);
    void caseTEscolha(TEscolha node);
    void caseTEscreva(TEscreva node);
    void caseTEscreval(TEscreval node);
    void caseTFalso(TFalso node);
    void caseTFim(TFim node);
    void caseTFimEnquanto(TFimEnquanto node);
    void caseTFimFuncao(TFimFuncao node);
    void caseTFimProcedimento(TFimProcedimento node);
    void caseTFimRepita(TFimRepita node);
    void caseTFimSe(TFimSe node);
    void caseTFimVar(TFimVar node);
    void caseTFimAvalie(TFimAvalie node);
    void caseTFuncao(TFuncao node);
    void caseTIdentificador(TIdentificador node);
    void caseTIgual(TIgual node);
    void caseTNumero(TNumero node);
    void caseTMaior(TMaior node);
    void caseTMaiorIgual(TMaiorIgual node);
    void caseTMais(TMais node);
    void caseTMenor(TMenor node);
    void caseTMenorIgual(TMenorIgual node);
    void caseTMenos(TMenos node);
    void caseTParenteseD(TParenteseD node);
    void caseTParenteseE(TParenteseE node);
    void caseTPasso(TPasso node);
    void caseTPausa(TPausa node);
    void caseTPontoVirgula(TPontoVirgula node);
    void caseTRecebe(TRecebe node);
    void caseTResto(TResto node);
    void caseTVazio(TVazio node);
    void caseTVezes(TVezes node);
    void caseTNumeroInt(TNumeroInt node);
    void caseTNumeroReal(TNumeroReal node);
    void caseTVarStr(TVarStr node);
    void caseTVirgula(TVirgula node);
    void caseTXor(TXor node);
    void caseTComentarioSimples(TComentarioSimples node);
    void caseTComment(TComment node);
    void caseTCommentEnd(TCommentEnd node);
    void caseTCommentBody(TCommentBody node);
    void caseTStar(TStar node);
    void caseTSlash(TSlash node);
    void caseTFimTexto(TFimTexto node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}
