package boundary.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AccountController {
    
    @FXML private ComboBox<String> accountTypeCombo;
    @FXML private TextField accountNumberField;
    @FXML private TextField balanceField;
    @FXML private TextField branchField;
    @FXML private TextArea outputArea;
    
    @FXML
    public void initialize() {
        // Initialize UI components only
        accountTypeCombo.getItems().addAll("Savings Account", "Investment Account", "Cheque Account");
        accountTypeCombo.setValue("Savings Account");
    }
    
    @FXML
    private void handleCreateAccount() {
        // UI validation only - no business logic
        if (accountNumberField.getText().isEmpty() || 
            balanceField.getText().isEmpty() || 
            branchField.getText().isEmpty()) {
            outputArea.setText("Error: Please fill in all required fields");
            return;
        }
        
        String accountType = accountTypeCombo.getValue();
        // Display UI message only - no business logic
        outputArea.setText("Account creation request sent to business layer\n" +
                          "Type: " + accountType + "\n" +
                          "Account #: " + accountNumberField.getText() + "\n" +
                          "Balance: $" + balanceField.getText() + "\n" +
                          "Branch: " + branchField.getText());
        
        // Clear fields (UI operation only)
        accountNumberField.clear();
        balanceField.clear();
        branchField.clear();
    }
    
    @FXML
    private void handleViewAccounts() {
        // UI action only - no business logic
        outputArea.setText("Requesting account list from business layer...\n" +
                          "This would display all accounts from the model");
    }
    
    @FXML
    private void handleBack() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../fxml/DashboardView.fxml"));
            Parent root = loader.load();
            
            Stage stage = (Stage) accountNumberField.getScene().getWindow();
            stage.setScene(new Scene(root, 800, 600));
            stage.setTitle("Banking System - Dashboard");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
