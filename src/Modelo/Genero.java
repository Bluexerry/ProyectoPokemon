package Modelo;

public class Genero {

    private int id;
    private String nombre;

    public Genero() {
    }

    public Genero(int id, String nombre) {
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
