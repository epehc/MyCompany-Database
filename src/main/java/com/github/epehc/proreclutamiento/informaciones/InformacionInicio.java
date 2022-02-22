package com.github.epehc.proreclutamiento.informaciones;

/**
 * Class to create Objects used to populate TableView in MainController with the help of CellFactoryValue
 */
public class InformacionInicio {

    /**
     * Identifier
     */
    private String dpi;
    /**
     * Date when the form was submitted
     */
    private String fecha;
    /**
     * Name of the person
     */
    private String nombre;
    /**
     * Job description to which the person is applying to
     */
    private String puesto;


    /**
     * Constructor for a InformacionInicio Object
     * @param dpi ID number
     * @param fecha submitted form date
     * @param nombre name of the person
     * @param puesto job description the person is applying to
     */
    public InformacionInicio(String dpi, String fecha, String nombre, String puesto) {
        this.dpi = dpi;
        this.fecha = fecha;
        this.nombre = nombre;
        this.puesto = puesto;
    }

    /**
     * Getter for dpi
     * @return
     */
    public String getDpi() {
        return dpi;
    }

    /**
     * Getter for fecha
     * @return
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Getter for nombre
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Getter for puesto
     * @return
     */
    public String getPuesto() {
        return puesto;
    }
}
