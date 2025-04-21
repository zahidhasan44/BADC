package com.example.badc.Nazmun_Nahar;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.util.ArrayList;

public class supplier3
{
    @javafx.fxml.FXML
    private ToggleGroup stockToggleGroup;
    @javafx.fxml.FXML
    private TextField DescriptionTextField;
    @javafx.fxml.FXML
    private RadioButton InStockRadioButton;
    @javafx.fxml.FXML
    private TextField NameTextField;
    @javafx.fxml.FXML
    private RadioButton OutOfStockRadioButton;
    @javafx.fxml.FXML
    private ComboBox PriceCombobox;
    @javafx.fxml.FXML
    private TextField ProductTextField;
    @javafx.fxml.FXML
    private TextArea ProductupdatedsuccessfullyTextArea;

    @javafx.fxml.FXML
    public void initialize() {
        ArrayList<Supplier> supplier3list = new ArrayList<>();
    }

    @javafx.fxml.FXML
    public void UpdateProductOnAction(ActionEvent actionEvent) {
    }
}