<?xml version="1.0" encoding="UTF-8"?>

<?import javafx.geometry.Insets?>
<?import javafx.scene.control.Button?>
<?import javafx.scene.control.Label?>
<?import javafx.scene.layout.VBox?>
<?import javafx.scene.text.Font?>

<VBox alignment="CENTER" spacing="20.0" xmlns="http://javafx.com/javafx/11.0.1" xmlns:fx="http://javafx.com/fxml/1" fx:controller="boundary.controllers.DashboardController">
   <children>
      <Label text="Banking System Dashboard">
         <font>
            <Font name="System Bold" size="20.0" />
         </font>
      </Label>
      <VBox spacing="10.0" alignment="CENTER">
         <children>
            <Button fx:id="customerButton" mnemonicParsing="false" onAction="#handleCustomerManagement" text="Customer Management" />
            <Button fx:id="accountButton" mnemonicParsing="false" onAction="#handleAccountManagement" text="Account Management" />
            <Button fx:id="transactionButton" mnemonicParsing="false" onAction="#handleTransactions" text="Transactions" />
            <Button fx:id="logoutButton" mnemonicParsing="false" onAction="#handleLogout" text="Logout" />
         </children>
      </VBox>
   </children>
   <padding>
      <Insets bottom="20.0" left="20.0" right="20.0" top="20.0" />
   </padding>
</VBox>
