/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladorLFT.node;

import java.util.*;
import compiladorLFT.analysis.*;

@SuppressWarnings("nls")
public final class ASeComando extends PComando
{
    private TSe _se_;
    private TParenteseE _parenteseE_;
    private PExpLogica _expLogica_;
    private TParenteseD _parenteseD_;
    private TE _e_;
    private TEntao _entao_;
    private final LinkedList<PComandoRepeat> _comandoRepeat_ = new LinkedList<PComandoRepeat>();
    private final LinkedList<PSenaoComando> _senaoComando_ = new LinkedList<PSenaoComando>();
    private TFimSe _fimSe_;
    private TPontoVirgula _pontoVirgula_;

    public ASeComando()
    {
        // Constructor
    }

    public ASeComando(
        @SuppressWarnings("hiding") TSe _se_,
        @SuppressWarnings("hiding") TParenteseE _parenteseE_,
        @SuppressWarnings("hiding") PExpLogica _expLogica_,
        @SuppressWarnings("hiding") TParenteseD _parenteseD_,
        @SuppressWarnings("hiding") TE _e_,
        @SuppressWarnings("hiding") TEntao _entao_,
        @SuppressWarnings("hiding") List<?> _comandoRepeat_,
        @SuppressWarnings("hiding") List<?> _senaoComando_,
        @SuppressWarnings("hiding") TFimSe _fimSe_,
        @SuppressWarnings("hiding") TPontoVirgula _pontoVirgula_)
    {
        // Constructor
        setSe(_se_);

        setParenteseE(_parenteseE_);

        setExpLogica(_expLogica_);

        setParenteseD(_parenteseD_);

        setE(_e_);

        setEntao(_entao_);

        setComandoRepeat(_comandoRepeat_);

        setSenaoComando(_senaoComando_);

        setFimSe(_fimSe_);

        setPontoVirgula(_pontoVirgula_);

    }

    @Override
    public Object clone()
    {
        return new ASeComando(
            cloneNode(this._se_),
            cloneNode(this._parenteseE_),
            cloneNode(this._expLogica_),
            cloneNode(this._parenteseD_),
            cloneNode(this._e_),
            cloneNode(this._entao_),
            cloneList(this._comandoRepeat_),
            cloneList(this._senaoComando_),
            cloneNode(this._fimSe_),
            cloneNode(this._pontoVirgula_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASeComando(this);
    }

    public TSe getSe()
    {
        return this._se_;
    }

    public void setSe(TSe node)
    {
        if(this._se_ != null)
        {
            this._se_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._se_ = node;
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

    public PExpLogica getExpLogica()
    {
        return this._expLogica_;
    }

    public void setExpLogica(PExpLogica node)
    {
        if(this._expLogica_ != null)
        {
            this._expLogica_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expLogica_ = node;
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

    public TE getE()
    {
        return this._e_;
    }

    public void setE(TE node)
    {
        if(this._e_ != null)
        {
            this._e_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._e_ = node;
    }

    public TEntao getEntao()
    {
        return this._entao_;
    }

    public void setEntao(TEntao node)
    {
        if(this._entao_ != null)
        {
            this._entao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._entao_ = node;
    }

    public LinkedList<PComandoRepeat> getComandoRepeat()
    {
        return this._comandoRepeat_;
    }

    public void setComandoRepeat(List<?> list)
    {
        for(PComandoRepeat e : this._comandoRepeat_)
        {
            e.parent(null);
        }
        this._comandoRepeat_.clear();

        for(Object obj_e : list)
        {
            PComandoRepeat e = (PComandoRepeat) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._comandoRepeat_.add(e);
        }
    }

    public LinkedList<PSenaoComando> getSenaoComando()
    {
        return this._senaoComando_;
    }

    public void setSenaoComando(List<?> list)
    {
        for(PSenaoComando e : this._senaoComando_)
        {
            e.parent(null);
        }
        this._senaoComando_.clear();

        for(Object obj_e : list)
        {
            PSenaoComando e = (PSenaoComando) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._senaoComando_.add(e);
        }
    }

    public TFimSe getFimSe()
    {
        return this._fimSe_;
    }

    public void setFimSe(TFimSe node)
    {
        if(this._fimSe_ != null)
        {
            this._fimSe_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fimSe_ = node;
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
            + toString(this._se_)
            + toString(this._parenteseE_)
            + toString(this._expLogica_)
            + toString(this._parenteseD_)
            + toString(this._e_)
            + toString(this._entao_)
            + toString(this._comandoRepeat_)
            + toString(this._senaoComando_)
            + toString(this._fimSe_)
            + toString(this._pontoVirgula_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._se_ == child)
        {
            this._se_ = null;
            return;
        }

        if(this._parenteseE_ == child)
        {
            this._parenteseE_ = null;
            return;
        }

        if(this._expLogica_ == child)
        {
            this._expLogica_ = null;
            return;
        }

        if(this._parenteseD_ == child)
        {
            this._parenteseD_ = null;
            return;
        }

        if(this._e_ == child)
        {
            this._e_ = null;
            return;
        }

        if(this._entao_ == child)
        {
            this._entao_ = null;
            return;
        }

        if(this._comandoRepeat_.remove(child))
        {
            return;
        }

        if(this._senaoComando_.remove(child))
        {
            return;
        }

        if(this._fimSe_ == child)
        {
            this._fimSe_ = null;
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
        if(this._se_ == oldChild)
        {
            setSe((TSe) newChild);
            return;
        }

        if(this._parenteseE_ == oldChild)
        {
            setParenteseE((TParenteseE) newChild);
            return;
        }

        if(this._expLogica_ == oldChild)
        {
            setExpLogica((PExpLogica) newChild);
            return;
        }

        if(this._parenteseD_ == oldChild)
        {
            setParenteseD((TParenteseD) newChild);
            return;
        }

        if(this._e_ == oldChild)
        {
            setE((TE) newChild);
            return;
        }

        if(this._entao_ == oldChild)
        {
            setEntao((TEntao) newChild);
            return;
        }

        for(ListIterator<PComandoRepeat> i = this._comandoRepeat_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PComandoRepeat) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        for(ListIterator<PSenaoComando> i = this._senaoComando_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PSenaoComando) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._fimSe_ == oldChild)
        {
            setFimSe((TFimSe) newChild);
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
