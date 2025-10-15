import java.time.LocalDate;

public class Transaction {
    private String transactionID;
    private LocalDate date;
    private double amount;
    private String type;

    public Transaction(String transactionID, double amount, String type) {
        this.transactionID = transactionID;
        this.amount = amount;
        this.type = type;
        this.date = LocalDate.now();
    }

    public void recordTransaction() {
        System.out.println("Transaction: " + type + " of " + amount + " on " + date);
    }
}