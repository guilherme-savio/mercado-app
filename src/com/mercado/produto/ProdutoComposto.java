package com.mercado.produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoComposto extends Produto {
    private static final String MENSAGEM_DETALHE = "%s %s%s | R$ %s | %s unidades | Total: R$ %s";

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
        return produtos.stream().map(Produto::getPreco).reduce(precoTotal, Double::sum);
    }

    @Override
    public void imprimirDetalhes() {
        int quantidade = produtos.size();
        if (quantidade > 0) {
            Produto produtoReferencia = produtos.get(0);
            System.out.println(String.format(MENSAGEM_DETALHE, produtoReferencia.getNome(), produtoReferencia.getQuantidadeMedida(), produtoReferencia.getUnidadeMedida(), produtoReferencia.getPreco(), quantidade, getPreco()));
        } else {
            System.out.println("Produto Composto vazio.");
        }
    }
}
