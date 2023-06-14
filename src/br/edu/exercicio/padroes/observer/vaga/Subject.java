package br.edu.exercicio.padroes.observer.vaga;

public interface Subject {
    public void registerObserver(VagaObserver observer);

    public void removeObserver(VagaObserver observer);

    public void notifyObservers();
}
