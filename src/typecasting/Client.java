package typecasting;

public class Client {

    public static void main(String[] args) {

//        Idea ref = new Implementation();
        Person person = new Person();
        person.getAge();
        person.setAge(18);

        Employee employee = new Employee(); // Has-A relation Client class has a reference to Person class
        employee.setSalary(1000);
        employee.getSalary();

    }

    void calls() {
        Person person = new Person(); // Has-A relation Client class has a reference to Person class
        person.getAge();
        person.setAge(18);

        Employee employee = new Employee(); // Has-A relation Client class has a reference to Person class
        employee.setSalary(1000);
        employee.getSalary();

        employee.getAge(); // happens only when employee is a child of person

        Person implicitTypeCast = new Employee(); // Implicit type cast happens only when employee is a child of person

        Employee explicit = (Employee) implicitTypeCast; // explicit type cast happens only when employee is a child of person

        explicit.getSalary();

        Person parentRef = new Employee(); // only calls parent specific method declaration
    }

}

class Person {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Employee extends Person {
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}

class Encapsulation {

    private int data;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}

abstract class Idea {

    private int data; // variable data hiding

    // method abstraction
    public abstract int getData();

    public abstract void setData(int data);

    public abstract String process(int a);
}

class Implementation extends Idea {

    @Override
    public int getData() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void setData(int data) {
        // TODO Auto-generated method stub

    }

    @Override
    public String process(int a) {
        // TODO Auto-generated method stub
        return null;
    }

}
