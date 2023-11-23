package pruebapf;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

import javax.swing.table.DefaultTableModel;

public class ReportesModelo 
{
    private Reportes[ ] ListadoReportes;
    public ReportesControlador m_ReportesControlador;
    public ConexionBDD m_ConeccionBDD;

    public ReportesModelo()
    {

    }

    public void finalize() throws Throwable 
    {

    }
	
    public DefaultTableModel CrearReporte(int tipo)
    {
    	boolean siono = false;
    	DefaultTableModel modelo = null;
    	
		if(tipo == 1)
		{
			String[] columnas = {"nombre", "descripcion", "cantidad"};
			modelo = EnviarReporte(columnas, tipo);
		}
		else
		{
			if(tipo == 2)
			{
				String[] columnas = {"clave", "nombre", "a. paterno", "puesto", "entrada", "salida"};
				modelo = EnviarReporte(columnas, tipo);
			}
			else
			{
				String[] columnas = {"fecha de pedido", "costo"};
				modelo = EnviarReporte(columnas, tipo);
			}	
		}
    	return modelo;
    }

    public DefaultTableModel EnviarReporte(String[] columnas, int tipo)
    {
    	ConexionBDD c = ConexionBDD.Conectar();
    	ResultSet buscar = null;
		Statement statement;
		String nombre, descripcion, fecha, apellido, puesto;
		int cantidad, costo, clave, entrada, salida;
    	DefaultTableModel modelo = new DefaultTableModel();
		modelo.setColumnIdentifiers(columnas);
		try
		{
			statement = c.con.createStatement();
			if(tipo == 1)
			{
				buscar = statement.executeQuery("SELECT * FROM COMPONENTES");
				while(buscar.next() == true)
				{
					nombre = buscar.getString("NOMBRE");
					descripcion = buscar.getString("ESPECIFICACION");
					cantidad = buscar.getInt("CANTIDAD");
					modelo.addRow(new Object [] {nombre, descripcion, cantidad});
				}
			}
			else
			{
				if(tipo == 3)
				{
					buscar = statement.executeQuery("SELECT * FROM PEDIDO");
					while(buscar.next() == true)
					{
						fecha = buscar.getString("FECHAPEDIDO");
						costo = buscar.getInt("COSTO");
						modelo.addRow(new Object [] {fecha, costo});
					}
				}
				else
				{
					if(tipo == 2)
					{
						buscar = statement.executeQuery("SELECT * FROM TRABAJADOR");
						while(buscar.next() == true)
						{
							nombre = buscar.getString("NOMBRE");
							apellido = buscar.getString("APELLIDOP");
							clave = buscar.getInt("NUMTRABAJADOR");
							puesto = buscar.getString("PUESTO");
							entrada = buscar.getInt("ENTRADA");
							salida = buscar.getInt("SALIDA");
							//String[] columnas = {"clave", "nombre", "a. paterno", "puesto", "entrada", "salida"};
							modelo.addRow(new Object [] {clave, nombre, apellido, puesto, entrada, salida});
						}
						buscar = statement.executeQuery("SELECT * FROM MAQUILADOR");
						while(buscar.next() == true)
						{
							nombre = buscar.getString("NOMBRE");
							apellido = buscar.getString("APELLIDOP");
							clave = buscar.getInt("NUMTRABAJADOR");
							puesto = buscar.getString("PUESTO");
							entrada = buscar.getInt("ENTRADA");
							salida = buscar.getInt("SALIDA");
							//String[] columnas = {"clave", "nombre", "a. paterno", "puesto", "entrada", "salida"};
							modelo.addRow(new Object [] {clave, nombre, apellido, puesto, entrada, salida});
						}
					}
				}
			}
			
		} catch (SQLException evt) {
			
			evt.printStackTrace();
		}
    	return modelo;
    }
}
