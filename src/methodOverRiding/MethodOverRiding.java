package methodOverRiding;


public class MethodOverRiding {

    public static void main(String[] args) {

        Parent parent = new Parent();
        parent.print();

        Child child = new Child();
        child.print();
        System.out.println("--------------------------------------");
        Parent parentRef = new Child();
        parentRef.print();

    }
}

class Parent {

    void print() {
        System.out.println("Hello I am Parent");
    }

    String message() {
        return "I have one Child";
    }
}

class Child extends Parent {

    // Method Overriding
    @Override
    void print() {
        System.out.println("Hello I am Child");
    }

    String message() {
        return " I am a Child Class";
    }
}