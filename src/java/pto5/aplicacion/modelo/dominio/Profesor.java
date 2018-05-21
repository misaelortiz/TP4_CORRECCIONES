/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pto5.aplicacion.modelo.dominio;

import java.util.ArrayList;

/**
 *
 * @author E. Misael Ortiz
 */
public class Profesor {
    
    private ArrayList <Profesor> profesores= new ArrayList<Profesor>();
    private String nombre;
    private String apellido;
    private String materia;
    private long legajo;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the materia
     */
    public String getMateria() {
        return materia;
    }

    /**
     * @param materia the materia to set
     */
    public void setMateria(String materia) {
        this.materia = materia;
    }

    /**
     * @return the DNI
     */
    public long getLegajo() {
        return  legajo;
    }

    /**
     * @param legajo
     
     */
    public void setLegajo(long legajo) {
        this.legajo = legajo;
    }

    /**
     * @param profesor
     * @return the profesor
     */
    public void ingresarProfesor (){
       
           
           
       }
       
    public Profesor visualizarProfesores(){
        return profesores.get(0);
    }
    public ArrayList <Profesor> getProfesor() {
        return profesores;
    }

    /**
     * @param profesor the profesor to set
     */
    public void setProfesor(ArrayList <Profesor> profesor) {
        this.profesores = profesor;
    }
    
}
