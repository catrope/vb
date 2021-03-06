package rm;

public class PlusOpValue extends BinOpValue {

	public PlusOpValue(Value a, Value b) {
		super(a, b);
	}

	@Override
	public ConcreteValue evaluate(Context context) {
		ConcreteValue aEval = a.evaluate(context);
		ConcreteValue bEval = b.evaluate(context);
		if (aEval.hasIntValue() && bEval.hasIntValue()) {
			return new IntValue(aEval.getIntValue() + bEval.getIntValue());
		} else {
			return new DoubleValue(aEval.getDoubleValue() + bEval.getDoubleValue());
		}
	}

}
