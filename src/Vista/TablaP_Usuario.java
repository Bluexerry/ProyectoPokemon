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
        Return = new javax.swing.JLabel();
        Minimizar = new javax.swing.JLabel();
        Genero = new javax.swing.JButton();
        Nat = new javax.swing.JButton();
        Tipo = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Generotxt = new javax.swing.JComboBox<>();
        Tipo1txt = new javax.swing.JComboBox<>();
        Tipo2txt = new javax.swing.JComboBox<>();
        Naturalezatxt = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));

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

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setText("Pokedex:");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText("Genero:");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setText("Tipo 1:");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setText("Tipo 2:");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setText("Naturaleza:");

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

        btnEliminar.setBackground(new java.awt.Color(241, 227, 165));
        btnEliminar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setToolTipText("Elimina un cuadro de datos en la BBDD,  debe denominar el nombre para poder identificar el Pokemon.");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

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
        jPanel2.add(Return, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

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

        Genero.setBackground(new java.awt.Color(241, 227, 165));
        Genero.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Genero.setText("Genero");
        Genero.setToolTipText("Haz click para ver el posible genero.");
        Genero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneroActionPerformed(evt);
            }
        });

        Nat.setBackground(new java.awt.Color(241, 227, 165));
        Nat.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Nat.setText("Naturaleza");
        Nat.setToolTipText("Haz click para ver la posible naturaleza.");
        Nat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Nat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NatActionPerformed(evt);
            }
        });

        Tipo.setBackground(new java.awt.Color(241, 227, 165));
        Tipo.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        Tipo.setText("Tipo");
        Tipo.setToolTipText("Haz click para ver el numero de tipo.");
        Tipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setText("   Haz click para conocer el ID necesario");

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setText("-----------------------------------------");

        Generotxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "1", "2", "3" }));
        Generotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerotxtActionPerformed(evt);
            }
        });

        Tipo1txt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "15", "16", "17", "18" }));
        Tipo1txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tipo1txtActionPerformed(evt);
            }
        });

        Tipo2txt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19" }));

        Naturalezatxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnListar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(12, 12, 12))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Genero)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Nat, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel8))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Generotxt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Tipo1txt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Tipo2txt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Naturalezatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(25, 25, 25)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(311, 311, 311))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Generotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Tipo1txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Tipo2txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Naturalezatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tipo)
                    .addComponent(Genero)
                    .addComponent(Nat))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnListar)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addGap(18, 18, 18)
                .addComponent(btnEditar)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addGap(33, 33, 33))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 573, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //Funcion para reproducir un audio 
        ReproductorMusica.reproducirAudio("/Audio/A.wav");

        //Recoge el texto de los campos y verifica si estan vacios
        if (txtId.getText().isBlank() || txtNombre.getText().isBlank() || Generotxt.getSelectedItem().equals("Seleccionar") || Tipo1txt.getSelectedItem().equals("Seleccionar") || Tipo2txt.getSelectedItem().equals("Seleccionar") || Naturalezatxt.getSelectedItem().equals("Seleccionar")) {
            JOptionPane.showMessageDialog(null, "Debe rellenar todos los campos");
        } else {

            //Iguala las variables al texto recogido. Como algunas son ints necesitan un Integer.parseInt
            int num_pok = Integer.parseInt(txtId.getText());
            String nombre = txtNombre.getText();
            int genero = Integer.parseInt(Generotxt.getSelectedItem().toString());
            int tipo1 = Integer.parseInt(Tipo1txt.getSelectedItem().toString());
            int tipo2 = Integer.parseInt(Tipo2txt.getSelectedItem().toString());
            int naturaleza = Integer.parseInt(Naturalezatxt.getSelectedItem().toString());

            //Creamos el objeto y llamamos al metodo para insertar
            Pokemon pokemon = new Pokemon(nombre, num_pok, genero, tipo1, tipo2, naturaleza);
            new ControladorPokemon().CrearPokemon(pokemon);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        //Funcion para reproducir un audio 
        ReproductorMusica.reproducirAudio("/Audio/A.wav");

        //Creamos un modelo de tabla en base a nuestra tabla situada en el frame
        TableModel modelo = tabla.getModel();
        DefaultTableModel modeloTabla = (DefaultTableModel) modelo;

        //Seteamos la tabla a 0 cada ves que clikcamos para ecitar sobrecargas de datos
        modeloTabla.setRowCount(0);

        //Creamos una lista de usuarios y llamamos al metodo
        List<Pokemon> pokemons
                = controladorPokemon.ListarPokemon(tabla);

        //Creamos un array de objetos con capacidad hasta 5
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

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        //Funcion para reproducir un audio
        ReproductorMusica.reproducirAudio("/Audio/A.wav");

        //Recoge el texto de los campos y verifica si estan vacios
        if (txtNombre.getText().isBlank() || Generotxt.getSelectedItem().equals("Seleccionar") || Naturalezatxt.getSelectedItem().equals("Seleccionar")) {
            JOptionPane.showMessageDialog(null, "Debe rellenar los campo: Nombre, Genero, y Naturaleza");
        } else {

            //Iguala las variables al texto recogido. Como algunas son ints necesitan un Integer.parseInt
            String nombre = txtNombre.getText();
            int genero = Integer.parseInt(Generotxt.getSelectedItem().toString());
            int naturaleza = Integer.parseInt(Naturalezatxt.getSelectedItem().toString());

            //Creamos el objeto y llamamos al metodo para setear
            Pokemon pokemon = new Pokemon(nombre, genero, naturaleza);
            new ControladorPokemon().EditarPokemon(pokemon);
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
            new ControladorPokemon().EliminarPokemon(pokemon);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdMouseClicked
        //Funcion para reproducir un audio
        ReproductorMusica.reproducirAudio("/Audio/SonidoBoli.wav");
    }//GEN-LAST:event_txtIdMouseClicked

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        //Funcion para reproducir un audio
        ReproductorMusica.reproducirAudio("/Audio/SonidoBoli.wav");
    }//GEN-LAST:event_txtIdActionPerformed

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

    private void txtNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMouseClicked
        //Funcion para reproducir un audio
        ReproductorMusica.reproducirAudio("/Audio/SonidoBoli.wav");
    }//GEN-LAST:event_txtNombreMouseClicked

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        //Funcion para reproducir un audio
        ReproductorMusica.reproducirAudio("/Audio/SonidoBoli.wav");
    }//GEN-LAST:event_txtNombreActionPerformed

    private void ReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReturnMouseClicked
        //Funcion para reproducir un audio
        ReproductorMusica.reproducirAudio("/Audio/A.wav");

        //Set de la visualizacion de la vantana de EleccionUsuario y cierre de esta
        EleccionUsuario eleccionUsuario = new EleccionUsuario();
        eleccionUsuario.setVisible(true);
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

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        //Variables que permiten el movimiento de la ventana mediante obtencion de la posicion x e y de esta
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        //Las variables mencionadas se igualan a la posicion x e y
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void GeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneroActionPerformed
        //Funcion para reproducir un audio
        ReproductorMusica.reproducirAudio("/Audio/A.wav");

        //Funcion para leer archivo
        LeerYEscribir.Leer("/Texto/Genero.txt");
    }//GEN-LAST:event_GeneroActionPerformed

    private void NatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NatActionPerformed
        //Funcion para reproducir un audio
        ReproductorMusica.reproducirAudio("/Audio/A.wav");

        //Funcion para leer archivo
        LeerYEscribir.Leer("/Texto/Naturaleza.txt");
    }//GEN-LAST:event_NatActionPerformed

    private void TipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoActionPerformed
        //Funcion para reproducir un audio
        ReproductorMusica.reproducirAudio("/Audio/A.wav");

        //Funcion para leer archivo
        LeerYEscribir.Leer("/Texto/Tipo.txt");
    }//GEN-LAST:event_TipoActionPerformed

    private void GenerotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerotxtActionPerformed

    }//GEN-LAST:event_GenerotxtActionPerformed

    private void Tipo1txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tipo1txtActionPerformed

    }//GEN-LAST:event_Tipo1txtActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Genero;
    private javax.swing.JComboBox<String> Generotxt;
    private javax.swing.JLabel Minimizar;
    public javax.swing.JButton Nat;
    private javax.swing.JComboBox<String> Naturalezatxt;
    private javax.swing.JLabel Return;
    public javax.swing.JButton Tipo;
    private javax.swing.JComboBox<String> Tipo1txt;
    private javax.swing.JComboBox<String> Tipo2txt;
    public javax.swing.JButton btnEditar;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnListar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tabla;
    public javax.swing.JTextField txtId;
    public javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
