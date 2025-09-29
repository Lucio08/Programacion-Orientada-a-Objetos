package TP3.EJ3;

import java.util.ArrayList;

public class Personaje {
    private String nombreReal;
    private String nombreSuperHeroe;

    private ArrayList<Cualidad> cualidades;

    public Personaje(String nombreReal, String nombreSuperHeroe) {
        this.setNombreReal(nombreReal);
        this.setNombreSuperHeroe(nombreSuperHeroe);
        this.cualidades = new ArrayList<>();
    }

    public void agregarCualidad(Cualidad cualidad) {
        this.cualidades.add(cualidad);
    }

    public String getNombreReal() {
        return nombreReal;
    }

    public void setNombreReal(String nombreReal) {
        this.nombreReal = nombreReal;
    }

    public String getNombreSuperHeroe() {
        return nombreSuperHeroe;
    }

    public void setNombreSuperHeroe(String nombreSuperHeroe) {
        this.nombreSuperHeroe = nombreSuperHeroe;
    }

    public ArrayList<Cualidad> getCualidades() {
        return cualidades;
    }

    public void setCualidades(ArrayList<Cualidad> cualidades) {
        this.cualidades = cualidades;
    }

}
