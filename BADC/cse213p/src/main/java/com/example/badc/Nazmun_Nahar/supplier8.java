package com.example.badc.Nazmun_Nahar;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;

import java.util.ArrayList;

public class supplier8
{
    @javafx.fxml.FXML
    private TableColumn ProductIdColumn;
    @javafx.fxml.FXML
    private TableColumn CurrentStockColumn;
    @javafx.fxml.FXML
    private TableColumn ProductNameColumn;

    @javafx.fxml.FXML
    public void initialize() {
        ArrayList<Supplier> supplier8list = new ArrayList<>();
    }

    @javafx.fxml.FXML
    public void DownloadReportOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void GenerateStockReportButton(ActionEvent actionEvent) {
    }
}