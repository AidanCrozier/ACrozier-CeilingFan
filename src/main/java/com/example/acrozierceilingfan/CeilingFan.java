package com.example.acrozierceilingfan;

public class CeilingFan {
    private int speed;
    private boolean direction;

    private final int SPEED_SLOW = 1;
    private final int SPEED_MID = 2;
    private final int SPEED_FAST = 3;
    private final int OFF = 0;

    private final boolean DIR_CLOCKWISE = true;

    public CeilingFan() {
        speed = OFF;
        direction = DIR_CLOCKWISE;
    }

    public CeilingFan(int speed, boolean direction) {
        if (speed > 3) speed = 3;
        else if (speed < 0) speed = 0;
        this.speed = speed;
        this.direction = direction;
    }

    public String getStatus() {
        String speed = getSpeed();
        String sDirection = getDirection();
        String status;

        if (speed == "OFF")
            status = String.format("%s", speed);
        else
            status = String.format("%s\n%2s", speed, sDirection);

        return status;
    }

    public String getSpeed() {
        if (speed == 0)
            return "OFF";
        else
            return String.valueOf(speed);
    }

    public String getDirection() {
        String sDirection = "Direction: ";

        if (!direction)
            sDirection += "COUNTER CLOCKWISE";
        else
            sDirection += "CLOCKWISE";

        return sDirection;
    }

    public void PullSpeedCord() {
        if (speed == SPEED_FAST) speed = OFF;
        else speed++;
    }

    public void PullDirectionCord() {
        direction = !direction;
    }
}
