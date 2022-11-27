
package Entidades;

import java.util.ArrayList;


public class Mazo {
    
    private ArrayList<Carta> cartas;

    public Mazo(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    public Mazo() {
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    @Override
    public String toString() {
        return "Mazo{" + "cartas=" + cartas + '}';
    }
    

}
