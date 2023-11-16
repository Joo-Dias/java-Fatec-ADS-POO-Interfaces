package edu.interfaces;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class ButtonTrocaLabel extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        BorderPane painel = new BorderPane();
        Scene scn = new Scene(painel, 300, 300);
        stage.setScene(scn);

        FlowPane painel1 = new FlowPane();
        painel1.setAlignment(Pos.CENTER);

        Label lblTexto = new Label("Aperte o Botão!");

        painel1.getChildren().add(lblTexto);

        Button btnAperte = new Button("Aperte!");

        btnAperte.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                lblTexto.setText("Texto alterado!");
            }
        });

        painel.setTop(painel1);
        painel.setCenter(btnAperte);

        stage.setTitle("Teste de Evento");
        stage.show();
    }
}
