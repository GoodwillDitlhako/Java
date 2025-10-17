package boundary.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class TransactionController {
    
    @FXML private ComboBox<String> fromAccountCombo;
    @FXML private ComboBox<String> toAccountCombo;
    @FXML private TextField amountField;
    @FXML private TextArea outputArea;
    
    @FXML
    public void initialize() {
        // Initialize UI components with sample data
        fromAccountCombo.getItems().addAll("Savings Account #1001", "Cheque Account #1002", "Investment Account #1003");
        toAccountCombo.getItems().addAll("Savings Account #1001", "Cheque Account #1002", "Investment Account #1003");
    }
    
    @FXML
    private void handleDeposit() {
        // UI validation only
        if (fromAccountCombo.getValue() == null || amountField.getText().isEmpty()) {
            outputArea.setText("Error: Please select an account and enter amount");
            return;
        }
        
        // UI display only - no business logic
        outputArea.setText("Deposit request sent to business layer\n" +
                          "Account: " + fromAccountCombo.getValue() + "\n" +
                          "Amount: $" + amountField.getText() + "\n\n" + outputArea.getText());
        
        amountField.clear();
    }
    
    @FXML
    private void handleWithdraw() {
        // UI validation only
        if (fromAccountCombo.getValue() == null || amountField.getText().isEmpty()) {
            outputArea.setText("Error: Please select an account and enter amount");
            return;
        }
        
        // UI display only - no business logic
        outputArea.setText("Withdrawal request sent to business layer\n" +
                          "Account: " + fromAccountCombo.getValue() + "\n" +
                          "Amount: $" + amountField.getText() + "\n\n" + outputArea.getText());
        
        amountField.clear();
    }
    
    @FXML
    private void handleTransfer() {
        // UI validation only
        if (fromAccountCombo.getValue() == null || toAccountCombo.getValue() == null || amountField.getText().isEmpty()) {
            outputArea.setText("Error: Please select both accounts and enter amount");
            return;
        }
        
        // UI display only - no business logic
        outputArea.setText("Transfer request sent to business layer\n" +
                          "From: " + fromAccountCombo.getValue() + "\n" +
                          "To: " + toAccountCombo.getValue() + "\n" +
                          "Amount: $" + amountField.getText() + "\n\n" + outputArea.getText());
        
        amountField.clear();
    }
    
    @FXML
    private void handleBack() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../fxml/DashboardView.fxml"));
            Parent root = loader.load();
            
            Stage stage = (Stage) amountField.getScene().getWindow();
            stage.setScene(new Scene(root, 800, 600));
            stage.setTitle("Banking System - Dashboard");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
