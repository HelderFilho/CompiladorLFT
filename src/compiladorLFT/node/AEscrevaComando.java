/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladorLFT.node;

import compiladorLFT.analysis.*;

@SuppressWarnings("nls")
public final class AEscrevaComando extends PComando
{
    private TEscreva _escreva_;
    private TParenteseE _parenteseE_;
    private PExp _exp_;
    private TVirgula _virgula_;
    private PExps _exps_;
    private TParenteseD _parenteseD_;
    private TPontoVirgula _pontoVirgula_;

    public AEscrevaComando()
    {
        // Constructor
    }

    public AEscrevaComando(
        @SuppressWarnings("hiding") TEscreva _escreva_,
        @SuppressWarnings("hiding") TParenteseE _parenteseE_,
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") TVirgula _virgula_,
        @SuppressWarnings("hiding") PExps _exps_,
        @SuppressWarnings("hiding") TParenteseD _parenteseD_,
        @SuppressWarnings("hiding") TPontoVirgula _pontoVirgula_)
    {
        // Constructor
        setEscreva(_escreva_);

        setParenteseE(_parenteseE_);

        setExp(_exp_);

        setVirgula(_virgula_);

        setExps(_exps_);

        setParenteseD(_parenteseD_);

        setPontoVirgula(_pontoVirgula_);

    }

    @Override
    public Object clone()
    {
        return new AEscrevaComando(
            cloneNode(this._escreva_),
            cloneNode(this._parenteseE_),
            cloneNode(this._exp_),
            cloneNode(this._virgula_),
            cloneNode(this._exps_),
            cloneNode(this._parenteseD_),
            cloneNode(this._pontoVirgula_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEscrevaComando(this);
    }

    public TEscreva getEscreva()
    {
        return this._escreva_;
    }

    public void setEscreva(TEscreva node)
    {
        if(this._escreva_ != null)
        {
            this._escreva_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._escreva_ = node;
    }

    public TParenteseE getParenteseE()
    {
        return this._parenteseE_;
    }

    public void setParenteseE(TParenteseE node)
    {
        if(this._parenteseE_ != null)
        {
            this._parenteseE_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parenteseE_ = node;
    }

    public PExp getExp()
    {
        return this._exp_;
    }

    public void setExp(PExp node)
    {
        if(this._exp_ != null)
        {
            this._exp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp_ = node;
    }

    public TVirgula getVirgula()
    {
        return this._virgula_;
    }

    public void setVirgula(TVirgula node)
    {
        if(this._virgula_ != null)
        {
            this._virgula_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._virgula_ = node;
    }

    public PExps getExps()
    {
        return this._exps_;
    }

    public void setExps(PExps node)
    {
        if(this._exps_ != null)
        {
            this._exps_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exps_ = node;
    }

    public TParenteseD getParenteseD()
    {
        return this._parenteseD_;
    }

    public void setParenteseD(TParenteseD node)
    {
        if(this._parenteseD_ != null)
        {
            this._parenteseD_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parenteseD_ = node;
    }

    public TPontoVirgula getPontoVirgula()
    {
        return this._pontoVirgula_;
    }

    public void setPontoVirgula(TPontoVirgula node)
    {
        if(this._pontoVirgula_ != null)
        {
            this._pontoVirgula_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._pontoVirgula_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._escreva_)
            + toString(this._parenteseE_)
            + toString(this._exp_)
            + toString(this._virgula_)
            + toString(this._exps_)
            + toString(this._parenteseD_)
            + toString(this._pontoVirgula_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._escreva_ == child)
        {
            this._escreva_ = null;
            return;
        }

        if(this._parenteseE_ == child)
        {
            this._parenteseE_ = null;
            return;
        }

        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        if(this._virgula_ == child)
        {
            this._virgula_ = null;
            return;
        }

        if(this._exps_ == child)
        {
            this._exps_ = null;
            return;
        }

        if(this._parenteseD_ == child)
        {
            this._parenteseD_ = null;
            return;
        }

        if(this._pontoVirgula_ == child)
        {
            this._pontoVirgula_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._escreva_ == oldChild)
        {
            setEscreva((TEscreva) newChild);
            return;
        }

        if(this._parenteseE_ == oldChild)
        {
            setParenteseE((TParenteseE) newChild);
            return;
        }

        if(this._exp_ == oldChild)
        {
            setExp((PExp) newChild);
            return;
        }

        if(this._virgula_ == oldChild)
        {
            setVirgula((TVirgula) newChild);
            return;
        }

        if(this._exps_ == oldChild)
        {
            setExps((PExps) newChild);
            return;
        }

        if(this._parenteseD_ == oldChild)
        {
            setParenteseD((TParenteseD) newChild);
            return;
        }

        if(this._pontoVirgula_ == oldChild)
        {
            setPontoVirgula((TPontoVirgula) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
