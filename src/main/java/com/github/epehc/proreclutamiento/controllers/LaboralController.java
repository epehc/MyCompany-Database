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

/**
 * Controller class for info-laboral stage
 */
public class LaboralController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    /**
     * GoogleSheets element responsible for fetching the data from the database.
     */
    private final GoogleSheets sheets = new GoogleSheets();

    /**
     * Button used to update the current information
     */
    @FXML
    public Button updateInfo;

    public LaboralController() throws GeneralSecurityException, IOException {
    }

    /**
     * Method to switch to the main stage from the push of a button
     * @param event trigger action
     * @throws IOException
     */
    public void switchToMain(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("main.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("PROreclutamiento - Inicio");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Method to switch to the info-estudios stage from the push of a button
     * @param event trigger action
     * @throws IOException
     */
    public void switchToEstudios(ActionEvent event)throws IOException{
        root = FXMLLoader.load(getClass().getResource("info-estudios.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("PROreclutamiento - Estudios");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Method to switch to the info-personal stage from the push of a button
     * @param event trigger action
     * @throws IOException
     */
    public void switchToPersonal(ActionEvent event)throws IOException{
        root = FXMLLoader.load(getClass().getResource("info-personal.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("PROreclutamiento - Personal");
        stage.setScene(scene);
        stage.show();
    }
}
