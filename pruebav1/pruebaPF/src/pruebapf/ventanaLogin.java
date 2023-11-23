package pruebapf;

import javax.swing.JOptionPane;

public class ventanaLogin extends javax.swing.JFrame 
{

    public ventanaLogin() 
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {

        grupoTipoEmpleado = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        maquilador = new javax.swing.JRadioButton();
        trabajador = new javax.swing.JRadioButton();
        jefe = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        administrador = new javax.swing.JRadioButton();
        btnIngresar = new javax.swing.JButton();
        regresar = new javax.swing.JButton();

        grupoTipoEmpleado.add(maquilador);
        grupoTipoEmpleado.add(trabajador);
        grupoTipoEmpleado.add(jefe);
        grupoTipoEmpleado.add(administrador);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de sesión");
        setLocation(new java.awt.Point(400, 50));
        setResizable(false);
        setSize(new java.awt.Dimension(700, 300));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel1.setText("clave empleado");

        maquilador.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        maquilador.setText("maquilador");

        trabajador.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        trabajador.setText("trabajador");

        jefe.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jefe.setText("jefe");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel2.setText("elige tu tipo de empleado");

        administrador.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        administrador.setText("administrador");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(220, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(maquilador)
                    .addComponent(jefe))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(trabajador)
                    .addComponent(administrador))
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(trabajador)
                    .addComponent(maquilador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(administrador)
                    .addComponent(jefe))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        btnIngresar.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnIngresar.setText("ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        regresar.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        regresar.setText("regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 138, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 21, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(regresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIngresar)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresar)
                    .addComponent(regresar))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        ventanaPrincipal reg = new ventanaPrincipal();
        reg.setVisible(true);
        this.dispose();
    }

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) 
    {
    	int num;
    	num = Integer.parseInt(txtClave.getText());
    	String puesto;
    	
        if(jefe.isSelected() == true)
        {
        	puesto = "JEFE";
        	PersonaControlador pC = new PersonaControlador();
        	
        	if(pC.BuscaTrabajador(num, puesto) == true)
        	{
        		ventanaJefe vJ = new ventanaJefe();
                vJ.setVisible(true);
                this.dispose();
        	}
        	else
        	{
        		JOptionPane.showMessageDialog(null, "clave incorrecta o no correspondiente un usuario tipo " + puesto);
        	}
            
        }
        if(maquilador.isSelected() == true)
        {
        	puesto = "MAQUILADOR";
        	PersonaControlador pC = new PersonaControlador();
        	
        	if(pC.BuscaTrabajador(num, puesto) == true)
        	{
        		ventanaMaquilador vM = new ventanaMaquilador();
                vM.setVisible(true);
                this.dispose();
        	}
        	else
        	{
        		JOptionPane.showMessageDialog(null, "clave incorrecta o no correspondiente un usuario tipo " + puesto);
        	}
            
        }
        if(trabajador.isSelected() == true)
        {
        	puesto = "TRABAJADOR";
        	PersonaControlador pC = new PersonaControlador();
        	
        	if(pC.BuscaTrabajador(num, puesto) == true)
        	{
        		ventanaTrabajador vT = new ventanaTrabajador();
                vT.setVisible(true);
                this.dispose();
        	}
        	else
        	{
        		JOptionPane.showMessageDialog(null, "clave incorrecta o no correspondiente un usuario tipo " + puesto);
        	}
            
        }
        if(administrador.isSelected() == true)
        {
        	puesto = "ADMINISTRADOR";
        	PersonaControlador pC = new PersonaControlador();
        	
        	if(pC.BuscaTrabajador(num, puesto) == true)
        	{
        		ventanaAdministrador vA = new ventanaAdministrador();
                vA.setVisible(true);
                this.dispose();
        	}
        	else
        	{
        		JOptionPane.showMessageDialog(null, "clave incorrecta o no correspondiente un usuario tipo " + puesto);
        	}
            
        }
    }//GEN-LAST:event_btnIngresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton administrador;
    private javax.swing.JButton btnIngresar;
    private javax.swing.ButtonGroup grupoTipoEmpleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jefe;
    private javax.swing.JRadioButton maquilador;
    private javax.swing.JButton regresar;
    private javax.swing.JRadioButton trabajador;
    private javax.swing.JTextField txtClave;
    // End of variables declaration//GEN-END:variables
}
