
package boletin5.pkg6;


public class Producto {
private String nombre;
private int ventas;

public Producto (){
    
}

public Producto (String nombre, int ventas){
this.nombre=nombre;
this.ventas=ventas;
}

public void setNombre (String nombre){
this.nombre=nombre;
}

public String getNombre (){
return nombre;    
}

public void setVentas (int ventas){
this.ventas=ventas;
}

public int getVentas (){
return ventas;    
}

}
