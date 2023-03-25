package observer;

import observer.subject.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {
    private WeatherData weatherData;

    private float avgTemperature;
    private float maxTemperature;
    private float minTemperature;
    private int nMeasurements;
    
    StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        this.nMeasurements = 0;
        this.weatherData.registerObserver(this);
    }
    
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.avgTemperature = ((this.avgTemperature * nMeasurements) + temp) / ++nMeasurements;
        this.maxTemperature = Math.max(this.maxTemperature, temp);
        this.minTemperature = Math.min(this.minTemperature, temp);
        display();
    }
    
    @Override
    public void display() {
        System.out.println("평균/ 최고/ 최저 온도 = " + avgTemperature + "/ " + maxTemperature + "/ " + minTemperature);
    }
}
