package com.example.badc.Hannan_Ashrafy;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.text.Text;

import java.text.CollationElementIterator;
import java.util.ArrayList;

public class User2goal1
{
    @javafx.fxml.FXML
    private Text admintext;
    @javafx.fxml.FXML
    private TextField phoneNumberTextFiledd;
    @javafx.fxml.FXML
    private Text DOBText;
    @javafx.fxml.FXML
    private Text emailText;
    @javafx.fxml.FXML
    private TextField nameTextFiled;
    @javafx.fxml.FXML
    private Text nameText;
    @javafx.fxml.FXML
    private Text phoneNumberText;
    @javafx.fxml.FXML
    private TextField DobTextField;
    @javafx.fxml.FXML
    private TextField EmailTextField;
    @javafx.fxml.FXML
    private TableColumn <Admin, String>employTableColumn;
    @javafx.fxml.FXML
    private Text genderText;
    @javafx.fxml.FXML
    private TableColumn<Admin,String> farmerTableColumn;
    @javafx.fxml.FXML
    private TableColumn <Admin, String>adminTableColumn;
    @javafx.fxml.FXML
    private TableColumn <Admin , String> managementTableColumn;
    @javafx.fxml.FXML
    private ComboBox <String>genderComboBox;
    @javafx.fxml.FXML
    private TableView<Admin> displayTableView;
    @javafx.fxml.FXML
    private Label outputlabel;

    @javafx.fxml.FXML
    public void initialize() {

        // ComboBox Setup
        genderComboBox.getItems().setAll("male", "female", "trans", "others");

    }



    ArrayList<Admin> dataPackages = new ArrayList<>();
    ArrayList<Admin> filteredDataPackages = new ArrayList<>();

    @javafx.fxml.FXML
    public void saveButtonOnClick(ActionEvent actionEvent) {

        if (nameTextFiled.getText().trim().isEmpty()) {
            CollationElementIterator outputLab;
            outputlabel.setText("Please enter  name!");
            return;
        }

        if (EmailTextField.getText().trim().isEmpty()) {
            CollationElementIterator outputLabel;
            outputlabel.setText("Please enter email!");
            return;
        }
        if (EmailTextField.getText().trim().isEmpty()) {
            CollationElementIterator outputLabel;
            outputlabel.setText("Please enter email!");
            return;
        }

    }
}