package Servicios;

// Importamos las clases necesarias para la conexión a la base de datos y la interfaz de usuarios
import BBDD.Conexion;
import Modelo.Tipo;
import javax.swing.DefaultComboBoxModel;
import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;

public class TipoSelect {

    // Definimos un objeto de tipo Tipo para representar la opción por defecto en el ComboBox
    public static Tipo deaultTipo = new Tipo(-1, "Seleccionar");

    // Método que proporciona un modelo para un JComboBox que contiene una lista de tipos
    public DefaultComboBoxModel getTipos() {

        // Creamos una lista (Vector) para almacenar los tipos
        Vector<Tipo> tipos = new Vector<>();
        // Añadimos el tipo por defecto a la lista
        tipos.add(deaultTipo);

        // Definimos la consulta SQL para obtener todos los tipos de la base de datos
        String consulta = "SELECT * FROM tipo";
        try {

            // Ejecutamos la consulta y obtenemos un ResultSet con los resultados
            ResultSet rs = Conexion.ejecutarSetentenciaSelect(consulta);

            //Reitera por cada dato recogido
            while (rs.next()) {

                // Ejecutamos la consulta y obtenemos un ResultSet con los resultados
                Tipo n = new Tipo(rs.getInt(1), rs.getString(2));

                // Añadimos el nuevo objeto Tipo a la lista
                tipos.add(n);
            }
        } catch (SQLException e) {
            // En caso de error, mostramos un mensaje de error al usuario y en la consola
            JOptionPane.showMessageDialog(null, "Error: " + e);
            System.out.println("Error: " + e);
        }
        // Retornamos un DefaultComboBoxModel creado a partir de la lista de tipos
        return new DefaultComboBoxModel(tipos);
    }
}
