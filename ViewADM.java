package com.example.projeto;

public class AdministradorPrexView {
    public void mostrarDetalhes(AdministradorPrex admin) {
        System.out.println("Nome: " + admin.getNome());
        System.out.println("Cargo: " + admin.getCargo());
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
