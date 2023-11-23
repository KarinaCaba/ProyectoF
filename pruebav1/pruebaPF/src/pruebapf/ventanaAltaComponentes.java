package pruebapf;

import javax.swing.JOptionPane;

public class ventanaAltaComponentes extends javax.swing.JFrame 
{
    public ventanaAltaComponentes() 
    {
        initComponents();
        InventarioControlador inv = new InventarioControlador();
        comboProveedores = inv.llenaProveedores(comboProveedores);
        
    }
    @SuppressWarnings("unchecked")

    private void initComponents() {

        btnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCvePieza = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEspecificacion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        comboProveedores = new javax.swing.JComboBox<>();
        btnAlta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alta Componentes bdd");
        setLocation(new java.awt.Point(400, 50));
        
        setResizable(false);

        btnRegresar.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnRegresar.setText("regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel1.setText("nombre");

        txtNombre.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel2.setText("clave del componente");

        txtCvePieza.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel3.setText("especificación");

        txtEspecificacion.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel4.setText("proveedor");

        comboProveedores.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        btnAlta.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnAlta.setText("alta");
        btnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(btnRegresar)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre)
                            .addComponent(txtCvePieza)
                            .addComponent(txtEspecificacion)
                            .addComponent(comboProveedores, 0, 147, Short.MAX_VALUE))
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAlta)
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCvePieza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEspecificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(comboProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar)
                    .addComponent(btnAlta))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        ventanaAdministrador vA = new ventanaAdministrador();
        vA.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt) 
    {//GEN-FIRST:event_btnAltaActionPerformed
    	String nombre, especificacion;
    	int cvePieza;
    	boolean siono;
    	InventarioControlador iC = new InventarioControlador();
    	
    	nombre = txtNombre.getText();
        cvePieza = Integer.parseInt(txtCvePieza.getText());
        especificacion = txtEspecificacion.getText();
    	
    	siono = iC.AltaPieza(nombre, especificacion, 0, cvePieza);
    	if(siono == true)
    	{
    		JOptionPane.showMessageDialog(null, "componente dado de alta");
    	}
    	else
    		JOptionPane.showMessageDialog(null, "error al dar de alta el componente");
        txtNombre.setText("");
        txtCvePieza.setText("");
        txtEspecificacion.setText("");
        comboProveedores.removeAllItems();
    }//GEN-LAST:event_btnAltaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> comboProveedores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtCvePieza;
    private javax.swing.JTextField txtEspecificacion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
