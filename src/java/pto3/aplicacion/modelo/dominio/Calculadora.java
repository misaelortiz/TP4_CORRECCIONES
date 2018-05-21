/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pto3.aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author Alumno
 */
public class Calculadora implements Serializable{
    private int primerNumero;
    private int segundoNumero;

    /**
     * @return the primerNumero
     */
    public int getPrimerNumero() {
        return primerNumero;
    }

    public int sumar(){
        return primerNumero + segundoNumero;
    }
    
    /**
     * @param primerNumero the primerNumero to set
     */
    public void setPrimerNumero(int primerNumero) {
        this.primerNumero = primerNumero;
    }

    /**
     * @return the segundoNumero
     */
    public int getSegundoNumero() {
        return segundoNumero;
    }

    /**
     * @param segundoNumero the segundoNumero to set
     */
    public void setSegundoNumero(int segundoNumero) {
        this.segundoNumero = segundoNumero;
    }
}
