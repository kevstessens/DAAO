package tp1;

import java.math.BigInteger;


public class StrColumn extends Column<String>{

    public StrColumn(String name){
        super(name);
    }


    public Condition equals(Value<String> value) {
        return new Condition(Operator.EQ, this, value);
    }

    public Condition startsWith(Value<String> value) {
        return new Condition(Operator.STARTS, this, value);
    }

    public Condition contains(Value<String> value) {
        return new Condition(Operator.CONTAINS, this, value);
    }




}
