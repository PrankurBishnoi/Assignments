package Java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ConsumerSuppliers
{
    static int a = 10;
    public static void main(String[] args) {

        Consumer<Integer> c = (i) ->
        {
            System.out.println("Consumer : " + i);
        };
        c.accept(100);

        Supplier<Integer> s = () ->
        {
            System.out.println("Supplier : " + ConsumerSuppliers.a);
            return ConsumerSuppliers.a;
        };
        System.out.println(s.get());

        Predicate<Integer> p = (i) -> (i<20);
        System.out.println("Predicate 100 : " + p.test(100));

        Function<Integer,Integer> f = (i) ->
        {
            return i*10;
        };
        System.out.println("5*10 = " + f.apply(5));
    }
}
