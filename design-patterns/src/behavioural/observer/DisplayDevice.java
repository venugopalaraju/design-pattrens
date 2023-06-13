package behavioural.observer;

public class DisplayDevice implements Observer{
    float temperature;
    float humidity;
    float pressure;
    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        displayWeather();
    }

    public void displayWeather(){
        System.out.println("Temperature :: "+temperature);
        System.out.println("Humidity ::"+humidity);
        System.out.println("Pressure ::"+pressure);
        System.out.println("============================");
    }
}
