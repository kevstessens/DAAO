package tp1;

import tp1.visitor.QueryVisitor;
import tp1.visitor.Visitable;

import java.util.List;


public class SqlQuery implements Visitable {
    private final List<Column> selectColumns;
    private final Table fromTable;
    private final Condition whereClause;
    private final List<Column> orderByColumns;
    private final List<Column> groupByColumns;
    private final int limit;

    SqlQuery(List<Column> selectColumns, Table fromTable, Condition condition,List<Column> orderByColumns, List<Column> groupByColumns, int limit) {
        this.selectColumns = selectColumns;
        this.fromTable = fromTable;
        this.whereClause = condition;
        this.groupByColumns = groupByColumns;
        this.orderByColumns = orderByColumns;
        this.limit = limit;
    }

    @Override
    public void accept(QueryVisitor visitor) {
        for (Column selectColumn : selectColumns) {
            visitor.visit(selectColumn);
        }
        visitor.visit(fromTable);
        visitor.visit(whereClause);
        for (Column orderByColumn : orderByColumns) {
            visitor.visit(orderByColumn);
        }
        for (Column groupByColumn : groupByColumns) {
            visitor.visit(groupByColumn);
        }

    }
}
