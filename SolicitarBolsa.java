public class SolicitarBolsa {

    Docente solicitante;
    Projeto projeto;
    Financiamento financiador;
    Financiamento valorFinanciamento;
    StatusAprovacaoProjeto statusSolicitacao;
    int quantidadeBolsa;
    Date periodoTotalBolsa;

    // GETTERS

    public Docente getSolicitante() {
        return solicitante;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public Financiamento getFinanciador() {
        return financiador;
    }

    public Financiamento getValorFinanciamento() {
        return valorFinanciamento;
    }

    public StatusAprovacaoProjeto getStatusSolicitacao() {
        return statusSolicitacao;
    }

    public int getQuantidadeBolsa() {
        return quantidadeBolsa;
    }

    public Date getPeriodoTotalBolsa() {
        return periodoTotalBolsa;
    }

    // SETTERS

    public void setSolicitante(Docente solicitante) {
        if (Docente = !null) {
            this.solicitante = solicitante;
        }
    }

    public void setProjeto(Projeto projeto) {
        if (Projeto = !null) {
            this.projeto = projeto;
        }

    }

    public void setFinanciador(Financiamento financiador) {
        if (Financiamento = !null) {
            this.financiador = financiador;
        }

    }

    public void setValorFinanciamento(Financiamento valorFinanciamento) {
        if (Financiamento = !null) {
            this.valorFinanciamento = valorFinanciamento;
        }

    }

    public void setStatusSolicitacao(StatusAprovacaoProjeto statusSolicitacao) {
        if (StatusAprovacaoProjeto = !null) {
            this.statusSolicitacao = statusSolicitacao;
        }

    }

    public void setQuantidadeBolsa(int quantidadeBolsa) {
        if (quantidadeBolsa > 0 && quantidadeBolsa < 3) {
            this.quantidadeBolsa = quantidadeBolsa;
        }

    }

    public void setPeriodoTotalBolsa(Date periodoTotalBolsa) {
        if (Date = !null) {
            this.periodoTotalBolsa = periodoTotalBolsa;
        }

    }

}
