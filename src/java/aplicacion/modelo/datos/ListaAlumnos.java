/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.datos;

import aplicacion.modelo.dominio.Alumno;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author acer
 */
public class ListaAlumnos implements Serializable{
     private ArrayList<Alumno> alumnos;

    public ListaAlumnos() {
        alumnos = new ArrayList();
    }
    
    public void agregarAlumno(Alumno unAlumno){
        getAlumnos().add(unAlumno);
    }
    
    public void modificarAlumnos(Alumno unAlumno){
        for (Alumno a : getAlumnos()){
            if(a.getDNI() == unAlumno.getDNI()){
                getAlumnos().set(getAlumnos().indexOf(a), unAlumno);
                break;
            }
        }
    }
    
    public void eliminarAlumnos(Alumno unAlumno){
        for (Alumno a : getAlumnos()){
            if(a.getDNI() == unAlumno.getDNI()){
                getAlumnos().remove(getAlumnos().indexOf(a));
                break;
            }
        }
    }
    
    public void buscarAlumnos(Alumno unAlumno){
        for (Alumno a : getAlumnos()){
            if(a.getDNI() == unAlumno.getDNI()){
                getAlumnos().set(getAlumnos().indexOf(a), unAlumno);
                break;
            }
        }
    }

    /**
     * @return the alumnos
     */
    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    /**
     * @param alumnos the alumnos to set
     */
    public void setAlumnos(ArrayList<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
}
