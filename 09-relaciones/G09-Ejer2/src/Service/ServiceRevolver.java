
package Service;

import Entidades.Revolver;
import java.util.Objects;

public class ServiceRevolver {
    
    
    public Revolver llenarRevolver(){
        
        Revolver revolver = new Revolver();
        
        revolver.setPosActual(Aleatorio(1,5));
        revolver.setPosAgua(Aleatorio(1,5));
        
        return revolver;
    }
    
    private static int Aleatorio(int min, int max) {
		int range = (max - min) + 1;
		return (int)(Math.random() * range) + min;
	}
    
    
    public boolean mojar(Revolver revolver){
       
        return Objects.equals(revolver.getPosActual(), revolver.getPosAgua());
        
    }
    
    public void siguienteChorro (Revolver revolver){
        
        if (revolver.getPosActual()<6)
        {
            revolver.setPosActual(revolver.getPosActual()+1);
        }else{
            revolver.setPosActual(1);
        }
   
    }
    
}
