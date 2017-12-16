/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import Doctor.Doctor;
import com.mysql.jdbc.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import regestration.PatientRegisration;

/**
 *
 * @author Ghadeer0
 */
public class PatientData {
    
    private Statement aStatement;
    private static PatientData aPatientData;
    
    
    private PatientData(){}
    
    
     public static synchronized PatientData getPatientData(){
         if(aPatientData == null) {
           aPatientData = new PatientData();
       }
           return aPatientData;
      }
     
     
     
       public void AddPatient(PatientRegisration aPatientRegisration){
           
           
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
       
       
       public void deletePatient(PatientRegisration aPatientRegisration){
           
           DataConnection aDataConnection = DataConnection.getDataConnection();
           
        try {
            aStatement = aDataConnection.getStatement();  
            
           String sql = "delete from patient where id ='"+
                aPatientRegisration.getId()+"'";
           
        
             aStatement.executeUpdate(sql);
             
               } catch (Exception ex) {
            Logger.getLogger(PatientData.class.getName()).log(Level.SEVERE, null, ex);
        }
           
       }
       
       
        public String searchById(int id) throws Exception {
        String s = null;
        try {
             DataConnection aDataConnection = DataConnection.getDataConnection();
           
               aStatement = aDataConnection.getStatement();  
              String query = ("SELECT * FROM patient WHERE id ="+id);
            
              ResultSet r = (ResultSet) aStatement.executeQuery(query);
             
              while(r.next()) {
               s =  r.getString("firstname".trim()) +" "+r.getString("lastname".trim()) +" "+ r.getString("address".trim())
                       +" "+r.getString("id".trim());
                       
               System.out.println(s);
            } 
        } catch (SQLException ex) {
            Logger.getLogger(DataConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
         return s;
        
    }
        
        
         public void Prescrption(Doctor aDoctor){
           
           
            DataConnection aDataConnection = DataConnection.getDataConnection();
            
          try {
              aStatement = aDataConnection.getStatement();
         
            String strSQL = "Insert into prescriptionpatient(patientname,patientid,patientPrescription,patientdisease,patientTermenate) values('"+
                    aDoctor.getPatientname()+"','"+
                    aDoctor.getPatientid()+"','"+
                    aDoctor.getPatientPrescription()+"','"+
                    aDoctor.getPatientdisease()+"','"+
                    aDoctor.getPatientTermenate()+"')";
            aStatement.executeUpdate(strSQL);
            
            } catch (Exception ex) {
                
                   System.out.println(ex.getMessage());
            }
    
}
         
           public void Review(Doctor aDoctor){
           
           
            DataConnection aDataConnection = DataConnection.getDataConnection();
            
          try {
              aStatement = aDataConnection.getStatement();
         
            String strSQL = "Insert into review(patientid,review) values('"+
                    aDoctor.getPatientid()+"','"+
                    aDoctor.getPatientPrescription()
                   +"')";
            aStatement.executeUpdate(strSQL);
            
            } catch (Exception ex) {
                
                   System.out.println(ex.getMessage());
            }
    
}
}