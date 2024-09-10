package com.example.projeto;

public class Docente {
    private String nome;
    private String departamento;

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

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        if (departamento != null && !departamento.isEmpty()) {
            this.departamento = departamento;
        } else {
            throw new IllegalArgumentException("Departamento nao pode ser vazio.");
        }
    }
}
