package TP4.EJ3;

import java.util.ArrayList;

public class Empresa {
    /*
     * Constructor Se ejecuta al crear el objeto. Sirve para inicializar listas,
     * valores o estados.
     * Método agregar Se usa después, para añadir objetos dentro de esa lista
     * creada.
     * ArrayList Es la estructura (la “estantería”) donde guardás los objetos.
     */
    private ArrayList<Empleado> empleados;

    public Empresa() {
        this.empleados = new ArrayList<>();
    }

    /*
     * for (Tipo variable : lista) {
     * // usar la variable
     * }
     */

    public void mostrarSueldos() {
        for (Empleado e : empleados) {
            System.out.println(
                    "El empleado " + e.getNombre() + " tiene un sueldo de " + e.calcularSueldos());
        }
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

}
