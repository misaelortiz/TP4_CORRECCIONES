/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pto1.aplicacion.modelo.dominio;

/**
 *
 * @author E. Misael Ortiz
 */
public class Temperatura {
    private double grado;

    /**
     * @return the grado
     */
    public double getGrado() {
        return grado;
    }

  
    public void setGrado(double grado) {
        this.grado = grado;
    }
    public void asignarValor(double num){
        this.grado = num;
    }
    
    public double obtenerCelsiusDeFarentheit(){
        return (grado-32)/1.8;
    }
     public double obtenerCelsiusDeKelvin(){
        
        return grado - 273.15;
        
        }
    public double obtenerKelvinDeFarentheit(){
        return (grado - 32)/1.8+ 273.15;
        }
    public double obtenerKelvinDeCelsius(){
        return grado + 273.15;
    }
    public double obtenerFarentheitDeKelvin(){
        return 1.8 * (grado - 273.15 ) + 32;
        }
    public double obtenerFarentheitDeCelsius(){
        return 1.8 *grado +32;
    }
    
    }