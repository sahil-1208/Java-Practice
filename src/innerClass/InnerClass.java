package innerClass;

public class InnerClass {

    public static void main(String[] args) {

        Outer.Inner innerClass = new Outer().new Inner();
        innerClass.print("Sahil");
    }

}

class Outer {

    class Inner {

        void print(String name){
            System.out.println(name);
        }
    }
}


