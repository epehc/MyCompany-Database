package com.github.epehc.proreclutamiento.informaciones;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.ArrayList;

public class InformacionReferencias {

    private ArrayList<String> list;
    /*
    Referencia 1
     */
    private StringProperty nombreReferencia1;

    private StringProperty fechasReferencia1;

    private StringProperty puestoReferencia1;

    private StringProperty puestoEjercidoReferencia1;

    private StringProperty motivoSalidaReferencia1;

    private StringProperty descripcionReferencia1;


    /**
     * Referencia 2
     */
    private StringProperty nombreReferencia2;

    private StringProperty fechasReferencia2;

    private StringProperty puestoReferencia2;

    private StringProperty puestoEjercidoReferencia2;

    private StringProperty motivoSalidaReferencia2;

    private StringProperty descripcionReferencia2;


    /**
     * Referencia 3
     */
    private StringProperty nombreReferencia3;

    private StringProperty fechasReferencia3;

    private StringProperty puestoReferencia3;

    private StringProperty puestoEjercidoReferencia3;

    private StringProperty motivoSalidaReferencia3;

    private StringProperty descripcionReferencia3;


    /**
     * Referencia 4
     */
    private StringProperty nombreReferencia4;

    private StringProperty fechasReferencia4;

    private StringProperty puestoReferencia4;

    private StringProperty puestoEjercidoReferencia4;

    private StringProperty motivoSalidaReferencia4;

    private StringProperty descripcionReferencia4;


    public InformacionReferencias() {
        this.list = new ArrayList<>();
        this.nombreReferencia1 = new SimpleStringProperty();
        this.fechasReferencia1 = new SimpleStringProperty();
        this.puestoReferencia1 = new SimpleStringProperty();
        this.puestoEjercidoReferencia1 = new SimpleStringProperty();
        this.motivoSalidaReferencia1 = new SimpleStringProperty();
        this.descripcionReferencia1 = new SimpleStringProperty();

        this.nombreReferencia2 = new SimpleStringProperty();
        this.fechasReferencia2 = new SimpleStringProperty();
        this.puestoReferencia2 = new SimpleStringProperty();
        this.puestoEjercidoReferencia2 = new SimpleStringProperty();
        this.motivoSalidaReferencia2 = new SimpleStringProperty();
        this.descripcionReferencia2 = new SimpleStringProperty();

        this.nombreReferencia3 = new SimpleStringProperty();
        this.fechasReferencia3 = new SimpleStringProperty();
        this.puestoReferencia3 = new SimpleStringProperty();
        this.puestoEjercidoReferencia3 = new SimpleStringProperty();
        this.motivoSalidaReferencia3 = new SimpleStringProperty();
        this.descripcionReferencia3 = new SimpleStringProperty();

        this.nombreReferencia4 = new SimpleStringProperty();
        this.fechasReferencia4 = new SimpleStringProperty();
        this.puestoReferencia4 = new SimpleStringProperty();
        this.puestoEjercidoReferencia4 = new SimpleStringProperty();
        this.motivoSalidaReferencia4 = new SimpleStringProperty();
        this.descripcionReferencia4 = new SimpleStringProperty();
    }

    public InformacionReferencias(String nombreReferencia1, String fechasReferencia1, String puestoReferencia1, String puestoEjercidoReferencia1,
                                  String motivoSalida1, String descripcionReferencia1,
                                  String nombreReferencia2, String fechasReferencia2, String puestoReferencia2, String puestoEjercidoReferencia2,
                                  String motivoSalida2, String descripcionReferencia2,
                                  String nombreReferencia3, String fechasReferencia3, String puestoReferencia3, String puestoEjercidoReferencia3,
                                  String motivoSalida3, String descripcionReferencia3,
                                  String nombreReferencia4, String fechasReferencia4, String puestoReferencia4, String puestoEjercidoReferencia4,
                                  String motivoSalida4, String descripcionReferencia4){
        this.list = new ArrayList<>();

        this.nombreReferencia1 = new SimpleStringProperty(nombreReferencia1);
        this.fechasReferencia1 = new SimpleStringProperty(fechasReferencia1);
        this.puestoReferencia1 = new SimpleStringProperty(puestoReferencia1);
        this.puestoEjercidoReferencia1 = new SimpleStringProperty(puestoEjercidoReferencia1);
        this.motivoSalidaReferencia1 = new SimpleStringProperty(motivoSalida1);
        this.descripcionReferencia1 = new SimpleStringProperty(descripcionReferencia1);

        this.nombreReferencia2 = new SimpleStringProperty(nombreReferencia2);
        this.fechasReferencia2 = new SimpleStringProperty(fechasReferencia2);
        this.puestoReferencia2 = new SimpleStringProperty(puestoReferencia2);
        this.puestoEjercidoReferencia2 = new SimpleStringProperty(puestoEjercidoReferencia2);
        this.motivoSalidaReferencia2 = new SimpleStringProperty(motivoSalida2);
        this.descripcionReferencia2 = new SimpleStringProperty(descripcionReferencia2);

        this.nombreReferencia3 = new SimpleStringProperty(nombreReferencia3);
        this.fechasReferencia3 = new SimpleStringProperty(fechasReferencia3);
        this.puestoReferencia3 = new SimpleStringProperty(puestoReferencia3);
        this.puestoEjercidoReferencia3 = new SimpleStringProperty(puestoEjercidoReferencia3);
        this.motivoSalidaReferencia3 = new SimpleStringProperty(motivoSalida3);
        this.descripcionReferencia3 = new SimpleStringProperty(descripcionReferencia3);

        this.nombreReferencia4 = new SimpleStringProperty(nombreReferencia4);
        this.fechasReferencia4 = new SimpleStringProperty(fechasReferencia4);
        this.puestoReferencia4 = new SimpleStringProperty(puestoReferencia4);
        this.puestoEjercidoReferencia4 = new SimpleStringProperty(puestoEjercidoReferencia4);
        this.motivoSalidaReferencia4 = new SimpleStringProperty(motivoSalida4);
        this.descripcionReferencia4 = new SimpleStringProperty(descripcionReferencia4);

    }

