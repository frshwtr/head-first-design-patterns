package uk.frshwtr.ObserverPattern.Display;

import uk.frshwtr.ObserverPattern.WeatherData.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Observable observable;

    public ForecastDisplay(Observable obs) {
        this.observable = obs;
        observable.addObserver(this);
    }

    public void update(Observable obs, Object args) {
        if(obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display() {
        System.out.println("It's gonna be " + temperature + "F Degrees and " + humidity + "% humidity");
    }
}
