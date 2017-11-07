/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5.pkg7;

import java.util.Scanner;


public class Opcion {
    
    public void seleccionar (int op){
        
        Scanner sc = new Scanner (System.in);
        
       
        
        switch (op){
            
            case 1: 
                
                System.out.println("Teclee un número para a base");
            double base1 = sc.nextDouble();

                System.out.println("Área cuadrado: "+ Math.pow(base1, 2));
            break;
            
            case 2: 
                System.out.println("Teclee un número para a base");
                 double base2 = sc.nextDouble();
        
                System.out.println("Teclee outro número para a altura");
                 double altura = sc.nextDouble();
        
                System.out.println("Área triángulo: "+ base2*altura/2);
            break;
            
            case 3: 
                System.out.println("Teclee un número para o radio");
                double radio = sc.nextDouble();
                
                System.out.println("Área círculo: "+ Math.PI*Math.pow(radio, 2));
            break;
            
            default: System.out.println("Erro na opción");
        }
    }
}
