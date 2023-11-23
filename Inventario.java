package pruebapf;
public class Inventario 
{
    private Componentes[] Componentes;
	private Proveedores[] Proveedores;
	private Tarjetas[] Tarjetas;
	public InventarioModelo m_InventarioModelo;
	public Proveedores m_Proveedores;
	public Tarjetas m_Tarjetas;
	public Componentes m_Componentes;

	public Inventario()
        {

	}

	public void finalize() throws Throwable 
        {

	}

    public Componentes[] getComponentes() {
        return Componentes;
    }

    public void setComponentes(Componentes[] Componentes) {
        this.Componentes = Componentes;
    }

    public Proveedores[] getProveedores() {
        return Proveedores;
    }

    public void setProveedores(Proveedores[] Proveedores) {
        this.Proveedores = Proveedores;
    }

    public Tarjetas[] getTarjetas() {
        return Tarjetas;
    }

    public void setTarjetas(Tarjetas[] Tarjetas) {
        this.Tarjetas = Tarjetas;
    }

    public InventarioModelo getM_InventarioModelo() {
        return m_InventarioModelo;
    }

    public void setM_InventarioModelo(InventarioModelo m_InventarioModelo) {
        this.m_InventarioModelo = m_InventarioModelo;
    }

    public Proveedores getM_Proveedores() {
        return m_Proveedores;
    }

    public void setM_Proveedores(Proveedores m_Proveedores) {
        this.m_Proveedores = m_Proveedores;
    }

    public Tarjetas getM_Tarjetas() {
        return m_Tarjetas;
    }

    public void setM_Tarjetas(Tarjetas m_Tarjetas) {
        this.m_Tarjetas = m_Tarjetas;
    }

    public Componentes getM_Componentes() {
        return m_Componentes;
    }

    public void setM_Componentes(Componentes m_Componentes) {
        this.m_Componentes = m_Componentes;
    }
	
    
}
