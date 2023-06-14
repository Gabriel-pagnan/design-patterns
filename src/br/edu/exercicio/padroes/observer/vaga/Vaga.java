package br.edu.exercicio.padroes.observer.vaga;

public class Vaga {
    private String empresa;

    private Double salario;

    private String descricaoVaga;
    private ModeloEnum modelo;

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getDescricaoVaga() {
        return descricaoVaga;
    }

    public void setDescricaoVaga(String descricaoVaga) {
        this.descricaoVaga = descricaoVaga;
    }

    public ModeloEnum getModelo() {
        return modelo;
    }

    public void setModelo(ModeloEnum modelo) {
        this.modelo = modelo;
    }
}
