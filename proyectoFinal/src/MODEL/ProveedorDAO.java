package MODEL;

import app.modconta.entity.Proveedor;
import app.modconta.databaase.dbBean;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class ProveedorDAO {
    public Vector<Proveedor> ListaItem(boolean sw, String str){
        Vector<Proveedor>item=new Vector<Proveedor>();
        dbBean con=new dbBean();
        String sql=" Select*from Proveedor ";
        if(sw==true){
            sql=sql+" where RazonSocial like '"+str+"%' ";
        }
        System.out.println("FII: +"+sql);
        try {
            ResultSet resultado=con.execSQL(sql);
            while(resultado.next()){
                Proveedor prov=new Proveedor();
                prov.setIdProveedor(resultado.getInt(1));
                prov.setRazonSocial(resultado.getString(2));
                prov.setTelefono(resultado.getString(3));
                prov.setDireccion(resultado.getString(4));
                prov.setRUC(resultado.getString(5));
                item.addElement(prov);
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
    public int procesaItem(Proveedor p, String proc){
        int resultado=0;
        String sql="";
        dbBean con=new dbBean();
        if (proc.equals("insert")) {
            sql=" insert into Proveedor values("+p.getIdProveedor()+", '"+p.getRazonSocial()+"', '"+p.getTelefono()+"', '"+p.getDireccion()+"', '"+p.getRUC()+"')";
        }
        if(proc.equals("update")){
                sql=" update Proveedor set RazonSocial = '"+p.getRazonSocial()+"',Telefono='"+p.getTelefono()+"', Direccion='"+p.getDireccion()+"', RUC='"+p.getRUC()+"' where IdProveedor="+p.getIdProveedor();
        }
        
        try {
            resultado=con.updateSQL(sql);
        } catch (java.sql.SQLException e) {
        }
        return resultado;
    }
}