import java.util.ArrayList;

public class Encuesta {
    private ArrayList<Pregunta> preguntas;
    private Encuestado encuestado;
    private Empleado empleado;

    public Encuesta(Encuestado encuestado, Empleado empleado) {
        this.encuestado = encuestado;
        this.empleado = empleado;
        this.preguntas = new ArrayList<>();
        empleado.incrementarEncuestas();
    }

    public void agregarPregunta(Pregunta p) {
        preguntas.add(p);
    }

    public ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }

    public Encuestado getEncuestado() {
        return encuestado;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void mostrarEncuesta() {
        System.out.println("Encuesta realizada a: " + encuestado.getNombre());
        for (Pregunta p : preguntas) {
            System.out.println("Pregunta: " + p.getEnunciado() +
                    " | Respuesta: " + p.getRespuesta());
        }
    }
}
