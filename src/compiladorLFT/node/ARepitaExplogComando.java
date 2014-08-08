/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladorLFT.node;

import java.util.*;
import compiladorLFT.analysis.*;

@SuppressWarnings("nls")
public final class ARepitaExplogComando extends PComando
{
    private final LinkedList<PComando> _repita_ = new LinkedList<PComando>();
    private PExpLogica _condicao_;

    public ARepitaExplogComando()
    {
        // Constructor
    }

    public ARepitaExplogComando(
        @SuppressWarnings("hiding") List<?> _repita_,
        @SuppressWarnings("hiding") PExpLogica _condicao_)
    {
        // Constructor
        setRepita(_repita_);

        setCondicao(_condicao_);

    }

    @Override
    public Object clone()
    {
        return new ARepitaExplogComando(
            cloneList(this._repita_),
            cloneNode(this._condicao_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARepitaExplogComando(this);
    }

    public LinkedList<PComando> getRepita()
    {
        return this._repita_;
    }

    public void setRepita(List<?> list)
    {
        for(PComando e : this._repita_)
        {
            e.parent(null);
        }
        this._repita_.clear();

        for(Object obj_e : list)
        {
            PComando e = (PComando) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._repita_.add(e);
        }
    }

    public PExpLogica getCondicao()
    {
        return this._condicao_;
    }

    public void setCondicao(PExpLogica node)
    {
        if(this._condicao_ != null)
        {
            this._condicao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._condicao_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._repita_)
            + toString(this._condicao_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._repita_.remove(child))
        {
            return;
        }

        if(this._condicao_ == child)
        {
            this._condicao_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PComando> i = this._repita_.listIterator(); i.hasNext();)
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

        if(this._condicao_ == oldChild)
        {
            setCondicao((PExpLogica) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}