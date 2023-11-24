package pruebapf;

import java.awt.Dimension;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ventanaTrabajador extends javax.swing.JFrame 
{
    public ventanaTrabajador() 
    {
    	getContentPane().setBackground(new Color(255, 239, 213));
    	setIconImage(Toolkit.getDefaultToolkit().getImage(ventanaTrabajador.class.getResource("/pruebapf/drakkar.png")));
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegresar = new javax.swing.JButton();
        btnRegresar.setBackground(new Color(255, 255, 255));
        btnPedido = new javax.swing.JButton();
        btnPedido.setBackground(new Color(255, 255, 255));
        btnAgregarComponentes = new javax.swing.JButton();
        btnAgregarComponentes.setBackground(new Color(255, 255, 255));
        btnAltaTarjeta = new javax.swing.JButton();
        btnAltaTarjeta.setBackground(new Color(255, 255, 255));
        btnBajaComponentes = new javax.swing.JButton();
        btnBajaComponentes.setBackground(new Color(255, 255, 255));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DRAKKAR");
        setLocation(new java.awt.Point(400, 50));
        setPreferredSize(new Dimension(500,400));

        btnRegresar.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnRegresar.setText("regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnPedido.setFont(new Font("Comic Sans MS", Font.PLAIN, 16)); // NOI18N
        btnPedido.setText("realizar pedido");
        btnPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidoActionPerformed(evt);
            }
        });

        btnAgregarComponentes.setFont(new Font("Comic Sans MS", Font.PLAIN, 16)); // NOI18N
        btnAgregarComponentes.setText("agregar componentes");
        btnAgregarComponentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarComponentesActionPerformed(evt);
            }
        });

        btnAltaTarjeta.setFont(new Font("Comic Sans MS", Font.PLAIN, 16)); // NOI18N
        btnAltaTarjeta.setText("dar de alta tarjeta");
        btnAltaTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaTarjetaActionPerformed(evt);
            }
        });

        btnBajaComponentes.setFont(new Font("Comic Sans MS", Font.PLAIN, 16)); // NOI18N
        btnBajaComponentes.setText("descontar componentes");
        btnBajaComponentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaComponentesActionPerformed(evt);
            }
        });
        
        lblMenuTrabajador = new JLabel("menu trabajador");
        lblMenuTrabajador.setHorizontalAlignment(SwingConstants.CENTER);
        lblMenuTrabajador.setFont(new Font("Comic Sans MS", Font.PLAIN, 26));
        
        btnReportes = new JButton("generar reporte");
        btnReportes.setBackground(new Color(255, 255, 255));
        btnReportes.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent evt) {
        		btnReportesActionPerformed(evt);
        	}
        });
        btnReportes.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(btnRegresar)
        			.addContainerGap(395, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(125, Short.MAX_VALUE)
        			.addComponent(lblMenuTrabajador, GroupLayout.PREFERRED_SIZE, 245, GroupLayout.PREFERRED_SIZE)
        			.addGap(116))
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addContainerGap(142, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(btnReportes, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        					.addComponent(btnAltaTarjeta, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addComponent(btnAgregarComponentes, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addComponent(btnPedido, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addComponent(btnBajaComponentes, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        			.addGap(139))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(41)
        			.addComponent(lblMenuTrabajador, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(btnPedido)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(btnAgregarComponentes)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(btnAltaTarjeta)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(btnBajaComponentes)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(btnReportes, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
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

    private void btnBajaComponentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaComponentesActionPerformed
        ventanaDescontarComponentes vDc = new ventanaDescontarComponentes(false);
        vDc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBajaComponentesActionPerformed

    private void btnPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidoActionPerformed
        ventanaPedidos vP = new ventanaPedidos();
        vP.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPedidoActionPerformed

    private void btnAgregarComponentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarComponentesActionPerformed
        ventanaAgregaComponentes vAc = new ventanaAgregaComponentes();
        vAc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAgregarComponentesActionPerformed

    private void btnAltaTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaTarjetaActionPerformed
        ventanaAltaTarjeta vAt = new ventanaAltaTarjeta();
        vAt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAltaTarjetaActionPerformed
    
    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {
        ventanaReportes vR = new ventanaReportes(false);
        vR.setVisible(true);
        this.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarComponentes;
    private javax.swing.JButton btnAltaTarjeta;
    private javax.swing.JButton btnBajaComponentes;
    private javax.swing.JButton btnPedido;
    private javax.swing.JButton btnRegresar;
    private JLabel lblMenuTrabajador;
    private JButton btnReportes;
    // End of variables declaration//GEN-END:variables
}
