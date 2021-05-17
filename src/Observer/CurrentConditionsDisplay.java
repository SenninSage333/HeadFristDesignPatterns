package Observer;

public class CurrentConditionsDisplay implements Display, Observer {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(this.temperature);
        System.out.println(this.humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.display();
    }

    @Override
    public void removeSubject() {
        this.weatherData.removeObserver(this);
    }

    @Override
    public void addSubject(Subject subject) {
        this.weatherData = subject;
        this.weatherData.registerObserver(this);
    }
}
