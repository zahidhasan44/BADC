package com.example.badc.zahid;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;

import java.awt.*;

public class u3g1 {
    @javafx.fxml.FXML
    private TableColumn<InspectionReport, String> colReportId;
    @javafx.fxml.FXML
    private TextField textgender;
    @javafx.fxml.FXML
    private RadioButton rbfemale;
    @javafx.fxml.FXML
    private RadioButton rbMale;
    @javafx.fxml.FXML
    private TableView<InspectionReport> tableInspectionReports;
    @javafx.fxml.FXML
    private TextField txtVehicleInfo;
    @javafx.fxml.FXML
    private TextField textautobom;
    @javafx.fxml.FXML
    private TextField txtContactNo;
    @javafx.fxml.FXML
    private TextField textdateofbirth;
    @javafx.fxml.FXML
    private TableColumn<InspectionReport, String> colReportStatus;
    @javafx.fxml.FXML
    private TextField txtEmail;
    @javafx.fxml.FXML
    private TableColumn<InspectionReport, String> colReportDate;
    @javafx.fxml.FXML
    private TextField txtFullName;

    private ToggleGroup genderGroup;
    @javafx.fxml.FXML
    public void initialize() {
        // Grouping radio buttons
        genderGroup = new ToggleGroup();
        rbMale.setToggleGroup(genderGroup);
        rbfemale.setToggleGroup(genderGroup);

        // Listener for gender field
        genderGroup.selectedToggleProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal != null) {
                RadioButton selected = (RadioButton) newVal;
                textgender.setText(selected.getText());
            }
        });

        // TableView setup
        colReportId.setCellValueFactory(new PropertyValueFactory<>("reportId"));
        colReportDate.setCellValueFactory(new PropertyValueFactory<>("reportDate"));
        colReportStatus.setCellValueFactory(new PropertyValueFactory<>("reportStatus"));

        ObservableList<InspectionReport> sampleReports = FXCollections.observableArrayList(
                new InspectionReport("IR001", "2024-05-01", "Completed"),
                new InspectionReport("IR002", "2024-06-15", "Pending")
        );

        tableInspectionReports.setItems(sampleReports);
    }
    }