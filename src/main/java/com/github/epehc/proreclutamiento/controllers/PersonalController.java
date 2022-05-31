package com.github.epehc.proreclutamiento.controllers;

import com.github.epehc.proreclutamiento.google.GoogleSheets;
import com.github.epehc.proreclutamiento.informaciones.InformacionPersonal;
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
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.util.ResourceBundle;

/**
 * Controller class for info-personal stage
 */
public class PersonalController implements Initializable {
    private Stage stage;
    private Scene scene;
    private Parent root;

    private InformacionPersonal informacionPersonal;

    @FXML
    private Label labelNoDeDpiActual;
    @FXML
    private Label labelCandidatoActual;

    @FXML
    private TextArea taCalle;

    @FXML
    private TextArea taAdjetivos;

    @FXML
    private TextField tfAspiracion;

    @FXML
    private TextField tfBebe;

    @FXML
    private TextField tfCorreo;

    @FXML
    private TextField tfCuantoBebe;

    @FXML
    private TextField tfCuantoFuma;

    @FXML
    private TextField tfDepartamento;

    @FXML
    private TextField tfDpi;

    @FXML
    private TextField tfDrogas;

    @FXML
    private TextField tfEdad;

    @FXML
    private TextField tfEntero;

    @FXML
    private TextField tfEstadoCivil;

    @FXML
    private TextField tfEstudiosMasAltos;

    @FXML
    private TextField tfExterior;

    @FXML
    private TextField tfFechaAplicacion;

    @FXML
    private TextField tfFechaExpiracion;

    @FXML
    private TextField tfFechaNacimiento;

    @FXML
    private TextField tfFuma;

    @FXML
    private TextField tfGenero;

    @FXML
    private TextField tfIdiomas;

    @FXML
    private TextField tfInterior;

    @FXML
    private TextField tfLicencia;

    @FXML
    private TextField tfMarcaVehiculo;

    @FXML
    private TextField tfMunicipio;

    @FXML
    private TextField tfNacionalidad;

    @FXML
    private TextField tfNoCelular;

    @FXML
    private TextField tfNoTelefono;

    @FXML
    private TextField tfNombre;

    @FXML
    private TextField tfNombreContacto;

    @FXML
    private TextField tfNombreConyuge;

    @FXML
    private TextField tfNombreHermano1;

    @FXML
    private TextField tfNombreHermano2;

    @FXML
    private TextField tfNombreMadre;

    @FXML
    private TextField tfNombrePadre;

    @FXML
    private TextField tfPartidoPolitico;

    @FXML
    private TextField tfPersonasDependientes;

    @FXML
    private TextField tfPuesto;

    @FXML
    private TextField tfReligion;

    @FXML
    private TextField tfResidencia;

    @FXML
    private TextField tfSindicato;

    @FXML
    private TextField tfSoftware;

    @FXML
    private TextField tfTatuajes;

    @FXML
    private TextField tfTelefonoContacto;

    @FXML
    private TextField tfTelefonoConyuge;

    @FXML
    private TextField tfTelefonoHermano1;

    @FXML
    private TextField tfTelefonoHermano2;

    @FXML
    private TextField tfTelefonoMadre;

    @FXML
    private TextField tfTelefonoPadre;

    @FXML
    private TextField tfTiempoConduciendo;

    @FXML
    private TextField tfTipoLicencia;

    @FXML
    private TextField tfTrabajoContacto;

    @FXML
    private TextField tfTrabajoConyuge;

    @FXML
    private TextField tfTrabajoHermano1;

    @FXML
    private TextField tfTrabajoHermano2;

    @FXML
    private TextField tfTrabajoMadre;

    @FXML
    private TextField tfTrabajoPadre;

    @FXML
    private TextField tfVehiculo;

    @FXML
    private TextField tfViveCon;

    @FXML
    private TextField tfZona;

    /**
     * GoogleSheets element responsible for fetching the data from the database.
     */
    private final GoogleSheets sheets = new GoogleSheets();

    /**
     * Button used to update the current information
     */
    @FXML
    public Button updateInfo;

