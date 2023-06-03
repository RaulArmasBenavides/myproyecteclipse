package MODEL;

import app.modconta.databaase.dbBean;
import app.modconta.entity.DetalleVenta;
import java.sql.ResultSet;
import java.util.Vector;

public class detvenDAO {
     //funcion listar 
    public Vector<DetalleVenta> ListaItem(boolean sw, String str){
       //item es el vector
        Vector<DetalleVenta> item = new Vector<DetalleVenta>();
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
                
                DetalleVenta d;
                d = new DetalleVenta();
                d.setIdVenta(resultado.getInt(1));
                d.setCantidad(resultado.getInt(2));
                d.setP_unit(resultado.getFloat(3));   
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
    public int procesaItem(DetalleVenta v, String proc)
    {
        int resultado = 0;
        String sql = "";
        dbBean con = new dbBean();
        if(proc.equals("insert")){
            //insertar ventas
          sql = "insert into DetalleVenta values ('"+v.getIdVenta()+"','"+v.getIdEquipo()+"', '"+ + v.getCantidad()+"', '"+ v.getP_unit()+"', '"+  v.getImporte()+"', '"+ v.getIGV()+"', '"+  v.getTotal()+ "')" ;
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
