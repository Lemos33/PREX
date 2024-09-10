package com.example.projeto;

public class AdministradorPrexController {
    private AdministradorPrex model;
    private AdministradorPrexView view;

    public AdministradorPrexController(AdministradorPrex model, AdministradorPrexView view) {
        this.model = model;
        this.view = view;
    }

    public void setNome(String nome) {
        try {
            model.setNome(nome);
        } catch (IllegalArgumentException e) {
            view.mostrarMensagem(e.getMessage());
        }
    }

    public void setCargo(String cargo) {
        try {
            model.setCargo(cargo);
        } catch (IllegalArgumentException e) {
            view.mostrarMensagem(e.getMessage());
        }
    }

    public void atualizarView() {
        view.mostrarDetalhes(model);
    }
}
