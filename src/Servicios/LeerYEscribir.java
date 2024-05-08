package Servicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import javax.swing.JOptionPane;

public class LeerYEscribir {

    public static void Leer(String ruta) {
        // Nombre del archivo dentro del paquete "Texto"

        try {
            // Obtiene la URL del archivo desde el classpath
            URL url = LeerYEscribir.class.getResource(ruta);
            if (url == null) {
                System.out.println("No se pudo encontrar el archivo.");
                return;
            }

            // Abre el archivo en modo lectura
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

            // Lee el archivo línea por línea y lo concatena en un StringBuilder con saltos de línea
            StringBuilder textoConSaltos = new StringBuilder();
            String linea;
            while ((linea = br.readLine()) != null) {
                textoConSaltos.append(linea).append("<br>"); // Agrega un salto de línea HTML
            }

            // Cierra el BufferedReader
            br.close();

            // Muestra el texto con saltos de línea en un JOptionPane
            JOptionPane.showMessageDialog(null, "<html><body><p style='width: 300px;'>" + textoConSaltos.toString() + "</p></body></html>");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public static void Escribir() {
        // Ruta completa del directorio "Texto"
       String directorioTexto = "C:/Users/Jesús/Documents/NetBeansProjects/Proyecto_Pokemon/proyectoPokemon/src/Texto";
        // Nombre del archivo a crear
        String archivo = "Nuevo.txt";

        try {
            // Crea el archivo en el directorio "Texto"
            String rutaCompleta = directorioTexto + System.getProperty("file.separator") + archivo;
            BufferedWriter writer = new BufferedWriter(new FileWriter(rutaCompleta));

            // Solicita al usuario que escriba en el archivo
            String texto = JOptionPane.showInputDialog("Escribe el contenido para el nuevo archivo:");

            // Escribe el contenido ingresado por el usuario en el archivo
            writer.write(texto);
            writer.newLine(); // Agrega una nueva línea después de la escritura

            // Cierra el BufferedWriter
            writer.close();

            JOptionPane.showMessageDialog(null, "Se ha creado el archivo correctamente y se ha añadido el contenido.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
