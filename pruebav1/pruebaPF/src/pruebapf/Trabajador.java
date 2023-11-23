package pruebapf;

import java.time.LocalDateTime;

public class Trabajador extends Persona 
{
    private LocalDateTime entrada;
    private LocalDateTime salida;

    public Trabajador(){

    }

    public void finalize() throws Throwable {
    	super.finalize();
    }
}
