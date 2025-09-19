package TP2.EJ2;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Reunion> reuniones;

    public Agenda() {
        this.reuniones = new ArrayList<>();
    }

    public void agregarReunion(Reunion reuniones) {
        this.reuniones.add(reuniones);
    }

    public ArrayList<Reunion> getReuniones() {
        return reuniones;
    }

    public void setReuniones(ArrayList<Reunion> reuniones) {
        this.reuniones = reuniones;
    }

}
