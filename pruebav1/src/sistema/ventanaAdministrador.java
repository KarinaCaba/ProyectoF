package pruebapf;
public class ventanaAdministrador extends javax.swing.JFrame 
{
    public ventanaAdministrador() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegresar = new javax.swing.JButton();
        btnAltaUsuario = new javax.swing.JButton();
        btnAltaComponentes = new javax.swing.JButton();

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
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnRegresar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(btnAltaUsuario)
                        .addGap(55, 55, 55)
                        .addComponent(btnAltaComponentes)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAltaUsuario)
                    .addComponent(btnAltaComponentes))
                .addGap(70, 70, 70)
                .addComponent(btnRegresar)
                .addGap(25, 25, 25))
        );

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
