package src.chapter2.java.subjects;

import src.chapter2.java.dtos.WeatherInfos;
import src.chapter2.java.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private WeatherInfos weatherInfos;
    private List<Observer> observers;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.update(this.weatherInfos);
        }
    }

    public void measurementsChanged() {
        System.out.println("WeatherData measurement changed");
        notifyObservers();
    }

    public float getTemperature() {
        return this.weatherInfos.temperature();
    }

    public float getHumidity() {
        return this.weatherInfos.humidity();
    }

    public float getPressure() {
        return this.weatherInfos.pressure();
    }

    public void setMeasurements(WeatherInfos weatherInfos) {
        this.weatherInfos = weatherInfos;
        measurementsChanged();
    }
}
