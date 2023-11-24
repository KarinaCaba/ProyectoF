package pruebapf;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Observable;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

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
    	}catch (SQLException e) 
    	{
			
			e.printStackTrace();
		}
    	return siono;
    }
    
    public void verificarCantidades()
    {
    	ConexionBDD c = ConexionBDD.Conectar();
    	ResultSet buscar = null;
    	Statement statement;
    	int cant;
    	try
    	{
    		statement = c.con.createStatement();
    		buscar = statement.executeQuery("SELECT * FROM COMPONENTES ");
    		
    		while(buscar.next() == true)
    		{
    			cant = buscar.getInt("CANTIDAD");
    			if(cant > 10)
    			{
    				JOptionPane.showMessageDialog(null, "hay componentes con menos de 10 unidades en inventario");
    			}
    		}
    	}catch (SQLException e) 
    	{
			
			e.printStackTrace();
		}
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
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return alta;
    }
	
    public boolean AltaTarjeta(String nombre, String comp, String cant, int clave)
    {
    	boolean siono = false;
    	ConexionBDD c = ConexionBDD.Conectar();
    	int aux, id;
		PreparedStatement statement;
		try 
		{
			statement = c.con.prepareStatement("INSERT INTO TARJETAS(NOMBRETARJETA, COMPONENTES, CANTIDADES, CVE_TARJETAS) VALUES (?,?,?,?)");
			
			statement.setString(1, nombre);
			statement.setString(2, comp);
			statement.setString(3, cant);
			statement.setInt(4, clave);
			
			aux = statement.executeUpdate();
			
			if(aux != 0)
			{
				siono = true;
			}
			else
				siono = false;
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
    	return siono;
    }
    
    public boolean CambiarStatusTarjeta(String nombre, int cant, String statusNuevo)
    {
    	boolean siono = false, band = false;
    	String auxComp, auxCant;
    	int vemos, aux = 0;
    	ConexionBDD c = ConexionBDD.Conectar();
    	ResultSet buscarTarjeta = null, cambiar = null,  buscar = null, eliminar = null;
    	Statement statement;
    	try
    	{
    		statement = c.con.createStatement();
    		buscarTarjeta = statement.executeQuery("SELECT * FROM TARJETAS WHERE NOMBRETARJETA = '" + nombre + "'");
    		statement = c.con.createStatement();
	    	cambiar = statement.executeQuery("UPDATE TARJETAS SET ESTATUS = '" + statusNuevo + "' WHERE NOMBRETARJETA = '"+ nombre + "'");
    		if(buscarTarjeta.next() == true)
    		{
		    	if(statusNuevo == "finaizada")
		    	{
        			statement = c.con.createStatement();
        			
        			auxComp = buscarTarjeta.getString("COMPONENTES");
        			String[] componente = auxComp.split(",");
        			auxCant = buscarTarjeta.getString("CANTIDADES");
        			String[] cantidad = auxCant.split(",");
        			
        			for(int i = 0; i < componente.length; i++)
        			{
        				auxComp = componente[i];
        				statement = c.con.createStatement();
        	    		buscar = statement.executeQuery("SELECT * FROM COMPONENTES WHERE ESPECIFICACION = '" + auxComp + "'");
        	    		
            			
        	    		if(buscar.next() == true)
        	    		{
        	    			aux = buscar.getInt("CANTIDAD");
            	    		vemos = Integer.parseInt(cantidad[i]) * cant;
                			aux = aux - vemos;
        	    			eliminar = statement.executeQuery("UPDATE COMPONENTES SET CANTIDAD = " + aux + " WHERE ESPECIFICACION = '"+ auxComp + "'");
        	    			siono = true;
        	    		}
        	    		else
        	    			siono = false;
        			}
        			siono = true;
        		}
        		else
        			siono = false;
        	}
    		
    	}catch (SQLException e) 
        {
    		e.printStackTrace();
    	}
    	return siono;
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
			
			while(buscar.next() )
			{ 
				aux = buscar.getString("Nombre") + "," + buscar.getString("Especificacion");
				combito.addItem(aux);
				aux = "";
			}
		} catch (SQLException e) {
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
			statement = c.con.prepareStatement("SELECT NOMBRETARJETA FROM TARJETAS ORDER BY CVE_TARJETAS DESC");
			buscar = statement.executeQuery();
			while(buscar.next())
			{
				combito.addItem(buscar.getString("Nombretarjeta"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    	return combito;
    }
}
