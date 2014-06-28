/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladorLFT.analysis;

import java.util.*;
import compiladorLFT.node.*;

public class ReversedDepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getEOF().apply(this);
        node.getPProgramas().apply(this);
        outStart(node);
    }

    public void inAProgramas(AProgramas node)
    {
        defaultIn(node);
    }

    public void outAProgramas(AProgramas node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAProgramas(AProgramas node)
    {
        inAProgramas(node);
        if(node.getFim() != null)
        {
            node.getFim().apply(this);
        }
        if(node.getComando() != null)
        {
            node.getComando().apply(this);
        }
        if(node.getDeclaracao() != null)
        {
            node.getDeclaracao().apply(this);
        }
        if(node.getInicio() != null)
        {
            node.getInicio().apply(this);
        }
        if(node.getIdentificador() != null)
        {
            node.getIdentificador().apply(this);
        }
        if(node.getPrograma() != null)
        {
            node.getPrograma().apply(this);
        }
        outAProgramas(node);
    }

    public void inATipoDeclaracao(ATipoDeclaracao node)
    {
        defaultIn(node);
    }

    public void outATipoDeclaracao(ATipoDeclaracao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATipoDeclaracao(ATipoDeclaracao node)
    {
        inATipoDeclaracao(node);
        {
            List<PVarRepeat> copy = new ArrayList<PVarRepeat>(node.getVarRepeat());
            Collections.reverse(copy);
            for(PVarRepeat e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getDoisPontos() != null)
        {
            node.getDoisPontos().apply(this);
        }
        if(node.getTipo() != null)
        {
            node.getTipo().apply(this);
        }
        outATipoDeclaracao(node);
    }

    public void inAConstDeclaracao(AConstDeclaracao node)
    {
        defaultIn(node);
    }

    public void outAConstDeclaracao(AConstDeclaracao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAConstDeclaracao(AConstDeclaracao node)
    {
        inAConstDeclaracao(node);
        if(node.getPontoVirgula() != null)
        {
            node.getPontoVirgula().apply(this);
        }
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        if(node.getIdentificador() != null)
        {
            node.getIdentificador().apply(this);
        }
        if(node.getConst() != null)
        {
            node.getConst().apply(this);
        }
        outAConstDeclaracao(node);
    }

    public void inAVarRepeat(AVarRepeat node)
    {
        defaultIn(node);
    }

    public void outAVarRepeat(AVarRepeat node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVarRepeat(AVarRepeat node)
    {
        inAVarRepeat(node);
        if(node.getPontoVirgula() != null)
        {
            node.getPontoVirgula().apply(this);
        }
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outAVarRepeat(node);
    }

    public void inATesteComando(ATesteComando node)
    {
        defaultIn(node);
    }

    public void outATesteComando(ATesteComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATesteComando(ATesteComando node)
    {
        inATesteComando(node);
        if(node.getPontoVirgula() != null)
        {
            node.getPontoVirgula().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getRecebe() != null)
        {
            node.getRecebe().apply(this);
        }
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outATesteComando(node);
    }

    public void inALeiaComando(ALeiaComando node)
    {
        defaultIn(node);
    }

    public void outALeiaComando(ALeiaComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALeiaComando(ALeiaComando node)
    {
        inALeiaComando(node);
        if(node.getPontoVirgula() != null)
        {
            node.getPontoVirgula().apply(this);
        }
        if(node.getParenteseD() != null)
        {
            node.getParenteseD().apply(this);
        }
        if(node.getValors() != null)
        {
            node.getValors().apply(this);
        }
        if(node.getVirgula() != null)
        {
            node.getVirgula().apply(this);
        }
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        if(node.getParenteseE() != null)
        {
            node.getParenteseE().apply(this);
        }
        if(node.getLeia() != null)
        {
            node.getLeia().apply(this);
        }
        outALeiaComando(node);
    }

    public void inAEscrevaComando(AEscrevaComando node)
    {
        defaultIn(node);
    }

    public void outAEscrevaComando(AEscrevaComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEscrevaComando(AEscrevaComando node)
    {
        inAEscrevaComando(node);
        if(node.getPontoVirgula() != null)
        {
            node.getPontoVirgula().apply(this);
        }
        if(node.getParenteseD() != null)
        {
            node.getParenteseD().apply(this);
        }
        if(node.getExps() != null)
        {
            node.getExps().apply(this);
        }
        if(node.getVirgula() != null)
        {
            node.getVirgula().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getParenteseE() != null)
        {
            node.getParenteseE().apply(this);
        }
        if(node.getEscreva() != null)
        {
            node.getEscreva().apply(this);
        }
        outAEscrevaComando(node);
    }

    public void inASeComando(ASeComando node)
    {
        defaultIn(node);
    }

    public void outASeComando(ASeComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASeComando(ASeComando node)
    {
        inASeComando(node);
        if(node.getPontoVirgula() != null)
        {
            node.getPontoVirgula().apply(this);
        }
        if(node.getFimSe() != null)
        {
            node.getFimSe().apply(this);
        }
        {
            List<PSenaoComando> copy = new ArrayList<PSenaoComando>(node.getSenaoComando());
            Collections.reverse(copy);
            for(PSenaoComando e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PComandoRepeat> copy = new ArrayList<PComandoRepeat>(node.getComandoRepeat());
            Collections.reverse(copy);
            for(PComandoRepeat e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getEntao() != null)
        {
            node.getEntao().apply(this);
        }
        if(node.getE() != null)
        {
            node.getE().apply(this);
        }
        if(node.getParenteseD() != null)
        {
            node.getParenteseD().apply(this);
        }
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        if(node.getParenteseE() != null)
        {
            node.getParenteseE().apply(this);
        }
        if(node.getSe() != null)
        {
            node.getSe().apply(this);
        }
        outASeComando(node);
    }

    public void inAAvalieComando(AAvalieComando node)
    {
        defaultIn(node);
    }

    public void outAAvalieComando(AAvalieComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAvalieComando(AAvalieComando node)
    {
        inAAvalieComando(node);
        if(node.getParenteseD() != null)
        {
            node.getParenteseD().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        if(node.getParenteseE() != null)
        {
            node.getParenteseE().apply(this);
        }
        if(node.getAvalie() != null)
        {
            node.getAvalie().apply(this);
        }
        outAAvalieComando(node);
    }

    public void inAEnquantoComando(AEnquantoComando node)
    {
        defaultIn(node);
    }

    public void outAEnquantoComando(AEnquantoComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEnquantoComando(AEnquantoComando node)
    {
        inAEnquantoComando(node);
        if(node.getFimEnquanto() != null)
        {
            node.getFimEnquanto().apply(this);
        }
        {
            List<PComandoRepeat> copy = new ArrayList<PComandoRepeat>(node.getComandoRepeat());
            Collections.reverse(copy);
            for(PComandoRepeat e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getFaca() != null)
        {
            node.getFaca().apply(this);
        }
        if(node.getParenteseD() != null)
        {
            node.getParenteseD().apply(this);
        }
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        if(node.getParenteseE() != null)
        {
            node.getParenteseE().apply(this);
        }
        if(node.getEnquanto() != null)
        {
            node.getEnquanto().apply(this);
        }
        outAEnquantoComando(node);
    }

    public void inARepitaComando(ARepitaComando node)
    {
        defaultIn(node);
    }

    public void outARepitaComando(ARepitaComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARepitaComando(ARepitaComando node)
    {
        inARepitaComando(node);
        if(node.getPontoVirgula() != null)
        {
            node.getPontoVirgula().apply(this);
        }
        if(node.getParenteseD() != null)
        {
            node.getParenteseD().apply(this);
        }
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        if(node.getParenteseE() != null)
        {
            node.getParenteseE().apply(this);
        }
        if(node.getAte() != null)
        {
            node.getAte().apply(this);
        }
        {
            List<PComandoRepeat> copy = new ArrayList<PComandoRepeat>(node.getComandoRepeat());
            Collections.reverse(copy);
            for(PComandoRepeat e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getRepita() != null)
        {
            node.getRepita().apply(this);
        }
        outARepitaComando(node);
    }

    public void inAParaComando(AParaComando node)
    {
        defaultIn(node);
    }

    public void outAParaComando(AParaComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParaComando(AParaComando node)
    {
        inAParaComando(node);
        if(node.getPontoVirgula() != null)
        {
            node.getPontoVirgula().apply(this);
        }
        if(node.getFimPara() != null)
        {
            node.getFimPara().apply(this);
        }
        {
            List<PComandoRepeat> copy = new ArrayList<PComandoRepeat>(node.getComandoRepeat());
            Collections.reverse(copy);
            for(PComandoRepeat e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getFaca() != null)
        {
            node.getFaca().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        if(node.getAte() != null)
        {
            node.getAte().apply(this);
        }
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getDe() != null)
        {
            node.getDe().apply(this);
        }
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getPara() != null)
        {
            node.getPara().apply(this);
        }
        outAParaComando(node);
    }

    public void inAParaPassoComando(AParaPassoComando node)
    {
        defaultIn(node);
    }

    public void outAParaPassoComando(AParaPassoComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParaPassoComando(AParaPassoComando node)
    {
        inAParaPassoComando(node);
        if(node.getPontoVirgula() != null)
        {
            node.getPontoVirgula().apply(this);
        }
        {
            List<PComandoRepeat> copy = new ArrayList<PComandoRepeat>(node.getComandoRepeat());
            Collections.reverse(copy);
            for(PComandoRepeat e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getThird() != null)
        {
            node.getThird().apply(this);
        }
        if(node.getAte() != null)
        {
            node.getAte().apply(this);
        }
        if(node.getSecond() != null)
        {
            node.getSecond().apply(this);
        }
        if(node.getPasso() != null)
        {
            node.getPasso().apply(this);
        }
        if(node.getFirst() != null)
        {
            node.getFirst().apply(this);
        }
        if(node.getDe() != null)
        {
            node.getDe().apply(this);
        }
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getPara() != null)
        {
            node.getPara().apply(this);
        }
        outAParaPassoComando(node);
    }

    public void inASenaoComando(ASenaoComando node)
    {
        defaultIn(node);
    }

    public void outASenaoComando(ASenaoComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASenaoComando(ASenaoComando node)
    {
        inASenaoComando(node);
        {
            List<PComandoRepeat> copy = new ArrayList<PComandoRepeat>(node.getComandoRepeat());
            Collections.reverse(copy);
            for(PComandoRepeat e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getSenao() != null)
        {
            node.getSenao().apply(this);
        }
        outASenaoComando(node);
    }

    public void inAComandoRepeat(AComandoRepeat node)
    {
        defaultIn(node);
    }

    public void outAComandoRepeat(AComandoRepeat node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAComandoRepeat(AComandoRepeat node)
    {
        inAComandoRepeat(node);
        if(node.getPontoVirgula() != null)
        {
            node.getPontoVirgula().apply(this);
        }
        if(node.getComando() != null)
        {
            node.getComando().apply(this);
        }
        outAComandoRepeat(node);
    }

    public void inAValors(AValors node)
    {
        defaultIn(node);
    }

    public void outAValors(AValors node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAValors(AValors node)
    {
        inAValors(node);
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        outAValors(node);
    }

    public void inAExps(AExps node)
    {
        defaultIn(node);
    }

    public void outAExps(AExps node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExps(AExps node)
    {
        inAExps(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outAExps(node);
    }

    public void inAComandos(AComandos node)
    {
        defaultIn(node);
    }

    public void outAComandos(AComandos node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAComandos(AComandos node)
    {
        inAComandos(node);
        if(node.getComando() != null)
        {
            node.getComando().apply(this);
        }
        outAComandos(node);
    }

    public void inAInteiroTipo(AInteiroTipo node)
    {
        defaultIn(node);
    }

    public void outAInteiroTipo(AInteiroTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAInteiroTipo(AInteiroTipo node)
    {
        inAInteiroTipo(node);
        if(node.getInteiro() != null)
        {
            node.getInteiro().apply(this);
        }
        outAInteiroTipo(node);
    }

    public void inARealTipo(ARealTipo node)
    {
        defaultIn(node);
    }

    public void outARealTipo(ARealTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARealTipo(ARealTipo node)
    {
        inARealTipo(node);
        if(node.getReal() != null)
        {
            node.getReal().apply(this);
        }
        outARealTipo(node);
    }

    public void inACaracterTipo(ACaracterTipo node)
    {
        defaultIn(node);
    }

    public void outACaracterTipo(ACaracterTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACaracterTipo(ACaracterTipo node)
    {
        inACaracterTipo(node);
        if(node.getCaracter() != null)
        {
            node.getCaracter().apply(this);
        }
        outACaracterTipo(node);
    }

    public void inAIdentificadorVar(AIdentificadorVar node)
    {
        defaultIn(node);
    }

    public void outAIdentificadorVar(AIdentificadorVar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdentificadorVar(AIdentificadorVar node)
    {
        inAIdentificadorVar(node);
        if(node.getIdentificador() != null)
        {
            node.getIdentificador().apply(this);
        }
        outAIdentificadorVar(node);
    }

    public void inAStringVar(AStringVar node)
    {
        defaultIn(node);
    }

    public void outAStringVar(AStringVar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStringVar(AStringVar node)
    {
        inAStringVar(node);
        if(node.getColcheteD() != null)
        {
            node.getColcheteD().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        if(node.getColcheteE() != null)
        {
            node.getColcheteE().apply(this);
        }
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        outAStringVar(node);
    }

    public void inAIdentificadors(AIdentificadors node)
    {
        defaultIn(node);
    }

    public void outAIdentificadors(AIdentificadors node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdentificadors(AIdentificadors node)
    {
        inAIdentificadors(node);
        if(node.getIdentificador() != null)
        {
            node.getIdentificador().apply(this);
        }
        outAIdentificadors(node);
    }

    public void inAStringValor(AStringValor node)
    {
        defaultIn(node);
    }

    public void outAStringValor(AStringValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStringValor(AStringValor node)
    {
        inAStringValor(node);
        if(node.getString() != null)
        {
            node.getString().apply(this);
        }
        outAStringValor(node);
    }

    public void inANumeroIntValor(ANumeroIntValor node)
    {
        defaultIn(node);
    }

    public void outANumeroIntValor(ANumeroIntValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumeroIntValor(ANumeroIntValor node)
    {
        inANumeroIntValor(node);
        if(node.getNumeroInt() != null)
        {
            node.getNumeroInt().apply(this);
        }
        outANumeroIntValor(node);
    }

    public void inANumeroRealValor(ANumeroRealValor node)
    {
        defaultIn(node);
    }

    public void outANumeroRealValor(ANumeroRealValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumeroRealValor(ANumeroRealValor node)
    {
        inANumeroRealValor(node);
        if(node.getNumeroReal() != null)
        {
            node.getNumeroReal().apply(this);
        }
        outANumeroRealValor(node);
    }

    public void inAExp(AExp node)
    {
        defaultIn(node);
    }

    public void outAExp(AExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExp(AExp node)
    {
        inAExp(node);
        if(node.getNumero() != null)
        {
            node.getNumero().apply(this);
        }
        outAExp(node);
    }

    public void inAExpLogica(AExpLogica node)
    {
        defaultIn(node);
    }

    public void outAExpLogica(AExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpLogica(AExpLogica node)
    {
        inAExpLogica(node);
        if(node.getNumero() != null)
        {
            node.getNumero().apply(this);
        }
        outAExpLogica(node);
    }
}