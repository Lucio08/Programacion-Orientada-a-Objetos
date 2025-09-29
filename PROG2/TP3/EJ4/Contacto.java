package TP3.EJ4;

import java.time.LocalDate;

public class Contacto {
    String nombre;
    String apellido;
    LocalDate fechaDeNacimiento;
    int numero;
    String direccion;
    String email;
    String ciudad;
    int edad;

    public Contacto(String nombre, String apellido, LocalDate fechaDeNacimiento, int numero, String direccion,
            String email, String ciudad, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.numero = numero;
        this.direccion = direccion;
        this.email = email;
        this.ciudad = ciudad;

    }

    public Contacto(String string, String string2, String string3, String string4, LocalDate of, int i, int j) {
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true; // mismo objeto
        if (!(o instanceof Contacto))
            return false; // no es Contacto
        Contacto cc = (Contacto) o;
        return this.getNumero() == cc.getNumero() &&
                (this.getNombre() != null && this.getNombre().equalsIgnoreCase(cc.getNombre())) &&
                (this.getApellido() != null && this.getApellido().equalsIgnoreCase(cc.getApellido()));
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (nombre != null ? nombre.toLowerCase().hashCode() : 0);
        result = 31 * result + (apellido != null ? apellido.toLowerCase().hashCode() : 0);
        result = 31 * result + numero;
        return result;
    }

    @Override
    public String toString() {
        return apellido + ", " + nombre +
                " | Edad: " + getFechaDeNacimiento() +
                " | Tel: " + numero +
                " | Ciudad: " + ciudad;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
