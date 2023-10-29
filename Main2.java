import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter an integer: ");
            int value = scanner.nextInt();
            System.out.println("You entered: " + value);
        } catch (InputMismatchException e) {
            System.out.println("Input Mismatch Exception: Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}