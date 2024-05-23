package Vista;

import Controlador.ControladorUsuario;
import Servicios.ReproductorMusica;
import Modelo.Usuario;
import java.awt.Window;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Registro extends javax.swing.JFrame {

    //Instancias
    private final ControladorUsuario controladorU;
    int xMouse, yMouse;
    public Usuario u;
    private Login login;

    public Registro() {
        initComponents();

        //Inicia la ventana en el centro
        setLocationRelativeTo(null);
        
        controladorU = new ControladorUsuario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        labelUsuario = new javax.swing.JLabel();
        labelTelefono = new javax.swing.JLabel();
        ApellidoUs = new javax.swing.JTextField();
        ContrasenaUs = new javax.swing.JPasswordField();
        Titulo = new javax.swing.JLabel();
        Finalizar = new javax.swing.JButton();
        labelContraseña1 = new javax.swing.JLabel();
        labelContraseña = new javax.swing.JLabel();
        labelApellido = new javax.swing.JLabel();
        NombreUs = new javax.swing.JTextField();
        TelefonoUs = new javax.swing.JTextField();
        Pichu = new javax.swing.JButton();
        Pokeball = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Return = new javax.swing.JLabel();
        Minimizar = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de usuario");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelUsuario.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        labelUsuario.setText("NOMBRE");
        jPanel2.add(labelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, 22));

        labelTelefono.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        labelTelefono.setText("TELÉFONO");
        jPanel2.add(labelTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));

        ApellidoUs.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ApellidoUs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ApellidoUsMouseClicked(evt);
            }
        });
        ApellidoUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidoUsActionPerformed(evt);
            }
        });
        ApellidoUs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ApellidoUsKeyTyped(evt);
            }
        });
        jPanel2.add(ApellidoUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 220, -1));

        ContrasenaUs.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ContrasenaUs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContrasenaUsMouseClicked(evt);
            }
        });
        ContrasenaUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContrasenaUsActionPerformed(evt);
            }
        });
        ContrasenaUs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ContrasenaUsKeyTyped(evt);
            }
        });
        jPanel2.add(ContrasenaUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 220, -1));

        Titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Titulo.setText("REGISTRO DE USUARIO");
        jPanel2.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 260, 60));

        Finalizar.setBackground(new java.awt.Color(241, 227, 165));
        Finalizar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Finalizar.setText("Registrar");
        Finalizar.setToolTipText("Registrar un nuevo usuario en el sistema. Debe rellenar todos los campos de manera correcta.");
        Finalizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinalizarActionPerformed(evt);
            }
        });
        jPanel2.add(Finalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 130, 40));

        labelContraseña1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jPanel2.add(labelContraseña1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, -1, -1));

        labelContraseña.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        labelContraseña.setText("CONTRASEÑA");
        jPanel2.add(labelContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, -1));

        labelApellido.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        labelApellido.setText("APELLIDO");
        jPanel2.add(labelApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, -1));

        NombreUs.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        NombreUs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NombreUsMouseClicked(evt);
            }
        });
        NombreUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreUsActionPerformed(evt);
            }
        });
        NombreUs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NombreUsKeyTyped(evt);
            }
        });
        jPanel2.add(NombreUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 220, -1));

        TelefonoUs.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TelefonoUs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TelefonoUsMouseClicked(evt);
            }
        });
        TelefonoUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonoUsActionPerformed(evt);
            }
        });
        TelefonoUs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TelefonoUsKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TelefonoUsKeyTyped(evt);
            }
        });
        jPanel2.add(TelefonoUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 220, -1));

        Pichu.setBackground(new java.awt.Color(255, 204, 51));
        Pichu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pichu_NB.gif"))); // NOI18N
        Pichu.setBorder(null);
        Pichu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pichu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PichuActionPerformed(evt);
            }
        });
        jPanel2.add(Pichu, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        Pokeball.setBackground(new java.awt.Color(255, 204, 51));
        Pokeball.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pokebola.png"))); // NOI18N
        Pokeball.setBorder(null);
        Pokeball.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pokeball.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Pokeball.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PokeballActionPerformed(evt);
            }
        });
        jPanel2.add(Pokeball, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 204, 51));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Return.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/volver_1.png"))); // NOI18N
        Return.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Return.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReturnMouseClicked(evt);
            }
        });
        jPanel3.add(Return, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menos.png"))); // NOI18N
        Minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MinimizarMouseEntered(evt);
            }
        });
        jPanel3.add(Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 590, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 601, 357));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PokeballActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PokeballActionPerformed
        //Funcion para reproducir un audio 
        ReproductorMusica.reproducirAudio("/Audio/Pokeball.wav");
    }//GEN-LAST:event_PokeballActionPerformed

    private void PichuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PichuActionPerformed
        //Funcion para reproducir un audio 
        ReproductorMusica.reproducirAudio("/Audio/Pichu.wav");
    }//GEN-LAST:event_PichuActionPerformed

    private void TelefonoUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonoUsActionPerformed

    }//GEN-LAST:event_TelefonoUsActionPerformed

    private void NombreUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreUsActionPerformed

    }//GEN-LAST:event_NombreUsActionPerformed

    private void FinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinalizarActionPerformed
        //Funcion para reproducir un audio 
        ReproductorMusica.reproducirAudio("/Audio/A.wav");

        //Recoge el texto de los campos y verifica si estan vacios
        if (NombreUs.getText().isBlank() || ApellidoUs.getText().isBlank() || TelefonoUs.getText().isBlank() || ContrasenaUs.getText().isBlank()) {
            JOptionPane.showMessageDialog(null, "Debe rellenar todos los campos");
        } else {

            //Iguala las variables al texto recogido
            String nombre = NombreUs.getText();
            String apellido = ApellidoUs.getText();
            String telefono = TelefonoUs.getText();
            String contraseña = ContrasenaUs.getText();

            //Creamos el objeto y llamamos al metodo para insertar
            Usuario usuario = new Usuario(nombre, apellido, contraseña, telefono);
            controladorU.CrearUsuario(usuario);
        }
    }//GEN-LAST:event_FinalizarActionPerformed

    private void ContrasenaUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContrasenaUsActionPerformed

    }//GEN-LAST:event_ContrasenaUsActionPerformed

    private void ApellidoUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidoUsActionPerformed

    }//GEN-LAST:event_ApellidoUsActionPerformed

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        //Las variables mencionadas se igualan a la posicion x e y
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        //Variables que permiten el movimiento de la ventana mediante obtencion de la posicion x e y de esta
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel3MouseDragged

    private void ReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnMouseClicked
        //Funcion para reproducir un audio 
        ReproductorMusica.reproducirAudio("/Audio/A.wav");

        //Set de la visualizacion de la vantana de Login y cierre de esta
        login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ReturnMouseClicked

    private void NombreUsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NombreUsMouseClicked
        //Funcion para reproducir un audio 
        ReproductorMusica.reproducirAudio("/Audio/SonidoBoli.wav");
    }//GEN-LAST:event_NombreUsMouseClicked

    private void ApellidoUsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApellidoUsMouseClicked
        //Funcion para reproducir un audio 
        ReproductorMusica.reproducirAudio("/Audio/SonidoBoli.wav");
    }//GEN-LAST:event_ApellidoUsMouseClicked

    private void TelefonoUsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TelefonoUsMouseClicked
        //Funcion para reproducir un audio 
        ReproductorMusica.reproducirAudio("/Audio/SonidoBoli.wav");
    }//GEN-LAST:event_TelefonoUsMouseClicked

    private void ContrasenaUsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContrasenaUsMouseClicked
        //Funcion para reproducir un audio 
        ReproductorMusica.reproducirAudio("/Audio/SonidoBoli.wav");
    }//GEN-LAST:event_ContrasenaUsMouseClicked

    private void TelefonoUsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TelefonoUsKeyReleased

    }//GEN-LAST:event_TelefonoUsKeyReleased

    private void TelefonoUsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TelefonoUsKeyTyped
        //Tipado que impide escribir valores numericos enteros
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)
                || (c == KeyEvent.VK_BACK_SPACE)
                || (c == KeyEvent.VK_DELETE))) {
            evt.consume();
        }

        //Tipado que impide escribir mas de 10 caracteres
        if (TelefonoUs.getText().length() >= 9) {
            evt.consume(); // Consumir el evento para evitar que se agregue más caracteres
        }
    }//GEN-LAST:event_TelefonoUsKeyTyped

    private void MinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseEntered

    }//GEN-LAST:event_MinimizarMouseEntered

    private void MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseClicked
        //Funcion para reproducir un audio 
        ReproductorMusica.reproducirAudio("/Audio/A.wav");

        // Obtiene la ventana padre del JLabel
        Window window = SwingUtilities.getWindowAncestor(Minimizar);
        // Verifica si la ventana es un JFrame y la minimiza
        if (window instanceof JFrame) {
            ((JFrame) window).setState(JFrame.ICONIFIED);
        }
    }//GEN-LAST:event_MinimizarMouseClicked

    private void ContrasenaUsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ContrasenaUsKeyTyped
        //Tipado que impide escribir valores numericos enteros
        char c = evt.getKeyChar();
        if (Character.isDigit(c) && (c == '2' || c == '7')) {
            evt.consume();
        }

        //Tipado que impide escribir mas de 10 caracteres
        if (ContrasenaUs.getText().length() >= 10) {
            evt.consume(); // Consumir el evento para evitar que se agregue más caracteres
        }
    }//GEN-LAST:event_ContrasenaUsKeyTyped

    private void NombreUsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreUsKeyTyped
        //Tipado que impide escribir valores numericos enteros
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }

        //Tipado que impide escribir mas de 10 caracteres
        if (NombreUs.getText().length() >= 10) {
            evt.consume(); // Consumir el evento para evitar que se agregue más caracteres
        }
    }//GEN-LAST:event_NombreUsKeyTyped

    private void ApellidoUsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApellidoUsKeyTyped
        //Tipado que impide escribir valores numericos enteros
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }

        //Tipado que impide escribir mas de 10 caracteres
        if (ApellidoUs.getText().length() >= 10) {
            evt.consume(); // Consumir el evento para evitar que se agregue más caracteres
        }
    }//GEN-LAST:event_ApellidoUsKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField ApellidoUs;
    public javax.swing.JPasswordField ContrasenaUs;
    public javax.swing.JButton Finalizar;
    private javax.swing.JLabel Minimizar;
    public javax.swing.JTextField NombreUs;
    private javax.swing.JButton Pichu;
    private javax.swing.JButton Pokeball;
    private javax.swing.JLabel Return;
    public javax.swing.JTextField TelefonoUs;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelApellido;
    private javax.swing.JLabel labelContraseña;
    private javax.swing.JLabel labelContraseña1;
    private javax.swing.JLabel labelTelefono;
    private javax.swing.JLabel labelUsuario;
    // End of variables declaration//GEN-END:variables
}
