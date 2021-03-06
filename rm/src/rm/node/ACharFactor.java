/* This file was generated by SableCC (http://www.sablecc.org/). */

package rm.node;

import rm.analysis.*;

@SuppressWarnings("nls")
public final class ACharFactor extends PFactor
{
    private TChardenotation _chardenotation_;

    public ACharFactor()
    {
        // Constructor
    }

    public ACharFactor(
        @SuppressWarnings("hiding") TChardenotation _chardenotation_)
    {
        // Constructor
        setChardenotation(_chardenotation_);

    }

    @Override
    public Object clone()
    {
        return new ACharFactor(
            cloneNode(this._chardenotation_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACharFactor(this);
    }

    public TChardenotation getChardenotation()
    {
        return this._chardenotation_;
    }

    public void setChardenotation(TChardenotation node)
    {
        if(this._chardenotation_ != null)
        {
            this._chardenotation_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._chardenotation_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._chardenotation_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._chardenotation_ == child)
        {
            this._chardenotation_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._chardenotation_ == oldChild)
        {
            setChardenotation((TChardenotation) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
