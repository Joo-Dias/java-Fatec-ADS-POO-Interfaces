package edu.bce;

import javafx.beans.property.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CursoControl {

    private List<Curso> lista = new ArrayList<>();

    private StringProperty id = new SimpleStringProperty("");
    private StringProperty nome = new SimpleStringProperty("");
    private StringProperty cod = new SimpleStringProperty("");
    private StringProperty coordenador = new SimpleStringProperty("");
    private StringProperty qtdAlunos = new SimpleStringProperty("");

    public void gerarCurso() {
        Curso c = new Curso();
        c.setId( id.get() );
        c.setNome( nome.get() );
        c.setCodigoCurso( cod.get() );
        c.setCoordenador( coordenador.get() );
        c.setQtdAluno( qtdAlunos.get() );
        lista.add(c);
    }

    public void procurarCurso() {
        for (Curso c : lista) {
            if (c.getNome().contains(nome.get())) {
                id.set( c.getId() );
                nome.set( c.getNome() );
                cod.set( c.getCodigoCurso() );
                coordenador.set( c.getCoordenador() );
                qtdAlunos.set( c.getQtdAluno() );
            }
        }
    }

    public StringProperty idProperty() {
        return id;
    }
    public StringProperty nomeProperty() {
        return nome;
    }
    public StringProperty codProperty() {
        return cod;
    }
    public StringProperty coordenadorProperty() {
        return coordenador;
    }
    public StringProperty qtdAlunosProperty() {
        return qtdAlunos;
    }

}
