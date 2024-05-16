package Main;

import Vista.Login;
import Servicios.ReproductorMusica;

public class Main {

    public static void main(String[] args) {

        //Funcion que inicia un audio de musica mientras la aplicacion se este ejecutando
        ReproductorMusica.iniciarReproduccionMusica("/Musica/AccumulaTown.wav");

        //Creamos un nuevo objeto Login y lo iniciamos
        Login login = new Login();
        login.setVisible(true);
    }
}
