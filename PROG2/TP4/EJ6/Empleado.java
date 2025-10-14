package TP4.EJ6;

public class Empleado extends Asociado {
    protected int numeroLegajo;
    private double sueldo;

    public Empleado(String cargo, String nombre, String apellido, int edad, int numeroLegajo, double sueldo) {
        super(cargo, nombre, apellido, edad);
        this.numeroLegajo = numeroLegajo;
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado [numeroLegajo=" + numeroLegajo + ", sueldo=" + sueldo + "]";
    }

    public int getNumeroLegajo() {
        return numeroLegajo;
    }

    public void setNumeroLegajo(int numeroLegajo) {
        this.numeroLegajo = numeroLegajo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

}
