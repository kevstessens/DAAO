package tp1.visitor;

import tp1.*;

/**
 * Created with IntelliJ IDEA.
 * User: laura
 * Date: 26/04/13
 * Time: 08:28
 * To change this template use File | Settings | File Templates.
 */
public class JsonVisitor implements QueryVisitor {


    @Override
    public void visit(SqlQuery sqlQuery) {
    }

    @Override
    public void visit(Column column) {

    }

    @Override
    public void visit(Table table) {

    }

    @Override
    public void visit(Value value) {
    }

    @Override
    public void visit(Condition condition) {
    }

    @Override
    public void visit(Operator operator) {

    }

    @Override
    public void visit(Statement statement) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
