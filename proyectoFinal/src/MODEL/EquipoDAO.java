package MODEL;
import app.modconta.databaase.dbBean;
import app.modconta.entity.Equipo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class EquipoDAO {

//funcion listar  
    public Vector<Equipo> ListaItem(boolean sw, String str){
       Vector<Equipo> item = new Vector<Equipo>();
        dbBean con = new dbBean();
        String sql = "Select * from Equipo";
        //El criterio de busqueda para mostrar datos 
        if(sw == true)
        {
            sql = sql + " where Nombre_Equipo like '"+str +" %'";
        }
        System.out.println("FII: "+ sql);
        try{
            ResultSet resultado = con.execSQL(sql);
            while(resultado.next()){
                Equipo e; 
                e = new Equipo();
                e.setIdEquipo(resultado.getInt(1));
                e.setNombre_equipo(resultado.getString(2));
                e.setProcesador(resultado.getString(3));
                e.setRAM(resultado.getString(4));
                e.setSO(resultado.getString(5));
                e.setTarjetaMadre(resultado.getString(6));
                e.setStock(resultado.getInt(7));
                e.setStockMax(resultado.getInt(8));
                e.setStockMin(resultado.getInt(9));
                e.setIdModelo(resultado.getInt(10));
                        
                item.addElement(e);
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

    
public int FindID(String s ) 
 {   
     dbBean con2 = new dbBean();  
     int id = 0 ;
     try {
         
     String sidmodelo= "Select idModelo,Nombre_Modelo from Modelo where Nombre_Modelo= '"+ s +"'";
     System.out.println(sidmodelo);
     ResultSet resultado2 = con2.execSQL(sidmodelo);
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
    
    
//funcion procesar 
public int procesaItem(Equipo p, String proc){
        int resultado = 0;
        String sql = "";
        String x1= "null";
        String x2 = "null";
        dbBean con = new dbBean();
        if(proc.equals("insert")){
       //insertar
       System.out.println("que fue ");
        //sql = "insert into Equipo values ('"+ p.getIdEquipo()+"', '"+p.getNombre_equipo()+"', '"+ p.marc.getNombre()+"', '"+  p.mode.getNombre()+"', '"+ p.getSO() +"', '"+ p.getProcesador() +"', '"+p.getRAM()+"', '"+p.getTarjetaMadre()+"')";
        sql = "insert into Equipo values ('"+ p.getIdEquipo()+"', '"+p.getNombre_equipo()+"', '"+ p.getSO() +"', '"+ p.getProcesador() +"', '"+p.getRAM()+"', '"+p.getTarjetaMadre()+"',"+ p.getStock()+","+ p.getStockMax()+"," +p.getStockMin()+","+p.getIdModelo()+")";
       // sql = "insert into Equipo values ('"+ p.getIdEquipo()+"', '"+ p.getMarc()+"', '"+  p.getMode()+"', '"+ p.getSO() +"', '"+ p.getProcesador() +"', '"+p.getRAM()+"', '"+p.getTarjetaMadre() +"')"; 
       }
        if(proc.equals("update")){ 
            //actualizar 
            //el criterio de busqueda , se basa en ingresar el código de CLiente
            sql = "update Cliente set Nombre = '"+ p.getNombre_equipo()+"', SO = '"+ p.getSO()+"', Procesador = '"+ p.getProcesador()+"',RAM='"+p.getRAM()+"', TarjetaMadre = '"+ p.getTarjetaMadre()+"' where idEquipo = '"+ p.getIdEquipo()+"'";
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
    
 

public int FindIDEquipo(String s ) 
 {   
     dbBean con2 = new dbBean();  
     int id = 0 ;
     try {
         
     String sidequipo= "Select idEquipo,Nombre_Equipo from Equipo where Nombre_Equipo= '"+ s +"'";
     System.out.println(sidequipo);
     ResultSet resultado2 = con2.execSQL(sidequipo);
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
