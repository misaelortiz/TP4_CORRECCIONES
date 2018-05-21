/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pto6.aplicacion.controlador.beans.form;

import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import pto6.aplicacion.modelo.dominio.Coche;

/**
 *
 * @author Alumno
 */
@ManagedBean
@ViewScoped
public class CocheFormBean implements Serializable {
    private Coche coche;
    private ArrayList <Coche> coches ;
   
    
    public CocheFormBean() {
        coche = new Coche();
        coches=new ArrayList<>();
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public ArrayList<Coche> getCoches() {
        return coches;
    }

    public void setCoches(ArrayList<Coche> coches) {
        this.coches = coches;
    }
    public void agregarCoche(){
        
       coches.add(coche);
       coche = new Coche();
    }
    
}
