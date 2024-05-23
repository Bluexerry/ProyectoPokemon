package Servicios;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;

public class LeerYEscribir {

    public static String rutaDeArchivo() {
        // Nombre del archivo a crear
        Path relativePath = Paths.get("src\\Texto");
        Path absolutePath = relativePath.toAbsolutePath();
        return absolutePath.toString();
    }

    public static void Leer(String ruta) {

        try {
            String rutaCompleta = rutaDeArchivo() + ruta;

            //Verifica que la ruta no sea nula
            if (rutaCompleta == null) {
                // Si no se encuentra el archivo, muestra un mensaje de advertencia y termina el método
                JOptionPane.showMessageDialog(null, "No se pudo encontrar el archivo");
                System.out.println("No se pudo encontrar el archivo.");
                return;
            }

            // Abre el archivo en modo lectura
            BufferedReader br = new BufferedReader(new FileReader(rutaCompleta));

            // Lee el archivo línea por línea y lo concatena en un StringBuilder con saltos de línea
            StringBuilder textoConSaltos = new StringBuilder();
            //Define la String linea
            String linea;
            //Mientras el String sea igual al lector del BufferReader y ademas no sea nulo
            while ((linea = br.readLine()) != null) {
                // El metodo append(linea) agrega la linea actual del archivo de texto al StringBuilder, y el append("<br>") agrega un salto de linea.
                textoConSaltos.append(linea).append("<br>");
            }

            // Cierra el BufferedReader
            br.close();

            // Muestra el texto con saltos de línea en un JOptionPane
            JOptionPane.showMessageDialog(null, "<html><body><p style='width: 300px;'>" + textoConSaltos.toString() + "</p></body></html>");
        } catch (IOException e) {
            // Si ocurre un error al leer el archivo, muestra un mensaje de error con la excepción
            JOptionPane.showMessageDialog(null, "Error al leer el archivo");
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public static void Escribir() {

        try {
            // Solicita al usuario que escriba en el archivo
            String texto = JOptionPane.showInputDialog("Escribe el contenido para el nuevo archivo");

            if (texto != null) {
                // Crea el archivo en el directorio "Texto" en base al directorioTexto, luego una llamada al metodo System para obtener un separador de directorios
                String rutaCompleta = rutaDeArchivo() + "/Nuevo.txt";

                // Se crea un BufferedWriter para escribir en el archivo
                BufferedWriter writer = new BufferedWriter(new FileWriter(rutaCompleta));

                // Escribe el contenido ingresado por el usuario en el archivo
                writer.write(texto);

                // Agrega una nueva línea después de la escritura
                writer.newLine();
                
                // Cierra el BufferedWriter
                writer.close();

                // Muestra un mensaje de éxito
                JOptionPane.showMessageDialog(null, "Se ha creado el archivo correctamente y se ha añadido el contenido");
            } else {
                JOptionPane.showMessageDialog(null, "No se ha escrito nada");
            }
        } catch (IOException e) {
            // Si ocurre un error al escribir en el archivo, muestra un mensaje de error
            JOptionPane.showMessageDialog(null, "Error al crear el archivo: " + e);
            // También imprime el mensaje de excepción en la consola
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    public static void LeerUrl(String url) {
        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            try {
                desktop.browse(new URI(url));
            } catch (IOException | URISyntaxException e) {
                System.out.println("Error de URL: " + e);
            }
        }
    }
}
