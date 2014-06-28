/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladorLFT.node;

import compiladorLFT.analysis.*;

@SuppressWarnings("nls")
public final class AStringVar extends PVar
{
    private TIdentificador _left_;
    private TColcheteE _colcheteE_;
    private TIdentificador _right_;
    private TColcheteD _colcheteD_;

    public AStringVar()
    {
        // Constructor
    }

    public AStringVar(
        @SuppressWarnings("hiding") TIdentificador _left_,
        @SuppressWarnings("hiding") TColcheteE _colcheteE_,
        @SuppressWarnings("hiding") TIdentificador _right_,
        @SuppressWarnings("hiding") TColcheteD _colcheteD_)
    {
        // Constructor
        setLeft(_left_);

        setColcheteE(_colcheteE_);

        setRight(_right_);

        setColcheteD(_colcheteD_);

    }

    @Override
    public Object clone()
    {
        return new AStringVar(
            cloneNode(this._left_),
            cloneNode(this._colcheteE_),
            cloneNode(this._right_),
            cloneNode(this._colcheteD_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAStringVar(this);
    }

    public TIdentificador getLeft()
    {
        return this._left_;
    }

    public void setLeft(TIdentificador node)
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

    public TColcheteE getColcheteE()
    {
        return this._colcheteE_;
    }

    public void setColcheteE(TColcheteE node)
    {
        if(this._colcheteE_ != null)
        {
            this._colcheteE_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._colcheteE_ = node;
    }

    public TIdentificador getRight()
    {
        return this._right_;
    }

    public void setRight(TIdentificador node)
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

    public TColcheteD getColcheteD()
    {
        return this._colcheteD_;
    }

    public void setColcheteD(TColcheteD node)
    {
        if(this._colcheteD_ != null)
        {
            this._colcheteD_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._colcheteD_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._left_)
            + toString(this._colcheteE_)
            + toString(this._right_)
            + toString(this._colcheteD_);
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

        if(this._colcheteE_ == child)
        {
            this._colcheteE_ = null;
            return;
        }

        if(this._right_ == child)
        {
            this._right_ = null;
            return;
        }

        if(this._colcheteD_ == child)
        {
            this._colcheteD_ = null;
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
            setLeft((TIdentificador) newChild);
            return;
        }

        if(this._colcheteE_ == oldChild)
        {
            setColcheteE((TColcheteE) newChild);
            return;
        }

        if(this._right_ == oldChild)
        {
            setRight((TIdentificador) newChild);
            return;
        }

        if(this._colcheteD_ == oldChild)
        {
            setColcheteD((TColcheteD) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
