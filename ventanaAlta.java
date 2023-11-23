package pruebapf;
	
import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Toolkit;

public class ventanaAlta extends javax.swing.JFrame 
{
    public ventanaAlta() 
    {
    	setIconImage(Toolkit.getDefaultToolkit().getImage(ventanaAlta.class.getResource("/pruebapf/drakkar.png")));
    	getContentPane().setBackground(new Color(255, 239, 213));
        initComponents();
    }
    
    public String[]datos(String datos)
    {
        String[] informacion = new String[0];
        if(datos.equalsIgnoreCase("Estado de México"))
        {
            informacion = new String[8];
            informacion[0] = "Atlacomulco";
            informacion[1] = "Ecatepec";
            informacion[2] = "Naucalpan";
            informacion[3] = "Nezahualcóyotl";
            informacion[4] = "Toluca";
            informacion[5] = "Valle de Bravo";
            informacion[6] = "Tianguistenco";
            informacion[7] = "Tejupilco";
        }
        if(datos.equalsIgnoreCase("Ciudad de México"))
        {
            informacion = new String[16];
            informacion[0] = "Álvaro Obregón";
            informacion[1] = "Azcapotzalco";
            informacion[2] = "Benito Juárez";
            informacion[3] = "Coyoacán";
            informacion[4] = "Cuajimalpa de Morelos";
            informacion[5] = "Cuauhtémoc";
            informacion[6] = "Gustavo A. Madero";
            informacion[7] = "Iztacalco";
            informacion[8] = "Iztapalapa";
            informacion[9] = "La Magdalena Contreras";
            informacion[10] = "Miguel Hidalgo";
            informacion[11] = "Milpa Alta";
            informacion[12] = "Tláhuac";
            informacion[13] = "Tlalpan";
            informacion[14] = "Venustiano Carranza";
            informacion[15] = "Xochimilco";
        }
        return informacion;
    }
    
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        grupoTipoEmpleado = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtApp = new javax.swing.JTextField();
        txtApm = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel1.setBackground(new Color(255, 239, 213));
        jLabel4 = new javax.swing.JLabel();
        btnMaquilador = new javax.swing.JRadioButton();
        btnMaquilador.setBackground(new Color(255, 239, 213));
        btnTrabajador = new javax.swing.JRadioButton();
        btnTrabajador.setBackground(new Color(255, 239, 213));
        btnRegresar = new javax.swing.JButton();
        btnRegresar.setBackground(new Color(255, 255, 255));
        jLabel5 = new javax.swing.JLabel();
        txtCalle = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        comboDelegacion = new javax.swing.JComboBox<>();
        comboEstado = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        btnAlta = new javax.swing.JButton();
        btnAlta.setBackground(new Color(255, 255, 255));

        
        grupoTipoEmpleado.add(btnMaquilador);
        grupoTipoEmpleado.add(btnTrabajador);;

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alta Empleado");
        setLocation(new java.awt.Point(400, 50));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel1.setText("nombre");

        txtNombre.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel2.setText("apellido paterno");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel3.setText("apellido materno");

        txtApp.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        txtApm.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel4.setText("tipo de empleado");

        btnMaquilador.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnMaquilador.setText("maquilador");

        btnTrabajador.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnTrabajador.setText("trabajador");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTrabajador)
                    .addComponent(btnMaquilador))
                .addGap(28, 28, 28)

                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(btnMaquilador))
                        .addGap(18, 18, 18)
                        .addComponent(btnTrabajador))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        ))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnRegresar.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnRegresar.setText("regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel5.setText("calle");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel6.setText("numero");

        txtNumero.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel7.setText("delegación/alcaldía");

        comboDelegacion.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N

        comboEstado.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        comboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccione alguno", "Estado de México", "Ciudad de México" }));
        comboEstado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboEstadoItemStateChanged(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel8.setText("estado");

        btnAlta.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnAlta.setText("alta");
        btnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtApp, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(53, 53, 53)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtApm, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel6)
                                .addGap(33, 33, 33)
                                .addComponent(txtNumero))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(jLabel8)))
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(comboEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboDelegacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAlta)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtApp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(comboDelegacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar)
                    .addComponent(btnAlta))
                .addContainerGap())
        );

        pack();
    }



    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        ventanaAdministrador reg = new ventanaAdministrador();
        reg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed


    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt) 
    {
    	PersonaControlador pC = new PersonaControlador();
    	String puesto = null, nom = null, apP = null, apM = null, dir = null;
    	int numEmpleado;
    	boolean existe = true;
    	boolean auxAlta = false;
    	
    	puesto = grupoTipoEmpleado.getSelection().toString();
    	nom = txtNombre.getText();
    	apP = txtApp.getText();
    	apM = txtApm.getText();
    	dir = txtCalle.getText() + ", " + txtNumero.getText() + ", " + comboDelegacion.getSelectedItem().toString() + ", " + comboEstado.getSelectedItem().toString();
    	do
        {
            numEmpleado = (int)(Math.random()*998 + 100);
            if(btnTrabajador.isSelected() == true)
            {
            	puesto = "TRABAJADOR";
            	existe = pC.BuscaTrabajador(numEmpleado, puesto);
            }
            if(btnMaquilador.isSelected() == true)
            {
            	puesto = "MAQUILADOR";
            	existe = pC.BuscaTrabajador(numEmpleado, puesto);
            }
         }while(existe == true);
            
         if(existe == false)
         {
            auxAlta = pC.AltaTrabajador(nom, apP, apM, dir, numEmpleado, puesto);
            
            if(auxAlta != true)
            {
            	JOptionPane.showMessageDialog(null, "hubo un problema al dar de alta al usuario");
            }
            else
            	JOptionPane.showMessageDialog(null, "trabajador con clave " + numEmpleado + " dado de alta");
            
            txtNombre.setText(" ");
            txtApp.setText(" ");
            txtApm.setText(" ");
            txtCalle.setText(" ");
            txtNumero.setText(" ");
            comboEstado.setSelectedIndex(0);
            comboDelegacion.removeAllItems();
         } 
    }

    private void comboEstadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboEstadoItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED)
        {
            if(this.comboEstado.getSelectedIndex() > 0)
            {
                this.comboDelegacion.setModel(new DefaultComboBoxModel (this.datos(this.comboEstado.getSelectedItem().toString())));
            }
        }
    }

    private javax.swing.JButton btnAlta;
    private javax.swing.JRadioButton btnMaquilador;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JRadioButton btnTrabajador;
    private javax.swing.JComboBox<String> comboDelegacion;
    private javax.swing.JComboBox<String> comboEstado;
    private javax.swing.ButtonGroup grupoTipoEmpleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApm;
    private javax.swing.JTextField txtApp;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
