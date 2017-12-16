/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patient;

/**
 *
 * @author Ghadeer0
 */
public class FactoryPatient {
    
      public Patient getTypeofpatient(String RationCard){
        if (RationCard == null) {
            return null;
        }
        if (RationCard.equalsIgnoreCase("PatientWithTherRationCard")) {
            return new PatientWithTherRationCard();
        } else if (RationCard.equalsIgnoreCase("PatientWithoutRationCard")) {
            return new PatientWithoutRationCard();
        }
        return null;
    }
    
}
