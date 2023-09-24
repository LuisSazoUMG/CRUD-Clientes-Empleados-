package vista;

import java.awt.Color;
import modelo.Empleado;

/**
 *
 * @author Luis Sazo
 */
public class Frm_Empleados extends javax.swing.JFrame {

    Frm_Clientes fr2;
    Frm_Empleados fr;
    Empleado empleado;

    public Frm_Empleados() {
        initComponents();
        setSize(550, 520);
        setResizable(false);
        setTitle("Formulario Empleados");
        setLocationRelativeTo(null);
        this.repaint();

        empleado = new Empleado();
        this.tbl_empleados.setModel(empleado.Leer());
        this.cmb_puestos.setModel(empleado.leerPuesto());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpanel_titulo = new javax.swing.JPanel();
        lbl_imagen = new javax.swing.JLabel();
        lbl_titulo2 = new javax.swing.JLabel();
        jlabel = new javax.swing.JLabel();
        lbl_IdEmpleado = new javax.swing.JLabel();
        lbl_nombres = new javax.swing.JLabel();
        lbl_apellidos = new javax.swing.JLabel();
        lbl_telefono = new javax.swing.JLabel();
        lbl_puesto = new javax.swing.JLabel();
        txt_nombres = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_apellidos = new javax.swing.JTextField();
        cmb_puestos = new javax.swing.JComboBox<>();
        btn_ingresar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_clientes = new javax.swing.JButton();
        lbl_codigo = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        jspanel_empleados = new javax.swing.JScrollPane();
        tbl_empleados = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(273, 81));

        jpanel_titulo.setBackground(new java.awt.Color(0, 0, 51));
        jpanel_titulo.setPreferredSize(new java.awt.Dimension(273, 81));

        lbl_imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/employee.png"))); // NOI18N

        lbl_titulo2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lbl_titulo2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_titulo2.setText("EMPLEADOS");

