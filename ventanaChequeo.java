package pruebapf;

import java.awt.Dimension;

import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class ventanaChequeo extends javax.swing.JFrame 
{
    public ventanaChequeo() 
    {
    	setIconImage(Toolkit.getDefaultToolkit().getImage(ventanaChequeo.class.getResource("/pruebapf/drakkar.png")));
    	getContentPane().setBackground(new Color(255, 239, 213));
    	getContentPane().setForeground(Color.WHITE);
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegresar = new javax.swing.JButton();
        btnRegresar.setBackground(new Color(255, 255, 255));
        jLabel1 = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();
        btnEntrada = new javax.swing.JButton();
        btnEntrada.setBackground(new Color(255, 255, 255));
        btnSalida = new javax.swing.JButton();
        btnSalida.setBackground(new Color(255, 255, 255));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("checador");
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
        jLabel1.setText("clave empleado");

        txtClave.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        btnEntrada.setFont(new Font("Comic Sans MS", Font.PLAIN, 16)); // NOI18N
        btnEntrada.setText("entrada");
        btnEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradaActionPerformed(evt);
            }
        });

        btnSalida.setFont(new Font("Comic Sans MS", Font.PLAIN, 16)); // NOI18N
        btnSalida.setText("salida");
        btnSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalidaActionPerformed(evt);
            }
        });
        
        lblCheeacador = new JLabel("checador");
        lblCheeacador.setHorizontalAlignment(SwingConstants.CENTER);
        lblCheeacador.setFont(new Font("Comic Sans MS", Font.PLAIN, 26));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(113, Short.MAX_VALUE)
        			.addComponent(lblCheeacador, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE)
        			.addGap(86))
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(btnRegresar)
        			.addContainerGap(395, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(126, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(jLabel1)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(txtClave, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(btnEntrada)
        					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addComponent(btnSalida, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)))
        			.addGap(95))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(45)
        			.addComponent(lblCheeacador, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
        			.addGap(53)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1)
        				.addComponent(txtClave, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(38)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnSalida)
        				.addComponent(btnEntrada))
        			.addGap(53)
        			.addComponent(btnRegresar)
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

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
    private JLabel lblCheeacador;
    // End of variables declaration//GEN-END:variables
}
