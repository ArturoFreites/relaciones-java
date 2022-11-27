
package Entidades;

import java.util.HashSet;

public class Voto {
    
    private Alumno alumno;
    private HashSet<Alumno> alumnos;

    public Voto() {
    }

    public Voto(Alumno alumno, HashSet<Alumno> alumnos) {
        this.alumno = alumno;
        this.alumnos = alumnos;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public HashSet<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(HashSet<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Voto{" + "alumno=" + alumno + ", alumnos=" + alumnos + "}\n";
    }
    
    
    
    
}
