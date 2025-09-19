package TP2.EJ1;

public class Episodio {
    private String titulo;
    private String descripcion;
    private boolean flag;
    private int valoracion;

    // Constructor -> principal
    // Constructor corregido: delega la validación a ingresarCalificacion
    public Episodio(String titulo, String descripcion, boolean flag, int valoracion) {
        setTitulo(titulo);
        setDescripcion(descripcion);
        // Inicializo con "no visto" por defecto
        this.flag = false;
        this.valoracion = -1;

        // Intento aplicar la calificacion recibida (la validacion está en el metodo)
        // Prioridad: la calificacion determina si está visto o no
        ingresarCalificacion(valoracion);
    }

    // Método público para ingresar la calificación en cualquier momento
    public void ingresarCalificacion(int nota) {
        if (nota >= 0 && nota <= 5) {
            this.valoracion = nota;
            this.flag = true; // si tiene nota, está visto
        } else if (nota == -1) {
            this.valoracion = -1;
            this.flag = false; // -1 significa no visto
        } else {
            System.out.println("Calificación inválida: debe ser -1 o entre 0 y 5.");
            // No modificamos ni valoracion ni flag (se mantiene el valor anterior)
        }
    }

    // Opcional: mantener setValoracion privado para no permitir saltarse la
    // validacion
    private void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    public String toString() {
        return " titulo: " + titulo + "\n descripcion: " + descripcion + "\n visto: " + flag + "\n calificacion: "
                + valoracion;

    }

    public void calificacionInvalida() {
        System.out.println("La calificacion es incorrecta");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getValoracion() {
        return valoracion;
    }

}
