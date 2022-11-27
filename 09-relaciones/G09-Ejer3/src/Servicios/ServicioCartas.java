
package Servicios;

import Entidades.Carta;
import Enumeraciones.Palo;
import java.util.ArrayList;


public class ServicioCartas {
    
    
    
    private Carta crearCarta(Palo palo, Integer num){  
         
        return new Carta(num,palo);
    }
    
    public ArrayList<Carta> cargarCartas(){
        
        ArrayList<Carta> cartas = new ArrayList();
        
        for (int i = 1; i <= 10; i++)
        {   
            if (i>7)
            {
                cartas.add(crearCarta(Palo.ORO,i+2));
                cartas.add(crearCarta(Palo.BASTO,i+2));
                cartas.add(crearCarta(Palo.COPA,i+2));
                cartas.add(crearCarta(Palo.ESPADA,i+2));
            }else{
                cartas.add(crearCarta(Palo.ORO,i));
                cartas.add(crearCarta(Palo.BASTO,i));
                cartas.add(crearCarta(Palo.COPA,i));
                cartas.add(crearCarta(Palo.ESPADA,i));
            }
        }
        
        return cartas;
    }
    
}
