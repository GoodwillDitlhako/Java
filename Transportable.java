public interface Transportable {
    boolean transfer(double amount, Account targetAccount);
    double getTransferLimit();
}