package com.github.epehc.proreclutamiento.controllers;

import com.github.epehc.proreclutamiento.google.GoogleSheets;
import com.github.epehc.proreclutamiento.informaciones.InformacionInicio;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.security.GeneralSecurityException;
import java.util.ResourceBundle;

/**
 * Controller class for Main Window (Inicio)
 */
public class MainController implements Initializable {
    private Stage stage;
    private Scene scene;
    private Parent root;
    private GoogleSheets sheets = new GoogleSheets();
    private ObservableList<InformacionInicio> tableContent = FXCollections.observableArrayList();

    @FXML
    private Label candidatoActual;
    @FXML
    private Label noDeDpiActual;
    @FXML
    private Button btnIngresar;

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
     * Called to initialize a controller after its root element has been
     * completely processed.
     *
     * @param location  The location used to resolve relative paths for the root object, or
     *                  {@code null} if the location is not known.
     * @param resources The resources used to localize the root object, or {@code null} if
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            tableContent.addAll(sheets.getTableViewContent());
        } catch (GeneralSecurityException | IOException e) {
            e.printStackTrace();
        }
        dpis.setCellValueFactory(new PropertyValueFactory<>("dpi"));
        fechas.setCellValueFactory(new PropertyValueFactory<>("fecha"));
        nombres.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        puestos.setCellValueFactory(new PropertyValueFactory<>("puesto"));

        table.setItems(tableContent);

    }

    public MainController() throws GeneralSecurityException, IOException {
    }

    public void switchToEstudios(ActionEvent event)throws IOException{
        root = FXMLLoader.load(getClass().getResource("info-estudios.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("PROreclutamiento - Estudios");
        stage.setScene(scene);
        stage.show();
    }

    public void switchToLaboral(ActionEvent event)throws IOException{
        root = FXMLLoader.load(getClass().getResource("info-laboral.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("PROreclutamiento - Laboral");
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
