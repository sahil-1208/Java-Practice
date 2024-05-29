package methodOverLoading;

public class MethodOverLoading {
    public static void main(String[] args) {

        Student student = new Student();
        student.print("Sahil");
        student.print(35,9873244887l);
    }
}

class Student {

    void print(String name) {
        System.out.println(name);
    }

    void print(int rollNo,long mobileNo) {
        System.out.println(rollNo+" "+mobileNo);
    }
}