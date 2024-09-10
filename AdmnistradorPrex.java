package com.example.projeto;

public class AdministradorPrex {

    private String nome;
    private String cargo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("Nome nao pode ser vazio.");
        }
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        if (cargo != null && !cargo.isEmpty()) {
            this.cargo = cargo;
        } else {
            throw new IllegalArgumentException("Cargo nao pode ser vazio.");
        }
    }
}
