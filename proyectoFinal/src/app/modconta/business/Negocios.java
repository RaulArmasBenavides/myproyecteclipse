/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.modconta.business;

import app.modconta.dataaccess.Repository;
import app.modconta.dataaccess.MovimientosDo;
import app.modconta.databaase.dbBean;
import app.modconta.entity.ConformidadServicio;
import app.modconta.entity.Cotizacion;
import app.modconta.entity.DetalleConforSer;
import app.modconta.entity.DetallePedido;
import app.modconta.entity.Fact;
import app.modconta.entity.Grupos_MA;
import app.modconta.entity.Pedido;
import app.modconta.entity.ProtocoloPrueba;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebParam;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author RAUL
 */
public class Negocios {
 
    Repository _doDatos = null;
    public boolean registrarItemConformidaddetse;
    
    public Negocios()
    {
        _doDatos = new Repository();
    }
    
    
     //funcion para buscar idtienda
    public int FindIDClientes(String s ) 
   {   
     dbBean con2 = new dbBean();  
     int id = 0 ;
     try {
         
     String sSQL= "Select idTienda,Nombre from clientes where Nombre= '"+ s +"'";
     System.out.println(sSQL);
     ResultSet resultado2 = con2.execSQL(sSQL);
     while(resultado2.next())
     {
        System.out.println(resultado2.getInt(1));
       //id=Integer.parseInt(resultado2.getInt(1));
        id= resultado2.getInt(1);
     }
     } 
     catch (java.sql.SQLException e) {
         e.printStackTrace();
     }
       try{
            con2.close();
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
       return id; 
  }
    
    

      
       public DefaultComboBoxModel getvaluesName(String campoNombre, String NombreTabla)
    {        
        
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        try {
             return _doDatos.getvaluesName(campoNombre, NombreTabla);
        } catch (Exception e) {
             System.out.println(e.getMessage());
        }
        return modelo ;
    }
    
    
    
      public int ObtenerCampoTablaGenerico(String nombTbl, String campID, String nomCampBusq, String cad, boolean activo)
    {        
        
        int id =0;
        try {
             return _doDatos.ObtenerCampoTablaGenerico(nombTbl, campID, nomCampBusq, cad, activo);
        } catch (Exception e) {
             System.out.println(e.getMessage());
        }
        return id ;
    }
    
    
    
    
    
    //métodos de pedido
    public boolean RegistrarPedido(Pedido p)
    {   boolean resultado = false;
        try {
       //_doDatos = new MovimientosDo();
         resultado = _doDatos.RegistrarPedido(p);
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
        return resultado;
    }
    
      public boolean ActualizarPedido(Pedido p)
    {   
        try {
       //_doDatos = new MovimientosDo();
         return _doDatos.ActualizarPedido(p);
        } catch (Exception e) {
           throw e;
        }
    }
       
      public boolean AnularPedido(Pedido p )
    {  
        try {
       //_doDatos = new MovimientosDo();
         return _doDatos.AnularPedido(p);
        } catch (Exception e) {
            throw e;// System.out.println(e.getMessage());
        }
    }
      
      
       public boolean registrarItemPedido(DetallePedido detpe)
    {   boolean resultado = false;
        try {
       //_doDatos = new MovimientosDo();
         resultado = _doDatos.registrarItemPedido(detpe);
        } catch (Exception e) 
        {
           System.out.println(e.getMessage());
        }
        return resultado;
    }

       
       
       
  
       
       
       
       
    //PRUEBAS DE CARGA  
    public Grupos_MA LeerDatosGrupo(String codigo) 
    {
        //List<Grupos_MA> lista_datos = new ArrayList<>();
        Grupos_MA  datos =  new Grupos_MA();
        try {
       //_doDatos = new MovimientosDo();
         datos = _doDatos.LeerDatosGrupo(codigo);
        } catch (Exception e) 
        {
           System.out.println(e.getMessage());
        }
        return datos;
    }

 
    //LEER DAOTS CONSULTORÍA  
    public List<Fact>  LeerDatosAuditoría(String tabla) 
    {
        List<Fact> lista_datos = new ArrayList<>();
        //Grupos_MA  datos =  new Grupos_MA();
        try {
       //_doDatos = new MovimientosDo();
         lista_datos = _doDatos.LeerDatosAuditoría(tabla);
        } catch (Exception e) 
        {
           System.out.println(e.getMessage());
        }
        return lista_datos;
    }   

    
    
    //MÉTODOS DE COTIZACIÓN
    public boolean RegistrarCotizacion(Cotizacion c) {
     boolean resultado = false;
        try {
       //_doDatos = new MovimientosDo();
         resultado = _doDatos.RegistrarCotizacion(c);
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
        return resultado;
    }

    public boolean RegistrarConformidad(ConformidadServicio c) {
         boolean resultado = false;
        try {
       //_doDatos = new MovimientosDo();
         resultado = _doDatos.RegistrarConformidad(c);
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
        return resultado;
    }

    public boolean registrarItemConformidaddetse(DetalleConforSer detse) {
  
        boolean resultado = false;
        try {
       //_doDatos = new MovimientosDo();
         resultado = _doDatos.registrarItemConformidaddetse(detse);
        } catch (Exception e) 
        {
           System.out.println(e.getMessage());
        }
        return resultado;
    }

    public boolean RegistrarProtocolo(ProtocoloPrueba p) {
     boolean resultado = false;
        try {
       //_doDatos = new MovimientosDo();
         resultado = _doDatos.RegistrarProtocolo(p);
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
        return resultado;
    }
      
      
      
    
       
}
