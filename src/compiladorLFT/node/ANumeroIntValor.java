/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladorLFT.node;

import compiladorLFT.analysis.*;

@SuppressWarnings("nls")
public final class ANumeroIntValor extends PValor
{
    private TNumeroInt _numeroInt_;

    public ANumeroIntValor()
    {
        // Constructor
    }

    public ANumeroIntValor(
        @SuppressWarnings("hiding") TNumeroInt _numeroInt_)
    {
        // Constructor
        setNumeroInt(_numeroInt_);

    }

    @Override
    public Object clone()
    {
        return new ANumeroIntValor(
            cloneNode(this._numeroInt_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANumeroIntValor(this);
    }

    public TNumeroInt getNumeroInt()
    {
        return this._numeroInt_;
    }

    public void setNumeroInt(TNumeroInt node)
    {
        if(this._numeroInt_ != null)
        {
            this._numeroInt_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._numeroInt_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._numeroInt_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._numeroInt_ == child)
        {
            this._numeroInt_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._numeroInt_ == oldChild)
        {
            setNumeroInt((TNumeroInt) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}