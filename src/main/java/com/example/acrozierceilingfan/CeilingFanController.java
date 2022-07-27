package com.example.acrozierceilingfan;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CeilingFanController {
    CeilingFan fan = new CeilingFan();
    @FXML
    private Label speedText;
    @FXML
    private Label directionText;

    @FXML
    protected void initialize() {
        String speed = String.format("Speed: %s", fan.getSpeed());
        speedText.setText(speed);

        if (fan.getSpeed().equals("OFF"))
            directionText.setText("");
        else
            directionText.setText(fan.getDirection());
    }

    @FXML
    protected void onSpeedButtonClick() {
        fan.PullSpeedCord();

        String speed = String.format("Speed: %s", fan.getSpeed());
        speedText.setText(speed);

        if (fan.getSpeed().equals("OFF"))
            directionText.setText("");
        else
            directionText.setText(fan.getDirection());
    }

    @FXML
    protected void onDirectionButtonClick() {
        fan.PullDirectionCord();
        if (!fan.getSpeed().equals("OFF"))
            directionText.setText(fan.getDirection());
    }
}