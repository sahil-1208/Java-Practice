package association;
/*Composition is a stronger form of aggregation in which one class owns another class and
can access all its data and behavior , so there is a tight coupling between two classes
* */
public class Composition {

    public static void main(String[] args) {

        Laptop laptop = new Laptop("HP", "Intel i5", 4);

        System.out.println("Laptop Name : " + laptop.getName() + " Cpu Brand : " + laptop.getBrand() +
                " No of Cores : " + laptop.getNumberOfCores());
    }
}

class Laptop {
    private String name;
    private CPU cpu;

    public Laptop(String name, String brand, int numberOfCores) {
        this.name = name;
        this.cpu = new CPU(brand, numberOfCores);
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return cpu.getBrand();
    }

    public int getNumberOfCores() {
        return cpu.getNumberOfCores();
    }
}

class CPU {
    private String brand;
    private int numberOfCores;

    public CPU(String brand, int numberOfCores) {
        this.brand = brand;
        this.numberOfCores = numberOfCores;
    }

    public String getBrand() {
        return brand;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }
}
