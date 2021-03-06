/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladorLFT.node;

import compiladorLFT.analysis.*;

@SuppressWarnings("nls")
public final class TVarStr extends Token
{
    public TVarStr()
    {
        super.setText("var_str");
    }

    public TVarStr(int line, int pos)
    {
        super.setText("var_str");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TVarStr(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTVarStr(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TVarStr text.");
    }
}
