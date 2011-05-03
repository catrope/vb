package rm;

public class IfThenValue extends Value {

	private Value cond, thenVal, elseVal;

	public IfThenValue(Value cond, Value thenVal, Value elseVal) {
		this.cond = cond;
		this.thenVal = thenVal;
		this.elseVal = elseVal;
	}

	@Override
	public ConcreteValue evaluate(Context context) {
		ConcreteValue condEval = cond.evaluate(context);
		if (condEval.getIntValue() != 0)
			return thenVal.evaluate(context);
		else
			return elseVal.evaluate(context);
	}
}
