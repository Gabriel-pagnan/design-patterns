package br.edu.exercicio.padroes.factory.impl;

import br.edu.exercicio.padroes.factory.Pizza;
import br.edu.exercicio.padroes.factory.PizzaEnum;

public class Lombinho extends Pizza {
    public Lombinho() {
        super.sabor = PizzaEnum.LOMBINHO.toString();
    }
}
