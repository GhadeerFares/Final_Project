/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ghadeer0
 */
public class DataConnection {
    private static DataConnection aDataConnection;
    private Connection aConnection;
    private Statement  aStatement ;
    
    private DataConnection(){}
    
     public static synchronized DataConnection getDataConnection(){
         
         if(aDataConnection == null)
            aDataConnection = new DataConnection();
        return aDataConnection;
    }
     
     
      public Statement getStatement()  throws Exception, SQLException{
          
 
         Class.forName("com.mysql.jdbc.Driver"); 
         
          aConnection =(Connection) DriverManager.getConnection("jdbc:mysql://localhost/patient","root","");
          
        aStatement = (Statement) aConnection.createStatement();
        return aStatement;
          
     }
      
        public void disDBConnection() {
        try {
            aConnection.close();
            aStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    
    
}
