/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladorLFT.node;

import compiladorLFT.analysis.*;

@SuppressWarnings("nls")
public final class TFimVar extends Token
{
    public TFimVar()
    {
        super.setText("fim var");
    }

    public TFimVar(int line, int pos)
    {
        super.setText("fim var");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TFimVar(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTFimVar(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TFimVar text.");
    }
}
