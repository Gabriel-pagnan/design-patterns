package br.edu.exercicio.padroes.factory.impl;

import br.edu.exercicio.padroes.factory.Pizza;
import br.edu.exercicio.padroes.factory.PizzaEnum;

public class Calabresa extends Pizza {
    public Calabresa() {
        super.sabor = PizzaEnum.CALABRESA.toString();
    }
}
