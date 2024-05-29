package association;
/*
* Aggregation represents a "has-a" relationship between two classes,
* It is a type of relationship where one class is used by another class but does not own it
* So it is a weaker form of association, and there is loose coupling
 * */
public class Aggregation {

    public static void main(String[] args) {

        Address address = new Address("Mahavir Nagar", "Faridabad", "Haryana", 121002l);
        Student studentName = new Student("Sahil", address);

        System.out.println("Student Name : "+ studentName.getName());
        System.out.println(" Address : " + studentName.getAddress());
    }

}

class Student {
    private String name;
    private Address address;

    public Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
}

class Address {

    private String street, city, state;
    private Long pinCode;

    public Address(String street, String city, String state, Long pinCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Long getPinCode() {
        return pinCode;
    }

    public void setPinCode(Long pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' + ", city='" + city + '\'' + ", state='" + state + '\'' +
                ", pinCode=" + pinCode + '}';
    }
}