package constructor.constructorChaining;

public class ChaningExmpl {

    public static void main(String[] args) {

        Sub sub = new Sub();

    }

}

class Super {

    Super() {
        System.out.println("Non Param Parent Constructor");   //1
    }

}

class Sub extends Super {

    Sub() {
        this(1);
        System.out.println("Non Param Child Constructor");   //4
    }

    Sub(int a) {

        this("Sahil");
        System.out.println("int Child Constructor");  //3

    }

    Sub(String name) {

        System.out.println("String Child Constructor");  //2
    }
}