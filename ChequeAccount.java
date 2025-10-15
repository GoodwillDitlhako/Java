public class ChequeAccount extends Account {
    private String employerName;
    private String employerAddress;

    public ChequeAccount(String accountNumber, String branch, double balance, 
                         String employerName, String employerAddress) {
        super(accountNumber, branch, balance);
        this.employerName = employerName;
        this.employerAddress = employerAddress;
    }

    @Override
    public double calculateInterest() {
        return 0; // Cheque accounts do not earn interest
    }
}