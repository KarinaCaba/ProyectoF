package pruebapf;


import javax.swing.JOptionPane;

public class PersonaControlador 
{
    public PersonaModelo pM;
	
    public PersonaControlador()
    {

    }
	
    public void finalize() throws Throwable 
    {

    }
	
    public boolean BuscaTrabajador(int clave, String puesto)
    {
    	boolean existe = false;
    	pM = new PersonaModelo();
    		
    	if(pM.BuscaTrabajador(clave, puesto) == false)
    	{
    		existe = false;
    	}
    	else
    	{
    		existe = true;
    	}
    	return existe;
    }
    
    
    public boolean AltaTrabajador(String Nombre, String ApellidoP, String ApellidoM, String Direccion, int NumTrabajador, String Puesto)
    {
    	boolean alta = false;
    	boolean aux = false;
    	pM = new PersonaModelo();
    	aux = pM.BuscaTrabajador(NumTrabajador, Puesto);
    	if(aux == true)
    	{
    		return false;
    	}
    	alta = pM.AltaTrabajador(Nombre, ApellidoP, ApellidoM, Direccion, NumTrabajador, Puesto);
    	return alta;
    }
	
    public boolean AsignarPermisos()
    {
    	return false;
    }
	
    public boolean BajaTrabajador()
    {
        return false;
    }
	
    public boolean ChecarEntrada(int clave)
    {
    	boolean aux = false;
    	pM = new PersonaModelo();
    	aux = pM.ChecarEntrada(clave);
    	return aux;
    }
	
    public boolean ChecarSalida(int clave)
    {
    	boolean aux = false;
    	pM = new PersonaModelo();
    	aux = pM.ChecarSalida(clave);
    	return aux;
    }
	
    public boolean ModificarTrabajador()
    {
    	return false;
    }
    
}
