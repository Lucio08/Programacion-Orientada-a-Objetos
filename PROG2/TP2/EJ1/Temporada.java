package TP2.EJ1;

import java.util.ArrayList;

public class Temporada {
    private String nombre;
    private ArrayList<Episodio> episodios;

    public Temporada(String nombre) {
        setNombre(nombre);
        this.episodios = new ArrayList<>();
    }

    public boolean vioTodos() {
        int cantidadVistos = 0;
        for (Episodio episodio : episodios) {
            if (episodio.isFlag()) {
                cantidadVistos++;
            }
        }
        return cantidadVistos == episodios.size();
    }

    // OBTENER PROMEDIO DE LAS CALIFICCIONES DE UNA TEMPORADA
    public double obtenerPromedioCalificacionesTemporada() {
        double suma = 0;
        int contador = 0;
        for (Episodio episodio : episodios) {
            if (episodio.isFlag()) {
                suma += episodio.getValoracion();
                contador++;
            }
        }
        if (contador == 0) {
            return 0; // o -1, según tu criterio
        } else {
            return suma / contador;
        }
    }

    public int totalDeEpisodiosVistos() {
        int cant = 0;
        for (Episodio e : episodios) {
            if (e.isFlag()) {
                cant++;
            }
        }
        return cant;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Episodio> getEpisodios() {
        return episodios;
    }

    public void setEpisodios(ArrayList<Episodio> episodios) {
        this.episodios = episodios;
    }

}
