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
public class DetallePedido {
    
    private String Observaciones;
    private float CantidadHoras;
    private int Plantel;
    private int Id_grupo;
    private int idPedido;
    
    public DetallePedido ()
    {
        this.Plantel =0;
        this.Id_grupo = 0;
        this.Observaciones = "";
        this.CantidadHoras = 0;
        this.idPedido = 0;
        
    }
    
    public DetallePedido(String Observaciones, float CantidadHoras, int Plantel, int Id_grupo, int idPedido) {
        this.Observaciones = Observaciones;
        this.CantidadHoras = CantidadHoras;
        this.Plantel = Plantel;
        this.Id_grupo = Id_grupo;
        this.idPedido = idPedido;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
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

    public int getPlantel() {
        return Plantel;
    }

    public void setPlantel(int Plantel) {
        this.Plantel = Plantel;
    }

    public int getId_grupo() {
        return Id_grupo;
    }

    public void setId_grupo(int Id_grupo) {
        this.Id_grupo = Id_grupo;
    }
    private static final Logger LOG = Logger.getLogger(DetallePedido.class.getName());
    
    
    
    
}
