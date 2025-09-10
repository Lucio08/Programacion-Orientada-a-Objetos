package TP2.EJ1;

public class Episodio {
    private String titulo;
    private String descripcion;
    private boolean flag;
    private int valoracion;

    // Constructor -> principal
    public Episodio(String titulo, String descripcion, boolean flag, int valoracion) {
        setTitulo(titulo);
        setDescripcion(descripcion);
        setFlag(flag);
        if (valoracion >= 0 && valoracion <= 5) {
            if (flag) {
                setValoracion(valoracion);
            } else {
                setValoracion(-1);
            }
        } else {
            this.calificacionInvalida();
        }

    }

    public String toString() {
        return " titulo: " + titulo + "\n descripcion: " + descripcion + "\n visto: " + flag + "\n calificacion: "
                + valoracion;

    }

    public void calificacionInvalida() {
        System.out.println("La calificacion es incorrecta");
    }

    public void setValoracion(int valoracion) {
        if (flag) {
            this.valoracion = valoracion;
        } else {
            this.valoracion = -1;
        }

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
