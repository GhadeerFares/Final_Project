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
public class FacadeDoctor {
    
    private static Description aDescription;
    private static Review aReview;
    
    public FacadeDoctor(){
        
        aDescription = new Description();
        aReview = new Review();
    }
    
    
}
