
package g09.extra4;

import Service.ServiceSimulador;


public class G09Extra4 {

    
    public static void main(String[] args) {
        ServiceSimulador servSimulador = new ServiceSimulador();
        
        servSimulador.crearAlumnos();
        servSimulador.mostrarAlumnos();
        servSimulador.votacion();
        servSimulador.mostrarVotos();
        servSimulador.mostrarAlumnos();
        servSimulador.ordenarVotos();
    }
    
}
