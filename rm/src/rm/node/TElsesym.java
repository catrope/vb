/* This file was generated by SableCC (http://www.sablecc.org/). */

package rm.node;

import rm.analysis.*;

@SuppressWarnings("nls")
public final class TElsesym extends Token
{
    public TElsesym()
    {
        super.setText("ELSE");
    }

    public TElsesym(int line, int pos)
    {
        super.setText("ELSE");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TElsesym(getLine(), getPos());
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTElsesym(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TElsesym text.");
    }
}
