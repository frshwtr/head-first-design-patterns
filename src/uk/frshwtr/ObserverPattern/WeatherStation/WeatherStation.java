package uk.frshwtr.ObserverPattern.WeatherStation;

import uk.frshwtr.ObserverPattern.Display.*;
import uk.frshwtr.ObserverPattern.WeatherData.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        CelciusDisplay celciusDisplay = new CelciusDisplay(weatherData);


        weatherData.setMeasurements(80,65,30.5f);
        weatherData.setMeasurements(80,50,30.5f);
        weatherData.setMeasurements(800,50,30.5f);
    }
}
