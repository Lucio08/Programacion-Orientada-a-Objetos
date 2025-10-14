package TP4.EJ3;

public class EmpleadoPorComision extends Empleado {
    private double extraVenta;
    private int cantVentas;

    public EmpleadoPorComision(String nombre, double sueldo, double extraVenta, int cantVentas) {
        super(nombre, sueldo);
        this.extraVenta = extraVenta;
        this.cantVentas = cantVentas;
    }

    public double calcularSueldos() {
        return super.getSueldo() + (getCantVentas() * getExtraVenta());
    }

    public double getExtraVenta() {
        return extraVenta;
    }

    public void setExtraVenta(double extraVenta) {
        this.extraVenta = extraVenta;
    }

    public int getCantVentas() {
        return cantVentas;
    }

    public void setCantVentas(int cantVentas) {
        this.cantVentas = cantVentas;
    }

}