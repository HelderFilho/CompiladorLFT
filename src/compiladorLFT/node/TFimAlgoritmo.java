/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladorLFT.node;

import compiladorLFT.analysis.*;

@SuppressWarnings("nls")
public final class TFimAlgoritmo extends Token
{
    public TFimAlgoritmo()
    {
        super.setText("fim algoritmo");
    }

    public TFimAlgoritmo(int line, int pos)
    {
        super.setText("fim algoritmo");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TFimAlgoritmo(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTFimAlgoritmo(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TFimAlgoritmo text.");
    }
}
