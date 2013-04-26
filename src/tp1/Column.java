package tp1;


import tp1.visitor.ConsoleVisitor;
import tp1.visitor.QueryVisitor;
import tp1.visitor.Visitable;

import javax.management.Query;

public class Column<T> extends Value<T> implements Visitable {
    private final String columnName;

    public Column(String columnName){
        this.columnName = columnName;
    }

    public Condition isNull() {
        return null;
    }

    public Condition isNotNull() {
        return null;  //To change body of created methods use File | Settings | File Templates.
    }

    public String getName(){
        return columnName;
    }


    public String accept(QueryVisitor visitor){
       return visitor.visit(this);
    }
}
