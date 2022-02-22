package com.github.epehc.proreclutamiento.controllers;

import com.github.epehc.proreclutamiento.google.GoogleSheets;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.security.GeneralSecurityException;

public class LaboralController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    private GoogleSheets sheets = new GoogleSheets();

    @FXML
    public Button btnHome;

    public LaboralController() throws GeneralSecurityException, IOException {
    }

    public void switchToMain(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("main.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("PROreclutamiento - Inicio");
        stage.setScene(scene);
        stage.show();
    }

    public void switchToEstudios(ActionEvent event)throws IOException{
        root = FXMLLoader.load(getClass().getResource("info-estudios.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("PROreclutamiento - Estudios");
        stage.setScene(scene);
        stage.show();
    }

    public void switchToPersonal(ActionEvent event)throws IOException{
        root = FXMLLoader.load(getClass().getResource("info-personal.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("PROreclutamiento - Personal");
        stage.setScene(scene);
        stage.show();
    }
}
