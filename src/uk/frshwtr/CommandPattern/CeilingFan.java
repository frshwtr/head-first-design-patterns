package uk.frshwtr.CommandPattern;

public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void setSpeedHigh() {
        speed = HIGH;
    }

    public void setSpeedMedium() {
        speed = MEDIUM;
    }

    public void setSpeedLow() {
        speed = LOW;
    }

    public void setSpeedOff() {
        speed = OFF;
    }

    public int getSpeed() {
        return speed;
    }


}
