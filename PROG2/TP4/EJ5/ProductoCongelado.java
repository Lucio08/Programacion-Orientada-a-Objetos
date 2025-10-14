package TP4.EJ5;

import java.time.LocalDate;

public class ProductoCongelado extends ProductoAvicolas {
    private LocalDate fechaDeEmbase;
    private int codigo;
    private String granja;
    private double tempMantenimiento;

    public ProductoCongelado(String nombre, int lote, LocalDate fechaVenc, LocalDate fechaDeEmbase, int codigo,
            String granja,
            double tempMantenimiento) {
        super(nombre, lote, fechaVenc);
        this.fechaDeEmbase = fechaDeEmbase;
        this.codigo = codigo;
        this.granja = granja;
        this.tempMantenimiento = tempMantenimiento;
    }

    public LocalDate getFechaDeEmbase() {
        return fechaDeEmbase;
    }

    public void setFechaDeEmbase(LocalDate fechaDeEmbase) {
        this.fechaDeEmbase = fechaDeEmbase;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getGranja() {
        return granja;
    }

    public void setGranja(String granja) {
        this.granja = granja;
    }

    public double getTempMantenimiento() {
        return tempMantenimiento;
    }

    public void setTempMantenimiento(double tempMantenimiento) {
        this.tempMantenimiento = tempMantenimiento;
    }

}
