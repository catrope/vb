package rm;

public class EqualOpValue extends BinOpValue {

	public EqualOpValue(Value a, Value b) {
		super(a, b);
	}

	@Override
	public ConcreteValue evaluate(Context context) {
		ConcreteValue aEval = a.evaluate(context);
		ConcreteValue bEval = b.evaluate(context);
		if (aEval.hasIntValue() && bEval.hasIntValue()) {
			return new IntValue(aEval.getIntValue() == bEval.getIntValue() ? 1 : 0);
		} else {
			return new DoubleValue(aEval.getDoubleValue() == bEval.getDoubleValue() ? 1 : 0);
		}
	}
}
