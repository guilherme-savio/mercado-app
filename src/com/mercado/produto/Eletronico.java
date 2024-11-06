package com.mercado.produto;

public class Eletronico extends Produto {
    public Eletronico(String nome, Double preco, Double volume) {
        super(nome, preco, volume, UnidadeMedida.GRAMA);
    }
}
