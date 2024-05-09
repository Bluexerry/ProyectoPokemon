# Nombre del Proyecto

Esta aplicación de Java Swing dirigida en IDE Net Beans va dirigida a la recogida de información de Pokémon y usuarios para su posterior guardado, eliminación o edición de datos. Permite acciones desde un acceso login con un único usuario de primer nivel y varios de segundo nivel, registro de usuarios, información de datos registrados, creación de archivos de texto para una mayor valoración de la aplicación, música, elementos interactivos, etc.

## Requisitos Previos

Requisitos Previos
Antes de instalar NetBeans, asegúrate de que tu sistema cumple con los siguientes requisitos de hardware:

Procesador: Intel Pentium IV o superior.

Memoria RAM: Se recomienda al menos 2 GB de RAM.

Espacio en disco: Al menos 1.5 GB de espacio libre en disco para la instalación básica. Se recomienda más espacio si planeas instalar complementos adicionales.

Resolución de pantalla: 1024x768 píxeles o superior.

## Instalación

Para instalar NetBeans, sigue estos pasos:

Visita el sitio web oficial de NetBeans en netbeans.apache.org en tu navegador web.
Navega hasta la sección de descargas y selecciona la versión de NetBeans que deseas instalar. Selecciona la versión que sea compatible con tu sistema operativo.
Una vez descargado el instalador, haz doble clic en él para iniciar el proceso de instalación.
Sigue las instrucciones del instalador para completar la instalación. Asegúrate de seleccionar las opciones adecuadas según tus necesidades, como la ubicación de instalación y los componentes adicionales que deseas incluir.
Una vez que la instalación esté completa, puedes iniciar NetBeans desde el menú de inicio o desde el acceso directo en tu escritorio, si se creó uno durante la instalación.
Con NetBeans instalado, puedes abrir el proyecto y comenzar a trabajar en él en tu entorno local.

Además, debemos descargar el driver de MySQL para java en la siguiente web: https://dev.mysql.com/downloads/connector/j/
Tras hacerlo, introducimos el archivo en la carpeta "Libraries" autogenerada por el IDE justo debajo de "Source Packages"

## Uso

1. Descarga el proyecto desde la raíz en Net Beans (asegurate que tenga la carpeta sources y todo el resto del compendio para que funcione correctamente, en caso contrario no se podrían encontrar algunos archivos necesarios).
2. Abre el proyecto, verifica que no existan errores de códigos. En tal caso abre el proyecto mediante Notepad++ para editar líneas de código inaccesibles o editalas en el propio IDE si este lo permite.
3. La visualización de la ventana principal está dada en la carpeta Main, solo es necesario hacer clic en el botón de Play para que inicie el proyecto.
4. Interactúa con la interfaz de usuario, crea usuarios de segundo nivel para crear, borrar, editar o visualizar la lista completa de Pokémon o logueate en el sistema mediante el usuario de primer nivel "Jesús" con la contraseña "admin27".
5. Verifica las funciones del programa, si no te sientes conforme con lo visto o prevés mejoras a corto plazo házmelo saber al correo jmvazquezherrera@adaits.es .

## Estructura del Proyecto

### Audio
Contiene archivos.wav de muy pocos segundos que sirven para interactuar con varios elementos en pantalla con podrían ser los Pokémon, el icono de entrenador del login, la pokeball del registro, etc.

### BBDD
Contiene una clase de java con métodos para la conexión con la base de datos del ordenador (usuario root y sin contraseña, en caso contrario, descargue la base de datos "proyecto_j").

### Controlador
Contiene dos clases de java, estas así mismo llevan métodos sencillos que permiten un enlace desde la parte de la vista interactiva hacia los métodos de edición de datos en la BBDD y visualización de estos.

### Imágenes
Contiene imágenes en baja resolución las cuales cambian la apariencia de varios botones y elementos de la vista de la aplicación.

### Main
Contiene una clase de java con un método Main en el cual se inicia la aplicación y se setea su visualización

### Modelo
Contiene las clases de java con los objetos de Pokémon y Usuario, sus constructores, getters y setters.

