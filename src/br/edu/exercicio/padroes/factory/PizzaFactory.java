package br.edu.exercicio.padroes.factory;

import br.edu.exercicio.padroes.factory.impl.Calabresa;
import br.edu.exercicio.padroes.factory.impl.Lombinho;
import br.edu.exercicio.padroes.factory.impl.Presunto;

public class PizzaFactory {
    public Pizza create(PizzaEnum type) {
        Pizza pizza = null;

        if(PizzaEnum.CALABRESA.equals(type)) {
            pizza = new Calabresa();
        }
        if(PizzaEnum.LOMBINHO.equals(type)) {
            pizza = new Lombinho();
        }
        if(PizzaEnum.PRESUNTO.equals(type)) {
            pizza = new Presunto();
        }
        return pizza;
    }
}
