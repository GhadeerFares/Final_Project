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
public class PatientRegisration {
    
      private int id;
    private String Password;
    private String fname;
    private String lname;
    private String address;

    public PatientRegisration(int id, String Password, String fname, String lname, String address) {
        this.id = id;
        this.Password = Password;
        this.fname = fname;
        this.lname = lname;
        this.address = address;
    }
    
    
    public PatientRegisration (){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
