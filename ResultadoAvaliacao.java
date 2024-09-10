public enum ResultadoAvaliacao {

    DEFERIDO, INDEFERIDO;

    private String resultado;

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        if (resultado != null) {
            this.resultado = resultado;
        }
    }

}
