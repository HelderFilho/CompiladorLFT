/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladorLFT.node;

import compiladorLFT.analysis.*;

@SuppressWarnings("nls")
public final class TEscolha extends Token
{
    public TEscolha()
    {
        super.setText("escolha");
    }

    public TEscolha(int line, int pos)
    {
        super.setText("escolha");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TEscolha(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTEscolha(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TEscolha text.");
    }
}
