package edu.bce;

import javafx.beans.property.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AlunoControl {

    private List<Aluno> lista = new ArrayList<>();

    private LongProperty id = new SimpleLongProperty(0);
    private StringProperty ra = new SimpleStringProperty("");
    private StringProperty nome = new SimpleStringProperty("");
    private ObjectProperty<LocalDate> nascimento = new SimpleObjectProperty<>();


    public void gerarAluno() {
        Aluno a = new Aluno();
        a.setId(id.get());
        a.setRa( ra.get() );
        a.setNome( nome.get() );
        a.setNascimento( nascimento.get() );
        lista.add(a);
    }

    public void procurarAluno() {
        for (Aluno a : lista) {
            if (a.getNome().contains(nome.get())) {
                id.set( a.getId() );
                ra.set( a.getRa() );
                nome.set( a.getNome() );
                nascimento.set( a.getNascimento() );
            }
        }
    }

    public LongProperty idProperty() { return id; }
    public StringProperty raProperty() {
        return ra;
    }
    public StringProperty nomeProperty() {
        return nome;
    }
    public ObjectProperty<LocalDate> nascimentoProperty() { return nascimento;}



}
