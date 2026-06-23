package week1.Day3;

public class ATMMENU {
    private double balance;

    public ATMMENU(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds. Current balance: " + balance);
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        }
    }
    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
    public void exit() {
        System.out.println("Thank you for using the ATM. Goodbye!");
    }
    public void displayMenu() {
        System.out.println("ATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }
    public void performAction(int choice, double amount) {
        switch (choice) {
            case 1:
                checkBalance();
                break;
            case 2:
                deposit(amount);
                break;
            case 3:
                withdraw(amount);
                break;
            case 4:
                exit();
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option.");
        }
    }
    public static ValidationResult validateAmount(double amount) {
        if (amount < 0) {
            return new ValidationResult(false, "Amount cannot be negative. Please enter a positive value.");
        }
        return new ValidationResult(true, "Valid amount.");
    }

    @Override
    public String toString() {
        return "ATMMENU [balance=" + balance + ", toString()=" + super.toString() + "]";
    }
    
}
