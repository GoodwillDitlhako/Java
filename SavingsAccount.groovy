public class SavingsAccount extends Account implements InterestBearing {
    private double interestRate = 0.0005; // 0.05%

    public SavingsAccount(String accountNumber, String branch, double balance) {
        super(accountNumber, branch, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawals not allowed on Savings Account.");
    }
}