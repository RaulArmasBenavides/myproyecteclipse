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
public class ConformidadServicio {
    public ConformidadServicio()
    {
                  
    }
           private int idPedido;
          private String Folio;
          private String FechaRecibido;
          private String FechaAnulacion;
          private String FechaAprobacion;
          private int idCliente;
          private String NombreCliente;
          private String Estado; 
          private String Sede;
          private String Direccion;
          private String Observaciones;
          private int idServicio;

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }
    private static final Logger LOG = Logger.getLogger(ConformidadServicio.class.getName());
          

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getFolio() {
        return Folio;
    }

    public void setFolio(String Folio) {
        this.Folio = Folio;
    }

    public String getFechaRecibido() {
        return FechaRecibido;
    }

    public void setFechaRecibido(String FechaRecibido) {
        this.FechaRecibido = FechaRecibido;
    }

    public String getFechaAnulacion() {
        return FechaAnulacion;
    }

    public void setFechaAnulacion(String FechaAnulacion) {
        this.FechaAnulacion = FechaAnulacion;
    }

    public String getFechaAprobacion() {
        return FechaAprobacion;
    }

    public void setFechaAprobacion(String FechaAprobacion) {
        this.FechaAprobacion = FechaAprobacion;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getSede() {
        return Sede;
    }

    public void setSede(String Sede) {
        this.Sede = Sede;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }
          

    
}
