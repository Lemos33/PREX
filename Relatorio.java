public class Relatorio {
    Projeto projeto;
    Docente professor;
    RegistroAtividades atividades;

    // GETTERS

    public Projeto getProjeto() {
        return projeto;
    }

    public Docente getProfessor() {
        return professor;
    }

    public RegistroAtividades getAtividades() {
        return atividades;
    }

    // SETTERS

    public void setProjeto(Projeto projeto) {
        if (Projeto != null) {
            this.projeto = projeto;
        }
    }

    public void setProfessor(Docente professor) {

        if (Docente != null) {
            this.professor = professor;
        }

    }

    public void setAtividades(RegistroAtividades atividades) {

        if (RegistroAtividades != null) {
            this.atividades = atividades;
        }
    }

}
