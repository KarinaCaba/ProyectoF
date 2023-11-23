package pruebapf;

import java.sql.Connection;

import javax.swing.JComboBox;

public class InventarioControlador 
{
    public InventarioModelo iM;
    
    public Connection conexion;
    
    
    public InventarioControlador()
    {

    }

    public void finalize() throws Throwable 
    {

    }
	
    public boolean agregarPieza(String componente, int cantidad)
    {
    	boolean siono = false;
    	String especificacion;
    	String[] aux = componente.split(",");
    	especificacion = aux[1];
    	System.out.println(aux + " " + especificacion);
    	iM = new InventarioModelo();
    	siono = iM.AgregarPieza(especificacion ,cantidad);
    	return siono;
    }

    /*public void AgregarTarjeta()
    {
    	ConexionBDD c = new ConexionBDD();
    	conexion = c.Conectar();
    	boolean siono = false;
    	
    	
    	
    	siono = c.CerrarConexion(conexion);
    	
    }*/
    public JComboBox llenaProveedores(JComboBox combito)
    {
    	iM = new InventarioModelo();
    	iM.llenaProveedor(combito);
    	return combito;
    }
    
    public JComboBox llenaComponentes(JComboBox combito)
    {
    	iM = new InventarioModelo();
    	iM.llenaComponente(combito);
    	return combito;
    }

    
    public JComboBox llenaTarjetas(JComboBox combito)
    {
    	iM = new InventarioModelo();
    	iM.llenaTarjeta(combito);
    	return combito;
    }

    
    public boolean AltaPieza(String nombre, String especificacion, int numero, int clave)
    {
    	boolean siono = false;
    	iM = new InventarioModelo();
    	siono = iM.AltaPieza(nombre, especificacion, numero, clave);
    	return siono;
    }
	
    public boolean AltaTarjeta(String nombre, String comp, String cant, int clave)
    {
    	boolean siono = false;
    	iM = new InventarioModelo();
    	siono = iM.AltaTarjeta(nombre, comp, cant, clave);
    	return siono;
    }
	
    public boolean CambiarEstatusTarjeta(String nombre, int cant, String statusNuevo)
    {
    	boolean siono = false;
    	iM = new InventarioModelo();
    	System.out.println(statusNuevo);
    	siono = iM.CambiarStatusTarjeta(nombre, cant, statusNuevo);
    	return siono;
    }
	
    public boolean QuitarPieza(String componente, int cantidad)
    {
    	boolean siono = false;
    	String especificacion;
    	String nombre;
    	String[] aux = componente.split(",");
    	especificacion = aux[1];
    	nombre = aux[0];
    	//System.out.println(aux);
    	System.out.println(nombre + " " + especificacion);
    	iM = new InventarioModelo();
    	siono = iM.QuitarPieza(especificacion ,cantidad);
    	return siono;
    }
	
    public boolean RealizarPedido(String FechaEntrega, int cantidad)
    {
    	boolean siono = false;
    	iM = new InventarioModelo();
    	siono = iM.RealizarPedido(FechaEntrega, cantidad);
    	return siono;
    }
}
