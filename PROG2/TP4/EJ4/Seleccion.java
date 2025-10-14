package TP4.EJ4;

import java.util.ArrayList;

public class Seleccion {
    private ArrayList<Contigente> integrantes;

    public ArrayList<Contigente> getIntegrantes() {
        return new ArrayList<>(integrantes);
    }

    public void setIntegrantes(ArrayList<Contigente> integrantes) {
        this.integrantes = new ArrayList<>(integrantes);
    }

    public void agregarIntegrante(Contigente i) {
        integrantes.add(i);
    }

    public void mostrarContingentes() {
        for (Contigente contigente : integrantes) {
            System.out.println("Datos: " + contigente.getNombre() + " " + contigente.getApellido() + " --->"
                    + contigente.getEstado());
        }
    }
}
