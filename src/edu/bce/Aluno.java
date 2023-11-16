package edu.bce;

import java.time.LocalDate;

public class Aluno {

    private long id;
    private String ra;
    private String nome;
    private LocalDate nascimento;

    public long getId() {
        return this.id;
    }

    public void setId(long valor) {
        this.id = valor;
    }

    public String getRa() {
        return this.ra;
    }

    public void setRa(String valor) {
        this.ra = valor;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome( String valor) {
        this.nome = valor;
    }

    public LocalDate getNascimento() {
        return this.nascimento;
    }

    public void setNascimento(LocalDate valor) {
        this.nascimento = valor;
    }
}
