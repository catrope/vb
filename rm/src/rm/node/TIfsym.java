/* This file was generated by SableCC (http://www.sablecc.org/). */

package rm.node;

import rm.analysis.*;

@SuppressWarnings("nls")
public final class TIfsym extends Token
{
    public TIfsym()
    {
        super.setText("IF");
    }

    public TIfsym(int line, int pos)
    {
        super.setText("IF");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TIfsym(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTIfsym(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TIfsym text.");
    }
}
