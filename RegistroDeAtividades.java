public class RegistroDeAtividades {
    private Projeto projeto;
    private Docente docente;
    private int quantidadeAlunos;
    private String nomeAtividade;
    private Date dataInicio,prazo;
    private StatusAtividade statusAtividade;
    
    public Projeto getProjeto() {
        return projeto;
    }
    public void setProjeto(Projeto projeto) {
        if (projeto != null) {
            this.projeto=projeto;
        }
    }
    public Docente getDocente() {
        return docente;
    }
    public void setDocente(Docente docente) {
        if (docente != null) {
            this.docente=docente;
        }    
    }
    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }
    public void setQuantidadeAlunos(int quantidadeAlunos) {
        if (quantidadeAlunos != null) {
            this.quantidadeAlunos=quantidadeAlunos;
        }
    }
    public String getNomeAtividade() {
        return nomeAtividade;
    }
    public void setNomeAtividade(String nomeAtividade) {
        if (nomeAtividade != null) {
            this.nomeAtividade=nomeAtividade;
        }
    }
    public Date getDataInicio() {
        return dataInicio;
    }
    public void setDataInicio(Date dataInicio) {
        if (dataInicio != null) {
            this.dataInicio=dataInicio;
        }
    }
    public Date getPrazo() {
        return prazo;
    }
    public void setPrazo(Date prazo) {
        if (prazo != null) {
            this.prazo=prazo;
        }
    }
    public StatusAtividade getStatusAtividade() {
        return statusAtividade;
    }
    public void setStatusAtividade(StatusAtividade statusAtividade) {
        if (statusAtividade != null) {
            this.statusAtividade=statusAtividade;
        }
    }

    

}
