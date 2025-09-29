public class Empleado extends Persona {
    private int cantEncuestas;

    public Empleado(int dni, String nombre) {
        super(nombre, dni);
        this.cantEncuestas = 0;
    }

    public void incrementarEncuestas() {
        cantEncuestas++;
    }

    public int getCantEncuestas() {
        return cantEncuestas;
    }
}
