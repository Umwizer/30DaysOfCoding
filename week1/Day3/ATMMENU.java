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

    @Override
    public String toString() {
        return "ATMMENU [balance=" + balance + ", toString()=" + super.toString() + "]";
    }
    
}
