package constructor;

public class App {

    static int staticVariable;
    int instanceVariable;

    public static void main(String[] args) {
        System.out.println(staticVariable);
        System.out.println(new App("Sahil",10).instanceVariable);

    }

    App() {
        System.out.println("non parameterized constructor");
    }

    App(int instanceVariable) {
        System.out.println("int Param Constructor");
        this.instanceVariable = instanceVariable;
    }

    App(String a) {
        System.out.println(a);
    }

    App(String a, int b) {
        System.out.println(a + "" + b);
    }

}
