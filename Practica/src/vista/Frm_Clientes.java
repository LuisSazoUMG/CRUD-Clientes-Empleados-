package vista;

import java.awt.Color;
import modelo.Cliente;

/**
 *
 * @author Luis Sazo
 */
public class Frm_Clientes extends javax.swing.JFrame {
    Frm_Empleados fr;
    Frm_Clientes fr2;
    Cliente cliente;

    public Frm_Clientes() {
        initComponents();
        setSize(550, 520);
        setResizable(false);
        setTitle("Formulario Clientes");
        setLocationRelativeTo(null);
        this.repaint();
        
        cliente = new Cliente();
        this.tbl_clientes.setModel(cliente.Leer());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpanel_titulo = new javax.swing.JPanel();
        lbl_imagen = new javax.swing.JLabel();
        lbl_titulo2 = new javax.swing.JLabel();
        lbl_nit = new javax.swing.JLabel();
        lbl_nombres = new javax.swing.JLabel();
        lbl_apellidos = new javax.swing.JLabel();
        lbl_telefono = new javax.swing.JLabel();
        txt_nit = new javax.swing.JTextField();
        txt_nombres = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_apellidos = new javax.swing.JTextField();
        btn_ingresar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jspanel_clientes = new javax.swing.JScrollPane();
        tbl_clientes = new javax.swing.JTable();
        btn_empleados = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbl_idCliente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jpanel_titulo.setBackground(new java.awt.Color(0, 0, 51));

        lbl_imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/customer.png"))); // NOI18N

        lbl_titulo2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lbl_titulo2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_titulo2.setText("CLIENTES");

        javax.swing.GroupLayout jpanel_tituloLayout = new javax.swing.GroupLayout(jpanel_titulo);
        jpanel_titulo.setLayout(jpanel_tituloLayout);
        jpanel_tituloLayout.setHorizontalGroup(
            jpanel_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_tituloLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lbl_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_titulo2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanel_tituloLayout.setVerticalGroup(
            jpanel_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_tituloLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lbl_imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpanel_tituloLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbl_titulo2))
        );

        lbl_nit.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_nit.setText("Nit");

        lbl_nombres.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_nombres.setText("Nombres");

        lbl_apellidos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_apellidos.setText("Apellidos");

        lbl_telefono.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbl_telefono.setText("Teléfono");

