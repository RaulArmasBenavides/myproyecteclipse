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
public class DetalleCompra 
{  //atributos  
    private int idEquipo;
    private float p_unit;
    private int cantidad;
    private float Importe;
    private float IGV;
    private float Total;
    //métodos 
    public DetalleCompra()
    {
        
    }
    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public float getP_unit() {
        return p_unit;
    }

    public void setP_unit(float p_unit) {
        this.p_unit = p_unit;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getImporte() {
        return Importe;
    }

    public void setImporte(float Importe) {
        this.Importe = Importe;
    }

    public float getIGV() {
        return IGV;
    }

    public void setIGV(float IGV) {
        this.IGV = IGV;
    }

    public float getTotal() {
        return Total;
    }

    public void setTotal(float Total) {
        this.Total = Total;
    }
    
    
}
