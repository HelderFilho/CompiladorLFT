/* This file was generated by SableCC (http://www.sablecc.org/). */

package compiladorLFT.node;

import compiladorLFT.analysis.*;

@SuppressWarnings("nls")
public final class TDoisPontosFinais extends Token
{
    public TDoisPontosFinais()
    {
        super.setText("..");
    }

    public TDoisPontosFinais(int line, int pos)
    {
        super.setText("..");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TDoisPontosFinais(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTDoisPontosFinais(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TDoisPontosFinais text.");
    }
}