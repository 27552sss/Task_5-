public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolderName, double interestRate) {
        super(accountNumber, accountHolderName);
        this.interestRate = interestRate;
    }

    // Overriding withdraw with additional rule
    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            transactionHistory.add("Failed withdrawal from Savings: ₹" + amount);
        } else {
            balance -= amount;
            transactionHistory.add("Savings Withdrawn: ₹" + amount);
        }
    }

    public void addInterest() {
        double interest = balance * interestRate / 100;
        deposit(interest);
        transactionHistory.add("Interest Added: ₹" + interest);
    }
}
