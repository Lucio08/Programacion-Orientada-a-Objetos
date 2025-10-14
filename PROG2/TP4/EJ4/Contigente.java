package TP4.EJ4;

import java.time.LocalDate;

public class Contigente {
    private String nombre, apellido;
    private int numeroPasaporte;
    private LocalDate fechaNac;
    protected String estado;

    public Contigente(String nombre, String apellido, int numeroPasaporte, LocalDate fechaNac, String estado) {
        if (estado.equalsIgnoreCase("viajando") || estado.equalsIgnoreCase("en pais de origen")
                || estado.equalsIgnoreCase("en concentracion")) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.numeroPasaporte = numeroPasaporte;
            this.fechaNac = fechaNac;
            this.estado = estado;
        }
    }

    public boolean estaDisponible() {
        return estado.equalsIgnoreCase("en país de origen");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumeroPasaporte() {
        return numeroPasaporte;
    }

    public void setNumeroPasaporte(int numeroPasaporte) {
        this.numeroPasaporte = numeroPasaporte;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
