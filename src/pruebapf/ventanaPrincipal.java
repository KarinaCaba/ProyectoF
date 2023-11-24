package pruebapf;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;

import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.SwingConstants;
import java.awt.Canvas;
import java.awt.Color;

public class ventanaPrincipal extends javax.swing.JFrame 
{
    public ventanaPrincipal() 
    {
    	getContentPane().setBackground(new Color(255, 239, 213));
    	setIconImage(Toolkit.getDefaultToolkit().getImage(ventanaPrincipal.class.getResource("/pruebapf/drakkar.png")));
        initComponents();
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new javax.swing.JButton();
        login.setBackground(Color.WHITE);
        btnChecar = new javax.swing.JButton();
        btnChecar.setBackground(Color.WHITE);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DRAKKAR");
        setLocation(new java.awt.Point(400, 50));
        setResizable(false);
        setPreferredSize(new Dimension(500,400));
        

        login.setFont(new Font("Comic Sans MS", Font.PLAIN, 16)); // NOI18N
        login.setText("log in");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        btnChecar.setFont(new Font("Comic Sans MS", Font.PLAIN, 16)); // NOI18N
        btnChecar.setText("checar entrada/salida");
        btnChecar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChecarActionPerformed(evt);
            }
        });
        
        JLabel lblInventarioDrakkar = new JLabel();
        lblInventarioDrakkar.setHorizontalAlignment(SwingConstants.CENTER);
        lblInventarioDrakkar.setText("inventario drakkar");
        lblInventarioDrakkar.setFont(new Font("Comic Sans MS", Font.PLAIN, 26));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(93)
        			.addComponent(lblInventarioDrakkar, GroupLayout.PREFERRED_SIZE, 291, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(102, Short.MAX_VALUE))
        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        			.addGap(26)
        			.addComponent(login, GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
        			.addGap(34)
        			.addComponent(btnChecar, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
        			.addGap(26))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(100)
        			.addComponent(lblInventarioDrakkar, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
        			.addGap(111)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(login, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(btnChecar, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
        			.addGap(84))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        ventanaLogin vLogin = new ventanaLogin();
        vLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loginActionPerformed

    private void btnChecarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChecarActionPerformed
        ventanaChequeo checar = new ventanaChequeo();
        checar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnChecarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChecar;
    private javax.swing.JButton login;
    // End of variables declaration//GEN-END:variables
}
