package tp1.visitor;

import tp1.Column;
import tp1.SqlQuery;
import tp1.Table;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: laura
 * Date: 26/04/13
 * Time: 08:28
 * To change this template use File | Settings | File Templates.
 */
public class ConsoleVisitor implements QueryVisitor {


    @Override
    public void visit(SqlQuery sqlQuery) {
        List<Column> selectColumns = sqlQuery.getSelectColumns();

        final StringBuilder queryStringBuilder = new StringBuilder("SELECT ");

        if (selectColumns.isEmpty())
            queryStringBuilder.append("*");
        else {
            for (Column column : selectColumns) {
                column.accept(this);
            }
        }

        System.out.println(queryStringBuilder);
    }

   @Override
    public String visit(Column column) {
        return column.getName();
    }

    @Override
    public String visit(Table table) {
       return table.getName();
    }



/*
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
}
