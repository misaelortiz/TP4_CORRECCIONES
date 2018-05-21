/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pto1.aplicacion.controlador.beans.forms;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import pto1.aplicacion.modelo.dominio.Temperatura;

/**
 *
 * @author E. Misael Ortiz
 */
@ManagedBean
@ViewScoped
public class TemperaturaFormBean {
    private Temperatura temperatura;
    private double n;
    private char unidadOri;
    private char unidadDes;

    public TemperaturaFormBean(){
        temperatura=new Temperatura(); 
    }

    /**
     * @return the temperatura
     */
    public Temperatura getTemperatura() {
        return temperatura;
    }

    /**
     * @param temperatura the temperatura to set
     */
    public void setTemperatura(Temperatura temperatura) {
        this.temperatura = temperatura;
    }

    /**
     * @return the n
     */
    public double getN() {
        return n;
    }

    /**
     * @param n the n to set
     */
    public void setN(double n) {
        this.n = n;
    }

    /**
     * @return the unidadOri
     */
    public char getUnidadOri() {
        return unidadOri;
    }

    /**
     * @param unidadOri the unidadOri to set
     */
    public void setUnidadOri(char unidadOri) {
        this.unidadOri = unidadOri;
    }

    /**
     * @return the unidadDes
     */
    public char getUnidadDes() {
        return unidadDes;
    }

    /**
     * @param unidadDes the unidadDes to set
     */
    public void setUnidadDes(char unidadDes) {
        this.unidadDes = unidadDes;
    }
    
    public double convertirUnidades(){
        double resultado=.0;
        temperatura.asignarValor(n);
        if(unidadOri == 'C' && unidadDes == 'F'){
            resultado = temperatura.obtenerCelsiusDeFarentheit();
        }
        else
            {
            if (unidadOri == 'C' && unidadDes == 'K'){
            resultado = temperatura.obtenerCelsiusDeKelvin();
            }
            else{
                if(unidadOri == 'F' && unidadDes == 'C'){
                resultado = temperatura.obtenerFarentheitDeCelsius();
                }
                else{
                    if(unidadOri == 'F' && unidadDes == 'K'){
                    resultado = temperatura.obtenerFarentheitDeKelvin();
                     }
                    else{ 
                        if(unidadOri == 'K' && unidadDes == 'C'){
                        resultado = temperatura.obtenerKelvinDeCelsius();
                         }
                        else{
                            if(unidadOri == 'K' && unidadDes == 'F'){
                            resultado = temperatura.obtenerKelvinDeFarentheit();
                            }
                        }
                    }
                  }
            }
            }
                        
                
        return resultado;
}
}
    
