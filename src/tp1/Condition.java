package tp1;

import com.sun.istack.internal.NotNull;
import tp1.visitor.ConsoleVisitor;
import tp1.visitor.QueryVisitor;
import tp1.visitor.Visitable;

public class Condition extends Statement<Boolean> implements Visitable {

    private final Operator operator;
    private final Statement<?> left;
    private final Statement<?> right;

    public Condition(Operator operator, Statement<?> left, Statement<?> right) {
        this.operator = operator;
        this.left = left;
        this.right = right;
    }

    public Condition(Operator operator, Statement<?> unary) {
        this.operator = operator;
        left = unary;
    }


    public Condition and(@NotNull Statement<Boolean> other) {
        return new Condition(Operator.AND, this, other);
    }
    public Condition or(@NotNull Statement<Boolean> other) {
        return new Condition(Operator.OR, this, other);
    }

    public Condition not() {
        return new Condition(Operator.NOT, this);
    }

    public void accept(QueryVisitor visitor) {
        visitor.visit(this);
    }
}
