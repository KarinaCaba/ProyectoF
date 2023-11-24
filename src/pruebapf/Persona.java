package pruebapf;
public abstract class Persona 
{
    private String ApellidoM;
    private String ApellidoP;
    private String Direccion;
    private String Nombre;
    private int NumTrabajador;
    private String Puesto;

    public Persona()
    {
        
    }
    
    public void finalize() throws Throwable 
    {

    }
    public String getApellidoM() {
        return ApellidoM;
    }
    public void setApellidoM(String ApellidoM) {
        this.ApellidoM = ApellidoM;
    }
    public String getApellidoP() {
        return ApellidoP;
    }
    public void setApellidoP(String ApellidoP) {
        this.ApellidoP = ApellidoP;
    }
    public String getDireccion() {
        return Direccion;
    }
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public int getNumTrabajador() {
        return NumTrabajador;
    }
    public void setNumTrabajador(int NumTrabajador) {
        this.NumTrabajador = NumTrabajador;
    }
    public String getPuesto() {
        return Puesto;
    }
    public void setPuesto(String Puesto) {
        this.Puesto = Puesto;
    }      
    public boolean SetPersona()
    {
	return false;
    }
}