/* This file was generated by SableCC (http://www.sablecc.org/). */

package rm.node;

import rm.analysis.*;

@SuppressWarnings("nls")
public final class AAddSmplexpr extends PSmplexpr
{
    private PSmplexpr _smplexpr_;
    private PAddop _addop_;
    private PTerm _term_;

    public AAddSmplexpr()
    {
        // Constructor
    }

    public AAddSmplexpr(
        @SuppressWarnings("hiding") PSmplexpr _smplexpr_,
        @SuppressWarnings("hiding") PAddop _addop_,
        @SuppressWarnings("hiding") PTerm _term_)
    {
        // Constructor
        setSmplexpr(_smplexpr_);

        setAddop(_addop_);

        setTerm(_term_);

    }

    @Override
    public Object clone()
    {
        return new AAddSmplexpr(
            cloneNode(this._smplexpr_),
            cloneNode(this._addop_),
            cloneNode(this._term_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAddSmplexpr(this);
    }

    public PSmplexpr getSmplexpr()
    {
        return this._smplexpr_;
    }

    public void setSmplexpr(PSmplexpr node)
    {
        if(this._smplexpr_ != null)
        {
            this._smplexpr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._smplexpr_ = node;
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

    public PTerm getTerm()
    {
        return this._term_;
    }

    public void setTerm(PTerm node)
    {
        if(this._term_ != null)
        {
            this._term_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._term_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._smplexpr_)
            + toString(this._addop_)
            + toString(this._term_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._smplexpr_ == child)
        {
            this._smplexpr_ = null;
            return;
        }

        if(this._addop_ == child)
        {
            this._addop_ = null;
            return;
        }

        if(this._term_ == child)
        {
            this._term_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._smplexpr_ == oldChild)
        {
            setSmplexpr((PSmplexpr) newChild);
            return;
        }

        if(this._addop_ == oldChild)
        {
            setAddop((PAddop) newChild);
            return;
        }

        if(this._term_ == oldChild)
        {
            setTerm((PTerm) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
