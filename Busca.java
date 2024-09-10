package com.example.projeto;

public class Busca {
    private String termoBusca;

    public String getTermoBusca() {
        return termoBusca;
    }

    public void setTermoBusca(String termoBusca) {
        if (termoBusca != null && !termoBusca.isEmpty()) {
            this.termoBusca = termoBusca;
        } else {
            throw new IllegalArgumentException("Termo de busca nao pode ser vazio.");
        }
    }
}
