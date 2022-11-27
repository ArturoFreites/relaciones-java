
package Service;

import Entidades.Alumno;
import java.util.ArrayList;
import java.util.Collections;


public class ServiceAlumno {
    
    ArrayList<String>nombres = new ArrayList();
    ArrayList<String>apellidos = new ArrayList();
    ArrayList<String>dnis = new ArrayList();
    
    public Alumno crearAlumnno(){
        
        Alumno alumno = new Alumno();
        
        alumno.setNombreCompleto(generarNombre());
        alumno.setDni(gererarDni());
        dnis.remove(0);
        
        return alumno;
    }
    
    
    private String generarNombre() {
        
        Collections.shuffle(nombres);
        Collections.shuffle(apellidos);
        String nombre = nombres.get(0)+" "+apellidos.get(0);
        
        return nombre;
    }
    
    private String gererarDni(){
        
        Collections.shuffle(dnis);
        
        return dnis.get(0);
    }
    
    public void cargarDnis() {
        
        for (int i = 40000000; i < 40000100; i++)
        {
            dnis.add(String.valueOf(i));
        }
    }
    
    public void cargarNombres (){
        
        nombres.add("Aldo");
        nombres.add("Aquiles");
        nombres.add("Juan");
        nombres.add("José");
        nombres.add("Carlos");
        nombres.add("Alberto");
        nombres.add("Miguel");
        nombres.add("Lucas");
        nombres.add("Benjamín");
        nombres.add("Martín");
        nombres.add("Matías");
        nombres.add("Luis");
        nombres.add("Alejandro");
        nombres.add("Diego");
        nombres.add("Gabriel");
        nombres.add("Santiago");
        nombres.add("Matías");
        nombres.add("Sebastián");
        nombres.add("Mateo");
        nombres.add("Nicolás");
        nombres.add("Lucas");
        nombres.add("Enzo");
        nombres.add("Ivan");
    }
    
    public void cargarApellidos (){
        
        apellidos.add("Freites");
        apellidos.add("Gonzales");
        apellidos.add("Ramirez");
        apellidos.add("Echeverria");
        apellidos.add("Macchi");
        apellidos.add("Allen");
        apellidos.add("Poblete");
        apellidos.add("Juarez");
        apellidos.add("Acosta");
        apellidos.add("Sanchez");
        apellidos.add("Gutierrez");
        apellidos.add("Olmos");
        apellidos.add("Zarantonello");
    }
    
}
