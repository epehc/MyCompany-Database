package com.github.epehc.proreclutamiento.informaciones;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Class to represent the information in regards to the paperwork a candidate should send over to the recruiter
 */
public class InformacionPapeleria {


    StringProperty papeleriaCompleta;

    StringProperty dpi;
    StringProperty rtu;
    StringProperty antecedentesPenales;
    StringProperty antecedentesPoliciales;
    StringProperty reciboServicios;
    StringProperty constanciasEstudios;
    StringProperty constanciasLaborales;
    StringProperty cv;
    StringProperty referenciasLaborales;
    StringProperty cartasRecomendacion;


    //Optionals
    StringProperty pasaporte;
    StringProperty constanciaResidencia;
    StringProperty carneVacunacion;
    StringProperty tarjetaSalud;
    StringProperty tarjetaPulmones;
    StringProperty tarjetaManipulacionAlimentos;

    public InformacionPapeleria(){
        this.papeleriaCompleta = new SimpleStringProperty();
        this.dpi = new SimpleStringProperty();
        this.rtu = new SimpleStringProperty();
        this.antecedentesPenales = new SimpleStringProperty();
        this.antecedentesPoliciales = new SimpleStringProperty();
        this.reciboServicios = new SimpleStringProperty();
        this.constanciasEstudios = new SimpleStringProperty();
        this.constanciasLaborales = new SimpleStringProperty();
        this.cv = new SimpleStringProperty();
        this.referenciasLaborales = new SimpleStringProperty();
        this.cartasRecomendacion = new SimpleStringProperty();
        this.pasaporte = new SimpleStringProperty();
        this.constanciaResidencia = new SimpleStringProperty();
        this.carneVacunacion = new SimpleStringProperty();
        this.tarjetaSalud = new SimpleStringProperty();
        this.tarjetaPulmones = new SimpleStringProperty();
        this.tarjetaManipulacionAlimentos = new SimpleStringProperty();
    }

    public InformacionPapeleria(String papeleriaCompleta, String dpi, String rtu, String antecedentesPenales,
                                String antecedentesPoliciales, String reciboServicios, String constanciasEstudios,
                                String constanciasLaborales, String cv, String referenciasLaborales, String cartasRecomendacion,
                                String pasaporte, String constanciaResidencia, String carneVacunacion, String tarjetaSalud,
                                String tarjetaPulmones, String tarjetaManipulacionAlimentos) {
        this.papeleriaCompleta = new SimpleStringProperty(papeleriaCompleta);
        this.dpi = new SimpleStringProperty(dpi);
        this.rtu = new SimpleStringProperty(rtu);
        this.antecedentesPenales = new SimpleStringProperty(antecedentesPenales);
        this.antecedentesPoliciales = new SimpleStringProperty(antecedentesPoliciales);
        this.reciboServicios = new SimpleStringProperty(reciboServicios);
        this.constanciasEstudios = new SimpleStringProperty(constanciasEstudios);
        this.constanciasLaborales = new SimpleStringProperty(constanciasLaborales);
        this.cv = new SimpleStringProperty(cv);
        this.referenciasLaborales = new SimpleStringProperty(referenciasLaborales);
        this.cartasRecomendacion = new SimpleStringProperty(cartasRecomendacion);
        this.pasaporte = new SimpleStringProperty(pasaporte);
        this.constanciaResidencia = new SimpleStringProperty(constanciaResidencia);
        this.carneVacunacion = new SimpleStringProperty(carneVacunacion);
        this.tarjetaSalud = new SimpleStringProperty(tarjetaSalud);
        this.tarjetaPulmones = new SimpleStringProperty(tarjetaPulmones);
        this.tarjetaManipulacionAlimentos = new SimpleStringProperty(tarjetaManipulacionAlimentos);
    }

    public String getPapeleriaCompleta() {
        return papeleriaCompleta.get();
    }

    public StringProperty papeleriaCompletaProperty() {
        return papeleriaCompleta;
    }

    public String getDpi() {
        return dpi.get();
    }

    public StringProperty dpiProperty() {
        return dpi;
    }

    public String getRtu() {
        return rtu.get();
    }

    public StringProperty rtuProperty() {
        return rtu;
    }

    public String getAntecedentesPenales() {
        return antecedentesPenales.get();
    }

    public StringProperty antecedentesPenalesProperty() {
        return antecedentesPenales;
    }

