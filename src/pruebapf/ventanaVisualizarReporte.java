package pruebapf;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Shape;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

import com.lowagie.text.Document;
import com.lowagie.text.PageSize;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.Toolkit;

public class ventanaVisualizarReporte extends JFrame {

	private JPanel contentPane;
	public JTable tabla;
	public boolean tipo;

	/**
	 * Create the frame.
	 */
	public ventanaVisualizarReporte(boolean jefe, int clase) {
		setTitle("Reportes");
		setIconImage(Toolkit.getDefaultToolkit().getImage(ventanaVisualizarReporte.class.getResource("/pruebapf/drakkar.png")));
		tipo = jefe;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 329);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 239, 213));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnRegresar = new JButton("regresar");
		btnRegresar.setBackground(new Color(255, 255, 255));
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				btnRegresarActionPerformed(e);
			}
		});
		btnRegresar.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		btnRegresar.setBounds(21, 255, 85, 27);
		contentPane.add(btnRegresar);
		
		JLabel lblNewLabel = new JLabel("Visualizar reporte");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		lblNewLabel.setBounds(164, 20, 154, 27);
		contentPane.add(lblNewLabel);
		
		DefaultTableModel modelo = new DefaultTableModel();
		ReportesControlador rC = new ReportesControlador();
		modelo = rC.CrearReporte(clase);
		
		tabla = new JTable(modelo);
		tabla.setFillsViewportHeight(true);
		tabla.setForeground(new Color(0, 0, 0));
		tabla.setRowSelectionAllowed(false);
		tabla.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		tabla.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		tabla.setBounds(97, 216, 312, -136);
		tabla.setVisible(true);
		JScrollPane sp = new JScrollPane(tabla);
		sp.setSize(332, 180);
		sp.setLocation(80, 60);
		contentPane.add(sp);
		
		JButton btnExportar = new JButton("exportar a pdf");
		btnExportar.setBackground(new Color(255, 255, 255));
		btnExportar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				btnExportarActionPerformed(e);
			}
		});
		btnExportar.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		btnExportar.setBounds(318, 259, 128, 21);
		contentPane.add(btnExportar);
		
	}
	
	private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) 
	 {
		Document document = new Document(PageSize.A4.rotate());
		try
		{
			LocalDate fechita = LocalDate.now();
			PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(fechita + ".pdf"));

		    document.open();
		    PdfContentByte cb = writer.getDirectContent();

		    cb.saveState();
		    Graphics2D g2 = cb.createGraphicsShapes(500, 500);

		    Shape oldClip = g2.getClip();
		    g2.clipRect(0, 0, 500, 500);

		    tabla.print(g2);
		    g2.setClip(oldClip);

		    g2.dispose();
		    cb.restoreState();
		    
		    JOptionPane.showMessageDialog(null, "reporte generado");
		} catch (Exception e) {
		      System.err.println(e.getMessage());
	    }
	    document.close();

	 }
	
	 private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) 
	 {
		 ventanaReportes vR = new ventanaReportes(tipo);
	     vR.setVisible(true);
	     this.dispose();
	 }
}
