/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladorLFT.analysis;

import java.util.*;
import compiladorLFT.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAProgramas(AProgramas node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATipoDeclaracao(ATipoDeclaracao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAConstDeclaracao(AConstDeclaracao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVarRepeat(AVarRepeat node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATesteComando(ATesteComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseALeiaComando(ALeiaComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEscrevaComando(AEscrevaComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASeComando(ASeComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAvalieComando(AAvalieComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEnquantoComando(AEnquantoComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARepitaComando(ARepitaComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParaComando(AParaComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAParaPassoComando(AParaPassoComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASenaoComando(ASenaoComando node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComandoRepeat(AComandoRepeat node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAValors(AValors node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExps(AExps node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAComandos(AComandos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAInteiroTipo(AInteiroTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseARealTipo(ARealTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACaracterTipo(ACaracterTipo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdentificadorVar(AIdentificadorVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStringVar(AStringVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIdentificadors(AIdentificadors node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAStringValor(AStringValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANumeroIntValor(ANumeroIntValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseANumeroRealValor(ANumeroRealValor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExp(AExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAExpLogica(AExpLogica node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDoisPontosFinais(TDoisPontosFinais node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimAlgoritmo(TFimAlgoritmo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimPara(TFimPara node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFaca(TFaca node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPara(TPara node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInicio(TInicio node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLeia(TLeia node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLogico(TLogico node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNao(TNao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOu(TOu node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInteiro(TInteiro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTProcedimento(TProcedimento node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPrograma(TPrograma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTReal(TReal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRepita(TRepita node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRetorne(TRetorne node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSe(TSe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSenao(TSenao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVariaveis(TVariaveis node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVerdadeiro(TVerdadeiro node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVetor(TVetor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTXou(TXou node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAleatorio(TAleatorio node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAlgoritmo(TAlgoritmo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTArquivo(TArquivo node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAspasDuplas(TAspasDuplas node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAspasSimples(TAspasSimples node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAte(TAte node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAvalie(TAvalie node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCaracter(TCaracter node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCaso(TCaso node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTColcheteD(TColcheteD node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTColcheteE(TColcheteE node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTConst(TConst node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDe(TDe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDiferente(TDiferente node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDividido(TDividido node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDoisPontos(TDoisPontos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTE(TE node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEnquanto(TEnquanto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEntao(TEntao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEscolha(TEscolha node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEscreva(TEscreva node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEscreval(TEscreval node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFalso(TFalso node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFim(TFim node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimEnquanto(TFimEnquanto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimFuncao(TFimFuncao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimProcedimento(TFimProcedimento node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimRepita(TFimRepita node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimSe(TFimSe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimVar(TFimVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFuncao(TFuncao node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIdentificador(TIdentificador node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIgual(TIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNumero(TNumero node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMaior(TMaior node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMaiorIgual(TMaiorIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMais(TMais node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenor(TMenor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenorIgual(TMenorIgual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMenos(TMenos node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTParenteseD(TParenteseD node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTParenteseE(TParenteseE node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPasso(TPasso node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPausa(TPausa node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPontoVirgula(TPontoVirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRecebe(TRecebe node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTResto(TResto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVazio(TVazio node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVezes(TVezes node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNumeroInt(TNumeroInt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNumeroReal(TNumeroReal node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVirgula(TVirgula node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComentarioSimples(TComentarioSimples node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTString(TString node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComment(TComment node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCommentEnd(TCommentEnd node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCommentBody(TCommentBody node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTStar(TStar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSlash(TSlash node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFimTexto(TFimTexto node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseInvalidToken(InvalidToken node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
