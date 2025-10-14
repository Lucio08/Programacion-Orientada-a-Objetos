package TP4.EJ5;

import java.time.LocalDate;

public class ProductoAvicolas {
    private String nombre;
    private int lote;
    private LocalDate fechaVenc;

    public ProductoAvicolas(String Nombre, int lote, LocalDate fechaVenc) {
        this.lote = lote;
        this.fechaVenc = fechaVenc;
    }

    @Override
    public String toString() {
        return "Nombre producto : " + getNombre() + "\n" +
                "Fecha de vencimiento: " + getFechaVenc() + "\n" +
                "Numero de Lote: " + getLote() + "\n";
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public LocalDate getFechaVenc() {
        return fechaVenc;
    }

    public void setFechaVenc(LocalDate fechaVenc) {
        this.fechaVenc = fechaVenc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