    public PersonalController() throws GeneralSecurityException, IOException {
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
     * Method to switch to the info-estudios stage from the push of a button
     * @param event trigger action
     * @throws IOException
     */
    public void switchToEstudios(ActionEvent event)throws IOException{
        root = FXMLLoader.load(getClass().getResource("info-estudios.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("MyCompany - Estudios");
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

    public void updateInformation() throws IOException {
        MainController.sheets.updateInformacionPersonal(informacionPersonal);
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

        informacionPersonal = MainController.sheets.getInformacionPersonal(MainController.noDeDpiActual.get());
        labelCandidatoActual.setText(MainController.candidatoActual.get());
        labelNoDeDpiActual.setText(MainController.noDeDpiActual.get());

        //PersonalInformation
        tfDpi.textProperty().bindBidirectional(informacionPersonal.dpiProperty());
        tfDpi.setEditable(false);
        tfFechaAplicacion.textProperty().bindBidirectional(informacionPersonal.fechaProperty());
        tfNombre.textProperty().bindBidirectional(informacionPersonal.nombreProperty());
        tfPuesto.textProperty().bindBidirectional(informacionPersonal.puestoProperty());
        tfEntero.textProperty().bindBidirectional(informacionPersonal.comoEnteroProperty());
        tfGenero.textProperty().bindBidirectional(informacionPersonal.generoProperty());
        tfNoTelefono.textProperty().bindBidirectional(informacionPersonal.noTelefonoProperty());
        tfNoCelular.textProperty().bindBidirectional(informacionPersonal.noCelularProperty());
        tfCorreo.textProperty().bindBidirectional(informacionPersonal.correoProperty());
        tfFechaNacimiento.textProperty().bindBidirectional(informacionPersonal.fechaNacimientoProperty());
        tfEdad.textProperty().bindBidirectional(informacionPersonal.edadProperty());
        tfViveCon.textProperty().bindBidirectional(informacionPersonal.viveConProperty());
        tfNacionalidad.textProperty().bindBidirectional(informacionPersonal.viveConProperty());
        tfEstadoCivil.textProperty().bindBidirectional(informacionPersonal.estadoCivilProperty());
        tfPersonasDependientes.textProperty().bindBidirectional(informacionPersonal.personasDependientesProperty());
        tfLicencia.textProperty().bindBidirectional(informacionPersonal.licenciaProperty());
        tfTipoLicencia.textProperty().bindBidirectional(informacionPersonal.tipoLicenciaProperty());
        tfFechaExpiracion.textProperty().bindBidirectional(informacionPersonal.fechaExpiracionLicenciaProperty());
        tfTiempoConduciendo.textProperty().bindBidirectional(informacionPersonal.cantidadTiempoManejandoProperty());
        tfVehiculo.textProperty().bindBidirectional(informacionPersonal.poseeVehiculoProperty());
        tfMarcaVehiculo.textProperty().bindBidirectional(informacionPersonal.vehiculoProperty());
        tfAspiracion.textProperty().bindBidirectional(informacionPersonal.aspiracionSalarialProperty());
        tfReligion.textProperty().bindBidirectional(informacionPersonal.religionProperty());
        tfInterior.textProperty().bindBidirectional(informacionPersonal.viajarInteriorProperty());
        tfExterior.textProperty().bindBidirectional(informacionPersonal.viajarExtranjeroProperty());
        tfIdiomas.textProperty().bindBidirectional(informacionPersonal.idiomasManejadosProperty());
        tfSoftware.textProperty().bindBidirectional(informacionPersonal.softwareManejadoProperty());
        tfPartidoPolitico.textProperty().bindBidirectional(informacionPersonal.partidoPoliticoProperty());
        tfSindicato.textProperty().bindBidirectional(informacionPersonal.sindicatoProperty());
        taAdjetivos.textProperty().bindBidirectional(informacionPersonal.adjetivosProperty());
        tfFuma.textProperty().bindBidirectional(informacionPersonal.fumaProperty());
        tfCuantoFuma.textProperty().bindBidirectional(informacionPersonal.fumaFrecuenciaProperty());
        tfBebe.textProperty().bindBidirectional(informacionPersonal.alcoholProperty());
        tfCuantoBebe.textProperty().bindBidirectional(informacionPersonal.alcoholFrecuenciaProperty());
        tfDrogas.textProperty().bindBidirectional(informacionPersonal.drogasProperty());
        tfTatuajes.textProperty().bindBidirectional(informacionPersonal.tatuajesProperty());
        tfResidencia.textProperty().bindBidirectional(informacionPersonal.paisResidenciaProperty());
        taCalle.textProperty().bindBidirectional(informacionPersonal.calleProperty());
        tfZona.textProperty().bindBidirectional(informacionPersonal.zonaProperty());
        tfMunicipio.textProperty().bindBidirectional(informacionPersonal.municipioProperty());
        tfDepartamento.textProperty().bindBidirectional(informacionPersonal.departamentoProperty());


        //Family Information

        tfNombreConyuge.textProperty().bindBidirectional(informacionPersonal.nombreConyugeProperty());
        tfTelefonoConyuge.textProperty().bindBidirectional(informacionPersonal.telefonoConyugeProperty());
        tfTrabajoConyuge.textProperty().bindBidirectional(informacionPersonal.trabajoConyugeProperty());

        tfNombrePadre.textProperty().bindBidirectional(informacionPersonal.nombrePapaProperty());
        tfTelefonoPadre.textProperty().bindBidirectional(informacionPersonal.telefonoPapaProperty());
        tfTrabajoPadre.textProperty().bindBidirectional(informacionPersonal.trabajoPapaProperty());

        tfNombreMadre.textProperty().bindBidirectional(informacionPersonal.nombreMamaProperty());
        tfTelefonoMadre.textProperty().bindBidirectional(informacionPersonal.telefonoMamaProperty());
        tfTrabajoMadre.textProperty().bindBidirectional(informacionPersonal.trabajoMamaProperty());

        tfNombreHermano1.textProperty().bindBidirectional(informacionPersonal.nombreHermano1Property());
        tfTelefonoHermano1.textProperty().bindBidirectional(informacionPersonal.telefonoHermano1Property());
        tfTrabajoHermano1.textProperty().bindBidirectional(informacionPersonal.trabajoHermano1Property());

        tfNombreHermano2.textProperty().bindBidirectional(informacionPersonal.nombreHermano2Property());
        tfTelefonoHermano2.textProperty().bindBidirectional(informacionPersonal.telefonoHermano2Property());
        tfTrabajoHermano2.textProperty().bindBidirectional(informacionPersonal.trabajoHermano2Property());

        tfNombreContacto.textProperty().bindBidirectional(informacionPersonal.nombreConocidoProperty());
        tfTelefonoContacto.textProperty().bindBidirectional(informacionPersonal.telefonoConocidoProperty());
        tfTrabajoContacto.textProperty().bindBidirectional(informacionPersonal.trabajoConocidoProperty());
    }
}
