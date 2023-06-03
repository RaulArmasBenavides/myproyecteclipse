package MODEL;

import app.modconta.databaase.dbBean;
import app.modconta.entity.Marca;
import java.sql.ResultSet;
import java.util.Vector;

public class MarcaDAO {
    public Vector<Marca> ListaItem(boolean sw, String str){
        Vector<Marca>item=new Vector<Marca>();
        dbBean con=new dbBean();
        String sql="Select*from Marca ";
        if(sw==true){
            sql=sql+"where Nombre_Marca like '"+str+"%'";
        }
        System.out.println("FII: +"+sql);
        try {
            ResultSet resultado=con.execSQL(sql);
            while(resultado.next()){
                Marca marc=new Marca();
                marc.setIdMarca(resultado.getInt(1));
                marc.setNombre(resultado.getString(2));
                item.addElement(marc);
            }
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
        try {
            con.close();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
        return item;
    }
    public int procesaItem(Marca p, String proc){
        int resultado=0;
        String sql="";
        dbBean con=new dbBean();
        if (proc.equals("insert")) {
            sql="insert into Marca values("+p.getIdMarca()+", '"+p.getNombre()+"')";
        }
        if(proc.equals("update")){
            sql=" update Marca set Nombre_Marca = '"+p.getNombre()+"' where id_Marca="+p.getIdMarca();
        }
        
        try {
            resultado=con.updateSQL(sql);
        } catch (java.sql.SQLException e) {
        }
        return resultado;
    }
}
