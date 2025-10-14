package TP4.EJ6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Crear empresa
        Empresa empresa = new Empresa();

        // Crear empleados comunes
        Empleado e1 = new Empleado("Empleado", "Juan", "Pérez", 30, 1001, 250000);
        Empleado e2 = new Empleado("Empleado", "Lucía", "Gómez", 28, 1002, 270000);
        Empleado e3 = new Empleado("Empleado", "Martín", "Rodríguez", 35, 1003, 290000);

        // Crear usuarios finales
        UsuarioFinal u1 = new UsuarioFinal("Usuario", "Carla", "Torres", 26, "carlaT", "1234");
        UsuarioFinal u2 = new UsuarioFinal("Usuario", "Julián", "Morales", 32, "julianM", "abcd");

        // Crear jerárquico con empleados a cargo
        ArrayList<Empleado> empleadosACargo = new ArrayList<>();
        empleadosACargo.add(e1);
        empleadosACargo.add(e2);

        Jerarquico j1 = new Jerarquico("Jerárquico", "Laura", "Fernández", 40, 2001, 500000, empleadosACargo);

        // Registrar todos los asociados en la empresa
        empresa.agregarAsociado(e1);
        empresa.agregarAsociado(e2);
        empresa.agregarAsociado(e3);
        empresa.agregarAsociado(u1);
        empresa.agregarAsociado(u2);
        empresa.agregarAsociado(j1);

        // Mostrar datos
        System.out.println("=== REGISTRO DE ASOCIADOS ===");
        empresa.mostrarData();
    }
}