package com.example.badc.Nazmun_Nahar;

import com.example.badc.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;

public class Login
{
    @javafx.fxml.FXML
    private TextField userIDTextField;
    @javafx.fxml.FXML
    private PasswordField passwordPasswordField;
    ArrayList<String> loginAttempts = new ArrayList<>();



    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void continueButtonOnAction(ActionEvent actionEvent) throws IOException {
        String userID = userIDTextField.getText();
        String password = passwordPasswordField.getText();

        // Store login attempt
        loginAttempts.add("ID: " + userID + ", Password: " + password);

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        Scene scene;
        FXMLLoader fxmlLoader;
        Parent root;

        if (userID.equals("2321042") && password.equals("rongdhup")) {
            // supplier Dashboard
            fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Nazmun_Nahar/SupplierDashboard.fxml"));
            root = fxmlLoader.load();
            scene = new Scene(root, 800, 400);
            stage.setScene(scene);
            stage.setTitle("Security Dashboard");
            stage.show();

        } else if (userID.equals("2321042") && password.equals("rongdhup100")) {
            // Transporter Dashboard
            fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Nazmun_Nahar/TransprterDashboard.fxml"));
            root = fxmlLoader.load();

            // Set optional data to controller
            SupplierDashboardController controller = fxmlLoader.getController();
            controller.setter("Nazmun_Nahar", "2321042");

            scene = new Scene(root, 800, 400);
            stage.setScene(scene);
            stage.setTitle("Dashboard");
            stage.show();
    }
}