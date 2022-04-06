package com.github.epehc.proreclutamiento.informaciones;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.ArrayList;

public class InformacionPersonal {

    ArrayList<String> list;

    ArrayList<String> familiaList;

    //Personal
    StringProperty dpi;
    StringProperty fecha;
    StringProperty timestamp;
    StringProperty nombre;
    StringProperty puesto;
    StringProperty comoEntero;
    StringProperty genero;
    StringProperty noTelefono;
    StringProperty noCelular;
    StringProperty correo;
    StringProperty fechaNacimiento;
    StringProperty edad;
    StringProperty viveCon;
    StringProperty nacionalidad;
    StringProperty estadoCivil;
    StringProperty personasDependientes;
    StringProperty licencia;
    StringProperty tipoLicencia;
    StringProperty fechaExpiracionLicencia;
    StringProperty cantidadTiempoManejando;
    StringProperty poseeVehiculo;
    StringProperty vehiculo;
    StringProperty aspiracionSalarial;
    StringProperty religion;
    StringProperty viajarInterior;
    StringProperty viajarExtranjero;
    StringProperty idiomasManejados;
    StringProperty softwareManejado;
    StringProperty partidoPolitico;
    StringProperty sindicato;
    StringProperty adjetivos;
    StringProperty fuma;
    StringProperty fumaFrecuencia;
    StringProperty alcohol;
    StringProperty alcoholFrecuencia;
    StringProperty drogas;
    StringProperty tatuajes;
    StringProperty paisResidencia;

    //Direccion
    StringProperty calle;
    StringProperty zona;
    StringProperty municipio;
    StringProperty departamento;

    //Familia
    //Conyuge
    StringProperty nombreConyuge;
    StringProperty trabajoConyuge;
    StringProperty telefonoConyuge;
    //Papa
    StringProperty nombrePapa;
    StringProperty trabajoPapa;
    StringProperty telefonoPapa;
    //Mama
    StringProperty nombreMama;
    StringProperty trabajoMama;
    StringProperty telefonoMama;
    //Hermano 1
    StringProperty nombreHermano1;
    StringProperty trabajoHermano1;
    StringProperty telefonoHermano1;
    //Hermano 2
    StringProperty nombreHermano2;
    StringProperty trabajoHermano2;
    StringProperty telefonoHermano2;
    //Conocido
    StringProperty nombreConocido;
    StringProperty trabajoConocido;
    StringProperty telefonoConocido;

