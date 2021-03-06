/* This file was generated by SableCC (http://www.sablecc.org/). */

package rm.node;

import rm.analysis.*;

@SuppressWarnings("nls")
public final class AAddopAddopfactor extends PAddopfactor
{
    private PAddop _addop_;
    private PFactor _factor_;

    public AAddopAddopfactor()
    {
        // Constructor
    }

    public AAddopAddopfactor(
        @SuppressWarnings("hiding") PAddop _addop_,
        @SuppressWarnings("hiding") PFactor _factor_)
    {
        // Constructor
        setAddop(_addop_);

        setFactor(_factor_);

    }

    @Override
    public Object clone()
    {
        return new AAddopAddopfactor(
            cloneNode(this._addop_),
            cloneNode(this._factor_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAddopAddopfactor(this);
    }

    public PAddop getAddop()
    {
        return this._addop_;
    }

    public void setAddop(PAddop node)
    {
        if(this._addop_ != null)
        {
            this._addop_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._addop_ = node;
    }

    public PFactor getFactor()
    {
        return this._factor_;
    }

    public void setFactor(PFactor node)
    {
        if(this._factor_ != null)
        {
            this._factor_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._factor_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._addop_)
            + toString(this._factor_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._addop_ == child)
        {
            this._addop_ = null;
            return;
        }

        if(this._factor_ == child)
        {
            this._factor_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._addop_ == oldChild)
        {
            setAddop((PAddop) newChild);
            return;
        }

        if(this._factor_ == oldChild)
        {
            setFactor((PFactor) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
