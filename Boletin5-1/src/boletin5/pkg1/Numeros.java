/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5.pkg1;

import java.util.Scanner;

/**
 *
 * @author tperezrodriguez
 */
public class Numeros {
    //codifica un programa que saque, por consola, 
    //un número tecleado, sempre que sexa positivo,xunto coa mensaxe “ e positivo “ .
    
    public Numeros (){
        
    }
    
    public void preguntarNumeros (){
      Scanner sc = new Scanner (System.in); 
      
        System.out.println("Dime un número, positivo o negativo");
        int numero = sc.nextInt();
        
        if (numero>0){
            System.out.println("¡Enhorabuena! Tu número es positivo");
        }
        
    }
    
    
    
   
}
