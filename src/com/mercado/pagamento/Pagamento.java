package com.mercado.pagamento;

import com.mercado.carrinho.Carrinho;

public interface Pagamento {
    void processarPagamento(Carrinho carrinho);
}
