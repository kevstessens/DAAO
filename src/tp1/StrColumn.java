package tp1;

import java.math.BigInteger;


public class StrColumn extends Column<String>{

    public StrColumn(String name){
        super(name);
    }


    public Condition equals(Value<String> value) {
        return null;
    }

    public Condition startsWith(Value<String> value) {
        return null;  //To change body of created methods use File | Settings | File Templates.
    }
}
