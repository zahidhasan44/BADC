package com.example.badc.Nazmun_Nahar;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.util.ArrayList;

public class supplier2
{
    @javafx.fxml.FXML
    private TableColumn PriceColumn;
    @javafx.fxml.FXML
    private ComboBox ItemSuppliedCombobox;
    @javafx.fxml.FXML
    private RadioButton PendingPaymenrRadiobox;
    @javafx.fxml.FXML
    private TextArea ConfirmationMessageTextArea;
    @javafx.fxml.FXML
    private TextField SupplierIdTextField;
    @javafx.fxml.FXML
    private TableColumn QuantityColumn;
    @javafx.fxml.FXML
    private TableColumn ItemColumn;
    @javafx.fxml.FXML
    private DatePicker DOBDatePicker;
    @javafx.fxml.FXML
    private RadioButton PaidRadiobox;

    @javafx.fxml.FXML
    public void initialize() {
        ArrayList<Supplier> supplier2list = new ArrayList<>();
    }

    @javafx.fxml.FXML
    public void ConfirmOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void GenerateBillOnAction(ActionEvent actionEvent) {
    }
}