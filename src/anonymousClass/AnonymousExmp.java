package anonymousClass;

public class AnonymousExmp {
    public static void main(String[] args) {

        AnonymousClass anonymousClass = new AnonymousClass();
        anonymousClass.print();

    }

}


class AnonymousClass extends User {

    @Override
    void print() {
        System.out.println("Hello i am Anonumous class");
    }
}

abstract class User {

    abstract void print();

}
