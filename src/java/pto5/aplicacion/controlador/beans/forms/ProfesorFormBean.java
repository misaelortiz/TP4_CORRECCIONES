/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pto5.aplicacion.controlador.beans.forms;

import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import pto5.aplicacion.modelo.dominio.Profesor;

/**
 *
 * @author E. Misael Ortiz
 */
@ManagedBean
@ViewScoped

public class ProfesorFormBean implements Serializable{
    private ArrayList <Profesor> profesores;
    private Profesor profesor;
    

    public ProfesorFormBean(){
        profesor = new Profesor();
        profesores=new ArrayList<>();
        
    }

    /**
     * @return the profesor
     */
    public Profesor getProfesor() {
        return profesor;
    }

    /**
     * @param profesor the profesor to set
     */
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void agregarProfesor(){
        profesores.add(profesor);
        profesor=new Profesor();
    
    
    }

    /**
     * @return the profesores
     */
    public ArrayList <Profesor> getProfesores() {
        return profesores;
    }

    /**
     * @param profesores the profesores to set
     */
    public void setProfesores(ArrayList <Profesor> profesores) {
        this.profesores = profesores;
    }
}

