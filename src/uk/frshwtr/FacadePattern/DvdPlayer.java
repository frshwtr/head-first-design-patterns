package uk.frshwtr.FacadePattern;

public class
DvdPlayer {
    String title;

    public DvdPlayer(String title) {
        this.title = title;
    }
    public void on() {
        System.out.println("DVD on");
    }

    public String toString() {
        return title;
    }

    public void play() {
        System.out.println("Playing " + title);
    }

    public void stop() {
    }

    public void eject() {
    }

    public void off() {
    }
}
