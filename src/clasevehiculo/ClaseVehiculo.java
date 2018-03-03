/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasevehiculo;

/**
 *
 * @author geo
 */
public class ClaseVehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carro obj = new Carro ();
         
    obj.setCarro("BMW");
    obj.setNumLantas(5);
    obj.setPlaca("JDM135");
    obj.setModelo(1995);
    
      System.out.println(obj.getCarro());
      System.out.println(obj.getNumLantas());            
      System.out.println(obj.getPlaca());            
      System.out.println(obj.getModelo());     
    }
    
    }
    
}
