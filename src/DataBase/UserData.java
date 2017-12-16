/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import java.sql.ResultSet;
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
      
      public boolean verifyDoctor(int id , String Password){
          
          boolean isFound = false;
       try{
        DataConnection aDataConnection = DataConnection.getDataConnection();
        
            aStatement = aDataConnection.getStatement();
            ResultSet rs = aStatement.executeQuery
                ("Select * from doctor where did='"
                     + id + "' and pass='"
             + Password + "'");
    
            if(rs.next())
                isFound=true;
        } catch (Exception ex) {
            Logger.getLogger(UserData.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        return isFound;
          
          
      }
      
   public boolean verifyUser(int id, String Password){
        boolean isFound = false;
       try{
        DataConnection aDataConnection = DataConnection.getDataConnection();
        
            aStatement = aDataConnection.getStatement();
            ResultSet rs = aStatement.executeQuery
                ("Select * from patient where id='"
                     + id + "' and password='"
             + Password + "'");
    
            if(rs.next())
                isFound=true;
        } catch (Exception ex) {
            Logger.getLogger(UserData.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        return isFound;
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
