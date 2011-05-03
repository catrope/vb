package rm;

public class TimesOpValue extends BinOpValue {

	public TimesOpValue(Value a, Value b) {
		super(a, b);
	}

	@Override
	public ConcreteValue evaluate() {
		ConcreteValue aEval = a.evaluate();
		ConcreteValue bEval = b.evaluate();
		if (aEval.hasIntValue() && bEval.hasIntValue()) {
			return new IntValue(aEval.getIntValue() * bEval.getIntValue());
		} else {
			return new DoubleValue(aEval.getDoubleValue() * bEval.getDoubleValue());
		}
	}

}
