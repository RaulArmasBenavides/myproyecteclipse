package MODEL;
import app.modconta.databaase.dbBean;
import app.modconta.entity.Administrador;
import java.sql.ResultSet;
import java.util.Vector;
/**
 *
 * @author MARCELO
 */
public class AdministradorDAO {
     public Vector<Administrador> ListaItem(boolean sw, String str){
        
     Vector<Administrador> item = new Vector<Administrador>();
        dbBean con = new dbBean();
        String sql = "Select * from Administrador";
        //El criterio de busqueda para mostrar datos 
        if(sw == true)
        {
            sql = sql + " where Nombre like '"+str +"%'";
        }
        System.out.println("FII: "+ sql);
        try{
            ResultSet resultado = con.execSQL(sql);
            while(resultado.next()){
                Administrador adm;
                adm = new Administrador();
                adm.setIdAdministradorTO(resultado.getInt(1));
                adm.setUsuario(resultado.getString(2));
                adm.setClave(resultado.getString(3));
                item.addElement(adm);     
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
    public int procesaItem(Administrador p, String proc){
        int resultado = 0;
        String sql = "";
        dbBean con = new dbBean();
        if(proc.equals("insert")){
            //insertar
          //sql = "insert into Cliente values ('"+ p.getIdCliente()+"', '"+ p.getNombre()+"', '"+ p.getApellidos()+"', '"+  p.getTelefono()+"', '"+ p.getDNI() + "', '"+p.getRUC() +"')" ;
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
