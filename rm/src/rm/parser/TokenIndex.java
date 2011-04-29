/* This file was generated by SableCC (http://www.sablecc.org/). */

package rm.parser;

import rm.node.*;
import rm.analysis.*;

class TokenIndex extends AnalysisAdapter
{
    int index;

    @Override
    public void caseTPlussym(@SuppressWarnings("unused") TPlussym node)
    {
        this.index = 0;
    }

    @Override
    public void caseTMinussym(@SuppressWarnings("unused") TMinussym node)
    {
        this.index = 1;
    }

    @Override
    public void caseTTimessym(@SuppressWarnings("unused") TTimessym node)
    {
        this.index = 2;
    }

    @Override
    public void caseTIdivsym(@SuppressWarnings("unused") TIdivsym node)
    {
        this.index = 3;
    }

    @Override
    public void caseTRdivsym(@SuppressWarnings("unused") TRdivsym node)
    {
        this.index = 4;
    }

    @Override
    public void caseTImodsym(@SuppressWarnings("unused") TImodsym node)
    {
        this.index = 5;
    }

    @Override
    public void caseTEqualsym(@SuppressWarnings("unused") TEqualsym node)
    {
        this.index = 6;
    }

    @Override
    public void caseTNoteqsym(@SuppressWarnings("unused") TNoteqsym node)
    {
        this.index = 7;
    }

    @Override
    public void caseTLesssym(@SuppressWarnings("unused") TLesssym node)
    {
        this.index = 8;
    }

    @Override
    public void caseTLseqsym(@SuppressWarnings("unused") TLseqsym node)
    {
        this.index = 9;
    }

    @Override
    public void caseTGreqsym(@SuppressWarnings("unused") TGreqsym node)
    {
        this.index = 10;
    }

    @Override
    public void caseTGrtrsym(@SuppressWarnings("unused") TGrtrsym node)
    {
        this.index = 11;
    }

    @Override
    public void caseTLparsym(@SuppressWarnings("unused") TLparsym node)
    {
        this.index = 12;
    }

    @Override
    public void caseTRparsym(@SuppressWarnings("unused") TRparsym node)
    {
        this.index = 13;
    }

    @Override
    public void caseTQuestionsym(@SuppressWarnings("unused") TQuestionsym node)
    {
        this.index = 14;
    }

    @Override
    public void caseTCommasym(@SuppressWarnings("unused") TCommasym node)
    {
        this.index = 15;
    }

    @Override
    public void caseTSemicolonsym(@SuppressWarnings("unused") TSemicolonsym node)
    {
        this.index = 16;
    }

    @Override
    public void caseTEndsym(@SuppressWarnings("unused") TEndsym node)
    {
        this.index = 17;
    }

    @Override
    public void caseTLetsym(@SuppressWarnings("unused") TLetsym node)
    {
        this.index = 18;
    }

    @Override
    public void caseTIfsym(@SuppressWarnings("unused") TIfsym node)
    {
        this.index = 19;
    }

    @Override
    public void caseTThensym(@SuppressWarnings("unused") TThensym node)
    {
        this.index = 20;
    }

    @Override
    public void caseTElsesym(@SuppressWarnings("unused") TElsesym node)
    {
        this.index = 21;
    }

    @Override
    public void caseTIntdenotation(@SuppressWarnings("unused") TIntdenotation node)
    {
        this.index = 22;
    }

    @Override
    public void caseTRealdenotation(@SuppressWarnings("unused") TRealdenotation node)
    {
        this.index = 23;
    }

    @Override
    public void caseTIdent(@SuppressWarnings("unused") TIdent node)
    {
        this.index = 24;
    }

    @Override
    public void caseTEmpty(@SuppressWarnings("unused") TEmpty node)
    {
        this.index = 25;
    }

    @Override
    public void caseEOF(@SuppressWarnings("unused") EOF node)
    {
        this.index = 26;
    }
}
