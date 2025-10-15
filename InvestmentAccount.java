public class InvestmentAccount extends Account implements InterestBearing, Transferable {
    private double interestRate = 0.05; // 5%

    public InvestmentAccount(String accountNumber, String branch, double initialDeposit) {
        super(accountNumber, branch, initialDeposit >= 500 ? initialDeposit : 500);
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }

    @Override
    public void transfer(Account fromAccount, Account toAccount, double amount) {
        if (fromAccount.getBalance() >= amount) {
            fromAccount.withdraw(amount);
            toAccount.deposit(amount);
            System.out.println("Transferred " + amount + " from " + fromAccount.getAccountNumber()
                    + " to " + toAccount.getAccountNumber());
        } else {
            System.out.println("Transfer failed: insufficient funds.");
        }
    }
}