    public InformacionPersonal() {
        this.list = new ArrayList<>();
        this.familiaList =new ArrayList<>();

        this.dpi = new SimpleStringProperty();
        this.fecha = new SimpleStringProperty();
        this.timestamp = new SimpleStringProperty();
        this.nombre = new SimpleStringProperty();
        this.puesto = new SimpleStringProperty();
        this.comoEntero = new SimpleStringProperty();
        this.genero = new SimpleStringProperty();
        this.noTelefono = new SimpleStringProperty();
        this.noCelular = new SimpleStringProperty();
        this.correo = new SimpleStringProperty();
        this.fechaNacimiento = new SimpleStringProperty();
        this.edad = new SimpleStringProperty();
        this.viveCon = new SimpleStringProperty();
        this.nacionalidad = new SimpleStringProperty();
        this.estadoCivil = new SimpleStringProperty();
        this.personasDependientes = new SimpleStringProperty();
        this.licencia = new SimpleStringProperty();
        this.tipoLicencia = new SimpleStringProperty();
        this.fechaExpiracionLicencia = new SimpleStringProperty();
        this.cantidadTiempoManejando = new SimpleStringProperty();
        this.poseeVehiculo = new SimpleStringProperty();
        this.vehiculo = new SimpleStringProperty();
        this.aspiracionSalarial = new SimpleStringProperty();
        this.religion = new SimpleStringProperty();
        this.viajarInterior = new SimpleStringProperty();
        this.viajarExtranjero = new SimpleStringProperty();
        this.idiomasManejados = new SimpleStringProperty();
        this.softwareManejado = new SimpleStringProperty();
        this.partidoPolitico = new SimpleStringProperty();
        this.sindicato = new SimpleStringProperty();
        this.adjetivos = new SimpleStringProperty();
        this.fuma = new SimpleStringProperty();
        this.fumaFrecuencia = new SimpleStringProperty();
        this.alcohol = new SimpleStringProperty();
        this.alcoholFrecuencia =new SimpleStringProperty( );
        this.drogas =new SimpleStringProperty();
        this.tatuajes = new SimpleStringProperty();
        this.paisResidencia = new SimpleStringProperty();
        this.calle = new SimpleStringProperty();
        this.zona = new SimpleStringProperty();
        this.municipio =new SimpleStringProperty( );
        this.departamento = new SimpleStringProperty();
        this.nombreConyuge = new SimpleStringProperty();
        this.trabajoConyuge = new SimpleStringProperty();
        this.telefonoConyuge = new SimpleStringProperty();
        this.nombrePapa = new SimpleStringProperty();
        this.trabajoPapa = new SimpleStringProperty();
        this.telefonoPapa = new SimpleStringProperty();
        this.nombreMama = new SimpleStringProperty();
        this.trabajoMama = new SimpleStringProperty();
        this.telefonoMama = new SimpleStringProperty();
        this.nombreHermano1 = new SimpleStringProperty();
        this.trabajoHermano1 = new SimpleStringProperty();
        this.telefonoHermano1 = new SimpleStringProperty();
        this.nombreHermano2 = new SimpleStringProperty();
        this.trabajoHermano2 = new SimpleStringProperty();
        this.telefonoHermano2 = new SimpleStringProperty();
        this.nombreConocido = new SimpleStringProperty();
        this.trabajoConocido = new SimpleStringProperty();
        this.telefonoConocido = new SimpleStringProperty();
    }

