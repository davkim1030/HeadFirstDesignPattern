package src.chapter2.java;

import src.chapter2.java.displays.CurrentConditionsDisplay;
import src.chapter2.java.displays.ForecastDisplay;
import src.chapter2.java.displays.StatisticsDisplay;
import src.chapter2.java.dtos.WeatherInfos;
import src.chapter2.java.subjects.WeatherData;

public class Chapter2 {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay =
            new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(new WeatherInfos(80, 65, 30.4f));
        System.out.println(currentConditionsDisplay.display());
        weatherData.setMeasurements(new WeatherInfos(82, 70, 29.2f));
        System.out.println(currentConditionsDisplay.display());
        weatherData.setMeasurements(new WeatherInfos(78, 90, 29.2f));
        System.out.println(currentConditionsDisplay.display());
    }
}
