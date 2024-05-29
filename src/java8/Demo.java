package java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo {

    public static void main(String[] args) {

        LambdaExample lambdaExample = new LambdaExample();
        lambdaExample.lambdaExmp();

        System.out.println();

        forEach((str) -> System.out.println(str));

        map((str) -> str.length());

        filter((no) -> no % 2 == 0);

        get(()->"Get Method");
    }

    static void forEach(Consumer<String> consumer) {
        consumer.accept("For Each Method");
    }

    static void map(Function<String, Integer> function) {
        Integer length = function.apply("Map Method");
        System.out.println(length);
    }

    static void filter(Predicate<Integer> predicate) {
        System.out.println(predicate.test(6));
    }

    static void get(Supplier<String> supplier) {
        System.out.println(supplier.get());
    }


}

class LambdaExample {

    void lambdaExmp() {

        Runnable runnablelambda = () -> System.out.println("Runnable Lambda");
        runnablelambda.run();

        Consumer<Integer> integerConsumer = (no) -> System.out.println(no);
        integerConsumer.accept(7);

        Supplier<String> stringSupplier = () -> "Hello I am Supplier Lmabda";
        System.out.println(stringSupplier.get());

        Predicate<Integer> integerPredicate = (number) -> number % 2 == 0;
        System.out.println(integerPredicate.test(5));

        Function<Double, Double> marksFunction = (marks) -> (marks / 500) * 100;
        System.out.println(marksFunction.apply(243.0) + "%");
    }

}
