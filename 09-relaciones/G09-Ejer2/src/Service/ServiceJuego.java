
package Service;

import Entidades.Juego;
import Entidades.Jugador;
import java.util.Scanner;

public class ServiceJuego {
    
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    ServiceRevolver sr = new ServiceRevolver();
    ServiceJugador sj = new ServiceJugador();
    Juego juego = new Juego();
    
    public void llenarJuego(){
        
        llenarJugadores();
        juego.setRevolver(sr.llenarRevolver());
        
    }
    
    public void llenarJugadores(){
        
        System.out.println("Ingrese cantidad de jugadores");
        
        int cantJugadores = read.nextInt();
        
        if (cantJugadores>6)
        {
            cantJugadores=6;
        }
        
        for (int i = 1; i <=cantJugadores ; i++)
        {
            juego.getJugadores().add(sj.crearJugador(i));
            
        }
        
    }
    
    public void ronda(){
        boolean finJuego=false;
        
        System.out.println("---- INICIA LA RULETA ----");
        
        do{
            
            for (Jugador jugador : juego.getJugadores())
            {
                
                System.out.println(juego.getRevolver().toString());
                System.out.println(jugador.getNombre());
                
                if (sj.disparo(jugador, sr, juego.getRevolver()))
                {
                    System.out.println("El " + jugador.getNombre() + " se suicidó con agua!");
                    finJuego = true;
                    break;
                }
                else{
                    System.out.println("safo!");
                }
                
            }
            
        }while(!finJuego);
        
    }
    
}
