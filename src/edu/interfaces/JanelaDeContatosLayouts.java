package edu.interfaces;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.awt.*;

public class JanelaDeContatosLayouts extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        BorderPane painelMain = new BorderPane();
        Scene scn = new Scene(painelMain, 700, 150);
        stage.setScene(scn);

        FlowPane painel1 = new FlowPane();
        FlowPane painel2 = new FlowPane();
        FlowPane painel3 = new FlowPane();

        painel1.setHgap(5000);
        painel1.setVgap(20);

        painel2.setHgap(10);
        painel2.setVgap(10);

        painel3.setHgap(10);
        painel3.setVgap(10);

        Label lblId = new Label("ID:");
        TextField txtId = new TextField();

        Label lblNome = new Label("Nome:");
        TextField txtNome = new TextField();

        Label lblTelefone = new Label("Telefone:");
        TextField txtTelefone = new TextField();

        Button btnSalvar = new Button("Salvar");
        Button btnPesquisar = new Button("Pesquisar");

        painel1.getChildren().addAll(lblId, lblNome, lblTelefone);
        painel2.getChildren().addAll(txtId, txtNome, txtTelefone);
        painel3.getChildren().addAll(btnSalvar, btnPesquisar);

        painelMain.setLeft(painel1);
        painelMain.setCenter(painel2);
        painelMain.setBottom(painel3);

        stage.setTitle("Janela de Contatos");
        stage.show();


    }
}
