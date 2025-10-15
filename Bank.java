import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String bankName;
    private String branchLocation;
    private List<Customer> customers;

    public Bank(String bankName, String branchLocation) {
        this.bankName = bankName;
        this.branchLocation = branchLocation;
        this.customers = new ArrayList<>();
    }

    public void openAccount(Customer customer, Account account) {
        customer.addAccount(account);
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
        System.out.println("Account opened successfully for " + customer.getFullName());
    }

    public void closeAccount(Customer customer, Account account) {
        customer.getAccounts().remove(account);
        System.out.println("Account closed for " + customer.getFullName());
    }

    public void login() {
        System.out.println("User logged in.");
    }

    public void logout() {
        System.out.println("User logged out.");
    }
}