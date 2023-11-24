package pruebapf;

import java.time.LocalDateTime;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PersonaModelo 
{
    private Persona[] ListadoPersonas;
    public Persona m_Persona;
    public ConexionBDD m_ConeccionBDD;
    public Trabajador m_Trabajador;
    public Maquilador m_Maquilador;
    public Connection conexion;

    public int cveTrab;
    public int cveMaq;
    
    public PersonaModelo()
    {

    }
	
    public void finalize() throws Throwable 
    {

    }
	
    public boolean BuscaTrabajador(int clave, String puesto)
    {
    	boolean existe = false;
    	ConexionBDD c = ConexionBDD.Conectar();
    	
    	ResultSet buscar = null;
		Statement statement = null;
		
		try 
		{
			statement = c.con.createStatement();
			buscar = statement.executeQuery("SELECT * FROM " + puesto +" WHERE NUMTRABAJADOR = " + clave);
			if(buscar.next() == true)
			{
				return true;
			}
			else
				existe = false;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return existe;
    }
    
    public boolean AltaTrabajador(String Nombre, String ApellidoP, String ApellidoM, String Direccion, int NumTrabajador, String puesto)
    {
    	boolean alta = false;
    	ConexionBDD c = ConexionBDD.Conectar();
    	int aux, id;
		PreparedStatement statement;
		id = this.regresaUltimoId(puesto) + 1;
		try 
		{
			statement = c.con.prepareStatement("INSERT INTO " + puesto + "(CVE_" + puesto + ", NOMBRE, APELLIDOP, APELLIDOM, DIRECCION, NUMTRABAJADOR, PUESTO, ENTRADA, SALIDA) VALUES (?,?,?,?,?,?,?,0,0)");
			
			statement.setInt(1, id);
			statement.setString(2, Nombre);
			statement.setString(3, ApellidoP);
			statement.setString(4, ApellidoM);
			statement.setString(5, Direccion);
			statement.setInt(6, NumTrabajador);
			statement.setString(7, puesto);
			
			aux = statement.executeUpdate();
			
			if(aux != 0)
			{
				alta = true;
			}
			else
				alta = false;
			
			//c.CerrarConexion(c.con);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return alta;
    }
	
    public boolean BajaTrabajador(int NumTrabajador)
    {
    	return false;
    }
	
    public boolean ChecarEntrada(int clave)
    {
    	boolean existe = false, entrada = false;
    	ConexionBDD c = ConexionBDD.Conectar();
    	ResultSet buscar = null, buscar2 = null, buscar3 = null, buscar4 = null, buscar5 = null, buscar6 = null;
		Statement statement;
		try 
		{
			statement = c.con.createStatement();
			buscar = statement.executeQuery("SELECT * FROM MAQUILADOR WHERE NUMTRABAJADOR = " + clave);
			if(buscar.next() == true)
			{
				existe = true;
				buscar3 = statement.executeQuery("UPDATE MAQUILADOR SET ENTRADA = 1 WHERE NUMTRABAJADOR = " + clave);
				buscar5 = statement.executeQuery("UPDATE MAQUILADOR SET SALIDA = 0 WHERE NUMTRABAJADOR = " + clave);
				entrada = true;
			}
			else
				existe = false;
			if(existe == false)
			{
				buscar2 = statement.executeQuery("SELECT * FROM TRABAJADOR WHERE NUMTRABAJADOR = " + clave);
				if(buscar2.next() == true)
				{
					existe = true;
					buscar4 = statement.executeQuery("UPDATE TRABAJADOR SET ENTRADA = 1 WHERE NUMTRABAJADOR = " + clave);
					buscar6 = statement.executeQuery("UPDATE TRABAJADOR SET SALIDA = 0 WHERE NUMTRABAJADOR = " + clave);
					entrada = true;
				}
				else
					return false;
			}
			//c.CerrarConexion(c.con);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return entrada;
    }
	
    public boolean ChecarSalida(int clave)
    {
    	boolean existe = false, entrada = false;
    	ConexionBDD c = ConexionBDD.Conectar();
    	ResultSet buscar = null, buscar2 = null, buscar3 = null, buscar4 = null, buscar5 = null, buscar6 = null;
		Statement statement;
		try 
		{
			statement = c.con.createStatement();
			buscar = statement.executeQuery("SELECT * FROM MAQUILADOR WHERE NUMTRABAJADOR = " + clave);
			if(buscar.next() == true)
			{
				existe = true;
				buscar3 = statement.executeQuery("UPDATE MAQUILADOR SET SALIDA = 1 WHERE NUMTRABAJADOR = " + clave);
				buscar5 = statement.executeQuery("UPDATE MAQUILADOR SET ENTRADA = 0 WHERE NUMTRABAJADOR = " + clave);
				entrada = true;
			}
			else
				existe = false;
			if(existe == false)
			{
				buscar2 = statement.executeQuery("SELECT * FROM TRABAJADOR WHERE NUMTRABAJADOR = " + clave);
				if(buscar2.next() == true)
				{
					existe = true;
					buscar4 = statement.executeQuery("UPDATE TRABAJADOR SET SALIDA = 1 WHERE NUMTRABAJADOR = " + clave);
					buscar6 = statement.executeQuery("UPDATE TRABAJADOR SET ENTRADA = 0 WHERE NUMTRABAJADOR = " + clave);
					entrada = true;
				}
				else
					return false;
			}
			//c.CerrarConexion(c.con);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return entrada;
    }
	
    public boolean ModificarTrabajador()
    {
	return false;
    }

    public int regresaUltimoId(String puesto)
    {
    	int aux = 0;
    	ConexionBDD c = ConexionBDD.Conectar();
    	ResultSet buscar = null;
		PreparedStatement statement;
		try 
		{
			if(puesto == "TRABAJADOR")
			{
				statement = c.con.prepareStatement("SELECT * FROM TRABAJADOR ORDER BY CVE_TRABAJADOR DESC");
				buscar = statement.executeQuery();
				if(buscar.next())
				{
					aux = Integer.parseInt(buscar.getString("CVE_TRABAJADOR"));
				}
				System.out.println(aux);
				this.cveTrab = aux + 1;
				//statement.close();
				//buscar.close();
				//c.CerrarConexion(c.con);
			}
			if(puesto == "MAQUILADOR")
			{
				statement = c.con.prepareStatement("SELECT * FROM MAQUILADOR ORDER BY CVE_MAQUILADOR DESC");
				buscar = statement.executeQuery();
				if(buscar.next())
				{
					aux = Integer.parseInt(buscar.getString("CVE_MAQUILADOR"));
				}
				System.out.println(aux);
				this.cveTrab = aux + 1;
				//statement.close();
				//buscar.close();
				//c.CerrarConexion(c.con);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return aux;
    }
}
