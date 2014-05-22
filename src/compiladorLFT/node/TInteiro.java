/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladorLFT.node;

import compiladorLFT.analysis.*;

@SuppressWarnings("nls")
public final class TInteiro extends Token
{
    public TInteiro()
    {
        super.setText("inteiro");
    }

    public TInteiro(int line, int pos)
    {
        super.setText("inteiro");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TInteiro(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTInteiro(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TInteiro text.");
    }
}