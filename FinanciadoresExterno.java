package com.example.projeto;

public class FinanciadoresExterno {
    private String nomeInstituicao;
    private double valorInvestido;

    public String getNomeInstituicao() {
        return nomeInstituicao;
    }

    public void setNomeInstituicao(String nomeInstituicao) {
        if (nomeInstituicao != null && !nomeInstituicao.isEmpty()) {
            this.nomeInstituicao = nomeInstituicao;
        } else {
            throw new IllegalArgumentException("Nome da instituicao nao pode ser vazio.");
        }
    }

    public double getValorInvestido() {
        return valorInvestido;
    }

    public void setValorInvestido(double valorInvestido) {
        if (valorInvestido > 0) {
            this.valorInvestido = valorInvestido;
        } else {
            throw new IllegalArgumentException("O valor investido deve ser positivo.");
        }
    }
}