    public InformacionPersonal(String dpi, String fecha, String timestamp, String nombre, String puesto,
                               String comoEntero, String genero, String noTelefono, String noCelular,
                               String correo, String fechaNacimiento, String edad, String viveCon,
                               String nacionalidad, String estadoCivil, String personasDependientes,
                               String licencia, String tipoLicencia, String fechaExpiracionLicencia,
                               String cantidadTiempoManejando, String poseeVehiculo, String vehiculo,
                               String aspiracionSalarial, String religion, String viajarInterior,
                               String viajarExtranjero, String idiomasManejados, String softwareManejado,
                               String partidoPolitico, String sindicato, String adjetivos, String fuma,
                               String fumaFrecuencia, String alcohol, String alcoholFrecuencia,
                               String drogas, String tatuajes, String paisResidencia, String calle, String zona, String municipio,
                               String departamento, String nombreConyuge, String trabajoConyuge,
                               String telefonoConyuge, String nombrePapa, String trabajoPapa,
                               String telefonoPapa, String nombreMama, String trabajoMama,
                               String telefonoMama, String nombreHermano1, String trabajoHermano1,
                               String telefonoHermano1, String nombreHermano2, String trabajoHermano2,
                               String telefonoHermano2, String nombreConocido, String trabajoConocido,
                               String telefonoConocido) {

        this.list = new ArrayList<>();
        this.familiaList = new ArrayList<>();

        this.dpi = new SimpleStringProperty(dpi);
        this.fecha = new SimpleStringProperty(fecha);
        this.timestamp = new SimpleStringProperty(timestamp);
        this.nombre = new SimpleStringProperty(nombre);
        this.puesto = new SimpleStringProperty(puesto);
        this.comoEntero = new SimpleStringProperty(comoEntero);
        this.genero = new SimpleStringProperty(genero);
        this.noTelefono = new SimpleStringProperty(noTelefono);
        this.noCelular = new SimpleStringProperty(noCelular);
        this.correo = new SimpleStringProperty(correo);
        this.fechaNacimiento = new SimpleStringProperty(fechaNacimiento);
        this.edad = new SimpleStringProperty(edad);
        this.viveCon = new SimpleStringProperty(viveCon);
        this.nacionalidad = new SimpleStringProperty(nacionalidad);
        this.estadoCivil = new SimpleStringProperty(estadoCivil);
        this.personasDependientes = new SimpleStringProperty(personasDependientes);
        this.licencia = new SimpleStringProperty(licencia);
        this.tipoLicencia = new SimpleStringProperty(tipoLicencia);
        this.fechaExpiracionLicencia = new SimpleStringProperty(fechaExpiracionLicencia);
        this.cantidadTiempoManejando = new SimpleStringProperty(cantidadTiempoManejando);
        this.poseeVehiculo = new SimpleStringProperty(poseeVehiculo);
        this.vehiculo = new SimpleStringProperty(vehiculo);
        this.aspiracionSalarial = new SimpleStringProperty(aspiracionSalarial);
        this.religion = new SimpleStringProperty(religion);
        this.viajarInterior = new SimpleStringProperty(viajarInterior);
        this.viajarExtranjero = new SimpleStringProperty(viajarExtranjero);
        this.idiomasManejados = new SimpleStringProperty(idiomasManejados);
        this.softwareManejado = new SimpleStringProperty(softwareManejado);
        this.partidoPolitico = new SimpleStringProperty(partidoPolitico);
        this.sindicato = new SimpleStringProperty(sindicato);
        this.adjetivos = new SimpleStringProperty(adjetivos);
        this.fuma = new SimpleStringProperty(fuma);
        this.fumaFrecuencia = new SimpleStringProperty(fumaFrecuencia);
        this.alcohol = new SimpleStringProperty(alcohol);
        this.alcoholFrecuencia =new SimpleStringProperty( alcoholFrecuencia);
        this.drogas =new SimpleStringProperty( drogas);
        this.tatuajes = new SimpleStringProperty(tatuajes);
        this.paisResidencia = new SimpleStringProperty(paisResidencia);
        this.calle = new SimpleStringProperty(calle);
        this.zona = new SimpleStringProperty(zona);
        this.municipio =new SimpleStringProperty( municipio);
        this.departamento = new SimpleStringProperty(departamento);
        this.nombreConyuge = new SimpleStringProperty(nombreConyuge);
        this.trabajoConyuge = new SimpleStringProperty(trabajoConyuge);
        this.telefonoConyuge = new SimpleStringProperty(telefonoConyuge);

        this.nombrePapa = new SimpleStringProperty(nombrePapa);
        this.trabajoPapa = new SimpleStringProperty(trabajoPapa);
        this.telefonoPapa = new SimpleStringProperty(telefonoPapa);
        this.nombreMama = new SimpleStringProperty(nombreMama);
        this.trabajoMama = new SimpleStringProperty(trabajoMama);
        this.telefonoMama = new SimpleStringProperty(telefonoMama);
        this.nombreHermano1 = new SimpleStringProperty(nombreHermano1);
        this.trabajoHermano1 = new SimpleStringProperty(trabajoHermano1);
        this.telefonoHermano1 = new SimpleStringProperty(telefonoHermano1);
        this.nombreHermano2 = new SimpleStringProperty(nombreHermano2);
        this.trabajoHermano2 = new SimpleStringProperty(trabajoHermano2);
        this.telefonoHermano2 = new SimpleStringProperty(telefonoHermano2);
        this.nombreConocido = new SimpleStringProperty(nombreConocido);
        this.trabajoConocido = new SimpleStringProperty(trabajoConocido);
        this.telefonoConocido = new SimpleStringProperty(telefonoConocido);

    }

