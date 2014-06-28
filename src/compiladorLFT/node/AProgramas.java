/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladorLFT.node;

import compiladorLFT.analysis.*;

@SuppressWarnings("nls")
public final class AProgramas extends PProgramas
{
    private TPrograma _programa_;
    private TIdentificador _identificador_;
    private TInicio _inicio_;
    private PDeclaracao _declaracao_;
    private PComando _comando_;
    private TFim _fim_;

    public AProgramas()
    {
        // Constructor
    }

    public AProgramas(
        @SuppressWarnings("hiding") TPrograma _programa_,
        @SuppressWarnings("hiding") TIdentificador _identificador_,
        @SuppressWarnings("hiding") TInicio _inicio_,
        @SuppressWarnings("hiding") PDeclaracao _declaracao_,
        @SuppressWarnings("hiding") PComando _comando_,
        @SuppressWarnings("hiding") TFim _fim_)
    {
        // Constructor
        setPrograma(_programa_);

        setIdentificador(_identificador_);

        setInicio(_inicio_);

        setDeclaracao(_declaracao_);

        setComando(_comando_);

        setFim(_fim_);

    }

    @Override
    public Object clone()
    {
        return new AProgramas(
            cloneNode(this._programa_),
            cloneNode(this._identificador_),
            cloneNode(this._inicio_),
            cloneNode(this._declaracao_),
            cloneNode(this._comando_),
            cloneNode(this._fim_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAProgramas(this);
    }

    public TPrograma getPrograma()
    {
        return this._programa_;
    }

    public void setPrograma(TPrograma node)
    {
        if(this._programa_ != null)
        {
            this._programa_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._programa_ = node;
    }

    public TIdentificador getIdentificador()
    {
        return this._identificador_;
    }

    public void setIdentificador(TIdentificador node)
    {
        if(this._identificador_ != null)
        {
            this._identificador_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._identificador_ = node;
    }

    public TInicio getInicio()
    {
        return this._inicio_;
    }

    public void setInicio(TInicio node)
    {
        if(this._inicio_ != null)
        {
            this._inicio_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._inicio_ = node;
    }

    public PDeclaracao getDeclaracao()
    {
        return this._declaracao_;
    }

    public void setDeclaracao(PDeclaracao node)
    {
        if(this._declaracao_ != null)
        {
            this._declaracao_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._declaracao_ = node;
    }

    public PComando getComando()
    {
        return this._comando_;
    }

    public void setComando(PComando node)
    {
        if(this._comando_ != null)
        {
            this._comando_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comando_ = node;
    }

    public TFim getFim()
    {
        return this._fim_;
    }

    public void setFim(TFim node)
    {
        if(this._fim_ != null)
        {
            this._fim_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fim_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._programa_)
            + toString(this._identificador_)
            + toString(this._inicio_)
            + toString(this._declaracao_)
            + toString(this._comando_)
            + toString(this._fim_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._programa_ == child)
        {
            this._programa_ = null;
            return;
        }

        if(this._identificador_ == child)
        {
            this._identificador_ = null;
            return;
        }

        if(this._inicio_ == child)
        {
            this._inicio_ = null;
            return;
        }

        if(this._declaracao_ == child)
        {
            this._declaracao_ = null;
            return;
        }

        if(this._comando_ == child)
        {
            this._comando_ = null;
            return;
        }

        if(this._fim_ == child)
        {
            this._fim_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._programa_ == oldChild)
        {
            setPrograma((TPrograma) newChild);
            return;
        }

        if(this._identificador_ == oldChild)
        {
            setIdentificador((TIdentificador) newChild);
            return;
        }

        if(this._inicio_ == oldChild)
        {
            setInicio((TInicio) newChild);
            return;
        }

        if(this._declaracao_ == oldChild)
        {
            setDeclaracao((PDeclaracao) newChild);
            return;
        }

        if(this._comando_ == oldChild)
        {
            setComando((PComando) newChild);
            return;
        }

        if(this._fim_ == oldChild)
        {
            setFim((TFim) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}