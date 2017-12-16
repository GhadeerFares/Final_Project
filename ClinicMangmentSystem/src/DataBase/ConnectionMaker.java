/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import regestration.PatientRegisration;

/**
 *
 * @author Ghadeer0
 */
public class ConnectionMaker {
    
    private static UserData aUserData;
    
    
    
     public  ConnectionMaker(){
     
     }
     
     
     
     public void registration0(PatientRegisration aPatientRegisration){
         aUserData.getUserData().PatientRegistration(aPatientRegisration);
       
    }
    
    
}
