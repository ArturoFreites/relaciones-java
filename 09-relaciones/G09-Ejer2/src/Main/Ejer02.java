package Main;

import Service.ServiceJuego;


public class Ejer02 {

    
    public static void main(String[] args) {
        
        ServiceJuego serviceJuego = new ServiceJuego();
        
        serviceJuego.llenarJuego();
        serviceJuego.ronda();
        
    }
    
}
