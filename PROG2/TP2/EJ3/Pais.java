package TP2.EJ3;

import java.util.ArrayList;

public class Pais {
    private ArrayList<Provincia> provincias;

    public Pais() {
        this.provincias = new ArrayList<>();
    }

    public ArrayList<Provincia> getProvinciasConDeficit() {
        ArrayList<Provincia> provDeficit = new ArrayList<>();
        for (Provincia provincia : provincias) {
            if (provincia.ciudadesEnDeficit()) {
                provDeficit.add(provincia);
            }
        }
        return provDeficit;
    }

    public ArrayList<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(ArrayList<Provincia> provincias) {
        this.provincias = provincias;
    }

}
