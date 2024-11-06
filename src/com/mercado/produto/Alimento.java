package com.mercado.produto;

public class Alimento extends Produto {
    public Alimento(String nome, Double preco, Double peso) {
        super(nome, preco, peso, UnidadeMedida.GRAMA);
    }
}
