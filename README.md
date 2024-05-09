# Proyecto Pokémon Manager

![Divertido Pokémon GIF](url_del_gif)

Este proyecto consiste en una aplicación Java Swing desarrollada en el IDE NetBeans. Está diseñada para la gestión de información de Pokémon y usuarios, permitiendo acciones como el almacenamiento, eliminación o edición de datos. La aplicación incluye características como un sistema de acceso con diferentes niveles de usuario, registro de usuarios, visualización de datos almacenados, creación de archivos de texto, integración de música y elementos interactivos, entre otros.

## Requisitos Previos

Antes de instalar NetBeans, asegúrate de que tu sistema cumple con los siguientes requisitos de hardware:

- Procesador: Intel Pentium IV o superior.
- Memoria RAM: Se recomienda al menos 2 GB de RAM.
- Espacio en disco: Al menos 1.5 GB de espacio libre en disco para la instalación básica. Se recomienda más espacio si planeas instalar complementos adicionales.
- Resolución de pantalla: 1024x768 píxeles o superior.

## Instalación

Para instalar NetBeans, sigue estos pasos:

1. Visita el sitio web oficial de NetBeans en [netbeans.apache.org](https://netbeans.apache.org) en tu navegador web.
2. Navega hasta la sección de descargas y selecciona la versión de NetBeans que deseas instalar, compatible con tu sistema operativo.
3. Una vez descargado el instalador, haz doble clic en él para iniciar el proceso de instalación.
4. Sigue las instrucciones del instalador para completar la instalación, asegurándote de seleccionar las opciones adecuadas según tus necesidades.
5. Una vez que la instalación esté completa, puedes iniciar NetBeans desde el menú de inicio o desde el acceso directo en tu escritorio, si se creó uno durante la instalación.

Además, debes descargar el driver de MySQL para Java desde [este enlace](https://dev.mysql.com/downloads/connector/j/). Una vez descargado, coloca el archivo en la carpeta "Libraries" autogenerada por el IDE, justo debajo de "Source Packages".

## Uso

1. Descarga el proyecto desde la raíz en NetBeans, asegurándote de que incluya la carpeta "sources" y todos los demás archivos necesarios para un funcionamiento correcto. En caso contrario, algunos archivos necesarios podrían no encontrarse.
2. Abre el proyecto y verifica la ausencia de errores de código. Si encuentras errores, puedes corregirlos en el IDE o mediante un editor de texto como Notepad++.
3. La ventana principal se encuentra en la carpeta "Main". Haz clic en el botón de Play para iniciar el proyecto.
4. Interactúa con la interfaz de usuario. Puedes crear usuarios de segundo nivel para gestionar la lista completa de Pokémon, incluyendo acciones como crear, borrar, editar o visualizar. También puedes iniciar sesión en el sistema utilizando las credenciales del usuario de primer nivel "Jesús" con la contraseña "admin27".
5. Verifica las funciones del programa y, si consideras necesario realizar mejoras a corto plazo, no dudes en contactarme a través del correo jmvazquezherrera@adaits.es.

## Estructura del Proyecto

### Audio
Esta carpeta contiene archivos de formato .wav de corta duración que se utilizan para interactuar con varios elementos visuales de la aplicación, como los Pokémon, el icono de entrenador en la pantalla de inicio de sesión, y la pokébola en la pantalla de registro.

### BBDD
En esta sección se encuentra una clase Java que proporciona métodos para establecer la conexión con la base de datos del sistema. Se asume que se utiliza un usuario "root" sin contraseña para acceder a la base de datos, pero en caso contrario, se recomienda descargar y utilizar la base de datos "proyecto_j".

### Controlador
Contiene clases Java que actúan como controladores, facilitando la comunicación entre la interfaz de usuario y la base de datos. Estas clases implementan métodos para la edición y visualización de datos en la base de datos.

### Imágenes
Aquí se encuentran imágenes en baja resolución que se utilizan para personalizar la apariencia de varios botones y elementos visuales de la aplicación.

### Main
Esta sección contiene la clase principal del proyecto, que incluye el método Main encargado de iniciar la aplicación y configurar su visualización inicial.

### Modelo
Contiene clases Java que definen los objetos de Pokémon y Usuario, incluyendo sus constructores, métodos "getters" y "setters" para acceder y modificar los atributos de estos objetos.

### Música
En esta carpeta se encuentran archivos de formato .wav de mayor duración que se utilizan como música de fondo en la aplicación. Se recomienda que los archivos de música no sean de gran tamaño para garantizar la correcta gestión de los mismos por parte de GitHub.

### Servicios
Contiene diversas clases Java que proporcionan servicios adicionales utilizados en la aplicación:

- LeerYEscribir: Clase que ofrece métodos para la lectura y escritura de archivos utilizando cadenas de caracteres y rutas de archivo.
- PokemoM: Clase que proporciona métodos para realizar operaciones de inserción, eliminación, actualización y selección de datos relacionados con los Pokémon en la base de datos.
- ReproductorMusica: Clase que facilita la carga y reproducción de archivos de música.
- UsuarioM: Clase que ofrece métodos para realizar operaciones de inserción, eliminación, actualización y selección de datos relacionados con los Usuarios en la base de datos.

### Texto
Contiene archivos de texto en formato .txt que se utilizan para diversos propósitos en la aplicación, como la visualización y edición de información en la interfaz de usuario.

### Vista
Esta carpeta contiene los "jFrame" necesarios para gestionar la interfaz de usuario de la aplicación:

- EleccionAdmin: Interfaz que incluye iconos interactivos de Pokémon y botones para la gestión de datos. Permite la navegación hacia otras interfaces de usuario.
- EleccionUsuario: Similar a EleccionAdmin, pero incluye botones adicionales para dejar valoraciones mediante archivos de texto.
- Login: Interfaz principal de inicio de sesión. Permite el ingreso de credenciales de usuario y la navegación hacia otras interfaces dependiendo del nivel de acceso.
- Registro: Interfaz para registrar nuevos usuarios de segundo grado en la base de datos.
- TablaP: Interfaz para la gestión de datos de Pokémon, incluyendo inserción, eliminación, actualización y selección de datos.
- TablaP_Usuario: Similar a TablaP, pero accesible solo para usuarios de segundo nivel.
- TablaU: Interfaz para visualizar los tipos de usuarios existentes y realizar eliminaciones basadas en el ID de usuario.

## Estructura del Proyecto

```plaintext
ProyectoPokemon/ 
│
├── SourcePackages/                 # Código fuente del proyecto
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
   │   ├── entrenador-pokemon.png   # Archivo de imagen para entrenador de Pokémon
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
      ├── EleccionAdmin.form        # Archivo de formulario de EleccionAdmin
      ├── EleccionAdmin.java        # Archivo de clase de EleccionAdmin
      ├── EleccionUsuario.form      # Archivo de formulario de EleccionUsuario
      ├── EleccionUsuario.java      # Archivo de clase de EleccionUsuario
      ├── Login.form                # Archivo de formulario de Login
      ├── Login.java                # Archivo de clase de Login
      ├── Registro.form             # Archivo de formulario de Registro
      ├── Registro.java             # Archivo de clase de Registro
      ├── TablaP.form               # Archivo de formulario de TablaP
      ├── TablaP.java               # Archivo de clase de TablaP
      ├── TablaP_Usuario.form       # Archivo de formulario de TablaP_Usuario
      ├── TablaP_Usuario.java       # Archivo de clase de TablaP_Usuario
      ├── TablaU.form               # Archivo de formulario de TablaU
      └── TablaU.java               # Archivo de clase de TablaU
