/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.modconta.entity;

/**
 *
 * @author MARCELO
 */
public class Proveedor {
    private int IdProveedor;
    private String RazonSocial;
    private String Telefono;
    private String Direccion;
    private String RUC;

    public Proveedor() {
    }

    public Proveedor(int IdProveedor, String RazonSocial, String Telefono, String Direccion, String RUC) {
        this.IdProveedor = IdProveedor;
        this.RazonSocial = RazonSocial;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.RUC = RUC;
    }

    public int getIdProveedor() {
        return IdProveedor;
    }

    public void setIdProveedor(int IdProveedor) {
        this.IdProveedor = IdProveedor;
    }

    public String getRazonSocial() {
        return RazonSocial;
    }

    public void setRazonSocial(String RazonSocial) {
        this.RazonSocial = RazonSocial;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }
      
    

    
}
