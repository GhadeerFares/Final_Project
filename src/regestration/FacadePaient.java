/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regestration;

/**
 *
 * @author Ghadeer0
 */
public class FacadePaient {
    private static PatientRegisration aPatientRegisration;
    private static PatientModel aPatientModel;
    
    public FacadePaient(){
        
        aPatientModel = new PatientModel();
        aPatientRegisration = new PatientRegisration();
                
    }
    
    
    
}
