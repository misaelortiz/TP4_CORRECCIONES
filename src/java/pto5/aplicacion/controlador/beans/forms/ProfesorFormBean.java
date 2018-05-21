/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pto5.aplicacion.controlador.beans.forms;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import pto5.aplicacion.modelo.dominio.Profesor;

/**
 *
 * @author E. Misael Ortiz
 */
@ManagedBean
@ViewScoped

public class ProfesorFormBean {
    private Profesor profesor;
    

    public ProfesorFormBean(){
        profesor = new Profesor();
        
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

}

