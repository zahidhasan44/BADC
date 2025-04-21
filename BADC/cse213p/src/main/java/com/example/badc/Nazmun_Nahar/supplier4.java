package com.example.badc.Nazmun_Nahar;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class supplier4
{
    @javafx.fxml.FXML
    private TextField ProductIdTextField;
    @javafx.fxml.FXML
    private TextArea StockQuantityTextArea;
    public final ArrayList<CheckStock> checkStocks = new ArrayList();
    @javafx.fxml.FXML
    public void initialize() {
        ArrayList<Supplier> supplier4list = new ArrayList<>();
        CheckStock checkStock = new CheckStock(123, 50, 60);
    }

    @javafx.fxml.FXML
    public void CheckStockOnAction(ActionEvent actionEvent) {

    }
}