package Vista;

import Controlador.ControladorPokemon;
import Modelo.Pokemon;
import Servicios.LeerYEscribir;
import Servicios.ReproductorMusica;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import Modelo.Genero;
import Modelo.Naturaleza;
import Modelo.Tipo;

public class TablaP_Usuario extends javax.swing.JFrame {

    //Instancias
    private final ControladorPokemon controladorPokemon;
    int xMouse, yMouse;

    public TablaP_Usuario() {
        initComponents();

        //Inicia la ventana en el centro
        setLocationRelativeTo(null);

        //Denomina el objeto usado para usar sus metodos mas adelante
        controladorPokemon = new ControladorPokemon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        Label2 = new javax.swing.JLabel();
        Generotxt = new javax.swing.JComboBox<>();
        Tipo1txt = new javax.swing.JComboBox<>();
        Tipo2txt = new javax.swing.JComboBox<>();
        Naturalezatxt = new javax.swing.JComboBox<>();
        URLlabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setBackground(new java.awt.Color(241, 227, 165));
        tabla.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NUMERO", "NOMBRE", "GENERO", "TIPO", "TIPO2", "NATURALEZA"
            }
        ));
        tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 6, 583, 520));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setText("Pokedex:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 62, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("Nombre:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 96, 66, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText("Genero:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 138, 66, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setText("Tipo 1:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 178, -1, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setText("Tipo 2:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 220, 57, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setText("Naturaleza:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 258, 91, 29));

        btnGuardar.setBackground(new java.awt.Color(241, 227, 165));
        btnGuardar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setToolTipText("Inserta un nuevo cuadro de datos en la BBDD, debe denominar todos los elementos excepto Tipo 2 en caso de que el Pokemon no tenga un tipo secundario. \n");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 258, -1));

        btnListar.setBackground(new java.awt.Color(241, 227, 165));
        btnListar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnListar.setText("Mostrar en tabla");
        btnListar.setToolTipText("Muestra todos los Pokemon creados.");
        btnListar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        jPanel1.add(btnListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 258, -1));

        btnEditar.setBackground(new java.awt.Color(241, 227, 165));
        btnEditar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setToolTipText("Editar un cuadro de datos en la BBDD,  debe denominar el nombre para poder identificar el Pokemon y tambien la naturaleza y el genero a cambiar.");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 258, -1));

        btnEliminar.setBackground(new java.awt.Color(241, 227, 165));
        btnEliminar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setToolTipText("Eliminar un cuadro de datos en la BBDD,  debe denominar el nombre para poder identificar el Pokemon.");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 258, -1));

        txtId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIdMouseClicked(evt);
            }
        });
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 62, 180, -1));

        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreMouseClicked(evt);
            }
        });
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 96, 180, -1));

        jPanel2.setBackground(new java.awt.Color(255, 204, 51));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/volver_1.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Label2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menos.png"))); // NOI18N
        Label2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Label2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Label2MouseEntered(evt);
            }
        });
        jPanel2.add(Label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 50));

        Generotxt.setModel(new Servicios.GenderSelect().getGenders());
        Generotxt.setSelectedItem(Servicios.GenderSelect.defaultGender);
        Generotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerotxtActionPerformed(evt);
            }
        });
        jPanel1.add(Generotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 135, 180, -1));

        Tipo1txt.setModel(new Servicios.TipoSelect().getTipos());
        Tipo1txt.setSelectedItem(Servicios.TipoSelect.deaultTipo);
        Tipo1txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tipo1txtActionPerformed(evt);
            }
        });
        jPanel1.add(Tipo1txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 175, 180, -1));

        Tipo2txt.setModel(new Servicios.TipoSelect().getTipos());
        Tipo2txt.setSelectedItem(Servicios.TipoSelect.deaultTipo);
        Tipo2txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tipo2txtActionPerformed(evt);
            }
        });
        jPanel1.add(Tipo2txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 217, 180, -1));

        Naturalezatxt.setModel(new Servicios.NaturalezaSelect().getNaturalezas());
        Naturalezatxt.setSelectedItem(Servicios.NaturalezaSelect.defaultNature);
        Naturalezatxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NaturalezatxtActionPerformed(evt);
            }
        });
        jPanel1.add(Naturalezatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 261, 180, -1));

        URLlabel.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        URLlabel.setForeground(new java.awt.Color(51, 51, 255));
        URLlabel.setText("https://www.wikidex.net/wiki/WikiDex");
        URLlabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        URLlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                URLlabelMouseClicked(evt);
            }
        });
        jPanel1.add(URLlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 290, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        //Funcion para reproducir un audio 
        ReproductorMusica.reproducirAudio("/Audio/SonidoBoli.wav");
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //Funcion para reproducir un audio 
        ReproductorMusica.reproducirAudio("/Audio/A.wav");

        final Genero generoSelect = (Genero) Generotxt.getSelectedItem();
        final Tipo tipo1Select = (Tipo) Tipo1txt.getSelectedItem();
        final Tipo tipo2Select = (Tipo) Tipo2txt.getSelectedItem();
        final Naturaleza naturalezaSelect = (Naturaleza) Naturalezatxt.getSelectedItem();

        //Recoge el texto de los campos y verifica si estan vacios
        if (txtId.getText().isBlank() || txtNombre.getText().isBlank() || generoSelect.getNombre().equals("Seleccionar") || tipo1Select.getNombre().equals("Seleccionar") || tipo2Select.getNombre().equals("Seleccionar") || naturalezaSelect.getNombre().equals("Seleccionar")) {
            JOptionPane.showMessageDialog(null, "Debe rellenar todos los campos");
        } else {

            //Iguala las variables al texto recogido. Como algunas son ints necesitan un Integer.parseInt
            int num_pok = Integer.parseInt(txtId.getText());
            String nombre = txtNombre.getText();
            int genero = generoSelect.getId();
            int tipo1 = tipo1Select.getId();
            int tipo2 = tipo2Select.getId();
            int naturaleza = naturalezaSelect.getId();

            //Creamos el objeto y llamamos al metodo para insertar
            Pokemon pokemon = new Pokemon(nombre, num_pok, genero, tipo1, tipo2, naturaleza);
            controladorPokemon.CrearPokemon(pokemon);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        //Funcion para reproducir un audio
        ReproductorMusica.reproducirAudio("/Audio/A.wav");

        //Creamos un modelo de tabla en base a nuestra tabla situada en el frame
        TableModel modelo = tabla.getModel();
        DefaultTableModel modeloTabla = (DefaultTableModel) modelo;

        //Seteamos la tabla a 0 cada ves que clikcamos para evitar sobrecargas de datos
        modeloTabla.setRowCount(0);

        //Creamos una lista de usuarios y llamamos al metodo
        List<Pokemon> pokemons
                = controladorPokemon.ListarPokemon(tabla);

        //Creamos un array de objetos con capacidad hasta 6
        Object[] object = new Object[6];

        /*Reiteramos los datos que nos devuelve la funcion con el objeto y 
        mediante un for con un tamaño en base al tamaño de la lista.*/
        for (int i = 0; i < pokemons.size(); i++) {

            /*En cada vuelta obtenemos el valor del dato en la posicion i 
            sy lo igualamos al objeto para al final de la vuelta añadirlo a la tabla*/
            object[0] = pokemons.get(i).getNumero_pok();
            object[1] = pokemons.get(i).getNombre();
            object[2] = pokemons.get(i).getGenero();
            object[3] = pokemons.get(i).getTipo1();
            object[4] = pokemons.get(i).getTipo2();
            object[5] = pokemons.get(i).getNaturaleza();
            modeloTabla.addRow(object);
        }

        //Seteamos la tabla para ver la informacion
        tabla.setModel(modelo);
    }//GEN-LAST:event_btnListarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        //Funcion para reproducir un audio
        ReproductorMusica.reproducirAudio("/Audio/SonidoBoli.wav");
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        //Funcion para reproducir un audio
        ReproductorMusica.reproducirAudio("/Audio/A.wav");

        final Genero generoSelect = (Genero) Generotxt.getSelectedItem();
        final Naturaleza naturalezaSelect = (Naturaleza) Naturalezatxt.getSelectedItem();

        //Recoge el texto de los campos y verifica si estan vacios
        if (txtNombre.getText().isBlank() || Generotxt.getSelectedItem().equals("Seleccionar") || Naturalezatxt.getSelectedItem().equals("Seleccionar")) {
            JOptionPane.showMessageDialog(null, "Debe rellenar los campo: Nombre, Genero, y Naturaleza");
        } else {

            //Iguala las variables al texto recogido. Como algunas son ints necesitan un Integer.parseInt
            String nombre = txtNombre.getText();
            int genero = generoSelect.getId();
            int naturaleza = naturalezaSelect.getId();

            //Creamos el objeto y llamamos al metodo para setear
            Pokemon pokemon = new Pokemon(nombre, genero, naturaleza);
            controladorPokemon.EditarPokemon(pokemon);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //Funcion para reproducir un audio
        ReproductorMusica.reproducirAudio("/Audio/A.wav");

        //Recoge el texto de los campos y verifica si estan vacios
        if (txtNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe rellenar el campo de Nombre para poder eliminar");
        } else {

            //Iguala la variable al texto recogido
            String nombre = txtNombre.getText();

            //Creamos el objeto y llamamos al metodo para setear
            Pokemon pokemon = new Pokemon(nombre);
            controladorPokemon.EliminarPokemon(pokemon);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        //Las variables mencionadas se igualan a la posicion x e y
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        //Variables que permiten el movimiento de la ventana mediante obtencion de la posicion x e y de esta
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void txtIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdMouseClicked
        //Funcion para reproducir un audio
        ReproductorMusica.reproducirAudio("/Audio/SonidoBoli.wav");
    }//GEN-LAST:event_txtIdMouseClicked

    private void txtNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMouseClicked
        //Funcion para reproducir un audio
        ReproductorMusica.reproducirAudio("/Audio/SonidoBoli.wav");
    }//GEN-LAST:event_txtNombreMouseClicked

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        //Tipado que impide escribir valores numericos enteros
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)
                || (c == KeyEvent.VK_BACK_SPACE)
                || (c == KeyEvent.VK_DELETE))) {
            evt.consume();
        }

        //Tipado que impide escribir mas de 10 caracteres
        if (txtId.getText().length() >= 4) {
            evt.consume(); // Consumir el evento para evitar que se agregue más caracteres
        }
    }//GEN-LAST:event_txtIdKeyTyped

    private void GenerotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerotxtActionPerformed
        //Funcion para reproducir un audio
        ReproductorMusica.reproducirAudio("/Audio/A.wav");
    }//GEN-LAST:event_GenerotxtActionPerformed

    private void Tipo1txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tipo1txtActionPerformed
        //Funcion para reproducir un audio
        ReproductorMusica.reproducirAudio("/Audio/A.wav");
    }//GEN-LAST:event_Tipo1txtActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        //Funcion para reproducir un audio
        ReproductorMusica.reproducirAudio("/Audio/A.wav");

        //Set de la visualizacion de la vantana de EleccionAdmin y cierre de esta
        EleccionUsuario eleccion = new EleccionUsuario();
        eleccion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void Label2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label2MouseClicked
        //Funcion para reproducir un audio
        ReproductorMusica.reproducirAudio("/Audio/A.wav");

        // Obtiene la ventana padre del JLabel
        Window window = SwingUtilities.getWindowAncestor(Label2);
        // Verifica si la ventana es un JFrame y la minimiza
        if (window instanceof JFrame) {
            ((JFrame) window).setState(JFrame.ICONIFIED);
        }
    }//GEN-LAST:event_Label2MouseClicked

    private void Label2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label2MouseEntered

    }//GEN-LAST:event_Label2MouseEntered

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        //Tipado que impide escribir valores numericos enteros
        char c = evt.getKeyChar();
        if (!(c == '2' || Character.isLetter(c))) {
            evt.consume();
        }

        //Tipado que impide escribir mas de 10 caracteres
        if (txtNombre.getText().length() >= 10) {
            evt.consume(); // Consumir el evento para evitar que se agregue más caracteres
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void URLlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_URLlabelMouseClicked
        //Funcion para reproducir un audio
        ReproductorMusica.reproducirAudio("/Audio/A.wav");

        //Funcion para abrir una URL
        LeerYEscribir.LeerUrl(URLlabel.getText());
    }//GEN-LAST:event_URLlabelMouseClicked

    private void Tipo2txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tipo2txtActionPerformed
        //Funcion para reproducir un audio
        ReproductorMusica.reproducirAudio("/Audio/A.wav");
    }//GEN-LAST:event_Tipo2txtActionPerformed

    private void NaturalezatxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NaturalezatxtActionPerformed
        //Funcion para reproducir un audio
        ReproductorMusica.reproducirAudio("/Audio/A.wav");
    }//GEN-LAST:event_NaturalezatxtActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Generotxt;
    private javax.swing.JLabel Label2;
    private javax.swing.JComboBox<String> Naturalezatxt;
    private javax.swing.JComboBox<String> Tipo1txt;
    private javax.swing.JComboBox<String> Tipo2txt;
    private javax.swing.JLabel URLlabel;
    public javax.swing.JButton btnEditar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnListar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tabla;
    public javax.swing.JTextField txtId;
    public javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
