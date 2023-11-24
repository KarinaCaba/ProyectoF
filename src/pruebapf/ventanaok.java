package pruebapf;


import java.sql.Timestamp;
import java.time.LocalDate;
import java.awt.Dimension;
import java.sql.Date;

import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.Color;
public class ventanaPedidos extends javax.swing.JFrame {

    public ventanaPedidos() {
    	getContentPane().setBackground(new Color(255, 239, 213));
    	setTitle("Pedidos");
    	setIconImage(Toolkit.getDefaultToolkit().getImage(ventanaPedidos.class.getResource("/pruebapf/drakkar.png")));
        initComponents();
        InventarioControlador inv = new InventarioControlador();
        comboProveedor = inv.llenaProveedores(comboProveedor);
        comboComponentes = inv.llenaComponentes(comboComponentes);
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {

        btnRegresar = new javax.swing.JButton();
        btnRegresar.setBackground(new Color(255, 255, 255));
        jLabel1 = new javax.swing.JLabel();
        comboComponentes = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        spinnerCantidad = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        comboProveedor = new javax.swing.JComboBox<>();
        btnOtroComponente = new javax.swing.JButton();
        btnOtroComponente.setBackground(new Color(255, 255, 255));
        jLabel4 = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        btnPedido = new javax.swing.JButton();
        btnPedido.setBackground(new Color(255, 255, 255));
	btnOtroComponente = new javax.swing.JButton();
        btnOtroComponente.setBackground(new Color(255, 255, 255));
        jLabel4 = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        btnPedido = new javax.swing.JButton();
        btnPedido.setBackground(new Color(255, 255, 255));
	

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 50));
        setPreferredSize(new java.awt.Dimension(400, 350));
        setResizable(false);
        setPreferredSize(new Dimension(500,400));


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

        jLabel4.setFont(new Font("Comic Sans MS", Font.PLAIN, 16)); // NOI18N
        jLabel4.setText("total");

        txtCosto.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        btnPedido.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnPedido.setText("registrar pedido");
        btnPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidoActionPerformed(evt);
            }
        });
        
        lblPedidos = new JLabel("pedidos");
        lblPedidos.setHorizontalAlignment(SwingConstants.CENTER);
        lblPedidos.setFont(new Font("Comic Sans MS", Font.PLAIN, 26));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(114)
        					.addComponent(lblPedidos, GroupLayout.PREFERRED_SIZE, 245, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(btnRegresar))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(53)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(jLabel4)
        						.addComponent(jLabel1)
        						.addComponent(jLabel3))
        					.addGap(25)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(txtCosto, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(comboComponentes, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
        							.addGap(20)
        							.addComponent(jLabel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(spinnerCantidad, GroupLayout.PREFERRED_SIZE, 49, Short.MAX_VALUE)
        							.addGap(5))
        						.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        							.addComponent(btnOtroComponente)
        							.addComponent(comboProveedor, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE)
        							.addComponent(btnPedido, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)))
        					.addGap(161)))
        			.addGap(0))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(47)
        			.addComponent(lblPedidos, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(comboProveedor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel3))
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(jLabel1)
        						.addComponent(comboComponentes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jLabel2)))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(18)
        					.addComponent(spinnerCantidad, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)))
        			.addGap(18)
        			.addComponent(btnOtroComponente)
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel4)
        				.addComponent(txtCosto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(btnPedido)
        			.addGap(29)
        			.addComponent(btnRegresar)
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

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
    private JLabel lblPedidos;
    // End of variables declaration//GEN-END:variables
}
