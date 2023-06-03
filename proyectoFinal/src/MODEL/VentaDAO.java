package MODEL;
import app.modconta.databaase.dbBean;
import app.modconta.entity.Cliente;
import app.modconta.entity.Venta;
import java.sql.ResultSet;
import java.util.Vector;

public class VentaDAO {
    
    //funcion listar 
    public Vector<Venta> ListaItem(boolean sw, String str){
       //item es el vector
        Vector<Venta> item = new Vector<Venta>();
        //conectar con la base de datos
        dbBean con = new dbBean();
        String sql = "Select * from Venta";
        //El criterio de busqueda para mostrar datos 
        if(sw == true)
        {
            sql = sql + " where Nombre like '"+str +"%'";
        }
        try{
            ResultSet resultado = con.execSQL(sql);
            while(resultado.next()){
                Venta v;
                v = new Venta();
                v.setIdVenta(resultado.getInt(1));
                v.setCliente(resultado.getInt(2));
                v.setVendedor(resultado.getString(3));
                v.setTienda(resultado.getInt(4));
                v.setFecha(resultado.getString(5));
                v.setForma_Pago(resultado.getString(6));
                item.addElement(v);     
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
    public int procesaItem(Venta v, String proc)
    {
        int resultado = 0;
        String sql = "";
        dbBean con = new dbBean();
        if(proc.equals("insert")){
            //insertar ventas
          sql = "insert into Venta values ('"+v.getIdVenta()+"', '"+ v.getFecha()+"', '"+ v.getVendedor()+"', '"+v.getForma_Pago()+"', '"+  v.getCliente()+"', '"+v.getTienda()+"')" ;
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
    //funcion para buscar idcliente
    public int FindID(String s ) 
 {   
     dbBean con2 = new dbBean();  
     int id = 0 ;
     try {
         
     String sidcliente= "Select idCliente,Nombre_Cliente from Cliente where Nombre_Cliente= '"+ s +"'";
     System.out.println(sidcliente);
     ResultSet resultado2 = con2.execSQL(sidcliente);
       while(resultado2.next()){
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
   //funcion para buscar idtienda
    public int FindIDTienda(String s ) 
 {   
     dbBean con2 = new dbBean();  
     int id = 0 ;
     try {
         
     String sidtienda= "Select idTienda,Nombre from Tienda where Nombre= '"+ s +"'";
     System.out.println(sidtienda);
     ResultSet resultado2 = con2.execSQL(sidtienda);
       while(resultado2.next()){
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
   
    
    
    
    
    
}
