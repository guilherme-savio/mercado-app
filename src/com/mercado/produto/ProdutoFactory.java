package com.mercado.produto;

public class ProdutoFactory {
    public static Produto criarProduto(String tipo, String nome, double preco) {
        if (tipo.equalsIgnoreCase("alimento")) {
            return new Alimento(nome, preco);
        }
        return null;
    }
}
