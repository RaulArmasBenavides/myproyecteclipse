/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.modconta.dataaccess;

//import app.modconta.entity.Ctascontables;
import app.modconta.databaase.db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
//import app.modconta.database.db;
//import app.modconta.entity.TipoCambio;

/**
 *
 * @author MARCELO
 */
public class FactorDo {
    
    private final db con;
    public FactorDo ()
    { 
      this.con = new db();
    }
    //Mètodo que busca el tipo de cambio a dòlares de hoy 
    //retorna el tipo de cambio
//      public TipoCambio TipoCambioHoy( String moneda ) {
//       //declaraciòn de variables 
//        TipoCambio c = null;  
//        //String x = Integer.toString(nrocuenta) ;
//        String sql ="Select * from tipocambio WHERE fecha >= DATEADD(day, -1, GETDATE()) and moneda = '" + moneda + "'";
//        System.out.println(sql);
//        Connection cn  = con.getConnection();
//        if (cn != null) {
//                try {
//                        PreparedStatement ps = cn.prepareStatement(sql);
//                        //ps.setInt(1, id);
//                        ResultSet rs = ps.executeQuery();
//                        while (rs.next()) {
//                             c = new TipoCambio();
//                             c.setTipoCanCompra(rs.getDouble(3));
//                             c.setTipoCanVenta(rs.getDouble(4));
//                        }
//                        ps.close();
//
//                } catch (SQLException e) 
//                {
//                    System.out.println(e);
//                } 
//        } else {  
//            System.out.println("Problemas de acceso a la base de datos ");
//            //System.err.println("Problemas para consultar: " + con.getMessage());
//        }
//        return c;
//	}
  
//  public List<Ctascontables> Listar() 
//{ 
//   List<Ctascontables> lista = null;
//   String Sxmt = "Select * from ctascontables" ;
//   Connection cn = con.getConnection();
//   if(cn != null) 
//   { 
//        try 
//         {        
//           PreparedStatement ps = cn.prepareStatement(Sxmt);
//           ResultSet rs = ps.executeQuery();
//           lista = new LinkedList<>();
//           while(rs.next())    
//           {
//            Ctascontables c = new Ctascontables();
//              // Cargo c = new Cargo();
//             // c.setIdcargo(rs.getString(1));
//             //  em.setIdcargo(c);
//               //em.setApellido(rs.getString(1));
//               //em.setNombre(rs.getString(2));
//               c.setIdcta(rs.getInt(1));
//               c.setNrocuenta(rs.getInt(2));
//               c.setDescripcion(rs.getString(3));
//               lista.add(c);
//           }
//           ps.close();
//           }
//           catch (Exception e) 
//          { 
//             // System.out.println("El error es" +e);}
//           // throw(e);
//          }
//           
//          finally 
//          {
//           System.out.println("The 'try catch' is finished.");}
//          }
//     return lista;
//}


    
}
