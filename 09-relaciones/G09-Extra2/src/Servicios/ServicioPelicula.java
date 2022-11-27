/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Pelicula;
import java.util.Scanner;


public class ServicioPelicula {
    
    
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public Pelicula crearPelicula(){
        
        Pelicula pelicula= new Pelicula();
        
        System.out.println("Ingrese titulo de la pelicula");
        pelicula.setTitulo(read.next());
        
        System.out.println("Ingrese director");
        pelicula.setDirector(read.next());
        
        System.out.println("Ingrese duracion de la pelicula");
        pelicula.setDuracion(read.nextInt());
        
        System.out.println("Ingrese edad minima para ver la pelicula");
        pelicula.setEdadMinima(read.nextInt());
        
        return pelicula;
    }
}
