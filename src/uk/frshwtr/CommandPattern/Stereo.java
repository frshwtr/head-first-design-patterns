package uk.frshwtr.CommandPattern;

public class Stereo {
    int volume;
    String room;

    public Stereo(String room) {
        volume = 0;
        this.room = room;
    }
    public void on() {
        System.out.println("Stereo ON!");
    }

    public void off() {
        System.out.println("Sterreo OFF");
    }

    public void setCD() {
        System.out.println("Loading Muse - Absolution");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Turning it up to " + this.volume + "!");
    }
}
