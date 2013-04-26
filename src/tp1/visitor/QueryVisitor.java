package tp1.visitor;

import tp1.*;

/**
 * Created with IntelliJ IDEA.
 * User: laura
 * Date: 26/04/13
 * Time: 08:27
 * To change this template use File | Settings | File Templates.
 */
public interface QueryVisitor {

    public void visit(SqlQuery sqlQuery);

    public String visit(Column column);

    public String visit(Table table);

    public String visit(Const constant);

    public String visit(Value value);


}
