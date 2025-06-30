import java.util.ArrayList;

public class Account {
    protected String accountNumber;
    protected String accountHolderName;
    protected double balance;
    protected ArrayList<String> transactionHistory;

    public Account(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
        this.transactionHistory = new ArrayList<>();
    }

    public void deposit(double amount) {
        balance += amount;
        transactionHistory.add("Deposited: ₹" + amount);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            transactionHistory.add("Failed withdrawal: ₹" + amount + " (Insufficient Funds)");
        } else {
            balance -= amount;
            transactionHistory.add("Withdrawn: ₹" + amount);
        }
    }

    public double getBalance() {
        return balance;
    }

    public void printTransactionHistory() {
        System.out.println("Transaction history for " + accountHolderName + ":");
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }
}
