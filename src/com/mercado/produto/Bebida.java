package com.mercado.produto;

public class Bebida extends Produto {
    public Bebida(String nome, Double preco, Double volume) {
        super(nome, preco, volume, UnidadeMedida.LITRO);
    }
}
