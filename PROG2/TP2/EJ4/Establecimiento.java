import java.time.LocalDate;
import java.util.ArrayList;

public class Establecimiento {
    private ArrayList<Cancha> canchas;
    private ArrayList<Turno> turnos;
    private ArrayList<Usuario> usuarios;

    public Establecimiento() {
        this.canchas = new ArrayList<>();
        this.turnos = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void agregarCancha(Cancha c) {
        canchas.add(c);
    }

    public void registrarUsuario(Usuario u) {
        usuarios.add(u);
    }

    public void registrarTurno(Usuario u, Cancha c, LocalDate fecha, int horas) {
        Turno t = new Turno(u, c, fecha, horas);
        turnos.add(t);
    }

    public void actualizarSocios() {
        for (Usuario u : usuarios) {
            u.esSocio();
        }
    }

    public void listarTurnos() {
        for (Turno t : turnos) {
            System.out.println(t);
        }
    }

    public void listarCanchas() {
        for (Cancha c : canchas) {
            System.out.println(c);
        }
    }

    public void listarSocios() {
        for (Usuario u : usuarios) {
            if (u.isSocio()) {
                System.out.println(u);
            }
        }
    }
}
