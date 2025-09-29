import java.util.ArrayList;

public class Consultora {
    private ArrayList<Encuesta> encuestas;

    public Consultora() {
        this.encuestas = new ArrayList<>();
    }

    public void agregarEncuesta(Encuesta e) {
        encuestas.add(e);
    }

    public void listarEncuestas() {
        for (Encuesta e : encuestas) {
            e.mostrarEncuesta();
            System.out.println("----------------------");
        }
    }

    public int encuestasPorEmpleado(Empleado emp) {
        return emp.getCantEncuestas();
    }
}
