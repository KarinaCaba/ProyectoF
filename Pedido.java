package pruebapf;

import java.time.LocalDate;

public class Pedido 
{
    private Componentes[] componentes;
    private float costo;
    private LocalDate fechaPedido;

    public Pedido()
    {

    }

    public Componentes[] getComponentes() {
        return componentes;
    }

    public void setComponentes(Componentes[] componentes) {
        this.componentes = componentes;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }
}
