package anonymous;

@FunctionalInterface
public interface MyConsumer {
    void accept(String name);
}

@FunctionalInterface
interface MySuppler {

    String get();
}

@FunctionalInterface
interface MyFunction {
    int apply(String name);
}

@FunctionalInterface
interface MyPredicate {
    boolean test(String name);
}