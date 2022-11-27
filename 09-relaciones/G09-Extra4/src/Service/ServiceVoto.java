/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Alumno;
import Entidades.Voto;
import java.util.ArrayList;
import java.util.HashSet;


public class ServiceVoto {
    
    public Voto crearVoto(Alumno votante,ArrayList<Alumno> alumnos){
        
        HashSet<Alumno>votados = new HashSet();
        
        int i;
        int cantVotos;
        Voto voto = new Voto();
        voto.setAlumno(votante);
        
        while(votados.size()<3){
            
            i=Aleatorio(0,alumnos.size()-1);
            
            if (!alumnos.get(i).equals(votante))
            {
                votados.add(alumnos.get(i));
                cantVotos=alumnos.get(i).getCantVotos()+1;
                alumnos.get(i).setCantVotos(cantVotos);
            }
        }
        
        voto.setAlumnos(votados);
        
        return voto;
    }
    
    public static int Aleatorio(int min, int max) {
		int range = (max - min) + 1;
		return (int)(Math.random() * range) + min;
    }

    
}
