package pruebapf;

import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Toolkit;

public class ventanaAltaComponentes extends javax.swing.JFrame 
{
    public ventanaAltaComponentes() 
    {
    	setIconImage(Toolkit.getDefaultToolkit().getImage(ventanaAltaComponentes.class.getResource("/pruebapf/drakkar.png")));
    	getContentPane().setBackground(new Color(255, 239, 213));
        initComponents();
        InventarioControlador inv = new InventarioControlador();
        comboProveedores = inv.llenaProveedores(comboProveedores);
        
    }
    @SuppressWarnings("unchecked")

    private void initComponents() {

        btnRegresar = new javax.swing.JButton();
        btnRegresar.setBackground(new Color(255, 255, 255));
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCvePieza = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEspecificacion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        comboProveedores = new javax.swing.JComboBox<>();
        btnAlta = new javax.swing.JButton();
        btnAlta.setBackground(new Color(255, 255, 255));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alta Componentes");
        setLocation(new java.awt.Point(400, 50));
        setPreferredSize(new java.awt.Dimension(500, 400));

        
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

        btnAlta.setFont(new Font("Comic Sans MS", Font.PLAIN, 16)); // NOI18N
        btnAlta.setText("registrar ");
        btnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaActionPerformed(evt);
            }
        });
        
        lblNuevoComponente = new JLabel("nuevo componente");
        lblNuevoComponente.setHorizontalAlignment(SwingConstants.CENTER);
        lblNuevoComponente.setFont(new Font("Comic Sans MS", Font.PLAIN, 26));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(10)
        			.addComponent(btnRegresar)
        			.addContainerGap(395, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(111, Short.MAX_VALUE)
        			.addComponent(lblNuevoComponente, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE)
        			.addGap(88))
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(90, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(jLabel2)
        						.addComponent(jLabel1)
        						.addComponent(jLabel3)
        						.addComponent(jLabel4))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(txtNombre)
        						.addComponent(txtCvePieza)
        						.addComponent(txtEspecificacion)
        						.addComponent(comboProveedores, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)))
        				.addComponent(btnAlta, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE))
        			.addGap(158))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(40)
        			.addComponent(lblNuevoComponente, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel1))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(txtCvePieza, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel2))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(txtEspecificacion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel3))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(comboProveedores, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel4))
        			.addGap(29)
        			.addComponent(btnAlta)
        			.addGap(16)
        			.addComponent(btnRegresar)
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

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
    private JLabel lblNuevoComponente;
    // End of variables declaration//GEN-END:variables
}
