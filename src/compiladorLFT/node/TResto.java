/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladorLFT.node;

import compiladorLFT.analysis.*;

@SuppressWarnings("nls")
public final class TResto extends Token
{
    public TResto()
    {
        super.setText("%");
    }

    public TResto(int line, int pos)
    {
        super.setText("%");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TResto(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTResto(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TResto text.");
    }
}
