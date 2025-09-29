package TP3.EJ3;

import java.util.ArrayList;

public class Juego {
    private String nombre;
    private ArrayList<Personaje> p;

    public Juego(String nombre) {
        this.nombre = nombre;
        this.p = new ArrayList<>();
    }

    public Personaje enfrentar(Personaje s, Personaje v) {
        int i = 0;
        for (Cualidad c1 : s.getCualidades()) {
            Cualidad c2 = v.getCualidades().get(i);
            if (c1.getNivel() > c2.getNivel()) {
                return s;
            } else if (c2.getNivel() > c1.getNivel()) {
                return v;
            }
            i++;
        }
        return null;
    }

    public ArrayList<Personaje> getP() {
        return p;
    }

    public void setP(ArrayList<Personaje> p) {
        this.p = p;
    }

}
