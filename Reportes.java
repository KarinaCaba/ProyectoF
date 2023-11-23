package pruebapf;

import java.time.LocalDate;

public class Reportes 
{
    private int Cantidades;
    private LocalDate FechaCreacion;
    private LocalDate FechaFin;
    private LocalDate FechaInicio;
    private Componentes[] Piezas;
    public ReportesModelo m_ReportesModelo;

    public Reportes()
    {

    }

    public int getCantidades() {
        return Cantidades;
    }

    public void setCantidades(int Cantidades) {
        this.Cantidades = Cantidades;
    }

    public LocalDate getFechaCreacion() {
        return FechaCreacion;
    }

    public void setFechaCreacion(LocalDate FechaCreacion) {
        this.FechaCreacion = FechaCreacion;
    }

    public LocalDate getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(LocalDate FechaFin) {
        this.FechaFin = FechaFin;
    }

    public LocalDate getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(LocalDate FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public Componentes[] getPiezas() {
        return Piezas;
    }

    public void setPiezas(Componentes[] Piezas) {
        this.Piezas = Piezas;
    }

    public ReportesModelo getM_ReportesModelo() {
        return m_ReportesModelo;
    }

    public void setM_ReportesModelo(ReportesModelo m_ReportesModelo) {
        this.m_ReportesModelo = m_ReportesModelo;
    }
    
}
