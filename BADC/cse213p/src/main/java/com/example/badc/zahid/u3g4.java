package com.example.badc.zahid;

import com.example.badc.zahid.model.Feedback;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class u3g4 {

    @FXML private ComboBox<String> combobox;
    @FXML private TextField dateoffedback;
    @FXML private TextArea textfieldarea;

    private String urgency = "High";  // Default value
    @FXML
    private AnchorPane highradio;

    @FXML
    public void initialize() {
        // Populate feedback type ComboBox
        combobox.getItems().addAll("Complaint", "Suggestion", "Appreciation", "Other");

        // Default selection
        combobox.setValue("Complaint");
    }

    @FXML
    private void highradio() {
        urgency = "High";
    }

    @FXML
    private void lowradio() {
        urgency = "Low";
    }

    @FXML
    private void buttonadd() {
        String type = combobox.getValue();
        String date = dateoffedback.getText();
        String description = textfieldarea.getText();

        Feedback feedback = new Feedback(type, date, urgency, description);

        // You can now save this feedback object to a database or display it
        System.out.println("Feedback Submitted:");
        System.out.println("Type: " + feedback.getType());
        System.out.println("Date: " + feedback.getDate());
        System.out.println("Urgency: " + feedback.getUrgency());
        System.out.println("Description: " + feedback.getDescription());

        // Optional: Clear the form
        dateoffedback.clear();
        textfieldarea.clear();
        urgency = "High";
    }
}
