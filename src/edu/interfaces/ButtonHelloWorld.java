package edu.interfaces;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.awt.*;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

class Interceptador implements EventHandler<MouseEvent> {
    public void handle(MouseEvent e) {
        System.out.println("Hello World!");
    }
}



public class ButtonHelloWorld extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        BorderPane painel = new BorderPane();
        Scene scn = new Scene(painel, 300, 300);
        stage.setScene(scn);

        Interceptador intercept = new Interceptador();

        FlowPane painel1 = new FlowPane();
        painel1.setAlignment(Pos.CENTER);

        Label lblTexto = new Label("Aperte o Botão!");

        painel1.getChildren().add(lblTexto);

        Button btnAperte = new Button("Aperte!");

        stage.addEventFilter(
                MouseEvent.MOUSE_CLICKED, intercept
        );

        painel.setTop(painel1);
        painel.setCenter(btnAperte);

        stage.setTitle("Teste de Evento");
        stage.show();
    }




    }

