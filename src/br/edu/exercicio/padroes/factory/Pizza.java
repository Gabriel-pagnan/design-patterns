package br.edu.exercicio.padroes.factory;

public abstract class Pizza {
    protected String sabor;

    public void mostrarSavor() {
        System.out.println("Sabor da pizza é: " + this.sabor);
    }
}
