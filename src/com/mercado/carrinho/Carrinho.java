package com.mercado.carrinho;

import com.mercado.produto.Produto;
import com.mercado.produto.TipoProduto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Carrinho {
    private List<Produto> produtos = new ArrayList<>();

    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

    public Boolean temProduto(TipoProduto tipoProduto) {
        return !this.produtos.isEmpty();
    }

    public void imprimirDetalhesCarrinho() {
        produtos.forEach(Produto::imprimirDetalhes);
    }

    public Double getTotal() {
        return produtos.stream().map(Produto::getPreco).reduce(0.0, Double::sum);
    }
}
