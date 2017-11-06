
package boletin5.pkg6;


public class Clasificacion {
// < = 100 productos				baixo
// >100 e < = 500				medio
//> 500 e < = 100 				alto
//> 1000 					primeira necesidade
private Producto pr;

public Clasificacion (){   
}


public void clasificarProductos (Producto pr){

    if (pr.getVentas() <= 100) {
        System.out.println(pr.getNombre()+" es un producto de bajo consumo");
    }
    
    else if (pr.getVentas() > 100 && pr.getVentas() <= 500){
        System.out.println(pr.getNombre()+" es un producto de medio consumo");    
    }
    
    else if (pr.getVentas() > 500 && pr.getVentas() <= 1000){
        System.out.println(pr.getNombre()+" es un producto de alto consumo");
    }
    
    else {
        System.out.println(pr.getNombre()+" es un producto de primera necesidad");
    }
}

}

