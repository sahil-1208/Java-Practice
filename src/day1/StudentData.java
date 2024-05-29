package day1;

public class StudentData {

    public static void main(String[] args) {

        Processing processing = new Processing();
       // Student simran = processing.createStudent("Simran",34,Gender.FEMALE);
        Student areeka = processing.createStudent("Areeka",12,Gender.FEMALE);
        Student sahil = processing.createStudent("Sahil",21,Gender.MALE);


       // processing.display(simran);
        processing.display(areeka);
        processing.display(sahil);
    }
}
