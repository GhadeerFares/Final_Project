/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patient;

import DataBase.DataConnection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Ghadeer0
 */
public class PatientWithTherRationCard extends Patient{
    
     DataConnection aDataConnection = DataConnection.getDataConnection();
        
         private Statement aStatement;
         
         
         private ResultSet rs ;

    @Override
    public void cost(int id, float price) throws Exception {
        
         float cost = (float) (price +price*10/200) ;
         
           DataConnection aDataConnection = DataConnection.getDataConnection();
        
            aStatement = aDataConnection.getStatement();
            
            aStatement.execute("insert into patientwithrationcard(id,price,cost) values ('" + id+ "','"  + price + "','" + cost + "')");
        JOptionPane.showMessageDialog(null, "Done Successfully ");
    }
         
         
    
}
