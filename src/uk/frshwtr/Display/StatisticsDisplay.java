package uk.frshwtr.Display;

import uk.frshwtr.Observer.Observer;
import uk.frshwtr.Observer.Subject;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Stats: " + temperature + "F Degrees and " + humidity + "% humidity");
    }
}
