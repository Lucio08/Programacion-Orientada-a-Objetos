package TP2.EJ2;

public class main {
    public static void main(String[] args) {
        // creo los objetos que no tienen relacion con los demas, y despues a los que si
        // cuando agrego algo les paso por parametro lo que ya cree
        // CREO LOS USUARIOS
        Usuario u1 = new Usuario("2281593861", "lucio@gmaiñ.com");
        Usuario u2 = new Usuario("87654321", "usuario2@mail.com");
        Usuario u3 = new Usuario("11223344", "usuario3@mail.com");

        Reunion r1 = new Reunion("Proyecto Java", "Sala 1", 60);
        r1.agregarUsuario(u1);
        r1.agregarUsuario(u2);

        Reunion r2 = new Reunion("Reunión Marketing", "Sala 2", 30);
        r2.agregarUsuario(u2);
        r2.agregarUsuario(u3);

        Agenda agenda = new Agenda();
        agenda.agregarReunion(r1);
        agenda.agregarReunion(r2);

        // creo los objetos que no tienen relacion con los demas, y despues a los que si
        // cuando agrego algo les paso por parametro lo que ya cree

        for (Reunion r : agenda.getReuniones()) {
            System.out.println("Tema: " + r.getTema());
            System.out.println("Lugar: " + r.getLugar());
            System.out.println("Duración: " + r.getDuracion() + " min");
            System.out.println("Participantes:");
            for (Usuario u : r.getUsuarios()) {
                System.out.println(" - " + u); // usa el toString() de Usuario
            }
            System.out.println("----------------------------");
        }
    }

}
