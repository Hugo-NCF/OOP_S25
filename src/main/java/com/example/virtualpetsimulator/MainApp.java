package com.example.virtualpetsimulator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/virtualpetsimulator/PetLayout.fxml"));
        stage.setTitle("Virtual Pet Simulator");
        stage.setScene(new Scene(root, 300, 200));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
