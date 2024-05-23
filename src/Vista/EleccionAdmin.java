package Vista;

import Servicios.ReproductorMusica;
import java.awt.Window;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class EleccionAdmin extends javax.swing.JFrame {

    //Instancias
    private TablaP busquedaP;
    private TablaU busquedaU;
    Login login = new Login();
    int xMouse, yMouse;

    public EleccionAdmin() {
        initComponents();

        //Inicia la ventana en el centro
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        DatosUsuarios = new javax.swing.JButton();
        BuscarEditar = new javax.swing.JButton();
        Gengar = new javax.swing.JButton();
        Lucario = new javax.swing.JButton();
        Scizor = new javax.swing.JButton();
        Magnezone = new javax.swing.JButton();
        PorygonZ = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Return = new javax.swing.JLabel();
        Minimizar = new javax.swing.JLabel();
        Sableye = new javax.swing.JButton();
        No = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DatosUsuarios.setBackground(new java.awt.Color(241, 227, 165));
        DatosUsuarios.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        DatosUsuarios.setText("Buscar Usuarios");
        DatosUsuarios.setToolTipText("Muestra los usuarios disponibles en el sistema y permite eliminarlos.");
        DatosUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatosUsuariosActionPerformed(evt);
            }
        });
        jPanel1.add(DatosUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 230, 35));

        BuscarEditar.setBackground(new java.awt.Color(241, 227, 165));
        BuscarEditar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        BuscarEditar.setText("Buscar/Editar Pokemon");
        BuscarEditar.setToolTipText("Crea, edita o elimina Pokemon de la BBDD");
        BuscarEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarEditarActionPerformed(evt);
            }
        });
        jPanel1.add(BuscarEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 260, 38));

        Gengar.setBackground(new java.awt.Color(255, 204, 51));
        Gengar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Gengar_NB.gif"))); // NOI18N
        Gengar.setBorder(null);
        Gengar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Gengar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GengarActionPerformed(evt);
            }
        });
        jPanel1.add(Gengar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        Lucario.setBackground(new java.awt.Color(255, 204, 51));
        Lucario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lucario_NB.gif"))); // NOI18N
        Lucario.setBorder(null);
        Lucario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Lucario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LucarioActionPerformed(evt);
            }
        });
        jPanel1.add(Lucario, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));

        Scizor.setBackground(new java.awt.Color(255, 204, 51));
        Scizor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Scizor_NB.gif"))); // NOI18N
        Scizor.setBorder(null);
        Scizor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Scizor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScizorActionPerformed(evt);
            }
        });
        jPanel1.add(Scizor, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, -1));

        Magnezone.setBackground(new java.awt.Color(255, 204, 51));
        Magnezone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Magnezone_NB.gif"))); // NOI18N
        Magnezone.setBorder(null);
        Magnezone.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Magnezone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MagnezoneActionPerformed(evt);
            }
        });
        jPanel1.add(Magnezone, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        PorygonZ.setBackground(new java.awt.Color(255, 204, 51));
        PorygonZ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Porygon-Z_NB.gif"))); // NOI18N
        PorygonZ.setBorder(null);
        PorygonZ.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PorygonZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PorygonZActionPerformed(evt);
            }
        });
        jPanel1.add(PorygonZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

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

        Return.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/volver_1.png"))); // NOI18N
        Return.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Return.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReturnMouseClicked(evt);
            }
        });
        jPanel2.add(Return, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

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
        jPanel2.add(Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 500, 50));

        Sableye.setBackground(new java.awt.Color(255, 204, 51));
        Sableye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Sableye_NB.gif"))); // NOI18N
        Sableye.setBorder(null);
        Sableye.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Sableye.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SableyeActionPerformed(evt);
            }
        });
        jPanel1.add(Sableye, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));

        No.setBackground(new java.awt.Color(255, 204, 51));
        No.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        No.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sin-sonido.png"))); // NOI18N
        No.setBorder(null);
        No.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoActionPerformed(evt);
            }
        });
        jPanel1.add(No, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 50, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DatosUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatosUsuariosActionPerformed
        //Funcion para reproducir un audio 
        ReproductorMusica.reproducirAudio("/Audio/A.wav");

        //Set de la visualizacion de la vantana de busqueda de usuarios  y cierre de esta
        busquedaU = new TablaU();
        busquedaU.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DatosUsuariosActionPerformed

    private void BuscarEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarEditarActionPerformed
        //Funcion para reproducir un audio
        ReproductorMusica.reproducirAudio("/Audio/A.wav");

        //Set de la visualizacion de la vantana de busqueda de pokemon  y cierre de esta
        busquedaP = new TablaP();
        busquedaP.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BuscarEditarActionPerformed

    private void GengarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GengarActionPerformed
        //Funcion para reproducir un audio 
        ReproductorMusica.reproducirAudio("/Audio/Gengar.wav");
    }//GEN-LAST:event_GengarActionPerformed

    private void LucarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LucarioActionPerformed
        //Funcion para reproducir un audio 
        ReproductorMusica.reproducirAudio("/Audio/Lucario.wav");
    }//GEN-LAST:event_LucarioActionPerformed

    private void ScizorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScizorActionPerformed
        //Funcion para reproducir un audio 
        ReproductorMusica.reproducirAudio("/Audio/Scizor.wav");
    }//GEN-LAST:event_ScizorActionPerformed

    private void MagnezoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MagnezoneActionPerformed
        //Funcion para reproducir un audio 
        ReproductorMusica.reproducirAudio("/Audio/Magnezone.wav");
    }//GEN-LAST:event_MagnezoneActionPerformed

    private void PorygonZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PorygonZActionPerformed
        //Funcion para reproducir un audio 
        ReproductorMusica.reproducirAudio("/Audio/Porygon-Z.wav");
    }//GEN-LAST:event_PorygonZActionPerformed

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

    private void ReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnMouseClicked
        //Funcion para reproducir un audio 
        ReproductorMusica.reproducirAudio("/Audio/A.wav");

        //Set de la visualizacion de la vantana de Login y cierre de esta
        login = new Login();
        login.setVisible(true);
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

    private void SableyeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SableyeActionPerformed
        //Funcion para reproducir un audio 
        ReproductorMusica.reproducirAudio("/Audio/Sableye.wav");
    }//GEN-LAST:event_SableyeActionPerformed

    private void NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoActionPerformed
        //Funcion para reproducir un audio 
        ReproductorMusica.reproducirAudio("/Audio/A.wav");

        //Funcion para leer archivo
        ReproductorMusica.detenerReproduccionMusica();
    }//GEN-LAST:event_NoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarEditar;
    private javax.swing.JButton DatosUsuarios;
    private javax.swing.JButton Gengar;
    private javax.swing.JButton Lucario;
    private javax.swing.JButton Magnezone;
    private javax.swing.JLabel Minimizar;
    private javax.swing.JButton No;
    private javax.swing.JButton PorygonZ;
    private javax.swing.JLabel Return;
    private javax.swing.JButton Sableye;
    private javax.swing.JButton Scizor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
