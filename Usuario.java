public class Usuario {
    private String usuario;
    private String senha;
    private String email;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        if (usuario != null)
            this.usuario = usuario;
    }

    public void setSenha(String senha) {
        if (senha != null)
            this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setEmail(String email) {
        if (email != null)
            this.email = email;
    }

    public String getEmail() {
        return email;
    }

}
