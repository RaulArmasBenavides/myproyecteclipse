/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.modconta.dataaccess;

import app.modconta.databaase.dbBean;
import app.modconta.entity.Cliente;
import app.modconta.entity.ConformidadServicio;
import app.modconta.entity.Cotizacion;
import app.modconta.entity.DetalleConforSer;
import app.modconta.entity.DetallePedido;
import app.modconta.entity.Fact;
import app.modconta.entity.Grupos_MA;
import app.modconta.entity.Pedido;
import app.modconta.entity.ProtocoloPrueba;
import app.modconta.entity.Venta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author RAUL
 */
public class Repository {

    //Métodos genéricos INICIO 
    
   //función genérica para listar combo
    public DefaultComboBoxModel getvaluesName(String campoNombre, String NombreTabla)
    {  
        String sSQL ="";
        dbBean con2 = new dbBean(); 
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        try {
             
            //Connection cn = this.getConnection();
            sSQL= "Select "+campoNombre +" from "+ NombreTabla;//+" order by "+ campoNombre +" ASC" ;
//              sSQL = "select "+ campID +" from "+ nombTbl +" where "+ nomCampBusq +" = '"+ cad + "'";
//            if(activo ==true)
            sSQL = sSQL +" where estado ='S' ";
            sSQL = sSQL +" order by "+ campoNombre +" ASC" ;
            System.out.println(sSQL);
            
            //Statement st = cn.createStatement();
           // ResultSet rs = st.executeQuery(sSQL);
             ResultSet rs =  con2.execSQL(sSQL);
            while(rs.next())
            {
                modelo.addElement(rs.getString(1));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return modelo ;
    }
 
 
    
    
      public int ObtenerCampoTablaGenerico(String nombTbl, String campID, String nomCampBusq, String cad, boolean activo)
      {
        int id = 0;
        dbBean con = new dbBean();
          String sSQL ="";
        try{
            sSQL = "select "+ campID +" from "+ nombTbl +" where "+ nomCampBusq +" = '"+ cad + "'";
            if(activo ==true)
            sSQL = sSQL +" and estado ='S' ";
            
            System.out.println(sSQL);
            ResultSet result = con.execSQL(sSQL);
            if(result.next()){
                id = result.getInt(1);
            }else{
                id = 0;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        try{
            con.close();
        }catch(SQLException e){}
        return id;
    }
      
      
      
      //Métodos genéricos FIN
      
      
      
      
    
    //Método de peddidos 
      public boolean RegistrarPedido(Pedido p) 
    {
     dbBean con2 = new dbBean();  
     String sSQL = "";
     boolean ok = false;
     int id = 0 ;
     try {
         
     sSQL = "insert into pedido values ('M', getdate(), null,null,null,'S',"+ p.getIdCliente() + ",'" + p.getFolio()+"');"; 
     // "Select idTienda,Nombre from clientes where Nombre= '"+ s +"'";
     System.out.println(sSQL);
     
     //ResultSet resultado = con2.execSQL(sSQL);
     int resultado = con2.updateSQL(sSQL);
     if(resultado>0)
         ok = true;
     else 
         ok= false;
     } 
     catch (java.sql.SQLException e) {
         e.printStackTrace();
     }
       try{
            con2.close();
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
       
       return ok;
    }
    
    
     public boolean ActualizarPedido(Pedido p) 
    {
     dbBean con2 = new dbBean();  
     String sSQL = "";
     boolean ok = false;
     int id = 0 ;
     try {
         
     sSQL = " update pedido set estado  = '"+ p.getEstado() +"'";
     if(p.getEstado().equals("N")) //anulacion
     sSQL  = sSQL + ", fecha_anu =getdate()";
     else 
     if(p.getEstado().equals("A")) //aprobacion
     sSQL  = sSQL + ", fecha_apr =getdate()";
     sSQL  = sSQL  + "where id_pedido ="+ p.getIdPedido() + ";"; 
    
     System.out.println(sSQL);
     
     //ResultSet resultado = con2.execSQL(sSQL);
     int resultado = con2.updateSQL(sSQL);
     if(resultado>0)
         ok = true;
     else 
         ok= false;
     } 
     catch (java.sql.SQLException e) {
         e.printStackTrace();
     }
       try{
            con2.close();
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
       
       return ok;
    }
       
       
     public boolean AnularPedido(Pedido p) 
    {
     dbBean con2 = new dbBean();  
     String sSQL = "";
     boolean ok = false;
     int id = 0 ;
     try {
         
     sSQL = "insert into pedido values ('"+ p.getTipo() +"', getdate(), null,null,null,'S',"+ p.getIdPedido() + ");"; 
     // "Select idTienda,Nombre from clientes where Nombre= '"+ s +"'";
     System.out.println(sSQL);
     
     //ResultSet resultado = con2.execSQL(sSQL);
     int resultado = con2.updateSQL(sSQL);
     if(resultado>0)
         ok = true;
     else 
         ok= false;
     } 
     catch (java.sql.SQLException e) {
         e.printStackTrace();
     }
       try{
            con2.close();
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
       
       return ok;
    }

          
          
     public boolean registrarItemPedido(DetallePedido  d) 
    {
     dbBean con2 = new dbBean();  
     String sSQL = "";
     boolean ok = false;
     int id = 0 ;
     try {
         
     sSQL = "insert into detalle_pedido values (" + d.getId_grupo() + "," + d.getPlantel() +","+ d.getCantidadHoras() +",'" +d.getObservaciones() + "'," + d.getIdPedido() +");"; 
     System.out.println(sSQL);
     
     //ResultSet resultado = con2.execSQL(sSQL);
     int resultado = con2.updateSQL(sSQL);
     if(resultado>0)
         ok = true;
     else 
         ok= false;
     } 
     catch (java.sql.SQLException e) {
         e.printStackTrace();
     }
       try{
            con2.close();
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
       
       return ok;
    }

  //  public List<Grupos_MA> LeerDatosGrupo(String codigo) 
     public Grupos_MA LeerDatosGrupo(String codigo) 
    {   String sSQL ="";
        Grupos_MA grupoaux  = new Grupos_MA();
         //item es el vector
       // Vector<Venta> item = new Vector<Venta>();
       //  List<Grupos_MA> lista_datos = new ArrayList<>();
       
         //Grupos_MA lista_datos = new Grupos_MA();
        //conectar con la base de datos
       dbBean con = new dbBean();
       sSQL = "select  g.codigo as serie, g.potencia,g.tip_gob,g.pan_control,a.marca as marca_alter, a.modelo as modelo_alter,m.marca as marca_motor,m.modelo as modelo_motor , m.id_motor , a.id_alternador"; 
       sSQL = sSQL + " from grupo_ma g , motor m , alternador a"; 
       sSQL = sSQL + " where g.id_alternador = a.id_alternador"; 
       sSQL = sSQL + " and g.id_motor = m.id_motor"; 
       sSQL = sSQL + " and m.estado='S'";
       sSQL = sSQL + " and a.estado='S'";
       sSQL = sSQL + " and g.estado='S'";
       sSQL = sSQL + " and g.codigo ='"+codigo +  "';";
      System.out.println(sSQL);
        //El criterio de busqueda para mostrar datos 
//if(sw == true)
//{
//sql = sql + " where Nombre like '"+str +"%'";
//}
        try{
            ResultSet resultado = con.execSQL(sSQL);
            if(resultado.next())
            {
           // while(resultado.next()){
                grupoaux.setPotencia(resultado.getString(2));
                grupoaux.setTip_gobernacion(resultado.getString(3));
                grupoaux.setPanel_control(resultado.getString(4));
                grupoaux.setMarcaAlternador(resultado.getString(5));
                grupoaux.setModeloAlternador(resultado.getString(6));
                grupoaux.setMarcaMotor(resultado.getString(7));
                grupoaux.setModeloMotor(resultado.getString(8));
                grupoaux.setSerieMotor(String.valueOf(resultado.getInt(9)));
                grupoaux.setSerieAlternador(String.valueOf(resultado.getInt(10)));
            }
            
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        try{
            con.close();
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        return grupoaux; 
        
        
    }
     
     
     
     //datos auditoría 
  public  List<Fact> LeerDatosAuditoría(String tabla) 
    {   String sSQL ="";
        List<Fact> grupoaux  = new ArrayList();
      
         //item es el vector
       // Vector<Venta> item = new Vector<Venta>();
       //  List<Grupos_MA> lista_datos = new ArrayList<>();
       
         //Grupos_MA lista_datos = new Grupos_MA();
        //conectar con la base de datos
       dbBean con = new dbBean();
       sSQL = "select codigo,observaciones,valor_antes,valor_despues,usuario,usuario_bd,fecha "; 
       sSQL = sSQL + " from aud_audit_modif "; 
       if(!tabla.equals(""))
       sSQL = sSQL + " where tabla ='"+tabla +  "';";
      System.out.println(sSQL);
        //El criterio de busqueda para mostrar datos 
//if(sw == true)
//{
//sql = sql + " where Nombre like '"+str +"%'";
//}
        try{
            ResultSet resultado = con.execSQL(sSQL);
      
            while(resultado.next())
            {
                Fact aux = new Fact();
                aux.setCodigo(resultado.getString(1));//setPotencia(resultado.getString(2));
                aux.setObservaciones(resultado.getString(2));
                aux.setVal_antes(resultado.getString(3));
                aux.setVal_despues(resultado.getString(4));
                aux.setRol(resultado.getString(5));
                aux.setRol_bd(resultado.getString(6));
                aux.setFecha(resultado.getString(7));
                grupoaux.add(aux);
                //grupoaux.setModeloMotor(resultado.getString(8));
            }
                //grupoaux.setSerieAlternador(sSQL);
                //grupoaux.setSerieMotor(sSQL);
             
               //grupoaux.setVoltaje(sSQL);
         
                //lista_datos.add(grupoaux);     
      
            
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        try{
            con.close();
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
        return grupoaux; 
        
        
    }

    public boolean RegistrarCotizacion(Cotizacion c) 
    {
    
        dbBean con2 = new dbBean();  
     String sSQL = "";
     boolean ok = false;
     int id = 0 ;
     try {
     
     sSQL =" insert into cotizacion values (GETDATE(),'S','RMB',"+c.getIdPedido() + ",'"+ c.getDescripcion() + "','"+ c.getMonto()+ "');";
     //sSQL = "insert into pedido values ('M', getdate(), null,null,null,'S',"+ p.getIdCliente() + ",'" + p.getFolio()+"');"; 
     System.out.println(sSQL);
     
     //ResultSet resultado = con2.execSQL(sSQL);
     int resultado = con2.updateSQL(sSQL);
     if(resultado>0)
         ok = true;
     else 
         ok= false;
     } 
     catch (java.sql.SQLException e) {
         e.printStackTrace();
     }
       try{
            con2.close();
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
       return ok;
    }

    public boolean RegistrarConformidad(ConformidadServicio c) {
        dbBean con2 = new dbBean();  
     String sSQL = "";
     boolean ok = false;
     int id = 0 ;
     try {
     
     sSQL =" insert into confor_servicio values ('"+c.getFolio()+" ',getdate(),'S','"+c.getNombreCliente()+"','"+c.getSede()+"','"+c.getDireccion()+"','" + c.getObservaciones() +"','RMB',null,null,"+ c.getIdServicio()+");";
     System.out.println(sSQL);
     //ResultSet resultado = con2.execSQL(sSQL);
     int resultado = con2.updateSQL(sSQL);
     if(resultado>0)
         ok = true;
     else 
         ok= false;
     } 
     catch (java.sql.SQLException e) {
         e.printStackTrace();
     }
       try{
            con2.close();
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
       return ok;
    }

    public boolean registrarItemConformidaddetse(DetalleConforSer detse) 
    {
        
        
        dbBean con2 = new dbBean();  
     String sSQL = "";
     boolean ok = false;
     int id = 0 ;
     try {
          
     sSQL = " INSERT into detalle_conforservicio values ( " + detse.getCantidadHoras() + " ,'"+ detse.getDescripcion() +"','"+ detse.getDescripcion() +"',"+ detse.getIdConforServicio() +");"; 
     System.out.println(sSQL);
     
     //ResultSet resultado = con2.execSQL(sSQL);
     int resultado = con2.updateSQL(sSQL);
     if(resultado>0)
         ok = true;
     else 
         ok= false;
     } 
     catch (java.sql.SQLException e) {
         e.printStackTrace();
     }
       try{
            con2.close();
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
       
       return ok;
    }

    public boolean RegistrarProtocolo(ProtocoloPrueba p) {
      dbBean con2 = new dbBean();  
     String sSQL = "";
     boolean ok = false;
     int id = 0 ;
     try {
     
     // sSQL =" insert into confor_servicio values ('"+c.getFolio()+" ',getdate(),'S','"+c.getNombreCliente()+"','"+c.getSede()+"','"+c.getDireccion()+"','" + c.getObservaciones() +"','RMB',null,null,"+ c.getIdServicio()+");";
     sSQL = " insert into protocolo (folio,nombrecliente,SerieAlternador,SerieMotor,estado,a11,a12,a13,a21,a22,a23,a31,a32,a33,voltaje_bateria,temp_motor,presion,med_combu)\n" +
            " values ('"+ p.getCodigo() +" ','"+ p.getNombre_cliente() + "','123','124','S','" + p.getA11() + "','"+ p.getA12() +"','"+ p.getA13() +"','"+ p.getA21() +"','"+ p.getA22() +"','"+ p.getA23() +"','"+ p.getA31() +"','"+ p.getA32() +"','"+ p.getA33() +"','90','90','90','90');";
     System.out.println("[DataAcces] RegistrarProtocolo " +  sSQL);
     //ResultSet resultado = con2.execSQL(sSQL);
     int resultado = con2.updateSQL(sSQL);
     if(resultado>0)
         ok = true;
     else 
         ok= false;
     } 
     catch (java.sql.SQLException e) {
         e.printStackTrace();
     }
       try{
            con2.close();
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
       return ok;
    }
    
}
