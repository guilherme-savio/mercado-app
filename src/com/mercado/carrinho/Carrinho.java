package com.mercado.carrinho;

import com.mercado.produto.Produto;
import com.mercado.produto.TipoProduto;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Produto> produtos = new ArrayList<>();

    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

    public Boolean temProduto(TipoProduto tipoProduto) {
        return produtos.stream().anyMatch(produto -> produto.getClass() == tipoProduto.getProduto());
    }

    public void getCarrinhoInfo() {
        produtos.forEach(Produto::getDetalhes);
    }

    public Double getTotal() {
        return produtos.stream().mapToDouble(Produto::getPreco).sum();
    }
}
