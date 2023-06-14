package br.edu.exercicio.padroes.decorator;

public abstract class Bebida {
    protected String descricao = "sem bebida";

    public String getDescricao() {
        return descricao;
    }

public abstract Double valor();
}
