/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.modconta.entity;

/**
 *
 * @author RAUL
 */
public class Fact {
    
    String rol_bd;
    String rol;
    String fecha;
    String tabla;
    String observaciones;
    String codigo;
    String val_antes;
    String val_despues;

    public String getRol_bd() {
        return rol_bd;
    }

    public void setRol_bd(String rol_bd) {
        this.rol_bd = rol_bd;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTabla() {
        return tabla;
    }

    public void setTabla(String tabla) {
        this.tabla = tabla;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getVal_antes() {
        return val_antes;
    }

    public void setVal_antes(String val_antes) {
        this.val_antes = val_antes;
    }

    public String getVal_despues() {
        return val_despues;
    }

    public void setVal_despues(String val_despues) {
        this.val_despues = val_despues;
    }
    
    
    
            
}
