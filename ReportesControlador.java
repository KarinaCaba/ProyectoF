package pruebapf;

import java.time.LocalDate;

import javax.swing.table.DefaultTableModel;

public class ReportesControlador 
{
    private LocalDate FechaEntrega;
    private LocalDate FechaFinReporte;
    private LocalDate FechaInicioReporte;
    private LocalDate FechaSolicitud;
    private int FolioReporte;
    private int PiezasTotales;

    public ReportesControlador()
    {

    }

    public void finalize() throws Throwable 
    {

    }
    public DefaultTableModel CrearReporte(int tipo)
    {
    	//1 = inventario 	2 = asistencia 		3 = pedidos
    	DefaultTableModel modelo = new DefaultTableModel();
    	ReportesModelo rM = new ReportesModelo();
    	modelo = rM.CrearReporte(tipo);
    	return modelo;
    }
    public DefaultTableModel EnviarReporte()
    {
    	DefaultTableModel modelo = null;
    	return modelo;
    }
}