    public ArrayList<String> getList(){
        list.add(getDpi());
        list.add(getFecha());
        list.add(getTimestamp());
        list.add(getNombre());
        list.add(getPuesto());
        list.add(getComoEntero());
        list.add(getGenero());
        list.add(getNoTelefono());
        list.add(getNoCelular());
        list.add(getCorreo());
        list.add(getFechaNacimiento());
        list.add(getEdad());
        list.add(getViveCon());
        list.add(getNacionalidad());
        list.add(getEstadoCivil());
        list.add(getPersonasDependientes());
        list.add(getLicencia());
        list.add(getTipoLicencia());
        list.add(getFechaExpiracionLicencia());
        list.add(getCantidadTiempoManejando());
        list.add(getPoseeVehiculo());
        list.add(getVehiculo());
        list.add(getAspiracionSalarial());
        list.add(getReligion());
        list.add(getViajarInterior());
        list.add(getViajarExtranjero());
        list.add(getIdiomasManejados());
        list.add(getSoftwareManejado());
        list.add(getPartidoPolitico());
        list.add(getSindicato());
        list.add(getAdjetivos());
        list.add(getFuma());
        list.add(getFumaFrecuencia());
        list.add(getAlcohol());
        list.add(getAlcoholFrecuencia());
        list.add(getDrogas());
        list.add(getTatuajes());
        list.add(getPaisResidencia());
        list.add(getCalle());
        list.add(getZona());
        list.add(getMunicipio());
        list.add(getDepartamento());
        list.add(getNombreConyuge());
        list.add(getTrabajoConyuge());
        list.add(getTelefonoConyuge());

        return list;
    }

    public ArrayList<String> getFamiliaList(){
        familiaList.add(getNombrePapa());
        familiaList.add(getTrabajoPapa());
        familiaList.add(getTelefonoPapa());
        familiaList.add(getNombreMama());
        familiaList.add(getTrabajoMama());
        familiaList.add(getTelefonoMama());
        familiaList.add(getNombreHermano1());
        familiaList.add(getTrabajoHermano1());
        familiaList.add(getTelefonoHermano1());
        familiaList.add(getNombreHermano2());
        familiaList.add(getTrabajoHermano2());
        familiaList.add(getTelefonoHermano2());
        familiaList.add(getNombreConocido());
        familiaList.add(getTrabajoConocido());
        familiaList.add(getTelefonoConocido());

        return familiaList;
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

    public String getFecha() {
        return fecha.get();
    }

    public StringProperty fechaProperty() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha.set(fecha);
    }

    public String getTimestamp() {
        return timestamp.get();
    }

