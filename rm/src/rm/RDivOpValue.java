package rm;

public class RDivOpValue extends BinOpValue {

	public RDivOpValue(Value a, Value b) {
		super(a, b);
	}

	@Override
	public ConcreteValue evaluate(Context context) {
		return new DoubleValue(a.evaluate(context).getDoubleValue() / b.evaluate(context).getDoubleValue());
	}

}
