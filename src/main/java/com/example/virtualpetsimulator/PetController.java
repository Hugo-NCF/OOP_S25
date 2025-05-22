package com.example.virtualpetsimulator;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.util.Duration;

public class PetController {
    @FXML private Label statusLabel;
    @FXML private Label messageLabel;
    @FXML private Button feedButton;
    @FXML private Button playButton;

    private Pet pet;

    @FXML
    public void initialize() {
        pet = new Dog(); // Change to new Cat() if you want a Cat
        updateUI("Welcome!");

        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(2), e -> {
            pet.tick();
            if (!pet.isAlive()) {
                messageLabel.setText("Your pet has passed away...");
                feedButton.setDisable(true);
                playButton.setDisable(true);
            }
            statusLabel.setText(pet.getStatus());
        }));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }

    @FXML
    public void handleFeed() {
        pet.feed();
        updateUI("You fed the pet.");
    }

    @FXML
    public void handlePlay() {
        String msg = pet.interact();
        updateUI(msg);
    }

    private void updateUI(String message) {
        statusLabel.setText(pet.getStatus());
        messageLabel.setText(message);
    }
}
