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
public class Materia implements Serializable{
    private int Codigo;
    private String Denominacion;
    private String Carrera;
    private String Añocursado;

    public Materia() {
    }

    public Materia(int Codigo, String Denominacion, String Carrera, String Añocursado) {
        this.Codigo = Codigo;
        this.Denominacion = Denominacion;
        this.Carrera = Carrera;
        this.Añocursado = Añocursado;
    }

    /**
     * @return the Codigo
     */
    public int getCodigo() {
        return Codigo;
    }

    /**
     * @param Codigo the Codigo to set
     */
    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    /**
     * @return the Denominacion
     */
    public String getDenominacion() {
        return Denominacion;
    }

    /**
     * @param Denominacion the Denominacion to set
     */
    public void setDenominacion(String Denominacion) {
        this.Denominacion = Denominacion;
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
     * @return the Añocursado
     */
    public String getAñocursado() {
        return Añocursado;
    }

    /**
     * @param Añocursado the Añocursado to set
     */
    public void setAñocursado(String Añocursado) {
        this.Añocursado = Añocursado;
    }
    
}
