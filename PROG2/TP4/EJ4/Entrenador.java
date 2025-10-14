package TP4.EJ4;

import java.time.LocalDate;

public class Entrenador extends Contigente {
    private int id;

    public Entrenador(String nombre, String apellido, int numeroPasaporte, LocalDate fechaNac, String estado, int id) {
        super(nombre, apellido, numeroPasaporte, fechaNac, estado);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
