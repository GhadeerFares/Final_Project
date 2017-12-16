/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Search;

import DataBase.ConnectionMaker;

/**
 *
 * @author Ghadeer0
 */
public class SearchById implements InterfaceSearch{

    @Override
    public void search(int id) {
        
        ConnectionMaker con = new ConnectionMaker();
        con.searchById0(id);
      
    }
    
    
    
}
