module com.example.temp_converter2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.temp_converter2 to javafx.fxml;
    exports com.example.temp_converter2;
}