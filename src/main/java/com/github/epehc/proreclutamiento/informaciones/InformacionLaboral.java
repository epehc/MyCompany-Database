package com.github.epehc.proreclutamiento.informaciones;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class InformacionLaboral {
    //Trabajo 1
    StringProperty empresa1;
    StringProperty fechaInicio1;
    StringProperty fechaFin1;
    StringProperty telefonoEmpresa1;
    StringProperty direccionEmpresa1;
    StringProperty puesto1;
    StringProperty jefe1;
    StringProperty telefonoJefe1;
    StringProperty salario1;
    StringProperty motivoSalida1;
    StringProperty responsabilidades1;
    StringProperty referencias1;

    //Trabajo 2
    StringProperty empresa2;
    StringProperty fechaInicio2;
    StringProperty fechaFin2;
    StringProperty telefonoEmpresa2;
    StringProperty direccionEmpresa2;
    StringProperty puesto2;
    StringProperty jefe2;
    StringProperty telefonoJefe2;
    StringProperty salario2;
    StringProperty motivoSalida2;
    StringProperty responsabilidades2;
    StringProperty referencias2;

    //Trabajo 3
    StringProperty empresa3;
    StringProperty fechaInicio3;
    StringProperty fechaFin3;
    StringProperty telefonoEmpresa3;
    StringProperty direccionEmpresa3;
    StringProperty puesto3;
    StringProperty jefe3;
    StringProperty telefonoJefe3;
    StringProperty salario3;
    StringProperty motivoSalida3;
    StringProperty responsabilidades3;
    StringProperty referencias3;

    //Trabajo 4
    StringProperty empresa4;
    StringProperty fechaInicio4;
    StringProperty fechaFin4;
    StringProperty telefonoEmpresa4;
    StringProperty direccionEmpresa4;
    StringProperty puesto4;
    StringProperty jefe4;
    StringProperty telefonoJefe4;
    StringProperty salario4;
    StringProperty motivoSalida4;
    StringProperty responsabilidades4;
    StringProperty referencias4;

    public InformacionLaboral(){

    }
    public InformacionLaboral(String empresa1, String fechaInicio1, String fechaFin1, String telefonoEmpresa1,
                              String direccionEmpresa1, String puesto1, String jefe1, String telefonoJefe1,
                              String salario1, String motivoSalida1, String responsabilidades1,
                              String referencias1, String empresa2, String fechaInicio2, String fechaFin2,
                              String telefonoEmpresa2, String direccionEmpresa2, String puesto2, String jefe2,
                              String telefonoJefe2, String salario2, String motivoSalida2,
                              String responsabilidades2, String referencias2, String empresa3,
                              String fechaInicio3, String fechaFin3, String telefonoEmpresa3,
                              String direccionEmpresa3, String puesto3, String jefe3, String telefonoJefe3,
                              String salario3, String motivoSalida3, String responsabilidades3,
                              String referencias3, String empresa4, String fechaInicio4, String fechaFin4,
                              String telefonoEmpresa4, String direccionEmpresa4, String puesto4, String jefe4,
                              String telefonoJefe4, String salario4, String motivoSalida4,
                              String responsabilidades4, String referencias4) {
        this.empresa1 = new SimpleStringProperty(empresa1);
        this.fechaInicio1 = new SimpleStringProperty(fechaInicio1);
        this.fechaFin1 = new SimpleStringProperty(fechaFin1);
        this.telefonoEmpresa1 = new SimpleStringProperty(telefonoEmpresa1);
        this.direccionEmpresa1 = new SimpleStringProperty(direccionEmpresa1);
        this.puesto1 = new SimpleStringProperty(puesto1);
        this.jefe1 = new SimpleStringProperty(jefe1);
        this.telefonoJefe1 = new SimpleStringProperty(telefonoJefe1);
        this.salario1 = new SimpleStringProperty(salario1);
        this.motivoSalida1 = new SimpleStringProperty(motivoSalida1);
        this.responsabilidades1 = new SimpleStringProperty(responsabilidades1);
        this.referencias1 = new SimpleStringProperty(referencias1);
        this.empresa2 = new SimpleStringProperty(empresa2);
        this.fechaInicio2 = new SimpleStringProperty(fechaInicio2);
        this.fechaFin2 = new SimpleStringProperty(fechaFin2);
        this.telefonoEmpresa2 = new SimpleStringProperty(telefonoEmpresa2);
        this.direccionEmpresa2 = new SimpleStringProperty(direccionEmpresa2);
        this.puesto2 = new SimpleStringProperty(puesto2);
        this.jefe2 = new SimpleStringProperty(jefe2);
        this.telefonoJefe2 = new SimpleStringProperty(telefonoJefe2);
        this.salario2 = new SimpleStringProperty(salario2);
        this.motivoSalida2 = new SimpleStringProperty(motivoSalida2);
        this.responsabilidades2 = new SimpleStringProperty(responsabilidades2);
        this.referencias2 = new SimpleStringProperty(referencias2);
        this.empresa3 = new SimpleStringProperty(empresa3);
        this.fechaInicio3 = new SimpleStringProperty(fechaInicio3);
        this.fechaFin3 = new SimpleStringProperty(fechaFin3);
        this.telefonoEmpresa3 = new SimpleStringProperty(telefonoEmpresa3);
        this.direccionEmpresa3 = new SimpleStringProperty(direccionEmpresa3);
        this.puesto3 = new SimpleStringProperty(puesto3);
        this.jefe3 = new SimpleStringProperty(jefe3);
        this.telefonoJefe3 = new SimpleStringProperty(telefonoJefe3);
        this.salario3 = new SimpleStringProperty(salario3);
        this.motivoSalida3 = new SimpleStringProperty(motivoSalida3);
        this.responsabilidades3 = new SimpleStringProperty(responsabilidades3);
        this.referencias3 = new SimpleStringProperty(referencias3);
        this.empresa4 = new SimpleStringProperty(empresa4);
        this.fechaInicio4 = new SimpleStringProperty(fechaInicio4);
        this.fechaFin4 = new SimpleStringProperty(fechaFin4);
        this.telefonoEmpresa4 = new SimpleStringProperty(telefonoEmpresa4);
        this.direccionEmpresa4 = new SimpleStringProperty(direccionEmpresa4);
        this.puesto4 = new SimpleStringProperty(puesto4);
        this.jefe4 = new SimpleStringProperty(jefe4);
        this.telefonoJefe4 = new SimpleStringProperty(telefonoJefe4);
        this.salario4 = new SimpleStringProperty(salario4);
        this.motivoSalida4 = new SimpleStringProperty(motivoSalida4);
        this.responsabilidades4 = new SimpleStringProperty(responsabilidades4);
        this.referencias4 = new SimpleStringProperty(referencias4);
    }

    public String getEmpresa1() {
        return empresa1.get();
    }

    public StringProperty empresa1Property() {
        return empresa1;
    }

    public void setEmpresa1(String empresa1) {
        this.empresa1.set(empresa1);
    }

    public String getFechaInicio1() {
        return fechaInicio1.get();
    }

    public StringProperty fechaInicio1Property() {
        return fechaInicio1;
    }

    public void setFechaInicio1(String fechaInicio1) {
        this.fechaInicio1.set(fechaInicio1);
    }

    public String getFechaFin1() {
        return fechaFin1.get();
    }

    public StringProperty fechaFin1Property() {
        return fechaFin1;
    }

    public void setFechaFin1(String fechaFin1) {
        this.fechaFin1.set(fechaFin1);
    }

    public String getTelefonoEmpresa1() {
        return telefonoEmpresa1.get();
    }

    public StringProperty telefonoEmpresa1Property() {
        return telefonoEmpresa1;
    }

    public void setTelefonoEmpresa1(String telefonoEmpresa1) {
        this.telefonoEmpresa1.set(telefonoEmpresa1);
    }

    public String getDireccionEmpresa1() {
        return direccionEmpresa1.get();
    }

    public StringProperty direccionEmpresa1Property() {
        return direccionEmpresa1;
    }

    public void setDireccionEmpresa1(String direccionEmpresa1) {
        this.direccionEmpresa1.set(direccionEmpresa1);
    }

    public String getPuesto1() {
        return puesto1.get();
    }

    public StringProperty puesto1Property() {
        return puesto1;
    }

    public void setPuesto1(String puesto1) {
        this.puesto1.set(puesto1);
    }

    public String getJefe1() {
        return jefe1.get();
    }

    public StringProperty jefe1Property() {
        return jefe1;
    }

    public void setJefe1(String jefe1) {
        this.jefe1.set(jefe1);
    }

    public String getTelefonoJefe1() {
        return telefonoJefe1.get();
    }

    public StringProperty telefonoJefe1Property() {
        return telefonoJefe1;
    }

    public void setTelefonoJefe1(String telefonoJefe1) {
        this.telefonoJefe1.set(telefonoJefe1);
    }

    public String getSalario1() {
        return salario1.get();
    }

    public StringProperty salario1Property() {
        return salario1;
    }

    public void setSalario1(String salario1) {
        this.salario1.set(salario1);
    }

    public String getMotivoSalida1() {
        return motivoSalida1.get();
    }

    public StringProperty motivoSalida1Property() {
        return motivoSalida1;
    }

    public void setMotivoSalida1(String motivoSalida1) {
        this.motivoSalida1.set(motivoSalida1);
    }

    public String getResponsabilidades1() {
        return responsabilidades1.get();
    }

    public StringProperty responsabilidades1Property() {
        return responsabilidades1;
    }

    public void setResponsabilidades1(String responsabilidades1) {
        this.responsabilidades1.set(responsabilidades1);
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

    public String getEmpresa2() {
        return empresa2.get();
    }

    public StringProperty empresa2Property() {
        return empresa2;
    }

    public void setEmpresa2(String empresa2) {
        this.empresa2.set(empresa2);
    }

    public String getFechaInicio2() {
        return fechaInicio2.get();
    }

    public StringProperty fechaInicio2Property() {
        return fechaInicio2;
    }

    public void setFechaInicio2(String fechaInicio2) {
        this.fechaInicio2.set(fechaInicio2);
    }

    public String getFechaFin2() {
        return fechaFin2.get();
    }

    public StringProperty fechaFin2Property() {
        return fechaFin2;
    }

    public void setFechaFin2(String fechaFin2) {
        this.fechaFin2.set(fechaFin2);
    }

    public String getTelefonoEmpresa2() {
        return telefonoEmpresa2.get();
    }

    public StringProperty telefonoEmpresa2Property() {
        return telefonoEmpresa2;
    }

    public void setTelefonoEmpresa2(String telefonoEmpresa2) {
        this.telefonoEmpresa2.set(telefonoEmpresa2);
    }

    public String getDireccionEmpresa2() {
        return direccionEmpresa2.get();
    }

    public StringProperty direccionEmpresa2Property() {
        return direccionEmpresa2;
    }

    public void setDireccionEmpresa2(String direccionEmpresa2) {
        this.direccionEmpresa2.set(direccionEmpresa2);
    }

    public String getPuesto2() {
        return puesto2.get();
    }

    public StringProperty puesto2Property() {
        return puesto2;
    }

    public void setPuesto2(String puesto2) {
        this.puesto2.set(puesto2);
    }

    public String getJefe2() {
        return jefe2.get();
    }

    public StringProperty jefe2Property() {
        return jefe2;
    }

    public void setJefe2(String jefe2) {
        this.jefe2.set(jefe2);
    }

    public String getTelefonoJefe2() {
        return telefonoJefe2.get();
    }

    public StringProperty telefonoJefe2Property() {
        return telefonoJefe2;
    }

    public void setTelefonoJefe2(String telefonoJefe2) {
        this.telefonoJefe2.set(telefonoJefe2);
    }

    public String getSalario2() {
        return salario2.get();
    }

    public StringProperty salario2Property() {
        return salario2;
    }

    public void setSalario2(String salario2) {
        this.salario2.set(salario2);
    }

    public String getMotivoSalida2() {
        return motivoSalida2.get();
    }

    public StringProperty motivoSalida2Property() {
        return motivoSalida2;
    }

    public void setMotivoSalida2(String motivoSalida2) {
        this.motivoSalida2.set(motivoSalida2);
    }

    public String getResponsabilidades2() {
        return responsabilidades2.get();
    }

    public StringProperty responsabilidades2Property() {
        return responsabilidades2;
    }

    public void setResponsabilidades2(String responsabilidades2) {
        this.responsabilidades2.set(responsabilidades2);
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

    public String getEmpresa3() {
        return empresa3.get();
    }

    public StringProperty empresa3Property() {
        return empresa3;
    }

    public void setEmpresa3(String empresa3) {
        this.empresa3.set(empresa3);
    }

    public String getFechaInicio3() {
        return fechaInicio3.get();
    }

    public StringProperty fechaInicio3Property() {
        return fechaInicio3;
    }

    public void setFechaInicio3(String fechaInicio3) {
        this.fechaInicio3.set(fechaInicio3);
    }

    public String getFechaFin3() {
        return fechaFin3.get();
    }

    public StringProperty fechaFin3Property() {
        return fechaFin3;
    }

    public void setFechaFin3(String fechaFin3) {
        this.fechaFin3.set(fechaFin3);
    }

    public String getTelefonoEmpresa3() {
        return telefonoEmpresa3.get();
    }

    public StringProperty telefonoEmpresa3Property() {
        return telefonoEmpresa3;
    }

    public void setTelefonoEmpresa3(String telefonoEmpresa3) {
        this.telefonoEmpresa3.set(telefonoEmpresa3);
    }

    public String getDireccionEmpresa3() {
        return direccionEmpresa3.get();
    }

    public StringProperty direccionEmpresa3Property() {
        return direccionEmpresa3;
    }

    public void setDireccionEmpresa3(String direccionEmpresa3) {
        this.direccionEmpresa3.set(direccionEmpresa3);
    }

    public String getPuesto3() {
        return puesto3.get();
    }

    public StringProperty puesto3Property() {
        return puesto3;
    }

    public void setPuesto3(String puesto3) {
        this.puesto3.set(puesto3);
    }

    public String getJefe3() {
        return jefe3.get();
    }

    public StringProperty jefe3Property() {
        return jefe3;
    }

    public void setJefe3(String jefe3) {
        this.jefe3.set(jefe3);
    }

    public String getTelefonoJefe3() {
        return telefonoJefe3.get();
    }

    public StringProperty telefonoJefe3Property() {
        return telefonoJefe3;
    }

    public void setTelefonoJefe3(String telefonoJefe3) {
        this.telefonoJefe3.set(telefonoJefe3);
    }

    public String getSalario3() {
        return salario3.get();
    }

    public StringProperty salario3Property() {
        return salario3;
    }

    public void setSalario3(String salario3) {
        this.salario3.set(salario3);
    }

    public String getMotivoSalida3() {
        return motivoSalida3.get();
    }

    public StringProperty motivoSalida3Property() {
        return motivoSalida3;
    }

    public void setMotivoSalida3(String motivoSalida3) {
        this.motivoSalida3.set(motivoSalida3);
    }

    public String getResponsabilidades3() {
        return responsabilidades3.get();
    }

    public StringProperty responsabilidades3Property() {
        return responsabilidades3;
    }

    public void setResponsabilidades3(String responsabilidades3) {
        this.responsabilidades3.set(responsabilidades3);
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

    public String getEmpresa4() {
        return empresa4.get();
    }

    public StringProperty empresa4Property() {
        return empresa4;
    }

    public void setEmpresa4(String empresa4) {
        this.empresa4.set(empresa4);
    }

    public String getFechaInicio4() {
        return fechaInicio4.get();
    }

    public StringProperty fechaInicio4Property() {
        return fechaInicio4;
    }

    public void setFechaInicio4(String fechaInicio4) {
        this.fechaInicio4.set(fechaInicio4);
    }

    public String getFechaFin4() {
        return fechaFin4.get();
    }

    public StringProperty fechaFin4Property() {
        return fechaFin4;
    }

    public void setFechaFin4(String fechaFin4) {
        this.fechaFin4.set(fechaFin4);
    }

    public String getTelefonoEmpresa4() {
        return telefonoEmpresa4.get();
    }

    public StringProperty telefonoEmpresa4Property() {
        return telefonoEmpresa4;
    }

    public void setTelefonoEmpresa4(String telefonoEmpresa4) {
        this.telefonoEmpresa4.set(telefonoEmpresa4);
    }

    public String getDireccionEmpresa4() {
        return direccionEmpresa4.get();
    }

    public StringProperty direccionEmpresa4Property() {
        return direccionEmpresa4;
    }

    public void setDireccionEmpresa4(String direccionEmpresa4) {
        this.direccionEmpresa4.set(direccionEmpresa4);
    }

    public String getPuesto4() {
        return puesto4.get();
    }

    public StringProperty puesto4Property() {
        return puesto4;
    }

    public void setPuesto4(String puesto4) {
        this.puesto4.set(puesto4);
    }

    public String getJefe4() {
        return jefe4.get();
    }

    public StringProperty jefe4Property() {
        return jefe4;
    }

    public void setJefe4(String jefe4) {
        this.jefe4.set(jefe4);
    }

    public String getTelefonoJefe4() {
        return telefonoJefe4.get();
    }

    public StringProperty telefonoJefe4Property() {
        return telefonoJefe4;
    }

    public void setTelefonoJefe4(String telefonoJefe4) {
        this.telefonoJefe4.set(telefonoJefe4);
    }

    public String getSalario4() {
        return salario4.get();
    }

    public StringProperty salario4Property() {
        return salario4;
    }

    public void setSalario4(String salario4) {
        this.salario4.set(salario4);
    }

    public String getMotivoSalida4() {
        return motivoSalida4.get();
    }

    public StringProperty motivoSalida4Property() {
        return motivoSalida4;
    }

    public void setMotivoSalida4(String motivoSalida4) {
        this.motivoSalida4.set(motivoSalida4);
    }

    public String getResponsabilidades4() {
        return responsabilidades4.get();
    }

    public StringProperty responsabilidades4Property() {
        return responsabilidades4;
    }

    public void setResponsabilidades4(String responsabilidades4) {
        this.responsabilidades4.set(responsabilidades4);
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
