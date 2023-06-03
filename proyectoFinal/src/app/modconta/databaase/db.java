/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.modconta.databaase;

import app.modconta.entity.Constantes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author MARCELO
 */
public class db {
    
   
    public static Connection getConnection() {
        Connection cn = null;
        try {
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
         cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=dblogistica",Constantes.user_sa,Constantes.clave_sa);
        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            System.out.println(ex);
        }
        return cn;
      
   }
}
