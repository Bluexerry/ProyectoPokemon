package Servicios;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class ReproductorMusica {

    public static Clip clip;

    public static void iniciarReproduccionMusica(String ruta) {
        // Se inicia un nuevo hilo para reproducir la música
        Thread hiloMusica = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    // Cargar el archivo de música desde el directorio de recursos
                    InputStream inputStream = ReproductorMusica.class.getResourceAsStream(ruta);
                    // Si el archivo de música no se encuentra, lanzar una excepción FileNotFoundException
                    if (inputStream == null) {
                        throw new FileNotFoundException("Archivo de música no encontrado");
                    }
                    // Obtener un flujo de audio para el archivo de música
                    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(inputStream);

                    // Obtener un Clip para reproducir el archivo de música
                    clip = AudioSystem.getClip();
                    // Abrir el Clip con el flujo de audio cargado
                    clip.open(audioInputStream);
                    // Reproducir la música de forma continua
                    clip.loop(Clip.LOOP_CONTINUOUSLY);

                } catch (FileNotFoundException e) {
                    // Manejar el caso en el que el archivo de música no se encuentre
                    System.err.println("No se pudo encontrar el archivo de música");
                } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
                    // Manejar otros posibles errores al cargar el archivo de música
                    System.err.println("Error al cargar el archivo de música");
                }
            }
        });
        // Iniciar el hilo para reproducir la música
        hiloMusica.start();
    }

    public static void reproducirAudio(String audio) {
        try {
            // Obtener el flujo de entrada del archivo de audio desde el directorio de recursos
            InputStream inputStream = ReproductorMusica.class.getResourceAsStream(audio);

            // Verificar si el flujo de entrada es nulo
            if (inputStream == null) {
                throw new FileNotFoundException("Archivo de audio no encontrado");
            }

            // Obtener el flujo de entrada de audio
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(inputStream);

            // Obtener un objeto Clip para reproducir el audio
            Clip clip = AudioSystem.getClip();

            // Abrir el audio para reproducirlo
            clip.open(audioInputStream);

            // Iniciar la reproducción del audio
            clip.start();
        } catch (FileNotFoundException e) {
            // Manejar la excepción si no se encuentra el archivo de audio
            System.err.println("No se pudo encontrar el archivo de audio");
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            // Manejar la excepción si ocurre algún error al cargar el archivo de audio
            System.err.println("Error al cargar el archivo de audio");
        }
    }

    public static void detenerReproduccionMusica() {
        // Verifica si el objeto Clip no es nulo y está reproduciendo
        if (clip != null && clip.isRunning()) {
            // Detiene la reproducción del Clip
            clip.stop();
            // Cierra el Clip
            clip.close();
        }
    }
}
