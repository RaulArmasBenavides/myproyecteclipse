package app.modconta.entity;

public class Tienda 
{ 
   private int idTiendaTO;
   private String Nombre;
   private String Direccion;

    public int getIdTiendaTO() {
        return idTiendaTO;
    }

    public void setIdTiendaTO(int idTiendaTO) {
        this.idTiendaTO = idTiendaTO;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
   
   
}
