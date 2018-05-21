/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pto3.aplicacion.controlador.beans.form;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIInput;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;

/**
 *
 * @author Alumno
 */
@ManagedBean
@ViewScoped
public class CalculadoraFormBean implements Serializable{
    private int ingreso;
    private String mantisa;
    private int operando1;
    private int operando2;
    private String op;
    /**
     * Creates a new instance of CalculadoraFormBean
     */
    public CalculadoraFormBean() {
        mantisa  = new String();
    }

    public void registrarValorSeleccionado(){
        FacesContext facesContext= FacesContext.getCurrentInstance();
        String valorSeleccionado = facesContext.
                getExternalContext().getRequestParameterMap().
                get("valorPresionado");
        String opSeleccionada = facesContext.
                getExternalContext().getRequestParameterMap().
                get("valorOperador");
         
        if (valorSeleccionado == null){
            ingreso  = ingreso + 0;
        }
        else {
            ingreso  = Integer.parseInt(Integer.toString(ingreso)+valorSeleccionado);
        }
               
        if (opSeleccionada == null){
            mantisa  = mantisa + valorSeleccionado;
        }
        else{
            mantisa = mantisa + opSeleccionada;
            setOp(opSeleccionada);
        }
        
        UIViewRoot uIViewRoot = facesContext.getViewRoot();
        UIInput ingresoInputText = (UIInput)uIViewRoot.findComponent("frmCalculadora:txtIngreso");
        UIInput mantisaInputText = (UIInput)uIViewRoot.findComponent("frmCalculadora:txtMantisa");
        ingresoInputText.setValue(ingreso);
        ingresoInputText.setSubmittedValue(ingreso);
        mantisaInputText.setValue(mantisa);
        mantisaInputText.setSubmittedValue(mantisa);
        facesContext.renderResponse();
        
        
        if (valorSeleccionado == null){
            setOperando1(ingreso);
            ingreso = 0;
        }
        
        if (opSeleccionada == null){
            setOperando2(ingreso);
        }
        
    }
    /*
    public void registrarValorSeleccionado(){
        FacesContext facesContext= FacesContext.getCurrentInstance();
        String valorSeleccionado = facesContext.
                getExternalContext().getRequestParameterMap().
                get("valorPresionado");
        
        mantisa  = mantisa + valorSeleccionado;
        UIViewRoot uIViewRoot = facesContext.getViewRoot();
        UIInput mantisaInputText = (UIInput)uIViewRoot.findComponent("frmCalculadora:txtMantisa");
        mantisaInputText.setValue(mantisa);
        mantisaInputText.setSubmittedValue(mantisa);
        facesContext.renderResponse();
    }*/
    
    public void realizarOperacion(){       
        FacesContext facesContext= FacesContext.getCurrentInstance();
        String resultadoFinal = facesContext.
                getExternalContext().getRequestParameterMap().
                get("valorResultado");
        int resultado = 0;
        switch (getOp()) {
            case ("+"):
                resultado  = getOperando1() + getOperando2();
                break;
            case ("-"):
                resultado  = getOperando1() - getOperando2();
                break;
            case ("x"):
                resultado  = getOperando1() * getOperando2();
                break;
            case ("/"):
                if (getOperando2() == 0) {
                    mantisa = "ERROR!: No se puede realizar division por cero";
                } else {
                    resultado  = getOperando1() / getOperando2();
                }
                break;
            case ("^"):
                resultado  = (int) Math.pow(getOperando1() , getOperando2());
            default:
                break;
        }
                
        mantisa = mantisa + resultadoFinal + Integer.toString(resultado);
        UIViewRoot uIViewRoot = facesContext.getViewRoot();
        UIInput ingresoInputText = (UIInput)uIViewRoot.findComponent("frmCalculadora:txtIngreso");
        UIInput mantisaInputText = (UIInput)uIViewRoot.findComponent("frmCalculadora:txtMantisa");
        ingresoInputText.setValue(resultado);
        ingresoInputText.setSubmittedValue(resultado);
        mantisaInputText.setValue(mantisa);
        mantisaInputText.setSubmittedValue(mantisa);
        facesContext.renderResponse();
    }
    
    public void borrarDatos(){
        mantisa = "";
        ingreso = 0;
        FacesContext facesContext= FacesContext.getCurrentInstance();
        UIViewRoot uIViewRoot = facesContext.getViewRoot();
        UIInput ingresoInputText = (UIInput)uIViewRoot.findComponent("frmCalculadora:txtIngreso");
        UIInput mantisaInputText = (UIInput)uIViewRoot.findComponent("frmCalculadora:txtMantisa");
        ingresoInputText.setValue(ingreso);
        ingresoInputText.setSubmittedValue(ingreso);
        mantisaInputText.setValue(mantisa);
        mantisaInputText.setSubmittedValue(mantisa);
        facesContext.renderResponse();
    }
    
    /**
     * @return the mantisa
     */
    public String getMantisa() {
        return mantisa;
    }

    /**
     * @param mantisa the mantisa to set
     */
    public void setMantisa(String mantisa) {
        this.mantisa = mantisa;
    }
    
        /**
     * @return the ingreso
     */
    public int getIngreso() {
        return ingreso;
    }

    /**
     * @param ingreso the ingreso to set
     */
    public void setIngreso(int ingreso) {
        this.ingreso = ingreso;
    }

    /**
     * @return the operando1
     */
    public int getOperando1() {
        return operando1;
    }

    /**
     * @param operando1 the operando1 to set
     */
    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }

    /**
     * @return the operando2
     */
    public int getOperando2() {
        return operando2;
    }

    /**
     * @param operando2 the operando2 to set
     */
    public void setOperando2(int operando2) {
        this.operando2 = operando2;
    }

    /**
     * @return the op
     */
    public String getOp() {
        return op;
    }

    /**
     * @param op the op to set
     */
    public void setOp(String op) {
        this.op = op;
    }   
    
}
