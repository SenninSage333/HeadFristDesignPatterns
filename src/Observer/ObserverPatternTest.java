package Observer;

public class ObserverPatternTest {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(15, 80, 1001);
        currentConditionsDisplay.removeSubject();
        weatherData.setMeasurements(20, 30, 999);
        currentConditionsDisplay.addSubject(weatherData);
        weatherData.setMeasurements(25, 40, 1005);
    }
}
