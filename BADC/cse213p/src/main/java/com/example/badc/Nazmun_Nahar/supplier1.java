package com.example.badc.Nazmun_Nahar;

import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class supplier1
{
    @javafx.fxml.FXML
    private RadioButton ApproveRadiobox;
    @javafx.fxml.FXML
    private TextField ContactInformationTextField;
    @javafx.fxml.FXML
    private RadioButton RejectRadiobox;
    @javafx.fxml.FXML
    private Label SupplierRegistrationLabel;
    @javafx.fxml.FXML
    private TextField AddressTextField;
    @javafx.fxml.FXML
    private ToggleGroup licenseToggleGroup;
    @javafx.fxml.FXML
    private TextField NameTextField;
    @javafx.fxml.FXML
    private TextField ProductSupplierTextField;
    @javafx.fxml.FXML
    private Label showError;
    ArrayList<Supplier> supplier1list = new ArrayList<>();
    @javafx.fxml.FXML
    public void initialize() {

    }

    @javafx.fxml.FXML
    public void RegisterOnAction(ActionEvent actionEvent) {
        String name = NameTextField.getText();
        String contact = ContactInformationTextField.getText();
        String address = AddressTextField.getText();
        String productSupplied = ProductSupplierTextField.getText();

        RadioButton selectedRadioButton = (RadioButton) licenseToggleGroup.getSelectedToggle();
        String licenseStatus = selectedRadioButton != null ? selectedRadioButton.getText() : null;


        if (name.isEmpty() || contact.isEmpty() || address.isEmpty() || productSupplied.isEmpty() || licenseStatus == null) {
            showError.setText("Please fill in all the fields and select the license status.");
            return;
        }


        Supplier newSupplier = new Supplier(name, contact, address, productSupplied, licenseStatus);

        supplier1list.add(newSupplier);

        if ("Approved".equals(licenseStatus)) {
            newSupplier.setApproved(true);
            showError.setText("Supplier registered successfully!");
        } else {
            showError.setText("Supplier business license not approved. Registration failed.");
        }
    }

    @javafx.fxml.FXML
    public void addToArrayListForSupplierOnAction(ActionEvent actionEvent) {
    }
}