    public String getAntecedentesPoliciales() {
        return antecedentesPoliciales.get();
    }

    public StringProperty antecedentesPolicialesProperty() {
        return antecedentesPoliciales;
    }

    public String getReciboServicios() {
        return reciboServicios.get();
    }

    public StringProperty reciboServiciosProperty() {
        return reciboServicios;
    }

    public String getConstanciasEstudios() {
        return constanciasEstudios.get();
    }

    public StringProperty constanciasEstudiosProperty() {
        return constanciasEstudios;
    }

    public String getConstanciasLaborales() {
        return constanciasLaborales.get();
    }

    public StringProperty constanciasLaboralesProperty() {
        return constanciasLaborales;
    }

    public String getCv() {
        return cv.get();
    }

    public StringProperty cvProperty() {
        return cv;
    }

    public String getReferenciasLaborales() {
        return referenciasLaborales.get();
    }

    public StringProperty referenciasLaboralesProperty() {
        return referenciasLaborales;
    }

    public String getCartasRecomendacion() {
        return cartasRecomendacion.get();
    }

    public StringProperty cartasRecomendacionProperty() {
        return cartasRecomendacion;
    }

    public String getPasaporte() {
        return pasaporte.get();
    }

    public StringProperty pasaporteProperty() {
        return pasaporte;
    }

    public String getConstanciaResidencia() {
        return constanciaResidencia.get();
    }

    public StringProperty constanciaResidenciaProperty() {
        return constanciaResidencia;
    }

    public String getCarneVacunacion() {
        return carneVacunacion.get();
    }

    public StringProperty carneVacunacionProperty() {
        return carneVacunacion;
    }

    public String getTarjetaSalud() {
        return tarjetaSalud.get();
    }

    public StringProperty tarjetaSaludProperty() {
        return tarjetaSalud;
    }

    public String getTarjetaPulmones() {
        return tarjetaPulmones.get();
    }

    public StringProperty tarjetaPulmonesProperty() {
        return tarjetaPulmones;
    }

    public String getTarjetaManipulacionAlimentos() {
        return tarjetaManipulacionAlimentos.get();
    }

    public StringProperty tarjetaManipulacionAlimentosProperty() {
        return tarjetaManipulacionAlimentos;
    }

    public void setPapeleriaCompleta(String papeleriaCompleta) {
        this.papeleriaCompleta.set(papeleriaCompleta);
    }

    public void setDpi(String dpi) {
        this.dpi.set(dpi);
    }

    public void setRtu(String rtu) {
        this.rtu.set(rtu);
    }

    public void setAntecedentesPenales(String antecedentesPenales) {
        this.antecedentesPenales.set(antecedentesPenales);
    }

    public void setAntecedentesPoliciales(String antecedentesPoliciales) {
        this.antecedentesPoliciales.set(antecedentesPoliciales);
    }

    public void setReciboServicios(String reciboServicios) {
        this.reciboServicios.set(reciboServicios);
    }

    public void setConstanciasEstudios(String constanciasEstudios) {
        this.constanciasEstudios.set(constanciasEstudios);
    }

    public void setConstanciasLaborales(String constanciasLaborales) {
        this.constanciasLaborales.set(constanciasLaborales);
    }

    public void setCv(String cv) {
        this.cv.set(cv);
    }

    public void setReferenciasLaborales(String referenciasLaborales) {
        this.referenciasLaborales.set(referenciasLaborales);
    }

    public void setCartasRecomendacion(String cartasRecomendacion) {
        this.cartasRecomendacion.set(cartasRecomendacion);
    }

    public void setPasaporte(String pasaporte) {
        this.pasaporte.set(pasaporte);
    }

    public void setConstanciaResidencia(String constanciaResidencia) {
        this.constanciaResidencia.set(constanciaResidencia);
    }

    public void setCarneVacunacion(String carneVacunacion) {
        this.carneVacunacion.set(carneVacunacion);
    }

    public void setTarjetaSalud(String tarjetaSalud) {
        this.tarjetaSalud.set(tarjetaSalud);
    }

    public void setTarjetaPulmones(String tarjetaPulmones) {
        this.tarjetaPulmones.set(tarjetaPulmones);
    }

    public void setTarjetaManipulacionAlimentos(String tarjetaManipulacionAlimentos) {
        this.tarjetaManipulacionAlimentos.set(tarjetaManipulacionAlimentos);
    }
}
