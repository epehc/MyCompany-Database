package com.github.epehc.proreclutamiento.controllers;

import com.github.epehc.proreclutamiento.google.GoogleSheets;
import com.github.epehc.proreclutamiento.informaciones.InformacionEstudios;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
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

    private InformacionEstudios informacionEstudios;

    @FXML
    private Tab tabLicenciatura;

    @FXML
    private Tab tabTecnico;

    @FXML
    private Tab tabDoctorado;

    @FXML
    private Tab tabMaestria;

    @FXML
    private Label labelNoDeDpiActual;
    @FXML
    private Label labelCandidatoActual;

    @FXML
    private TextArea taOtrosEstudios;

    @FXML
    private TextField tvColegioEstudio;

    @FXML
    private TextField tvColegioGrado;

    @FXML
    private TextField tvColegioInstitucion;

    @FXML
    private TextField tvDoctoradoEstudio;

    @FXML
    private TextField tvDoctoradoGrado;

    @FXML
    private TextField tvDoctoradoInstitucion;

    @FXML
    private TextField tvLicenciaturaEstudio;

    @FXML
    private TextField tvLicenciaturaGrado;

    @FXML
    private TextField tvLicenciaturaInstitucion;

    @FXML
    private TextField tvMaestriaEstudio;

    @FXML
    private TextField tvMaestriaGrado;

    @FXML
    private TextField tvMaestriaInstitucion;

    @FXML
    private TextField tvTecnicoEstudio;

    @FXML
    private TextField tvTecnicoGrado;

    @FXML
    private TextField tvTecnicoInstitucion;

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
        stage.setTitle("MyCompany - Inicio");
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
        stage.setTitle("MyCompany - Laboral");
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
        stage.setTitle("MyCompany - Personal");
        stage.setScene(scene);
        stage.show();
    }

    public void updateInformation() throws IOException {
        MainController.sheets.updateInformacionEstudios(informacionEstudios);
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

        informacionEstudios = MainController.sheets.getInformacionEstudios(MainController.noDeDpiActual.get());
        String masAltos = informacionEstudios.getEstudiosMasAltos();

        if(masAltos.contains("Maestría")){
            tabDoctorado.setDisable(true);
        }else if(masAltos.contains("Licenciatura")){
            tabDoctorado.setDisable(true);
            tabMaestria.setDisable(true);
        }else if(masAltos.contains("Técnico")){
            tabDoctorado.setDisable(true);
            tabMaestria.setDisable(true);
            tabLicenciatura.setDisable(true);
        }else if(masAltos.contains("Básicos")){
            tabDoctorado.setDisable(true);
            tabMaestria.setDisable(true);
            tabLicenciatura.setDisable(true);
            tabTecnico.setDisable(true);
        }



        labelCandidatoActual.setText(MainController.candidatoActual.get());
        labelNoDeDpiActual.setText(MainController.noDeDpiActual.get());

        /*Bind all textProperties bi-directionally to their InformacionEstudios counterparts, so that they initialize to the
        correct values, and so that they can update as well.
         */
        tvDoctoradoInstitucion.textProperty().bindBidirectional(informacionEstudios.doctoradoInstitucionProperty());
        tvDoctoradoEstudio.textProperty().bindBidirectional(informacionEstudios.doctoradoEstudioProperty());
        tvDoctoradoGrado.textProperty().bindBidirectional(informacionEstudios.doctoradoGradoProperty());

        tvMaestriaInstitucion.textProperty().bindBidirectional(informacionEstudios.maestriaInstitucionProperty());
        tvMaestriaEstudio.textProperty().bindBidirectional(informacionEstudios.maestriaEstudioProperty());
        tvMaestriaGrado.textProperty().bindBidirectional(informacionEstudios.maestriaGradoProperty());

        tvLicenciaturaInstitucion.textProperty().bindBidirectional(informacionEstudios.licenciaturaInstitucionProperty());
        tvLicenciaturaEstudio.textProperty().bindBidirectional(informacionEstudios.licenciaturaEstudioProperty());
        tvLicenciaturaGrado.textProperty().bindBidirectional(informacionEstudios.licenciaturaGradoProperty());

        tvTecnicoInstitucion.textProperty().bindBidirectional(informacionEstudios.tecnicoInstitucionProperty());
        tvTecnicoEstudio.textProperty().bindBidirectional(informacionEstudios.tecnicoEstudioProperty());
        tvTecnicoGrado.textProperty().bindBidirectional(informacionEstudios.tecnicoGradoProperty());

        tvColegioInstitucion.textProperty().bindBidirectional(informacionEstudios.colegioInstitucionProperty());
        tvColegioEstudio.textProperty().bindBidirectional(informacionEstudios.colegioEstudioProperty());
        tvColegioGrado.textProperty().bindBidirectional(informacionEstudios.colegioGradoProperty());

        taOtrosEstudios.textProperty().bindBidirectional(informacionEstudios.otrosEstudiosProperty());


    }
}
