package behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
    private float temperature;
    private float humidity;
    private float pressure;
    private List<Observer> observers;
    @Override
    public void registerObserver(Observer observer) {
        if(null==observers){
            observers = new ArrayList<>();
        }
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if(null==observers){
            System.out.println("Not found in list");
        }else{
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers){
            observer.update(temperature,humidity,pressure);
        }
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}
