import java.util.InputMismatchException;
class SalaryException extends Exception {
    public SalaryException() {
        super("Salary amount must be greater than zero");
    }
}

class Worker {
  private String name;
    private double salary;
    private static int counter = 0;

    public Worker(String name, double salary) {
        this.name = name;
        this.salary = salary;
        counter++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) throws SalaryException {
        if (salary < 0) {
            throw new SalaryException();
        }
        this.salary = salary;
    }

    public static int getWorkerCount() {
        return counter;
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Worker worker1 = new Worker("John", 5000);
            Worker worker2 = new Worker("Alice", -1000); 
            Worker worker3 = new Worker("rey", 7000);

            System.out.println("Total number of workers: " + Worker.getWorkerCount());
        } catch (InputMismatchException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}