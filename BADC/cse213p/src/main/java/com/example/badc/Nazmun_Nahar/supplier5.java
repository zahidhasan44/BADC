package com.example.badc.Nazmun_Nahar;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class supplier5
{
    @javafx.fxml.FXML
    private TextField ProductIdTextField;
    @javafx.fxml.FXML
    private TextField PriceTextField;
    @javafx.fxml.FXML
    private TextField InitialStockTextField;
    @javafx.fxml.FXML
    private TextField NameTextField;
    @javafx.fxml.FXML
    private Label NewProductAddedLabel;

    @javafx.fxml.FXML
    public void initialize() {
        ArrayList<Supplier> supplier5list = new ArrayList<>();
    }

    @javafx.fxml.FXML
    public void AddButtonONAction(ActionEvent actionEvent) {
    }
}