    public StringProperty timestampProperty() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp.set(timestamp);
    }

    public String getNombre() {
        return nombre.get();
    }

    public StringProperty nombreProperty() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre.set(nombre);
    }

    public String getPuesto() {
        return puesto.get();
    }

    public StringProperty puestoProperty() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto.set(puesto);
    }

    public String getComoEntero() {
        return comoEntero.get();
    }

    public StringProperty comoEnteroProperty() {
        return comoEntero;
    }

    public void setComoEntero(String comoEntero) {
        this.comoEntero.set(comoEntero);
    }

    public String getGenero() {
        return genero.get();
    }

    public StringProperty generoProperty() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero.set(genero);
    }

    public String getNoTelefono() {
        return noTelefono.get();
    }

    public StringProperty noTelefonoProperty() {
        return noTelefono;
    }

    public void setNoTelefono(String noTelefono) {
        this.noTelefono.set(noTelefono);
    }

    public String getNoCelular() {
        return noCelular.get();
    }

    public StringProperty noCelularProperty() {
        return noCelular;
    }

    public void setNoCelular(String noCelular) {
        this.noCelular.set(noCelular);
    }

    public String getCorreo() {
        return correo.get();
    }

    public StringProperty correoProperty() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo.set(correo);
    }

    public String getFechaNacimiento() {
        return fechaNacimiento.get();
    }

    public StringProperty fechaNacimientoProperty() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento.set(fechaNacimiento);
    }

    public String getEdad() {
        return edad.get();
    }

    public StringProperty edadProperty() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad.set(edad);
    }

    public String getViveCon() {
        return viveCon.get();
    }

    public StringProperty viveConProperty() {
        return viveCon;
    }

    public void setViveCon(String viveCon) {
        this.viveCon.set(viveCon);
    }

    public String getNacionalidad() {
        return nacionalidad.get();
    }

    public StringProperty nacionalidadProperty() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad.set(nacionalidad);
    }

    public String getEstadoCivil() {
        return estadoCivil.get();
    }

    public StringProperty estadoCivilProperty() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil.set(estadoCivil);
    }

    public String getPersonasDependientes() {
        return personasDependientes.get();
    }

    public StringProperty personasDependientesProperty() {
        return personasDependientes;
    }

    public void setPersonasDependientes(String personasDependientes) {
        this.personasDependientes.set(personasDependientes);
    }

    public String getLicencia() {
        return licencia.get();
    }

    public StringProperty licenciaProperty() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia.set(licencia);
    }

    public String getTipoLicencia() {
        return tipoLicencia.get();
    }

    public StringProperty tipoLicenciaProperty() {
        return tipoLicencia;
    }

    public void setTipoLicencia(String tipoLicencia) {
        this.tipoLicencia.set(tipoLicencia);
    }

    public String getFechaExpiracionLicencia() {
        return fechaExpiracionLicencia.get();
    }

    public StringProperty fechaExpiracionLicenciaProperty() {
        return fechaExpiracionLicencia;
    }

    public void setFechaExpiracionLicencia(String fechaExpiracionLicencia) {
        this.fechaExpiracionLicencia.set(fechaExpiracionLicencia);
    }

    public String getCantidadTiempoManejando() {
        return cantidadTiempoManejando.get();
    }

    public StringProperty cantidadTiempoManejandoProperty() {
        return cantidadTiempoManejando;
    }

    public void setCantidadTiempoManejando(String cantidadTiempoManejando) {
        this.cantidadTiempoManejando.set(cantidadTiempoManejando);
    }

    public String getPoseeVehiculo() {
        return poseeVehiculo.get();
    }

    public StringProperty poseeVehiculoProperty() {
        return poseeVehiculo;
    }

    public void setPoseeVehiculo(String poseeVehiculo) {
        this.poseeVehiculo.set(poseeVehiculo);
    }

    public String getVehiculo() {
        return vehiculo.get();
    }

    public StringProperty vehiculoProperty() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo.set(vehiculo);
    }

    public String getAspiracionSalarial() {
        return aspiracionSalarial.get();
    }

    public StringProperty aspiracionSalarialProperty() {
        return aspiracionSalarial;
    }

    public void setAspiracionSalarial(String aspiracionSalarial) {
        this.aspiracionSalarial.set(aspiracionSalarial);
    }

    public String getReligion() {
        return religion.get();
    }

    public StringProperty religionProperty() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion.set(religion);
    }

    public String getViajarInterior() {
        return viajarInterior.get();
    }

    public StringProperty viajarInteriorProperty() {
        return viajarInterior;
    }

    public void setViajarInterior(String viajarInterior) {
        this.viajarInterior.set(viajarInterior);
    }

    public String getViajarExtranjero() {
        return viajarExtranjero.get();
    }

    public StringProperty viajarExtranjeroProperty() {
        return viajarExtranjero;
    }

    public void setViajarExtranjero(String viajarExtranjero) {
        this.viajarExtranjero.set(viajarExtranjero);
    }

    public String getIdiomasManejados() {
        return idiomasManejados.get();
    }

    public StringProperty idiomasManejadosProperty() {
        return idiomasManejados;
    }

    public void setIdiomasManejados(String idiomasManejados) {
        this.idiomasManejados.set(idiomasManejados);
    }

    public String getSoftwareManejado() {
        return softwareManejado.get();
    }

    public StringProperty softwareManejadoProperty() {
        return softwareManejado;
    }

    public void setSoftwareManejado(String softwareManejado) {
        this.softwareManejado.set(softwareManejado);
    }

    public String getPartidoPolitico() {
        return partidoPolitico.get();
    }

    public StringProperty partidoPoliticoProperty() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico.set(partidoPolitico);
    }

    public String getSindicato() {
        return sindicato.get();
    }

    public StringProperty sindicatoProperty() {
        return sindicato;
    }

    public void setSindicato(String sindicato) {
        this.sindicato.set(sindicato);
    }

    public String getAdjetivos() {
        return adjetivos.get();
    }

    public StringProperty adjetivosProperty() {
        return adjetivos;
    }

    public void setAdjetivos(String adjetivos) {
        this.adjetivos.set(adjetivos);
    }

    public String getFuma() {
        return fuma.get();
    }

    public StringProperty fumaProperty() {
        return fuma;
    }

    public void setFuma(String fuma) {
        this.fuma.set(fuma);
    }

    public String getFumaFrecuencia() {
        return fumaFrecuencia.get();
    }

    public StringProperty fumaFrecuenciaProperty() {
        return fumaFrecuencia;
    }

    public void setFumaFrecuencia(String fumaFrecuencia) {
        this.fumaFrecuencia.set(fumaFrecuencia);
    }

    public String getAlcohol() {
        return alcohol.get();
    }

    public StringProperty alcoholProperty() {
        return alcohol;
    }

    public void setAlcohol(String alcohol) {
        this.alcohol.set(alcohol);
    }

    public String getAlcoholFrecuencia() {
        return alcoholFrecuencia.get();
    }

    public StringProperty alcoholFrecuenciaProperty() {
        return alcoholFrecuencia;
    }

    public void setAlcoholFrecuencia(String alcoholFrecuencia) {
        this.alcoholFrecuencia.set(alcoholFrecuencia);
    }

    public String getDrogas() {
        return drogas.get();
    }

    public StringProperty drogasProperty() {
        return drogas;
    }

    public void setDrogas(String drogas) {
        this.drogas.set(drogas);
    }

    public String getTatuajes() {
        return tatuajes.get();
    }

    public StringProperty tatuajesProperty() {
        return tatuajes;
    }

    public void setTatuajes(String tatuajes) {
        this.tatuajes.set(tatuajes);
    }

    public String getPaisResidencia() {
        return paisResidencia.get();
    }

    public StringProperty paisResidenciaProperty() {
        return paisResidencia;
    }

    public void setPaisResidencia(String paisResidencia) {
        this.paisResidencia.set(paisResidencia);
    }


    public String getCalle() {
        return calle.get();
    }

    public StringProperty calleProperty() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle.set(calle);
    }

    public String getZona() {
        return zona.get();
    }

    public StringProperty zonaProperty() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona.set(zona);
    }

    public String getMunicipio() {
        return municipio.get();
    }

    public StringProperty municipioProperty() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio.set(municipio);
    }

    public String getDepartamento() {
        return departamento.get();
    }

    public StringProperty departamentoProperty() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento.set(departamento);
    }

    public String getNombreConyuge() {
        return nombreConyuge.get();
    }

    public StringProperty nombreConyugeProperty() {
        return nombreConyuge;
    }

    public void setNombreConyuge(String nombreConyuge) {
        this.nombreConyuge.set(nombreConyuge);
    }

    public String getTrabajoConyuge() {
        return trabajoConyuge.get();
    }

    public StringProperty trabajoConyugeProperty() {
        return trabajoConyuge;
    }

    public void setTrabajoConyuge(String trabajoConyuge) {
        this.trabajoConyuge.set(trabajoConyuge);
    }

    public String getTelefonoConyuge() {
        return telefonoConyuge.get();
    }

    public StringProperty telefonoConyugeProperty() {
        return telefonoConyuge;
    }

    public void setTelefonoConyuge(String telefonoConyuge) {
        this.telefonoConyuge.set(telefonoConyuge);
    }

    public String getNombrePapa() {
        return nombrePapa.get();
    }

    public StringProperty nombrePapaProperty() {
        return nombrePapa;
    }

    public void setNombrePapa(String nombrePapa) {
        this.nombrePapa.set(nombrePapa);
    }

    public String getTrabajoPapa() {
        return trabajoPapa.get();
    }

    public StringProperty trabajoPapaProperty() {
        return trabajoPapa;
    }

    public void setTrabajoPapa(String trabajoPapa) {
        this.trabajoPapa.set(trabajoPapa);
    }

    public String getTelefonoPapa() {
        return telefonoPapa.get();
    }

    public StringProperty telefonoPapaProperty() {
        return telefonoPapa;
    }

    public void setTelefonoPapa(String telefonoPapa) {
        this.telefonoPapa.set(telefonoPapa);
    }

    public String getNombreMama() {
        return nombreMama.get();
    }

    public StringProperty nombreMamaProperty() {
        return nombreMama;
    }

    public void setNombreMama(String nombreMama) {
        this.nombreMama.set(nombreMama);
    }

    public String getTrabajoMama() {
        return trabajoMama.get();
    }

    public StringProperty trabajoMamaProperty() {
        return trabajoMama;
    }

    public void setTrabajoMama(String trabajoMama) {
        this.trabajoMama.set(trabajoMama);
    }

    public String getTelefonoMama() {
        return telefonoMama.get();
    }

    public StringProperty telefonoMamaProperty() {
        return telefonoMama;
    }

    public void setTelefonoMama(String telefonoMama) {
        this.telefonoMama.set(telefonoMama);
    }

    public String getNombreHermano1() {
        return nombreHermano1.get();
    }

    public StringProperty nombreHermano1Property() {
        return nombreHermano1;
    }

    public void setNombreHermano1(String nombreHermano1) {
        this.nombreHermano1.set(nombreHermano1);
    }

    public String getTrabajoHermano1() {
        return trabajoHermano1.get();
    }

    public StringProperty trabajoHermano1Property() {
        return trabajoHermano1;
    }

    public void setTrabajoHermano1(String trabajoHermano1) {
        this.trabajoHermano1.set(trabajoHermano1);
    }

    public String getTelefonoHermano1() {
        return telefonoHermano1.get();
    }

    public StringProperty telefonoHermano1Property() {
        return telefonoHermano1;
    }

    public void setTelefonoHermano1(String telefonoHermano1) {
        this.telefonoHermano1.set(telefonoHermano1);
    }

    public String getNombreHermano2() {
        return nombreHermano2.get();
    }

    public StringProperty nombreHermano2Property() {
        return nombreHermano2;
    }

    public void setNombreHermano2(String nombreHermano2) {
        this.nombreHermano2.set(nombreHermano2);
    }

    public String getTrabajoHermano2() {
        return trabajoHermano2.get();
    }

    public StringProperty trabajoHermano2Property() {
        return trabajoHermano2;
    }

    public void setTrabajoHermano2(String trabajoHermano2) {
        this.trabajoHermano2.set(trabajoHermano2);
    }

    public String getTelefonoHermano2() {
        return telefonoHermano2.get();
    }

    public StringProperty telefonoHermano2Property() {
        return telefonoHermano2;
    }

    public void setTelefonoHermano2(String telefonoHermano2) {
        this.telefonoHermano2.set(telefonoHermano2);
    }

    public String getNombreConocido() {
        return nombreConocido.get();
    }

    public StringProperty nombreConocidoProperty() {
        return nombreConocido;
    }

    public void setNombreConocido(String nombreConocido) {
        this.nombreConocido.set(nombreConocido);
    }

    public String getTrabajoConocido() {
        return trabajoConocido.get();
    }

    public StringProperty trabajoConocidoProperty() {
        return trabajoConocido;
    }

    public void setTrabajoConocido(String trabajoConocido) {
        this.trabajoConocido.set(trabajoConocido);
    }

    public String getTelefonoConocido() {
        return telefonoConocido.get();
    }

    public StringProperty telefonoConocidoProperty() {
        return telefonoConocido;
    }

    public void setTelefonoConocido(String telefonoConocido) {
        this.telefonoConocido.set(telefonoConocido);
    }
}
