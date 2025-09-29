package TP3.EJ2;

import java.util.ArrayList;

public class Fabrica {
    ArrayList<Mueble> stock;

    public void agregarMueble(Mueble mueble) {
        stock.add(mueble);
    }

    public double costoTotalfabricacion() {
        double total = 0;
        for (Mueble mueble : stock) {
            total += mueble.getCostoFabricacion();
        }
        return total;
    }

    public double precioTotalDeVenta() {
        double total = 0;
        for (Mueble mueble : stock) {
            total += mueble.getPrecioVenta();
        }
        return total;
    }

    public ArrayList<Mueble> getStock() {
        return stock;
    }

    public void setStock(ArrayList<Mueble> stock) {
        this.stock = stock;
    }

}