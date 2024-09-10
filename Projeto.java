class Projeto{
     private String tituloProjeto,abrangenciaLocal,areasAtuacao,palavrasChave,enderecoVirtualProjeto,contato,departamento,codigo;
     private Date dataVigencia;
     private StatusProjeto statusProjeto;
     private Projeto projetosRelacionados;
    
     public String getTituloProjeto() {
        return tituloProjeto;
    }
    public void setTituloProjeto(String tituloProjeto) {
        if (tituloProjeto!=null){
            this.tituloProjeto = tituloProjeto;
        } 
    }
    public String getAbrangenciaLocal() {
        return abrangenciaLocal;
    }
    public void setAbrangenciaLocal(String abrangenciaLocal) {
        if (abrangenciaLocal != null) {
            this.abrangenciaLocal = abrangenciaLocal;
        }
    }
    public String getAreasAtuacao() {
        return areasAtuacao;
    }
    public void setAreasAtuacao(String areasAtuacao) {
        if (areasAtuacao != null) {
            this.areasAtuacao = areasAtuacao;
        }
    }
    public String getPalavrasChave() {
        return palavrasChave;
    }
    public void setPalavrasChave(String palavrasChave) {
        if (palavrasChave != null) {
            this.palavrasChave = palavrasChave;
        }
    }
    public String getEnderecoVirtualProjeto() {
        return enderecoVirtualProjeto;
    }
    public void setEnderecoVirtualProjeto(String enderecoVirtualProjeto) {
        if (enderecoVirtualProjeto != null) {
            this.enderecoVirtualProjeto = enderecoVirtualProjeto;
        }
    public String getContato() {
        return contato;
    }
    public void setContato(String contato) {
        if (contato != null) {
            this.contato = contato;
        }
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        if (departamento != null) {
            this.departamento = departamento;
        }
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        if (codigo != null) {
            this.codigo = codigo;
        }
    }
    public Date getDataVigencia() {
        return dataVigencia;
    }
    public void setDataVigencia(Date dataVigencia) {
        if (dataVigencia != null) {
            this.dataVigencia = dataVigencia;
        }
    }
    public StatusProjeto getStatusProjeto() {
        return statusProjeto;
    }
    public void setStatusProjeto(StatusProjeto statusProjeto) {
        if (statusProjeto != null) {
            this.statusProjeto = statusProjeto;
        }
    }
    public Projeto getProjetosRelacionados() {
        return projetosRelacionados;
    }
    public void setProjetosRelacionados(Projeto projetosRelacionados) {
        if (projetosRelacionados != null) {
            this.projetosRelacionados = projetosRelacionados;
        }
    }

     
}