/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladorLFT.analysis;

import java.util.*;
import compiladorLFT.node.*;

public class DepthFirstAdapter extends AnalysisAdapter
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
        node.getPProgramas().apply(this);
        node.getEOF().apply(this);
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
        if(node.getIdentificador() != null)
        {
            node.getIdentificador().apply(this);
        }
        {
            List<PDeclaracao> copy = new ArrayList<PDeclaracao>(node.getDeclaracao());
            for(PDeclaracao e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        outAProgramas(node);
    }

    public void inAVariaveisDeclaracao(AVariaveisDeclaracao node)
    {
        defaultIn(node);
    }

    public void outAVariaveisDeclaracao(AVariaveisDeclaracao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariaveisDeclaracao(AVariaveisDeclaracao node)
    {
        inAVariaveisDeclaracao(node);
        if(node.getTipo() != null)
        {
            node.getTipo().apply(this);
        }
        {
            List<PVar> copy = new ArrayList<PVar>(node.getVar());
            for(PVar e : copy)
            {
                e.apply(this);
            }
        }
        outAVariaveisDeclaracao(node);
    }

    public void inAConstantesDeclaracao(AConstantesDeclaracao node)
    {
        defaultIn(node);
    }

    public void outAConstantesDeclaracao(AConstantesDeclaracao node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAConstantesDeclaracao(AConstantesDeclaracao node)
    {
        inAConstantesDeclaracao(node);
        if(node.getConst() != null)
        {
            node.getConst().apply(this);
        }
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        outAConstantesDeclaracao(node);
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

    public void inAVetorVar(AVetorVar node)
    {
        defaultIn(node);
    }

    public void outAVetorVar(AVetorVar node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVetorVar(AVetorVar node)
    {
        inAVetorVar(node);
        if(node.getIdentificador() != null)
        {
            node.getIdentificador().apply(this);
        }
        if(node.getColcheteE() != null)
        {
            node.getColcheteE().apply(this);
        }
        if(node.getNumeroInt() != null)
        {
            node.getNumeroInt().apply(this);
        }
        if(node.getColcheteD() != null)
        {
            node.getColcheteD().apply(this);
        }
        outAVetorVar(node);
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

    public void inAInteiroValor(AInteiroValor node)
    {
        defaultIn(node);
    }

    public void outAInteiroValor(AInteiroValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAInteiroValor(AInteiroValor node)
    {
        inAInteiroValor(node);
        if(node.getNumeroInt() != null)
        {
            node.getNumeroInt().apply(this);
        }
        outAInteiroValor(node);
    }

    public void inARealValor(ARealValor node)
    {
        defaultIn(node);
    }

    public void outARealValor(ARealValor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARealValor(ARealValor node)
    {
        inARealValor(node);
        if(node.getNumeroReal() != null)
        {
            node.getNumeroReal().apply(this);
        }
        outARealValor(node);
    }

    public void inASsimplesString(ASsimplesString node)
    {
        defaultIn(node);
    }

    public void outASsimplesString(ASsimplesString node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASsimplesString(ASsimplesString node)
    {
        inASsimplesString(node);
        if(node.getChar() != null)
        {
            node.getChar().apply(this);
        }
        outASsimplesString(node);
    }

    public void inAScharString(AScharString node)
    {
        defaultIn(node);
    }

    public void outAScharString(AScharString node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAScharString(AScharString node)
    {
        inAScharString(node);
        if(node.getCaracter() != null)
        {
            node.getCaracter().apply(this);
        }
        outAScharString(node);
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

    public void inAStringTipo(AStringTipo node)
    {
        defaultIn(node);
    }

    public void outAStringTipo(AStringTipo node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStringTipo(AStringTipo node)
    {
        inAStringTipo(node);
        if(node.getString() != null)
        {
            node.getString().apply(this);
        }
        outAStringTipo(node);
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

    public void inAExpExpAux(AExpExpAux node)
    {
        defaultIn(node);
    }

    public void outAExpExpAux(AExpExpAux node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpExpAux(AExpExpAux node)
    {
        inAExpExpAux(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outAExpExpAux(node);
    }

    public void inAExpLogica1ExpAux(AExpLogica1ExpAux node)
    {
        defaultIn(node);
    }

    public void outAExpLogica1ExpAux(AExpLogica1ExpAux node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpLogica1ExpAux(AExpLogica1ExpAux node)
    {
        inAExpLogica1ExpAux(node);
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        outAExpLogica1ExpAux(node);
    }

    public void inAReceberExpComando(AReceberExpComando node)
    {
        defaultIn(node);
    }

    public void outAReceberExpComando(AReceberExpComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAReceberExpComando(AReceberExpComando node)
    {
        inAReceberExpComando(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outAReceberExpComando(node);
    }

    public void inAReceberExplogComando(AReceberExplogComando node)
    {
        defaultIn(node);
    }

    public void outAReceberExplogComando(AReceberExplogComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAReceberExplogComando(AReceberExplogComando node)
    {
        inAReceberExplogComando(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        outAReceberExplogComando(node);
    }

    public void inAEscrevaExpComando(AEscrevaExpComando node)
    {
        defaultIn(node);
    }

    public void outAEscrevaExpComando(AEscrevaExpComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEscrevaExpComando(AEscrevaExpComando node)
    {
        inAEscrevaExpComando(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        {
            List<PExpAux> copy = new ArrayList<PExpAux>(node.getExpAux());
            for(PExpAux e : copy)
            {
                e.apply(this);
            }
        }
        outAEscrevaExpComando(node);
    }

    public void inAEscrevaExplogComando(AEscrevaExplogComando node)
    {
        defaultIn(node);
    }

    public void outAEscrevaExplogComando(AEscrevaExplogComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEscrevaExplogComando(AEscrevaExplogComando node)
    {
        inAEscrevaExplogComando(node);
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        {
            List<PExpAux> copy = new ArrayList<PExpAux>(node.getExpAux());
            for(PExpAux e : copy)
            {
                e.apply(this);
            }
        }
        outAEscrevaExplogComando(node);
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
        {
            List<PVar> copy = new ArrayList<PVar>(node.getVar());
            for(PVar e : copy)
            {
                e.apply(this);
            }
        }
        outALeiaComando(node);
    }

    public void inASeExplogComando(ASeExplogComando node)
    {
        defaultIn(node);
    }

    public void outASeExplogComando(ASeExplogComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASeExplogComando(ASeExplogComando node)
    {
        inASeExplogComando(node);
        if(node.getCondicao() != null)
        {
            node.getCondicao().apply(this);
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        outASeExplogComando(node);
    }

    public void inASeExplogSenaoComando(ASeExplogSenaoComando node)
    {
        defaultIn(node);
    }

    public void outASeExplogSenaoComando(ASeExplogSenaoComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASeExplogSenaoComando(ASeExplogSenaoComando node)
    {
        inASeExplogSenaoComando(node);
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getSeV());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getSenaoF());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        outASeExplogSenaoComando(node);
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
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getADe() != null)
        {
            node.getADe().apply(this);
        }
        if(node.getAAte() != null)
        {
            node.getAAte().apply(this);
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
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
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        if(node.getADe() != null)
        {
            node.getADe().apply(this);
        }
        if(node.getAPasso() != null)
        {
            node.getAPasso().apply(this);
        }
        if(node.getAAte() != null)
        {
            node.getAAte().apply(this);
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        outAParaPassoComando(node);
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
        if(node.getCondicao() != null)
        {
            node.getCondicao().apply(this);
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        outAEnquantoComando(node);
    }

    public void inARepitaExplogComando(ARepitaExplogComando node)
    {
        defaultIn(node);
    }

    public void outARepitaExplogComando(ARepitaExplogComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARepitaExplogComando(ARepitaExplogComando node)
    {
        inARepitaExplogComando(node);
        {
            List<PComando> copy = new ArrayList<PComando>(node.getRepita());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        if(node.getCondicao() != null)
        {
            node.getCondicao().apply(this);
        }
        outARepitaExplogComando(node);
    }

    public void inAAvalieExpComando(AAvalieExpComando node)
    {
        defaultIn(node);
    }

    public void outAAvalieExpComando(AAvalieExpComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAvalieExpComando(AAvalieExpComando node)
    {
        inAAvalieExpComando(node);
        if(node.getAvalie() != null)
        {
            node.getAvalie().apply(this);
        }
        {
            List<PEstrCaso> copy = new ArrayList<PEstrCaso>(node.getEstrCaso());
            for(PEstrCaso e : copy)
            {
                e.apply(this);
            }
        }
        outAAvalieExpComando(node);
    }

    public void inAAvalieExplogComando(AAvalieExplogComando node)
    {
        defaultIn(node);
    }

    public void outAAvalieExplogComando(AAvalieExplogComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAvalieExplogComando(AAvalieExplogComando node)
    {
        inAAvalieExplogComando(node);
        if(node.getAvalie() != null)
        {
            node.getAvalie().apply(this);
        }
        {
            List<PEstrCaso> copy = new ArrayList<PEstrCaso>(node.getEstrCaso());
            for(PEstrCaso e : copy)
            {
                e.apply(this);
            }
        }
        outAAvalieExplogComando(node);
    }

    public void inAAvalieExpSenaoComando(AAvalieExpSenaoComando node)
    {
        defaultIn(node);
    }

    public void outAAvalieExpSenaoComando(AAvalieExpSenaoComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAvalieExpSenaoComando(AAvalieExpSenaoComando node)
    {
        inAAvalieExpSenaoComando(node);
        if(node.getAvalie() != null)
        {
            node.getAvalie().apply(this);
        }
        {
            List<PEstrCaso> copy = new ArrayList<PEstrCaso>(node.getEstrCaso());
            for(PEstrCaso e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getSenao());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        outAAvalieExpSenaoComando(node);
    }

    public void inAAvalieExplogSenaoComando(AAvalieExplogSenaoComando node)
    {
        defaultIn(node);
    }

    public void outAAvalieExplogSenaoComando(AAvalieExplogSenaoComando node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAvalieExplogSenaoComando(AAvalieExplogSenaoComando node)
    {
        inAAvalieExplogSenaoComando(node);
        if(node.getAvalie() != null)
        {
            node.getAvalie().apply(this);
        }
        {
            List<PEstrCaso> copy = new ArrayList<PEstrCaso>(node.getEstrCaso());
            for(PEstrCaso e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getSenao());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        outAAvalieExplogSenaoComando(node);
    }

    public void inAEstrCaso(AEstrCaso node)
    {
        defaultIn(node);
    }

    public void outAEstrCaso(AEstrCaso node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEstrCaso(AEstrCaso node)
    {
        inAEstrCaso(node);
        if(node.getCaso() != null)
        {
            node.getCaso().apply(this);
        }
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        {
            List<PComando> copy = new ArrayList<PComando>(node.getComando());
            for(PComando e : copy)
            {
                e.apply(this);
            }
        }
        outAEstrCaso(node);
    }

    public void inAMaisExp(AMaisExp node)
    {
        defaultIn(node);
    }

    public void outAMaisExp(AMaisExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMaisExp(AMaisExp node)
    {
        inAMaisExp(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAMaisExp(node);
    }

    public void inAMenosExp(AMenosExp node)
    {
        defaultIn(node);
    }

    public void outAMenosExp(AMenosExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMenosExp(AMenosExp node)
    {
        inAMenosExp(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAMenosExp(node);
    }

    public void inAMultExp(AMultExp node)
    {
        defaultIn(node);
    }

    public void outAMultExp(AMultExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultExp(AMultExp node)
    {
        inAMultExp(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAMultExp(node);
    }

    public void inADivExp(ADivExp node)
    {
        defaultIn(node);
    }

    public void outADivExp(ADivExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADivExp(ADivExp node)
    {
        inADivExp(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outADivExp(node);
    }

    public void inAVariavelExp(AVariavelExp node)
    {
        defaultIn(node);
    }

    public void outAVariavelExp(AVariavelExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariavelExp(AVariavelExp node)
    {
        inAVariavelExp(node);
        if(node.getVar() != null)
        {
            node.getVar().apply(this);
        }
        outAVariavelExp(node);
    }

    public void inAValorExp(AValorExp node)
    {
        defaultIn(node);
    }

    public void outAValorExp(AValorExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAValorExp(AValorExp node)
    {
        inAValorExp(node);
        if(node.getValor() != null)
        {
            node.getValor().apply(this);
        }
        outAValorExp(node);
    }

    public void inAMenosExpExp(AMenosExpExp node)
    {
        defaultIn(node);
    }

    public void outAMenosExpExp(AMenosExpExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMenosExpExp(AMenosExpExp node)
    {
        inAMenosExpExp(node);
        if(node.getMenos() != null)
        {
            node.getMenos().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outAMenosExpExp(node);
    }

    public void inAExpNaoOuExpLogica(AExpNaoOuExpLogica node)
    {
        defaultIn(node);
    }

    public void outAExpNaoOuExpLogica(AExpNaoOuExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpNaoOuExpLogica(AExpNaoOuExpLogica node)
    {
        inAExpNaoOuExpLogica(node);
        if(node.getNao() != null)
        {
            node.getNao().apply(this);
        }
        if(node.getExpLogica() != null)
        {
            node.getExpLogica().apply(this);
        }
        outAExpNaoOuExpLogica(node);
    }

    public void inAXorExpLogica(AXorExpLogica node)
    {
        defaultIn(node);
    }

    public void outAXorExpLogica(AXorExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAXorExpLogica(AXorExpLogica node)
    {
        inAXorExpLogica(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAXorExpLogica(node);
    }

    public void inAOuExpLogica(AOuExpLogica node)
    {
        defaultIn(node);
    }

    public void outAOuExpLogica(AOuExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAOuExpLogica(AOuExpLogica node)
    {
        inAOuExpLogica(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAOuExpLogica(node);
    }

    public void inAEExpLogica(AEExpLogica node)
    {
        defaultIn(node);
    }

    public void outAEExpLogica(AEExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEExpLogica(AEExpLogica node)
    {
        inAEExpLogica(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAEExpLogica(node);
    }

    public void inAExpIgualExpLogica(AExpIgualExpLogica node)
    {
        defaultIn(node);
    }

    public void outAExpIgualExpLogica(AExpIgualExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpIgualExpLogica(AExpIgualExpLogica node)
    {
        inAExpIgualExpLogica(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAExpIgualExpLogica(node);
    }

    public void inAExpDiferenteExpLogica(AExpDiferenteExpLogica node)
    {
        defaultIn(node);
    }

    public void outAExpDiferenteExpLogica(AExpDiferenteExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpDiferenteExpLogica(AExpDiferenteExpLogica node)
    {
        inAExpDiferenteExpLogica(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAExpDiferenteExpLogica(node);
    }

    public void inAExpMenorExpLogica(AExpMenorExpLogica node)
    {
        defaultIn(node);
    }

    public void outAExpMenorExpLogica(AExpMenorExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpMenorExpLogica(AExpMenorExpLogica node)
    {
        inAExpMenorExpLogica(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAExpMenorExpLogica(node);
    }

    public void inAExpMenorIgualExpLogica(AExpMenorIgualExpLogica node)
    {
        defaultIn(node);
    }

    public void outAExpMenorIgualExpLogica(AExpMenorIgualExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpMenorIgualExpLogica(AExpMenorIgualExpLogica node)
    {
        inAExpMenorIgualExpLogica(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAExpMenorIgualExpLogica(node);
    }

    public void inAExpMaiorExpLogica(AExpMaiorExpLogica node)
    {
        defaultIn(node);
    }

    public void outAExpMaiorExpLogica(AExpMaiorExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpMaiorExpLogica(AExpMaiorExpLogica node)
    {
        inAExpMaiorExpLogica(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAExpMaiorExpLogica(node);
    }

    public void inAExpMaiorIgualExpLogica(AExpMaiorIgualExpLogica node)
    {
        defaultIn(node);
    }

    public void outAExpMaiorIgualExpLogica(AExpMaiorIgualExpLogica node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExpMaiorIgualExpLogica(AExpMaiorIgualExpLogica node)
    {
        inAExpMaiorIgualExpLogica(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAExpMaiorIgualExpLogica(node);
    }
}
