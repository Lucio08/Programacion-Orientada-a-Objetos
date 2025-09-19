package TP2.EJ2;

import java.util.ArrayList;

public class Reunion {
    private ArrayList<Usuario> usuarios;
    private String tema;
    private String lugar;
    private double duracion;

    public Reunion(String tema, String lugar, double duracion) {
        this.setTema(tema);
        this.setLugar(lugar);
        this.setDuracion(duracion);
        this.usuarios = new ArrayList<>();
    }

    public void agregarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
}
