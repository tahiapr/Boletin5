/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5.pkg5;

import java.util.Scanner;

/**
 *
 * @author tperezrodriguez
 */
public class Numero {
  //Dados 3 números que se supon distintos , indicar cal é o maior
    
   public Numero (){
       
   }
   
   public void ComprarNum (int num1, int num2, int num3){
       
       if (num1 > num2 && num1 > num3){
           System.out.println(num1+" , num1, es el número mayor");
       }
       
       else if (num2 > num1 && num2 > num3){
           System.out.println(num2+" , el num2, es el número mayor");
       }
       
       else {
           System.out.println(num3+" , el num3, es el número mayor.");
       }
   }
    
    
    
}
