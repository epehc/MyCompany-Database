package com.github.epehc.proreclutamiento.controllers;

import com.github.epehc.proreclutamiento.google.GoogleSheets;
import com.github.epehc.proreclutamiento.informaciones.InformacionLaboral;
import com.github.epehc.proreclutamiento.informaciones.InformacionReferencias;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.util.ResourceBundle;

/**
 * Controller class for info-laboral stage
 */
public class LaboralController implements Initializable {
    private Stage stage;
    private Scene scene;
    private Parent root;

    private InformacionLaboral informacionLaboral;
    private InformacionReferencias informacionReferencias;

    @FXML
    private Label labelNoDeDpiActual;
    @FXML
    private Label labelCandidatoActual;

    @FXML
    private TextArea taReferencias1;
    @FXML
    private TextArea taReferencias2;
    @FXML
    private TextArea taReferencias3;
    @FXML
    private TextArea taReferencias4;

    @FXML
    private TextArea taResponsabilidades1;
    @FXML
    private TextArea taResponsabilidades2;
    @FXML
    private TextArea taResponsabilidades3;
    @FXML
    private TextArea taResponsabilidades4;

    @FXML
    private TextField tfDireccionEmpresa1;
    @FXML
    private TextField tfDireccionEmpresa2;
    @FXML
    private TextField tfDireccionEmpresa3;
    @FXML
    private TextField tfDireccionEmpresa4;

    @FXML
    private TextField tfFechaFinEmpresa1;
    @FXML
    private TextField tfFechaFinEmpresa2;
    @FXML
    private TextField tfFechaFinEmpresa3;
    @FXML
    private TextField tfFechaFinEmpresa4;

    @FXML
    private TextField tfFechaInicioEmpresa1;
    @FXML
    private TextField tfFechaInicioEmpresa2;
    @FXML
    private TextField tfFechaInicioEmpresa3;
    @FXML
    private TextField tfFechaInicioEmpresa4;

    @FXML
    private TextField tfMotivoSalida1;
    @FXML
    private TextField tfMotivoSalida2;
    @FXML
    private TextField tfMotivoSalida3;
    @FXML
    private TextField tfMotivoSalida4;

    @FXML
    private TextField tfNombreEmpresa1;
    @FXML
    private TextField tfNombreEmpresa2;
    @FXML
    private TextField tfNombreEmpresa3;
    @FXML
    private TextField tfNombreEmpresa4;

    @FXML
    private TextField tfNombreJefe1;
    @FXML
    private TextField tfNombreJefe2;
    @FXML
    private TextField tfNombreJefe3;
    @FXML
    private TextField tfNombreJefe4;

    @FXML
    private TextField tfPuestoEmpresa1;
    @FXML
    private TextField tfPuestoEmpresa2;
    @FXML
    private TextField tfPuestoEmpresa3;
    @FXML
    private TextField tfPuestoEmpresa4;

    @FXML
    private TextField tfSalario1;
    @FXML
    private TextField tfSalario2;
    @FXML
    private TextField tfSalario3;
    @FXML
    private TextField tfSalario4;

    @FXML
    private TextField tfTelefonoEmpresa1;
    @FXML
    private TextField tfTelefonoEmpresa2;
    @FXML
    private TextField tfTelefonoEmpresa3;
    @FXML
    private TextField tfTelefonoEmpresa4;

    @FXML
    private TextField tfTelefonoJefe1;
    @FXML
    private TextField tfTelefonoJefe2;
    @FXML
    private TextField tfTelefonoJefe3;
    @FXML
    private TextField tfTelefonoJefe4;

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
        informacionLaboral = MainController.sheets.getInformacionLaboral(MainController.noDeDpiActual.get());
        informacionReferencias = new InformacionReferencias();

        taReferencias1.textProperty().bindBidirectional(informacionReferencias.referencias1Property());
        taReferencias2.textProperty().bindBidirectional(informacionReferencias.referencias2Property());
        taReferencias3.textProperty().bindBidirectional(informacionReferencias.referencias3Property());
        taReferencias4.textProperty().bindBidirectional(informacionReferencias.referencias4Property());

        labelCandidatoActual.setText(MainController.candidatoActual.get());
        labelNoDeDpiActual.setText(MainController.noDeDpiActual.get());

