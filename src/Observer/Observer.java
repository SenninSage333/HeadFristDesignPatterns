package Observer;

public interface Observer {

    void update(float temp, float humidity, float pressure);

    void removeSubject();

    void addSubject(Subject subject);
}
