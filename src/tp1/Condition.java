package tp1;

import tp1.visitor.QueryVisitor;
import tp1.visitor.Visitable;

public class Condition extends Statement<Boolean> implements Visitable {

    protected final Operator operator;
    protected final Statement<?> left;


    public Condition(Operator operator, Statement<?> unary) {
        this.operator = operator;
        left = unary;
    }

    public UnitCondition not() {
        return new UnitCondition(Operator.NOT, this);
    }

    public void accept(QueryVisitor visitor){
        visitor.visit(operator);
        visitor.visit(left);
    }
}
