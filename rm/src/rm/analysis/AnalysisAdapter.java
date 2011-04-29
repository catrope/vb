/* This file was generated by SableCC (http://www.sablecc.org/). */

package rm.analysis;

import java.util.*;
import rm.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    public void caseADefProg(ADefProg node)
    {
        defaultCase(node);
    }

    public void caseACompProg(ACompProg node)
    {
        defaultCase(node);
    }

    public void caseAEndProg(AEndProg node)
    {
        defaultCase(node);
    }

    public void caseALetDef(ALetDef node)
    {
        defaultCase(node);
    }

    public void caseAExprComp(AExprComp node)
    {
        defaultCase(node);
    }

    public void caseANonemptyParlst(ANonemptyParlst node)
    {
        defaultCase(node);
    }

    public void caseAEmptyParlst(AEmptyParlst node)
    {
        defaultCase(node);
    }

    public void caseAMultiPars(AMultiPars node)
    {
        defaultCase(node);
    }

    public void caseASinglePars(ASinglePars node)
    {
        defaultCase(node);
    }

    public void caseAIfthenExpr(AIfthenExpr node)
    {
        defaultCase(node);
    }

    public void caseASimpleExpr(ASimpleExpr node)
    {
        defaultCase(node);
    }

    public void caseARelRelexpr(ARelRelexpr node)
    {
        defaultCase(node);
    }

    public void caseATermSmplexpr(ATermSmplexpr node)
    {
        defaultCase(node);
    }

    public void caseAAddSmplexpr(AAddSmplexpr node)
    {
        defaultCase(node);
    }

    public void caseAFactorTerm(AFactorTerm node)
    {
        defaultCase(node);
    }

    public void caseAMulTerm(AMulTerm node)
    {
        defaultCase(node);
    }

    public void caseAExprFactor(AExprFactor node)
    {
        defaultCase(node);
    }

    public void caseAIntFactor(AIntFactor node)
    {
        defaultCase(node);
    }

    public void caseARealFactor(ARealFactor node)
    {
        defaultCase(node);
    }

    public void caseACallFactor(ACallFactor node)
    {
        defaultCase(node);
    }

    public void caseANonemptyArglst(ANonemptyArglst node)
    {
        defaultCase(node);
    }

    public void caseAEmptyArglst(AEmptyArglst node)
    {
        defaultCase(node);
    }

    public void caseAMultiArgs(AMultiArgs node)
    {
        defaultCase(node);
    }

    public void caseASingleArgs(ASingleArgs node)
    {
        defaultCase(node);
    }

    public void caseAPlusAddop(APlusAddop node)
    {
        defaultCase(node);
    }

    public void caseAMinusAddop(AMinusAddop node)
    {
        defaultCase(node);
    }

    public void caseATimesMulop(ATimesMulop node)
    {
        defaultCase(node);
    }

    public void caseAIdivMulop(AIdivMulop node)
    {
        defaultCase(node);
    }

    public void caseARdivMulop(ARdivMulop node)
    {
        defaultCase(node);
    }

    public void caseAImodMulop(AImodMulop node)
    {
        defaultCase(node);
    }

    public void caseAEqualRelop(AEqualRelop node)
    {
        defaultCase(node);
    }

    public void caseANoteqRelop(ANoteqRelop node)
    {
        defaultCase(node);
    }

    public void caseALessRelop(ALessRelop node)
    {
        defaultCase(node);
    }

    public void caseALseqRelop(ALseqRelop node)
    {
        defaultCase(node);
    }

    public void caseAGreqRelop(AGreqRelop node)
    {
        defaultCase(node);
    }

    public void caseAGrtrRelop(AGrtrRelop node)
    {
        defaultCase(node);
    }

    public void caseTPlussym(TPlussym node)
    {
        defaultCase(node);
    }

    public void caseTMinussym(TMinussym node)
    {
        defaultCase(node);
    }

    public void caseTTimessym(TTimessym node)
    {
        defaultCase(node);
    }

    public void caseTIdivsym(TIdivsym node)
    {
        defaultCase(node);
    }

    public void caseTRdivsym(TRdivsym node)
    {
        defaultCase(node);
    }

    public void caseTImodsym(TImodsym node)
    {
        defaultCase(node);
    }

    public void caseTEqualsym(TEqualsym node)
    {
        defaultCase(node);
    }

    public void caseTNoteqsym(TNoteqsym node)
    {
        defaultCase(node);
    }

    public void caseTLesssym(TLesssym node)
    {
        defaultCase(node);
    }

    public void caseTLseqsym(TLseqsym node)
    {
        defaultCase(node);
    }

    public void caseTGreqsym(TGreqsym node)
    {
        defaultCase(node);
    }

    public void caseTGrtrsym(TGrtrsym node)
    {
        defaultCase(node);
    }

    public void caseTLparsym(TLparsym node)
    {
        defaultCase(node);
    }

    public void caseTRparsym(TRparsym node)
    {
        defaultCase(node);
    }

    public void caseTQuestionsym(TQuestionsym node)
    {
        defaultCase(node);
    }

    public void caseTCommasym(TCommasym node)
    {
        defaultCase(node);
    }

    public void caseTSemicolonsym(TSemicolonsym node)
    {
        defaultCase(node);
    }

    public void caseTEndsym(TEndsym node)
    {
        defaultCase(node);
    }

    public void caseTLetsym(TLetsym node)
    {
        defaultCase(node);
    }

    public void caseTIfsym(TIfsym node)
    {
        defaultCase(node);
    }

    public void caseTThensym(TThensym node)
    {
        defaultCase(node);
    }

    public void caseTElsesym(TElsesym node)
    {
        defaultCase(node);
    }

    public void caseTIntdenotation(TIntdenotation node)
    {
        defaultCase(node);
    }

    public void caseTRealdenotation(TRealdenotation node)
    {
        defaultCase(node);
    }

    public void caseTIdent(TIdent node)
    {
        defaultCase(node);
    }

    public void caseTBlank(TBlank node)
    {
        defaultCase(node);
    }

    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
