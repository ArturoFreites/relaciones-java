
package Servicios;

import Entidades.Espectador;
import java.util.Scanner;



public class ServicioEspectador {
    
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public Espectador crearEspectador(){
        
        Espectador espectador= new Espectador();
        
        System.out.println("Ingrese nombre");
        espectador.setNombre(read.next());
        
        System.out.println("Ingrese edad");
        espectador.setEdad(read.nextInt());
        
        System.out.println("Ingrese dinero disponible");
        espectador.setDinero(read.nextDouble());
        
        return espectador;
    }
    
}
