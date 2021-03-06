/* This file was generated by SableCC (http://www.sablecc.org/). */

package rm.node;

import rm.analysis.*;

@SuppressWarnings("nls")
public final class AFactorTerm extends PTerm
{
    private PAddopfactor _addopfactor_;

    public AFactorTerm()
    {
        // Constructor
    }

    public AFactorTerm(
        @SuppressWarnings("hiding") PAddopfactor _addopfactor_)
    {
        // Constructor
        setAddopfactor(_addopfactor_);

    }

    @Override
    public Object clone()
    {
        return new AFactorTerm(
            cloneNode(this._addopfactor_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFactorTerm(this);
    }

    public PAddopfactor getAddopfactor()
    {
        return this._addopfactor_;
    }

    public void setAddopfactor(PAddopfactor node)
    {
        if(this._addopfactor_ != null)
        {
            this._addopfactor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._addopfactor_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._addopfactor_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._addopfactor_ == child)
        {
            this._addopfactor_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._addopfactor_ == oldChild)
        {
            setAddopfactor((PAddopfactor) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
