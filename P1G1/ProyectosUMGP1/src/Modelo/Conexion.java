/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

<<<<<<< HEAD
import java.sql.Connection;
=======
/**
 *
 * @author CastilloC
 */

import com.mysql.jdbc.Connection;
>>>>>>> 867b6d161acecc7281f47ebb7d43788fe1bf0810
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

<<<<<<< HEAD
/**
 *
 * @author snake
 */
public class Conexion {
   private final String base = "admin1";
    private final String user = "root";
    private final String password ="";
    private final String url = "jdbc:mysql://localhost/" + base;
=======
public class Conexion {
    
    private final String base = "tienda";
    private final String user = "root";
    private final String password = "";
    private final String url = "jdbc:mysql://localhost:3306/" + base;
>>>>>>> 867b6d161acecc7281f47ebb7d43788fe1bf0810
    private Connection con = null;
    
    public Connection getConexion()
    {
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(this.url, this.user, this.password);
            
        } catch(SQLException e)
        {
            System.err.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
      return con;  
<<<<<<< HEAD
    } 
}
=======
    }

}
>>>>>>> 867b6d161acecc7281f47ebb7d43788fe1bf0810
