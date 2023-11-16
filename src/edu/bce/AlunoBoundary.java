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

public class AlunoBoundary extends Application {

    private TextField txtId = new TextField();
    private TextField txtRa = new TextField();
    private TextField txtNome = new TextField();
    private TextField txtNascimento = new TextField();

    private Button btnSalvar = new Button("Salvar");
    private Button btnPesquisar = new Button("Pesquisar");

    private DateTimeFormatter dtf =
            DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private AlunoControl control = new AlunoControl();

    @Override
    public void start(Stage stage) throws Exception {
        GridPane grid = new GridPane();
        Scene scn = new Scene(grid, 600, 400);

        Bindings.bindBidirectional(
                txtNome.textProperty(), control.nomeProperty() );

        Bindings.bindBidirectional(
                txtRa.textProperty(), control.raProperty() );

        grid.add(new Label("ID: "), 0, 0);
        grid.add(txtId, 1, 0);
        grid.add(new Label("RA: "), 0, 1);
        grid.add(txtRa, 1, 1);
        grid.add(new Label("Nome: "), 0, 2);
        grid.add(txtNome, 1, 2);
        grid.add(new Label("Nascimento: "), 0, 3);
        grid.add(txtNascimento, 1, 3);

        grid.add(btnSalvar, 0, 5);
        grid.add(btnPesquisar, 1, 5);

        btnSalvar.setOnAction(
                e -> {
                    control.gerarAluno();
                });

        btnPesquisar.setOnAction(
                e -> {
                    control.procurarAluno();
                });

        stage.setScene(scn);
        stage.setTitle("Gestão de Alunos");
        stage.show();

    }

    public static void main(String[] args) {
        Application.launch(AlunoBoundary.class, args);
    }
}
