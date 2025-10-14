package TP4.EJ6;

import java.util.ArrayList;

public class Jerarquico extends Empleado {
    private ArrayList<Empleado> empleados;

    public Jerarquico(String cargo, String nombre, String apellido, int edad, int numeroLegajo, double sueldo,
            ArrayList<Empleado> empleados) {
        super(cargo, nombre, apellido, edad, numeroLegajo, sueldo);
        this.empleados = empleados;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        String textoEmpleados = "";
        for (Empleado e : empleados) {
            textoEmpleados += "\n   - " + e.getNombre() + " " + e.getApellido();
        }

        return super.toString() + "\nEmpleados a cargo:" + textoEmpleados + "\n";
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

}
