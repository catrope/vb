package rm;

public class GreaterEqualOpValue extends BinOpValue {

	public GreaterEqualOpValue(Value a, Value b) {
		super(a, b);
	}

	@Override
	public ConcreteValue evaluate() {
		ConcreteValue aEval = a.evaluate();
		ConcreteValue bEval = b.evaluate();
		if (aEval.hasIntValue() && bEval.hasIntValue()) {
			return new IntValue(aEval.getIntValue() >= bEval.getIntValue() ? 1 : 0);
		} else {
			return new DoubleValue(aEval.getDoubleValue() >= bEval.getDoubleValue() ? 1 : 0);
		}
	}
}
