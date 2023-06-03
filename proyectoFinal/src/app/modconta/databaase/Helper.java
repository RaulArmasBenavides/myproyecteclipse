package app.modconta.databaase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
/**
 *
 * @author MARCELO
 */
public class Helper extends dbBean{
   

//funcion para listar combos en general     
  public DefaultComboBoxModel getvalues(String aux)
    {  
        
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        try {
             Connection cn = this.getConnection();
            //Strng s = "Select Nombre_Cliente from Cliente"; 
            String sql = "Select Nombre_"+aux +" from "+ aux +" order by Nombre_"+aux +" ASC" ;
            System.out.println(sql);
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                modelo.addElement(rs.getString(1));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return modelo ;
    }
    
    
 
public DefaultComboBoxModel getvaluesofModelo(String aux, String aux2)
    {  DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        try {
             Connection cn = this.getConnection();
            String sql = "Select Nombre_"+aux +" from "+  aux +" where Nombre_Marca='"+ aux2 +"' order by Nombre_"+aux +" ASC";
            System.out.println(sql);
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                modelo.addElement(rs.getString(1));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return modelo ;
    }

//funcion para listar combo Tienda  
public DefaultComboBoxModel getvaluesTienda(String aux)
    {  
        
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        try {
             Connection cn = this.getConnection();
            
            String sql = "Select Nombre from "+ aux +" order by Nombre ASC" ;
            System.out.println(sql);
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                modelo.addElement(rs.getString(1));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return modelo ;
    }


//funcion para listar comboEquipos de los equios segun una venta 
public DefaultComboBoxModel getvaluesEqVe(int aux)
    {  
        
        DefaultComboBoxModel vn = new DefaultComboBoxModel();
        try {
             Connection cn = this.getConnection();
            //se realizara un join
            String sql = " select x.Nombre_Equipo from Equipo x, DetalleVenta y  where y.idVenta = "+aux+" and x.idEquipo=y.idEquipo";
            //String sql = "select Nombre_Equipo where idEquipo = (select idEquipo from Venta where idVenta ="+ aux+ ")";
            System.out.println(sql);
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                vn.addElement(rs.getString(1));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return vn;
    }
    
 
    
}
