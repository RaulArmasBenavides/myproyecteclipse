package MODEL;
import app.modconta.databaase.dbBean;
import app.modconta.entity.Diagnostico;
import java.sql.ResultSet;
import java.util.Vector;
/**
 *
 * @author MARCELO
 */
public class DiagnosticoDAO {
        public Vector<Diagnostico> ListaItem(boolean sw, String str){
        Vector<Diagnostico> item = new Vector<Diagnostico>();
        dbBean con = new dbBean();
        String sql = "Select * from Diagnostico";
        //El criterio de busqueda para mostrar 
        if(sw == true)
        {
            sql = sql + " where Nombre like '"+str +" %'";
        }
        System.out.println("FII: "+ sql);
        try{
            ResultSet resultado = con.execSQL(sql);
            while(resultado.next()){
                Diagnostico d = new Diagnostico();
                d.setIdDiagnostico(resultado.getInt(1));
                d.setCausa(resultado.getString(2));
                d.setFallo(resultado.getString(3));
                d.setSolucion(resultado.getString(4));
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
    public int procesaItem(Diagnostico d, String proc){
        int resultado = 0;
        String sql = "";
        dbBean con = new dbBean();
        if(proc.equals("insert")){
            //insertar
            //sql = "insert into Cliente values ('"+ p.getIdCliente()+"', '"+ p.getNombre()+"', '"+  p.getTelefono()+"', '"+ p.getGrado() +"', '"+ p.getGrupo() +"', '"+p.getRUC() +"')";
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
