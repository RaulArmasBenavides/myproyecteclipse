/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.modconta.entity;

import java.util.logging.Logger;

/**
 *
 * @author RAUL
 */
public class DetalleConforSer 
{
    
    
    public DetalleConforSer()
    {
        
        idConforServicio = 0;
        Descripcion ="";
        Observaciones ="";
        CantidadHoras =0;
        
    }
    
    private String Descripcion;
    private String Observaciones;
    private float CantidadHoras;
    private float Monto;
    private int Id_grupo;
    private int idServicio;
    private int idConforServicio;

    public int getIdConforServicio() {
        return idConforServicio;
    }

    public void setIdConforServicio(int idConforServicio) {
        this.idConforServicio = idConforServicio;
    }

 
    private static final Logger LOG = Logger.getLogger(DetalleConforSer.class.getName());

    public DetalleConforSer(String Descripcion, String Observaciones, float CantidadHoras, float Monto, int Id_grupo, int idServicio) {
        this.Descripcion = Descripcion;
        this.Observaciones = Observaciones;
        this.CantidadHoras = CantidadHoras;
        this.Monto = Monto;
        this.Id_grupo = Id_grupo;
        this.idServicio = idServicio;
    }

    
    
    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    public float getCantidadHoras() {
        return CantidadHoras;
    }

    public void setCantidadHoras(float CantidadHoras) {
        this.CantidadHoras = CantidadHoras;
    }

    public float getMonto() {
        return Monto;
    }

    public void setMonto(float Monto) {
        this.Monto = Monto;
    }

    public int getId_grupo() {
        return Id_grupo;
    }

    public void setId_grupo(int Id_grupo) {
        this.Id_grupo = Id_grupo;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }
    
    
    
    
    
}
