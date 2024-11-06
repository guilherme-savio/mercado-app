package com.mercado.produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoComposto extends Produto {
    private List<Produto> produtos;

    public ProdutoComposto() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    @Override
    public Double getPreco() {
        double precoTotal = 0.0;
        for (Produto produto : produtos) {
            precoTotal += produto.getPreco();
        }
        return precoTotal;
    }

    @Override
    public void getDetalhes() {
        int quantidade = produtos.size();
        if (quantidade > 0) {
            Produto produtoReferencia = produtos.get(0);
            System.out.println(produtoReferencia.getNome() + " " + produtoReferencia.getQuantidadeMedida() + produtoReferencia.getUnidadeMedida() + " | R$ " + produtoReferencia.getPreco() + " | " + quantidade + " unidades | Total: R$ " + getPreco());
        } else {
            System.out.println("Produto Composto vazio.");
        }
    }
}
