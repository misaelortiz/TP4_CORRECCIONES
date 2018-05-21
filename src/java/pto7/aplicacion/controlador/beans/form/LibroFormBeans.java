/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pto7.aplicacion.controlador.beans.form;

import pto7.aplicacion.modelo.dominio.Libro;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Alumno
 */
@ManagedBean
@ViewScoped

public class LibroFormBeans implements Serializable{
    private Libro libro;
    private ArrayList <Libro> libros;
    private ArrayList <Libro> librosFiltrados;
    private String autorElegido;
    /**
     * Creates a new instance of LibroFormBeans
     */
    public LibroFormBeans() {
        libro = new Libro();
        libros = new ArrayList<>();
        librosFiltrados=new ArrayList<>();
    }


    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public void agregarLibro (){
        libros.add(libro);
        libro = new Libro();
    }
    
 
    /**
     * @return the librosFiltrados
     */
    public ArrayList <Libro> getLibrosFiltrados() {
        return librosFiltrados;
    }

    /**
     * @param librosFiltrados the librosFiltrados to set
     */
    public void setLibrosFiltrados(ArrayList <Libro> librosFiltrados) {
        this.librosFiltrados = librosFiltrados;
    }

    /**
     * @return the autorElegido
     */
    public String getAutorElegido() {
        return autorElegido;
    }

    /**
     * @param autorElegido the autorElegido to set
     */
    public void setAutorElegido(String autorElegido) {
        this.autorElegido = autorElegido;
    }
    
       public void listarLibrosFiltrados(){
        for(int i=0;i<libros.size();i++){
            if(libros.get(i).getAutor().equals(getAutorElegido())){
                        getLibrosFiltrados().add(libros.get(i));
            
            }
        
        }
    }
       public String irBusqueda(){
        
        String pagina="punto8?faces-redirect=true";
                 return pagina;
       }
       
       
    
}
