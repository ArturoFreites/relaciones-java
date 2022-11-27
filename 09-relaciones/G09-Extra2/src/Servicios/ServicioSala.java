package Servicios;

import Entidades.Espectador;
import Entidades.Sala;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ServicioSala {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    ArrayList<String> lugaresLibres = new ArrayList();

    private void llenarMatriz(Sala sala) {

        String matriz[][] = sala.getAsientos();
        String[] letras =
        {
            "A", "B", "C", "D", "E", "F"
        };

        for (int i = 0; i < 8; i++)
        {

            for (int j = 0; j < 6; j++)
            {
                matriz[i][j] = (8 - i) + letras[j]+" ";
                lugaresLibres.add(String.valueOf(i) + String.valueOf(j));
            }
        }
        sala.setAsientos(matriz);
    }

    private void cargarPersonas(Sala sala) {
        
        ServicioEspectador se = new ServicioEspectador();

        System.out.println("Ingrese cantidad de personas");
        int cantidad = read.nextInt();

        for (int i = 0; i < cantidad; i++)
        {
            sala.getEspectadores().add(se.crearEspectador());
        }

    }

    private void mostrarMatriz(Sala sala) {

        String matriz[][] = sala.getAsientos();

        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 6; j++)
            {
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println("");
        }

    }

    private void ubicarPersonas(Sala sala) {

        ArrayList<Espectador> espectadores = sala.getEspectadores();
        double precio = sala.getPrecio();
        int edad = sala.getPelicula().getEdadMinima();
        Collections.shuffle(lugaresLibres);
        

        for (Espectador espectador : espectadores)
        {
            if (espectador.getDinero() >= precio && espectador.getEdad() >= edad)
            {
                
                if (lugaresLibres.isEmpty())
                {
                    System.out.println("No hay lugar mostro");
                    
                    break;
                } else
                {
                    marcarLugarOcupado(lugaresLibres.get(0),sala);
                    lugaresLibres.remove(0);
                }
                
            }
        }

    }

    private void marcarLugarOcupado(String pos, Sala sala) {

        int i = Integer.parseInt(pos.substring(0,1));
        int j = Integer.parseInt(pos.substring(1,2));
        
        String matriz [][] = sala.getAsientos();
        
        matriz[i][j]= matriz[i][j].replace(" ", "X");
        
        sala.setAsientos(matriz);
        
    }
    
    public Sala crearSala (){
        
        Sala sala = new Sala();
        ServicioPelicula sp = new ServicioPelicula();
        
        sala.setPelicula(sp.crearPelicula());
        System.out.println("Ingrese precio de la Sala");
        sala.setPrecio(read.nextDouble());
        
        return sala;
    }
    
    
    public void iniciarSala(){
        
        System.out.println("Creando sala..");
        Sala sala = crearSala();
        
        System.out.println("Limpiando Sala..");
        llenarMatriz(sala);
        mostrarMatriz(sala);
        cargarPersonas(sala);
        
        System.out.println("Sentando gente");
        
        ubicarPersonas(sala);
        mostrarMatriz(sala);
        
        System.out.println("Inició la pelicula");
    }

    

    
}
