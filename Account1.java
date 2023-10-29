import java.util.Scanner;

public class Account {
    private double balance;
    private String ownerName;
    private int withdrawalAttempts = 0;
    private final int maxWithdrawalAttempts = 3;
    private final int correctPass = 1234;

    // Constructor
    public Account(String name, double balance) {
        this.ownerName = name;
        this.balance = balance;
    }

    // Method to add money to the account
    public void add(double amount) {
        balance += amount;
    }

    // Method to withdraw money from the account with password verification
    public void withdraw(double amount) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the 4-digit pass: ");
        int enteredPass = input.nextInt();

        if (enteredPass == correctPass) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawal successful. Your new balance is: " + balance);
            } else {
                System.out.println("Insufficient funds.");
            }
        } else {
            System.out.println("Incorrect password. Please try again.");
            withdrawalAttempts++;
            withdraw(amount); // Recursively try again
        }
        if (withdrawalAttempts >= maxWithdrawalAttempts) {
            System.out.println("Your account has been blocked. Please try again later.");
            return;
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }

    // Method to set the owner's name
    public void setOwnerName(String name) {
        ownerName = name;
    }

    // Method to get the owner's name
    public String getOwnerName() {
        return ownerName;
    }
}