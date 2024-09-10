package com.example.projeto;

public class FinanciadoresInternos {
    private String setor;
    private double verbaDisponivel;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        if (setor != null && !setor.isEmpty()) {
            this.setor = setor;
        } else {
            throw new IllegalArgumentException("Setor nao pode ser vazio.");
        }
    }

    public double getVerbaDisponivel() {
        return verbaDisponivel;
    }

    public void setVerbaDisponivel(double verbaDisponivel) {
        if (verbaDisponivel > 0) {
            this.verbaDisponivel = verbaDisponivel;
        } else {
            throw new IllegalArgumentException("A verba deve ser positiva.");
        }
    }
}
