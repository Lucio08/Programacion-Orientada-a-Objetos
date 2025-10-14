
package TP4.EJ3;

public class Main {

    public static void main(String[] args) {
        Empresa empresa1 = new Empresa();

        Empleado e1 = new Empleado("Federico", 200000);
        Empleado e2 = new EmpleadoPorComision("lautaro", 200000, 5000, 1500);
        Empleado e3 = new EmpleadoPorHora("martin", 200000, 5000, 20000);

        empresa1.agregarEmpleado(e1);
        empresa1.agregarEmpleado(e2);
        empresa1.agregarEmpleado(e3);

        empresa1.mostrarSueldos();
    }
}
