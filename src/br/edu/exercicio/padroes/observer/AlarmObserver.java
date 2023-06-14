package br.edu.exercicio.padroes.observer;

public class AlarmObserver implements Observer{
    private int countTemp;
    @Override
    public void update(float temp, float humidity, float pressure) {
        if(temp > 50) {
            countTemp++;
        }
    }

    public int getCountAlarme() {
        return this.countTemp;
    }
}
