package edu.interfaces;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Calculadora extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        BorderPane painelMain = new BorderPane();
        Scene scn = new Scene(painelMain, 400, 700);
        stage.setScene(scn);

        FlowPane painel1 = new FlowPane();
        painel1.setHgap(10);
        painel1.setVgap(10);
        painel1.setAlignment(Pos.BOTTOM_CENTER);

        TextField txtInput = new TextField();
        txtInput.setPrefHeight(60);
        txtInput.setPrefWidth(300);

        Button btnCE = new Button("CE");
        btnCE.setPrefHeight(60);
        btnCE.setPrefWidth(50);

        FlowPane painel2 = new FlowPane();
        painel2.setAlignment(Pos.CENTER);
        painel2.setHgap(10);
        painel2.setVgap(10);

        Button btn1 = new Button("1");
        btn1.setPrefHeight(90);
        btn1.setPrefWidth(90);

        Button btn2 = new Button("2");
        btn2.setPrefHeight(90);
        btn2.setPrefWidth(90);

        Button btn3 = new Button("3");
        btn3.setPrefHeight(90);
        btn3.setPrefWidth(90);

        Button btnPlus = new Button("+");
        btnPlus.setPrefHeight(90);
        btnPlus.setPrefWidth(90);

        Button btn4 = new Button("4");
        btn4.setPrefHeight(90);
        btn4.setPrefWidth(90);

        Button btn5 = new Button("5");
        btn5.setPrefHeight(90);
        btn5.setPrefWidth(90);

        Button btn6 = new Button("6");
        btn6.setPrefHeight(90);
        btn6.setPrefWidth(90);

        Button btnLess = new Button("-");
        btnLess.setPrefHeight(90);
        btnLess.setPrefWidth(90);

        Button btn7 = new Button("7");
        btn7.setPrefHeight(90);
        btn7.setPrefWidth(90);

        Button btn8 = new Button("8");
        btn8.setPrefHeight(90);
        btn8.setPrefWidth(90);

        Button btn9 = new Button("9");
        btn9.setPrefHeight(90);
        btn9.setPrefWidth(90);

        Button btnMult = new Button("*");
        btnMult.setPrefHeight(90);
        btnMult.setPrefWidth(90);

        Button btnPonto = new Button(".");
        btnPonto.setPrefHeight(90);
        btnPonto.setPrefWidth(90);

        Button btn0 = new Button("0");
        btn0.setPrefHeight(90);
        btn0.setPrefWidth(90);

        Button btnEquals = new Button("=");
        btnEquals.setPrefHeight(90);
        btnEquals.setPrefWidth(90);

        Button btnHash = new Button("/");
        btnHash.setPrefHeight(90);
        btnHash.setPrefWidth(90);

        painel2.getChildren().addAll(btn1, btn2, btn3, btnPlus, btn4, btn5, btn6, btnLess, btn7, btn8, btn9, btnMult, btnPonto, btn0, btnEquals, btnHash);
        painelMain.setCenter(painel2);

        painel1.getChildren().addAll(txtInput, btnCE);
        painelMain.setTop(painel1);

        stage.setTitle("Calculadora");
        stage.show();

    }
}
