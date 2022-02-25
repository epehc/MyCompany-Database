package com.github.epehc.proreclutamiento.controllers;

import com.github.epehc.proreclutamiento.google.GoogleSheets;
import com.github.epehc.proreclutamiento.informaciones.InformacionInicio;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.util.ResourceBundle;

/**
 * Controller class for main stage
 */
public class MainController implements Initializable {
    private Stage stage;
    private Scene scene;
    private Parent root;

    static StringProperty noDeDpiActual = new SimpleStringProperty();
    static StringProperty candidatoActual = new SimpleStringProperty();

    /**
     * GoogleSheets element responsible for fetching the data from the database.
     */
    private final GoogleSheets sheets = new GoogleSheets();


    /**
     * ObservableList item to store the data to be displayed in the TableView item of this scene
     */
    private final ObservableList<InformacionInicio> tableContent = FXCollections.observableArrayList();

    /**
     * Label to show the currently selected candidate's name
     */
    @FXML
    private Label labelCandidatoActual;

    /**
     * Label to show the currently selected candidate's ID number
     */
    @FXML
    private Label labelNoDeDpiActual;

    @FXML
    private TextField dpiIngresado;


    @FXML
    TableView<InformacionInicio> table;
    @FXML
    TableColumn<InformacionInicio, String> dpis;
    @FXML
    TableColumn<InformacionInicio, String> fechas;
    @FXML
    TableColumn<InformacionInicio, String> nombres;
    @FXML
    TableColumn<InformacionInicio, String> puestos;

    /**
     * Constructor
     * @throws GeneralSecurityException
     * @throws IOException
     */
    public MainController() throws GeneralSecurityException, IOException {
    }

    /**
     * Method to switch to the info-estudios scene from the push of a button
     * @param event trigger action
     * @throws IOException
     */
    public void switchToEstudios(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("info-estudios.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("PROreclutamiento - Estudios");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Method to switch to the info-laboral scene from the push of a button
     * @param event trigger action
     * @throws IOException
     */
    public void switchToLaboral(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("info-laboral.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("PROreclutamiento - Laboral");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Method to switch to the info-personal scene from the push of a button
     * @param event trigger action
     * @throws IOException
     */
    public void switchToPersonal(ActionEvent event) throws IOException{
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

        //Load the candidate's information into the list
        try {
            tableContent.addAll(sheets.getTableViewContent());
        } catch (GeneralSecurityException | IOException e) {
            e.printStackTrace();
        }

        //set which attribute will be linked to each column
        dpis.setCellValueFactory(new PropertyValueFactory<>("dpi"));
        fechas.setCellValueFactory(new PropertyValueFactory<>("fecha"));
        nombres.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        puestos.setCellValueFactory(new PropertyValueFactory<>("puesto"));

        //Load the information into the table
        table.setItems(tableContent);
        table.setEditable(true);
        table.getSortOrder().add(fechas);

        dpis.setCellFactory(TextFieldTableCell.forTableColumn());


    }

    public void loadCandidato(ActionEvent e){
        for(InformacionInicio info: tableContent){
            if(dpiIngresado.getText().equals(info.getDpi())){
                labelNoDeDpiActual.setText(dpiIngresado.getText());
                noDeDpiActual.set(labelNoDeDpiActual.getText());
                labelCandidatoActual.setText(info.getNombre());
                candidatoActual.set(labelCandidatoActual.getText());
            }
        }
    }

}
