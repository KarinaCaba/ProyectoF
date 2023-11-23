package pruebapf;

import javax.swing.JOptionPane;

public class ventanaChequeo extends javax.swing.JFrame 
{
    public ventanaChequeo() 
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();
        btnEntrada = new javax.swing.JButton();
        btnSalida = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("chequeo horario");
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
        jLabel1.setText("clave empleado");

        txtClave.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        btnEntrada.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnEntrada.setText("checar entrada");
        btnEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradaActionPerformed(evt);
            }
        });

        btnSalida.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnSalida.setText("checar salida");
        btnSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRegresar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31)
                        .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(btnEntrada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(btnSalida)
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntrada)
                    .addComponent(btnSalida))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(btnRegresar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        ventanaPrincipal reg = new ventanaPrincipal();
        reg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnSalidaActionPerformed(java.awt.event.ActionEvent evt) 
    {//GEN-FIRST:event_btnSalidaActionPerformed
    	PersonaControlador pC = new PersonaControlador();
    	int clave = Integer.parseInt(txtClave.getText());
    	boolean vemos = pC.ChecarSalida(clave);
    	if(vemos == true)
    	{
    		JOptionPane.showMessageDialog(null, "salida registrada correctamente");
    	}
    	else
    		JOptionPane.showMessageDialog(null, "error al registrar la salida");
        txtClave.setText("");;
    }

    private void btnEntradaActionPerformed(java.awt.event.ActionEvent evt) 
    {
    	PersonaControlador pC = new PersonaControlador();
    	int clave = Integer.parseInt(txtClave.getText());
    	boolean vemos = pC.ChecarEntrada(clave);
    	if(vemos == true)
    	{
    		JOptionPane.showMessageDialog(null, "entrada registrada correctamente");
    	}
    	else
    		JOptionPane.showMessageDialog(null, "error al registrar la entrada");
        txtClave.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrada;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtClave;
    // End of variables declaration//GEN-END:variables
}
