module com.example.virtualpetsimulator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.virtualpetsimulator to javafx.fxml;
    exports com.example.virtualpetsimulator;
}