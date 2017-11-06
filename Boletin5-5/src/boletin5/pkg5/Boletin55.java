
package boletin5.pkg5;

import java.util.Scanner;


public class Boletin55 {

 
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2, num3;
        
        Numero obj = new Numero ();
        Scanner entrada = new Scanner (System.in); 
        
        System.out.println("Dime un número");
        num1 = entrada.nextInt();
        
         System.out.println("Dime un número");
        num2 = entrada.nextInt();
        
         System.out.println("Dime un número");
        num3 = entrada.nextInt();
        
       obj.ComprarNum(num1, num2, num3);
        
    }
    
}
