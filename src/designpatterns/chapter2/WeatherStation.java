package designpatterns.chapter2;

/*
 *      <<The observer pattern>> is a software design pattern in which an object, called the subject, maintains a list of its
 * dependents, called observers, and notifies them automatically of any state changes, usually by calling one of their
 * methods.
 */
public class WeatherStation implements Observer{

    private Observable observable;
    private long temperature;
    private long humidity;

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(30, 55);
        WeatherStation weatherStation = new WeatherStation(weatherData);

        weatherData.changeWeatherData(20, 40);

        weatherData.removeObserver(weatherStation);
    }

    private WeatherStation(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;

            temperature = weatherData.getTemperature();
            humidity = weatherData.getHumidity();
            display(temperature, humidity);
        }
    }

    private void display(long temperature, long humidity) {
        System.out.println("Temperature: " + temperature + "C\nHumidity: " + humidity + "%");
    }
}
