/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladorLFT.node;

import compiladorLFT.analysis.*;

@SuppressWarnings("nls")
public final class AXorExpLogica extends PExpLogica
{
    private PExpLogica _left_;
    private PExpLogica _right_;

    public AXorExpLogica()
    {
        // Constructor
    }

    public AXorExpLogica(
        @SuppressWarnings("hiding") PExpLogica _left_,
        @SuppressWarnings("hiding") PExpLogica _right_)
    {
        // Constructor
        setLeft(_left_);

        setRight(_right_);

    }

    @Override
    public Object clone()
    {
        return new AXorExpLogica(
            cloneNode(this._left_),
            cloneNode(this._right_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAXorExpLogica(this);
    }

    public PExpLogica getLeft()
    {
        return this._left_;
    }

    public void setLeft(PExpLogica node)
    {
        if(this._left_ != null)
        {
            this._left_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._left_ = node;
    }

    public PExpLogica getRight()
    {
        return this._right_;
    }

    public void setRight(PExpLogica node)
    {
        if(this._right_ != null)
        {
            this._right_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._right_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._left_)
            + toString(this._right_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._left_ == child)
        {
            this._left_ = null;
            return;
        }

        if(this._right_ == child)
        {
            this._right_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._left_ == oldChild)
        {
            setLeft((PExpLogica) newChild);
            return;
        }

        if(this._right_ == oldChild)
        {
            setRight((PExpLogica) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
