/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladorLFT.node;

import compiladorLFT.analysis.*;

@SuppressWarnings("nls")
public final class TFimPara extends Token
{
    public TFimPara()
    {
        super.setText("fim para");
    }

    public TFimPara(int line, int pos)
    {
        super.setText("fim para");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TFimPara(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTFimPara(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TFimPara text.");
    }
}
