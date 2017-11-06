/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5.pkg2;

import java.util.Scanner;

/**
 *
 * @author tperezrodriguez
 */
public class Comparativos {
//     Implementa un programa no que se tecleen dous números de tipo short . 
//             Se o primeiro é maior ou igual que o segundo,visualizaremos a resta . 
//             En calquera caso visualizaremos a suma .
    
    public Comparativos (){
        
    }
    
    public void recogerNumeros (){
    Scanner sc = new Scanner(System.in);
    
        System.out.println("Dime un número");
        short num1 = sc.nextShort();
        
        System.out.println("Dime otro número");
        short num2 = sc.nextShort();

      if (num1 >= num2)  {
          System.out.println("Lo restamos: "+(num1 - num2)); 
          System.out.println("Lo sumamos "+ (num1 + num2));
      }
      
      else {
          System.out.println("Lo sumamos "+ (num1 + num2));
      }
    }
    
}
