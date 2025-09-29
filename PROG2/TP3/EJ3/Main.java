package TP3.EJ3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear héroe
        SuperHeroe heroe = new SuperHeroe("Peter Parker", "Spider-Man");
        heroe.agregarCualidad(new Cualidad(1, "vision nocturna"));
        heroe.agregarCualidad(new Cualidad(500, "velocidad"));
        heroe.agregarCualidad(new Cualidad(700, "fuerza"));
        heroe.agregarCualidad(new Cualidad(180, "altura"));
        heroe.agregarCualidad(new Cualidad(80, "peso"));
        heroe.agregarCualidad(new Cualidad(30, "edad"));

        // Crear villano
        Villano villano = new Villano("Norman Osborn", "Green Goblin");
        villano.agregarCualidad(new Cualidad(0, "vision nocturna"));
        villano.agregarCualidad(new Cualidad(450, "velocidad"));
        villano.agregarCualidad(new Cualidad(800, "fuerza"));
        villano.agregarCualidad(new Cualidad(185, "altura"));
        villano.agregarCualidad(new Cualidad(90, "peso"));
        villano.agregarCualidad(new Cualidad(35, "edad"));

        // Crear juego
        Juego juego = new Juego("Batalla Épica");

        // Enfrentar héroe vs villano
        Personaje ganador = juego.enfrentar(heroe, villano);

        // Mostrar resultado
        if (ganador != null) {
            System.out.println("Ganador: " + ganador.getNombreSuperHeroe());
        } else {
            System.out.println("Empate entre " + heroe.getNombreSuperHeroe() + " y " + villano.getNombreSuperHeroe());
        }
    }
}