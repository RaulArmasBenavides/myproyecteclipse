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
public class Pedido {
  
  private int idPedido;
  private String Folio;
  private String FechaRecibido;
  private String FechaAnulacion;
  private String FechaAprobacion;
  private String Tipo;
  private int idCliente;
  private String NombreCliente;
  private String Estado; 

   
  

    public Pedido() 
    {
        
        this.idPedido = 0;
        this.idCliente=0;
        this.Folio ="";
        this.FechaAnulacion ="";
        this.Tipo ="";
        this.NombreCliente ="";
        this.Estado = "";
    }

    public String getFolio() {
        return Folio;
    }

    public void setFolio(String Folio) {
        this.Folio = Folio;
    }
  

    public Pedido(int idPedido, String FechaRecibido, String FechaAnulacion, String FechaAprobacion, String Tipo, int idCliente, String NombreCliente) {
        this.idPedido = idPedido;
        this.FechaRecibido = FechaRecibido;
        this.FechaAnulacion = FechaAnulacion;
        this.FechaAprobacion = FechaAprobacion;
        this.Tipo = Tipo;
        this.idCliente = idCliente;
        this.NombreCliente = NombreCliente;
    }
    
    
     public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
  
//  private int idVenta;

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
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
  
  
  
}
