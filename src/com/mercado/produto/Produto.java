package com.mercado.produto;

public abstract class Produto {
    protected String nome;
    protected Double preco;
    protected Double quantidadeMedida;
    protected UnidadeMedida unidadeMedida;

    public Produto() {}

    public Produto(String nome, Double preco, Double quantidadeMedida, UnidadeMedida unidadeMedida) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeMedida = quantidadeMedida;
        this.unidadeMedida = unidadeMedida;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public Double getQuantidadeMedida() {
        return quantidadeMedida;
    }

    public String getUnidadeMedida() {
        return unidadeMedida.getSigla();
    }

    public void imprimirDetalhes() {
        System.out.println(getNome() + " " + getQuantidadeMedida() + getUnidadeMedida() + " | R$ " + getPreco() + " | 1 unidade | Total: R$ " + getPreco());
    }
}
