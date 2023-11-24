package pruebapf;
public class Tarjetas 
{
    private int cantidad;
    private String Estatus;
    private String NombreTarjeta;
    private Componentes[ ] Piezas;
    public TarjetasModelo m_TarjetasModelo;

    public Tarjetas()
    {

    }

    public void finalize() throws Throwable 
    {

    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getEstatus() {
        return Estatus;
    }

    public void setEstatus(String Estatus) {
        this.Estatus = Estatus;
    }

    public String getNombreTarjeta() {
        return NombreTarjeta;
    }

    public void setNombreTarjeta(String NombreTarjeta) {
        this.NombreTarjeta = NombreTarjeta;
    }

    public Componentes[] getPiezas() {
        return Piezas;
    }

    public void setPiezas(Componentes[] Piezas) {
        this.Piezas = Piezas;
    }

    public TarjetasModelo getM_TarjetasModelo() {
        return m_TarjetasModelo;
    }

    public void setM_TarjetasModelo(TarjetasModelo m_TarjetasModelo) {
        this.m_TarjetasModelo = m_TarjetasModelo;
    }
    
    
}
