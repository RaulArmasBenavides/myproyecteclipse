package MODEL;

import app.modconta.databaase.dbBean;
import app.modconta.entity.Modelo;
import java.sql.ResultSet;
import java.util.Vector;

public class ModeloDAO {
     public Vector<Modelo> ListaItem(boolean sw, String str){
        Vector<Modelo>item=new Vector<Modelo>();
        dbBean con=new dbBean();
        String sql="Select*from Modelo ";
        if(sw==true){
            sql=sql+"where Nombre_Modelo like '"+str+"%' or Nombre_Marca like '"+str+"%'";
        }
        System.out.println("FII: +"+sql);
        try {
            ResultSet resultado=con.execSQL(sql);
            while(resultado.next()){
                Modelo mod=new Modelo();
                mod.setIdModelo(resultado.getInt(1));
                mod.setNombre(resultado.getString(2));
                mod.setNombre_Marca(resultado.getString(3));
                item.addElement(mod);
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
    public int procesaItem(Modelo p, String proc){
        int resultado=0;
        String sql="";
        dbBean con=new dbBean();
        if (proc.equals("insert")) {
            sql="insert into Modelo values("+p.getIdModelo()+", '"+p.getNombre()+"', '"+p.getNombre_Marca()+"')";
        }
        if(proc.equals("update")){
            sql=" update Modelo set Nombre_Modelo = '"+p.getNombre()+"',Nombre_Marca='"+p.getNombre_Marca()+" where id_personal="+p.getIdModelo();
        }
        
        try {
            resultado=con.updateSQL(sql);
        } catch (java.sql.SQLException e) {
        }
        return resultado;
    }
}
