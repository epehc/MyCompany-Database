package com.github.epehc.proreclutamiento.controllers;

import com.github.epehc.proreclutamiento.google.GoogleSheets;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.util.ResourceBundle;

/**
 * Controller class for info-estudios stage
 */
public class EstudiosController implements Initializable {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Label labelNoDeDpiActual;
    @FXML
    private Label labelCandidatoActual;



    /**
     * GoogleSheets element responsible for fetching the data from the database.
     */
    private final GoogleSheets sheets = new GoogleSheets();

    /**
     * Button used to update the current information
     */
    @FXML
    public Button updateInfo;

    public EstudiosController() throws GeneralSecurityException, IOException {
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
     * Method to switch to the info-laboral stage from the push of a button
     * @param event trigger action
     * @throws IOException
     */
    public void switchToLaboral(ActionEvent event)throws IOException{
        root = FXMLLoader.load(getClass().getResource("info-laboral.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("PROreclutamiento - Laboral");
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

    /**
     * Called to initialize a controller after its root element has been
     * completely processed.
     *
     * @param location  The location used to resolve relative paths for the root object, or
     *                  {@code null} if the location is not known.
     * @param resources The resources used to localize the root object, or {@code null} if
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        labelCandidatoActual.setText(MainController.candidatoActual.get());
        labelNoDeDpiActual.setText(MainController.noDeDpiActual.get());

    }
}
