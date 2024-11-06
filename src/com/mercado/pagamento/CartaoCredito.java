package com.mercado.pagamento;

public class CartaoCredito implements Pagamento {
    public void processarPagamento(double quantia) {
        System.out.println("Pagamento de " + quantia + " realizado com Cartão de Crédito.");
    }
}
