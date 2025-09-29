public class Pregunta {
    private String enunciado;
    private String respuesta;

    public Pregunta(String enunciado) {
        this.enunciado = enunciado;
        this.respuesta = "";
    }

    public void responder(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public String getRespuesta() {
        return respuesta;
    }
}