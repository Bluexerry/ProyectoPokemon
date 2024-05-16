package Controlador;

import Modelo.Pokemon;
import Servicios.PokemonM;
import java.util.ArrayList;
import javax.swing.JTable;

public class ControladorPokemon {

    private final PokemonM pokemonM;

    public ControladorPokemon() {
        pokemonM = new PokemonM();
    }

    //Conjunto de metodos para llamar al servicio desde la vista
    public void CrearPokemon(Pokemon pokemon) {
        pokemonM.CrearPokemon(pokemon);
    }

    public void EliminarPokemon(Pokemon pokemon) {
        pokemonM.EliminarPokemon(pokemon);
    }

    public void EditarPokemon(Pokemon pokemon) {
        pokemonM.EditarPokemon(pokemon);
    }

    public ArrayList<Pokemon> ListarPokemon(JTable tabla) {
        return pokemonM.ListarPokemon();
    }
}
