package tp1;


import tp1.visitor.QueryVisitor;
import tp1.visitor.Visitable;

public class Statement<T> implements Visitable {

    @Override
    public void accept(QueryVisitor visitor) {
        visitor.visit(this);
    }
}
