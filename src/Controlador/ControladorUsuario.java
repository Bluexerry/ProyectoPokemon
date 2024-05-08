package Controlador;

import Modelo.Usuario;
import Servicios.UsuarioM;
import java.util.ArrayList;
import javax.swing.JTable;

public class ControladorUsuario {

    //Conjunto de metodos para llamar al servicio desde la vista
    public void CrearUsuario(Usuario usuario) {
        new UsuarioM().CrearUsuario(usuario);
    }

    public void EliminarUsuario(Usuario usuario) {
        new UsuarioM().EliminarUsuario(usuario);
    }

    public boolean LogUsuario(Usuario usuario, String TextoUsuario, String TextoContraseña) {
        return new UsuarioM().LogUsuario(usuario);
    }

    public ArrayList<Usuario> ListarUsuarios(JTable tabla) {
        return new UsuarioM().ListarUsuarios();
    }
}
