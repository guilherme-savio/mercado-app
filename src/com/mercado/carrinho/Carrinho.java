package com.mercado.carrinho;

import com.mercado.produto.Produto;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Produto> produtos = new ArrayList<>();

    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

    public void getCarrinhoInfo() {
        produtos.forEach(Produto::getDetalhes);
    }

    public double getTotal() {
        return produtos.stream().mapToDouble(Produto::getPreco).sum();
    }
}
