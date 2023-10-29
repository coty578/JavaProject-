public class Account {
    private double balance;
    private String ownerName;

    // Constructor
    public Account(String name, double balance) {
        this.ownerName = name;
        this.balance = balance;
    }

    // Method to add money to the account
    public void add(double amount) {
        balance += amount;
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
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