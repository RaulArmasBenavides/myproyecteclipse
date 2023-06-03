
package app.modconta.entity;

public class Equipo 

{
    private int idEquipo;
    private String Nombre_equipo;
    private String SO;
    private String Procesador; 
    private String RAM;
    private String TarjetaMadre;
    private int Stock;
    private int StockMax;
    private int StockMin;
    private int idModelo;
  // public Marca marc;
   // public Modelo mode;

    public Equipo() {
    }

    public Equipo(int idEquipo, String Nombre_equipo, String SO, String Procesador, String RAM, String TarjetaMadre, int Stock, int StockMax, int StockMin, int idModelo) {
        this.idEquipo = idEquipo;
        this.Nombre_equipo = Nombre_equipo;
        this.SO = SO;
        this.Procesador = Procesador;
        this.RAM = RAM;
        this.TarjetaMadre = TarjetaMadre;
        this.Stock = Stock;
        this.StockMax = StockMax;
        this.StockMin = StockMin;
        this.idModelo = idModelo;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getNombre_equipo() {
        return Nombre_equipo;
    }

    public void setNombre_equipo(String Nombre_equipo) {
        this.Nombre_equipo = Nombre_equipo;
    }

    public String getSO() {
        return SO;
    }

    public void setSO(String SO) {
        this.SO = SO;
    }

    public String getProcesador() {
        return Procesador;
    }

    public void setProcesador(String Procesador) {
        this.Procesador = Procesador;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getTarjetaMadre() {
        return TarjetaMadre;
    }

    public void setTarjetaMadre(String TarjetaMadre) {
        this.TarjetaMadre = TarjetaMadre;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public int getStockMax() {
        return StockMax;
    }

    public void setStockMax(int StockMax) {
        this.StockMax = StockMax;
    }

    public int getStockMin() {
        return StockMin;
    }

    public void setStockMin(int StockMin) {
        this.StockMin = StockMin;
    }

    public int getIdModelo() {
        return idModelo;
    }

    public void setIdModelo(int idModelo) {
        this.idModelo = idModelo;
    }

    
}