package Faculdade;



import javax.swing.JLabel;

import javafx.application.Application;

import javafx.event.ActionEvent;

import javafx.event.EventHandler;

import javafx.scene.Scene;

import javafx.scene.control.Button;

import javafx.scene.layout.StackPane;

import javafx.stage.Stage;

public class teste {

	    public static void main(String[] args) {

	        launch(args);

	    }

	    @Override

	    public void start(Stage janela) {

	        Button btn = new Button();

	        btn.setText("Imprime 'Hello World'");

	        btn.setOnAction(new EventHandler<ActionEvent>() {

	            @Override

	            public void handle(ActionEvent event) {

	                System.out.println("Hello World!");

	            }

	        });

	        StackPane gerenciadorLayout = new StackPane();

	        gerenciadorLayout.getChildren().add(btn);

	        Scene cena = new Scene(gerenciadorLayout, 300, 100);

	        janela.setTitle("Aplica��o Hello World!");

	        janela.setScene(cena);

	        janela.show();

	    }

	} 