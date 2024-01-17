package src.chapter2.java.observers;

import src.chapter2.java.dtos.WeatherInfos;

public interface Observer {
    void update(WeatherInfos weatherInfos);
}
