import java.time.LocalDate;

public class Turno {
    private Cancha cancha;
    private LocalDate fecha;
    private int horas;
    private Usuario usuario;

    public Turno(Usuario usuario, Cancha cancha, LocalDate fecha, int horas) {
        this.usuario = usuario;
        this.cancha = cancha;
        this.fecha = fecha;
        this.horas = horas;
        usuario.agregarTurno(this); // El usuario guarda el turno en su historial
    }

    public double calcularCosto() {
        double costo = cancha.getPrecioHora() * horas;
        if (usuario.isSocio()) {
            costo *= 0.9; // descuento del 10%
        }
        return costo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "Turno de " + usuario.getNombre() + " en " + cancha +
                " el " + fecha + " por " + horas + " horas. Costo: $" + calcularCosto();
    }
}
