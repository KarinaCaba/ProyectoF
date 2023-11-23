package pruebapf;


import java.sql.Timestamp;
import java.time.LocalDate;
import java.sql.Date;

import javax.swing.JOptionPane;
public class ventanaPedidos extends javax.swing.JFrame {

    public ventanaPedidos() {
        initComponents();
        InventarioControlador inv = new InventarioControlador();
        comboProveedor = inv.llenaProveedores(comboProveedor);
        comboComponentes = inv.llenaComponentes(comboComponentes);
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {

        btnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        comboComponentes = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        spinnerCantidad = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        comboProveedor = new javax.swing.JComboBox<>();
        btnOtroComponente = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        btnPedido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 50));
        setPreferredSize(new java.awt.Dimension(400, 350));
        setResizable(false);

        btnRegresar.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnRegresar.setText("regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel1.setText("componente");

        comboComponentes.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel2.setText("cantidad");

        spinnerCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100000, 1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel3.setText("proveedor");

        comboProveedor.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        btnOtroComponente.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnOtroComponente.setText("agregar otro componente");
        btnOtroComponente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOtroComponenteActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel4.setText("total");

        txtCosto.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        btnPedido.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnPedido.setText("registrar pedido");
        btnPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboComponentes, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(117, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(comboProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(90, 90, 90))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPedido)
                        .addGap(73, 73, 73))))
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(btnOtroComponente)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboComponentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(spinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnOtroComponente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar)
                    .addComponent(btnPedido))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        ventanaTrabajador vT = new ventanaTrabajador();
        vT.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnOtroComponenteActionPerformed(java.awt.event.ActionEvent evt) 
    {//GEN-FIRST:event_btnOtroComponenteActionPerformed3330
        comboProveedor.setEnabled(false);
        spinnerCantidad.setValue(1);
    }//GEN-LAST:event_btnOtroComponenteActionPerformed

    private void btnPedidoActionPerformed(java.awt.event.ActionEvent evt) 
    {//GEN-FIRST:event_btnPedidoActionPerformed
    	
    	InventarioControlador iC = new InventarioControlador();
    	int cantidad;
    	String aux = null;
    	
    	LocalDate fecha = LocalDate.now();
    	aux = fecha.toString();
    	cantidad = Integer.parseInt(txtCosto.getText());
    	boolean siono = false;
    	
    	siono = iC.RealizarPedido(aux, cantidad);
    	if(siono == true)
    		JOptionPane.showMessageDialog(null, "pedido dado de alta");
    	else
    		JOptionPane.showMessageDialog(null, "error al dar de alta pedido");
        spinnerCantidad.setValue(1);
        comboProveedor.setEnabled(true);
        txtCosto.setText("");
    }//GEN-LAST:event_btnPedidoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOtroComponente;
    private javax.swing.JButton btnPedido;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> comboComponentes;
    private javax.swing.JComboBox<String> comboProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSpinner spinnerCantidad;
    private javax.swing.JTextField txtCosto;
    // End of variables declaration//GEN-END:variables
}
