/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5.pkg4;

/**
 *
 * @author tperezrodriguez
 */
public class Calcularpeso {
    
    public Calcularpeso (){
        
    }
    
     public void calcularPeso (Persona p1, Persona p2){
        
        if (p2.getPeso()>p1.getPeso()){
            System.out.println(p2.getNombre() +" es la persona que más pesa " + (p2.getPeso()-p1.getPeso())+ " kg");
        }
        
        else {
          System.out.println(p1.getNombre() +" es la persona que más pesa " + (p1.getPeso()-p2.getPeso())+ " kg");  
        }
    }
}
