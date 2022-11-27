
package Entidades;


public class Jugador {
    
    private String nombre;
    private Integer id;
    private boolean mojado;
    
    public Jugador() {
    }

    public Jugador(String nombre, Integer id, boolean mojado) {
        this.nombre = nombre;
        this.id = id;
        this.mojado = mojado;
    }
    
    public Jugador(String nombre, Integer id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    
    
    
    
}
