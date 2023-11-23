package pruebapf;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JComboBox;

public class InventarioModelo 
{
    private Inventario inventario;
    public ConexionBDD m_ConeccionBDD;
    public Componentes m_Componentes;
    public Tarjetas m_Tarjetas;
    public Pedido m_Pedido;
    public Connection conexion;

    public InventarioModelo()
    {

    }

    public void finalize() throws Throwable 
    {

    }
	
    public boolean AgregarPieza( String especificacion, int cant)
    {
    	boolean siono = false;
    	int aux = 0;
    	ConexionBDD c = ConexionBDD.Conectar();
    	ResultSet buscar = null, agregar = null;
    	Statement statement;
    	
    	try
    	{
    		statement = c.con.createStatement();
    		buscar = statement.executeQuery("SELECT * FROM COMPONENTES WHERE ESPECIFICACION = '" + especificacion + "'");
    		
    		if(buscar.next() == true)
    		{
    			aux = buscar.getInt("CANTIDAD");
    			aux = aux + cant;
    			agregar = statement.executeQuery("UPDATE COMPONENTES SET CANTIDAD = " + aux + " WHERE ESPECIFICACION = '"+ especificacion + "'");
    			siono = true;
    		}
    		else
    			siono = false;
    		
    		c.CerrarConexion(c.con);
    		statement.close();
    		buscar.close();
    	}catch (SQLException e) 
    	{
			
			e.printStackTrace();
		}
    	return siono;
    }
    
    public void AgregarTarjeta()
    {

    }
	
    public boolean AltaPieza(String nombre, String especificacion, int numero, int clave)
    {
    	boolean alta = false;
    	ConexionBDD c = ConexionBDD.Conectar();
    	int aux, id;
		PreparedStatement statement;
		try 
		{
			statement = c.con.prepareStatement("INSERT INTO COMPONENTES(NOMBRE, ESPECIFICACION, CVEPIEZA, CANTIDAD) VALUES (?,?,?,0)");
			
			statement.setString(1, nombre);
			statement.setString(2, especificacion);
			statement.setInt(3, clave);
			
			aux = statement.executeUpdate();
			
			if(aux != 0)
			{
				alta = true;
			}
			else
				alta = false;
			
			c.CerrarConexion(c.con);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return alta;
    }
	
    public void AltaTarjeta()
    {

    }
	
    public boolean QuitarPieza(String especificacion, int cant)
    {
    	boolean siono = false;
    	int aux = 0;
    	ConexionBDD c = ConexionBDD.Conectar();
    	ResultSet buscar = null, eliminar = null;
    	Statement statement;
    	
    	try
    	{
    		statement = c.con.createStatement();
    		buscar = statement.executeQuery("SELECT * FROM COMPONENTES WHERE ESPECIFICACION = '" + especificacion + "'");
    		
    		if(buscar.next() == true)
    		{
    			aux = buscar.getInt("CANTIDAD");
    			aux = aux - cant;
    			eliminar = statement.executeQuery("UPDATE COMPONENTES SET CANTIDAD = " + aux + " WHERE ESPECIFICACION = '"+ especificacion + "'");
    			siono = true;
    		}
    		else
    			siono = false;
    		
    		c.CerrarConexion(c.con);
    	}catch (SQLException e) 
    	{
			
			e.printStackTrace();
		}
    	return siono;
    }
	
    public boolean RealizarPedido(String FechaEntrega, int cantidad)
    {
    	boolean alta = false;
    	ConexionBDD c = ConexionBDD.Conectar();
    	int aux;
		PreparedStatement statement;
		try 
		{
			statement = c.con.prepareStatement("INSERT INTO PEDIDO(FECHAPEDIDO, COSTO) VALUES (?,?)");
			
			statement.setString(1, FechaEntrega);
			statement.setInt(2, cantidad);
			
			aux = statement.executeUpdate();
			
			if(aux != 0)
			{
				alta = true;
			}
			else
				alta = false;
			
			c.CerrarConexion(c.con);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return alta;
    }
    
    public JComboBox llenaProveedor(JComboBox combito)
    {
    	ConexionBDD c = ConexionBDD.Conectar();
    	ResultSet buscar = null;
		PreparedStatement statement;
		
		try {
			statement = c.con.prepareStatement("SELECT NOMBRE FROM PROVEEDORES ORDER BY CVE_PROVEEDORES DESC");
			buscar = statement.executeQuery();
			while(buscar.next())
			{
				combito.addItem(buscar.getString("Nombre"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    	return combito;
    }
    
    public JComboBox llenaComponente(JComboBox combito)
    {
    	ConexionBDD c = ConexionBDD.Conectar();
    	ResultSet buscar;
		Statement statement;
		String aux; 
		
		try {
			statement = c.con.createStatement();
			buscar = statement.executeQuery("SELECT NOMBRE, ESPECIFICACION FROM COMPONENTES ORDER BY CVEPIEZA DESC");
			//buscar2 = statement.executeQuery("SELECT ESPECIFICACION FROM COMPONENTES ORDER BY NOMBRE DESC");
			
			while(buscar.next() )
			{ 
				aux = buscar.getString("Nombre") + "," + buscar.getString("Especificacion");
				combito.addItem(aux);
				aux = "";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    	return combito;
    }
    
    public JComboBox llenaTarjeta(JComboBox combito)
    {
    	ConexionBDD c = ConexionBDD.Conectar();
    	ResultSet buscar = null;
		PreparedStatement statement;
		
		try {
			statement = c.con.prepareStatement("SELECT NOMBRE FROM PROVEEDORES ORDER BY CVE_PROVEEDORES DESC");
			buscar = statement.executeQuery();
			while(buscar.next())
			{
				combito.addItem(buscar.getString("Nombre"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    	return combito;
    }
}
