package tp1;


import static tp1.Const.cons;
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
                        .and(age.between(cons(18), cons(21))))
                .orderBy(age)
                .limit(5)
                .build();

        query.visit(System.out);
    }


    private static Table table(String student) {
        return null;  //To change body of created methods use File | Settings | File Templates.
    }

    private static Condition condition(Comparation comparation) {
        return null;  //To change body of created methods use File | Settings | File Templates.
    }

    private static Comparation comparation(String s) {
        return null;  //To change body of created methods use File | Settings | File Templates.
    }

    protected static Condition condition(String s) {
        return null;

    }

}
