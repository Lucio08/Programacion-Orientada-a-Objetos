package TP4.EJ3;

public class EmpleadoPorHora extends Empleado {
    public int horasExtra;
    public double extraPorHora;

    public EmpleadoPorHora(String nombre, double sueldo, int horasExtra, double extraPorHora) {
        super(nombre, sueldo);
        this.horasExtra = horasExtra;
        this.extraPorHora = extraPorHora;
    }

    public double calcularSueldos() {
        return super.getSueldo() + (getExtraPorHora() * getHorasExtra());
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public double getExtraPorHora() {
        return extraPorHora;
    }

    public void setExtraPorHora(double extraPorHora) {
        this.extraPorHora = extraPorHora;
    }

}
