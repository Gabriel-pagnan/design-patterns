package br.edu.exercicio.padroes.decorator.impl;

import br.edu.exercicio.padroes.decorator.Bebida;

public class CafeComLeite extends Bebida {
    public CafeComLeite() {
        super.descricao = "Café com leite";
    }
    @Override
    public Double valor() {
        return 4.50;
    }
}
