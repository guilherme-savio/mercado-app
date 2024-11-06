package com.mercado.pagamento;

import com.mercado.carrinho.Carrinho;
import com.mercado.produto.TipoProduto;

public class ValeAlimentacao implements Pagamento {
    public void processarPagamento(Carrinho carrinho) {
        try {
            if (carrinho.temProduto(TipoProduto.ELETRONICO))
                throw new Exception("Eletrônicos não são permitidos com Vale Alimentação.");

            System.out.println("Pagamento de R$ " + carrinho.getTotal() + " realizado com Vale Alimentação.");
        }
        catch (Exception e) {
            System.out.println("Erro ao realizar pagamento: " + e.getMessage());
        }
    }
}
