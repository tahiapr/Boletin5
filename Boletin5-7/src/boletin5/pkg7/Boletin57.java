
package boletin5.pkg7;

import java.util.Scanner;


public class Boletin57 {

    
    public static void main(String[] args) {
//         Codifica un programa que, utilizando un menú de opcións, calcule a superficie de distintas figuras . 
//     O usuario premerá a opción desexada .Según esta o programa pediralle os datos precisos e, utilizando un switch…case visualizará o resultado .
//   No caso de premer unha opción que non teña o menú visualizar unha mensaxe de “ opción incorrecta “.
//1…. Cadrado
//2…. Triangulo
//3…. Circulo

    Scanner sc = new Scanner (System.in);
    Opcion obj = new Opcion ();
    
        System.out.println(" **** MENÚ **** \n 1) ÁREA CADRADO \n 2) ÁREA TRIÁNGULO \n 3) ÁREA CÍRCULO \n Prema unha opción ");
        int op = sc.nextInt();
        
        obj.seleccionar(op);
        
    }
    
}
