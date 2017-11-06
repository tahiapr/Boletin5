
package boletin5.pkg6;


public class Boletin56 {


    public static void main(String[] args) {
        // TODO code application logic here
        
    Producto producto1 = new Producto ("Arroz", 100);
    Clasificacion clas = new Clasificacion ();
    
    clas.clasificarProductos(producto1);
    
    Producto producto2 = new Producto ("Chocolate", 900);
    clas.clasificarProductos(producto2);
    
    Producto producto3 = new Producto ("Leche", 440);
    clas.clasificarProductos(producto3);
    
        
    Producto producto4 = new Producto ("Bubalús de fresa", 1440);
    clas.clasificarProductos(producto4);
    }
}
