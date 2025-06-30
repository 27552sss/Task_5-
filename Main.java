public class Main {
    public static void main(String[] args) {
        SavingsAccount myAccount = new SavingsAccount("SB001", "Kumar", 5.0);

        myAccount.deposit(1000);
        myAccount.withdraw(300);
        myAccount.addInterest();

        System.out.println("Current Balance: ₹" + myAccount.getBalance());
        myAccount.printTransactionHistory();
    }
}
