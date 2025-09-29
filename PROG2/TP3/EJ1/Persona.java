public class Persona {
    int dni;
    String nombre;

    public Persona(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean equals(Object o) {
        Persona pp = (Persona) o;
        try {
            return pp.getDni() == this.getDni();
        } catch (Exception exc) {
            return false;
        }
    }

}
