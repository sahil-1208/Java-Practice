package constructor.constructorChaining;

public class App {

    public static void main(String[] args) {
        new Child();
    }

}

class Parent {

    Parent() {
        // super(); -> Object class non param constructor()
        System.out.println("Parent");
    }
}

class Child extends Parent {

    // Constructor chaining
    Child() {
        // super(); -> Parent class non param constructor()
        // super() can be override by this(), which will call current class constructor
        this(5);
        System.out.println("Child");
    }

    Child(int a) {
        // super(); -> Parent class non param constructor()
        // super() can be override by this(), which will call current class constructor
        this("");
        System.out.println("int Child");
    }

    Child(String b) {
        // super(); -> Parent class non param constructor()
        System.out.println("String Child");
    }


}