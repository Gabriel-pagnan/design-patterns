package br.edu.exercicio.padroes.observer;

import br.edu.exercicio.padroes.observer.impl.WeatherSensorSubject;

public class App {
    public static void main(String...strings){
        WeatherSensorSubject sensor = new WeatherSensorSubject();

        DisplayWeatherObserver displayObserver = new DisplayWeatherObserver();
        DisplayWeatherObserver display2 = new DisplayWeatherObserver();

        AlarmObserver alarme = new AlarmObserver();
        sensor.registerObserver(displayObserver);
        sensor.registerObserver(display2);
        sensor.registerObserver(alarme);

        sensor.setWeatherData(30F, 40F, 20F);
        displayObserver.displaInfo();
        display2.displaInfo();

        sensor.setWeatherData(69F, 30F, 20F);
        System.out.println(alarme.getCountAlarme());
    }
}
