package TP4.EJ2;

public class Sensor {
    private String zonaAfectada;
    private boolean alguien;

    public Sensor(String zonaAfectada) {
        this.zonaAfectada = zonaAfectada;

    }

    public String getZonaAfectada() {
        return zonaAfectada;
    }

    public void setZonaAfectada(String zonaAfectada) {
        this.zonaAfectada = zonaAfectada;
    }

    public boolean isAlguien() {
        return alguien;
    }

    public void setAlguien(boolean alguien) {
        this.alguien = alguien;
    }

}
