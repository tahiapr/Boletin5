
package boletin5.pkg4;


public class Boletin54 {

  
    public static void main(String[] args) {
        // TODO code application logic here
        
         //Coñecidos o nome e o peso de dúas persoas, queremos 
    //escribir os datos da que pesa máis e, a diferenza de peso entre elas .
    
    Persona p1 = new Persona("Tahía", 50);
    
    Persona p2 = new Persona ("Alberto", 80);
    
    Calcularpeso calculo = new Calcularpeso ();
    
    calculo.calcularPeso(p1, p2);
    
    p1.setPeso(80);
    p2.setPeso(50);
    
    calculo.calcularPeso(p1, p2);
    }
    
    
}
