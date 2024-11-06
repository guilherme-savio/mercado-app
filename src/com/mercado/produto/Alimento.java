package com.mercado.produto;

public class Alimento extends Produto {
    private String nome;
    private double preco;

    public Alimento(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public double getPreco() {
        return this.preco;
    }

    @Override
    public void getDetalhes() {
        System.out.println(getNome() + " | R$ " + getPreco() + " | 1 unidade | Total: R$ " + getPreco());
    }
}
