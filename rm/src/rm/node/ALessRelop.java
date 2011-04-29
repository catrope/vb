/* This file was generated by SableCC (http://www.sablecc.org/). */

package rm.node;

import rm.analysis.*;

@SuppressWarnings("nls")
public final class ALessRelop extends PRelop
{
    private TLesssym _lesssym_;

    public ALessRelop()
    {
        // Constructor
    }

    public ALessRelop(
        @SuppressWarnings("hiding") TLesssym _lesssym_)
    {
        // Constructor
        setLesssym(_lesssym_);

    }

    @Override
    public Object clone()
    {
        return new ALessRelop(
            cloneNode(this._lesssym_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALessRelop(this);
    }

    public TLesssym getLesssym()
    {
        return this._lesssym_;
    }

    public void setLesssym(TLesssym node)
    {
        if(this._lesssym_ != null)
        {
            this._lesssym_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lesssym_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._lesssym_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lesssym_ == child)
        {
            this._lesssym_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._lesssym_ == oldChild)
        {
            setLesssym((TLesssym) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
