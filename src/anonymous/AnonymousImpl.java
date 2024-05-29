package anonymous;

public class AnonymousImpl {

    public static void main(String[] args) {

        MyConsumer myConsumer = new MyConsumer() {
            @Override
            public void accept(String name) {
                System.out.println(name);
            }
        };
        myConsumer.accept("Anonymous Consumer");

        MySuppler mySuppler = new MySuppler() {
            @Override
            public String get() {
                return "Hello I am anonymous Suppler";
            }
        };
        System.out.println(mySuppler.get());

        MyFunction myFunction = new MyFunction() {
            @Override
            public int apply(String name) {
                return name.length();
            }
        };
        System.out.println(myFunction.apply("Sahil"));

        MyPredicate myPredicate = new MyPredicate() {
            @Override
            public boolean test(String name) {
                return name.equals("Sahil");
            }
        };
        System.out.println(myPredicate.test("Sahil"));
    }

}
