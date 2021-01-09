package uk.frshwtr.ObserverPattern.Display;

import uk.frshwtr.ObserverPattern.Conversion.FarenheitToCelcius;
import uk.frshwtr.ObserverPattern.WeatherData.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class CelciusDisplay implements Observer, DisplayElement {
    float temperature;
    FarenheitToCelcius farenheitToCelcius= new FarenheitToCelcius();
    private Observable observbable;

    public CelciusDisplay(Observable observable) {
        this.observbable = observable;
        observable.addObserver(this);
    }

    public void update(Observable obs, Object arg) {
        if(obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)obs;
        this.temperature = farenheitToCelcius.convert(weatherData.getTemperature());
        display();
        }
    }

    public void display() {
        System.out.println("It's gonna be " + temperature + "C Degrees");
    }
}
