/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladorLFT.node;

import compiladorLFT.analysis.*;

@SuppressWarnings("nls")
public final class AAvalieComando extends PComando
{
    private TAvalie _avalie_;
    private TParenteseE _parenteseE_;
    private PExp _exp_;
    private TParenteseD _parenteseD_;

    public AAvalieComando()
    {
        // Constructor
    }

    public AAvalieComando(
        @SuppressWarnings("hiding") TAvalie _avalie_,
        @SuppressWarnings("hiding") TParenteseE _parenteseE_,
        @SuppressWarnings("hiding") PExp _exp_,
        @SuppressWarnings("hiding") TParenteseD _parenteseD_)
    {
        // Constructor
        setAvalie(_avalie_);

        setParenteseE(_parenteseE_);

        setExp(_exp_);

        setParenteseD(_parenteseD_);

    }

    @Override
    public Object clone()
    {
        return new AAvalieComando(
            cloneNode(this._avalie_),
            cloneNode(this._parenteseE_),
            cloneNode(this._exp_),
            cloneNode(this._parenteseD_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAvalieComando(this);
    }

    public TAvalie getAvalie()
    {
        return this._avalie_;
    }

    public void setAvalie(TAvalie node)
    {
        if(this._avalie_ != null)
        {
            this._avalie_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._avalie_ = node;
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._avalie_)
            + toString(this._parenteseE_)
            + toString(this._exp_)
            + toString(this._parenteseD_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._avalie_ == child)
        {
            this._avalie_ = null;
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

        if(this._parenteseD_ == child)
        {
            this._parenteseD_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._avalie_ == oldChild)
        {
            setAvalie((TAvalie) newChild);
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

        if(this._parenteseD_ == oldChild)
        {
            setParenteseD((TParenteseD) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
