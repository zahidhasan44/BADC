module com.example.badc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
<<<<<<< HEAD
    requires java.xml.crypto;
=======
>>>>>>> origin/main


    opens com.example.badc to javafx.fxml;
    exports com.example.badc;
}