package uk.frshwtr.FacadePattern;

public class Amplifier {
    public void on() {
        System.out.println("Amp on");
    }

    public void setDvd(DvdPlayer dvd) {
        System.out.println("Setting dvd" + dvd.toString());
    }

    public void setVolume(int i) {
        System.out.println("Volume set to " + i);
    }

    public void off() {
    }
}
