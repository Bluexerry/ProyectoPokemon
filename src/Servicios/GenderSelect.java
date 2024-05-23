package Servicios;

// Importamos las clases necesarias para la conexión a la base de datos y la interfaz de usuario
import BBDD.Conexion;
import Modelo.Genero;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import java.sql.*;
import javax.swing.JOptionPane;

public class GenderSelect {

    // Definimos un objeto de tipo Genero para representar la opción por defecto en el ComboBox
    public static Genero defaultGender = new Genero(-1, "Seleccionar");

    // Método que proporciona un modelo para un JComboBox que contiene una lista de géneros
    public DefaultComboBoxModel getGenders() {

        // Creamos una lista (Vector) para almacenar los géneros
        Vector<Genero> generos = new Vector<>();
        // Añadimos el género por defecto a la lista
        generos.add(defaultGender);

        // Definimos la consulta SQL para obtener todos los géneros de la base de datos
        String consulta = "SELECT * FROM genero";
        try {

            // Ejecutamos la consulta y obtenemos un ResultSet con los resultados
            ResultSet rs = Conexion.ejecutarSetentenciaSelect(consulta);

            // Iteramos por cada fila del ResultSet
            while (rs.next()) {

                // Creamos un objeto Genero con los datos obtenidos de la base de datos
                Genero g = new Genero(rs.getInt(1), rs.getString(2));

                // Añadimos el nuevo objeto Genero a la lista
                generos.add(g);
            }
        } catch (SQLException e) {
            // En caso de error, mostramos un mensaje de error al usuario y en la consola
            JOptionPane.showMessageDialog(null, "Error: " + e);
            System.out.println("Error: " + e);
        }
        // Retornamos un DefaultComboBoxModel creado a partir de la lista de géneros
        return new DefaultComboBoxModel(generos);
    }
}
