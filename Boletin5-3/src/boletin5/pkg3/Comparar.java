/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5.pkg3;

import java.util.Scanner;

/**
 *
 * @author tperezrodriguez
 */
public class Comparar {
    //Teclear un número e sacar por consola o signo “ + “ se o nº é positivo, 
    //o signo “ –“ se é negativo e “ 0 “ se é cero .
    
    public Comparar (){
        
    }
    
    public void compararNum (){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Teclea un número ya sea positivo o negativo");
        int num = sc.nextInt();
        
        if (num>0){
            System.out.println("+");
        }
        else if (num<0){
             System.out.println("-");
                }
        else {
            System.out.println("0");
        }
    }
}
