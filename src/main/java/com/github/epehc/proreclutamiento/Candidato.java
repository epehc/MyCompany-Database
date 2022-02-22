package com.github.epehc.proreclutamiento;

import javafx.beans.property.StringProperty;

public class Candidato {
    //Personal
    StringProperty dpi;
    StringProperty fecha;
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
    StringProperty estudiosMasAltos;

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

    //Informacion Laboral
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

    public String getEstudiosMasAltos() {
        return estudiosMasAltos.get();
    }

    public StringProperty estudiosMasAltosProperty() {
        return estudiosMasAltos;
    }

    public void setEstudiosMasAltos(String estudiosMasAltos) {
        this.estudiosMasAltos.set(estudiosMasAltos);
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

    //Constructor para informacion Personal
    public Candidato(String dpi){

    }
}
