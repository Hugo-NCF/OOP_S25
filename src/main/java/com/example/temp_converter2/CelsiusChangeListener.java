package com.example.temp_converter2;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TextField;

public class CelsiusChangeListener implements ChangeListener<String> {

    private final TextField fahrenheitOutput;
    private boolean enabled = true;

    public CelsiusChangeListener(TextField fahrenheitOutput) {
        this.fahrenheitOutput = fahrenheitOutput;
    }

    public void setEnabled(boolean value) {
        enabled = value;
    }

    @Override
    public void changed(ObservableValue<? extends String> obs, String oldVal, String newVal) {
        if (!enabled) return;

        try {
            if (newVal == null || newVal.trim().isEmpty()) {
                fahrenheitOutput.setText("");
                return;
            }

            double celsius = Double.parseDouble(newVal);
            double fahrenheit = (celsius * 9 / 5) + 32;
            fahrenheitOutput.setText(String.format("%.2f", fahrenheit));
        } catch (NumberFormatException e) {
            fahrenheitOutput.setText("Invalid input");
        }
    }
}
