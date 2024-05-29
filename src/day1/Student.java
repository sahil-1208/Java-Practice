package day1;

public class Student {

    private int rollno;
    private String name;
    private Gender gender;

    public Student() {
    }

    public Student(int rollno, String name, Gender gender) {
        this.rollno = rollno;
        this.name = name;
        this.gender = gender;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