        javax.swing.GroupLayout jpanel_tituloLayout = new javax.swing.GroupLayout(jpanel_titulo);
        jpanel_titulo.setLayout(jpanel_tituloLayout);
        jpanel_tituloLayout.setHorizontalGroup(
            jpanel_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_tituloLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbl_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_titulo2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanel_tituloLayout.setVerticalGroup(
            jpanel_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_tituloLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jpanel_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_titulo2)
                    .addComponent(lbl_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jlabel.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jlabel.setText("ID");

        lbl_IdEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_IdEmpleado.setText("0");

        lbl_nombres.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbl_nombres.setText("Nombres");

        lbl_apellidos.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbl_apellidos.setText("Apellidos");

        lbl_telefono.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbl_telefono.setText("Teléfono");

        lbl_puesto.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbl_puesto.setText("Puesto");

        cmb_puestos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btn_ingresar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_ingresar.setText("Ingresar");
        btn_ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ingresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ingresarMouseExited(evt);
            }
        });
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });

        btn_actualizar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_actualizar.setText("Actualizar");
        btn_actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_actualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_actualizarMouseExited(evt);
            }
        });
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        btn_eliminar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_eliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_eliminarMouseExited(evt);
            }
        });
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_clientes.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_clientes.setText("Clientes");
        btn_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_clientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_clientesMouseExited(evt);
            }
        });
        btn_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clientesActionPerformed(evt);
            }
        });

        lbl_codigo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lbl_codigo.setText("Código");

        txt_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_codigoActionPerformed(evt);
            }
        });

        tbl_empleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_empleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_empleadosMouseClicked(evt);
            }
        });
        tbl_empleados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbl_empleadosKeyReleased(evt);
            }
        });
        jspanel_empleados.setViewportView(tbl_empleados);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanel_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_nombres)
                                .addGap(18, 18, 18)
                                .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_apellidos)
                                .addGap(18, 18, 18)
                                .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_IdEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_puesto)
                            .addComponent(lbl_telefono)
                            .addComponent(lbl_codigo))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_telefono, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(cmb_puestos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_codigo))))
                .addContainerGap(96, Short.MAX_VALUE))
            .addComponent(jspanel_empleados, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jpanel_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabel)
                    .addComponent(lbl_IdEmpleado)
                    .addComponent(lbl_codigo)
                    .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombres)
                    .addComponent(lbl_telefono)
                    .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_apellidos)
                    .addComponent(lbl_puesto)
                    .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_puestos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ingresar)
                    .addComponent(btn_actualizar)
                    .addComponent(btn_eliminar)
                    .addComponent(btn_clientes))
                .addGap(18, 18, 18)
                .addComponent(jspanel_empleados, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clientesActionPerformed
        fr = new Frm_Empleados();
        fr2 = new Frm_Clientes();

        fr.setVisible(false);
        fr2.show();
    }//GEN-LAST:event_btn_clientesActionPerformed
    public void Limpiar() {
        this.txt_codigo.setText("");
        this.txt_nombres.setText("");
        this.txt_apellidos.setText("");
        this.txt_telefono.setText("");
    }
    private void btn_ingresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ingresarMouseEntered
        if (evt.getSource() == this.btn_ingresar) {
            this.btn_ingresar.setBackground(new Color(102, 102, 255));
        }
    }//GEN-LAST:event_btn_ingresarMouseEntered
    public void seleccionarDatos() {

        int fila = tbl_empleados.getSelectedRow();
        this.lbl_IdEmpleado.setText(tbl_empleados.getValueAt(fila, 0).toString());
        txt_codigo.setText(tbl_empleados.getValueAt(fila, 1).toString());
        txt_nombres.setText(tbl_empleados.getValueAt(fila, 2).toString());
        txt_apellidos.setText(tbl_empleados.getValueAt(fila, 3).toString());
        txt_telefono.setText(tbl_empleados.getValueAt(fila, 4).toString());
        this.cmb_puestos.setSelectedItem(tbl_empleados.getValueAt(fila, 5).toString());
    }
    private void btn_ingresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ingresarMouseExited
        if (evt.getSource() == this.btn_ingresar) {
            this.btn_ingresar.setBackground(new Color(187, 187, 187));
        }
    }//GEN-LAST:event_btn_ingresarMouseExited

    private void btn_actualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_actualizarMouseEntered
        if (evt.getSource() == this.btn_actualizar) {
            this.btn_actualizar.setBackground(new Color(102, 102, 255));
        }
    }//GEN-LAST:event_btn_actualizarMouseEntered

    private void btn_actualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_actualizarMouseExited
        if (evt.getSource() == this.btn_actualizar) {
            this.btn_actualizar.setBackground(new Color(187, 187, 187));
        }
    }//GEN-LAST:event_btn_actualizarMouseExited

    private void btn_eliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMouseEntered
        if (evt.getSource() == this.btn_eliminar) {
            this.btn_eliminar.setBackground(new Color(102, 102, 255));
        }
    }//GEN-LAST:event_btn_eliminarMouseEntered

    private void btn_eliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMouseExited
        if (evt.getSource() == this.btn_eliminar) {
            this.btn_eliminar.setBackground(new Color(187, 187, 187));
        }
    }//GEN-LAST:event_btn_eliminarMouseExited

    private void btn_clientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clientesMouseEntered
        if (evt.getSource() == this.btn_clientes) {
            this.btn_clientes.setBackground(new Color(102, 102, 255));
        }
    }//GEN-LAST:event_btn_clientesMouseEntered

    private void btn_clientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clientesMouseExited
        if (evt.getSource() == this.btn_clientes) {
            this.btn_clientes.setBackground(new Color(187, 187, 187));
        }
    }//GEN-LAST:event_btn_clientesMouseExited

    private void txt_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_codigoActionPerformed

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        String id_puesto = this.cmb_puestos.getSelectedItem().toString();
        int posc = id_puesto.indexOf(')');

        empleado = new Empleado(this.txt_codigo.getText(), 0, Integer.parseInt(id_puesto.substring(0, posc)), this.txt_nombres.getText(),
                this.txt_apellidos.getText(), this.txt_telefono.getText());
        empleado.Agregar();
        this.tbl_empleados.setModel(empleado.Leer());
        this.Limpiar();
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void tbl_empleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_empleadosMouseClicked
        this.seleccionarDatos();
    }//GEN-LAST:event_tbl_empleadosMouseClicked

    private void tbl_empleadosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_empleadosKeyReleased
        this.seleccionarDatos();
    }//GEN-LAST:event_tbl_empleadosKeyReleased

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        String id_puesto = this.cmb_puestos.getSelectedItem().toString();
        int posc = id_puesto.indexOf(')');

        empleado = new Empleado(this.txt_codigo.getText(), Integer.parseInt(this.lbl_IdEmpleado.getText()), Integer.parseInt(id_puesto.substring(0, posc)),
                this.txt_nombres.getText(), this.txt_apellidos.getText(), this.txt_telefono.getText());
        empleado.Actualizar();
        this.tbl_empleados.setModel(empleado.Leer());
        this.Limpiar();
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        empleado = new Empleado();
        empleado.setId(Integer.parseInt(this.lbl_IdEmpleado.getText()));
        empleado.Eliminar();
        tbl_empleados.setModel(empleado.Leer());
        this.Limpiar();
    }//GEN-LAST:event_btn_eliminarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frm_Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Empleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_clientes;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JComboBox<String> cmb_puestos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlabel;
    private javax.swing.JPanel jpanel_titulo;
    private javax.swing.JScrollPane jspanel_empleados;
    private javax.swing.JLabel lbl_IdEmpleado;
    private javax.swing.JLabel lbl_apellidos;
    private javax.swing.JLabel lbl_codigo;
    private javax.swing.JLabel lbl_imagen;
    private javax.swing.JLabel lbl_nombres;
    private javax.swing.JLabel lbl_puesto;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JLabel lbl_titulo2;
    private javax.swing.JTable tbl_empleados;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