### Música
Contiene archivos.wav de varios minutos, estos definen la música de fondo de la aplicación (no deben ser de gran tamaño, en caso contrario Git Hub no podrá manejarlos correctamente).

### Servicios
Contiene varias clases de java:

LeerYEscribir - Contiene métodos que permiten la lectura y escritura de archivos por medio de String con sus debidas rutas de carpeta.

PokemoM - Contiene métodos que permiten realizar inserts, deletes, updates y selects. Estos mismos son apoyados mediante una llamada a los métodos de Conexión dados en BBDD. 

ReproductorMusica - Contiene métodos que permiten realizar cargar archivos de música mediante inputs.

UsuarioM - Contiene métodos que permiten realizar inserts, deletes, updates y selects. Estos mismos son apoyados mediante una llamada a los métodos de Conexión dados en BBDD. 

### Texto
Contiene archivos de texto.txt. Estos son visualizados mediante la interfaz y también pueden editarse.

### Vista
Contiene los jFrame necesarios para dirigir la interfaz de usuario:

EleccionAdmin - Contiene iconos interactivos de imagenes.gif de Pokémon los cuales llaman al método de audio cuando son clicados, un icono de silencio para detener la reproducción de la música y dos botones. El primero lleva al jFrame "TablaP", el segundo al jFrame "TablaP_Usuario".

EleccionUsuario - Similar al anterior, contiene además botones interactivos para dejar valoraciones mediante archivos.txt.

Login - Interfaz principal del programa, contiene campos interactuales en los que dar el nombre y la contraseña del usuario principal o secundario. Luego al clicar en "Iniciar", se cierra esta ventana y da lugar a la ventana "EleccionAdmin" en caso de dar las credenciales de nombre "Jesús" y contraseña "admin27", o da lugar a la ventana "EleccioUsuario" en caso dar cualquiera otra credencial correcta. 

Registro - Contiene campos que permiten la inserción en la base de datos de nuevos usuarios de segundo grado. Las credenciales deben ser correctas y que no contengan datos innecesarios. 

TablaP - Contiene varios campos para hacer insert, delete, update y select de los Pokémon guardados en la base de datos. Así mismo contiene comboBox con valores numéricos que definen el género, tipo primario, tipo secundario y naturaleza del Pokémon. Estos son definidos en los botones declarados bajos estos mismos.

TablaP_Usuario - Similar a tablaP, solo que es accesible por medio de un usuario de segundo nivel.

TablaU - Accesible desde usuario de primer nivel, permite ver los tipos de usuarios existentes y hacer un delete basándonos en el ID del usuario.

## Estructura del Proyecto

