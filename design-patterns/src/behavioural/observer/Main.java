package behavioural.observer;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        DisplayDevice displayDevice1 = new DisplayDevice();
        DisplayDevice displayDevice2 = new DisplayDevice();
        weatherStation.registerObserver(displayDevice1);
        weatherStation.registerObserver(displayDevice2);
        weatherStation.setMeasurements(43,34,12);
        weatherStation.removeObserver(displayDevice2);
        weatherStation.setMeasurements(22,34,45);
    }
}
