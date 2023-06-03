package MODEL;
import app.modconta.entity.Cliente;
import app.modconta.databaase.dbBean;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ClienteDAO {
    
 public Vector<Cliente> ListaItem(boolean sw, String str) {
        Vector<Cliente> ClientesCollection = new Vector<Cliente>();
        dbBean con = new dbBean();
       /* String sql = "Select * from Cliente";
        //El criterio de busqueda para mostrar datos 
        if(sw == true)
        {
            sql = sql + " where Nombre like '"+str +"%'";
        }*/
      PreparedStatement pe = null;
     try {
         pe = con.getConnection().prepareCall("usp_clientes_listar");
     } catch (SQLException ex) {
         Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
     }
      try{
            ResultSet resultado = pe.executeQuery();
            while(resultado.next()){
                Cliente clien;
                clien = new Cliente();
                clien.setIdCliente(resultado.getInt(1));
                clien.setNombre(resultado.getString(2));
                clien.setApellidos(resultado.getString(3));
                clien.setTelefono(resultado.getString(4));
                clien.setDireccion(resultado.getString(5));
                clien.setSexo(resultado.getString(6));
                clien.setDNI(resultado.getString(7));
                clien.setRUC(resultado.getString(8));
                ClientesCollection.addElement(clien);     
            }
            
        }catch(java.sql.SQLException e){
            e.printStackTrace();
        }
     //con.close();
        return ClientesCollection; 
    }
  
 public int procesaItem(Cliente p, String proc){
        int resultado = 0;
        String sql = "";
        dbBean con = new dbBean();
        if(proc.equals("insert")){
            //insertar
         // PreparedStatement pe2 =  con.getConnection().prepareCall("{call usp_comprador_listar_all}");
          sql = "insert into clientes values ('"+ p.getNombre()+"', '"+ p.getApellidos()+"', '"+  p.getTelefono()+"', '"+p.getDireccion()+"', '"+ p.getSexo()+"', '"+  p.getDNI() + "', '"+p.getRUC() +"')" ;
            System.out.println("la query es " + sql);
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
