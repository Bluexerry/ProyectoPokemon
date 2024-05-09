package Servicios;

import Modelo.Usuario;
import BBDD.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UsuarioM {

    //Metodo que devuelve una lista de usuarios
    public ArrayList ListarUsuarios() {

        //Creamos la lista
        ArrayList<Usuario> datosU = new ArrayList<>();

        //Hacemos la query 
        String consulta = "SELECT * FROM usuario";
        try {

            //Llamamos la conexion de consultas para obtener un resultado
            ResultSet rs = Conexion.ejecutarSetentenciaSelect(consulta);

            //Reitera por cada dato recogido
            while (rs.next()) {

                //Creamos objeto usuario
                Usuario u = new Usuario();

                //Setamos el valor definido
                u.setId(rs.getInt(1));
                u.setNombre(rs.getString(2));
                u.setApellido(rs.getString(3));
                u.setTelefono(rs.getString(4));
                u.setContraseña(rs.getString(5));

                //Añadimos el nuevo valor a la lista
                datosU.add(u);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
            System.out.println("Error: " + e);
        }
        return datosU;

    }

    //Metodo para insertar un nuevo usuario
    public void CrearUsuario(Usuario usuario) {

        //Definimos las variables que igualamos al getter del objeto usuario
        String nombre = usuario.getNombre();
        String apellido = usuario.getApellido();
        String telefono = usuario.getTelefono();
        String contraseña = usuario.getContraseña();

        //Hacemos el insert de todos los valores necesarios
        String insert = "INSERT INTO usuario (Nombre, Apellido, Telefono, Contrasena) VALUES ('" + nombre + "','" + apellido + "','" + telefono + "','" + contraseña + "')";

        //Ejecutamos la query, esta no debe devolvernos nada
        Conexion.ejecutarSentenciaEdit(insert);
    }

    //Metodo para eliminar un usuario
    public void EliminarUsuario(Usuario usuario) {

        //Definimos una variable del nombre del usuario y la igualamos al getter de este
        int id = usuario.getId();

        //Hacemos el delete del valor del nombre
        String delete = "DELETE FROM usuario WHERE ID = " + id;

        //Ejecutamos la query
        Conexion.ejecutarSentenciaEdit(delete);
    }

    //Metodo para loguear un usuario ya creado
    public boolean LogUsuario(Usuario usuario) {
        try {

            //Definimos una variable del nombre del usuario y contraseña y las igualamos al getter de este
            String nombre = usuario.getNombre();
            String contraseña = usuario.getContraseña();

            //Hacemos la query para obtener el nombre y la contraseña
            String query = "SELECT nombre, contrasena FROM usuario WHERE nombre = '" + nombre + "' AND contrasena = '" + contraseña + "';";

            //Ejecutamos la query, esta no debe devolvernos nada
            ResultSet rs = Conexion.ejecutarSetentenciaSelect(query);

            //Reitera mientras se sigan obteniendo resultados
            while (rs.next()) {

                //En caso de que el nombre y la contraseña sean iguales al obtenido desde la vista se retorna un true
                if (rs.getString("nombre").equals(nombre) && rs.getString("contrasena").equals(contraseña)) {
                    JOptionPane.showMessageDialog(null, "Logueado con exito");
                    return true;
                }
            }

            //El caso contrario, se retorna un false
            JOptionPane.showMessageDialog(null, "Usuario y/o contraseña desconocidos");
            return false;
        } catch (SQLException e) {
        }
        return false;
    }
}
