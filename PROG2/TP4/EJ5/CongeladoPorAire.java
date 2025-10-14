package TP4.EJ5;

import java.time.LocalDate;

public class CongeladoPorAire extends ProductoCongelado {
    private double nitrogeno, oxigeno, dioxido, vaporAgua;

    public CongeladoPorAire(String nombre, int lote, LocalDate fechaVenc, LocalDate fechaDeEmbase, int codigo,
            String granja,
            double tempMantenimiento, double nitrogeno, double oxigeno, double dioxido, double vaporAgua) {
        super(nombre, lote, fechaVenc, fechaDeEmbase, codigo, granja, tempMantenimiento);
        this.nitrogeno = nitrogeno;
        this.oxigeno = oxigeno;
        this.dioxido = dioxido;
        this.vaporAgua = vaporAgua;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " nitrogeno " + getNitrogeno() + " oxigeno " + getOxigeno() + " dioxido "
                + getDioxido() + " vapor de agua " + getVaporAgua();
    }

    public double getNitrogeno() {
        return nitrogeno;
    }

    public void setNitrogeno(double nitrogeno) {
        this.nitrogeno = nitrogeno;
    }

    public double getOxigeno() {
        return oxigeno;
    }

    public void setOxigeno(double oxigeno) {
        this.oxigeno = oxigeno;
    }

    public double getDioxido() {
        return dioxido;
    }

    public void setDioxido(double dioxido) {
        this.dioxido = dioxido;
    }

    public double getVaporAgua() {
        return vaporAgua;
    }

    public void setVaporAgua(double vaporAgua) {
        this.vaporAgua = vaporAgua;
    }

}
