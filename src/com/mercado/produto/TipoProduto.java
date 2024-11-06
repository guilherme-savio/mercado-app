package com.mercado.produto;

import java.lang.reflect.Type;

public enum TipoProduto {
    ALIMENTO(Alimento.class),
    BEBIDA(Produto.class),
    ELETRONICO(Eletronico.class);

    private Type produto;

    TipoProduto(Type produto) {
        this.produto = produto;
    }

    public Type getProduto() {
        return produto;
    }
}
