import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // 1. Crear el establecimiento
        Establecimiento club = new Establecimiento();

        // 2. Crear y registrar las canchas
        Cancha futbol1 = new Cancha("Futbol", 1, 400);
        Cancha futbol2 = new Cancha("Futbol", 2, 400);
        Cancha paddle1 = new Cancha("Paddle", 1, 100);
        Cancha paddle2 = new Cancha("Paddle", 2, 100);
        Cancha paddle3 = new Cancha("Paddle", 3, 100);
        Cancha paddle4 = new Cancha("Paddle", 4, 100);

        club.agregarCancha(futbol1);
        club.agregarCancha(futbol2);
        club.agregarCancha(paddle1);
        club.agregarCancha(paddle2);
        club.agregarCancha(paddle3);
        club.agregarCancha(paddle4);

        // 3. Crear y registrar usuarios
        Usuario lucio = new Usuario("Lucio");
        Usuario juan = new Usuario("Juan");

        club.registrarUsuario(lucio);
        club.registrarUsuario(juan);

        // 4. Registrar turnos
        club.registrarTurno(lucio, futbol1, LocalDate.now().minusDays(10), 2); // hace 10 días
        club.registrarTurno(lucio, paddle1, LocalDate.now().minusDays(20), 1);
        club.registrarTurno(lucio, paddle2, LocalDate.now().minusDays(30), 1);
        club.registrarTurno(lucio, futbol2, LocalDate.now().minusDays(40), 1); // ya tiene 4 turnos en 2 meses
        club.registrarTurno(juan, paddle3, LocalDate.now().minusDays(5), 1); // Juan solo 1 turno

        // 5. Actualizar estado de socios
        club.actualizarSocios();

        // 6. Mostrar datos
        System.out.println("=== Canchas ===");
        club.listarCanchas();

        System.out.println("\n=== Turnos ===");
        club.listarTurnos();

        System.out.println("\n=== Socios ===");
        club.listarSocios();
    }
}
