package methodHiding;

/*
Method hiding in Java occurs when a subclass defines a static method with the same signature (method name and parameter list)
as a static method in its superclass. When this happens, the method in the subclass "hides" the method in the superclass,
meaning that the subclass method will be invoked instead of the superclass method when called from the subclass
or any reference to the subclass type.
* */
public class MethodHiding {

    public static void main(String[] args) {

        Parent parent = new Parent();
        parent.letsGoForAWalk(); // yes my kid


        Child child = new Child();
        child.letsGoForAWalk(); // no dad

        //Method Hiding
        Parent parentRef = new Child();
        parentRef.letsGoForAWalk(); // yes my kid


    }
}

class Parent {

    static void letsGoForAWalk() {
        System.out.println("Yes My Kid");
    }
}

class Child extends Parent {

    static void letsGoForAWalk() {
        System.out.println("No Dad ");
    }

}