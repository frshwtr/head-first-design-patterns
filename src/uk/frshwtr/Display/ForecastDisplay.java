package uk.frshwtr.Display;

import uk.frshwtr.Observer.Observer;
import uk.frshwtr.Observer.Subject;

public class ForecastDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("It's gonna be " + temperature + "F Degrees and " + humidity + "% humidity");
    }
}
