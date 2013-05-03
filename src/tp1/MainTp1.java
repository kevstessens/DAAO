package tp1;


import tp1.visitor.ConsoleVisitor;

import static tp1.Constant.cons;
import static tp1.SqlQueryBuilder.sqlQuery;

public class MainTp1 {
    public static void main(String[] args) throws Exception {
        //Example
        final Table t = table("student");
        final StrColumn lastName = t.str("lastName");
        final IntColumn age = t.number("age");

        final SqlQuery query = sqlQuery()
                .select(age)
                .from(t)
                .where(lastName.startsWith(cons("Lopez"))
                        .and(age.between(cons(18), cons(21)))
                        .and(age.lessThan(cons(18)).not()))
                .orderBy(age)
                .limit(5)
                .build();

        ConsoleVisitor consoleVisitor = new ConsoleVisitor();
        query.accept(consoleVisitor);

       // query.visit(System.out);
    }


    private static Table table(String table) { return new Table(table); }

    private static Condition condition() {
        return null;  //To change body of created methods use File | Settings | File Templates.
    }



}