    public ArrayList<String> getList(){
        list.add(getNombreReferencia1());
        list.add(getFechasReferencia1());
        list.add(getPuestoReferencia1());
        list.add(getPuestoEjercidoReferencia1());
        list.add(getMotivoSalidaReferencia1());
        list.add(getDescripcionReferencia1());

        list.add(getNombreReferencia2());
        list.add(getFechasReferencia2());
        list.add(getPuestoReferencia2());
        list.add(getPuestoEjercidoReferencia2());
        list.add(getMotivoSalidaReferencia2());
        list.add(getDescripcionReferencia2());

        list.add(getNombreReferencia3());
        list.add(getFechasReferencia3());
        list.add(getPuestoReferencia3());
        list.add(getPuestoEjercidoReferencia3());
        list.add(getMotivoSalidaReferencia3());
        list.add(getDescripcionReferencia3());

        list.add(getNombreReferencia4());
        list.add(getFechasReferencia4());
        list.add(getPuestoReferencia4());
        list.add(getPuestoEjercidoReferencia4());
        list.add(getMotivoSalidaReferencia4());
        list.add(getDescripcionReferencia4());

        return list;
    }

    public String getNombreReferencia1() {
        return nombreReferencia1.get();
    }

    public StringProperty nombreReferencia1Property() {
        return nombreReferencia1;
    }

    public void setNombreReferencia1(String nombreReferencia1) {
        this.nombreReferencia1.set(nombreReferencia1);
    }

    public String getFechasReferencia1() {
        return fechasReferencia1.get();
    }

    public StringProperty fechasReferencia1Property() {
        return fechasReferencia1;
    }

    public void setFechasReferencia1(String fechasReferencia1) {
        this.fechasReferencia1.set(fechasReferencia1);
    }

    public String getPuestoReferencia1() {
        return puestoReferencia1.get();
    }

    public StringProperty puestoReferencia1Property() {
        return puestoReferencia1;
    }

    public void setPuestoReferencia1(String puestoReferencia1) {
        this.puestoReferencia1.set(puestoReferencia1);
    }

    public String getPuestoEjercidoReferencia1() {
        return puestoEjercidoReferencia1.get();
    }

    public StringProperty puestoEjercidoReferencia1Property() {
        return puestoEjercidoReferencia1;
    }

    public void setPuestoEjercidoReferencia1(String puestoEjercidoReferencia1) {
        this.puestoEjercidoReferencia1.set(puestoEjercidoReferencia1);
    }

    public String getMotivoSalidaReferencia1() {
        return motivoSalidaReferencia1.get();
    }

    public StringProperty motivoSalidaReferencia1Property() {
        return motivoSalidaReferencia1;
    }

    public void setMotivoSalidaReferencia1(String motivoSalidaReferencia1) {
        this.motivoSalidaReferencia1.set(motivoSalidaReferencia1);
    }

    public String getDescripcionReferencia1() {
        return descripcionReferencia1.get();
    }

    public StringProperty descripcionReferencia1Property() {
        return descripcionReferencia1;
    }

    public void setDescripcionReferencia1(String descripcionReferencia1) {
        this.descripcionReferencia1.set(descripcionReferencia1);
    }

    public String getNombreReferencia2() {
        return nombreReferencia2.get();
    }

    public StringProperty nombreReferencia2Property() {
        return nombreReferencia2;
    }

    public void setNombreReferencia2(String nombreReferencia2) {
        this.nombreReferencia2.set(nombreReferencia2);
    }

    public String getFechasReferencia2() {
        return fechasReferencia2.get();
    }

    public StringProperty fechasReferencia2Property() {
        return fechasReferencia2;
    }

    public void setFechasReferencia2(String fechasReferencia2) {
        this.fechasReferencia2.set(fechasReferencia2);
    }

    public String getPuestoReferencia2() {
        return puestoReferencia2.get();
    }

    public StringProperty puestoReferencia2Property() {
        return puestoReferencia2;
    }

    public void setPuestoReferencia2(String puestoReferencia2) {
        this.puestoReferencia2.set(puestoReferencia2);
    }

