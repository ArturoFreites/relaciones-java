/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Jugador;
import Entidades.Revolver;


public class ServiceJugador {
    
    
    public Jugador crearJugador(int id){
        
        Jugador jugador = new Jugador("Jugador "+id,id);
        
        return jugador;
    }
    
    public boolean disparo(Jugador jugador,ServiceRevolver servRevolver,Revolver revolver){
        
        if (servRevolver.mojar(revolver))
        {
            jugador.setMojado(true);
        }else{
            servRevolver.siguienteChorro(revolver);
        }
        
        return jugador.isMojado();
    }
    
}
