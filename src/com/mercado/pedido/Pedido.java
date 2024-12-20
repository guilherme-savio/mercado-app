package com.mercado.pedido;

import com.mercado.carrinho.Carrinho;
import com.mercado.pagamento.Pagamento;

public class Pedido {
    private Carrinho carrinho;
    private Pagamento pagamento;

    public Pedido(Carrinho carrinho, Pagamento pagamento) {
        this.carrinho = carrinho;
        this.pagamento = pagamento;
    }

    public void revisarPedido() {
        System.out.println("------- Pedido -------");
        carrinho.imprimirDetalhesCarrinho();
        System.out.println("Total do pedido: R$ " + carrinho.getTotal());
    }

    public void finalizarPedido() {
        pagamento.processarPagamento(carrinho);
    }
}
