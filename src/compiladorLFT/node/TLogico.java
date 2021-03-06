/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladorLFT.node;

import compiladorLFT.analysis.*;

@SuppressWarnings("nls")
public final class TLogico extends Token
{
    public TLogico()
    {
        super.setText("logico");
    }

    public TLogico(int line, int pos)
    {
        super.setText("logico");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TLogico(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTLogico(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TLogico text.");
    }
}
