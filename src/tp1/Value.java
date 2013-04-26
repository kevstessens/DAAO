package tp1;

import com.sun.istack.internal.NotNull;

/**
 * Created with IntelliJ IDEA.
 * User: Martin
 * Date: 4/19/13
 * Time: 5:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class Value<T> {
    private T value;

    private Value(T val) {
        this.value = val;
    }

    public Value() {

    }

    public static Value<String> val(@NotNull String str) {
        return new Value<String>(str);
    }

    public static Value<Integer> val(@NotNull Integer integer) {
        return new Value<Integer>(integer);
    }
}
