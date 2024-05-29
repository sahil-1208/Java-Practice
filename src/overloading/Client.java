package overloading;

public class Client {

    public static void main(String[] args) {

        Validate validate = new Validate();
        //validate.process(4);
    }
}
class Validate{

    void process(int a){
        System.out.println(a);
    }

    void process(String a){
        System.out.println(a);
    }
}