    public String getPuestoEjercidoReferencia2() {
        return puestoEjercidoReferencia2.get();
    }

    public StringProperty puestoEjercidoReferencia2Property() {
        return puestoEjercidoReferencia2;
    }

    public void setPuestoEjercidoReferencia2(String puestoEjercidoReferencia2) {
        this.puestoEjercidoReferencia2.set(puestoEjercidoReferencia2);
    }

    public String getMotivoSalidaReferencia2() {
        return motivoSalidaReferencia2.get();
    }

    public StringProperty motivoSalidaReferencia2Property() {
        return motivoSalidaReferencia2;
    }

    public void setMotivoSalidaReferencia2(String motivoSalidaReferencia2) {
        this.motivoSalidaReferencia2.set(motivoSalidaReferencia2);
    }

    public String getDescripcionReferencia2() {
        return descripcionReferencia2.get();
    }

    public StringProperty descripcionReferencia2Property() {
        return descripcionReferencia2;
    }

    public void setDescripcionReferencia2(String descripcionReferencia2) {
        this.descripcionReferencia2.set(descripcionReferencia2);
    }

    public String getNombreReferencia3() {
        return nombreReferencia3.get();
    }

    public StringProperty nombreReferencia3Property() {
        return nombreReferencia3;
    }

    public void setNombreReferencia3(String nombreReferencia3) {
        this.nombreReferencia3.set(nombreReferencia3);
    }

    public String getFechasReferencia3() {
        return fechasReferencia3.get();
    }

    public StringProperty fechasReferencia3Property() {
        return fechasReferencia3;
    }

    public void setFechasReferencia3(String fechasReferencia3) {
        this.fechasReferencia3.set(fechasReferencia3);
    }

    public String getPuestoReferencia3() {
        return puestoReferencia3.get();
    }

    public StringProperty puestoReferencia3Property() {
        return puestoReferencia3;
    }

    public void setPuestoReferencia3(String puestoReferencia3) {
        this.puestoReferencia3.set(puestoReferencia3);
    }

    public String getPuestoEjercidoReferencia3() {
        return puestoEjercidoReferencia3.get();
    }

    public StringProperty puestoEjercidoReferencia3Property() {
        return puestoEjercidoReferencia3;
    }

    public void setPuestoEjercidoReferencia3(String puestoEjercidoReferencia3) {
        this.puestoEjercidoReferencia3.set(puestoEjercidoReferencia3);
    }

    public String getMotivoSalidaReferencia3() {
        return motivoSalidaReferencia3.get();
    }

    public StringProperty motivoSalidaReferencia3Property() {
        return motivoSalidaReferencia3;
    }

    public void setMotivoSalidaReferencia3(String motivoSalidaReferencia3) {
        this.motivoSalidaReferencia3.set(motivoSalidaReferencia3);
    }

    public String getDescripcionReferencia3() {
        return descripcionReferencia3.get();
    }

    public StringProperty descripcionReferencia3Property() {
        return descripcionReferencia3;
    }

    public void setDescripcionReferencia3(String descripcionReferencia3) {
        this.descripcionReferencia3.set(descripcionReferencia3);
    }

    public String getNombreReferencia4() {
        return nombreReferencia4.get();
    }

    public StringProperty nombreReferencia4Property() {
        return nombreReferencia4;
    }

    public void setNombreReferencia4(String nombreReferencia4) {
        this.nombreReferencia4.set(nombreReferencia4);
    }

    public String getFechasReferencia4() {
        return fechasReferencia4.get();
    }

    public StringProperty fechasReferencia4Property() {
        return fechasReferencia4;
    }

    public void setFechasReferencia4(String fechasReferencia4) {
        this.fechasReferencia4.set(fechasReferencia4);
    }

    public String getPuestoReferencia4() {
        return puestoReferencia4.get();
    }

    public StringProperty puestoReferencia4Property() {
        return puestoReferencia4;
    }

    public void setPuestoReferencia4(String puestoReferencia4) {
        this.puestoReferencia4.set(puestoReferencia4);
    }

    public String getPuestoEjercidoReferencia4() {
        return puestoEjercidoReferencia4.get();
    }

    public StringProperty puestoEjercidoReferencia4Property() {
        return puestoEjercidoReferencia4;
    }

    public void setPuestoEjercidoReferencia4(String puestoEjercidoReferencia4) {
        this.puestoEjercidoReferencia4.set(puestoEjercidoReferencia4);
    }

    public String getMotivoSalidaReferencia4() {
        return motivoSalidaReferencia4.get();
    }

    public StringProperty motivoSalidaReferencia4Property() {
        return motivoSalidaReferencia4;
    }

    public void setMotivoSalidaReferencia4(String motivoSalidaReferencia4) {
        this.motivoSalidaReferencia4.set(motivoSalidaReferencia4);
    }

    public String getDescripcionReferencia4() {
        return descripcionReferencia4.get();
    }

    public StringProperty descripcionReferencia4Property() {
        return descripcionReferencia4;
    }

    public void setDescripcionReferencia4(String descripcionReferencia4) {
        this.descripcionReferencia4.set(descripcionReferencia4);
    }
}
