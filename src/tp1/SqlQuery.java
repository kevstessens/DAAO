package tp1;

import tp1.visitor.QueryVisitor;
import tp1.visitor.Visitable;

import java.util.List;


public class SqlQuery implements Visitable {
    private final List<Column> selectColumns;
    private final List<Table> fromColumns;
    private final Condition whereClause;
    private final List<Column> orderByColumns;
    private final List<Column> groupByColumns;
    private final int limit;

    SqlQuery(List<Column> selectColumns, List<Table> fromColumns, Condition condition,List<Column> orderByColumns, List<Column> groupByColumns, int limit) {
        this.selectColumns = selectColumns;
        this.fromColumns = fromColumns;
        this.whereClause = condition;
        this.groupByColumns = groupByColumns;
        this.orderByColumns = orderByColumns;
        this.limit = limit;
    }

    /*@Override
    public String toString(){
        final StringBuilder builder = new StringBuilder("SELECT ");
        if (selectColumns.isEmpty())
            builder.append("* ");
        else {
            builder.append(createSVFromList(selectColumns, "", ", ", ""));
        }

        if (fromColumns.size() == 0)
            return "";
        else {
           builder.append(createSVFromList(fromColumns, "", ", ", ""));
        }

        if (whereClause != null)
            builder.append("WHERE " + createSVFromList(whereClause,));

        if (order.size() > 0)
            query += createSVFromList(order, ", ");

        if (limit.length() > 0)
            query += "LIMIT " + limit;

        //todo groupby clause

        return super.toString();
    } */

    private String createSVFromList(List<?> list, String first, String separator, String end) {
       String stringList = ""+ first;
        for (int i=0; i< list.size()-1; i++) {
            stringList += list.get(i).toString() + separator;
        }
        if(!list.isEmpty()){
            stringList += list.get(list.size()-1).toString();
        }
        stringList += end;
        return  stringList;
    }
   /*
    public void visit(QueryVisitor visitor){

        final StringBuilder builder = new StringBuilder("SELECT ");
        if (selectColumns.isEmpty())
            builder.append("* ");
        else {
            builder.append(createSVFromList(selectColumns, ", "));
        }

        if (fromColumns.size() == 0)
            throw new Exception("At least one table needed to build sqlQuery");
        else {
            query += "FROM " + createSVFromList(fromColumns, ", ");
        }

        if (whereClause.size() > 0)
            query += "WHERE " + createSVFromList(whereClause, " AND ");

        if (order.size() > 0)
            query += createSVFromList(order, ", ");

        if (limit.length() > 0)
            query += "LIMIT " + limit;

        //todo groupby clause

    }  */

    @Override
    public void accept(QueryVisitor visitor) {
        visitor.visit(this);
    }

    public List<Column> getSelectColumns() {
        return selectColumns;
    }
}
