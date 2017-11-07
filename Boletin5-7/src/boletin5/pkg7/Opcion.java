/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5.pkg7;


public class Opcion {
    
    public void seleccionar (int op){
        
        switch (op){
            
            case 1: System.out.println("Cuadrado");
            break;
            
            case 2: System.out.println("Triángulo");
            break;
            
            case 3: System.out.println("Círculo");
            break;
            
            default: System.out.println("Erro na opción");
        }
    }
}
