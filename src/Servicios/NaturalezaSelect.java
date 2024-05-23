package Servicios;

// Importamos las clases necesarias para la conexión a la base de datos y la interfaz de usuario
import BBDD.Conexion;
import Modelo.Naturaleza;
import javax.swing.DefaultComboBoxModel;
import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;

public class NaturalezaSelect {

    // Definimos un objeto de tipo Naturaleza para representar la opción por defecto en el ComboBox
    public static Naturaleza defaultNature = new Naturaleza(-1, "Seleccionar");

    // Método que proporciona un modelo para un JComboBox que contiene una lista de naturalezas
    public DefaultComboBoxModel getNaturalezas() {

        // Creamos una lista (Vector) para almacenar las naturalezas
        Vector<Naturaleza> naturalezas = new Vector<>();
        // Añadimos la naturaleza por defecto a la lista
        naturalezas.add(defaultNature);

        // Definimos la consulta SQL para obtener todas las naturalezas de la base de datos
        String consulta = "SELECT * FROM naturaleza";
        try {

            // Ejecutamos la consulta y obtenemos un ResultSet con los resultados
            ResultSet rs = Conexion.ejecutarSetentenciaSelect(consulta);

            // Iteramos por cada fila del ResultSet
            while (rs.next()) {

                // Creamos un objeto Naturaleza con los datos obtenidos de la base de datos
                Naturaleza n = new Naturaleza(rs.getInt(1), rs.getString(2));

                // Añadimos el nuevo objeto Naturaleza a la lista
                naturalezas.add(n);
            }
        } catch (SQLException e) {
            // En caso de error, mostramos un mensaje de error al usuario y en la consola
            JOptionPane.showMessageDialog(null, "Error: " + e);
            System.out.println("Error: " + e);
        }
        // Retornamos un DefaultComboBoxModel creado a partir de la lista de naturalezas
        return new DefaultComboBoxModel(naturalezas);
    }
}
