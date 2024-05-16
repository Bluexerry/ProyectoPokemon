package BBDD;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {

    // Configuración de la conexión a la base de datos
    static String timeZone = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    static String dbName = "proyecto_j";
    static String host = "localhost";
    static int port = 3306;
    static String url = "jdbc:mysql://" + host + ":" + port + "/" + dbName + timeZone;
    static String user = "root";
    static String pass = "";
    static String driver = "com.mysql.cj.jdbc.Driver";

    static Connection conexion;

    // Método para obtener una conexión a la base de datos
    public static Connection getConnection() {
        try {
            // Cargar el driver de la base de datos
            Class.forName(driver);
            // Establecer la conexión con la base de datos
            return conexion = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException e) {
            // Mostrar un mensaje de error en caso de excepción
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }

    // Método para ejecutar una sentencia SQL de tipo SELECT
    public static ResultSet ejecutarSetentenciaSelect(String sentencia) {
        try {
            // Obtener una conexión a la base de datos
            Connection con = getConnection();
            // Crear un objeto Statement para ejecutar la sentencia SQL
            Statement stm = con.createStatement();
            // Ejecutar la sentencia SQL y obtener el resultado
            ResultSet resultado = stm.executeQuery(sentencia);
            return resultado;
        } catch (SQLException e) {
            // Mostrar un mensaje de error en caso de excepción
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println("Error: " + sentencia);
            return null;
        }
    }

    // Método para ejecutar una sentencia SQL de tipo INSERT, UPDATE o DELETE
    public static void ejecutarSentenciaEdit(String sentencia) {
        try {
            // Obtener una conexión a la base de datos
            Connection con = getConnection();
            // Crear un objeto Statement para ejecutar la sentencia SQL
            Statement stm = con.prepareStatement(sentencia);
            // Ejecutar la sentencia SQL
            stm.execute(sentencia);
            // Cerrar la conexión y el objeto Statement
            con.close();
            stm.close();
            // Mostrar un mensaje de éxito
            JOptionPane.showMessageDialog(null, "Editado con éxito");
        } catch (SQLException e) {
            // Mostrar un mensaje de error en caso de excepción
            JOptionPane.showMessageDialog(null, "No he podido insertar");
            System.out.println("Error: " + sentencia);
        }
    }
}
