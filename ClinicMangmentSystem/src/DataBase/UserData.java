/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import regestration.PatientRegisration;

/**
 *
 * @author Ghadeer0
 */
public class UserData {
    
      private Statement aStatement;
      
      private static  UserData aUserData;
      
      
      private UserData(){}
      
      
     
      public static synchronized UserData getUserData(){
         if(aUserData == null) {
           aUserData = new UserData();
       }
           return aUserData;
      }
      
      
      
      
        public void PatientRegistration(PatientRegisration aPatientRegisration){
            
            DataConnection aDataConnection = DataConnection.getDataConnection();
            
          try {
              aStatement = aDataConnection.getStatement();
         
            String strSQL = "Insert into patient(firstname,lastname,address,id,password) values('"+
                    aPatientRegisration.getFname()+"','"+
                    aPatientRegisration.getLname()+"','"+
                    aPatientRegisration.getAddress()+"','"+
                    aPatientRegisration.getId()+"','"+
                    aPatientRegisration.getPassword()+"')";
            aStatement.executeUpdate(strSQL);
            
            } catch (Exception ex) {
                
                   System.out.println(ex.getMessage());
            }
            
        }
      
    
}
