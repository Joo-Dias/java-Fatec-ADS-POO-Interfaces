package edu.interfaces;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class JanelaDeConatos extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Pane painel = new Pane();
        Scene scn = new Scene(painel);

        Label lblId = new Label("ID:");
        lblId.setStyle(
                "-fx-font-family: 'Segoe UI';"
                + "-fx-font-size: 25px;"
        );
        Label lblNome = new Label("Nome:");
        lblNome.setStyle(
                "-fx-font-family: 'Segoe UI';"
                + "-fx-font-size: 25px;"
        );
        lblNome.relocate(0, 50);

        Label lblTelefone = new Label("Telefone:");
        lblTelefone.setStyle(
                "-fx-font-family: 'Segoe UI';"
                + "-fx-font-size: 25px;"
        );
        lblTelefone.relocate(0, 100);

        Button btnSalvar = new Button("Salvar");
        btnSalvar.setStyle(
                "-fx-font-family: 'Segoe UI';"
                + "-fx-font-size: 20px;"
        );
        btnSalvar.relocate(0, 150);

        Button btnPesquisar = new Button("Pesquisar");
        btnPesquisar.setStyle(
                "-fx-font-family: 'Segoe UI';"
                        + "-fx-font-size: 20px;"
        );
        btnPesquisar.relocate(90, 150);

        TextField txtId = new TextField();
        txtId.setPrefWidth(350);
        txtId.setPrefHeight(30);
        txtId.relocate(200, 0);

        TextField txtNome = new TextField();
        txtNome.setPrefWidth(350);
        txtNome.setPrefHeight(30);
        txtNome.relocate(200, 50);

        TextField txtTelefone = new TextField();
        txtTelefone.setPrefWidth(350);
        txtTelefone.setPrefHeight(30);
        txtTelefone.relocate(200, 100);

        painel.getChildren().add(lblId);
        painel.getChildren().add(txtId);
        painel.getChildren().add(lblNome);
        painel.getChildren().add(txtNome);
        painel.getChildren().add(lblTelefone);
        painel.getChildren().add(txtTelefone);
        painel.getChildren().add(btnSalvar);
        painel.getChildren().add(btnPesquisar);

        stage.setScene(scn);
        stage.setTitle("Janela de Contatos");
        stage.show();

    }
}
