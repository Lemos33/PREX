package com.example.projeto;

public class Discente {
    private String nome;
    private String matricula;

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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (matricula != null && !matricula.isEmpty()) {
            this.matricula = matricula;
        } else {
            throw new IllegalArgumentException("Matricula nao pode ser vazia.");
        }
    }
}
