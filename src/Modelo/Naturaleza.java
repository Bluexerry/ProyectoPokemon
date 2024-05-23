package Modelo;

public class Naturaleza {
    
    private int id;
    private String nombre;

    public Naturaleza() {
    }

    public Naturaleza(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
