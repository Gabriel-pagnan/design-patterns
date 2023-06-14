package br.edu.exercicio.padroes.factory;

public class Main {
    public static void main(String...strings){
        PizzaFactory factory = new PizzaFactory();

        Pizza pizza = factory.create(PizzaEnum.CALABRESA);
        pizza.mostrarSavor();
    }
}
