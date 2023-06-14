package br.edu.exercicio.padroes.factory.impl;

import br.edu.exercicio.padroes.factory.Pizza;
import br.edu.exercicio.padroes.factory.PizzaEnum;

public class Presunto extends Pizza {
    public Presunto() {
        super.sabor = PizzaEnum.PRESUNTO.toString();
    }
}
