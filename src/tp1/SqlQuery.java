package tp1;

import java.io.PrintStream;
import java.util.List;


public class SqlQuery {
    private final List<Column> select;
    private final List<Table> from;
    private final Condition where;
    private final List<Column> order;
    private final List<Column> groupByColumns;

    SqlQuery(List<Column> select, List<Table> from, Condition condition,
             List<Column> order, List<Column> groupByColumns) {
        this.select = select;
        this.from = from;
        this.where = condition;
        this.order = order;
        this.groupByColumns = groupByColumns;
    }

    @Override public String toString() {
        final StringBuilder builder = new StringBuilder("SELECT ");
        if (select.isEmpty())
            builder.append("* ");
        else {
            builder.append(createSVFromList(select, ", "));
        }

        if (from.size() == 0)
            throw new Exception("At least one table needed to build sqlQuery");
        else {
            query += "FROM " + createSVFromList(from, ", ");
        }

        if (where.size() > 0)
            query += "WHERE " + createSVFromList(where, " AND ");

        if (order.size() > 0)
            query += createSVFromList(order, ", ");

        if (limit.length() > 0)
            query += "LIMIT " + limit;

        //todo groupby clause

        return super.toString();    //To change body of overridden methods use File | Settings | File Templates.
    }

    public String getQuery() {
        return query;
    }

    public void visit(Visitor visitor)
    {

        final StringBuilder builder = new StringBuilder("SELECT ");
        if (select.isEmpty())
            builder.append("* ");
        else {
            builder.append(createSVFromList(select, ", "));
        }

        if (from.size() == 0)
            throw new Exception("At least one table needed to build sqlQuery");
        else {
            query += "FROM " + createSVFromList(from, ", ");
        }

        if (where.size() > 0)
            query += "WHERE " + createSVFromList(where, " AND ");

        if (order.size() > 0)
            query += createSVFromList(order, ", ");

        if (limit.length() > 0)
            query += "LIMIT " + limit;

        //todo groupby clause

    }
}
