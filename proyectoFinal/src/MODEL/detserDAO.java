/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import app.modconta.databaase.dbBean;
import app.modconta.entity.DetalleServicio;
import app.modconta.entity.DetalleVenta;
import java.sql.ResultSet;
import java.util.Vector;

/**
 *
 * @author MARCELO
 */
public class detserDAO {
      //funcion listar 
    public Vector<DetalleServicio> ListaItem(boolean sw, String str){
       //item es el vector
        Vector<DetalleServicio> item = new Vector<DetalleServicio>();
        //conectar con la base de datos
        dbBean con = new dbBean();
        //cambiar el nombre de la tabla DetalleVenta
        String sql = "Select * from DetalleVenta";
        //El criterio de busqueda para mostrar datos 
        if(sw == true)
        {
            sql = sql + " where Nombre like '"+str +"%'";
        }
        try{
            ResultSet resultado = con.execSQL(sql);
            while(resultado.next()){
                
               DetalleServicio d;
                d = new DetalleServicio();
               // d.setIdVenta(resultado.getInt(1));
               // d.setCantidad(resultado.getInt(2));
                //d.setP_unit(resultado.getFloat(3));   
                item.addElement(d);     
            }
            
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        try{
            con.close();
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        return item; 
    }
    
    //funcion procesar 
    public int procesaItem(DetalleServicio v, String proc)
    {
        int resultado = 0;
        String sql = "";
        dbBean con = new dbBean();
        if(proc.equals("insert")){
            //insertar ventas
          sql = "insert into DetalleServicio values ("+v.getIdEquipo()+",'"+v.getEstado()+"', '" + v.getFallo()+"', '"+ v.getCausa()+"', '"+  v.getSolucion()+"', '"+ v.getObs()+"', "+ v.getIdServicio()+ ")" ;
        }
        if(proc.equals("update")){ 
            //actualizar 
            //el criterio de busqueda , se basa en ingresar el código de CLiente
           //sql = "update Cliente set Nombre = '"+ p.getNombre() +"', Telefono = '"+ p.getTelefono()+"', Grado = '"+ p.getGrado() +"',Grupo='"+p.getGrupo()+"', RUC = '"+ p.getRUC() +"' where idCliente = '"+ p.getIdCliente() +"'";
        }
        try{
            resultado = con.updateSQL(sql);
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        try{
            con.close();
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        return resultado;       
    }    
}
