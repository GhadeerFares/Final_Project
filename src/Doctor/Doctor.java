/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Doctor;

/**
 *
 * @author Ghadeer0
 */
public class Doctor {
    
    
     private String patientname;
    private int patientid;
    private String patientPrescription;
    private String patientdisease ;
    private String patientTermenate;

    public Doctor(String patientname, int patientid, String patientPrescription, String patientdisease, String patientTermenate) {
        this.patientname = patientname;
        this.patientid = patientid;
        this.patientPrescription = patientPrescription;
        this.patientdisease = patientdisease;
        this.patientTermenate = patientTermenate;
    }
    
      public Doctor(String patientname) {
        
        this.patientname = patientname;
    }
    
    public  Doctor(){}

    public String getPatientname() {
        return patientname;
    }

    public void setPatientname(String patientname) {
        this.patientname = patientname;
    }

    public int getPatientid() {
        return patientid;
    }

    public void setPatientid(int patientid) {
        this.patientid = patientid;
    }

    public String getPatientPrescription() {
        return patientPrescription;
    }

    public void setPatientPrescription(String patientPrescription) {
        this.patientPrescription = patientPrescription;
    }

    public String getPatientdisease() {
        return patientdisease;
    }

    public void setPatientdisease(String patientdisease) {
        this.patientdisease = patientdisease;
    }

    public String getPatientTermenate() {
        return patientTermenate;
    }

    public void setPatientTermenate(String patientTermenate) {
        this.patientTermenate = patientTermenate;
    }
    
    
}
