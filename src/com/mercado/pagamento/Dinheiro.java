package com.mercado.pagamento;

public class Dinheiro implements Pagamento {
    public void processarPagamento(double quantia) {
        System.out.println("Pagamento de " + quantia + " realizado em Dinheiro.");
    }
}
