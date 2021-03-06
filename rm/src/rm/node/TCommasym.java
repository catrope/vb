/* This file was generated by SableCC (http://www.sablecc.org/). */

package rm.node;

import rm.analysis.*;

@SuppressWarnings("nls")
public final class TCommasym extends Token
{
    public TCommasym()
    {
        super.setText(",");
    }

    public TCommasym(int line, int pos)
    {
        super.setText(",");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TCommasym(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTCommasym(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TCommasym text.");
    }
}
