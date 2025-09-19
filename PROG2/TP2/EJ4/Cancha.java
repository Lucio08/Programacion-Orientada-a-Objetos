public class Cancha {
    private String tipo; // Fútbol / Paddle
    private int numero;
    private double precioHora;

    public Cancha(String tipo, int numero, double precioHora) {
        this.tipo = tipo;
        this.numero = numero;
        this.precioHora = precioHora;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    @Override
    public String toString() {
        return tipo + " " + numero + " ($" + precioHora + " por hora)";
    }
}
