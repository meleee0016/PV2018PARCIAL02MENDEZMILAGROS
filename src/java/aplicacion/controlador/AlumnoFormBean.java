/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador;

import aplicacion.modelo.datos.ListaAlumnos;
import aplicacion.modelo.dominio.Alumno;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author acer
 */
@ManagedBean
@ViewScoped
public class AlumnoFormBean implements Serializable{
    private ListaAlumnos alumnos;
    private Alumno alumno;
    private int DNI;
    private String Apellido;
    private String Nombre;
    private String Fechanac;
    private String Domicilio;
    private int Telefono;
    private String Añocursado;
    private String carrera;
    private String DenominacionM;
    /**
     * Creates a new instance of AlumnoFormBean
     */
    public AlumnoFormBean() {
        alumnos = new ListaAlumnos();
    }
    public void agregarAlumno(){
        setAlumno(new Alumno(getDNI(),getApellido(),getNombre(),getFechanac(),getDomicilio(),getTelefono(),getDenominacionM(),getCarrera(),getAñocursado()));
        getAlumnos().agregarAlumno(getAlumno());
    }
    
    public void establecerAlumno(Alumno unAlumno){
        setAlumno(unAlumno);
    }
    
    public void modificarAlumno(){
        getAlumnos().modificarAlumnos(getAlumno());
    }
    public void eliminarAlumnos(){
        getAlumnos().eliminarAlumnos(getAlumno());
    }
    public void buscarAlumnos(){
        getAlumnos().buscarAlumnos(getAlumno());
    }

    /**
     * @return the alumnos
     */
    public ListaAlumnos getAlumnos() {
        return alumnos;
    }

    /**
     * @param alumnos the alumnos to set
     */
    public void setAlumnos(ListaAlumnos alumnos) {
        this.alumnos = alumnos;
    }

    /**
     * @return the alumno
     */
    public Alumno getAlumno() {
        return alumno;
    }

    /**
     * @param alumno the alumno to set
     */
    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
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
     * @return the Telefono
     */
    public int getTelefono() {
        return Telefono;
    }

    /**
     * @param Telefono the Telefono to set
     */
    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
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

    /**
     * @return the carrera
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * @param carrera the carrera to set
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    /**
     * @return the DenominacionM
     */
    public String getDenominacionM() {
        return DenominacionM;
    }

    /**
     * @param DenominacionM the DenominacionM to set
     */
    public void setDenominacionM(String DenominacionM) {
        this.DenominacionM = DenominacionM;
    }
}
