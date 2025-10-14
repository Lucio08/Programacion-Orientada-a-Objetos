package TP4.EJ4;

import java.time.LocalDate;

public class Futbolista extends Contigente {
    private String pos;
    private String perfil;
    private int cantidadGoles;

    public Futbolista(String nombre, String apellido, int numeroPasaporte, LocalDate fechaNac, String estado,
            String pos, String perfil, int cantidadGoles) {
        super(nombre, apellido, numeroPasaporte, fechaNac, estado);
        this.pos = pos;
        this.perfil = perfil;
        this.cantidadGoles = cantidadGoles;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public int getCantidadGoles() {
        return cantidadGoles;
    }

    public void setCantidadGoles(int cantidadGoles) {
        this.cantidadGoles = cantidadGoles;
    }

}
