package com.mercado.pagamento;

import com.mercado.carrinho.Carrinho;

public class CartaoCredito implements Pagamento {
    public void processarPagamento(Carrinho carrinho) {
        System.out.println("Pagamento de R$ " + carrinho.getTotal() + " realizado com Cartão de Crédito.");
    }
}
