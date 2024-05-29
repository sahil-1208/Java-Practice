package day1;

public class Processing {

    public Student createStudent(String name, int rollno, Gender gender) {

        Student student = new Student();
        student.setName(name);
        student.setRollno(rollno);
        student.setGender(gender);

        return student;
    }

    public void display(Student student) {

        System.out.println(student.getName() + " " + student.getRollno() + " " + student.getGender());
    }

}
