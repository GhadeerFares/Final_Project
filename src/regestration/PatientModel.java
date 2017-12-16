/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regestration;

import java.util.Observable;

/**
 *
 * @author Ghadeer0
 */
public class PatientModel extends Observable{
    
    private PatientRegisration aPatientRegisration;
    
    public PatientRegisration getPatientRegisration(){
        
        return aPatientRegisration;
    }
    
    public void setPatientRegisration(PatientRegisration aPatientRegisration){
        
        this.aPatientRegisration = aPatientRegisration;
        
        setChanged();
        notifyObservers();
    }
    
}
