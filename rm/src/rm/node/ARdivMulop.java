/* This file was generated by SableCC (http://www.sablecc.org/). */

package rm.node;

import rm.analysis.*;

@SuppressWarnings("nls")
public final class ARdivMulop extends PMulop
{
    private TRdivsym _rdivsym_;

    public ARdivMulop()
    {
        // Constructor
    }

    public ARdivMulop(
        @SuppressWarnings("hiding") TRdivsym _rdivsym_)
    {
        // Constructor
        setRdivsym(_rdivsym_);

    }

    @Override
    public Object clone()
    {
        return new ARdivMulop(
            cloneNode(this._rdivsym_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARdivMulop(this);
    }

    public TRdivsym getRdivsym()
    {
        return this._rdivsym_;
    }

    public void setRdivsym(TRdivsym node)
    {
        if(this._rdivsym_ != null)
        {
            this._rdivsym_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rdivsym_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._rdivsym_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._rdivsym_ == child)
        {
            this._rdivsym_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._rdivsym_ == oldChild)
        {
            setRdivsym((TRdivsym) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
