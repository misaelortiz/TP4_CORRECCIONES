
package pto4.aplicacion.controlador.beans.forms;

import pto4.aplicacion.modelo.dominio.JuegoAhorcado;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


@ManagedBean
@ViewScoped
public class JuegoAhorcadoBean implements Serializable{
    private JuegoAhorcado juegoAhorcado;
    
    public JuegoAhorcadoBean() {
        juegoAhorcado = new JuegoAhorcado();    
        
        //
        
    }

    /**
     * @return the juegoAhorcado
     */
    public JuegoAhorcado getJuegoAhorcado() {
        return juegoAhorcado;
    }

    /**
     * @param juegoAhorcado the juegoAhorcado to set
     */
    public void setJuegoAhorcado(JuegoAhorcado juegoAhorcado) {
        this.juegoAhorcado = juegoAhorcado;
    }
    
}
