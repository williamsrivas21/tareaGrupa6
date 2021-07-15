/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareamodulo4parte2;

import equipo.españa;
import equipo.francia;
import equipo.italia;

/**
 *
 * @author WILLIAMS
 */
public class Tareamodulo4parte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        francia fa = new francia();
        italia  ia = new italia();
          españa  ea = new españa();
        
        System.out.println(fa.getEquipo());
         System.out.println(fa.getCapitan());
        System.out.println(ia.getEquipo());
         System.out.println(ia.getCapitan());
         System.out.println(ea.getEquipo());
         System.out.println(ea.getCapitan());
    }
    
}
