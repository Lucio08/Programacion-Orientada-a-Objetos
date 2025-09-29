package TP3.EJ3;

public class Cualidad {
    private int nivel;
    private String tipo;

    public Cualidad(int nivel, String tipo) {
        this.nivel = nivel;
        this.tipo = tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // con esto voy a poder acceder desde los personajes

}
