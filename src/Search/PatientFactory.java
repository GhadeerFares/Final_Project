/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Search;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ghadeer0
 */
public class PatientFactory {
    
    private static ArrayList<Class> className = new ArrayList<Class>();
    
     public static InterfaceSearch creatPatient(String s){
         
         InterfaceSearch i = null;
         Class cc;
         
        try {
            cc = Class.forName(s);
             Constructor con = cc.getConstructor();
             
              i = (InterfaceSearch)con.newInstance();
              
              
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PatientFactory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(PatientFactory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(PatientFactory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(PatientFactory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(PatientFactory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(PatientFactory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(PatientFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
         
         return i;
         
         
     }
      public static void ComItem(Class aclass) {
                    className.add(aclass);
                  }
      
       public static ArrayList<Class> getPatient() {
                   return className;
                  }
    
}
