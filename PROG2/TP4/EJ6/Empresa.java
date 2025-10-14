package TP4.EJ6;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Asociado> asociados;

    public Empresa() {
        this.asociados = new ArrayList<>();
    }

    public void agregarAsociado(Asociado a) {
        asociados.add(a);
    }

    public void mostrarData() {
        for (Asociado asociado : asociados) {
            System.out.println(asociado);
        }
    }

    public ArrayList<Asociado> getAsociados() {
        return asociados;
    }

    public void setAsociados(ArrayList<Asociado> asociados) {
        this.asociados = asociados;
    }

}
