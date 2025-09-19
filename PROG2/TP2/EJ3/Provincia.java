package TP2.EJ3;

import java.util.ArrayList;

public class Provincia {
    private ArrayList<Ciudad> ciudades;

    public Provincia() {
        this.ciudades = new ArrayList<>();
    }

    public boolean ciudadesEnDeficit() {
        int cantCiudades = 0;
        for (Ciudad ciudad : ciudades) {
            if (ciudad.estaEnDeficit()) {
                cantCiudades++;
            }
        }
        return cantCiudades > (ciudades.size() / 2);
    }

    public ArrayList<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(ArrayList<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    // Provincia.java
    @Override
    public String toString() {
        return "Provincia{" +
                "ciudades=" + ciudades +
                ", más de la mitad en déficit=" + ciudadesEnDeficit() +
                '}';
    }

}
