package constructor.thisAndsuper;

public class App {

    public static void main(String[] args) {
        new Child();
    }

}

class Parent {

    Parent() {
        System.out.println("Parent");
    }
}

class Child extends Parent {

    int a, b, c;

    // Constructor chaining
    Child() {

        this(5);
      //  this("demo");
        // this(5); // not possible, constructor call can be only one
        this.a = 5;
        this.b = 4;
        this.c = 2;
        this.abc();
        this.message();
        System.out.println("Child");
    }

    Child(int a) {
        this("sahil");
        System.out.println("int Child");
    }

    Child(String b) {
        System.out.println("String Child");
    }

    void abc() {

    }

    String message(){
        return "Hello";
    }
}
