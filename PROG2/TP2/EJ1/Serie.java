package TP2.EJ1;

import java.util.ArrayList;

public class Serie {
    private ArrayList<Temporada> temporadas;
    private String titulo;
    private String descrpcion;
    private String creador;
    private String genero;

    public Serie(String titulo, String descripcion, String creador, String genero) {
        setTitulo(titulo);
        setDescrpcion(descripcion);
        setCreador(creador);
        setGenero(genero);
        this.temporadas = new ArrayList<>();
    }

    public boolean vioTodasLaSerie() {
        for (Temporada temporada : temporadas) {
            if (!temporada.vioTodos()) {
                return false;
            }
        }
        return true;
    }

    public double obtenerPromedioDeValoracionSerie() {
        double suma = 0;
        for (Temporada temporada : temporadas) {
            suma += temporada.obtenerPromedioCalificacionesTemporada();
        }
        return suma / temporadas.size(); // largo del arreglo -> cantidad -> contains pregunta si el arreglo tiene algo
                                         // en especial -> en un if -> add es para agregar algo y el remote para
                                         // eliminar
    }

    public void obtenerEpisodiosVistosDeUnaSerie() {
        int cant = 0;
        for (Temporada temporada : temporadas) {
            cant += temporada.totalDeEpisodiosVistos();
        }
    }

    public ArrayList<Temporada> getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(ArrayList<Temporada> temporadas) {
        this.temporadas = temporadas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescrpcion() {
        return descrpcion;
    }

    public void setDescrpcion(String descrpcion) {
        this.descrpcion = descrpcion;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
