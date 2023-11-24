package pruebapf;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ventanaReportes extends JFrame 
{

	private JPanel contentPane;
	JFrame reg;
	public boolean tipo;
	public ventanaReportes(boolean jefe) 
	{
		setBackground(new Color(255, 255, 255));
		tipo = jefe;
		JButton btnAsistencia = new JButton("asistencia");
		btnAsistencia.setBackground(Color.WHITE);
		setTitle("Reportes");
		setIconImage(Toolkit.getDefaultToolkit().getImage(ventanaReportes.class.getResource("/pruebapf/drakkar.png")));
		// true = jefe			false = trabajador
		if(jefe == true)
			reg = new ventanaJefe();
		else
		{
			reg = new ventanaTrabajador();
			btnAsistencia.setEnabled(false);
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 335);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 239, 213));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Reportes");
		lblNewLabel.setBounds(194, 10, 89, 26);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		contentPane.add(lblNewLabel);
		
		JButton btnRegresar = new JButton("regresar");
		btnRegresar.setBackground(new Color(255, 255, 255));
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				btnRegresarActionPerformed(e);
			}
		});
		btnRegresar.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		btnRegresar.setBounds(10, 262, 100, 26);
		contentPane.add(btnRegresar);
		
		JLabel lblNewLabel_1 = new JLabel("por favor seleccione el tipo de reporte que desea generar");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(70, 53, 357, 26);
		contentPane.add(lblNewLabel_1);
		
		JButton btnInventario = new JButton("inventario");
		btnInventario.setBackground(Color.WHITE);
		btnInventario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				btnInventarioActionPerformed(e);
			}
		});
		btnInventario.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		btnInventario.setBounds(173, 105, 124, 26);
		contentPane.add(btnInventario);
		
		
		btnAsistencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				btnAsistenciaActionPerformed(e);
			}
		});
		btnAsistencia.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		btnAsistencia.setBounds(173, 149, 124, 26);
		contentPane.add(btnAsistencia);
		
		JButton btnPedidos = new JButton("pedidos");
		btnPedidos.setBackground(Color.WHITE);
		btnPedidos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				btnPedidosActionPerformed(e);
			}
		});
		btnPedidos.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		btnPedidos.setBounds(173, 196, 124, 26);
		contentPane.add(btnPedidos);
	}

	 private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) 
	 {
	        reg.setVisible(true);
	        this.dispose();
	 }
	 
	 private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) 
	 {
		 ventanaVisualizarReporte vVR = new ventanaVisualizarReporte(tipo, 1);
		 vVR.setVisible(true);
		 this.dispose();
	 }
	 
	 private void btnAsistenciaActionPerformed(java.awt.event.ActionEvent evt) 
	 {
		 ventanaVisualizarReporte vVR = new ventanaVisualizarReporte(tipo, 2);
		 vVR.setVisible(true);
		 this.dispose();
	 }
	 
	 private void btnPedidosActionPerformed(java.awt.event.ActionEvent evt) 
	 {
		 ventanaVisualizarReporte vVR = new ventanaVisualizarReporte(tipo, 3);
		 vVR.setVisible(true);
		 this.dispose();
	 }
	 
}
