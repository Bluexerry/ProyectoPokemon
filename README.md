# Nombre del Proyecto

Esta aplicacion de Java Swing dirigida en IDE Net Beans va dirigida a la recogida de informacion de Pokemon y usuarios para su posterior guardado, eliminacion o edicion de datos. Permite acciones desde un acceso Login con un unico usuario de primer nivel y varios de segundo nivel, registro de usuarios, informacion de datos registrados, creacion de archivos de texto para una mayor valoracion de la aplicacion, musica, elementos interactivos, etc.

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

## Uso

1. Descarga el proyecto desde la raiz en Net Beans (asegurate que tenga la carpeta sources y todo el resto del compendio para que funcione correctamente, en caso contrario no se podrian encontrar algunos archivos necesarios).
2. Abre el proyecto, verifica que no existan errores de codigos. En tal caso abre el proyecto mediante Notepad++ para editar lineas de codigo innacesibles o editalas en el propio IDE si este lo permite.
3. La visualizacion de la ventana principal esta dada en la carpeta Main, solo es necesario hacer click en el boton de play para que inicie el proyecto.
4. Interactúa con la interfaz de usuario, crea usuarios de segundo nivel para crear, borrar, editar o visualizar la lista completa de pokemon o logueate en el sistema mediante el usuario de primer nivel "Jesús" con la contraseña "admin27".
5. Verifica las funciones del programa, si no te sientes conforme con lo visto o preves mejoras a corto plazo hazmelo saber al correo jmvazquezherrera@adaits.es .

## Estructura del Proyecto

### Audio
Contiene archivos.wav de muy pocos segundos que sirven para interactuar con varios elementos en pantalla con podrian ser los Pokemon, el icono de entrenador del login, la pokeball del registro, etc.

### BBDD
Contiene una clase de java con metodos para la conexion con la base de datos del ordenador (usuario root y sin contraseña, en caso contrario, descargue la base de datos "proyecto_j").

### Controlador
Contiene dos clases de java, estas asi mismo llevan metodos sencillos que permiten un enlace desde la parte de la vista interactiva hacia los metodos de edicion de datos en la BBDD y visualizacion de estos.

### Imagenes
Contiene imagenes en baja resolucion las cuales cambian la apariencia de varios botones y elementos de la vista de la aplicacion.

### Main
Contiene una clase de java con un metodo Main en el cual se inicia la aplicacion y se setea su visualizacion

### Modelo
Contiene las clases de java con los objetos de Pokemon y Usuario, sus constructores, getters y setters.

### Musica
Contiene archivos.wav de varios minutos, estos definen la musica de fondo de la aplicacion (no deben ser de gran tamaño, en caso contrario Git Hub no podra manejarlos correctamente).

### Servicios
Contiene varias clases de java:

LeerYEscribir - Contiene metodos que permiten la lectura y escritura de archivos por medio de String con sus debidas rutas de carpeta.

PokemoM - Contiene metodos que permiten realizar inserts, deletes, updates y selects. Estos mismos son apoyados mediante una llamada a los metodos de Conexion dados en BBDD. 

ReproductorMusica - Contiene metodos que permiten realizar cargar archivos de musica mediante inputs.

UsuarioM - Contiene metodos que permiten realizar inserts, deletes, updates y selects. Estos mismos son apoyados mediante una llamada a los metodos de Conexion dados en BBDD. 

### Texto
Contiene archivos de texto.txt. Estos son visualizados mediante la interfaz y tambien pueden editarse.

### Vista
Contiene los jFrame necesairos para dirigir la interfaz de usuario:

EleccionAdmin - Contiene iconos interactivos de imagenes.gif de Pokemon los cuales llaman al metodo de audio cuando son clickados, un icono de silencio para detener la reproduccion de la musica y dos botones. El primero lleva al jFrame "TablaP", el segundo al jFrame "TablaP_Usuario".

EleccionUsuario - Similar al anterior, contiene ademas botones interactivos para dejar valoraciones mediante archivos.txt.

Login - Interfaz pricipal del programa, contiene campos interactuables en los que dar el nombre y la contraseña del usuario pricipal o secundario. Luego al clickar en "Iniciar", se cierra esta ventana y da lugar a la ventana "EleccionAdmin" en caso de dar las credenciales de nombre "Jesús" y contraseña "admin27", o da lugar a la ventana "EleccioUsuario" en caso dar cualquiera otra credencial correcta. 

Registro - 

## Estructura del Proyecto

```plaintext
proyecto/ 
│
├── src/                  # Código fuente del proyecto
│   ├── package1/         # Paquete 1
│   │   ├── Clase1.java
│   │   └── ...
│   ├── package2/         # Paquete 2
│   │   ├── Clase2.java
│   │   └── ...
│   └── Main.java         # Clase principal
│
├── resources/            # Archivos de recursos
│   ├── images/           # Imágenes utilizadas en la interfaz de usuario
│   │   └── ...
│   └── config.txt        # Archivo de configuración
│
├── build.xml             # Archivo de construcción de Ant
└── README.md             # Documentación del proyecto
