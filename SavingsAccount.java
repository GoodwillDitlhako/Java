public class SavingsAccount extends Account implements Transportable, InterestBearing {
    private double interestRate;
    private String attribute2;
    
    public SavingsAccount(int accountNumber, double balance, String branch, 
                         double interestRate, String attribute2) {
        super(accountNumber, balance, branch);
        this.interestRate = interestRate;
        this.attribute2 = attribute2;
    }
    
    public double calculateInterest() {
        return balance * (interestRate / 100);
    }
    
    public boolean transfer(double amount, Account targetAccount) {
        if (amount <= getTransferLimit() && withdraw(amount)) {
            targetAccount.deposit(amount);
            return true;
        }
        return false;
    }
    
    public double getTransferLimit() {
        return 10000.00;
    }
    
    public void operation() {
        System.out.println("Savings operation executed");
    }
    
    public void operation20() {
        System.out.println("Savings operation20 executed");
    }
    
    public void operation30() {
        System.out.println("Savings operation30 executed");
    }
    
    public double getInterestRate() { return interestRate; }
    public String getAttribute2() { return attribute2; }
}