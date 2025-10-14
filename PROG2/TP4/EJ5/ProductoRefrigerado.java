package TP4.EJ5;

import java.time.LocalDate;

public class ProductoRefrigerado extends ProductoFresco {
    private int codigo;

    public ProductoRefrigerado(String nombre, int lote, LocalDate fechaVenc, String origenGranja, LocalDate fechaEnbase,
            int codigo) {
        super(nombre, lote, fechaVenc, origenGranja, fechaEnbase);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

}
