public class Main {
    public static void main(String[] args) {
        // Crear consultora
        Consultora consultora = new Consultora();

        // Crear empleados y encuestados
        Empleado emp1 = new Empleado(123, "Lucio");
        Encuestado enc1 = new Encuestado(456, "Juan Perez");

        // Crear encuesta
        Encuesta encuesta1 = new Encuesta(enc1, emp1);

        // Agregar preguntas
        Pregunta p1 = new Pregunta("¿Le gusta el producto?");
        p1.responder("Sí, mucho.");
        encuesta1.agregarPregunta(p1);

        Pregunta p2 = new Pregunta("¿Lo volvería a comprar?");
        p2.responder("Sí.");
        encuesta1.agregarPregunta(p2);

        // Guardar encuesta en la consultora
        consultora.agregarEncuesta(encuesta1);

        // Listar encuestas
        consultora.listarEncuestas();

        // Consultar encuestas realizadas por empleado
        System.out.println("Encuestas hechas por " + emp1.getNombre() +
                ": " + consultora.encuestasPorEmpleado(emp1));
    }
}
