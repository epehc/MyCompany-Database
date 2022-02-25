package com.github.epehc.proreclutamiento.informaciones;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class InformacionReferencias {

    private StringProperty dpi;

    private StringProperty referencias1;

    private StringProperty referencias2;

    private StringProperty referencias3;

    private StringProperty referencias4;

    public InformacionReferencias() {
        this.dpi = new SimpleStringProperty();
        this.referencias1 = new SimpleStringProperty();
        this.referencias2 = new SimpleStringProperty();
        this.referencias3 = new SimpleStringProperty();
        this.referencias4 = new SimpleStringProperty();
    }

    public InformacionReferencias(String dpi, String referencias1, String referencias2, String referencias3, String referencias4) {
        this.dpi = new SimpleStringProperty(dpi);
        this.referencias1 = new SimpleStringProperty(referencias1);
        this.referencias2 = new SimpleStringProperty(referencias2);
        this.referencias3 = new SimpleStringProperty(referencias3);
        this.referencias4 = new SimpleStringProperty(referencias4);
    }

    public String getDpi() {
        return dpi.get();
    }

    public StringProperty dpiProperty() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi.set(dpi);
    }

    public String getReferencias1() {
        return referencias1.get();
    }

    public StringProperty referencias1Property() {
        return referencias1;
    }

    public void setReferencias1(String referencias1) {
        this.referencias1.set(referencias1);
    }

    public String getReferencias2() {
        return referencias2.get();
    }

    public StringProperty referencias2Property() {
        return referencias2;
    }

    public void setReferencias2(String referencias2) {
        this.referencias2.set(referencias2);
    }

    public String getReferencias3() {
        return referencias3.get();
    }

    public StringProperty referencias3Property() {
        return referencias3;
    }

    public void setReferencias3(String referencias3) {
        this.referencias3.set(referencias3);
    }

    public String getReferencias4() {
        return referencias4.get();
    }

    public StringProperty referencias4Property() {
        return referencias4;
    }

    public void setReferencias4(String referencias4) {
        this.referencias4.set(referencias4);
    }
}
