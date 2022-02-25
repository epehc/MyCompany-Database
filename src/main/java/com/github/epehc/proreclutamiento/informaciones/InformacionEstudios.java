package com.github.epehc.proreclutamiento.informaciones;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class InformacionEstudios {

    //Informacion de estudios
    //Doctorado
    StringProperty doctoradoInstitucion;
    StringProperty doctoradoEstudio;
    StringProperty doctoradoGrado;
    //Mestria
    StringProperty maestriaInstitucion;
    StringProperty maestriaEstudio;
    StringProperty maestriaGrado;
    //Licenciatura
    StringProperty licenciaturaInstitucion;
    StringProperty licenciaturaEstudio;
    StringProperty licenciaturaGrado;
    //Tecnico
    StringProperty tecnicoInstitucion;
    StringProperty tecnicoEstudio;
    StringProperty tecnicoGrado;
    //Colegio
    StringProperty colegioInstitucion;
    StringProperty colegioEstudio;
    StringProperty colegioGrado;
    //Otros estudios
    StringProperty otrosEstudios;

    public InformacionEstudios() {
        this.doctoradoInstitucion = new SimpleStringProperty();
        this.doctoradoEstudio = new SimpleStringProperty();
        this.doctoradoGrado = new SimpleStringProperty();
        this.maestriaInstitucion = new SimpleStringProperty();
        this.maestriaEstudio = new SimpleStringProperty();
        this.maestriaGrado = new SimpleStringProperty();
        this.licenciaturaInstitucion = new SimpleStringProperty();
        this.licenciaturaEstudio = new SimpleStringProperty();
        this.licenciaturaGrado = new SimpleStringProperty();
        this.tecnicoInstitucion = new SimpleStringProperty();
        this.tecnicoEstudio = new SimpleStringProperty();
        this.tecnicoGrado = new SimpleStringProperty();
        this.colegioInstitucion = new SimpleStringProperty();
        this.colegioEstudio = new SimpleStringProperty();
        this.colegioGrado = new SimpleStringProperty();
        this.otrosEstudios = new SimpleStringProperty();
    }

    public InformacionEstudios(String doctoradoInstitucion, String doctoradoEstudio, String doctoradoGrado, String maestriaInstitucion,
                               String maestriaEstudio, String maestriaGrado, String licenciaturaInstitucion, String licenciaturaEstudio,
                               String licenciaturaGrado, String tecnicoInstitucion, String tecnicoEstudio, String tecnicoGrado,
                               String colegioInstitucion, String colegioEstudio, String colegioGrado, String otrosEstudios) {
        this.doctoradoInstitucion = new SimpleStringProperty(doctoradoInstitucion);
        this.doctoradoEstudio = new SimpleStringProperty(doctoradoEstudio);
        this.doctoradoGrado = new SimpleStringProperty(doctoradoGrado);
        this.maestriaInstitucion = new SimpleStringProperty(maestriaInstitucion);
        this.maestriaEstudio = new SimpleStringProperty(maestriaEstudio);
        this.maestriaGrado = new SimpleStringProperty(maestriaGrado);
        this.licenciaturaInstitucion = new SimpleStringProperty(licenciaturaInstitucion);
        this.licenciaturaEstudio = new SimpleStringProperty(licenciaturaEstudio);
        this.licenciaturaGrado = new SimpleStringProperty(licenciaturaGrado);
        this.tecnicoInstitucion = new SimpleStringProperty(tecnicoInstitucion);
        this.tecnicoEstudio = new SimpleStringProperty(tecnicoEstudio);
        this.tecnicoGrado = new SimpleStringProperty(tecnicoGrado);
        this.colegioInstitucion = new SimpleStringProperty(colegioInstitucion);
        this.colegioEstudio = new SimpleStringProperty(colegioEstudio);
        this.colegioGrado = new SimpleStringProperty(colegioGrado);
        this.otrosEstudios = new SimpleStringProperty(otrosEstudios);
    }

    public String getDoctoradoInstitucion() {
        return doctoradoInstitucion.get();
    }

    public StringProperty doctoradoInstitucionProperty() {
        return doctoradoInstitucion;
    }

    public void setDoctoradoInstitucion(String doctoradoInstitucion) {
        this.doctoradoInstitucion.set(doctoradoInstitucion);
    }

    public String getDoctoradoEstudio() {
        return doctoradoEstudio.get();
    }

    public StringProperty doctoradoEstudioProperty() {
        return doctoradoEstudio;
    }

    public void setDoctoradoEstudio(String doctoradoEstudio) {
        this.doctoradoEstudio.set(doctoradoEstudio);
    }

    public String getDoctoradoGrado() {
        return doctoradoGrado.get();
    }

    public StringProperty doctoradoGradoProperty() {
        return doctoradoGrado;
    }

    public void setDoctoradoGrado(String doctoradoGrado) {
        this.doctoradoGrado.set(doctoradoGrado);
    }

    public String getMaestriaInstitucion() {
        return maestriaInstitucion.get();
    }

    public StringProperty maestriaInstitucionProperty() {
        return maestriaInstitucion;
    }

    public void setMaestriaInstitucion(String maestriaInstitucion) {
        this.maestriaInstitucion.set(maestriaInstitucion);
    }

    public String getMaestriaEstudio() {
        return maestriaEstudio.get();
    }

    public StringProperty maestriaEstudioProperty() {
        return maestriaEstudio;
    }

    public void setMaestriaEstudio(String maestriaEstudio) {
        this.maestriaEstudio.set(maestriaEstudio);
    }

    public String getMaestriaGrado() {
        return maestriaGrado.get();
    }

    public StringProperty maestriaGradoProperty() {
        return maestriaGrado;
    }

    public void setMaestriaGrado(String maestriaGrado) {
        this.maestriaGrado.set(maestriaGrado);
    }

    public String getLicenciaturaInstitucion() {
        return licenciaturaInstitucion.get();
    }

    public StringProperty licenciaturaInstitucionProperty() {
        return licenciaturaInstitucion;
    }

    public void setLicenciaturaInstitucion(String licenciaturaInstitucion) {
        this.licenciaturaInstitucion.set(licenciaturaInstitucion);
    }

    public String getLicenciaturaEstudio() {
        return licenciaturaEstudio.get();
    }

    public StringProperty licenciaturaEstudioProperty() {
        return licenciaturaEstudio;
    }

    public void setLicenciaturaEstudio(String licenciaturaEstudio) {
        this.licenciaturaEstudio.set(licenciaturaEstudio);
    }

    public String getLicenciaturaGrado() {
        return licenciaturaGrado.get();
    }

    public StringProperty licenciaturaGradoProperty() {
        return licenciaturaGrado;
    }

    public void setLicenciaturaGrado(String licenciaturaGrado) {
        this.licenciaturaGrado.set(licenciaturaGrado);
    }

    public String getTecnicoInstitucion() {
        return tecnicoInstitucion.get();
    }

    public StringProperty tecnicoInstitucionProperty() {
        return tecnicoInstitucion;
    }

    public void setTecnicoInstitucion(String tecnicoInstitucion) {
        this.tecnicoInstitucion.set(tecnicoInstitucion);
    }

    public String getTecnicoEstudio() {
        return tecnicoEstudio.get();
    }

    public StringProperty tecnicoEstudioProperty() {
        return tecnicoEstudio;
    }

    public void setTecnicoEstudio(String tecnicoEstudio) {
        this.tecnicoEstudio.set(tecnicoEstudio);
    }

    public String getTecnicoGrado() {
        return tecnicoGrado.get();
    }

    public StringProperty tecnicoGradoProperty() {
        return tecnicoGrado;
    }

    public void setTecnicoGrado(String tecnicoGrado) {
        this.tecnicoGrado.set(tecnicoGrado);
    }

    public String getColegioInstitucion() {
        return colegioInstitucion.get();
    }

    public StringProperty colegioInstitucionProperty() {
        return colegioInstitucion;
    }

    public void setColegioInstitucion(String colegioInstitucion) {
        this.colegioInstitucion.set(colegioInstitucion);
    }

    public String getColegioEstudio() {
        return colegioEstudio.get();
    }

    public StringProperty colegioEstudioProperty() {
        return colegioEstudio;
    }

    public void setColegioEstudio(String colegioEstudio) {
        this.colegioEstudio.set(colegioEstudio);
    }

    public String getColegioGrado() {
        return colegioGrado.get();
    }

    public StringProperty colegioGradoProperty() {
        return colegioGrado;
    }

    public void setColegioGrado(String colegioGrado) {
        this.colegioGrado.set(colegioGrado);
    }

    public String getOtrosEstudios() {
        return otrosEstudios.get();
    }

    public StringProperty otrosEstudiosProperty() {
        return otrosEstudios;
    }

    public void setOtrosEstudios(String otrosEstudios) {
        this.otrosEstudios.set(otrosEstudios);
    }
}
