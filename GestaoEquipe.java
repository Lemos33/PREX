class GestaoEquipe {
    private Projeto projeto;
    private Docente professor;
    private Dicente aluno;
    
    public Projeto getProjeto() {
        return projeto;
    }
    public void setProjeto(Projeto projeto) {
        if (projeto != null) {
            this.projeto=projeto;
        }
    }
    public Docente getProfessor() {
        return professor;
    }
    public void setProfessor(Docente professor) {
        if (professor != null) {
            this.professor=professor;
        }
    }
    public Dicente getAluno() {
        return aluno;
    }
    public void setAluno(Dicente aluno) {
        if (aluno != null) {
            this.aluno=aluno;
        }
    }

    
}
