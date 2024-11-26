package com.mercado.produto;

public class ProdutoFactory {
    public static Produto criarProduto(TipoProduto tipo, String nome, double preco, double quantidadeMedida) {
        switch (tipo) {
            case ALIMENTO -> {
                return new Alimento(nome, preco, quantidadeMedida);
            }
            case BEBIDA -> {
                return new Bebida(nome, preco, quantidadeMedida);
            }
            case ELETRONICO -> {
                return new Eletronico(nome, preco, quantidadeMedida);
            }
            default -> {
                return null;
            }
        }
    }
}
