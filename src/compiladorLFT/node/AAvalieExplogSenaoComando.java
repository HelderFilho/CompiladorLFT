/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladorLFT.node;

import java.util.*;
import compiladorLFT.analysis.*;

@SuppressWarnings("nls")
public final class AAvalieExplogSenaoComando extends PComando
{
    private PExpLogica _avalie_;
    private final LinkedList<PEstrCaso> _estrCaso_ = new LinkedList<PEstrCaso>();
    private final LinkedList<PComando> _senao_ = new LinkedList<PComando>();

    public AAvalieExplogSenaoComando()
    {
        // Constructor
    }

    public AAvalieExplogSenaoComando(
        @SuppressWarnings("hiding") PExpLogica _avalie_,
        @SuppressWarnings("hiding") List<?> _estrCaso_,
        @SuppressWarnings("hiding") List<?> _senao_)
    {
        // Constructor
        setAvalie(_avalie_);

        setEstrCaso(_estrCaso_);

        setSenao(_senao_);

    }

    @Override
    public Object clone()
    {
        return new AAvalieExplogSenaoComando(
            cloneNode(this._avalie_),
            cloneList(this._estrCaso_),
            cloneList(this._senao_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAvalieExplogSenaoComando(this);
    }

    public PExpLogica getAvalie()
    {
        return this._avalie_;
    }

    public void setAvalie(PExpLogica node)
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

    public LinkedList<PEstrCaso> getEstrCaso()
    {
        return this._estrCaso_;
    }

    public void setEstrCaso(List<?> list)
    {
        for(PEstrCaso e : this._estrCaso_)
        {
            e.parent(null);
        }
        this._estrCaso_.clear();

        for(Object obj_e : list)
        {
            PEstrCaso e = (PEstrCaso) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._estrCaso_.add(e);
        }
    }

    public LinkedList<PComando> getSenao()
    {
        return this._senao_;
    }

    public void setSenao(List<?> list)
    {
        for(PComando e : this._senao_)
        {
            e.parent(null);
        }
        this._senao_.clear();

        for(Object obj_e : list)
        {
            PComando e = (PComando) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._senao_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._avalie_)
            + toString(this._estrCaso_)
            + toString(this._senao_);
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

        if(this._estrCaso_.remove(child))
        {
            return;
        }

        if(this._senao_.remove(child))
        {
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
            setAvalie((PExpLogica) newChild);
            return;
        }

        for(ListIterator<PEstrCaso> i = this._estrCaso_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PEstrCaso) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        for(ListIterator<PComando> i = this._senao_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PComando) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}
