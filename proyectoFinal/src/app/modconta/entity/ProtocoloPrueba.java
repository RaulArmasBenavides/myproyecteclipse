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
public class ProtocoloPrueba 
{

    public ProtocoloPrueba() 
    {
    
        this.Fecha = Fecha;
        this.Nombre_cliente = "";
        this.potencia = "";
        this.a11 = "";
        this.a12 = "";
        this.a13 ="";
        this.a21 = "";
        this.a22 = "";
        this.a23 = "";
        this.a31 = "";
        this.a32 = "";
        this.a33 = "";
        voltaje_bateria ="";
        this.temp_motor = "";
        this.presion = "";
        this.med_combu = "";

    }
    private static final Logger LOG = Logger.getLogger(ProtocoloPrueba.class.getName());

    public ProtocoloPrueba(String Codigo, String Fecha, String Nombre_cliente, String potencia, String Voltaje, String Hz, String Horometro, String Tipo_gob, String Tipo_panel_control, int IdAlternador, int IdMotor, String a11, String a12, String a13, String a21, String a22, String a23, String a31, String a32, String a33, String voltaje_bateria, String temp_motor, String presion, String med_combu) {
        this.Codigo = Codigo;
        this.Fecha = Fecha;
        this.Nombre_cliente = Nombre_cliente;
        this.potencia = potencia;
        this.Voltaje = Voltaje;
        this.Hz = Hz;
        this.Horometro = Horometro;
        this.Tipo_gob = Tipo_gob;
        this.Tipo_panel_control = Tipo_panel_control;
        this.IdAlternador = IdAlternador;
        this.IdMotor = IdMotor;
        this.a11 = a11;
        this.a12 = a12;
        this.a13 = a13;
        this.a21 = a21;
        this.a22 = a22;
        this.a23 = a23;
        this.a31 = a31;
        this.a32 = a32;
        this.a33 = a33;
        this.voltaje_bateria = voltaje_bateria;
        this.temp_motor = temp_motor;
        this.presion = presion;
        this.med_combu = med_combu;
    }
    
   
private String Codigo;
private String Fecha;
private String Nombre_cliente;
private String potencia;
private String Voltaje;
private String Hz; 
private String Horometro;
private String Tipo_gob;
private String Tipo_panel_control;
private int IdAlternador;
private int IdMotor;


//datos de carga 
private String a11;
private String a12;
private String a13;
private String a21;
private String a22;
private String a23;
private String a31;
private String a32;
private String a33;


//indicadores de motor 
private String voltaje_bateria;
private String temp_motor;
private String presion;
private String med_combu;

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    
    public String getNombre_cliente() {
        return Nombre_cliente;
    }

    public void setNombre_cliente(String Nombre_cliente) {
        this.Nombre_cliente = Nombre_cliente;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public String getVoltaje() {
        return Voltaje;
    }

    public void setVoltaje(String Voltaje) {
        this.Voltaje = Voltaje;
    }

    public String getHz() {
        return Hz;
    }

    public void setHz(String Hz) {
        this.Hz = Hz;
    }

    public String getHorometro() {
        return Horometro;
    }

    public void setHorometro(String Horometro) {
        this.Horometro = Horometro;
    }

    public String getTipo_gob() {
        return Tipo_gob;
    }

    public void setTipo_gob(String Tipo_gob) {
        this.Tipo_gob = Tipo_gob;
    }

    public String getTipo_panel_control() {
        return Tipo_panel_control;
    }

    public void setTipo_panel_control(String Tipo_panel_control) {
        this.Tipo_panel_control = Tipo_panel_control;
    }

    public int getIdAlternador() {
        return IdAlternador;
    }

    public void setIdAlternador(int IdAlternador) {
        this.IdAlternador = IdAlternador;
    }

    public int getIdMotor() {
        return IdMotor;
    }

    public void setIdMotor(int IdMotor) {
        this.IdMotor = IdMotor;
    }

    public String getA11() {
        return a11;
    }

    public void setA11(String a11) {
        this.a11 = a11;
    }

    public String getA12() {
        return a12;
    }

    public void setA12(String a12) {
        this.a12 = a12;
    }

    public String getA13() {
        return a13;
    }

    public void setA13(String a13) {
        this.a13 = a13;
    }

    public String getA21() {
        return a21;
    }

    public void setA21(String a21) {
        this.a21 = a21;
    }

    public String getA22() {
        return a22;
    }

    public void setA22(String a22) {
        this.a22 = a22;
    }

    public String getA23() {
        return a23;
    }

    public void setA23(String a23) {
        this.a23 = a23;
    }

    public String getA31() {
        return a31;
    }

    public void setA31(String a31) {
        this.a31 = a31;
    }

    public String getA32() {
        return a32;
    }

    public void setA32(String a32) {
        this.a32 = a32;
    }

    public String getA33() {
        return a33;
    }

    public void setA33(String a33) {
        this.a33 = a33;
    }

    public String getVoltaje_bateria() {
        return voltaje_bateria;
    }

    public void setVoltaje_bateria(String voltaje_bateria) {
        this.voltaje_bateria = voltaje_bateria;
    }

    public String getTemp_motor() {
        return temp_motor;
    }

    public void setTemp_motor(String temp_motor) {
        this.temp_motor = temp_motor;
    }

    public String getPresion() {
        return presion;
    }

    public void setPresion(String presion) {
        this.presion = presion;
    }

    public String getMed_combu() {
        return med_combu;
    }

    public void setMed_combu(String med_combu) {
        this.med_combu = med_combu;
    }



    
}
