package Controlador;

import Modelo.Usuario;
import Servicios.UsuarioM;
import java.util.ArrayList;
import javax.swing.JTable;

public class ControladorUsuario {

    public final UsuarioM usuarioM;

    public ControladorUsuario() {
        usuarioM = new UsuarioM();
    }

    //Conjunto de metodos para llamar al servicio desde la vista
    public void CrearUsuario(Usuario usuario) {
        usuarioM.CrearUsuario(usuario);
    }

    public void EliminarUsuario(Usuario usuario) {
        usuarioM.EliminarUsuario(usuario);
    }

    public boolean LogUsuario(Usuario usuario, String TextoUsuario, String TextoContraseña) {
        return usuarioM.LogUsuario(usuario);
    }

    public ArrayList<Usuario> ListarUsuarios(JTable tabla) {
        return usuarioM.ListarUsuarios();
    }
}
