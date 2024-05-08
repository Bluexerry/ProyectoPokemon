package Vista;

import Controlador.ControladorUsuario;
import Modelo.Usuario;
import Servicios.ReproductorMusica;
import java.awt.Window;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Login extends javax.swing.JFrame {

    //Instancias
    private Registro registro;
    private EleccionAdmin eleccion;
    private EleccionUsuario eleccionU;
    int xMouse, yMouse;

    public Login() {
        initComponents();

        //Inicia la ventana en el centros
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Registro = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        labelContraseña = new javax.swing.JLabel();
        InicioSesion = new javax.swing.JButton();
        txtContraseña = new javax.swing.JPasswordField();
        Pikachu = new javax.swing.JButton();
        IconoEntrenador = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Apagar = new javax.swing.JLabel();
        Minimizar = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Registro.setBackground(new java.awt.Color(241, 227, 165));
        Registro.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Registro.setText("Registrar");
        Registro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroActionPerformed(evt);
            }
        });
        jPanel1.add(Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        txtUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsuarioMouseClicked(evt);
            }
        });
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 220, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("INICIAR SESION");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 180, 60));

        labelUsuario.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        labelUsuario.setText("USUARIO");
        jPanel1.add(labelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, 22));

        labelContraseña.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        labelContraseña.setText("CONTRASEÑA");
        jPanel1.add(labelContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        InicioSesion.setBackground(new java.awt.Color(241, 227, 165));
        InicioSesion.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        InicioSesion.setText("Iniciar");
        InicioSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        InicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioSesionActionPerformed(evt);
            }
        });
        jPanel1.add(InicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, -1, -1));

        txtContraseña.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtContraseñaMouseClicked(evt);
            }
        });
        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });
        txtContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContraseñaKeyTyped(evt);
            }
        });
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 220, -1));

        Pikachu.setBackground(new java.awt.Color(255, 204, 51));
        Pikachu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pikachu_NB.gif"))); // NOI18N
        Pikachu.setBorder(null);
        Pikachu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pikachu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PikachuActionPerformed(evt);
            }
        });
        jPanel1.add(Pikachu, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, -1, -1));

        IconoEntrenador.setBackground(new java.awt.Color(255, 204, 51));
        IconoEntrenador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/entrenador-pokemon.png"))); // NOI18N
        IconoEntrenador.setBorder(null);
        IconoEntrenador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        IconoEntrenador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IconoEntrenadorActionPerformed(evt);
            }
        });
        jPanel1.add(IconoEntrenador, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));

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

        Apagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/apagar.png"))); // NOI18N
        Apagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Apagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ApagarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ApagarMouseEntered(evt);
            }
        });
        jPanel2.add(Apagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

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
        jPanel2.add(Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed

    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void InicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioSesionActionPerformed
        //Funcion para reproducir un audio 
        ReproductorMusica.reproducirAudio("/Audio/A.wav");

        //Recoge el texto de los campos y verifica si estan vacios
        if (txtContraseña.getText().isEmpty() || txtUsuario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe rellenar los campos para poder iniciar");
        } else {

            //Iguala las variables al texto recogido
            String nombre = txtUsuario.getText();
            String contraseña = txtContraseña.getText();

            //Creamos el objeto y llamamos al metodo para insertar
            Usuario usuario = new Usuario(nombre, contraseña);
            ControladorUsuario m = new ControladorUsuario();

            //En caso de que los strings devueltos coincidan con los strings denominados, se setea una ventana 
            if (m.LogUsuario(usuario, nombre, contraseña)) {
                if (nombre.equals("Jesús") && contraseña.equals("admin27")) {
                    eleccion = new EleccionAdmin();
                    eleccion.setVisible(true);
                    this.dispose();

                    //En caso contrario, se setea otra ventana diferentes
                } else if (!nombre.equals("Jesús") && !contraseña.equals("admin27")) {
                    eleccionU = new EleccionUsuario();
                    eleccionU.setVisible(true);
                    this.dispose();
                }

                //Se borra el contenido de los textFields en cualquier caso
            } else {
                txtUsuario.setText("");
                txtContraseña.setText("");
            }
        }
    }//GEN-LAST:event_InicioSesionActionPerformed

    private void RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroActionPerformed
        //Funcion para reproducir un audio 
        ReproductorMusica.reproducirAudio("/Audio/A.wav");

        //Set de la visualizacion de la vantana de Registro y cierre de esta
        registro = new Registro();
        registro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RegistroActionPerformed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed

    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void PikachuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PikachuActionPerformed
        //Funcion para reproducir un audio 
        ReproductorMusica.reproducirAudio("/Audio/Pikachu.wav");
    }//GEN-LAST:event_PikachuActionPerformed

    private void IconoEntrenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IconoEntrenadorActionPerformed
        //Funcion para reproducir un audio 
        ReproductorMusica.reproducirAudio("/Audio/LvUp.wav");
    }//GEN-LAST:event_IconoEntrenadorActionPerformed

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

    private void txtUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMouseClicked
        //Funcion para reproducir un audio 
        ReproductorMusica.reproducirAudio("/Audio/SonidoBoli.wav");
    }//GEN-LAST:event_txtUsuarioMouseClicked

    private void txtContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaMouseClicked
        //Funcion para reproducir un audio 
        ReproductorMusica.reproducirAudio("/Audio/SonidoBoli.wav");
    }//GEN-LAST:event_txtContraseñaMouseClicked

    private void ApagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApagarMouseClicked
        //Cierre de la aplicacion
        System.exit(0);
    }//GEN-LAST:event_ApagarMouseClicked

    private void ApagarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApagarMouseEntered

    }//GEN-LAST:event_ApagarMouseEntered

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        //Tipado que impide escribir valores numericos enteros
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }

        //Tipado que impide escribir mas de 10 caracteres
        if (txtUsuario.getText().length() >= 10) {
            evt.consume(); // Consumir el evento para evitar que se agregue más caracteres
        }
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void txtContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaKeyTyped
        //Tipaso de la contraseña para evitar escribir mas de 10 caracteres
        if (txtContraseña.getText().length() >= 10) {
            evt.consume(); // Consumir el evento para evitar que se agregue más caracteres
        }
    }//GEN-LAST:event_txtContraseñaKeyTyped

    private void MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseClicked
        //Funcion para reproducir un audio 
        ReproductorMusica.reproducirAudio("/Audio/A.wav");

        // Obtiene la ventana padre del JLabel
        Window window = SwingUtilities.getWindowAncestor(Apagar);
        // Verifica si la ventana es un JFrame y la minimiza
        if (window instanceof JFrame) {
            ((JFrame) window).setState(JFrame.ICONIFIED);
        }
    }//GEN-LAST:event_MinimizarMouseClicked

    private void MinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseEntered

    }//GEN-LAST:event_MinimizarMouseEntered

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apagar;
    private javax.swing.JButton IconoEntrenador;
    public javax.swing.JButton InicioSesion;
    private javax.swing.JLabel Minimizar;
    private javax.swing.JButton Pikachu;
    public javax.swing.JButton Registro;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelContraseña;
    private javax.swing.JLabel labelUsuario;
    public javax.swing.JPasswordField txtContraseña;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
