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

    public void AgregarTarjeta()
    {
    	ConexionBDD c = new ConexionBDD();
    	conexion = c.Conectar();
    	boolean siono = false;
    	
    	
    	
    	siono = c.CerrarConexion(conexion);
    	
    }
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

    
    public JComboBox llenaTatjetas(JComboBox combito)
    {
    	iM = new InventarioModelo();
    	iM.llenaProveedor(combito);
    	return combito;
    }

    
    public boolean AltaPieza(String nombre, String especificacion, int numero, int clave)
    {
    	boolean siono = false;
    	iM = new InventarioModelo();
    	siono = iM.AltaPieza(nombre, especificacion, numero, clave);
    	return siono;
    }
	
    public void AltaTarjeta()
    {

    }
	
    public void CambiarEstatusTrjeta(String statusNuevo)
    {

    }
	
    public boolean QuitarPieza(String componente, int cantidad)
    {
    	boolean siono = false;
    	String especificacion;
    	String[] aux = componente.split(",");
    	especificacion = aux[1];
    	System.out.println(aux + " " + especificacion);
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
