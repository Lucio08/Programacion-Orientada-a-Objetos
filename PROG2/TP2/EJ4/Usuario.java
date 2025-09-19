import java.time.LocalDate;
import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private ArrayList<Turno> turnos; // historial
    private boolean socio;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.turnos = new ArrayList<>();
        this.socio = false;
    }

    public void agregarTurno(Turno t) {
        this.turnos.add(t);
    }

    public boolean esSocio() {
        int contador = 0;
        LocalDate hoy = LocalDate.now();
        LocalDate haceDosMeses = hoy.minusMonths(2);

        for (Turno t : turnos) {
            if (t.getFecha().isAfter(haceDosMeses)) {
                contador++;
            }
        }
        this.socio = (contador >= 4);
        return this.socio;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isSocio() {
        return socio;
    }

    @Override
    public String toString() {
        return nombre + (socio ? " (Socio)" : " (No socio)");
    }
}
