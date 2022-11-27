
package Entidades;

import Enumeraciones.Palo;


public class Carta {
    
    private Integer numero;
    private Palo palo;

    public Carta(Integer numero) {
        this.numero = numero;
    }

    public Carta(Integer numero, Palo palo) {
        this.numero = numero;
        this.palo = palo;
    }


    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta{" + "numero=" + numero + ", palo=" + palo + '}';
    }
}
