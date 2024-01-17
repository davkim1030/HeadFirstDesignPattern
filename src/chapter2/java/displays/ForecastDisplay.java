package src.chapter2.java.displays;

import src.chapter2.java.DisplayElement;
import src.chapter2.java.dtos.WeatherInfos;
import src.chapter2.java.observers.Observer;
import src.chapter2.java.subjects.WeatherData;

public class ForecastDisplay  implements Observer, DisplayElement {
    private WeatherInfos weatherInfos;

    public ForecastDisplay(WeatherData weatherData) {
        weatherData.registerObserver(this);
    }
    @Override
    public String display() {
        return "현재 상태: %s˚F, %s%%, %s"
                .formatted(
                        weatherInfos.temperature(),
                        weatherInfos.humidity(),
                        weatherInfos.pressure()
                );
    }

    @Override
    public void update(WeatherInfos weatherInfos) {
        this.weatherInfos = weatherInfos;
        System.out.println(display());
    }
}
