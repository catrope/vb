/* This file was generated by SableCC (http://www.sablecc.org/). */

package rm.node;

import rm.analysis.*;

@SuppressWarnings("nls")
public final class ANonemptyArglst extends PArglst
{
    private TLparsym _lparsym_;
    private PArgs _args_;
    private TRparsym _rparsym_;

    public ANonemptyArglst()
    {
        // Constructor
    }

    public ANonemptyArglst(
        @SuppressWarnings("hiding") TLparsym _lparsym_,
        @SuppressWarnings("hiding") PArgs _args_,
        @SuppressWarnings("hiding") TRparsym _rparsym_)
    {
        // Constructor
        setLparsym(_lparsym_);

        setArgs(_args_);

        setRparsym(_rparsym_);

    }

    @Override
    public Object clone()
    {
        return new ANonemptyArglst(
            cloneNode(this._lparsym_),
            cloneNode(this._args_),
            cloneNode(this._rparsym_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANonemptyArglst(this);
    }

    public TLparsym getLparsym()
    {
        return this._lparsym_;
    }

    public void setLparsym(TLparsym node)
    {
        if(this._lparsym_ != null)
        {
            this._lparsym_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lparsym_ = node;
    }

    public PArgs getArgs()
    {
        return this._args_;
    }

    public void setArgs(PArgs node)
    {
        if(this._args_ != null)
        {
            this._args_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._args_ = node;
    }

    public TRparsym getRparsym()
    {
        return this._rparsym_;
    }

    public void setRparsym(TRparsym node)
    {
        if(this._rparsym_ != null)
        {
            this._rparsym_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rparsym_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._lparsym_)
            + toString(this._args_)
            + toString(this._rparsym_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lparsym_ == child)
        {
            this._lparsym_ = null;
            return;
        }

        if(this._args_ == child)
        {
            this._args_ = null;
            return;
        }

        if(this._rparsym_ == child)
        {
            this._rparsym_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._lparsym_ == oldChild)
        {
            setLparsym((TLparsym) newChild);
            return;
        }

        if(this._args_ == oldChild)
        {
            setArgs((PArgs) newChild);
            return;
        }

        if(this._rparsym_ == oldChild)
        {
            setRparsym((TRparsym) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
