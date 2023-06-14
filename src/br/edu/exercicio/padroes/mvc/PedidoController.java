package br.edu.exercicio.padroes.mvc;

import br.edu.exercicio.padroes.mvc.Business.PedidoBusiness;
import br.edu.exercicio.padroes.mvc.Business.dto.Pedido;

public class PedidoController {
    /**
     * Método simulado de um controller para criar Pedido
     * @param pedido
     * */
    public void criarPedido(PedidoRequest pedido) throws Exception {
        if(pedido == null && pedido.getCliente() == null) {
            throw new Exception("informações inválidas");
        }
        PedidoBusiness business = new PedidoBusiness();
        business.criarPedido(this.converterPedido(pedido));
    }

    private Pedido converterPedido(PedidoRequest pedidoRequest) {
        Pedido pedido = new Pedido();
        pedido.setId(pedidoRequest.getCodigo());
        pedido.setNomeCliente(pedidoRequest.getCliente());
        pedido.setTotalPedido(pedidoRequest.getValorTotal());

        return pedido;
    }

}