        txt_apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidosActionPerformed(evt);
            }
        });

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

        tbl_clientes.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_clientesMouseClicked(evt);
            }
        });
        tbl_clientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbl_clientesKeyReleased(evt);
            }
        });
        jspanel_clientes.setViewportView(tbl_clientes);

        btn_empleados.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btn_empleados.setText("Empleados");
        btn_empleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_empleadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_empleadosMouseExited(evt);
            }
        });
        btn_empleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_empleadosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("ID");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanel_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jspanel_clientes)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_telefono)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_nit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_nit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_nombres)
                            .addComponent(lbl_apellidos))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_empleados, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jpanel_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(lbl_idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nit)
                    .addComponent(lbl_nombres)
                    .addComponent(txt_nit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_apellidos)
                    .addComponent(lbl_telefono)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ingresar)
                    .addComponent(btn_actualizar)
                    .addComponent(btn_eliminar)
                    .addComponent(btn_empleados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jspanel_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_apellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidosActionPerformed
    public void limpiar(){
        this.txt_nit.setText("");
        this.txt_nombres.setText("");
        this.txt_apellidos.setText("");
        this.txt_telefono.setText("");
    }
    private void btn_empleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_empleadosActionPerformed
        fr = new Frm_Empleados();
        fr2 = new Frm_Clientes();
        
        fr2.setVisible(false);
        fr.show();
    }//GEN-LAST:event_btn_empleadosActionPerformed
    public void seleccionarDatos(){
        int fila = this.tbl_clientes.getSelectedRow();
        this.lbl_idCliente.setText(this.tbl_clientes.getValueAt(fila, 0).toString());
        this.txt_nit.setText(this.tbl_clientes.getValueAt(fila, 1).toString());
        this.txt_nombres.setText(this.tbl_clientes.getValueAt(fila, 2).toString());
        this.txt_apellidos.setText(this.tbl_clientes.getValueAt(fila, 3).toString());
        this.txt_telefono.setText(this.tbl_clientes.getValueAt(fila, 4).toString());
    }
    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
           cliente = new Cliente(0,this.txt_nit.getText(), this.txt_nombres.getText(),
                                 this.txt_apellidos.getText(), this.txt_telefono.getText());
           cliente.Agregar();
           this.tbl_clientes.setModel(cliente.Leer());
           this.limpiar();
          
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void btn_ingresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ingresarMouseEntered
        if(evt.getSource() == this.btn_ingresar){
            this.btn_ingresar.setBackground(new Color(102, 102, 255));
        }
    }//GEN-LAST:event_btn_ingresarMouseEntered

    private void btn_ingresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ingresarMouseExited
        if(evt.getSource() == this.btn_ingresar){
            this.btn_ingresar.setBackground(new Color(187, 187, 187));
        }
    }//GEN-LAST:event_btn_ingresarMouseExited

    private void btn_actualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_actualizarMouseEntered
        if(evt.getSource() == this.btn_actualizar){
            this.btn_actualizar.setBackground(new Color(102, 102, 255));
        }
    }//GEN-LAST:event_btn_actualizarMouseEntered

    private void btn_actualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_actualizarMouseExited
        if(evt.getSource() == this.btn_actualizar){
            this.btn_actualizar.setBackground(new Color(187, 187, 187));
        }
    }//GEN-LAST:event_btn_actualizarMouseExited

    private void btn_eliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMouseEntered
        if(evt.getSource() == this.btn_eliminar){
            this.btn_eliminar.setBackground(new Color(102, 102, 255));
        }
    }//GEN-LAST:event_btn_eliminarMouseEntered

    private void btn_eliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMouseExited
        if(evt.getSource() == this.btn_eliminar){
            this.btn_eliminar.setBackground(new Color(187, 187, 187));
        }
    }//GEN-LAST:event_btn_eliminarMouseExited

    private void btn_empleadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_empleadosMouseEntered
        if(evt.getSource() == this.btn_empleados){
            this.btn_empleados.setBackground(new Color(102, 102, 255));
        }
    }//GEN-LAST:event_btn_empleadosMouseEntered

    private void btn_empleadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_empleadosMouseExited
        if(evt.getSource() == this.btn_empleados){
            this.btn_empleados.setBackground(new Color(187, 187, 187));
        }
    }//GEN-LAST:event_btn_empleadosMouseExited

    private void tbl_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_clientesMouseClicked
        this.seleccionarDatos();
    }//GEN-LAST:event_tbl_clientesMouseClicked

    private void tbl_clientesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_clientesKeyReleased
        this.seleccionarDatos();
    }//GEN-LAST:event_tbl_clientesKeyReleased

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        cliente = new Cliente(Integer.valueOf(this.lbl_idCliente.getText()), this.txt_nit.getText(), this.txt_nombres.getText(),
                              this.txt_apellidos.getText(), this.txt_telefono.getText());
        cliente.Actualizar();
        this.tbl_clientes.setModel(cliente.Leer());
        this.limpiar();
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        cliente = new Cliente();
        cliente.setId(Integer.valueOf(this.lbl_idCliente.getText()));
        cliente.Eliminar();
        this.tbl_clientes.setModel(cliente.Leer());
        this.limpiar();
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
            java.util.logging.Logger.getLogger(Frm_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_empleados;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpanel_titulo;
    private javax.swing.JScrollPane jspanel_clientes;
    private javax.swing.JLabel lbl_apellidos;
    private javax.swing.JLabel lbl_idCliente;
    private javax.swing.JLabel lbl_imagen;
    private javax.swing.JLabel lbl_nit;
    private javax.swing.JLabel lbl_nombres;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JLabel lbl_titulo2;
    private javax.swing.JTable tbl_clientes;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_nit;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
