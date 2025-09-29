package TP3.EJ2;

public class Mueble {
    private double peso;
    private double costoFabricacion;
    private double precioVenta;
    private String tipoMadera;
    private String color;

    public Mueble(double peso, double costoFabricacion, double precioVenta, String tipoMadera, String color) {
        this.setPeso(peso);
        this.setCostoFabricacion(costoFabricacion);
        this.setPrecioVenta(precioVenta);
        this.setTipoMadera(tipoMadera);
        this.setColor(color);
    }

    public double calcularPrecioVenta() {
        return getPrecioVenta() + 1.35;
    }

    // getters and setters
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getCostoFabricacion() {
        return costoFabricacion;
    }

    public void setCostoFabricacion(double costoFabricacion) {
        this.costoFabricacion = costoFabricacion;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getTipoMadera() {
        return tipoMadera;
    }

    public void setTipoMadera(String tipoMadera) {
        this.tipoMadera = tipoMadera;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
