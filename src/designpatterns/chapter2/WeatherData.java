package designpatterns.chapter2;

public class WeatherData extends Observable {

    private long temperature;
    private long humidity;

    WeatherData(long temperature, long humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        setChanged();
        notifyObservers();
    }

    public void changeWeatherData(long temperature, long humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        setChanged();
        notifyObservers();
    }

    long getTemperature() {
        return temperature;
    }

    long getHumidity() {
        return humidity;
    }
}