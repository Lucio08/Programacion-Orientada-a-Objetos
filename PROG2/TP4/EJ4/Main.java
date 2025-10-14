package TP4.EJ4;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Crear la selección (contiene todos los integrantes)
        Seleccion seleccion = new Seleccion();

        // Crear futbolistas
        Futbolista f1 = new Futbolista(
                "Lionel", "Messi", 123456, LocalDate.of(1987, 6, 24),
                "En país de origen", "Delantero", "Izquierdo", 850);

        Futbolista f2 = new Futbolista(
                "Emiliano", "Martínez", 654321, LocalDate.of(1992, 9, 2),
                "En concentración", "Arquero", "Derecho", 0);

        // Crear entrenador
        Entrenador e1 = new Entrenador(
                "Lionel", "Scaloni", 112233, LocalDate.of(1978, 5, 16),
                "Viajando", 123);

        // Crear masajista
        Masajista m1 = new Masajista(
                "Carlos", "Gómez", 334455, LocalDate.of(1980, 3, 20),
                "En país de origen", "Kinesiología Deportiva", 10);

        // Agregar integrantes a la selección
        seleccion.agregarIntegrante(f1);
        seleccion.agregarIntegrante(f2);
        seleccion.agregarIntegrante(e1);
        seleccion.agregarIntegrante(m1);

        // Mostrar disponibilidad
        System.out.println(f1.getNombre() + " está " + f1.estaDisponible());
        System.out.println(f2.getNombre() + " está " + f2.estaDisponible());
        System.out.println(e1.getNombre() + " está " + e1.estaDisponible());
        System.out.println(m1.getNombre() + " está " + m1.estaDisponible());

        // Mostrar todos los integrantes de la selección
        System.out.println("\n--- INTEGRANTES DE LA SELECCIÓN ---");
        for (Contigente integrante : seleccion.getIntegrantes()) {
            System.out.println(integrante);
        }
    }
}
