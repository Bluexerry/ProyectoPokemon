package Vista;

import Controlador.ControladorUsuario;
import Modelo.Usuario;
import Servicios.ReproductorMusica;
import java.awt.Window;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class TablaU extends javax.swing.JFrame {

    //Instancias
    private final ControladorUsuario controladorU;
    int xMouse, yMouse;

    public TablaU() {
        initComponents();

        //Inicia la ventana en el centro
        setLocationRelativeTo(null);

        //Denomina el objeto usado para usar sus metodos mas adelante
        controladorU = new ControladorUsuario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaU = new javax.swing.JTable();
        Mostrar = new javax.swing.JButton();
        IconoHombre = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Return = new javax.swing.JLabel();
        Minimizar = new javax.swing.JLabel();
        IdUs = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        Eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(255, 204, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaU.setBackground(new java.awt.Color(241, 227, 165));
        tablaU.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tablaU.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        tablaU.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "APELLIDOS", "TELEFONO", "CONTRASEÑA"
            }
        ));
        tablaU.setToolTipText("");
        tablaU.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(tablaU);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 450, 320));

        Mostrar.setBackground(new java.awt.Color(241, 227, 165));
        Mostrar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Mostrar.setText("Mostrar");
        Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarActionPerformed(evt);
            }
        });
        jPanel3.add(Mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 90, 50));

        IconoHombre.setBackground(new java.awt.Color(255, 204, 51));
        IconoHombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/avatar.png"))); // NOI18N
        IconoHombre.setBorder(null);
        IconoHombre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        IconoHombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IconoHombreActionPerformed(evt);
            }
        });
        jPanel3.add(IconoHombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 130, 140));

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        Return.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/volver_1.png"))); // NOI18N
        Return.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Return.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReturnMouseClicked(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Return)
                .addGap(18, 18, 18)
                .addComponent(Minimizar)
                .addContainerGap(582, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Return)
                    .addComponent(Minimizar)))
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 40));

        IdUs.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        IdUs.setText("ID:");
        jPanel3.add(IdUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });
        jPanel3.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 160, 20));

        Eliminar.setBackground(new java.awt.Color(241, 227, 165));
        Eliminar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jPanel3.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 90, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarActionPerformed
        //Funcion para reproducir un audio 
        ReproductorMusica.reproducirAudio("/Audio/A.wav");

        //Creamos un modelo de tabla en base a nuestra tabla situada en el frame
        TableModel modelo = tablaU.getModel();
        DefaultTableModel modeloTabla = (DefaultTableModel) modelo;

        //Seteamos la tabla a 0 cada ves que clikcamos para ecitar sobrecargas de datos
        modeloTabla.setRowCount(0);

        //Creamos una lista de usuarios y llamamos al metodo
        List<Usuario> usuarios
                = controladorU.ListarUsuarios(tablaU);

        //Creamos un array de objetos con capacidad hasta 5
        Object[] object = new Object[5];

        /*Reiteramos los datos que nos devuelve la funcion con el objeto y 
        mediante un for con un tamaño en base al tamaño de la lista.*/
        for (int i = 0; i < usuarios.size(); i++) {

            /*En cada vuelta obtenemos el valor del dato en la posicion i 
            sy lo igualamos al objeto para al final de la vuelta añadirlo a la tabla*/
            object[0] = usuarios.get(i).getId();
            object[1] = usuarios.get(i).getNombre();
            object[2] = usuarios.get(i).getApellido();
            object[3] = usuarios.get(i).getTelefono();
            object[4] = usuarios.get(i).getContraseña();
            modeloTabla.addRow(object);
        }

        //Seteamos la tabla para ver la informacion
        tablaU.setModel(modelo);
    }//GEN-LAST:event_MostrarActionPerformed

    private void IconoHombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IconoHombreActionPerformed
        //Funcion para reproducir un audio 
        ReproductorMusica.reproducirAudio("/Audio/Voz.wav");
    }//GEN-LAST:event_IconoHombreActionPerformed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        //Variables que permiten el movimiento de la ventana mediante obtencion de la posicion x e y de esta
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        //Las variables mencionadas se igualan a la posicion x e y
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void ReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnMouseClicked
        //Funcion para reproducir un audio
        ReproductorMusica.reproducirAudio("/Audio/A.wav");

        //Set de la visualizacion de la vantana de EleccionAdmin y cierre de esta
        EleccionAdmin eleccion = new EleccionAdmin();
        eleccion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ReturnMouseClicked

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

    private void MinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseEntered

    }//GEN-LAST:event_MinimizarMouseEntered

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        //Funcion para reproducir un audio
        ReproductorMusica.reproducirAudio("/Audio/A.wav");

        //Recoge el texto de nombre y verifica si esta vacio
        if (txtId.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe rellenar el campo de ID para poder eliminar");
        } else if (txtId.getText().equals("1")) {
            JOptionPane.showMessageDialog(null, "Imposible de eliminar, el admin es todopoderoso");
        } else {

            //Igualamos las variables al texto recogido en el campo
            int ID = Integer.parseInt(txtId.getText());

            //Creamos el objeto y llamamos al metodo para eliminar
            Usuario usuario = new Usuario(ID);
            controladorU.EliminarUsuario(usuario);
        }
    }//GEN-LAST:event_EliminarActionPerformed

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        //Tipado que impide escribir valores numericos enteros

        //Tipado que impide escribir mas de 10 caracteres
        if (txtId.getText().length() >= 10) {
            evt.consume(); // Consumir el evento para evitar que se agregue más caracteres
        }
    }//GEN-LAST:event_txtIdKeyTyped

    private void txtIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyReleased

    }//GEN-LAST:event_txtIdKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Eliminar;
    private javax.swing.JButton IconoHombre;
    private javax.swing.JLabel IdUs;
    private javax.swing.JLabel Minimizar;
    public javax.swing.JButton Mostrar;
    private javax.swing.JLabel Return;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tablaU;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
