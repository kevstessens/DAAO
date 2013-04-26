package tp1;

import com.sun.istack.internal.NotNull;

public class BoolColumn extends Column<Boolean> {

    public BoolColumn(String name){
        super(name);
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

}
