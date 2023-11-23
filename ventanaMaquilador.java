package pruebapf;

import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Toolkit;
import java.awt.Color;

public class ventanaMaquilador extends javax.swing.JFrame 
{
    public ventanaMaquilador() 
    {
    	getContentPane().setBackground(new Color(255, 239, 213));
    	setIconImage(Toolkit.getDefaultToolkit().getImage(ventanaMaquilador.class.getResource("/pruebapf/drakkar.png")));
    	setTitle("DRAKKAR");
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegresar = new javax.swing.JButton();
        btnRegresar.setBackground(new Color(255, 255, 255));
        btnBajaComp = new javax.swing.JButton();
        btnBajaComp.setBackground(new Color(255, 255, 255));
        btnStatusTarjeta = new javax.swing.JButton();
        btnStatusTarjeta.setBackground(new Color(255, 255, 255));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 50));
        setResizable(false);
        setPreferredSize(new Dimension(500,400));


        btnRegresar.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnRegresar.setText("regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnBajaComp.setFont(new Font("Comic Sans MS", Font.PLAIN, 16)); // NOI18N
        btnBajaComp.setText("descontar componente(s)");
        btnBajaComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaCompActionPerformed(evt);
            }
        });

        btnStatusTarjeta.setFont(new Font("Comic Sans MS", Font.PLAIN, 16)); // NOI18N
        btnStatusTarjeta.setText("cambiar status tarjeta");
        btnStatusTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatusTarjetaActionPerformed(evt);
            }
        });
        
        lblMenuMaquilador = new JLabel("menu maquilador");
        lblMenuMaquilador.setHorizontalAlignment(SwingConstants.CENTER);
        lblMenuMaquilador.setFont(new Font("Comic Sans MS", Font.PLAIN, 26));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(btnRegresar))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(119)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        							.addComponent(btnBajaComp, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(btnStatusTarjeta, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE))
        						.addComponent(lblMenuMaquilador, GroupLayout.PREFERRED_SIZE, 245, GroupLayout.PREFERRED_SIZE))))
        			.addContainerGap(121, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(54)
        			.addComponent(lblMenuMaquilador, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
        			.addGap(61)
        			.addComponent(btnBajaComp, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(btnStatusTarjeta, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
        			.addComponent(btnRegresar)
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

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
    private JLabel lblMenuMaquilador;
    // End of variables declaration//GEN-END:variables
}
