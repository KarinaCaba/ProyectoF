package pruebapf;

import java.time.LocalDateTime;

public class Maquilador extends Persona
{
    private LocalDateTime entrada;
    private LocalDateTime salida;

    public Maquilador()
    {

    }

    public LocalDateTime getEntrada() {
        return entrada;
    }

    public void setEntrada(LocalDateTime entrada) {
        this.entrada = entrada;
    }

    public LocalDateTime getSalida() {
        return salida;
    }

    public void setSalida(LocalDateTime salida) {
        this.salida = salida;
    }
    
    
}
