package edu.bce;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CursoBoundary extends Application {

    private TextField txtId = new TextField();
    private TextField txtNome = new TextField();
    private TextField txtCod = new TextField();
    private TextField txtCoordenador = new TextField();
    private TextField txtQtdAluno = new TextField();

    private Button btnSalvar = new Button("Salvar");
    private Button btnPesquisar = new Button("Pesquisar");

    private DateTimeFormatter dtf =
            DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private CursoControl control = new CursoControl();
    @Override
    public void start(Stage stage) throws Exception {
        GridPane grid = new GridPane();
        Scene scn = new Scene(grid, 600, 400);

        Bindings.bindBidirectional(
                txtId.textProperty(), control.idProperty() );

        Bindings.bindBidirectional(
                txtNome.textProperty(), control.nomeProperty() );

        Bindings.bindBidirectional(
                txtCod.textProperty(), control.codProperty() );

        Bindings.bindBidirectional(
                txtCoordenador.textProperty(), control.coordenadorProperty() );

        Bindings.bindBidirectional(
                txtQtdAluno.textProperty(), control.qtdAlunosProperty() );

        grid.add(new Label("ID: "), 0, 0);
        grid.add(txtId, 1, 0);
        grid.add(new Label("Nome: "), 0, 1);
        grid.add(txtNome, 1, 1);
        grid.add(new Label("Código: "), 0, 2);
        grid.add(txtCod, 1, 2);
        grid.add(new Label("Coordenador: "), 0, 3);
        grid.add(txtCoordenador, 1, 3);
        grid.add(new Label("Quantidade de Alunos: "), 0, 4);
        grid.add(txtQtdAluno, 1, 4);

        grid.add(btnSalvar, 0, 5);
        grid.add(btnPesquisar, 1, 5);

        btnSalvar.setOnAction(
                e -> {
                    control.gerarCurso();
                });

        btnPesquisar.setOnAction(
                e -> {
                    control.procurarCurso();
                });

        stage.setScene(scn);
        stage.setTitle("Gestão de Cursos");
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(CursoBoundary.class, args);
    }
}
