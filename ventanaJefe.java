package pruebapf;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import java.awt.Dimension;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
public class ventanaJefe extends javax.swing.JFrame 

{
	
    public ventanaJefe() 
    {
    	getContentPane().setBackground(new Color(255, 239, 213));
    	setIconImage(Toolkit.getDefaultToolkit().getImage(ventanaJefe.class.getResource("/pruebapf/drakkar.png")));
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    	
    	

        jLabel1 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnRegresar.setBackground(new Color(255, 255, 255));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DRAKKAR");
        setLocation(new java.awt.Point(400, 50));
        setPreferredSize(new Dimension(500, 325));


        jLabel1.setFont(new Font("Comic Sans MS", Font.PLAIN, 26)); // NOI18N
        jLabel1.setText("Jefe");

        btnRegresar.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnRegresar.setText("regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
 
        
        
        JButton btnReporteInventario = new JButton("generar reporte");
        btnReporteInventario.setBackground(new Color(255, 255, 255));
        btnReporteInventario.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent evt) {
        		btnReporteInventarioActionPerformed(evt);
        	}
        });
        
        
        
        btnReporteInventario.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(213)
        					.addComponent(jLabel1))
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(btnRegresar))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(142)
        					.addComponent(btnReporteInventario, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(151, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(25)
        			.addComponent(jLabel1)
        			.addGap(67)
        			.addComponent(btnReporteInventario, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
        			.addGap(94)
        			.addComponent(btnRegresar)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        ventanaLogin reg = new ventanaLogin();
        reg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnReporteInventarioActionPerformed(java.awt.event.ActionEvent evt)
    {
    	ventanaReportes vR = new ventanaReportes(true);
    	vR.setVisible(true);
    	this.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
}
