/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladorLFT.node;

import compiladorLFT.analysis.*;

@SuppressWarnings("nls")
public final class TFimProcedimento extends Token
{
    public TFimProcedimento()
    {
        super.setText("fim procedimento");
    }

    public TFimProcedimento(int line, int pos)
    {
        super.setText("fim procedimento");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TFimProcedimento(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTFimProcedimento(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TFimProcedimento text.");
    }
}
