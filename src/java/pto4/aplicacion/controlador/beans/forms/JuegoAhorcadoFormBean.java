package pto4.aplicacion.controlador.beans.forms;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;


/**
 *
 * @author casas
 */
@ManagedBean
@ViewScoped
public class JuegoAhorcadoFormBean implements Serializable{
    @ManagedProperty (value = "#{juegoAhorcadoBean}")
    private JuegoAhorcadoBean juegoAhorcadoBean;
    private boolean componenteDeshabilitado;
    private String imagen;
    private String palabraIngresada;
    private char letraIngresada;
    
    public JuegoAhorcadoFormBean() {
        componenteDeshabilitado  = false;    
        
        //
        //this.juegoAhorcadoBean = new JuegoAhorcadoBean();
    
    }

    public void controlarLetra(){
        boolean esLetraEncontrada = juegoAhorcadoBean.getJuegoAhorcado().buscarLetra(letraIngresada);
        String palIngresada = palabraIngresada;
        if (esLetraEncontrada == true){
            if (juegoAhorcadoBean.getJuegoAhorcado().juegoGanado() == true){
                FacesContext context = FacesContext.getCurrentInstance();
                componenteDeshabilitado = false;
                palabraIngresada = new String();
                juegoAhorcadoBean.getJuegoAhorcado().reiniciarJuego();
                context.addMessage(null,new FacesMessage("Usted gano el Juego! - La palabra era: "+ palIngresada));
            }
        }else{
            if(juegoAhorcadoBean.getJuegoAhorcado().getIntentos() <=0){
                FacesContext context = FacesContext.getCurrentInstance();
                componenteDeshabilitado = false;
                imagen="images/ahorcado0" + ".png";
                //String palIngresada = palabraIngresada;
                palabraIngresada = new String();
                juegoAhorcadoBean.getJuegoAhorcado().reiniciarJuego();
               
                context.addMessage(null,new FacesMessage(FacesMessage.SEVERITY_FATAL,"GAME OVER - La palabra correcta es : " 
                        + palIngresada
                        ,"Usted perdio el Juego!"));
            }
        }
        //letraIngresada = ' ';  
    }
    
    public void empezarJuego(){
        juegoAhorcadoBean.getJuegoAhorcado().empezarJuego(palabraIngresada);
        componenteDeshabilitado = true;
        
        FacesContext context  =FacesContext.getCurrentInstance();
        context.addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO,"JUEGO INICIADO","Que tengas suerte!"));
    }
    
    /**
     * @return the juegoAhorcadoBean
     */
    public JuegoAhorcadoBean getJuegoAhorcadoBean() {
        return juegoAhorcadoBean;
    }

    /**
     * @param juegoAhorcadoBean the juegoAhorcadoBean to set
     */
    public void setJuegoAhorcadoBean(JuegoAhorcadoBean juegoAhorcadoBean) {
        this.juegoAhorcadoBean = juegoAhorcadoBean;
    }

    /**
     * @return the palabraIngresada
     */
    public String getPalabraIngresada() {
        return palabraIngresada;
    }

    /**
     * @param palabraIngresada the palabraIngresada to set
     */
    public void setPalabraIngresada(String palabraIngresada) {
        this.palabraIngresada = palabraIngresada;
    }
    
    /**
     * @return the letraIngresada
     */
    public char getLetraIngresada() {
        return letraIngresada;
    }

    /**
     * @param letraIngresada the letraIngresada to set
     */
    public void setLetraIngresada(char letraIngresada) {
        this.letraIngresada = letraIngresada;
    }

    /**
     * @return the componenteDeshabilitado
     */
    public boolean isComponenteDeshabilitado() {
        return componenteDeshabilitado;
    }

    /**
     * @param componenteDeshabilitado the componenteDeshabilitado to set
     */
    public void setComponenteDeshabilitado(boolean componenteDeshabilitado) {
        this.componenteDeshabilitado = componenteDeshabilitado;
    }

    public String getImagen() {
        imagen="images/ahorcado0" + ".png";
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    
    
    
}
