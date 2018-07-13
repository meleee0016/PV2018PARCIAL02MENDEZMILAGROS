/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author acer
 */
public class Alumno implements Serializable{
    private int DNI;
    private String Apellido;
    private String Nombre;
    private String Fechanac;
    private String Domicilio;
    private int Numerotel;
    private String denominacionM;
    private String Carrera;
    private String añocursado;

    public Alumno() {
    }

    public Alumno(int DNI, String Apellido, String Nombre, String Fechanac, String Domicilio, int Numerotel, String denominacionM, String Carrera, String añocursado) {
        this.DNI = DNI;
        this.Apellido = Apellido;
        this.Nombre = Nombre;
        this.Fechanac = Fechanac;
        this.Domicilio = Domicilio;
        this.Numerotel = Numerotel;
        this.denominacionM = denominacionM;
        this.Carrera = Carrera;
        this.añocursado = añocursado;
    }

    /**
     * @return the DNI
     */
    public int getDNI() {
        return DNI;
    }

    /**
     * @param DNI the DNI to set
     */
    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    /**
     * @return the Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * @param Apellido the Apellido to set
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Fechanac
     */
    public String getFechanac() {
        return Fechanac;
    }

    /**
     * @param Fechanac the Fechanac to set
     */
    public void setFechanac(String Fechanac) {
        this.Fechanac = Fechanac;
    }

    /**
     * @return the Domicilio
     */
    public String getDomicilio() {
        return Domicilio;
    }

    /**
     * @param Domicilio the Domicilio to set
     */
    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    /**
     * @return the Numerotel
     */
    public int getNumerotel() {
        return Numerotel;
    }

    /**
     * @param Numerotel the Numerotel to set
     */
    public void setNumerotel(int Numerotel) {
        this.Numerotel = Numerotel;
    }

    /**
     * @return the denominacionM
     */
    public String getDenominacionM() {
        return denominacionM;
    }

    /**
     * @param denominacionM the denominacionM to set
     */
    public void setDenominacionM(String denominacionM) {
        this.denominacionM = denominacionM;
    }

    /**
     * @return the Carrera
     */
    public String getCarrera() {
        return Carrera;
    }

    /**
     * @param Carrera the Carrera to set
     */
    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    /**
     * @return the añocursado
     */
    public String getAñocursado() {
        return añocursado;
    }

    /**
     * @param añocursado the añocursado to set
     */
    public void setAñocursado(String añocursado) {
        this.añocursado = añocursado;
    }
    

}
