package Servicios;

import Modelo.Pokemon;
import BBDD.Conexion;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.*;

public class PokemonM {

    //Metodo que devuelve una lista de pokemon
    public ArrayList ListarPokemon() {

        //Creamos la lista
        ArrayList<Pokemon> datosP = new ArrayList<>();

        //Hacemos la query con INNER JOINS debido a la variedad de tablas
        String consulta = "SELECT p.Num_Pok, p.Nombre, g.Nombre, t1.Nombre, t2.Nombre, n.Nombre"
                + " FROM pokemon p"
                + " INNER JOIN genero g ON p.Genero_id = g.ID"
                + " INNER JOIN tipo t1 ON p.Tipo1_id = t1.ID"
                + " LEFT JOIN tipo t2 ON p.Tipo2_id = t2.ID"
                + " INNER JOIN naturaleza n ON p.Naturaleza_id = n.ID;";
        try {

            //Llamamos la conexion de consultas para obtener un resultado
            ResultSet rs = Conexion.ejecutarSetentenciaSelect(consulta);

            //Reitera por cada dato recogido
            while (rs.next()) {

                //Creamos objeto pokemon
                Pokemon p = new Pokemon();

                //Setamos el valor definido 
                p.setNumero_pok(rs.getString(1));
                p.setNombre(rs.getString(2));
                p.setGenero(rs.getString(3));
                p.setTipo1(rs.getString(4));
                p.setTipo2(rs.getString(5));
                p.setNaturaleza(rs.getString(6));

                //Añadimos el nuevo valor a la lista
                datosP.add(p);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
            System.out.println("Error: " + e);
        }
        return datosP;
    }

    //Metodo para insertar un nuevo pokemon
    public void CrearPokemon(Pokemon pokemon) {

        //Definimos variables que igualamos el getter del objeto pokemon
        int num_pok = pokemon.getNum_pok();
        String nombre = pokemon.getNombre();
        int genero = pokemon.getGenero_id();
        int tipo1 = pokemon.getTipo1_id();
        int tipo2 = pokemon.getTipo2_id();
        int naturaleza = pokemon.getNaturaleza_id();

        //Hacemos el insert de todos los valores necesarios
        String insert = "INSERT INTO pokemon VALUES (" + num_pok + ",'" + nombre + "'," + genero + "," + tipo1 + "," + tipo2 + "," + naturaleza + ")";

        //Ejecutamos la query, esta no debe devolvernos nada
        Conexion.ejecutarSentenciaEdit(insert);
    }

    //Metodo para eliminar un pokemon
    public void EliminarPokemon(Pokemon pokemon) {

        //Definimos una variable del nombre del pokemon y la igualamos al getter de este
        String nombre = pokemon.getNombre();

        //Hacemos el delete del valor del nombre
        String delete = "DELETE FROM pokemon WHERE Nombre = '" + nombre + "'";

        //Ejecutamos la query
        Conexion.ejecutarSentenciaEdit(delete);
    }

    //Metodo para editar el la naturaleza y el genero de un pokemon
    public void EditarPokemon(Pokemon pokemon) {

        //Creamos las variables de nombre, genero y naturaleza y las igualamos a los getter de pokemon
        String nombre = pokemon.getNombre();
        int genero = pokemon.getGenero_id();
        int naturaleza = pokemon.getNaturaleza_id();

        //Hacemos el seteo de lo la naturaleza y el genero en base al nombre
        String update = "UPDATE pokemon SET Genero_id = " + genero + ", Naturaleza_id = " + naturaleza + " WHERE Nombre = '" + nombre + "'";

        //Ejecutamos la query
        Conexion.ejecutarSentenciaEdit(update);
    }
}
