package boundary.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CustomerController {
    
    @FXML private TextField customerIdField;
    @FXML private TextField firstNameField;
    @FXML private TextField lastNameField;
    @FXML private TextField addressField;
    @FXML private TextArea outputArea;
    
    @FXML
    private void handleCreateCustomer() {
        // UI validation only
        if (customerIdField.getText().isEmpty() || firstNameField.getText().isEmpty()) {
            outputArea.setText("Please fill required fields");
            return;
        }
        
        outputArea.setText("Create customer UI action triggered\n" +
                          "Data would be sent to business layer");
    }
    
    @FXML
    private void handleViewCustomers() {
        outputArea.setText("View customers UI action triggered\n" +
                          "Would request data from business layer");
    }
    
    @FXML
    private void handleBack() {
        loadView("../fxml/DashboardView.fxml", "Dashboard");
    }
    
    private void loadView(String fxmlPath, String title) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
            Parent root = loader.load();
            
            Stage stage = (Stage) customerIdField.getScene().getWindow();
            stage.setScene(new Scene(root, 800, 600));
            stage.setTitle(title);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
