package pruebapf;

import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;

public class ventanaAgregaComponentes extends javax.swing.JFrame implements ItemListener
{
	
	String comp;
    public ventanaAgregaComponentes() 
    {
    	setIconImage(Toolkit.getDefaultToolkit().getImage(ventanaAgregaComponentes.class.getResource("/pruebapf/drakkar.png")));
    	getContentPane().setBackground(new Color(255, 239, 213));
        initComponents();
        InventarioControlador inv = new InventarioControlador();
    	comboComponente =  inv.llenaComponentes(comboComponente);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegresar = new javax.swing.JButton();
        btnRegresar.setBackground(new Color(255, 255, 255));
        jLabel1 = new javax.swing.JLabel();
        comboComponente = new javax.swing.JComboBox<String>();
        jLabel2 = new javax.swing.JLabel();
        jLabel2.setHorizontalAlignment(SwingConstants.RIGHT);
        spinnerCantidad = new javax.swing.JSpinner();
        btnAgregarComponentes = new javax.swing.JButton();
        btnAgregarComponentes.setBackground(new Color(255, 255, 255));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("agregar componentes");
        setLocation(new java.awt.Point(400, 50));
        setResizable(true);
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

        comboComponente.setFont(new java.awt.Font("Comic Sans MS", 0, 12));
        comboComponente.addItemListener(this);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel2.setText("cantidad");

        spinnerCantidad.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        spinnerCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100000, 1));

        btnAgregarComponentes.setFont(new Font("Comic Sans MS", Font.PLAIN, 16)); // NOI18N
        btnAgregarComponentes.setText("agregar al inventario");
        btnAgregarComponentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarComponentesActionPerformed(evt);
            }
        });
        
        JLabel lblNewLabel = new JLabel("agregar componente");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 26));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(btnRegresar)
        			.addContainerGap(393, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(150)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(jLabel2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(jLabel1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(spinnerCantidad, GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
        				.addComponent(comboComponente, 0, 109, Short.MAX_VALUE))
        			.addGap(145))
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(124, Short.MAX_VALUE)
        			.addComponent(lblNewLabel)
        			.addGap(115))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(158)
        			.addComponent(btnAgregarComponentes, GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
        			.addGap(137))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(54)
        			.addComponent(lblNewLabel)
        			.addGap(36)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1)
        				.addComponent(comboComponente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(32)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2)
        				.addComponent(spinnerCantidad, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(51)
        			.addComponent(btnAgregarComponentes)
        			.addContainerGap(70, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(323, Short.MAX_VALUE)
        			.addComponent(btnRegresar)
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) 
    {
    	
        ventanaTrabajador vT = new ventanaTrabajador();
        vT.setVisible(true);
        this.dispose();
        
    }

    private void btnAgregarComponentesActionPerformed(java.awt.event.ActionEvent evt) 
    {//GEN-FIRST:event_btnAgregarComponentesActionPerformed
    	
    	boolean siono;
    	InventarioControlador iC = new InventarioControlador();
    	System.out.println(comboComponente.getItemAt(comboComponente.getSelectedIndex()));
    	siono = iC.agregarPieza(comboComponente.getItemAt(comboComponente.getSelectedIndex()), Integer.parseInt(spinnerCantidad.getValue().toString()));
    	if(siono == true)
    		JOptionPane.showMessageDialog(null, "componentes agregados el inventario");
    	else
    		JOptionPane.showMessageDialog(null, "error al agregar componentes");
        comboComponente.setSelectedIndex(0);
        spinnerCantidad.setValue(1);
        
    }//GEN-LAST:event_btnAgregarComponentesActionPerformed


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarComponentes;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> comboComponente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSpinner spinnerCantidad;
    // End of variables declaration//GEN-END:variables
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}
}
