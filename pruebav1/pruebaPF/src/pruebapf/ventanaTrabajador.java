package pruebapf;
public class ventanaTrabajador extends javax.swing.JFrame 
{
    public ventanaTrabajador() 
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegresar = new javax.swing.JButton();
        btnPedido = new javax.swing.JButton();
        btnAgregarComponentes = new javax.swing.JButton();
        btnAltaTarjeta = new javax.swing.JButton();
        btnBajaComponentes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("trabajador");
        setLocation(new java.awt.Point(400, 50));
        setResizable(false);

        btnRegresar.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnRegresar.setText("regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnPedido.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnPedido.setText("realizar pedido");
        btnPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidoActionPerformed(evt);
            }
        });

        btnAgregarComponentes.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnAgregarComponentes.setText("agregar componentes");
        btnAgregarComponentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarComponentesActionPerformed(evt);
            }
        });

        btnAltaTarjeta.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnAltaTarjeta.setText("dar de alta tarjeta");
        btnAltaTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaTarjetaActionPerformed(evt);
            }
        });

        btnBajaComponentes.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnBajaComponentes.setText("descontar componentes");
        btnBajaComponentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaComponentesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnRegresar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAgregarComponentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAltaTarjeta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBajaComponentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnPedido)
                .addGap(18, 18, 18)
                .addComponent(btnAgregarComponentes)
                .addGap(18, 18, 18)
                .addComponent(btnAltaTarjeta)
                .addGap(18, 18, 18)
                .addComponent(btnBajaComponentes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(btnRegresar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
       ventanaLogin vL = new ventanaLogin();
       vL.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnBajaComponentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaComponentesActionPerformed
        ventanaDescontarComponentes vDc = new ventanaDescontarComponentes(false);
        vDc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBajaComponentesActionPerformed

    private void btnPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidoActionPerformed
        ventanaPedidos vP = new ventanaPedidos();
        vP.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPedidoActionPerformed

    private void btnAgregarComponentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarComponentesActionPerformed
        ventanaAgregaComponentes vAc = new ventanaAgregaComponentes();
        vAc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAgregarComponentesActionPerformed

    private void btnAltaTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaTarjetaActionPerformed
        ventanaAltaTarjeta vAt = new ventanaAltaTarjeta();
        vAt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAltaTarjetaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarComponentes;
    private javax.swing.JButton btnAltaTarjeta;
    private javax.swing.JButton btnBajaComponentes;
    private javax.swing.JButton btnPedido;
    private javax.swing.JButton btnRegresar;
    // End of variables declaration//GEN-END:variables
}
