package lambda;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaExmp {

    public static void main(String[] args) {

        Consumer<String> lambdaConsumer = (String s) -> System.out.println(s);
        lambdaConsumer.accept("Consumer Lambda");

        Supplier<String> lambdSupplier = () -> {return "Supplier Lambda";};
        System.out.println(lambdSupplier.get());

        Predicate<Integer> lambdaPredicate = (number) -> number % 2 == 0;
        System.out.println(lambdaPredicate.test(4));

        Function<String, Integer> lambdaFunction = (String s)-> {return  s.length();};
        System.out.println(lambdaFunction.apply("Sahil"));

        StudentRepository studentRepository = new StudentRepository();
        StudentService studentService = new StudentService(studentRepository);
        Student student = studentService.findStudent(2);
        System.out.println(student);

        System.out.println(studentService.findAllStudents());
        System.out.println(studentService.findByName("VIRAT"));
    }

}

class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student findStudent(Integer id){
        Stream<Student> studentStream = studentRepository.listOfStudents().filter(std -> std.getId().equals(id));
        Optional<Student> optionalStudent = studentStream.findFirst();
        if (optionalStudent.isPresent()){
            Student student = optionalStudent.get();
            return student;
        }
        return null;
    }

    public List<Student> findAllStudents(){
        return studentRepository.listOfStudents().collect(Collectors.toList());
    }

    public Student findByName(String name){
        Optional<Student> optionalStudent = studentRepository.listOfStudents()
                .filter(std -> std.getName().equalsIgnoreCase(name)).findFirst();
        if (optionalStudent.isPresent()){
            Student student = optionalStudent.get();
            return student;
        }
        return null;
    }


}

class StudentRepository {

    public Stream<Student> listOfStudents(){
        Stream<Student> studentStream = Stream.of(new Student(1, "Virat", 22), new Student(2, "Rohit", 22),
                new Student(3, "Shubman", 22), new Student(4, "Dhoni", 22));
    return studentStream;
    }

}


class Student {
    private Integer id;
    private String name;
    private Integer age;

    public Student() {
    }

    public Student(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

