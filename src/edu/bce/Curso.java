package edu.bce;

public class Curso {

    private String id;
    private String nome;
    private String codigoCurso;
    private String coordenador;
    private String qtdAluno;

    public String getId() {
        return this.id;
    }

    public void setId(String valor) {
        this.id = valor;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String valor) {
        this.nome = valor;
    }

    public String getCodigoCurso() {
        return this.codigoCurso;
    }

    public void setCodigoCurso(String valor) {
        this.codigoCurso = valor;
    }

    public String getCoordenador() {
        return this.coordenador;
    }

    public void setCoordenador(String valor) {
        this.coordenador = valor;
    }

    public String getQtdAluno() {
        return this.qtdAluno;
    }

    public void setQtdAluno(String valor) {
        this.qtdAluno = valor;
    }
}
