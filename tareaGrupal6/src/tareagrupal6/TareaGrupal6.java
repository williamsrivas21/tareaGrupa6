/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareagrupal6;

/**
 *
 * @author WILLIAMS
 */
public class TareaGrupal6 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           
        
        Medico medico = new Medico();
        Deportista deportista = new Deportista();
        
      deportista.getId();
      deportista.getNombre();
      deportista.getApellidos();
        
        medico.getEspecialidad();
        medico.getNombre();
        medico.getApellidos();
        
        
        System.out.println("La especialiada es:"+ medico.getEspecialidad());
        System.out.println("El nombre es:"+   medico.getNombre());
        System.out.println("El Apellido es:"+    medico.getApellidos());
        
        
        System.out.println("El Ide es:"+  deportista.getId());
        System.out.println("El nombre es:"+   deportista.getNombre());
        System.out.println("El Apellido es:"+    deportista.getApellidos());
                
       
        
    }
    
}
