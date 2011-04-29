package postfix;
import postfix.analysis.*;
import postfix.node.*;

class Translation extends DepthFirstAdapter {
	public void caseTNumber(TNumber node) {
         System.out.print(node);
    }

    public void caseAPlusExpr(APlusExpr node) {
        System.out.print(node.getPlus());
        super.caseAPlusExpr(node);
    }
        
    public void caseAMinusExpr(AMinusExpr node) {
    	System.out.print(node.getMinus());
    	super.caseAMinusExpr(node);
    }
        
        public void caseAMultFactor(AMultFactor node) {
            System.out.print(node.getMult());
            super.caseAMultFactor(node);
        }
        
        public void caseADivFactor(ADivFactor node) {
            System.out.print(node.getDiv());
            super.caseADivFactor(node);
        }
        
        public void caseAModFactor(AModFactor node) {
            System.out.print(node.getMod());
            super.caseAModFactor(node);
        }
}

