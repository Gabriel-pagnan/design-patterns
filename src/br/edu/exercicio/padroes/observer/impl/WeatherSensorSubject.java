package br.edu.exercicio.padroes.observer.impl;

import br.edu.exercicio.padroes.observer.Observer;
import br.edu.exercicio.padroes.observer.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherSensorSubject implements Subject {
    private List<Observer> listObservers;
    private Float temperature;
    private Float pressure;
    private Float humidity;

    public WeatherSensorSubject() {
        this.listObservers = new ArrayList<Observer>();
    }
    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void removeObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }

    public void setWeatherData(Float temperature,
                               Float humidity,
                               Float pressure) {

        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temperature;

        this.notifyObservers();

    }
}
