package nestedClass;

public  class NestedClassExmp{

    public static void main(String[] args) {

        Outer.Inner nestedClass = new Outer(). new Inner();
        nestedClass.printName("Sahil");

    }

}


 class Outer {

     class Inner {

        void printName(String name) {
            System.out.println(name);
        }

    }
}