```plaintext
ProyectoPokemon/ 
│
├── SourcePackages/                  # Código fuente del proyecto
   ├── Audio/                       # Carpeta que contiene archivos de audio utilizados en la aplicación
   │   ├── A.wav                    # Archivo de audio A
   │   ├── Gengar.wav               # Archivo de audio Gengar
   │   ├── Lucario.wav              # Archivo de audio Lucario
   │   ├── Magnezone.wav            # Archivo de audio Magnezone
   │   ├── LvUp.wav                 # Archivo de audio LvUp
   │   ├── Pichu.wav                # Archivo de audio Pichu
   │   ├── Pikachu.wav              # Archivo de audio Pikachu
   │   ├── Pokeball.wav             # Archivo de audio Pokeball
   │   ├── Porygon-z.wav            # Archivo de audio Porygon-z
   │   ├── Sableye.wav              # Archivo de audio Sableye
   │   ├── Scizor.wav               # Archivo de audio Scizor
   │   ├── ShutDown.wav             # Archivo de audio ShutDown
   │   ├── SonidoBoli.wav           # Archivo de audio SonidoBoli
   │   └── Voz.wav                  # Archivo de audio Voz
   ├── BBDD/                        # Carpeta que contiene archivos relacionados con la base de datos
   │   └── Conexion.java            # Archivo de conexión a la base de datos
   ├── Controlador/                 # Carpeta que contiene los controladores del proyecto
   │   ├── ControladorPokemon.java  # Controlador para gestionar la lógica relacionada con los Pokémon
   │   └── ControladorUsuario.java  # Controlador para gestionar la lógica relacionada con los usuarios
   ├── Imagenes/                    # Carpeta que contiene imágenes utilizadas en el proyecto
   │   ├── apagar.png               # Archivo de imagen para botón de apagar
   │   ├── avatar.png               # Archivo de imagen para avatar
   │   ├── entrenador-pokemon.png  # Archivo de imagen para entrenador de Pokémon
   │   ├── Gengar_NB.gif            # Archivo de imagen animada de Gengar
   │   ├── Lucario_NB.gif           # Archivo de imagen animada de Lucario
   │   ├── Magnezone_NB.gif         # Archivo de imagen animada de Magnezone
   │   ├── menos.png                # Archivo de imagen para botón de menos
   │   ├── Pichu_Es.gif             # Archivo de imagen animada de Pichu
   │   ├── Pikachu_NB.gif           # Archivo de imagen animada de Pikachu
   │   ├── pokebola.png             # Archivo de imagen para pokebola
   │   ├── Porygon-Z_NB.gif         # Archivo de imagen animada de Porygon-Z
   │   ├── Sableye_NB.gif           # Archivo de imagen animada de Sableye
   │   ├── Scizor_NB.gif            # Archivo de imagen animada de Scizor
   │   ├── sin-sonido.png           # Archivo de imagen para icono de silencio
   │   └── volver_1.png             # Archivo de imagen para botón de volver
   ├── Main/                        # Carpeta que contiene la clase principal del proyecto
   │   └── Main.java                # Archivo principal de la aplicación
   ├── Modelo/                      # Carpeta que contiene los modelos de datos del proyecto
   │   ├── Pokemon.java             # Clase que define la estructura de un Pokémon
   │   └── Usuario.java             # Clase que define la estructura de un Usuario
   ├── Musica/                      # Carpeta que contiene archivos de música utilizados en la aplicación
   │   ├── AccumulaTown.wav         # Archivo de música AccumulaTown
   │   └── Pedro.wav                # Archivo de música Pedro
   ├── Servicios/                   # Carpeta que contiene servicios adicionales utilizados en el proyecto
   │   ├── LeerYEscribir.java       # Clase para leer y escribir archivos
   │   ├── PokemonM.java            # Clase que define métodos relacionados con Pokémon
   │   ├── ReproductorMusica.java   # Clase para reproducir música
   │   └── UsuarioM.java            # Clase que define métodos relacionados con Usuario
   ├── Texto/                       # Carpeta que contiene archivos de texto utilizados en el proyecto
   │   ├── Genero.txt               # Archivo de texto para géneros de Pokémon
   │   ├── Naturaleza.txt           # Archivo de texto para naturalezas de Pokémon
   │   ├── Readme.txt               # Archivo de texto de Readme
   │   ├── Si.txt                   # Archivo de texto para opciones afirmativas
   │   └── Tipo.txt                 # Archivo de texto para tipos de Pokémon
   └── Vista/                       # Carpeta que contiene las vistas o interfaces de usuario del proyecto
      ├── EleccionAdmin.form       # Archivo de formulario de EleccionAdmin
      ├── EleccionAdmin.java       # Archivo de clase de EleccionAdmin
      ├── EleccionUsuario.form     # Archivo de formulario de EleccionUsuario
      ├── EleccionUsuario.java     # Archivo de clase de EleccionUsuario
      ├── Login.form               # Archivo de formulario de Login
      ├── Login.java               # Archivo de clase de Login
      ├── Registro.form            # Archivo de formulario de Registro
      ├── Registro.java            # Archivo de clase de Registro
      ├── TablaP.form              # Archivo de formulario de TablaP
      ├── TablaP.java              # Archivo de clase de TablaP
      ├── TablaP_Usuario.form     # Archivo de formulario de TablaP_Usuario
      ├── TablaP_Usuario.java     # Archivo de clase de TablaP_Usuario
      ├── TablaU.form              # Archivo de formulario de TablaU
      └── TablaU.java              # Archivo de clase de TablaU
