package br.edu.exercicio.padroes.decorator.impl;

import br.edu.exercicio.padroes.decorator.Bebida;
import br.edu.exercicio.padroes.decorator.BebidaDecorator;

public class Capuccino extends BebidaDecorator {
    private Bebida bebida;
    public Capuccino(Bebida bebida) {
        this.bebida = bebida;
    }
    @Override
    public Double valor() {
        return bebida.valor() + 2.25;
    }
    @Override
    public String getDescricao() {
        return "Capuccino";
    }
}
