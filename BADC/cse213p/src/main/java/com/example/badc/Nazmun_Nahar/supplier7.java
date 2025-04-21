package com.example.badc.Nazmun_Nahar;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class supplier7
{
    @javafx.fxml.FXML
    private TextField ProductIdTextField;
    @javafx.fxml.FXML
    private TableColumn OrderDateColumn;
    @javafx.fxml.FXML
    private TableColumn QuantityColumn;
    @javafx.fxml.FXML
    private TableColumn ProductNameColumn;

    @javafx.fxml.FXML
    public void initialize() {
        ArrayList<Supplier> supplier7list = new ArrayList<>();
    }

    @javafx.fxml.FXML
    public void ViewOrdersOnAction(ActionEvent actionEvent) {
    }
}