package br.edu.exercicio.padroes.mvc;

import java.math.BigDecimal;
import java.util.Map;

public class PedidoRequest {
    private Integer codigo;
    private String cliente;
    private BigDecimal valorTotal;
    private Map<Integer, String> intens;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Map<Integer, String> getIntens() {
        return intens;
    }

    public void setIntens(Map<Integer, String> intens) {
        this.intens = intens;
    }
}
