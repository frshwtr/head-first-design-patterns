package uk.frshwtr.ObserverPattern.Display;


import uk.frshwtr.ObserverPattern.WeatherData.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class HeatIndexDisplay implements Observer, DisplayElement {
    private float heatIndex;
    private Observable observable;

    public HeatIndexDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void display() {
        System.out.println("Heat index is " + this.heatIndex + "%");
    }

    public void update(Observable obs, Object arg) {
        if(obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)obs;
            this.heatIndex = computeHeatIndex(weatherData.getTemperature(), weatherData.getHumidity());
            display();
        }
    }
    private float computeHeatIndex(float temperature, float relativeHumidity) {
        return (float)((16.923 + (0.185212 * temperature) + (5.37941 * relativeHumidity) - (0.100254 * temperature * relativeHumidity) +
                (0.00941695 * (temperature * temperature)) + (0.00728898 * (relativeHumidity * relativeHumidity)) +
                (0.000345372 * (temperature * temperature * relativeHumidity)) - (0.000814971 * (temperature * relativeHumidity * relativeHumidity)) +
                (0.0000102102 * (temperature * temperature * relativeHumidity * relativeHumidity)) - (0.000038646 * (temperature * temperature * temperature)) + (0.0000291583 *
                (relativeHumidity * relativeHumidity * relativeHumidity)) + (0.00000142721 * (temperature * temperature * temperature * relativeHumidity)) +
                (0.000000197483 * (temperature * relativeHumidity * relativeHumidity * relativeHumidity)) - (0.0000000218429 * (temperature * temperature * temperature * relativeHumidity * relativeHumidity)) +
                0.000000000843296 * (temperature * temperature * relativeHumidity * relativeHumidity * relativeHumidity)) -
                (0.0000000000481975 * (temperature * temperature * temperature * relativeHumidity * relativeHumidity * relativeHumidity)));
    }


}
