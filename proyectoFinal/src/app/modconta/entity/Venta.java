
package app.modconta.entity;


public class Venta {
    //atributos 
    private int idVenta;
    private String Vendedor;
    //puede variar (RUC)
    private int idCliente;
    private String Fecha;
    private int idTienda;
    private String Forma_Pago;
    //metodos
    public Venta()
    {
        
    }
    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public int getTienda() {
        return idTienda;
    }

    public void setTienda(int idTienda) {
        this.idTienda = idTienda;
    }

    public String getForma_Pago() {
        return Forma_Pago;
    }

    public void setForma_Pago(String Forma_Pago) {
        this.Forma_Pago = Forma_Pago;
    }

    

    public String getVendedor() {
        return Vendedor;
    }

    public void setVendedor(String Vendedor) {
        this.Vendedor = Vendedor;
    }

    public int getCliente() {
        return idCliente;
    }

    public void setCliente(int idCliente) {
        this.idCliente = idCliente;
    }

  
    
    

}
