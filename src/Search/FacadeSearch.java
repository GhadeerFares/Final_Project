/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Search;

/**
 *
 * @author Ghadeer0
 */
public class FacadeSearch {
    
    private InterfaceSearch aSearchById;
    
    public FacadeSearch(){
        
        aSearchById = new SearchById();
    
    }
    
}
