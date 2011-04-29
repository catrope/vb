/* This file was generated by SableCC (http://www.sablecc.org/). */

package rm.node;

import rm.analysis.*;

@SuppressWarnings("nls")
public final class AIfthenExpr extends PExpr
{
    private TIfsym _ifsym_;
    private PRelexpr _relexpr_;
    private TThensym _thensym_;
    private PExpr _then_;
    private TElsesym _elsesym_;
    private PExpr _else_;

    public AIfthenExpr()
    {
        // Constructor
    }

    public AIfthenExpr(
        @SuppressWarnings("hiding") TIfsym _ifsym_,
        @SuppressWarnings("hiding") PRelexpr _relexpr_,
        @SuppressWarnings("hiding") TThensym _thensym_,
        @SuppressWarnings("hiding") PExpr _then_,
        @SuppressWarnings("hiding") TElsesym _elsesym_,
        @SuppressWarnings("hiding") PExpr _else_)
    {
        // Constructor
        setIfsym(_ifsym_);

        setRelexpr(_relexpr_);

        setThensym(_thensym_);

        setThen(_then_);

        setElsesym(_elsesym_);

        setElse(_else_);

    }

    @Override
    public Object clone()
    {
        return new AIfthenExpr(
            cloneNode(this._ifsym_),
            cloneNode(this._relexpr_),
            cloneNode(this._thensym_),
            cloneNode(this._then_),
            cloneNode(this._elsesym_),
            cloneNode(this._else_));
    }

    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIfthenExpr(this);
    }

    public TIfsym getIfsym()
    {
        return this._ifsym_;
    }

    public void setIfsym(TIfsym node)
    {
        if(this._ifsym_ != null)
        {
            this._ifsym_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ifsym_ = node;
    }

    public PRelexpr getRelexpr()
    {
        return this._relexpr_;
    }

    public void setRelexpr(PRelexpr node)
    {
        if(this._relexpr_ != null)
        {
            this._relexpr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._relexpr_ = node;
    }

    public TThensym getThensym()
    {
        return this._thensym_;
    }

    public void setThensym(TThensym node)
    {
        if(this._thensym_ != null)
        {
            this._thensym_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._thensym_ = node;
    }

    public PExpr getThen()
    {
        return this._then_;
    }

    public void setThen(PExpr node)
    {
        if(this._then_ != null)
        {
            this._then_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._then_ = node;
    }

    public TElsesym getElsesym()
    {
        return this._elsesym_;
    }

    public void setElsesym(TElsesym node)
    {
        if(this._elsesym_ != null)
        {
            this._elsesym_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._elsesym_ = node;
    }

    public PExpr getElse()
    {
        return this._else_;
    }

    public void setElse(PExpr node)
    {
        if(this._else_ != null)
        {
            this._else_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._else_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._ifsym_)
            + toString(this._relexpr_)
            + toString(this._thensym_)
            + toString(this._then_)
            + toString(this._elsesym_)
            + toString(this._else_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._ifsym_ == child)
        {
            this._ifsym_ = null;
            return;
        }

        if(this._relexpr_ == child)
        {
            this._relexpr_ = null;
            return;
        }

        if(this._thensym_ == child)
        {
            this._thensym_ = null;
            return;
        }

        if(this._then_ == child)
        {
            this._then_ = null;
            return;
        }

        if(this._elsesym_ == child)
        {
            this._elsesym_ = null;
            return;
        }

        if(this._else_ == child)
        {
            this._else_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._ifsym_ == oldChild)
        {
            setIfsym((TIfsym) newChild);
            return;
        }

        if(this._relexpr_ == oldChild)
        {
            setRelexpr((PRelexpr) newChild);
            return;
        }

        if(this._thensym_ == oldChild)
        {
            setThensym((TThensym) newChild);
            return;
        }

        if(this._then_ == oldChild)
        {
            setThen((PExpr) newChild);
            return;
        }

        if(this._elsesym_ == oldChild)
        {
            setElsesym((TElsesym) newChild);
            return;
        }

        if(this._else_ == oldChild)
        {
            setElse((PExpr) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
