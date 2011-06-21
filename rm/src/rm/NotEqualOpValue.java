package rm;

public class NotEqualOpValue extends BinCmpValue {

	public NotEqualOpValue(Value a, Value b) {
		super(a, b);
	}

	@Override
	public BoolValue evaluate(Context context) {
		ConcreteValue aEval = a.evaluate(context);
		ConcreteValue bEval = b.evaluate(context);
		if (aEval.hasIntValue() && bEval.hasIntValue()) {
			return new BoolValue(aEval.getIntValue() != bEval.getIntValue());
		} else {
			return new BoolValue(aEval.getDoubleValue() != bEval.getDoubleValue());
		}
	}
}
