package pruebapf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public  class ConexionBDD 
{
    private static ConexionBDD ConexionBDD = null;
    String dbURL;
	String username;
	String password;
	public Connection con;

	private ConexionBDD()
	{
		dbURL = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "ce501";
		String password = "123";
		Connection aux = null;
		try 
		{
			Connection connection = DriverManager.getConnection(dbURL, username, password);
			con = connection;
			System.out.println("si se conecto");
		} 
		catch (SQLException e) 
		{
			System.out.println("ERROR");
			e.printStackTrace();
		}
	}

	public static synchronized ConexionBDD Conectar()
	{
		if(ConexionBDD == null)
		{
			ConexionBDD = new ConexionBDD();
		}
		return ConexionBDD;
	}
	
	public boolean CerrarConexion(Connection con)
	{
		boolean siono = false;
		try {
			con.close();
			siono = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return siono;
	}
	
	public void finalize() throws Throwable {

	}
}
