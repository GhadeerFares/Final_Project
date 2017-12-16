/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patient;

import DataBase.DataConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;

/**
 *
 * @author Ghadeer0
 */
public abstract  class Patient {
   
         
           public abstract void cost(int id , float price)throws Exception;
           
     
   
         
}
