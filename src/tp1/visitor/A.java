package tp1.visitor;

import java.util.Collections;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * User: keevstessens
 * Date: 26/04/13
 * Time: 16:05
 * To change this template use File | Settings | File Templates.
 */
public class A implements Comparable<A>{

    public static class B extends A {

    }

    public static class C extends A{


    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        a.compareTo(a);
        b.compareTo(b);
        c.compareTo(b);





    }


    private static boolean sort(Comparator<A> comparator){
        Collections.sort();
    }

    @Override
    public int compareTo(A o) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
