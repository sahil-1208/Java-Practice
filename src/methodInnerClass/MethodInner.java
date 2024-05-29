package methodInnerClass;

public class MethodInner {

    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();
        outerClass.outerMethod();


    }
}

class OuterClass {

    void outerMethod() {

        class InnerClass{

            void print(String name){
                System.out.println(name);
            }
        }
        InnerClass inner = new InnerClass();
        inner.print("Sahil");
    }

}

