package tp1;

import com.sun.istack.internal.NotNull;

/**
 * Created with IntelliJ IDEA.
 * User: laura
 * Date: 03/05/13
 * Time: 09:41
 * To change this template use File | Settings | File Templates.
 */
public class BinaryCondition extends Condition{

    private final Statement<?> right;

    public BinaryCondition(Operator operator, Statement<?> left, Statement<?> right) {
        super(operator, left);
        this.right = right;
    }

    public BinaryCondition and(@NotNull Statement<Boolean> other) {
        return new BinaryCondition(Operator.AND, this, other);
    }

    public BinaryCondition or(@NotNull Statement<Boolean> other) {
        return new BinaryCondition(Operator.OR, this, other);
    }

}
