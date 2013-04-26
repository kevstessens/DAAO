package tp1;

import tp1.visitor.ConsoleVisitor;
import tp1.visitor.QueryVisitor;
import tp1.visitor.Visitable;

/**
 * Created with IntelliJ IDEA.
 * User: Martin
 * Date: 4/19/13
 * Time: 4:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class Condition implements Visitable {
    private Const constant1;
    private Const Constant2;
    private String operator;


    public Condition and(Condition s) {
        return new Condition();
    }
    public Condition or(Condition s) {
        return null;  //To change body of created methods use File | Settings | File Templates.
    }
    public Condition not() {
        return null;  //To change body of created methods use File | Settings | File Templates.
    }

    public Condition is() {
        return null;  //To change body of created methods use File | Settings | File Templates.
    }

    public String accept(QueryVisitor visitor) {
        return visitor.visit(this);
    }
}
