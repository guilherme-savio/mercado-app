package com.mercado.produto;

public enum UnidadeMedida {
    LITRO("L"),
    GRAMA("g");

    private String sigla;

    UnidadeMedida(String sigla) {
        this.sigla = sigla;
    }

    public String getSigla() {
        return sigla;
    }
}
