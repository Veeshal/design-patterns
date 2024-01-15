package sample.creational.abstractfactory;

import java.util.Arrays;
import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class AbstractFactoryApplication implements Cloneable {
    public static void main(String[] args) {
//        var map = new HashMap<String, Supplier<String>>();
//        map.put("abc", () -> "Some Vlaue");
//
//        var map3 = new HashMap<String, BiConsumer<String, Integer>>();
//        map3.put("abc", (s, integer) -> integer = Integer.parseInt(s));
//
//        map3.get("abc").accept("1", new Integer(0));
//
//        var map2 = new HashMap<String, BiFunction<Integer, Long, String>>();
//        map2.put("abc", (o, o2) -> {
//            System.out.println("args = " + Arrays.deepToString(args));
//            return "def";
//        });
//

        System.out.println(54 ^ 1);

    }

    @Override
    public AbstractFactoryApplication clone() {
        try {
            return (AbstractFactoryApplication) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
