/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pto2.aplicacion.controlador.beans.forms;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import pto2.aplicacion.modelo.dominio.RegistroNumero;

/**
 *
 * @author E. Misael Ortiz
 */

@ManagedBean
@ViewScoped
public class RegistroNumeroFormBean {
    private RegistroNumero registroNumero;
    
   public RegistroNumeroFormBean() {
       registroNumero = new RegistroNumero();

    }

    /**
     * @return the registroNumero
     */
    public RegistroNumero getRegistroNumero() {
        return registroNumero;
    }

    /**
     * @param registroNumero the registroNumero to set
     */
    public void setRegistroNumero(RegistroNumero registroNumero) {
        this.registroNumero = registroNumero;
    }

    /**
     * @return the numero
     */
    
    
}
