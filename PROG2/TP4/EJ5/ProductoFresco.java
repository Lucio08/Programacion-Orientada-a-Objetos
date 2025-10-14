package TP4.EJ5;

import java.time.LocalDate;

public class ProductoFresco extends ProductoAvicolas {
    private String origenGranja;
    private LocalDate fechaEnbase;

    public ProductoFresco(String nombre, int lote, LocalDate fechaVenc, String origenGranja, LocalDate fechaEnbase) {
        super(nombre, lote, fechaVenc);
        this.origenGranja = origenGranja;
        this.fechaEnbase = fechaEnbase;
    }

    public LocalDate getFechaEnbase() {
        return fechaEnbase;
    }

    public void setFechaEnbase(LocalDate fechaEnbase) {
        this.fechaEnbase = fechaEnbase;
    }

    public String getOrigenGranja() {
        return origenGranja;
    }

    public void setOrigenGranja(String origenGranja) {
        this.origenGranja = origenGranja;
    }

}
