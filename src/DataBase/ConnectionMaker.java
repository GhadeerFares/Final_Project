/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import Doctor.Doctor;
import java.util.logging.Level;
import java.util.logging.Logger;
import regestration.PatientRegisration;

/**
 *
 * @author Ghadeer0
 */
public class ConnectionMaker {
    
    private static UserData aUserData;
    private static PatientData aPatientData;
    
    
    
     public  ConnectionMaker(){
     
     }
     
     
     
     public void registration0(PatientRegisration aPatientRegisration){
         aUserData.getUserData().PatientRegistration(aPatientRegisration);
       
    }
     
       public void AddPatient0(PatientRegisration aPatientRegisration){
         aPatientData.getPatientData().AddPatient(aPatientRegisration);
         
       
    }
     
     
     public boolean verifyUser0(int id, String password){
      if( aUserData.getUserData().verifyUser(id, password))
      
       return true; 
       else              
       return false;
    }
     
      
     public boolean verifyDoctor0(int id, String password){
      if( aUserData.getUserData().verifyDoctor(id, password))
      
       return true; 
       else              
       return false;
    }
     
     public void deletePatient0(PatientRegisration aPatientRegisration){
        aPatientData.getPatientData().deletePatient(aPatientRegisration);
    }
    
      public void searchById0(int id){
      
        try {
            aPatientData.getPatientData().searchById(id);
        } catch (Exception ex) {
            Logger.getLogger(ConnectionMaker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       public void Prescrption0(Doctor aDoctor){
         aPatientData.getPatientData().Prescrption(aDoctor);
         
       
    }
        public void Review0(Doctor aDoctor){
         aPatientData.getPatientData().Review(aDoctor);
         
       
    }
       
      
      
}
