/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.modconta.dataaccess;


import app.modconta.entity.Movimiento;
import app.modconta.databaase.db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author MARCELO
 */
public class MovimientosDo {
    
    private final db con;
    public MovimientosDo ()
    { 
      this.con = new db();
    }
    
    
  public List<Movimiento> ListarMovimientos() 
  { 
   List<Movimiento> listaMov = null;
   Movimiento mov = null;
   String Sxmt = "Select * from movimientos" ;
   System.out.println(Sxmt);
   Connection cn = con.getConnection();
   if(cn != null) 
   { 
        try 
         {        
           PreparedStatement ps = cn.prepareStatement(Sxmt);
           ResultSet rs = ps.executeQuery();
           listaMov = new LinkedList<>();
           while(rs.next())    
           {
              mov = new Movimiento();
//              mov.setIdmovimiento(rs.getInt(1));
//              mov.setDescripcion(rs.getString(2));
//              mov.setMoneda(rs.getString(3));
//              mov.setUser(rs.getString(4)); 
//              mov.setFecha(rs.getDate(5)); 
//              mov.setFactorConv(rs.getDouble(6));
//              mov.setFactorConv(rs.getDouble(7));
              listaMov.add(mov);
           }
           ps.close();
           }
           catch (SQLException ex) 
          { 
           System.out.println("ERROR:" + ex.getMessage());
          }
           
          finally 
          {
           System.out.println("The 'try catch' is finished.");}
          }
     return listaMov;
  }

    public boolean RegistrarMovimiento ( Movimiento mov ) throws SQLException
    {       
        boolean ok = false;
      //Movimiento mov = null;
      String Sxmt = "";
  //"insert into movimientos values ('"+ mov.getDescripcion() +"','" + mov.getMoneda() +"','"+ mov.getUser() + "',GETDATE()," + mov.getFactorConv().toString() +"," + mov.getMonto().toString()+")";
      Connection cn = db.getConnection();
      if(cn != null) 
     { 
        try 
         {        
           PreparedStatement ps = cn.prepareStatement(Sxmt);
           ps.executeUpdate();
   
           ps.close();
           }
           catch (SQLException ex) 
          {  
              System.out.println(ex.getMessage());
              return false;
          
          }
           
          finally 
          {
           System.out.println("The 'try catch' is finished.");}
          }
        return true;
      }

}
