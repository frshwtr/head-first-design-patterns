package uk.frshwtr.WeatherStation;

import uk.frshwtr.Display.CurrentConditionsDisplay;
import uk.frshwtr.Display.ForecastDisplay;
import uk.frshwtr.Display.StatisticsDisplay;
import uk.frshwtr.WeatherData.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80,50,30.5f);
        weatherData.setMeasurements(80,50,30.5f);
        weatherData.setMeasurements(800,50,30.5f);
    }
}
