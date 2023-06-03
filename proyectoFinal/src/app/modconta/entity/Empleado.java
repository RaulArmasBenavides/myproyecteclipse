package app.modconta.entity;

import java.time.*;

public class Empleado {
     
    private int IdEmpleado;
    private String Nombre;
    private String Apellidos;
    private String Direccion;
    private String Telefono;
    private String DNI;
    private String Sexo; 
    private String CodigoContrato;

    public String getCodigoContrato() {
        return CodigoContrato;
    }

    public void setCodigoContrato(String CodigoContrato) {
        this.CodigoContrato = CodigoContrato;
    }
    
    
    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    
    public int getIdEmpleado() {
        return IdEmpleado;
    }

    public void setIdEmpleado(int IdEmpleado) {
        this.IdEmpleado = IdEmpleado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
   
}
