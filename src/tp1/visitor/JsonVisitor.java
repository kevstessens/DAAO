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
            //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String visit(Column column) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String visit(Table table) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }


    @Override
    public String visit(Const constant) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
         public String visit(Value val) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
