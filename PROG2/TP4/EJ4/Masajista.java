package TP4.EJ4;

import java.time.LocalDate;

public class Masajista extends Contigente {
    private String titulo;
    private int aniososExperiencia;

    public Masajista(String nombre, String apellido, int numeroPasaporte, LocalDate fechaNac, String estado,
            String titulo, int aniososExperiencia) {
        super(nombre, apellido, numeroPasaporte, fechaNac, estado);
        this.titulo = titulo;
        this.aniososExperiencia = aniososExperiencia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAniososExperiencia() {
        return aniososExperiencia;
    }

    public void setAniososExperiencia(int aniososExperiencia) {
        this.aniososExperiencia = aniososExperiencia;
    }

}
