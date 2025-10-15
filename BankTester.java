public class BankTester {
    public static void main(String[] args) {

        // Create Bank
        Bank bank = new Bank("Bank Gaborone", "Gaborone");

        // Create Customer
        Customer customer = new Customer("C001", "Tlamelo", "Jori", "Gaborone");

        // Create Accounts
        SavingsAccount savings = new SavingsAccount("SA001", "Gaborone", 1000);
        InvestmentAccount investment = new InvestmentAccount("IA001", "Gaborone", 800);
        ChequeAccount cheque = new ChequeAccount("CA001", "Gaborone", 2000, "ABC Ltd", "Main Mall");

        // Open Accounts for Customer
        bank.openAccount(customer, savings);
        bank.openAccount(customer, investment);
        bank.openAccount(customer, cheque);

        // Deposits
        System.out.println("\n--- Deposit Operations ---");
        savings.deposit(500);
        investment.deposit(1000);
        cheque.deposit(1500);

        // Withdrawals
        System.out.println("\n--- Withdrawal Operations ---");
        investment.withdraw(300);
        cheque.withdraw(1000);
        savings.withdraw(200); // should not allow

        // Interest Calculations
        System.out.println("\n--- Interest Calculations ---");
        System.out.println("Savings Account Interest: " + savings.calculateInterest());
        System.out.println("Investment Account Interest: " + investment.calculateInterest());
        System.out.println("Cheque Account Interest: " + cheque.calculateInterest());

        // Transfers
        System.out.println("\n--- Transfer Operation ---");
        investment.transfer(investment, cheque, 500);

        // Transactions
        System.out.println("\n--- Recording Transactions ---");
        Transaction t1 = new Transaction("T001", 1000, "Deposit");
        t1.recordTransaction();

        Transaction t2 = new Transaction("T002", 500, "Withdrawal");
        t2.recordTransaction();

        // End of test
        System.out.println("\n--- Test Completed Successfully ---");
    }
}