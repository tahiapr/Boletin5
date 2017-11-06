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
public class Persona {
    //Coñecidos o nome e o peso de dúas persoas, queremos 
    //escribir os datos da que pesa máis e, a diferenza de peso entre elas .
    
    private String nombre;
    private double peso;
    
    Persona (){
        
    }
    
    Persona (String nombre, double peso){
     this.nombre=nombre;
     this.peso = peso;
    }
    
    public void setPeso (double peso){
        this.peso=peso;
    }
    
    public double getPeso(){
        return peso;
    }
    
    public void setNombre (String nombre){
        this.nombre=nombre;
    }
    
    public String getNombre (){
        return nombre;
    }
    
   
}
