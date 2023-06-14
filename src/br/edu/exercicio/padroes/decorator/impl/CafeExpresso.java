package br.edu.exercicio.padroes.decorator.impl;

import br.edu.exercicio.padroes.decorator.Bebida;

public class CafeExpresso extends Bebida {
    public CafeExpresso() {
        super.descricao = "Café Expresso";
    }
    @Override
    public Double valor() {
        return 3.50;
    }
}
