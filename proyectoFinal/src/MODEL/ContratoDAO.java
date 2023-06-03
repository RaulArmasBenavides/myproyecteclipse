package MODEL;
import app.modconta.databaase.dbBean;
import app.modconta.entity.Contrato;
import java.sql.ResultSet;
import java.util.Vector;
/**
 *
 * @author MARCELO
 */
public class ContratoDAO {
  public Vector<Contrato> ListaItem(boolean sw, String str){
     Vector<Contrato> item = new Vector<Contrato>();
        dbBean con = new dbBean();
        String sql = "Select * from Contrato";
        //El criterio de busqueda para mostrar datos 
        if(sw == true)
        {
            sql = sql + " where Nombre like '"+str +"%'";
        }
        System.out.println("FII: "+ sql);
        try{
            ResultSet resultado = con.execSQL(sql);
            while(resultado.next()){
                 Contrato c ; 
                 c = new Contrato();
                 c.setIdEmpleado(resultado.getInt(1));
                 c.setIdContrato(resultado.getString(2));
                 c.setFechaInicio(resultado.getString(3));
                 c.setFechaFinal(resultado.getString(4));
                 c.setArea(resultado.getString(5));
                 c.setCargo(resultado.getString(6));
                 c.setSueldo(resultado.getFloat(7));
               //e.setIdEmpleado(resultado.getInt(1));
                 //e.setNombre(resultado.getString(2));
                // e.setApellidos(resultado.getString(3));
                // e.setSexo(resultado.getString(4));
                // e.setTelefono(resultado.getString(5));
                 //e.setDNI(resultado.getString(6));
                 //e.setContrato(resultado.getString(7));
                item.addElement(c);     
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

     public int procesaItem(Contrato p, String proc){
        int resultado = 0;
        String sql = "";
        dbBean con = new dbBean();
        if(proc.equals("insert")){
            //insertar
        sql= " insert into Contrato values ('"+ p.getIdEmpleado()+"', '"+ p.getIdContrato()+"', '"+ p.getFechaInicio() +"', '"+ p.getFechaFinal() +"', '"+ p.getSueldo() +"', '"+ p.getCargo() +"')";
    
         //   sql = sql + " insert into Contrato values ('"+ p.getIdEmpleado()+"', '"+ p.getFechaInicio() +"', '"+ p.getFechaFinal() +"', '"+ p.getSueldo() +"', '"+ p.getCargo() +"');";
        }
        if(proc.equals("update")){ 
            //actualizar 
            //el criterio de busqueda , se basa en ingresar el código de CLiente
            //sql = "update Cliente set Nombre = '"+ p.getNombre() +"', Telefono = '"+ p.getTelefono()+"', Grado = '"+ p.getGrado() +"',Grupo='"+p.getGrupo()+"', RUC = '"+ p.getRUC() +"' where idCliente = '"+ p.getIdCliente() +"'";
        }
        try{
            //resultado = con.updateSQL(sql2);
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
