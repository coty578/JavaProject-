import java.util.Scanner;

public class Worker {
    String name;
    int socialSecurityNumber;
    float wage;
    int workinghours;

    public Worker(String name, int socialSecurityNumber, float wage, int workinghours) {
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.wage = wage;
        this.workinghours = workinghours;
    }

    public void displayInfo() {
        System.out.println("name: " + name + ", Social Security Number: " + socialSecurityNumber);
    }

    public void displaySalary() {
        float salary = wage * workinghours;
        System.out.println("salary :" + salary);

    }

    public static void main(String[] args) {
        Worker worker1 = new Worker("rey", 15345678, 16.56f, 50);
        worker1.displayInfo();
        worker1.displaySalary();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the worker's name :");
        String name = scanner.nextLine();

        System.out.println("Enter the worker's Social Security Number: ");
        int socialSecurityNumber = scanner.nextInt();

        System.out.println("Enter the worker's hourly wage: ");
        float wage = scanner.nextFloat();

        System.out.println("Enter the number of hours worked: ");
        int hours = scanner.nextInt();

        Worker worker2 = new Worker(name, socialSecurityNumber, wage, hours);

        worker2.displayInfo();
        worker2.displaySalary();
    }
}