package Modelo;

public class Pokemon {

    private String nombre;
    private int num_pok;
    private String numero_pok;
    private int genero_id;
    private String genero;
    private int tipo1_id;
    private String tipo1;
    private int tipo2_id;
    private String tipo2;
    private int naturaleza_id;
    private String naturaleza;

    public Pokemon() {

    }

    public Pokemon(String nombre) {
        this.nombre = nombre;
    }

    public Pokemon(String nombre, int genero_id, int naturaleza_id) {
        this.nombre = nombre;
        this.genero_id = genero_id;
        this.naturaleza_id = naturaleza_id;
    }

    public Pokemon(String nombre, int num_pok, int genero_id, int tipo1_id, int tipo2_id, int naturaleza_id) {
        this.nombre = nombre;
        this.num_pok = num_pok;
        this.genero_id = genero_id;
        this.tipo1_id = tipo1_id;
        this.tipo2_id = tipo2_id;
        this.naturaleza_id = naturaleza_id;
    }

    public Pokemon(String nombre, String numero_pok, String genero, String tipo1, String tipo2, String naturaleza) {
        this.nombre = nombre;
        this.numero_pok = numero_pok;
        this.genero = genero;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
        this.naturaleza = naturaleza;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum_pok() {
        return num_pok;
    }

    public void setNum_pok(int num_pok) {
        this.num_pok = num_pok;
    }

    public int getGenero_id() {
        return genero_id;
    }

    public void setGenero_id(int genero_id) {
        this.genero_id = genero_id;
    }

    public int getTipo1_id() {
        return tipo1_id;
    }

    public void setTipo1_id(int tipo1_id) {
        this.tipo1_id = tipo1_id;
    }

    public int getTipo2_id() {
        return tipo2_id;
    }

    public void setTipo2_id(int tipo2_id) {
        this.tipo2_id = tipo2_id;
    }

    public int getNaturaleza_id() {
        return naturaleza_id;
    }

    public void setNaturaleza_id(int naturaleza_id) {
        this.naturaleza_id = naturaleza_id;
    }

    public String getNumero_pok() {
        return numero_pok;
    }

    public void setNumero_pok(String numero_pok) {
        this.numero_pok = numero_pok;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTipo1() {
        return tipo1;
    }

    public void setTipo1(String tipo1) {
        this.tipo1 = tipo1;
    }

    public String getTipo2() {
        return tipo2;
    }

    public void setTipo2(String tipo2) {
        this.tipo2 = tipo2;
    }

    public String getNaturaleza() {
        return naturaleza;
    }

    public void setNaturaleza(String naturaleza) {
        this.naturaleza = naturaleza;
    }
}
