/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;


public class Sala {
    
    private ArrayList<Espectador> espectadores = new ArrayList();
    private Pelicula pelicula;
    private Double precio;
    private String asientos [][]= new String [8][6];

    public Sala() {
    }

    public Sala(ArrayList<Espectador> espectadores, Pelicula pelicula, Double precio) {
        this.espectadores = espectadores;
        this.pelicula = pelicula;
        this.precio = precio;
    }

    public ArrayList<Espectador> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(ArrayList<Espectador> espectadores) {
        this.espectadores = espectadores;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(String[][] asientos) {
        this.asientos = asientos;
    }
    
    
}
