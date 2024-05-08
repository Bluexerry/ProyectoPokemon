package Controlador;

import Modelo.Pokemon;
import Servicios.PokemonM;
import java.util.ArrayList;
import javax.swing.JTable;

public class ControladorPokemon {

    //Conjunto de metodos para llamar al servicio desde la vista
    public void CrearPokemon(Pokemon pokemon) {
        new PokemonM().CrearPokemon(pokemon);
    }

    public void EliminarPokemon(Pokemon pokemon) {
        new PokemonM().EliminarPokemon(pokemon);
    }

    public void EditarPokemon(Pokemon pokemon) {
        new PokemonM().EditarPokemon(pokemon);
    }

    public ArrayList<Pokemon> ListarPokemon(JTable tabla) {
        return new PokemonM().ListarPokemon();
    }
}
