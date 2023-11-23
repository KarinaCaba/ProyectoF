package pruebapf;
public class ventanaMaquilador extends javax.swing.JFrame 
{
    public ventanaMaquilador() 
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegresar = new javax.swing.JButton();
        btnBajaComp = new javax.swing.JButton();
        btnStatusTarjeta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 50));
        setResizable(false);

        btnRegresar.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnRegresar.setText("regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnBajaComp.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnBajaComp.setText("descontar componente(s)");
        btnBajaComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaCompActionPerformed(evt);
            }
        });

        btnStatusTarjeta.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnStatusTarjeta.setText("cambiar status tarjeta");
        btnStatusTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatusTarjetaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBajaComp)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addComponent(btnRegresar))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(117, 117, 117)
                            .addComponent(btnStatusTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addComponent(btnBajaComp)
                .addGap(46, 46, 46)
                .addComponent(btnStatusTarjeta)
                .addGap(71, 71, 71)
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

    private void btnBajaCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaCompActionPerformed
        ventanaDescontarComponentes vDc = new ventanaDescontarComponentes(true);
        vDc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBajaCompActionPerformed

    private void btnStatusTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatusTarjetaActionPerformed
        ventanaStatusTarjeta vSt = new ventanaStatusTarjeta();
        vSt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnStatusTarjetaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBajaComp;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnStatusTarjeta;
    // End of variables declaration//GEN-END:variables
}
