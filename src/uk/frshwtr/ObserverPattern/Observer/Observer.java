package uk.frshwtr.ObserverPattern.Observer;

import java.util.Observable;

public interface Observer {
    void update(Observable o, Object arg);
}
