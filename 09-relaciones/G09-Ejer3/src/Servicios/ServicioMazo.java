package Servicios;

import Entidades.Carta;
import Entidades.Mazo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ServicioMazo {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Mazo crearMazo() {

        ServicioCartas sc = new ServicioCartas();

        return new Mazo(sc.cargarCartas());
    }

    private void barajar(Mazo mazo) {

        Collections.shuffle(mazo.getCartas());
    }

    private void sigCarta(Mazo mazo, ArrayList<Carta> cartasDadas) {

        if (mazo.getCartas().isEmpty())
        {
            System.out.println("No hay mas cartas maestro!");
        } else
        {
            cartasDadas.add(mazo.getCartas().get(0));
            mazo.getCartas().remove(0);
        }

    }

    private void darCartas(Mazo mazo, ArrayList<Carta> cartasDadas) {

        System.out.println("Ingrese cantidad de cartas a dar:");

        int cantidadCartas = read.nextInt();

        if (cantidadCartas > mazo.getCartas().size())
        {
            System.out.println("No me alcanza bro");

        } else
        {
            for (int i = 0; i < cantidadCartas; i++)
            {
                sigCarta(mazo, cartasDadas);
            }
            System.out.println("Tus cartas han sido enviadas");
        }
    }

    public void mostrarMenu() {
        System.out.println("1-Barajar mazo");
        System.out.println("2-Siguiente carta");
        System.out.println("3-Cartas disponibles");
        System.out.println("4-Dar Cartas");
        System.out.println("5-Mostrar monton");
        System.out.println("6-Mostrar baraja");
        System.out.println("7-Salir");
    }

    public void menu() {

        Mazo mazo1 = crearMazo();
        ArrayList<Carta> cartasDadas = new ArrayList();

        int op;

        do
        {
            mostrarMenu();
            System.out.println("Ingrese opcion");
            op = read.nextInt();

            switch (op)
            {
                case 1:
                    barajar(mazo1);
                    break;
                case 2:
                    sigCarta(mazo1, cartasDadas);
                    break;
                case 3:
                    System.out.println(mazo1.getCartas().size());
                    break;
                case 4:
                    darCartas(mazo1, cartasDadas);
                    break;
                case 5:

                    if (cartasDadas.isEmpty())
                    {
                        System.out.println("No te dimos nada bro");
                    } else
                    {
                        System.out.println(cartasDadas.toString());
                    }

                    break;
                case 6:

                    if (mazo1.getCartas().isEmpty())
                    {
                        System.out.println("tengo nada");
                    } else
                    {
                        System.out.println(mazo1.getCartas().toString());
                    }

                    break;
                case 7:
                    System.out.println("vuelvas prontos");
                    break;
                default:
                    System.out.println("Ingrese opcion correcta!");
            }

        } while (op != 7);
    }

}
