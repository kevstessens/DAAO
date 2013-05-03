package tp1.visitor;

import tp1.*;

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

        sqlQuery.accept(this);

      /*  final List<Column> selectColumns = sqlQuery.getSelectColumns();
        final Table fromTable = sqlQuery.getFromTable();
        final Condition whereCondition = sqlQuery.getWhereCondition();


        final StringBuilder queryStringBuilder = new StringBuilder("SELECT ");

        if (selectColumns.isEmpty())
            queryStringBuilder.append("*");
        else {
            for (int i=0; i< selectColumns.size(); i++) {
                queryStringBuilder.append(selectColumns.get(i).accept(this));
                if(i != selectColumns.size()-1){
                    queryStringBuilder.append(", ");
                }
            }
        }

        queryStringBuilder.append(" FROM ");
        if (fromTable.equals(null))
            return;
        else {
            queryStringBuilder.append(fromTable.accept(this));
        }

        queryStringBuilder.append(" WHERE ");
        queryStringBuilder.append(whereCondition.accept(this));



        System.out.println(queryStringBuilder);  */
    }

   @Override
    public void visit(Column column) {
       System.out.println(column.getName());
    }

    @Override
    public void visit(Table table) {
        System.out.println(table.getName());
    }
    @Override
    public void visit(Value val) {
        System.out.println(val.getValue());
    }

    @Override
    public void visit(Condition condition) {
        condition.accept(this);


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
