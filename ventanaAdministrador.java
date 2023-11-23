package pruebapf;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import java.awt.Toolkit;
public class ventanaAdministrador extends javax.swing.JFrame 
{
    public ventanaAdministrador() {
    	setIconImage(Toolkit.getDefaultToolkit().getImage(ventanaAdministrador.class.getResource("/pruebapf/drakkar.png")));
    	getContentPane().setBackground(new Color(255, 239, 213));
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegresar = new javax.swing.JButton();
        btnRegresar.setBackground(new Color(255, 255, 255));
        btnAltaUsuario = new javax.swing.JButton();
        btnAltaUsuario.setBackground(new Color(255, 255, 255));
        btnAltaComponentes = new javax.swing.JButton();
        btnAltaComponentes.setBackground(new Color(255, 255, 255));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador");
        setLocation(new java.awt.Point(400, 50));
        setMaximumSize(new java.awt.Dimension(400, 350));

        btnRegresar.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnRegresar.setText("regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnAltaUsuario.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnAltaUsuario.setText("alta usuario");
        btnAltaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaUsuarioActionPerformed(evt);
            }
        });

        btnAltaComponentes.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnAltaComponentes.setText("alta componentes");
        btnAltaComponentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaComponentesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(26)
        					.addComponent(btnRegresar))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(63)
        					.addComponent(btnAltaUsuario)
        					.addGap(54)
        					.addComponent(btnAltaComponentes)))
        			.addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(137, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnAltaUsuario)
        				.addComponent(btnAltaComponentes))
        			.addGap(88)
        			.addComponent(btnRegresar)
        			.addGap(25))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {
        ventanaLogin reg = new ventanaLogin();
        reg.setVisible(true);
        this.dispose();
    }

    private void btnAltaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {
        ventanaAlta alt = new ventanaAlta();
        alt.setVisible(true);
        this.dispose();
    }

    private void btnAltaComponentesActionPerformed(java.awt.event.ActionEvent evt) {
        ventanaAltaComponentes vAc = new ventanaAltaComponentes();
        vAc.setVisible(true);
        this.dispose();
    }

    private javax.swing.JButton btnAltaComponentes;
    private javax.swing.JButton btnAltaUsuario;
    private javax.swing.JButton btnRegresar;
}
