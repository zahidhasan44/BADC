package com.example.badc.Hannan_Ashrafy;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import java.text.CollationElementIterator;

public class User1Goal2
{
    @javafx.fxml.FXML
    private TextField villageTextFied;

    @javafx.fxml.FXML
    private TextField emailTextField;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private DatePicker DOBdatePicker;
    @javafx.fxml.FXML
    private TextField contactTextField;
    @javafx.fxml.FXML
    private RadioButton maleRadioButton;
    @javafx.fxml.FXML
    private TextField NIDTextField;
    @javafx.fxml.FXML
    private RadioButton femaeRadioButton;

    @javafx.fxml.FXML
    private Label outputLabel;

    @javafx.fxml.FXML
    public void initialize() {

    }

    @javafx.fxml.FXML
    public void saveButtonOnclick(ActionEvent actionEvent) {

        if (nameTextField.getText().trim().isEmpty()){
            CollationElementIterator outputLab;
            outputLabel.setText("Please enter  name!");
            return;
        }
        if (emailTextField.getText().trim().isEmpty()){
            CollationElementIterator outputLab;
            outputLabel.setText("Please enter  email!");
            return;
        }
        if (contactTextField.getText().trim().isEmpty()){
            CollationElementIterator outputLab;
            outputLabel.setText("Please enter  contact!");
            return;
        }


        if (DOBdatePicker.getValue()==null){
            CollationElementIterator outputLab;
            outputLabel.setText("Please enter  date of birth!");
            return;
        }
    }
}