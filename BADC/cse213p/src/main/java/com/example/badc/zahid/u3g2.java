package com.example.badc.zahid;

import com.example.badc.zahid.model.CropItem;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class u3g2 {

    @FXML private TextField usernametextfield;
    @FXML private TextField passwordtextfield;
    @FXML private ComboBox<String> eventtypecombobox;

    @FXML private TableView<CropItem> tableView;
    @FXML private TableColumn<CropItem, String> Categorycolumn;
    @FXML private TableColumn<CropItem, String> Namecolumn;
    @FXML private TableColumn<CropItem, String> Detailscolumn;
    @FXML private TableColumn<CropItem, Integer> Quantitycolumn;
    @FXML private TableColumn<CropItem, Double> Pricecolumn;

    @FXML private TextField currentcroprextfield;
    @FXML private RadioButton cropyesradio;
    @FXML private RadioButton cropnoradio;
    @FXML private DatePicker deliverydatepicker;
    @FXML private TextField farmerfield;

    private ObservableList<CropItem> cropItemList = FXCollections.observableArrayList();

    @FXML
    private void initialize() {
        // Populate event types
        eventtypecombobox.getItems().addAll("Harvest", "Fertilizer", "Irrigation");

        // Setup table columns
        Categorycolumn.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getCategory()));
        Namecolumn.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getName()));
        Detailscolumn.setCellValueFactory(cellData -> new javafx.beans.property.SimpleStringProperty(cellData.getValue().getDetails()));
        Quantitycolumn.setCellValueFactory(cellData -> new javafx.beans.property.SimpleIntegerProperty(cellData.getValue().getQuantity()).asObject());
        Pricecolumn.setCellValueFactory(cellData -> new javafx.beans.property.SimpleDoubleProperty(cellData.getValue().getPrice()).asObject());

        // Sample data
        cropItemList.add(new CropItem("Vegetable", "Tomato", "Organic", 20, 250.0));
        cropItemList.add(new CropItem("Fruit", "Mango", "Seasonal", 15, 500.0));

        tableView.setItems(cropItemList);
    }

    @FXML
    private void submitrequestButton() {
        String username = usernametextfield.getText();
        String password = passwordtextfield.getText();
        String event = eventtypecombobox.getValue();
        String currentCrop = currentcroprextfield.getText();
        String deliveryDate = (deliverydatepicker.getValue() != null) ? deliverydatepicker.getValue().toString() : "Not selected";
        String farmerDetails = farmerfield.getText();
        boolean hasCrop = cropyesradio.isSelected();

        System.out.println("Submitting request:");
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Event: " + event);
        System.out.println("Current Crop: " + currentCrop + ", Has Crop: " + hasCrop);
        System.out.println("Delivery Date: " + deliveryDate);
        System.out.println("Farmer Details: " + farmerDetails);

        // Further logic can go here (e.g., saving to database)
    }

    @FXML
    private void radiovutton() {
        System.out.println("CropYesRadio selected");
    }

    @FXML
    private void cropnoradio() {
        System.out.println("CropNoRadio selected");
    }
}
