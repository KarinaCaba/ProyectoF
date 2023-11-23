package pruebapf;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JOptionPane;

public class ventanaAgregaComponentes extends javax.swing.JFrame implements ItemListener
{
	
	String comp;
    public ventanaAgregaComponentes() 
    {
        initComponents();
        InventarioControlador inv = new InventarioControlador();
    	comboComponente =  inv.llenaComponentes(comboComponente);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        comboComponente = new javax.swing.JComboBox<String>();
        jLabel2 = new javax.swing.JLabel();
        spinnerCantidad = new javax.swing.JSpinner();
        btnAgregarComponentes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("agregar componentes");
        setLocation(new java.awt.Point(400, 50));
        setResizable(true);

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

        btnAgregarComponentes.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnAgregarComponentes.setText("agregar al inventario");
        btnAgregarComponentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarComponentesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(btnRegresar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboComponente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(spinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(53, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregarComponentes)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboComponente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(spinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar)
                    .addComponent(btnAgregarComponentes))
                .addContainerGap())
        );

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
