
package Entidades;

import java.util.Comparator;
import java.util.Objects;


public class Alumno implements Comparable<Alumno>{
    
    private String nombreCompleto;
    private String dni;
    private Integer cantVotos = 0;

    public Alumno() {
    }

    public Alumno(String nombreCompleto, String dni, Integer cantVotos) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.cantVotos = cantVotos;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Integer getCantVotos() {
        return cantVotos;
    }

    public void setCantVotos(Integer cantVotos) {
        this.cantVotos = cantVotos;
    } 

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.nombreCompleto);
        hash = 29 * hash + Objects.hashCode(this.dni);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.nombreCompleto, other.nombreCompleto))
        {
            return false;
        }
        if (!Objects.equals(this.dni, other.dni))
        {
            return false;
        }
        return true;
    }

    
    
    @Override
    public String toString() {
        return "Nombre=" + nombreCompleto;
    }

    @Override
    public int compareTo(Alumno t) {
        return t.getCantVotos().compareTo(this.cantVotos);
    }
    
    
    
}
