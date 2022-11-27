
package Service;

import Entidades.Alumno;
import Entidades.Voto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ServiceSimulador {
    
    ServiceAlumno servAlumno = new ServiceAlumno();
    ServiceVoto servVoto= new ServiceVoto();
    
    ArrayList<Alumno> alumnos = new ArrayList();
    ArrayList<Voto> votos = new ArrayList();
    
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public void crearAlumnos(){
        
        servAlumno.cargarApellidos();
        servAlumno.cargarNombres();
        servAlumno.cargarDnis();
        
        System.out.println("Ingrese cantidad de alumnos que va a generar");
        int cantAlumnos = read.nextInt();
        
        for (int i = 0; i < cantAlumnos; i++)
        {
            alumnos.add(servAlumno.crearAlumnno());
        }
    }
    
    public void mostrarAlumnos(){
        
        System.out.println("------------- ALUMNOS ----------------------");
        for (Alumno alumno : alumnos)
        {
            System.out.println("Nombre: " + alumno.getNombreCompleto() + " | DNI: "+alumno.getDni()+" |VOTOS: "+alumno.getCantVotos());
        }
        System.out.println("-----------------------------------");
    }
    
    public void votacion(){
        
        for (Alumno alumno : alumnos)
        {
            Voto voto = servVoto.crearVoto(alumno, alumnos);
            votos.add(voto);
        }
    }
    
    public void mostrarVotos(){
        
        System.out.println("------------ VOTOS --------------");
        
        for (Voto voto : votos)
        {
            System.out.println("Votante: " + voto.getAlumno().getNombreCompleto()+ " votos: "+voto.getAlumnos().toString());
        }
        
    }
    
    public void ordenarVotos(){
        
        Collections.sort(alumnos);
        
        System.out.println("------------ SELECCIONADOS --------------");
        
        if (alumnos.size()>=10)
        {
            for (int i = 0; i < 5; i++)
            {
                System.out.println("Facilitador : " + alumnos.get(i).getNombreCompleto() + " votos: "+alumnos.get(i).getCantVotos());
            }
            for (int i = 5; i < 10; i++)
            {
                System.out.println("Facilitador Suplente : " + alumnos.get(i).getNombreCompleto() + " votos: "+alumnos.get(i).getCantVotos());
            }
            
        }else{
            System.out.println("No alcaza la gente para poner facilitadores y facilitadores suplentes");
        }
        
    }
    
}
