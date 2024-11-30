import java.util.Scanner;

class Account {
    private double balance;

    // Constructor with no argument
    public Account() {
        this.balance = 0;
    }

    // Constructor with two arguments
    public Account(double balance) {
        this.balance = balance;
    }

    // Method to deposit the amount to the account
    public void deposit(double amount) {
        this.balance += amount;
    }

    // Method to withdraw the amount from the account
    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Insufficient balance.");
        } else {
            this.balance -= amount;
        }
    }

    // Method to display the Balance
    public void displayBalance() {
        System.out.println("Balance: " + this.balance);
    }
}

public class AccountMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdraw amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.displayBalance();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}