        tfNombreEmpresa1.textProperty().bindBidirectional(informacionLaboral.empresa1Property());
        tfDireccionEmpresa1.textProperty().bindBidirectional(informacionLaboral.direccionEmpresa1Property());
        tfFechaInicioEmpresa1.textProperty().bindBidirectional(informacionLaboral.fechaInicio1Property());
        tfTelefonoEmpresa1.textProperty().bindBidirectional(informacionLaboral.telefonoEmpresa1Property());
        tfPuestoEmpresa1.textProperty().bindBidirectional(informacionLaboral.puesto1Property());
        tfFechaFinEmpresa1.textProperty().bindBidirectional(informacionLaboral.fechaFin1Property());
        tfNombreJefe1.textProperty().bindBidirectional(informacionLaboral.jefe1Property());
        tfMotivoSalida1.textProperty().bindBidirectional(informacionLaboral.motivoSalida1Property());
        tfTelefonoJefe1.textProperty().bindBidirectional(informacionLaboral.telefonoJefe1Property());
        tfSalario1.textProperty().bindBidirectional(informacionLaboral.salario1Property());
        taResponsabilidades1.textProperty().bindBidirectional(informacionLaboral.responsabilidades1Property());

        tfNombreEmpresa2.textProperty().bindBidirectional(informacionLaboral.empresa2Property());
        tfDireccionEmpresa2.textProperty().bindBidirectional(informacionLaboral.direccionEmpresa2Property());
        tfFechaInicioEmpresa2.textProperty().bindBidirectional(informacionLaboral.fechaInicio2Property());
        tfTelefonoEmpresa2.textProperty().bindBidirectional(informacionLaboral.telefonoEmpresa2Property());
        tfPuestoEmpresa2.textProperty().bindBidirectional(informacionLaboral.puesto2Property());
        tfFechaFinEmpresa2.textProperty().bindBidirectional(informacionLaboral.fechaFin2Property());
        tfNombreJefe2.textProperty().bindBidirectional(informacionLaboral.jefe2Property());
        tfMotivoSalida2.textProperty().bindBidirectional(informacionLaboral.motivoSalida2Property());
        tfTelefonoJefe2.textProperty().bindBidirectional(informacionLaboral.telefonoJefe2Property());
        tfSalario2.textProperty().bindBidirectional(informacionLaboral.salario2Property());
        taResponsabilidades2.textProperty().bindBidirectional(informacionLaboral.responsabilidades2Property());

        tfNombreEmpresa3.textProperty().bindBidirectional(informacionLaboral.empresa3Property());
        tfDireccionEmpresa3.textProperty().bindBidirectional(informacionLaboral.direccionEmpresa3Property());
        tfFechaInicioEmpresa3.textProperty().bindBidirectional(informacionLaboral.fechaInicio3Property());
        tfTelefonoEmpresa3.textProperty().bindBidirectional(informacionLaboral.telefonoEmpresa3Property());
        tfPuestoEmpresa3.textProperty().bindBidirectional(informacionLaboral.puesto3Property());
        tfFechaFinEmpresa3.textProperty().bindBidirectional(informacionLaboral.fechaFin3Property());
        tfNombreJefe3.textProperty().bindBidirectional(informacionLaboral.jefe3Property());
        tfMotivoSalida3.textProperty().bindBidirectional(informacionLaboral.motivoSalida3Property());
        tfTelefonoJefe3.textProperty().bindBidirectional(informacionLaboral.telefonoJefe3Property());
        tfSalario3.textProperty().bindBidirectional(informacionLaboral.salario3Property());
        taResponsabilidades3.textProperty().bindBidirectional(informacionLaboral.responsabilidades3Property());

        tfNombreEmpresa4.textProperty().bindBidirectional(informacionLaboral.empresa4Property());
        tfDireccionEmpresa4.textProperty().bindBidirectional(informacionLaboral.direccionEmpresa4Property());
        tfFechaInicioEmpresa4.textProperty().bindBidirectional(informacionLaboral.fechaInicio4Property());
        tfTelefonoEmpresa4.textProperty().bindBidirectional(informacionLaboral.telefonoEmpresa4Property());
        tfPuestoEmpresa4.textProperty().bindBidirectional(informacionLaboral.puesto4Property());
        tfFechaFinEmpresa4.textProperty().bindBidirectional(informacionLaboral.fechaFin4Property());
        tfNombreJefe4.textProperty().bindBidirectional(informacionLaboral.jefe4Property());
        tfMotivoSalida4.textProperty().bindBidirectional(informacionLaboral.motivoSalida4Property());
        tfTelefonoJefe4.textProperty().bindBidirectional(informacionLaboral.telefonoJefe4Property());
        tfSalario4.textProperty().bindBidirectional(informacionLaboral.salario4Property());
        taResponsabilidades4.textProperty().bindBidirectional(informacionLaboral.responsabilidades4Property());
    }
}
