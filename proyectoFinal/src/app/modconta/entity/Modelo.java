
package app.modconta.entity;
public class Modelo {
    
    private int IdModelo;
    private String Nombre;
    private String Nombre_Marca;

    public String getNombre_Marca() {
        return Nombre_Marca;
    }

    public void setNombre_Marca(String Nombre_Marca) {
        this.Nombre_Marca = Nombre_Marca;
    }
   
    public int getIdModelo() {
        return IdModelo;
    }

    public void setIdModelo(int IdModelo) {
        this.IdModelo = IdModelo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
}
